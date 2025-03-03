package com.github.pkyit.core.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateTimeUtils {
    // 定义日期时间格式
    private static final DateTimeFormatter DATETIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    /**
     * 返回当前日期时间的字符串，格式为 yyyy-MM-dd HH:mm:ss
     *
     * @return 格式化的日期时间字符串
     */
    public static String getCurrentDateTimeString() {
        return LocalDateTime.now().format(DATETIME_FORMATTER);
    }

    /**
     * 返回当前日期的字符串，格式为 yyyy-MM-dd
     *
     * @return 格式化的日期字符串
     */
    public static String getCurrentDateString() {
        return LocalDate.now().format(DATE_FORMATTER);
    }

    /**
     * 将 LocalDateTime 格式化为指定格式的字符串
     *
     * @param dateTime 要格式化的 LocalDateTime 对象
     * @param pattern  格式模式
     * @return 格式化的日期时间字符串
     * @throws DateTimeParseException 如果格式模式无效或日期时间对象为空
     */
    public static String formatDateTime(LocalDateTime dateTime, String pattern) {
        if (dateTime == null || pattern == null) {
            throw new IllegalArgumentException("dateTime and pattern must not be null");
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return dateTime.format(formatter);
    }

    /**
     * 将 LocalDate 格式化为指定格式的字符串
     *
     * @param date    要格式化的 LocalDate 对象
     * @param pattern 格式模式
     * @return 格式化的日期字符串
     * @throws DateTimeParseException 如果格式模式无效或日期对象为空
     */
    public static String formatDate(LocalDate date, String pattern) {
        if (date == null || pattern == null) {
            throw new IllegalArgumentException("date and pattern must not be null");
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }

    /**
     * 将字符串解析为 LocalDateTime 对象
     *
     * @param dateTimeString 日期时间字符串
     * @param pattern        格式模式
     * @return 解析后的 LocalDateTime 对象
     * @throws DateTimeParseException 如果字符串格式不正确
     */
    public static LocalDateTime parseDateTime(String dateTimeString, String pattern) {
        if (dateTimeString == null || pattern == null) {
            throw new IllegalArgumentException("dateTimeString and pattern must not be null");
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDateTime.parse(dateTimeString, formatter);
    }

    /**
     * 将字符串解析为 LocalDate 对象
     *
     * @param dateString 日期字符串
     * @param pattern    格式模式
     * @return 解析后的 LocalDate 对象
     * @throws DateTimeParseException 如果字符串格式不正确
     */
    public static LocalDate parseDate(String dateString, String pattern) {
        if (dateString == null || pattern == null) {
            throw new IllegalArgumentException("dateString and pattern must not be null");
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDate.parse(dateString, formatter);
    }
}