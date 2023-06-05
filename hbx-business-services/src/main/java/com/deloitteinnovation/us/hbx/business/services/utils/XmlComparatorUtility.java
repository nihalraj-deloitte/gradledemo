package com.deloitteinnovation.us.hbx.business.services.utils;

import com.deloitteinnovation.us.hbx.framework.logging.HBELogger;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class XmlComparatorUtility {

    static TreeMap<String, XmlXPathUtility> elementAndItsValueFileA;
    static TreeMap<String, XmlXPathUtility> elementAndItsValueFileB;
    static String responseSuffix = "_Response.xml";
    private static final HBELogger LOGGER = new HBELogger(XmlComparatorUtility.class);
    static XmlResultsComparison comparisonResults;
    private static String expectedResponseDir = "src/main/resources/XML/ExpectedResponses/";
    private static List<String> compareNodes = Arrays.asList("medicalCoverageGroupCd", "eligBeginDate", "eligEndDate",
            "eligStatusCd", "fplAmtLimit", "fplPercentage", "aptcEligStatusCd", "out_date_eligibilityperiod_endDate",
            "out_date_eligibilityperiod_startDate", "out_text_individual_exchangeEligibilityCode");

    private XmlComparatorUtility() {

    }

    public static void setExpectedResponseDir(String expectedResponsePath) {
        expectedResponseDir = expectedResponsePath;
    }

    public static void setCompareNodes(List<String> compareCustomNodes) {
        compareNodes = compareCustomNodes;
    }

    public static void compareXMLs(String innerFolder) throws ParserConfigurationException, SAXException, IOException {
        ArrayList<String> fileComparisonsResults = new ArrayList<>();
        // Getting all Response XMLS
        File[] sourcefiles = ExecuteXMLRequestsUtility.getXMLResponsesFiles(innerFolder);
        File[] baseFiles = getXMLBaseResponsesFiles();
        int filecounter = 0;
        if (sourcefiles != null) {
            // Parsing each file
            for (File fileIn : sourcefiles) {
                filecounter = addResultForEachRecord(fileComparisonsResults, baseFiles, filecounter, fileIn);
            }

            try (XSSFWorkbook resultWorkbook = new XSSFWorkbook()) {
                resultWorkbook.createSheet("Results");
                XSSFSheet sheet = resultWorkbook.getSheetAt(0); // creating a Sheet object to retrieve object

                int startrowInFile = 0;
                for (String result : fileComparisonsResults) {
                    XSSFRow row = sheet.createRow(startrowInFile);
                    XSSFCell cell = row.createCell(0);
                    cell.setCellValue(result);
                    startrowInFile++;
                }

                try (FileOutputStream outputStream = new FileOutputStream("src/main/resources/Results.xlsx")) {
                    resultWorkbook.write(outputStream);
                }
            }
        }

    }

    private static int addResultForEachRecord(ArrayList<String> fileComparisonsResults, File[] baseFiles,
                                              int filecounter, File fileIn) throws ParserConfigurationException, SAXException, IOException {
        File basefile;
        File sourcefile;
        filecounter++;
        sourcefile = fileIn;
        basefile = findBaseFile(baseFiles, sourcefile.getName());

        if (basefile != null) {

            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder;
            documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document basedocument = null, sourcedocument = null;

            basedocument = documentBuilder.parse(basefile);
            sourcedocument = documentBuilder.parse(sourcefile);

            comparisonResults = matchXMLS(basedocument, sourcedocument);
            String result = comparisonResultsConsistency(filecounter, fileIn);

            // Append missing Xpaths
            for (String missingXPath : comparisonResults.getMissingPaths()) {
                result += missingXPath + " | ";
            }
            result += " , ";

            // Append missing/mismatching values.
            for (Map.Entry<String, ArrayList<String>> element : comparisonResults.getMissingOrMismatchingValues()
                    .entrySet()) {
                for (String value : element.getValue()) {
                    result += element.getKey() + " : " + value + " | ";
                }

            }

            fileComparisonsResults.add(result);
        }
        return filecounter;
    }

    private static String comparisonResultsConsistency(int filecounter, File fileIn) {
        String result = String.valueOf(filecounter);
        result += fileIn.getName();
        if (comparisonResults.isConsistency()) {
            result += "| , Match_Yes ,";
        } else {
            result += "| , Match_No ,";
        }
        return result;
    }

    private static File findBaseFile(File[] baseFiles, String name) {
        for (File file : baseFiles) {

            if ((name.toLowerCase().contains("_request_response")
                    && file.getName().contains(name.substring(0, name.toLowerCase().indexOf("_request_response.xml"))))
                    || (name.indexOf(responseSuffix) > -1
                    && file.getName().contains(name.substring(0, name.indexOf(responseSuffix))))
                    || StringUtils.equals(name, file.getName())) {
                isDebugEnabled(name);
                return file;
            }
            if (name.indexOf(responseSuffix) > -1 && LOGGER.isDebugEnabled()) {
                LOGGER.debug(String.format("%n did not found file name : %s",
                        name.substring(0, name.indexOf(responseSuffix))));
            }
        }
        return null;
    }

    private static void isDebugEnabled(String name) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug(String.format("file name : %s", name));
        }
    }

    private static File[] getXMLBaseResponsesFiles() {
        File dir = new File(expectedResponseDir);
        File[] files = null;
        if (dir.exists() && dir.isDirectory()) {
            files = dir.listFiles(x -> x.getName().toUpperCase().endsWith(".XML"));
        }
        return files;
    }

    private static XmlResultsComparison matchXMLS(Document basedocument, Document sourcedocument) {
        Node root = basedocument.getDocumentElement();
        Node root2 = sourcedocument.getDocumentElement();

        comparisonResults = new XmlResultsComparison();
        elementAndItsValueFileA = new TreeMap<>();
        elementAndItsValueFileB = new TreeMap<>();

        findAllChildsAndThierValues(root, root.getNodeName(), elementAndItsValueFileA);
        findAllChildsAndThierValues(root2, root2.getNodeName(), elementAndItsValueFileB);

        boolean areTwoXMLsSame = compareTwoXMLs(elementAndItsValueFileA, elementAndItsValueFileB);
        comparisonResults.setConsistency(areTwoXMLsSame);
        if (LOGGER.isDebugEnabled()) {
            if (areTwoXMLsSame) {
                LOGGER.debug("Two XMLS are same");
            } else {

                LOGGER.debug(String.format("Missing X Paths  %s", comparisonResults.getMissingPaths().toString()));

                for (Map.Entry<String, ArrayList<String>> values : comparisonResults.getMissingOrMismatchingValues()
                        .entrySet()) {
                    LOGGER.debug(String.format("For X Path : %s Values not found : %s", values.getKey(),
                            values.getValue().toString()));
                }
            }
        }
        return comparisonResults;
    }

    private static boolean compareTwoXMLs(TreeMap<String, XmlXPathUtility> baseFileKeys,
                                          TreeMap<String, XmlXPathUtility> responseToCheckeys) {

        for (Map.Entry<String, XmlXPathUtility> element : baseFileKeys.entrySet()) {

            if (compareNodes != null && compareNodes.stream().anyMatch(x -> !element.getKey().contains(x))) {
                continue;
            }

            if (responseToCheckeys.containsKey(element.getKey())) {
                ArrayList<String> baseValues = element.getValue().getValue();
                XmlXPathUtility responseToCheckElement = responseToCheckeys.get(element.getKey());
                ArrayList<String> responseToCheckElementValues = responseToCheckElement.getValue();

                ArrayList<String> missingValues = checkIfAnyMissingorMismatchOccurInValues(baseValues,
                        responseToCheckElementValues);
                if (!missingValues.isEmpty()) {
                    comparisonResults.getMissingOrMismatchingValues().put(element.getKey(), missingValues);
                }
            } else {
                // adding missing paths
                comparisonResults.getMissingPaths().add(element.getKey() + ": " + element.getValue().getValue().get(0));

            }

        }

        return comparisonResults.getMissingOrMismatchingValues().isEmpty()
                && comparisonResults.getMissingPaths().isEmpty();

    }

    private static ArrayList<String> checkIfAnyMissingorMismatchOccurInValues(ArrayList<String> baseValues,
                                                                              ArrayList<String> responseToCheckElementValues) {

        return makeListOFValuesMissingOrMisMatching(baseValues, responseToCheckElementValues);

    }

    private static ArrayList<String> makeListOFValuesMissingOrMisMatching(ArrayList<String> baseValues,
                                                                          ArrayList<String> responseToCheckElementValues) {
        ArrayList<String> missingValues = new ArrayList<>();
        for (String value : baseValues) {
            if (responseToCheckElementValues.contains(value)) {
                responseToCheckElementValues.remove(value);
            } else {
                missingValues.add(value);

            }
        }
        return missingValues;

    }

    private static void findAllChildsAndThierValues(Node root, String nodeName,
                                                    TreeMap<String, XmlXPathUtility> elementAndItsValueFileA2) {
// insert attribute and value logic
        NodeList childElements = root.getChildNodes();

        int startChildIndex = 0;
        int startAttributeIndex = 0;

        while (startAttributeIndex < root.getAttributes().getLength()) {
            nodeName += root.getAttributes().item(startAttributeIndex);
            startAttributeIndex++;
        }

        while (startChildIndex < childElements.getLength()) {
            if (childElements.item(startChildIndex).getNodeType() == Node.ELEMENT_NODE) {

                findAllChildsAndThierValues(childElements.item(startChildIndex),
                        nodeName + childElements.item(startChildIndex).getNodeName(), elementAndItsValueFileA2);
            }
            startChildIndex++;
        }

        XmlXPathUtility element;

        if (root.getChildNodes().getLength() == 1) {
            if (elementAndItsValueFileA2.containsKey(nodeName)) {
                element = elementAndItsValueFileA2.get(nodeName);
                element.getValue().add(root.getTextContent());
                element.setCount(element.getCount() + 1);
                elementAndItsValueFileA2.put(nodeName, element);

            } else {
                element = new XmlXPathUtility();
                element.setCount(1);
                element.getValue().add(root.getTextContent());
                elementAndItsValueFileA2.put(nodeName, element);
            }
        }

    }
}