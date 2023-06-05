package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.common;

import org.apache.commons.lang3.StringUtils;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class DateUtility {

    private static String systemZone = System.getenv("SYSTEM_ZONE_ID");
    private static ZoneId systemZoneId = StringUtils.isNotBlank(systemZone) ? ZoneId.of(systemZone)
            : ZoneId.systemDefault();

    private DateUtility() {

    }

    public static boolean isNonWorkingDay(LocalDateTime tsIsNonWorkingDay, List<String> holidays) {
        return isSaturdaySunday(tsIsNonWorkingDay)
                || isStateHoliday(getStringDateWithZero(tsIsNonWorkingDay), holidays);
    }

    public static boolean isStateHoliday(String vclDueDate, List<String> holidays) {
        return holidays != null && holidays.contains(vclDueDate);
    }

    public static String getStringDateWithZero(LocalDateTime tsTimestamp1) {
        StringBuilder sbDate = new StringBuilder();
        String sDate = null;
        if (tsTimestamp1 != null) {
            int iYear = tsTimestamp1.getYear();
            int iMonth = tsTimestamp1.getMonthValue();
            int iDate = tsTimestamp1.getDayOfMonth();
            StringBuilder sbMonth = new StringBuilder();
            if (iMonth < 10) {
                sbMonth.append("0");
                sbMonth.append(iMonth);
            } else {
                sbMonth.append(iMonth);
            }
            StringBuilder sbDay = new StringBuilder();
            if (iDate < 10) {
                sbDay.append("0");
                sbDay.append(iDate);
            } else {
                sbDay.append(iDate);
            }
            sbDate.append(sbMonth);
            sbDate.append("/");
            sbDate.append(sbDay);
            sbDate.append("/");
            sbDate.append(iYear);
            sDate = sbDate.toString();
        }

        return sDate;
    }

    public static LocalDateTime getHighDateWhenNull(LocalDateTime dateTime) {
        LocalDateTime newDate = dateTime;
        if (dateTime == null) {
            newDate = LocalDateTime.of(2099, 12, 31, 0, 0, 0, 0);
        }
        return newDate;
    }

    private static boolean isSaturdaySunday(LocalDateTime tsIsSaturdaySunday) {
        boolean bIsSaturdaySunday = false;
        int dayOfWeek = tsIsSaturdaySunday.getDayOfWeek().getValue();
        if (dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY) {
            bIsSaturdaySunday = true;
        }
        return bIsSaturdaySunday;
    }

    public static long getDaysBetween(LocalDateTime localDateTime1, LocalDateTime localDateTime2) {
        return ChronoUnit.DAYS.between(localDateTime1, localDateTime2);
    }

    public static LocalDateTime addDays(LocalDateTime tsTimestamp1, int iNoOfDays) {
        return tsTimestamp1.plusDays(iNoOfDays);
    }

    public static LocalDateTime subDays(LocalDateTime tsTimestamp1, int iNoOfDays) {
        return tsTimestamp1.minusDays(iNoOfDays);
    }

    public static LocalDateTime addMonths(LocalDateTime tsTimestamp1, int iNoOfMonths) {
        return tsTimestamp1.plusMonths(iNoOfMonths);
    }

    public static LocalDateTime subMonths(LocalDateTime tsTimestamp, int iNoOfMonths) {
        return tsTimestamp.minusMonths(iNoOfMonths);
    }

    public static boolean dateGtDateInTimestamp(LocalDateTime ts, LocalDateTime ts1) {
        return ts.compareTo(ts1) > 0;
    }

    public static int getMm(LocalDateTime tsTimestamp1) {
        int iMonth = 0;
        if (tsTimestamp1 != null) {
            iMonth = tsTimestamp1.getMonthValue();
        }
        return iMonth;
    }

    public static int getYyyy(LocalDateTime tsTimestamp1) {
        int iYear = 0;
        if (tsTimestamp1 != null) {
            iYear = tsTimestamp1.getYear();
        }
        return iYear;
    }

    public static boolean dateGteqDateInTimestamp(LocalDateTime ts, LocalDateTime ts1) {
        return ts.compareTo(ts1) >= 0;
    }

    public static boolean dateLteqDateInTimestamp(LocalDateTime ts, LocalDateTime ts1) {
        return ts.compareTo(ts1) <= 0;
    }

    public static boolean dateLtDateInTimestamp(LocalDateTime ts, LocalDateTime ts1) {
        return ts.compareTo(ts1) < 0;
    }

    public static LocalDateTime getTimeStampFromString(String yyyymmdd) {
        LocalDateTime dateObj = null;
        if (yyyymmdd != null && !StringUtils.isBlank(yyyymmdd)) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
            dateObj = LocalDateTime.parse(yyyymmdd, formatter);
        }
        return dateObj;
    }

    public static LocalDateTime getFirstDayOfDate(LocalDateTime tsTimestamp1) {
        return tsTimestamp1.withDayOfMonth(1);
    }

    public static boolean dateEqualsDateInTimestamp(LocalDateTime ts, LocalDateTime ts1) {
        return ts.compareTo(ts1) == 0;
    }

    public static String getStringDate(LocalDateTime tsTimestamp1) {
        StringBuilder sbDate = new StringBuilder();
        String sDate = null;
        if (tsTimestamp1 != null) {
            sbDate.append(tsTimestamp1.getMonth());
            sbDate.append("/");
            sbDate.append(tsTimestamp1.getDayOfMonth());
            sbDate.append("/");
            sbDate.append(tsTimestamp1.getYear());
            sDate = sbDate.toString();
        }

        return sDate;
    }

    public static int getMonthsBetween(LocalDateTime tsTimestamp1, LocalDateTime tsTimestamp2) {
        LocalDateTime tsEarlyDate;
        LocalDateTime tsLateDate;
        if (tsTimestamp1.compareTo(tsTimestamp2) >= 0) {
            tsEarlyDate = tsTimestamp1;
            tsLateDate = tsTimestamp2;
        } else {
            tsEarlyDate = tsTimestamp2;
            tsLateDate = tsTimestamp1;
        }
        return (tsEarlyDate.getYear() - tsLateDate.getYear()) * 12 + tsEarlyDate.getMonthValue()
                - tsLateDate.getMonthValue();
    }

    public static String getStringYyyymm(LocalDateTime tsTimestamp1) {
        StringBuilder sbYYYYMM = new StringBuilder();
        String sYYYYMM = null;
        if (tsTimestamp1 != null) {
            int iMonth = tsTimestamp1.getMonthValue();
            StringBuilder sbMonth = new StringBuilder();
            if (iMonth < 10) {
                sbMonth.append("0");
                sbMonth.append(iMonth);
            } else {
                sbMonth.append(iMonth);
            }
            sbYYYYMM.append(tsTimestamp1.getYear());
            sbYYYYMM.append(sbMonth);
            sYYYYMM = sbYYYYMM.toString();
        }

        return sYYYYMM;
    }

    public static LocalDateTime getMaxTimestamp(List<LocalDateTime> alTimestamp) {
        LocalDateTime tsMaxTimestamp = null;
        int iTimestampSize = alTimestamp.size();
        for (int i = 0; i < iTimestampSize; i++) {
            if (iTimestampSize == 1) {
                tsMaxTimestamp = alTimestamp.get(0);
            } else if (i <= iTimestampSize - 2) {
                LocalDateTime tsFirstTimestamp = alTimestamp.get(i);
                LocalDateTime tsNextTimestamp = alTimestamp.get(i + 1);
                if (i == 0) {
                    tsMaxTimestamp = tsFirstTimestamp;
                }
                if (tsNextTimestamp.isAfter(tsMaxTimestamp)) {
                    tsMaxTimestamp = tsNextTimestamp;
                }
            }

        }
        return tsMaxTimestamp;
    }

    public static int getMaxYear(List<Integer> yearList) {
        int maxYear = 0;
        int yearCount = yearList.size();
        for (int i = 0; i < yearCount; i++) {
            if (yearCount == 1) {
                maxYear = yearList.get(0);
            } else if (i <= yearCount - 2) {
                Integer firstYear = yearList.get(i);
                Integer nextYear = yearList.get(i + 1);
                if (i == 0) {
                    maxYear = firstYear;
                }

                if (nextYear > maxYear) {
                    maxYear = nextYear;
                }

            }

        }
        return maxYear;
    }

    public static LocalDateTime getLastDayOfMonth(LocalDateTime tsTimestamp1) {
        return tsTimestamp1.withDayOfMonth(tsTimestamp1.toLocalDate().lengthOfMonth());
    }

    public static LocalDateTime payloadMaxMonth(LocalDateTime tsTimestamp1) {
        LocalDateTime lastOfNextMonth;
        if (tsTimestamp1.getDayOfMonth() < 15) {
            lastOfNextMonth = DateUtility.addMonths(tsTimestamp1.withDayOfMonth(1), 1);
        } else {
            lastOfNextMonth = DateUtility.addMonths(DateUtility.addMonths(tsTimestamp1.withDayOfMonth(1), 2), -1);
        }
        return DateUtility.getLastDayOfMonth(lastOfNextMonth);
    }

    public static LocalDateTime getLastDayOfPreviousMonth(LocalDateTime tsTimestamp1) {
        return DateUtility.addDays(tsTimestamp1.withDayOfMonth(1), -1);
    }

    public static LocalDateTime getLastDayOfYear(int year) {
        return LocalDateTime.of(year, 12, 31, 0, 0, 0);
    }

    public static LocalDateTime getFirstDayOfDecember(int year) {
        return LocalDateTime.of(year, 12, 01, 0, 0, 0);
    }

    public static LocalDateTime getFirstDayOfYear(int year) {
        return LocalDateTime.of(year, 01, 01, 0, 0, 0);
    }

    public static LocalDateTime get60DaysBackDate(LocalDateTime reviewDueDate) {
        LocalDateTime firstDay = LocalDateTime.of(reviewDueDate.getYear(), reviewDueDate.getMonthValue(), 1, 0, 0, 0);
        firstDay = DateUtility.addMonths(firstDay, -1);
        return firstDay;
    }

    public static boolean datesInSameMonth(LocalDateTime localDateTime1, LocalDateTime localDateTime2) {
        return getYyyy(localDateTime1) == getYyyy(localDateTime2) && getMm(localDateTime1) == getMm(localDateTime2);
    }

    public static int getAgeInMonths(LocalDateTime refDate, LocalDateTime dob) {
        if (dob.getDayOfMonth() > refDate.getDayOfMonth()) {
            refDate = DateUtility.addMonths(refDate, -1);
        }

        return getMonthsBetween(refDate, dob);
    }

    public static LocalDateTime getFirstDateOfNextMonth(LocalDateTime refDate) {
        return getFirstDayOfDate(addMonths(refDate, 1));
    }

    public static Integer getMonthFromDate(LocalDateTime date) {
        return date.getMonthValue();
    }

    public static Integer getYearFromDate(LocalDateTime date) {
        return date.getYear();
    }

    public static LocalDateTime convertDateToLocalDateTimeUsingInstant(Date dateToConvert) {
        return dateToConvert.toInstant().atZone(systemZoneId).toLocalDateTime();
    }

    public static LocalDateTime convertDateToLocalDateTimeUsingTimestamp(Date dateToConvert) {
        return new Timestamp(dateToConvert.getTime()).toLocalDateTime();
    }

    public static LocalDateTime getDateBasedon15thRule(LocalDateTime currentDate) {
        if (currentDate.getDayOfMonth() <= 15) {
            return getFirstDateOfNextMonth(currentDate);
        }
        return getFirstDayOfDate(addMonths(currentDate, 2));
    }

    public static LocalDateTime getEndDateBasedon15thRule(LocalDateTime currentDate) {
        if (currentDate.getDayOfMonth() <= 15) {
            return getLastDayOfMonth(currentDate);
        }
        return getLastDayOfMonth(addMonths(currentDate, 1));
    }

    public static LocalDateTime getLocalDateTimeFromStringUsingDateTimeFormatter(String dateStringValue,
                                                                                 DateTimeFormatter formatter) {
        return LocalDateTime.parse(dateStringValue, formatter);
    }

    public static LocalDateTime getLocalDateTimeFromStringUsingSimpleDateFormat(String dateStringValue,
                                                                                SimpleDateFormat formatter) throws ParseException {
        return convertDateToLocalDateTimeUsingTimestamp(formatter.parse(dateStringValue));
    }

    public static LocalDateTime getLocalDateTimeFromString(String dateStringValue) {
        return dateStringValue != null ? LocalDateTime.parse(dateStringValue) : null;
    }

    public static LocalDateTime removeTimeStampFromDateTime(LocalDateTime localDateTime) {
        return localDateTime != null ? localDateTime.truncatedTo(ChronoUnit.DAYS) : null;
    }

    public static Date convertLocalDateTimeToDateUsingInstant(LocalDateTime localDateTimeToConvert) {
        return Date.from(localDateTimeToConvert.atZone(systemZoneId).toInstant());
    }

    public static LocalDateTime convertGregorianCalToLocalDateTime(XMLGregorianCalendar xcal) {
        return xcal.toGregorianCalendar().toZonedDateTime().withZoneSameLocal(systemZoneId).toLocalDateTime();
    }

    public static XMLGregorianCalendar convertLocalDateTimetoXMLGregorianCalendar(LocalDateTime dateToConvert)
            throws DatatypeConfigurationException {
        return DatatypeFactory.newInstance()
                .newXMLGregorianCalendar(GregorianCalendar.from(ZonedDateTime.of(dateToConvert, systemZoneId)));
    }

}
