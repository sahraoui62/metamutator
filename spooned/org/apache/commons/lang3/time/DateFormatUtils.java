package org.apache.commons.lang3.time;


public class DateFormatUtils {
    private static final java.util.TimeZone UTC_TIME_ZONE = java.util.TimeZone.getTimeZone("GMT");

    public static final org.apache.commons.lang3.time.FastDateFormat ISO_8601_EXTENDED_DATETIME_FORMAT = org.apache.commons.lang3.time.FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ss");

    @java.lang.Deprecated
    public static final org.apache.commons.lang3.time.FastDateFormat ISO_DATETIME_FORMAT = ISO_8601_EXTENDED_DATETIME_FORMAT;

    public static final org.apache.commons.lang3.time.FastDateFormat ISO_8601_EXTENDED_DATETIME_TIME_ZONE_FORMAT = org.apache.commons.lang3.time.FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ssZZ");

    @java.lang.Deprecated
    public static final org.apache.commons.lang3.time.FastDateFormat ISO_DATETIME_TIME_ZONE_FORMAT = ISO_8601_EXTENDED_DATETIME_TIME_ZONE_FORMAT;

    public static final org.apache.commons.lang3.time.FastDateFormat ISO_8601_EXTENDED_DATE_FORMAT = org.apache.commons.lang3.time.FastDateFormat.getInstance("yyyy-MM-dd");

    @java.lang.Deprecated
    public static final org.apache.commons.lang3.time.FastDateFormat ISO_DATE_FORMAT = ISO_8601_EXTENDED_DATE_FORMAT;

    @java.lang.Deprecated
    public static final org.apache.commons.lang3.time.FastDateFormat ISO_DATE_TIME_ZONE_FORMAT = org.apache.commons.lang3.time.FastDateFormat.getInstance("yyyy-MM-ddZZ");

    @java.lang.Deprecated
    public static final org.apache.commons.lang3.time.FastDateFormat ISO_TIME_FORMAT = org.apache.commons.lang3.time.FastDateFormat.getInstance("'T'HH:mm:ss");

    @java.lang.Deprecated
    public static final org.apache.commons.lang3.time.FastDateFormat ISO_TIME_TIME_ZONE_FORMAT = org.apache.commons.lang3.time.FastDateFormat.getInstance("'T'HH:mm:ssZZ");

    public static final org.apache.commons.lang3.time.FastDateFormat ISO_8601_EXTENDED_TIME_FORMAT = org.apache.commons.lang3.time.FastDateFormat.getInstance("HH:mm:ss");

    @java.lang.Deprecated
    public static final org.apache.commons.lang3.time.FastDateFormat ISO_TIME_NO_T_FORMAT = ISO_8601_EXTENDED_TIME_FORMAT;

    public static final org.apache.commons.lang3.time.FastDateFormat ISO_8601_EXTENDED_TIME_TIME_ZONE_FORMAT = org.apache.commons.lang3.time.FastDateFormat.getInstance("HH:mm:ssZZ");

    @java.lang.Deprecated
    public static final org.apache.commons.lang3.time.FastDateFormat ISO_TIME_NO_T_TIME_ZONE_FORMAT = ISO_8601_EXTENDED_TIME_TIME_ZONE_FORMAT;

    public static final org.apache.commons.lang3.time.FastDateFormat SMTP_DATETIME_FORMAT = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEE, dd MMM yyyy HH:mm:ss Z", java.util.Locale.US);

    public DateFormatUtils() {
        super();
    }

    public static java.lang.String formatUTC(final long millis, final java.lang.String pattern) {
        return org.apache.commons.lang3.time.DateFormatUtils.format(new java.util.Date(millis), pattern, UTC_TIME_ZONE, null);
    }

    public static java.lang.String formatUTC(final java.util.Date date, final java.lang.String pattern) {
        return org.apache.commons.lang3.time.DateFormatUtils.format(date, pattern, UTC_TIME_ZONE, null);
    }

    public static java.lang.String formatUTC(final long millis, final java.lang.String pattern, final java.util.Locale locale) {
        return org.apache.commons.lang3.time.DateFormatUtils.format(new java.util.Date(millis), pattern, UTC_TIME_ZONE, locale);
    }

    public static java.lang.String formatUTC(final java.util.Date date, final java.lang.String pattern, final java.util.Locale locale) {
        return org.apache.commons.lang3.time.DateFormatUtils.format(date, pattern, UTC_TIME_ZONE, locale);
    }

    public static java.lang.String format(final long millis, final java.lang.String pattern) {
        return org.apache.commons.lang3.time.DateFormatUtils.format(new java.util.Date(millis), pattern, null, null);
    }

    public static java.lang.String format(final java.util.Date date, final java.lang.String pattern) {
        return org.apache.commons.lang3.time.DateFormatUtils.format(date, pattern, null, null);
    }

    public static java.lang.String format(final java.util.Calendar calendar, final java.lang.String pattern) {
        return org.apache.commons.lang3.time.DateFormatUtils.format(calendar, pattern, null, null);
    }

    public static java.lang.String format(final long millis, final java.lang.String pattern, final java.util.TimeZone timeZone) {
        return org.apache.commons.lang3.time.DateFormatUtils.format(new java.util.Date(millis), pattern, timeZone, null);
    }

    public static java.lang.String format(final java.util.Date date, final java.lang.String pattern, final java.util.TimeZone timeZone) {
        return org.apache.commons.lang3.time.DateFormatUtils.format(date, pattern, timeZone, null);
    }

    public static java.lang.String format(final java.util.Calendar calendar, final java.lang.String pattern, final java.util.TimeZone timeZone) {
        return org.apache.commons.lang3.time.DateFormatUtils.format(calendar, pattern, timeZone, null);
    }

    public static java.lang.String format(final long millis, final java.lang.String pattern, final java.util.Locale locale) {
        return org.apache.commons.lang3.time.DateFormatUtils.format(new java.util.Date(millis), pattern, null, locale);
    }

    public static java.lang.String format(final java.util.Date date, final java.lang.String pattern, final java.util.Locale locale) {
        return org.apache.commons.lang3.time.DateFormatUtils.format(date, pattern, null, locale);
    }

    public static java.lang.String format(final java.util.Calendar calendar, final java.lang.String pattern, final java.util.Locale locale) {
        return org.apache.commons.lang3.time.DateFormatUtils.format(calendar, pattern, null, locale);
    }

    public static java.lang.String format(final long millis, final java.lang.String pattern, final java.util.TimeZone timeZone, final java.util.Locale locale) {
        return org.apache.commons.lang3.time.DateFormatUtils.format(new java.util.Date(millis), pattern, timeZone, locale);
    }

    public static java.lang.String format(final java.util.Date date, final java.lang.String pattern, final java.util.TimeZone timeZone, final java.util.Locale locale) {
        final org.apache.commons.lang3.time.FastDateFormat df = org.apache.commons.lang3.time.FastDateFormat.getInstance(pattern, timeZone, locale);
        return df.format(date);
    }

    public static java.lang.String format(final java.util.Calendar calendar, final java.lang.String pattern, final java.util.TimeZone timeZone, final java.util.Locale locale) {
        final org.apache.commons.lang3.time.FastDateFormat df = org.apache.commons.lang3.time.FastDateFormat.getInstance(pattern, timeZone, locale);
        return df.format(calendar);
    }
}

