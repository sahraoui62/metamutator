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
        return ((_returnReplacementOperator1714.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.cache.getInstance()));
    }

    public static org.apache.commons.lang3.time.FastDateFormat getInstance(final java.lang.String pattern) {
        return ((_returnReplacementOperator1715.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.cache.getInstance(pattern, null, null)));
    }

    public static org.apache.commons.lang3.time.FastDateFormat getInstance(final java.lang.String pattern, final java.util.TimeZone timeZone) {
        return ((_returnReplacementOperator1717.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.cache.getInstance(pattern, timeZone, null)));
    }

    public static org.apache.commons.lang3.time.FastDateFormat getInstance(final java.lang.String pattern, final java.util.Locale locale) {
        return ((_returnReplacementOperator1716.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.cache.getInstance(pattern, null, locale)));
    }

    public static org.apache.commons.lang3.time.FastDateFormat getInstance(final java.lang.String pattern, final java.util.TimeZone timeZone, final java.util.Locale locale) {
        return ((_returnReplacementOperator1718.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.cache.getInstance(pattern, timeZone, locale)));
    }

    public static org.apache.commons.lang3.time.FastDateFormat getDateInstance(final int style) {
        return ((_returnReplacementOperator1706.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.cache.getDateInstance(style, null, null)));
    }

    public static org.apache.commons.lang3.time.FastDateFormat getDateInstance(final int style, final java.util.Locale locale) {
        return ((_returnReplacementOperator1707.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.cache.getDateInstance(style, null, locale)));
    }

    public static org.apache.commons.lang3.time.FastDateFormat getDateInstance(final int style, final java.util.TimeZone timeZone) {
        return ((_returnReplacementOperator1708.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.cache.getDateInstance(style, timeZone, null)));
    }

    public static org.apache.commons.lang3.time.FastDateFormat getDateInstance(final int style, final java.util.TimeZone timeZone, final java.util.Locale locale) {
        return ((_returnReplacementOperator1709.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.cache.getDateInstance(style, timeZone, locale)));
    }

    public static org.apache.commons.lang3.time.FastDateFormat getTimeInstance(final int style) {
        return ((_returnReplacementOperator1719.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.cache.getTimeInstance(style, null, null)));
    }

    public static org.apache.commons.lang3.time.FastDateFormat getTimeInstance(final int style, final java.util.Locale locale) {
        return ((_returnReplacementOperator1720.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.cache.getTimeInstance(style, null, locale)));
    }

    public static org.apache.commons.lang3.time.FastDateFormat getTimeInstance(final int style, final java.util.TimeZone timeZone) {
        return ((_returnReplacementOperator1721.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.cache.getTimeInstance(style, timeZone, null)));
    }

    public static org.apache.commons.lang3.time.FastDateFormat getTimeInstance(final int style, final java.util.TimeZone timeZone, final java.util.Locale locale) {
        return ((_returnReplacementOperator1722.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.cache.getTimeInstance(style, timeZone, locale)));
    }

    public static org.apache.commons.lang3.time.FastDateFormat getDateTimeInstance(final int dateStyle, final int timeStyle) {
        return ((_returnReplacementOperator1710.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.cache.getDateTimeInstance(dateStyle, timeStyle, null, null)));
    }

    public static org.apache.commons.lang3.time.FastDateFormat getDateTimeInstance(final int dateStyle, final int timeStyle, final java.util.Locale locale) {
        return ((_returnReplacementOperator1711.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.cache.getDateTimeInstance(dateStyle, timeStyle, null, locale)));
    }

    public static org.apache.commons.lang3.time.FastDateFormat getDateTimeInstance(final int dateStyle, final int timeStyle, final java.util.TimeZone timeZone) {
        return ((_returnReplacementOperator1712.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(dateStyle, timeStyle, timeZone, null)));
    }

    public static org.apache.commons.lang3.time.FastDateFormat getDateTimeInstance(final int dateStyle, final int timeStyle, final java.util.TimeZone timeZone, final java.util.Locale locale) {
        return ((_returnReplacementOperator1713.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.cache.getDateTimeInstance(dateStyle, timeStyle, timeZone, locale)));
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
        return ((_returnReplacementOperator1698.is("NULL")) ? ( null ) : (toAppendTo.append(printer.format(obj))));
    }

    @java.lang.Override
    public java.lang.String format(final long millis) {
        return ((_returnReplacementOperator1694.is("NULL")) ? ( null ) : (printer.format(millis)));
    }

    @java.lang.Override
    public java.lang.String format(final java.util.Date date) {
        return ((_returnReplacementOperator1693.is("NULL")) ? ( null ) : (printer.format(date)));
    }

    @java.lang.Override
    public java.lang.String format(final java.util.Calendar calendar) {
        return ((_returnReplacementOperator1692.is("NULL")) ? ( null ) : (printer.format(calendar)));
    }

    @java.lang.Deprecated
    @java.lang.Override
    public java.lang.StringBuffer format(final long millis, final java.lang.StringBuffer buf) {
        return ((_returnReplacementOperator1701.is("NULL")) ? ( null ) : (printer.format(millis, buf)));
    }

    @java.lang.Deprecated
    @java.lang.Override
    public java.lang.StringBuffer format(final java.util.Date date, final java.lang.StringBuffer buf) {
        return ((_returnReplacementOperator1700.is("NULL")) ? ( null ) : (printer.format(date, buf)));
    }

    @java.lang.Deprecated
    @java.lang.Override
    public java.lang.StringBuffer format(final java.util.Calendar calendar, final java.lang.StringBuffer buf) {
        return ((_returnReplacementOperator1699.is("NULL")) ? ( null ) : (printer.format(calendar, buf)));
    }

    @java.lang.Override
    public <B extends java.lang.Appendable>B format(final long millis, final B buf) {
        return ((_returnReplacementOperator1686.is("NULL")) ? ( null ) : (printer.format(millis, buf)));
    }

    @java.lang.Override
    public <B extends java.lang.Appendable>B format(final java.util.Date date, final B buf) {
        return ((_returnReplacementOperator1685.is("NULL")) ? ( null ) : (printer.format(date, buf)));
    }

    @java.lang.Override
    public <B extends java.lang.Appendable>B format(final java.util.Calendar calendar, final B buf) {
        return ((_returnReplacementOperator1684.is("NULL")) ? ( null ) : (printer.format(calendar, buf)));
    }

    @java.lang.Override
    public java.util.Date parse(final java.lang.String source) throws java.text.ParseException {
        return ((_returnReplacementOperator1702.is("NULL")) ? ( null ) : (parser.parse(source)));
    }

    @java.lang.Override
    public java.util.Date parse(final java.lang.String source, final java.text.ParsePosition pos) {
        return ((_returnReplacementOperator1703.is("NULL")) ? ( null ) : (parser.parse(source, pos)));
    }

    @java.lang.Override
    public java.lang.Object parseObject(final java.lang.String source, final java.text.ParsePosition pos) {
        return ((_returnReplacementOperator1691.is("NULL")) ? ( null ) : (parser.parseObject(source, pos)));
    }

    @java.lang.Override
    public java.lang.String getPattern() {
        return ((_returnReplacementOperator1695.is("NULL")) ? ( null ) : (printer.getPattern()));
    }

    @java.lang.Override
    public java.util.TimeZone getTimeZone() {
        return ((_returnReplacementOperator1705.is("NULL")) ? ( null ) : (printer.getTimeZone()));
    }

    @java.lang.Override
    public java.util.Locale getLocale() {
        return ((_returnReplacementOperator1704.is("NULL")) ? ( null ) : (printer.getLocale()));
    }

    public int getMaxLengthEstimate() {
        return ((_returnReplacementOperator1689.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1689.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1689.is("ZERO")) ? ( 0 ) : (printer.getMaxLengthEstimate()));
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if ((obj instanceof org.apache.commons.lang3.time.FastDateFormat) == false) {
            return ((_returnReplacementOperator1687.is("NULL")) ? ( null ) : (false));
        } 
        final org.apache.commons.lang3.time.FastDateFormat other = ((org.apache.commons.lang3.time.FastDateFormat)(obj));
        return ((_returnReplacementOperator1688.is("NULL")) ? ( null ) : (printer.equals(other.printer)));
    }

    @java.lang.Override
    public int hashCode() {
        return ((_returnReplacementOperator1690.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1690.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1690.is("ZERO")) ? ( 0 ) : (printer.hashCode()));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperator1696.is("NULL")) ? ( null ) : (((((("FastDateFormat[" + (printer.getPattern())) + ",") + (printer.getLocale())) + ",") + (printer.getTimeZone().getID())) + "]"));
    }

    @java.lang.Deprecated
    protected java.lang.StringBuffer applyRules(final java.util.Calendar calendar, final java.lang.StringBuffer buf) {
        return ((_returnReplacementOperator1697.is("NULL")) ? ( null ) : (printer.applyRules(calendar, buf)));
    }

    private static final metamutator.Selector _returnReplacementOperator1684 = metamutator.Selector.of(1684,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1684");

    private static final metamutator.Selector _returnReplacementOperator1685 = metamutator.Selector.of(1685,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1685");

    private static final metamutator.Selector _returnReplacementOperator1686 = metamutator.Selector.of(1686,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1686");

    private static final metamutator.Selector _returnReplacementOperator1687 = metamutator.Selector.of(1687,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1687");

    private static final metamutator.Selector _returnReplacementOperator1688 = metamutator.Selector.of(1688,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1688");

    private static final metamutator.Selector _returnReplacementOperator1689 = metamutator.Selector.of(1689,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1689");

    private static final metamutator.Selector _returnReplacementOperator1690 = metamutator.Selector.of(1690,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1690");

    private static final metamutator.Selector _returnReplacementOperator1691 = metamutator.Selector.of(1691,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1691");

    private static final metamutator.Selector _returnReplacementOperator1692 = metamutator.Selector.of(1692,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1692");

    private static final metamutator.Selector _returnReplacementOperator1693 = metamutator.Selector.of(1693,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1693");

    private static final metamutator.Selector _returnReplacementOperator1694 = metamutator.Selector.of(1694,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1694");

    private static final metamutator.Selector _returnReplacementOperator1695 = metamutator.Selector.of(1695,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1695");

    private static final metamutator.Selector _returnReplacementOperator1696 = metamutator.Selector.of(1696,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1696");

    private static final metamutator.Selector _returnReplacementOperator1697 = metamutator.Selector.of(1697,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1697");

    private static final metamutator.Selector _returnReplacementOperator1698 = metamutator.Selector.of(1698,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1698");

    private static final metamutator.Selector _returnReplacementOperator1699 = metamutator.Selector.of(1699,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1699");

    private static final metamutator.Selector _returnReplacementOperator1700 = metamutator.Selector.of(1700,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1700");

    private static final metamutator.Selector _returnReplacementOperator1701 = metamutator.Selector.of(1701,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1701");

    private static final metamutator.Selector _returnReplacementOperator1702 = metamutator.Selector.of(1702,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1702");

    private static final metamutator.Selector _returnReplacementOperator1703 = metamutator.Selector.of(1703,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1703");

    private static final metamutator.Selector _returnReplacementOperator1704 = metamutator.Selector.of(1704,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1704");

    private static final metamutator.Selector _returnReplacementOperator1705 = metamutator.Selector.of(1705,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1705");

    private static final metamutator.Selector _returnReplacementOperator1706 = metamutator.Selector.of(1706,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1706");

    private static final metamutator.Selector _returnReplacementOperator1707 = metamutator.Selector.of(1707,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1707");

    private static final metamutator.Selector _returnReplacementOperator1708 = metamutator.Selector.of(1708,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1708");

    private static final metamutator.Selector _returnReplacementOperator1709 = metamutator.Selector.of(1709,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1709");

    private static final metamutator.Selector _returnReplacementOperator1710 = metamutator.Selector.of(1710,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1710");

    private static final metamutator.Selector _returnReplacementOperator1711 = metamutator.Selector.of(1711,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1711");

    private static final metamutator.Selector _returnReplacementOperator1712 = metamutator.Selector.of(1712,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1712");

    private static final metamutator.Selector _returnReplacementOperator1713 = metamutator.Selector.of(1713,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1713");

    private static final metamutator.Selector _returnReplacementOperator1714 = metamutator.Selector.of(1714,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1714");

    private static final metamutator.Selector _returnReplacementOperator1715 = metamutator.Selector.of(1715,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1715");

    private static final metamutator.Selector _returnReplacementOperator1716 = metamutator.Selector.of(1716,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1716");

    private static final metamutator.Selector _returnReplacementOperator1717 = metamutator.Selector.of(1717,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1717");

    private static final metamutator.Selector _returnReplacementOperator1718 = metamutator.Selector.of(1718,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1718");

    private static final metamutator.Selector _returnReplacementOperator1719 = metamutator.Selector.of(1719,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1719");

    private static final metamutator.Selector _returnReplacementOperator1720 = metamutator.Selector.of(1720,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1720");

    private static final metamutator.Selector _returnReplacementOperator1721 = metamutator.Selector.of(1721,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1721");

    private static final metamutator.Selector _returnReplacementOperator1722 = metamutator.Selector.of(1722,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperator1722");
}

