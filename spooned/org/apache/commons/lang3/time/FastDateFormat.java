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
        return ((_returnReplacementOperatorHotSpot1714.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.cache.getInstance()));
    }

    public static org.apache.commons.lang3.time.FastDateFormat getInstance(final java.lang.String pattern) {
        return ((_returnReplacementOperatorHotSpot1715.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.cache.getInstance(pattern, null, null)));
    }

    public static org.apache.commons.lang3.time.FastDateFormat getInstance(final java.lang.String pattern, final java.util.TimeZone timeZone) {
        return ((_returnReplacementOperatorHotSpot1717.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.cache.getInstance(pattern, timeZone, null)));
    }

    public static org.apache.commons.lang3.time.FastDateFormat getInstance(final java.lang.String pattern, final java.util.Locale locale) {
        return ((_returnReplacementOperatorHotSpot1716.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.cache.getInstance(pattern, null, locale)));
    }

    public static org.apache.commons.lang3.time.FastDateFormat getInstance(final java.lang.String pattern, final java.util.TimeZone timeZone, final java.util.Locale locale) {
        return ((_returnReplacementOperatorHotSpot1718.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.cache.getInstance(pattern, timeZone, locale)));
    }

    public static org.apache.commons.lang3.time.FastDateFormat getDateInstance(final int style) {
        return ((_returnReplacementOperatorHotSpot1706.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.cache.getDateInstance(style, null, null)));
    }

    public static org.apache.commons.lang3.time.FastDateFormat getDateInstance(final int style, final java.util.Locale locale) {
        return ((_returnReplacementOperatorHotSpot1707.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.cache.getDateInstance(style, null, locale)));
    }

    public static org.apache.commons.lang3.time.FastDateFormat getDateInstance(final int style, final java.util.TimeZone timeZone) {
        return ((_returnReplacementOperatorHotSpot1708.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.cache.getDateInstance(style, timeZone, null)));
    }

    public static org.apache.commons.lang3.time.FastDateFormat getDateInstance(final int style, final java.util.TimeZone timeZone, final java.util.Locale locale) {
        return ((_returnReplacementOperatorHotSpot1709.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.cache.getDateInstance(style, timeZone, locale)));
    }

    public static org.apache.commons.lang3.time.FastDateFormat getTimeInstance(final int style) {
        return ((_returnReplacementOperatorHotSpot1719.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.cache.getTimeInstance(style, null, null)));
    }

    public static org.apache.commons.lang3.time.FastDateFormat getTimeInstance(final int style, final java.util.Locale locale) {
        return ((_returnReplacementOperatorHotSpot1720.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.cache.getTimeInstance(style, null, locale)));
    }

    public static org.apache.commons.lang3.time.FastDateFormat getTimeInstance(final int style, final java.util.TimeZone timeZone) {
        return ((_returnReplacementOperatorHotSpot1721.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.cache.getTimeInstance(style, timeZone, null)));
    }

    public static org.apache.commons.lang3.time.FastDateFormat getTimeInstance(final int style, final java.util.TimeZone timeZone, final java.util.Locale locale) {
        return ((_returnReplacementOperatorHotSpot1722.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.cache.getTimeInstance(style, timeZone, locale)));
    }

    public static org.apache.commons.lang3.time.FastDateFormat getDateTimeInstance(final int dateStyle, final int timeStyle) {
        return ((_returnReplacementOperatorHotSpot1710.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.cache.getDateTimeInstance(dateStyle, timeStyle, null, null)));
    }

    public static org.apache.commons.lang3.time.FastDateFormat getDateTimeInstance(final int dateStyle, final int timeStyle, final java.util.Locale locale) {
        return ((_returnReplacementOperatorHotSpot1711.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.cache.getDateTimeInstance(dateStyle, timeStyle, null, locale)));
    }

    public static org.apache.commons.lang3.time.FastDateFormat getDateTimeInstance(final int dateStyle, final int timeStyle, final java.util.TimeZone timeZone) {
        return ((_returnReplacementOperatorHotSpot1712.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(dateStyle, timeStyle, timeZone, null)));
    }

    public static org.apache.commons.lang3.time.FastDateFormat getDateTimeInstance(final int dateStyle, final int timeStyle, final java.util.TimeZone timeZone, final java.util.Locale locale) {
        return ((_returnReplacementOperatorHotSpot1713.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDateFormat.cache.getDateTimeInstance(dateStyle, timeStyle, timeZone, locale)));
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
        return ((_returnReplacementOperatorHotSpot1698.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (toAppendTo.append(printer.format(obj))));
    }

    @java.lang.Override
    public java.lang.String format(final long millis) {
        return ((_returnReplacementOperatorHotSpot1694.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (printer.format(millis)));
    }

    @java.lang.Override
    public java.lang.String format(final java.util.Date date) {
        return ((_returnReplacementOperatorHotSpot1693.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (printer.format(date)));
    }

    @java.lang.Override
    public java.lang.String format(final java.util.Calendar calendar) {
        return ((_returnReplacementOperatorHotSpot1692.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (printer.format(calendar)));
    }

    @java.lang.Deprecated
    @java.lang.Override
    public java.lang.StringBuffer format(final long millis, final java.lang.StringBuffer buf) {
        return ((_returnReplacementOperatorHotSpot1701.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (printer.format(millis, buf)));
    }

    @java.lang.Deprecated
    @java.lang.Override
    public java.lang.StringBuffer format(final java.util.Date date, final java.lang.StringBuffer buf) {
        return ((_returnReplacementOperatorHotSpot1700.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (printer.format(date, buf)));
    }

    @java.lang.Deprecated
    @java.lang.Override
    public java.lang.StringBuffer format(final java.util.Calendar calendar, final java.lang.StringBuffer buf) {
        return ((_returnReplacementOperatorHotSpot1699.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (printer.format(calendar, buf)));
    }

    @java.lang.Override
    public <B extends java.lang.Appendable>B format(final long millis, final B buf) {
        return ((_returnReplacementOperatorHotSpot1686.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (printer.format(millis, buf)));
    }

    @java.lang.Override
    public <B extends java.lang.Appendable>B format(final java.util.Date date, final B buf) {
        return ((_returnReplacementOperatorHotSpot1685.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (printer.format(date, buf)));
    }

    @java.lang.Override
    public <B extends java.lang.Appendable>B format(final java.util.Calendar calendar, final B buf) {
        return ((_returnReplacementOperatorHotSpot1684.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (printer.format(calendar, buf)));
    }

    @java.lang.Override
    public java.util.Date parse(final java.lang.String source) throws java.text.ParseException {
        return ((_returnReplacementOperatorHotSpot1702.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (parser.parse(source)));
    }

    @java.lang.Override
    public java.util.Date parse(final java.lang.String source, final java.text.ParsePosition pos) {
        return ((_returnReplacementOperatorHotSpot1703.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (parser.parse(source, pos)));
    }

    @java.lang.Override
    public java.lang.Object parseObject(final java.lang.String source, final java.text.ParsePosition pos) {
        return ((_returnReplacementOperatorHotSpot1691.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (parser.parseObject(source, pos)));
    }

    @java.lang.Override
    public java.lang.String getPattern() {
        return ((_returnReplacementOperatorHotSpot1695.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (printer.getPattern()));
    }

    @java.lang.Override
    public java.util.TimeZone getTimeZone() {
        return ((_returnReplacementOperatorHotSpot1705.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (printer.getTimeZone()));
    }

    @java.lang.Override
    public java.util.Locale getLocale() {
        return ((_returnReplacementOperatorHotSpot1704.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (printer.getLocale()));
    }

    public int getMaxLengthEstimate() {
        return ((_returnReplacementOperatorHotSpot1689.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1689.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1689.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (printer.getMaxLengthEstimate()));
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if ((obj instanceof org.apache.commons.lang3.time.FastDateFormat) == false) {
            return ((_returnReplacementOperatorHotSpot1687.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        final org.apache.commons.lang3.time.FastDateFormat other = ((org.apache.commons.lang3.time.FastDateFormat)(obj));
        return ((_returnReplacementOperatorHotSpot1688.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (printer.equals(other.printer)));
    }

    @java.lang.Override
    public int hashCode() {
        return ((_returnReplacementOperatorHotSpot1690.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1690.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1690.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (printer.hashCode()));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperatorHotSpot1696.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((((("FastDateFormat[" + (printer.getPattern())) + ",") + (printer.getLocale())) + ",") + (printer.getTimeZone().getID())) + "]"));
    }

    @java.lang.Deprecated
    protected java.lang.StringBuffer applyRules(final java.util.Calendar calendar, final java.lang.StringBuffer buf) {
        return ((_returnReplacementOperatorHotSpot1697.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (printer.applyRules(calendar, buf)));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1684 = metamutator.Selector.of(1684,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1684");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1685 = metamutator.Selector.of(1685,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1685");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1686 = metamutator.Selector.of(1686,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1686");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1687 = metamutator.Selector.of(1687,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1687");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1688 = metamutator.Selector.of(1688,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1688");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1689 = metamutator.Selector.of(1689,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1689");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1690 = metamutator.Selector.of(1690,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1690");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1691 = metamutator.Selector.of(1691,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1691");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1692 = metamutator.Selector.of(1692,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1692");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1693 = metamutator.Selector.of(1693,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1693");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1694 = metamutator.Selector.of(1694,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1694");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1695 = metamutator.Selector.of(1695,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1695");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1696 = metamutator.Selector.of(1696,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1696");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1697 = metamutator.Selector.of(1697,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1697");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1698 = metamutator.Selector.of(1698,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1698");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1699 = metamutator.Selector.of(1699,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1699");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1700 = metamutator.Selector.of(1700,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1700");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1701 = metamutator.Selector.of(1701,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1701");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1702 = metamutator.Selector.of(1702,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1702");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1703 = metamutator.Selector.of(1703,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1703");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1704 = metamutator.Selector.of(1704,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1704");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1705 = metamutator.Selector.of(1705,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1705");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1706 = metamutator.Selector.of(1706,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1706");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1707 = metamutator.Selector.of(1707,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1707");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1708 = metamutator.Selector.of(1708,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1708");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1709 = metamutator.Selector.of(1709,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1709");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1710 = metamutator.Selector.of(1710,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1710");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1711 = metamutator.Selector.of(1711,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1711");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1712 = metamutator.Selector.of(1712,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1712");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1713 = metamutator.Selector.of(1713,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1713");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1714 = metamutator.Selector.of(1714,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1714");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1715 = metamutator.Selector.of(1715,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1715");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1716 = metamutator.Selector.of(1716,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1716");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1717 = metamutator.Selector.of(1717,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1717");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1718 = metamutator.Selector.of(1718,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1718");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1719 = metamutator.Selector.of(1719,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1719");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1720 = metamutator.Selector.of(1720,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1720");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1721 = metamutator.Selector.of(1721,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1721");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1722 = metamutator.Selector.of(1722,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDateFormat.class).id("_returnReplacementOperatorHotSpot1722");
}

