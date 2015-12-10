package org.apache.commons.lang3.time;


public interface DateParser {
    java.util.Date parse(java.lang.String source) throws java.text.ParseException;

    java.util.Date parse(java.lang.String source, java.text.ParsePosition pos);

    java.lang.String getPattern();

    java.util.TimeZone getTimeZone();

    java.util.Locale getLocale();

    java.lang.Object parseObject(java.lang.String source) throws java.text.ParseException;

    java.lang.Object parseObject(java.lang.String source, java.text.ParsePosition pos);
}

