package org.apache.commons.lang3.time;


public interface DatePrinter {
    java.lang.String format(long millis);

    java.lang.String format(java.util.Date date);

    java.lang.String format(java.util.Calendar calendar);

    @java.lang.Deprecated
    java.lang.StringBuffer format(long millis, java.lang.StringBuffer buf);

    @java.lang.Deprecated
    java.lang.StringBuffer format(java.util.Date date, java.lang.StringBuffer buf);

    @java.lang.Deprecated
    java.lang.StringBuffer format(java.util.Calendar calendar, java.lang.StringBuffer buf);

    <B extends java.lang.Appendable>B format(long millis, B buf);

    <B extends java.lang.Appendable>B format(java.util.Date date, B buf);

    <B extends java.lang.Appendable>B format(java.util.Calendar calendar, B buf);

    java.lang.String getPattern();

    java.util.TimeZone getTimeZone();

    java.util.Locale getLocale();

    java.lang.StringBuffer format(java.lang.Object obj, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos);
}

