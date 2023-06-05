package com.deloitteinnovation.us.hbx.business.services.utils;

import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.service.Error;
import com.deloitteinnovation.us.hbx.framework.logging.HBELogger;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ExecuteXMLRequestsUtility {

    private ExecuteXMLRequestsUtility() {
        throw new IllegalStateException("Utility class");
    }

    private static String requestXMLDir = "src/main/resources/XML/Requests/";
    private static String responseXMLDir = "src/main/resources/XML/Responses/";

    private static final HBELogger LOGGER = new HBELogger(ExecuteXMLRequestsUtility.class);

    public static String getRequestXMLDir() {
        return requestXMLDir;
    }

    public static String getResponseXMLDir() {
        return responseXMLDir;
    }

    public static void setXMLPaths(String requestXMLPath, String responseXMLPath) {
        requestXMLDir = requestXMLPath;
        responseXMLDir = responseXMLPath;
    }

    public static File[] getXMLRequestsFiles() {
        File dir = new File(ExecuteXMLRequestsUtility.getRequestXMLDir());
        File[] files = null;
        if (dir.exists() && dir.isDirectory()) {
            files = dir.listFiles(x -> x.getName().toUpperCase().endsWith(".XML"));
        }
        return files;
    }

    public static File[] getSpecificXMLRequestFiles(List<String> fileNames) {
        File dir = new File(ExecuteXMLRequestsUtility.getRequestXMLDir());
        File[] files = null;
        if (dir.exists() && dir.isDirectory()) {
            files = dir.listFiles(x -> (x.getName().toUpperCase().endsWith(".XML")
                    && fileNames.toString().toUpperCase().contains(x.getName().toUpperCase())));
        }
        return files;
    }

    public static File[] getXMLRequestFilesWhileSkippingSpecificFiles(List<String> fileNames) {
        File dir = new File(ExecuteXMLRequestsUtility.getRequestXMLDir());
        File[] files = null;
        if (dir.exists() && dir.isDirectory()) {
            files = dir.listFiles(x -> (x.getName().toUpperCase().endsWith(".XML")
                    && !fileNames.toString().toUpperCase().contains(x.getName().toUpperCase())));
        }
        return files;
    }

    public static File[] getXMLResponsesFiles(String innerFolder) {

        File dir = new File(ExecuteXMLRequestsUtility.getResponseXMLDir());

        if (StringUtils.isNotEmpty(innerFolder)) {
            dir = new File(ExecuteXMLRequestsUtility.getResponseXMLDir() + innerFolder + "/");
        }

        File[] files = null;
        if (dir.exists() && dir.isDirectory()) {
            files = dir.listFiles(x -> x.getName().toUpperCase().endsWith(".XML"));
        }
        return files;
    }

    @SuppressWarnings("unchecked")
    public static <T> T getPayloadRequestFromXML(File fileIn, T requestObject) {
        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(requestObject.getClass());
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            return (T) jaxbUnmarshaller.unmarshal(fileIn);
        } catch (JAXBException e) {
            LOGGER.error(String.format("Exception occured while parsing %s", fileIn.getName()));
            LOGGER.error("Exception Details: ");
            LOGGER.error(e.getMessage());
        } finally {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug(String.format("Input File: %s parsed successfully.", fileIn.getName()));
            }
        }
        return null;
    }

    public static String getResponseFileName(File fileIn) {
        String fileOutName = FilenameUtils.removeExtension(fileIn.getName()) + "_Response.xml";
        File outputFile = new File(responseXMLDir + fileOutName);

        boolean isDeleted = false;
        try {
            Path path = outputFile.toPath();
            Files.delete(path);
            isDeleted = true;
        } catch (IOException ex) {
            isDeleted = false;
        }

        if (isDeleted && LOGGER.isDebugEnabled()) {
            LOGGER.debug(String.format("Deleted Existing %s", fileOutName));
        }

        return fileOutName;
    }

    public static void deleteAllResponseFiles() throws IOException {
        FileUtils.cleanDirectory(new File(ExecuteXMLRequestsUtility.getResponseXMLDir()));
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug(String.format("Deleted All Existing Response files from directory- %s",
                    ExecuteXMLRequestsUtility.getResponseXMLDir()));
        }

    }

    public static void deleteResponseFileIfExists(String fileOutName) {
        File outputFile = new File(responseXMLDir + fileOutName);
        boolean isDeleted = false;
        try {
            Path path = outputFile.toPath();
            Files.delete(path);
            isDeleted = true;
        } catch (IOException ex) {
            isDeleted = false;
        }

        if (isDeleted && LOGGER.isDebugEnabled()) {
            LOGGER.debug(String.format("Deleted Existing %s", fileOutName));
        }
    }

    public static void printExceptionWhileGettingResponse(File fileIn, List<Error> errorList) throws IOException {
        LOGGER.error(String.format("Got exception in response in file %s", fileIn.getName()));
        for (Error err : errorList) {
            LOGGER.error(
                    String.format("Got exception- %s with description as- %s", err.getErrorCd(), err.getErrorDesc()));
        }

        throw new IOException("Got exception in response in file" + fileIn.getName());
    }

    public static void printExceptionWhileGettingResponse(File fileIn) throws IOException {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug(String.format("Got exception in response in file %s", fileIn.getName()));
        }
        throw new IOException("Got exception in response in file" + fileIn.getName());
    }

    public static <T> void createResponseXML(String fileOutName, T response) {
        try (FileOutputStream fileOut = new FileOutputStream(responseXMLDir + fileOutName, true)) {
            JAXBContext jc = JAXBContext.newInstance(response.getClass());
            Marshaller marshaller = jc.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(response, fileOut);
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug(String.format("Output File: %s written successfully", fileOutName));
            }
        } catch (Exception e) {
            LOGGER.error(String.format("Exception occured while writing %s", fileOutName));
            LOGGER.error("Exception Details: ");
            LOGGER.error(e.getMessage());
        }
    }

    public static void printListOfXMLParsed(List<String> namesOfFilesProcessed) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug(String.format("Total files processed: %d", namesOfFilesProcessed.size()));
            LOGGER.debug("List of files processed: ");
        }
        for (String fileName : namesOfFilesProcessed) {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug(fileName);
            }
        }
    }
}
