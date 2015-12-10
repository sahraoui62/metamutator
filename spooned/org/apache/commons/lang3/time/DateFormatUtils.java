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
        return ((_returnReplacementOperator1597.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.DateFormatUtils.format(new java.util.Date(millis), pattern, org.apache.commons.lang3.time.DateFormatUtils.UTC_TIME_ZONE, null)));
    }

    public static java.lang.String formatUTC(final java.util.Date date, final java.lang.String pattern) {
        return ((_returnReplacementOperator1595.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.DateFormatUtils.format(date, pattern, org.apache.commons.lang3.time.DateFormatUtils.UTC_TIME_ZONE, null)));
    }

    public static java.lang.String formatUTC(final long millis, final java.lang.String pattern, final java.util.Locale locale) {
        return ((_returnReplacementOperator1598.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.DateFormatUtils.format(new java.util.Date(millis), pattern, org.apache.commons.lang3.time.DateFormatUtils.UTC_TIME_ZONE, locale)));
    }

    public static java.lang.String formatUTC(final java.util.Date date, final java.lang.String pattern, final java.util.Locale locale) {
        return ((_returnReplacementOperator1596.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.DateFormatUtils.format(date, pattern, org.apache.commons.lang3.time.DateFormatUtils.UTC_TIME_ZONE, locale)));
    }

    public static java.lang.String format(final long millis, final java.lang.String pattern) {
        return ((_returnReplacementOperator1591.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.DateFormatUtils.format(new java.util.Date(millis), pattern, null, null)));
    }

    public static java.lang.String format(final java.util.Date date, final java.lang.String pattern) {
        return ((_returnReplacementOperator1587.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.DateFormatUtils.format(date, pattern, null, null)));
    }

    public static java.lang.String format(final java.util.Calendar calendar, final java.lang.String pattern) {
        return ((_returnReplacementOperator1583.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.DateFormatUtils.format(calendar, pattern, null, null)));
    }

    public static java.lang.String format(final long millis, final java.lang.String pattern, final java.util.TimeZone timeZone) {
        return ((_returnReplacementOperator1593.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.DateFormatUtils.format(new java.util.Date(millis), pattern, timeZone, null)));
    }

    public static java.lang.String format(final java.util.Date date, final java.lang.String pattern, final java.util.TimeZone timeZone) {
        return ((_returnReplacementOperator1589.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.DateFormatUtils.format(date, pattern, timeZone, null)));
    }

    public static java.lang.String format(final java.util.Calendar calendar, final java.lang.String pattern, final java.util.TimeZone timeZone) {
        return ((_returnReplacementOperator1585.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.DateFormatUtils.format(calendar, pattern, timeZone, null)));
    }

    public static java.lang.String format(final long millis, final java.lang.String pattern, final java.util.Locale locale) {
        return ((_returnReplacementOperator1592.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.DateFormatUtils.format(new java.util.Date(millis), pattern, null, locale)));
    }

    public static java.lang.String format(final java.util.Date date, final java.lang.String pattern, final java.util.Locale locale) {
        return ((_returnReplacementOperator1588.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.DateFormatUtils.format(date, pattern, null, locale)));
    }

    public static java.lang.String format(final java.util.Calendar calendar, final java.lang.String pattern, final java.util.Locale locale) {
        return ((_returnReplacementOperator1584.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.DateFormatUtils.format(calendar, pattern, null, locale)));
    }

    public static java.lang.String format(final long millis, final java.lang.String pattern, final java.util.TimeZone timeZone, final java.util.Locale locale) {
        return ((_returnReplacementOperator1594.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.DateFormatUtils.format(new java.util.Date(millis), pattern, timeZone, locale)));
    }

    public static java.lang.String format(final java.util.Date date, final java.lang.String pattern, final java.util.TimeZone timeZone, final java.util.Locale locale) {
        final org.apache.commons.lang3.time.FastDateFormat df = org.apache.commons.lang3.time.FastDateFormat.getInstance(pattern, timeZone, locale);
        return ((_returnReplacementOperator1590.is("NULL")) ? ( null ) : (df.format(date)));
    }

    public static java.lang.String format(final java.util.Calendar calendar, final java.lang.String pattern, final java.util.TimeZone timeZone, final java.util.Locale locale) {
        final org.apache.commons.lang3.time.FastDateFormat df = org.apache.commons.lang3.time.FastDateFormat.getInstance(pattern, timeZone, locale);
        return ((_returnReplacementOperator1586.is("NULL")) ? ( null ) : (df.format(calendar)));
    }

    private static final metamutator.Selector _returnReplacementOperator1583 = metamutator.Selector.of(1583,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.DateFormatUtils.class).id("_returnReplacementOperator1583");

    private static final metamutator.Selector _returnReplacementOperator1584 = metamutator.Selector.of(1584,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.DateFormatUtils.class).id("_returnReplacementOperator1584");

    private static final metamutator.Selector _returnReplacementOperator1585 = metamutator.Selector.of(1585,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.DateFormatUtils.class).id("_returnReplacementOperator1585");

    private static final metamutator.Selector _returnReplacementOperator1586 = metamutator.Selector.of(1586,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.DateFormatUtils.class).id("_returnReplacementOperator1586");

    private static final metamutator.Selector _returnReplacementOperator1587 = metamutator.Selector.of(1587,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.DateFormatUtils.class).id("_returnReplacementOperator1587");

    private static final metamutator.Selector _returnReplacementOperator1588 = metamutator.Selector.of(1588,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.DateFormatUtils.class).id("_returnReplacementOperator1588");

    private static final metamutator.Selector _returnReplacementOperator1589 = metamutator.Selector.of(1589,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.DateFormatUtils.class).id("_returnReplacementOperator1589");

    private static final metamutator.Selector _returnReplacementOperator1590 = metamutator.Selector.of(1590,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.DateFormatUtils.class).id("_returnReplacementOperator1590");

    private static final metamutator.Selector _returnReplacementOperator1591 = metamutator.Selector.of(1591,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.DateFormatUtils.class).id("_returnReplacementOperator1591");

    private static final metamutator.Selector _returnReplacementOperator1592 = metamutator.Selector.of(1592,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.DateFormatUtils.class).id("_returnReplacementOperator1592");

    private static final metamutator.Selector _returnReplacementOperator1593 = metamutator.Selector.of(1593,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.DateFormatUtils.class).id("_returnReplacementOperator1593");

    private static final metamutator.Selector _returnReplacementOperator1594 = metamutator.Selector.of(1594,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.DateFormatUtils.class).id("_returnReplacementOperator1594");

    private static final metamutator.Selector _returnReplacementOperator1595 = metamutator.Selector.of(1595,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.DateFormatUtils.class).id("_returnReplacementOperator1595");

    private static final metamutator.Selector _returnReplacementOperator1596 = metamutator.Selector.of(1596,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.DateFormatUtils.class).id("_returnReplacementOperator1596");

    private static final metamutator.Selector _returnReplacementOperator1597 = metamutator.Selector.of(1597,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.DateFormatUtils.class).id("_returnReplacementOperator1597");

    private static final metamutator.Selector _returnReplacementOperator1598 = metamutator.Selector.of(1598,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.DateFormatUtils.class).id("_returnReplacementOperator1598");
}

