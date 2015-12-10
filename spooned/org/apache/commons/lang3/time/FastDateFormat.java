package org.apache.commons.lang3.time;


public class FastDateFormat extends java.text.Format implements org.apache.commons.lang3.time.DateParser , org.apache.commons.lang3.time.DatePrinter {
    private static final long serialVersionUID = 2L;

    public static final int FULL = java.text.DateFormat.FULL;

    public static final int LONG = java.text.DateFormat.LONG;

    public static final int MEDIUM = java.text.DateFormat.MEDIUM;

    public static final int SHORT = java.text.DateFormat.SHORT;

    private static final org.apache.commons.lang3.time.FormatCache<org.apache.commons.lang3.time.FastDateFormat> cache = new org.apache.commons.lang3.time.FormatCache<org.apache.commons.lang3.time.FastDateFormat>() {
        @java.lang.Override
        protected org.apache.commons.lang3.time.FastDateFormat createInstance(final java.lang.String pattern, final java.util.TimeZone timeZone, final java.util.Locale locale) {
            return new org.apache.commons.lang3.time.FastDateFormat(pattern , timeZone , locale);
        }
    };

    private final org.apache.commons.lang3.time.FastDatePrinter printer;

    private final org.apache.commons.lang3.time.FastDateParser parser;

    public static org.apache.commons.lang3.time.FastDateFormat getInstance() {
        return cache.getInstance();
    }

    public static org.apache.commons.lang3.time.FastDateFormat getInstance(final java.lang.String pattern) {
        return cache.getInstance(pattern, null, null);
    }

    public static org.apache.commons.lang3.time.FastDateFormat getInstance(final java.lang.String pattern, final java.util.TimeZone timeZone) {
        return cache.getInstance(pattern, timeZone, null);
    }

    public static org.apache.commons.lang3.time.FastDateFormat getInstance(final java.lang.String pattern, final java.util.Locale locale) {
        return cache.getInstance(pattern, null, locale);
    }

    public static org.apache.commons.lang3.time.FastDateFormat getInstance(final java.lang.String pattern, final java.util.TimeZone timeZone, final java.util.Locale locale) {
        return cache.getInstance(pattern, timeZone, locale);
    }

    public static org.apache.commons.lang3.time.FastDateFormat getDateInstance(final int style) {
        return cache.getDateInstance(style, null, null);
    }

    public static org.apache.commons.lang3.time.FastDateFormat getDateInstance(final int style, final java.util.Locale locale) {
        return cache.getDateInstance(style, null, locale);
    }

    public static org.apache.commons.lang3.time.FastDateFormat getDateInstance(final int style, final java.util.TimeZone timeZone) {
        return cache.getDateInstance(style, timeZone, null);
    }

    public static org.apache.commons.lang3.time.FastDateFormat getDateInstance(final int style, final java.util.TimeZone timeZone, final java.util.Locale locale) {
        return cache.getDateInstance(style, timeZone, locale);
    }

    public static org.apache.commons.lang3.time.FastDateFormat getTimeInstance(final int style) {
        return cache.getTimeInstance(style, null, null);
    }

    public static org.apache.commons.lang3.time.FastDateFormat getTimeInstance(final int style, final java.util.Locale locale) {
        return cache.getTimeInstance(style, null, locale);
    }

    public static org.apache.commons.lang3.time.FastDateFormat getTimeInstance(final int style, final java.util.TimeZone timeZone) {
        return cache.getTimeInstance(style, timeZone, null);
    }

    public static org.apache.commons.lang3.time.FastDateFormat getTimeInstance(final int style, final java.util.TimeZone timeZone, final java.util.Locale locale) {
        return cache.getTimeInstance(style, timeZone, locale);
    }

    public static org.apache.commons.lang3.time.FastDateFormat getDateTimeInstance(final int dateStyle, final int timeStyle) {
        return cache.getDateTimeInstance(dateStyle, timeStyle, null, null);
    }

    public static org.apache.commons.lang3.time.FastDateFormat getDateTimeInstance(final int dateStyle, final int timeStyle, final java.util.Locale locale) {
        return cache.getDateTimeInstance(dateStyle, timeStyle, null, locale);
    }

