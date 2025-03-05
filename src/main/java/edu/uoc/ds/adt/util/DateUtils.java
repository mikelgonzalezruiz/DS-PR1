package edu.uoc.ds.adt.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ISO_DATE_TIME;

    public static LocalDateTime getLocalDateTime(String dateString) {
        return LocalDateTime.parse(dateString, FORMATTER);
    }
}