    public static org.apache.commons.lang3.time.FastDateFormat getDateTimeInstance(final int dateStyle, final int timeStyle, final java.util.TimeZone timeZone) {
        return org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(dateStyle, timeStyle, timeZone, null);
    }

    public static org.apache.commons.lang3.time.FastDateFormat getDateTimeInstance(final int dateStyle, final int timeStyle, final java.util.TimeZone timeZone, final java.util.Locale locale) {
        return cache.getDateTimeInstance(dateStyle, timeStyle, timeZone, locale);
    }

    protected FastDateFormat(final java.lang.String pattern ,final java.util.TimeZone timeZone ,final java.util.Locale locale) {
        this(pattern, timeZone, locale, null);
    }

    protected FastDateFormat(final java.lang.String pattern ,final java.util.TimeZone timeZone ,final java.util.Locale locale ,final java.util.Date centuryStart) {
        printer = new org.apache.commons.lang3.time.FastDatePrinter(pattern , timeZone , locale);
        parser = new org.apache.commons.lang3.time.FastDateParser(pattern , timeZone , locale , centuryStart);
    }

    @java.lang.Override
    public java.lang.StringBuffer format(final java.lang.Object obj, final java.lang.StringBuffer toAppendTo, final java.text.FieldPosition pos) {
        return toAppendTo.append(printer.format(obj));
    }

    @java.lang.Override
    public java.lang.String format(final long millis) {
        return printer.format(millis);
    }

    @java.lang.Override
    public java.lang.String format(final java.util.Date date) {
        return printer.format(date);
    }

    @java.lang.Override
    public java.lang.String format(final java.util.Calendar calendar) {
        return printer.format(calendar);
    }

    @java.lang.Deprecated
    @java.lang.Override
    public java.lang.StringBuffer format(final long millis, final java.lang.StringBuffer buf) {
        return printer.format(millis, buf);
    }

    @java.lang.Deprecated
    @java.lang.Override
    public java.lang.StringBuffer format(final java.util.Date date, final java.lang.StringBuffer buf) {
        return printer.format(date, buf);
    }

    @java.lang.Deprecated
    @java.lang.Override
    public java.lang.StringBuffer format(final java.util.Calendar calendar, final java.lang.StringBuffer buf) {
        return printer.format(calendar, buf);
    }

    @java.lang.Override
    public <B extends java.lang.Appendable>B format(final long millis, final B buf) {
        return printer.format(millis, buf);
    }

    @java.lang.Override
    public <B extends java.lang.Appendable>B format(final java.util.Date date, final B buf) {
        return printer.format(date, buf);
    }

    @java.lang.Override
    public <B extends java.lang.Appendable>B format(final java.util.Calendar calendar, final B buf) {
        return printer.format(calendar, buf);
    }

    @java.lang.Override
    public java.util.Date parse(final java.lang.String source) throws java.text.ParseException {
        return parser.parse(source);
    }

    @java.lang.Override
    public java.util.Date parse(final java.lang.String source, final java.text.ParsePosition pos) {
        return parser.parse(source, pos);
    }

    @java.lang.Override
    public java.lang.Object parseObject(final java.lang.String source, final java.text.ParsePosition pos) {
        return parser.parseObject(source, pos);
    }

    @java.lang.Override
    public java.lang.String getPattern() {
        return printer.getPattern();
    }

    @java.lang.Override
    public java.util.TimeZone getTimeZone() {
        return printer.getTimeZone();
    }

    @java.lang.Override
    public java.util.Locale getLocale() {
        return printer.getLocale();
    }

    public int getMaxLengthEstimate() {
        return printer.getMaxLengthEstimate();
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if ((obj instanceof org.apache.commons.lang3.time.FastDateFormat) == false) {
            return false;
        } 
        final org.apache.commons.lang3.time.FastDateFormat other = ((org.apache.commons.lang3.time.FastDateFormat)(obj));
        return printer.equals(other.printer);
    }

    @java.lang.Override
    public int hashCode() {
        return printer.hashCode();
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((((("FastDateFormat[" + (printer.getPattern())) + ",") + (printer.getLocale())) + ",") + (printer.getTimeZone().getID())) + "]";
    }

    @java.lang.Deprecated
    protected java.lang.StringBuffer applyRules(final java.util.Calendar calendar, final java.lang.StringBuffer buf) {
        return printer.applyRules(calendar, buf);
    }
}

