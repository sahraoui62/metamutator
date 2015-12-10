package org.apache.commons.lang3.time;


public class FastDatePrinter implements java.io.Serializable , org.apache.commons.lang3.time.DatePrinter {
    private static final long serialVersionUID = 1L;

    public static final int FULL = java.text.DateFormat.FULL;

    public static final int LONG = java.text.DateFormat.LONG;

    public static final int MEDIUM = java.text.DateFormat.MEDIUM;

    public static final int SHORT = java.text.DateFormat.SHORT;

    private final java.lang.String mPattern;

    private final java.util.TimeZone mTimeZone;

    private final java.util.Locale mLocale;

    private transient Rule[] mRules;

    private transient int mMaxLengthEstimate;

    protected FastDatePrinter(final java.lang.String pattern ,final java.util.TimeZone timeZone ,final java.util.Locale locale) {
        mPattern = pattern;
        mTimeZone = timeZone;
        mLocale = locale;
        init();
    }

    private void init() {
        final java.util.List<Rule> rulesList = parsePattern();
        mRules = rulesList.toArray(new Rule[rulesList.size()]);
        int len = 0;
        for (int i = mRules.length ; (--i) >= 0 ; ) {
            len += mRules[i].estimateLength();
        }
        mMaxLengthEstimate = len;
    }

    protected java.util.List<Rule> parsePattern() {
        final java.text.DateFormatSymbols symbols = new java.text.DateFormatSymbols(mLocale);
        final java.util.List<Rule> rules = new java.util.ArrayList<Rule>();
        final java.lang.String[] ERAs = symbols.getEras();
        final java.lang.String[] months = symbols.getMonths();
        final java.lang.String[] shortMonths = symbols.getShortMonths();
        final java.lang.String[] weekdays = symbols.getWeekdays();
        final java.lang.String[] shortWeekdays = symbols.getShortWeekdays();
        final java.lang.String[] AmPmStrings = symbols.getAmPmStrings();
        final int length = mPattern.length();
        final int[] indexRef = new int[1];
        for (int i = 0 ; i < length ; i++) {
            indexRef[0] = i;
            final java.lang.String token = parseToken(mPattern, indexRef);
            i = indexRef[0];
            final int tokenLen = token.length();
            if (tokenLen == 0) {
                break;
            } 
            Rule rule;
            final char c = token.charAt(0);
            switch (c) {
                case 'G' :
                    rule = new org.apache.commons.lang3.time.FastDatePrinter.TextField(java.util.Calendar.ERA , ERAs);
                    break;
                case 'y' :
                    if (tokenLen == 2) {
                        rule = org.apache.commons.lang3.time.FastDatePrinter.TwoDigitYearField.INSTANCE;
                    } else {
                        rule = selectNumberRule(java.util.Calendar.YEAR, (tokenLen < 4 ? 4 : tokenLen));
                    }
                    break;
                case 'M' :
                    if (tokenLen >= 4) {
                        rule = new org.apache.commons.lang3.time.FastDatePrinter.TextField(java.util.Calendar.MONTH , months);
                    } else if (tokenLen == 3) {
                        rule = new org.apache.commons.lang3.time.FastDatePrinter.TextField(java.util.Calendar.MONTH , shortMonths);
                    } else if (tokenLen == 2) {
                        rule = org.apache.commons.lang3.time.FastDatePrinter.TwoDigitMonthField.INSTANCE;
                    } else {
                        rule = org.apache.commons.lang3.time.FastDatePrinter.UnpaddedMonthField.INSTANCE;
                    }
                    break;
                case 'd' :
                    rule = selectNumberRule(java.util.Calendar.DAY_OF_MONTH, tokenLen);
                    break;
                case 'h' :
                    rule = new org.apache.commons.lang3.time.FastDatePrinter.TwelveHourField(selectNumberRule(java.util.Calendar.HOUR, tokenLen));
                    break;
                case 'H' :
                    rule = selectNumberRule(java.util.Calendar.HOUR_OF_DAY, tokenLen);
                    break;
                case 'm' :
                    rule = selectNumberRule(java.util.Calendar.MINUTE, tokenLen);
                    break;
                case 's' :
                    rule = selectNumberRule(java.util.Calendar.SECOND, tokenLen);
                    break;
                case 'S' :
                    rule = selectNumberRule(java.util.Calendar.MILLISECOND, tokenLen);
                    break;
                case 'E' :
                    rule = new org.apache.commons.lang3.time.FastDatePrinter.TextField(java.util.Calendar.DAY_OF_WEEK , (tokenLen < 4 ? shortWeekdays : weekdays));
                    break;
                case 'D' :
                    rule = selectNumberRule(java.util.Calendar.DAY_OF_YEAR, tokenLen);
                    break;
                case 'F' :
                    rule = selectNumberRule(java.util.Calendar.DAY_OF_WEEK_IN_MONTH, tokenLen);
                    break;
                case 'w' :
                    rule = selectNumberRule(java.util.Calendar.WEEK_OF_YEAR, tokenLen);
                    break;
                case 'W' :
                    rule = selectNumberRule(java.util.Calendar.WEEK_OF_MONTH, tokenLen);
                    break;
                case 'a' :
                    rule = new org.apache.commons.lang3.time.FastDatePrinter.TextField(java.util.Calendar.AM_PM , AmPmStrings);
                    break;
                case 'k' :
                    rule = new org.apache.commons.lang3.time.FastDatePrinter.TwentyFourHourField(selectNumberRule(java.util.Calendar.HOUR_OF_DAY, tokenLen));
                    break;
                case 'K' :
                    rule = selectNumberRule(java.util.Calendar.HOUR, tokenLen);
                    break;
                case 'X' :
                    rule = org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule.getRule(tokenLen);
                    break;
                case 'z' :
                    if (tokenLen >= 4) {
                        rule = new org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNameRule(mTimeZone , mLocale , java.util.TimeZone.LONG);
                    } else {
                        rule = new org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNameRule(mTimeZone , mLocale , java.util.TimeZone.SHORT);
                    }
                    break;
                case 'Z' :
                    if (tokenLen == 1) {
                        rule = org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNumberRule.INSTANCE_NO_COLON;
                    } else if (tokenLen == 2) {
                        rule = org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule.ISO8601_HOURS_COLON_MINUTES;
                    } else {
                        rule = org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNumberRule.INSTANCE_COLON;
                    }
                    break;
                case '\'' :
                    final java.lang.String sub = token.substring(1);
                    if ((sub.length()) == 1) {
                        rule = new org.apache.commons.lang3.time.FastDatePrinter.CharacterLiteral(sub.charAt(0));
                    } else {
                        rule = new org.apache.commons.lang3.time.FastDatePrinter.StringLiteral(sub);
                    }
                    break;
                default :
                    throw new java.lang.IllegalArgumentException(("Illegal pattern component: " + token));
            }
            rules.add(rule);
        }
        return ((_returnReplacementOperatorHotSpot1831.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (rules));
    }

    protected java.lang.String parseToken(final java.lang.String pattern, final int[] indexRef) {
        final java.lang.StringBuilder buf = new java.lang.StringBuilder();
        int i = indexRef[0];
        final int length = pattern.length();
        char c = pattern.charAt(i);
        if (((c >= 'A') && (c <= 'Z')) || ((c >= 'a') && (c <= 'z'))) {
            buf.append(c);
            while ((i + 1) < length) {
                final char peek = pattern.charAt((i + 1));
                if (peek == c) {
                    buf.append(c);
                    i++;
                } else {
                    break;
                }
            }
        } else {
            buf.append('\'');
            boolean inLiteral = false;
            for ( ; i < length ; i++) {
                c = pattern.charAt(i);
                if (c == '\'') {
                    if (((i + 1) < length) && ((pattern.charAt((i + 1))) == '\'')) {
                        i++;
                        buf.append(c);
                    } else {
                        inLiteral = !inLiteral;
                    }
                } else if ((!inLiteral) && (((c >= 'A') && (c <= 'Z')) || ((c >= 'a') && (c <= 'z')))) {
                    i--;
                    break;
                } else {
                    buf.append(c);
                }
            }
        }
        indexRef[0] = i;
        return ((_returnReplacementOperatorHotSpot1822.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (buf.toString()));
    }

    protected NumberRule selectNumberRule(final int field, final int padding) {
        switch (padding) {
            case 1 :
                return ((_returnReplacementOperatorHotSpot1834.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.time.FastDatePrinter.UnpaddedNumberField(field)));
            case 2 :
                return ((_returnReplacementOperatorHotSpot1835.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.time.FastDatePrinter.TwoDigitNumberField(field)));
            default :
                return ((_returnReplacementOperatorHotSpot1836.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.time.FastDatePrinter.PaddedNumberField(field , padding)));
        }
    }

    @java.lang.Deprecated
    @java.lang.Override
    public java.lang.StringBuffer format(final java.lang.Object obj, final java.lang.StringBuffer toAppendTo, final java.text.FieldPosition pos) {
        if (obj instanceof java.util.Date) {
            return ((_returnReplacementOperatorHotSpot1824.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (format(((java.util.Date)(obj)), toAppendTo)));
        } else if (obj instanceof java.util.Calendar) {
            return ((_returnReplacementOperatorHotSpot1825.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (format(((java.util.Calendar)(obj)), toAppendTo)));
        } else if (obj instanceof java.lang.Long) {
            return ((_returnReplacementOperatorHotSpot1826.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (format(((java.lang.Long)(obj)).longValue(), toAppendTo)));
        } else {
            throw new java.lang.IllegalArgumentException(("Unknown class: " + (obj == null ? "<null>" : obj.getClass().getName())));
        }
    }

    java.lang.String format(java.lang.Object obj) {
        if (obj instanceof java.util.Date) {
            return ((_returnReplacementOperatorHotSpot1814.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (format(((java.util.Date)(obj)))));
        } else if (obj instanceof java.util.Calendar) {
            return ((_returnReplacementOperatorHotSpot1815.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (format(((java.util.Calendar)(obj)))));
        } else if (obj instanceof java.lang.Long) {
            return ((_returnReplacementOperatorHotSpot1816.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (format(((java.lang.Long)(obj)).longValue())));
        } else {
            throw new java.lang.IllegalArgumentException(("Unknown class: " + (obj == null ? "<null>" : obj.getClass().getName())));
        }
    }

    @java.lang.Override
    public java.lang.String format(final long millis) {
        final java.util.Calendar c = newCalendar();
        c.setTimeInMillis(millis);
        return ((_returnReplacementOperatorHotSpot1819.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (applyRulesToString(c)));
    }

    private java.lang.String applyRulesToString(final java.util.Calendar c) {
        return ((_returnReplacementOperatorHotSpot1813.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (applyRules(c, new java.lang.StringBuilder(mMaxLengthEstimate)).toString()));
    }

    private java.util.GregorianCalendar newCalendar() {
        return ((_returnReplacementOperatorHotSpot1830.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new java.util.GregorianCalendar(mTimeZone , mLocale)));
    }

    @java.lang.Override
    public java.lang.String format(final java.util.Date date) {
        final java.util.Calendar c = newCalendar();
        c.setTime(date);
        return ((_returnReplacementOperatorHotSpot1818.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (applyRulesToString(c)));
    }

    @java.lang.Override
    public java.lang.String format(final java.util.Calendar calendar) {
        return ((_returnReplacementOperatorHotSpot1817.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (format(calendar, new java.lang.StringBuilder(mMaxLengthEstimate)).toString()));
    }

    @java.lang.Override
    public java.lang.StringBuffer format(final long millis, final java.lang.StringBuffer buf) {
        return ((_returnReplacementOperatorHotSpot1829.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (format(new java.util.Date(millis), buf)));
    }

    @java.lang.Override
    public java.lang.StringBuffer format(final java.util.Date date, final java.lang.StringBuffer buf) {
        final java.util.Calendar c = newCalendar();
        c.setTime(date);
        return ((_returnReplacementOperatorHotSpot1828.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (applyRules(c, buf)));
    }

    @java.lang.Override
    public java.lang.StringBuffer format(final java.util.Calendar calendar, final java.lang.StringBuffer buf) {
        return ((_returnReplacementOperatorHotSpot1827.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (format(calendar.getTime(), buf)));
    }

    @java.lang.Override
    public <B extends java.lang.Appendable>B format(final long millis, final B buf) {
        return ((_returnReplacementOperatorHotSpot1808.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (format(new java.util.Date(millis), buf)));
    }

    @java.lang.Override
    public <B extends java.lang.Appendable>B format(final java.util.Date date, final B buf) {
        final java.util.Calendar c = newCalendar();
        c.setTime(date);
        return ((_returnReplacementOperatorHotSpot1807.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (applyRules(c, buf)));
    }

    @java.lang.Override
    public <B extends java.lang.Appendable>B format(final java.util.Calendar calendar, final B buf) {
        return ((_returnReplacementOperatorHotSpot1806.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (format(calendar.getTime(), buf)));
    }

    protected <B extends java.lang.Appendable>B applyRules(final java.util.Calendar calendar, final B buf) {
        try {
            for (final Rule rule : mRules) {
                rule.appendTo(buf, calendar);
            }
        } catch (java.io.IOException ioe) {
            org.apache.commons.lang3.exception.ExceptionUtils.rethrow(ioe);
        }
        return ((_returnReplacementOperatorHotSpot1805.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (buf));
    }

    @java.lang.Override
    public java.lang.String getPattern() {
        return ((_returnReplacementOperatorHotSpot1820.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (mPattern));
    }

    @java.lang.Override
    public java.util.TimeZone getTimeZone() {
        return ((_returnReplacementOperatorHotSpot1833.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (mTimeZone));
    }

    @java.lang.Override
    public java.util.Locale getLocale() {
        return ((_returnReplacementOperatorHotSpot1832.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (mLocale));
    }

    public int getMaxLengthEstimate() {
        return ((_returnReplacementOperatorHotSpot1811.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1811.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1811.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (mMaxLengthEstimate));
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if ((obj instanceof org.apache.commons.lang3.time.FastDatePrinter) == false) {
            return ((_returnReplacementOperatorHotSpot1809.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        final org.apache.commons.lang3.time.FastDatePrinter other = ((org.apache.commons.lang3.time.FastDatePrinter)(obj));
        return ((_returnReplacementOperatorHotSpot1810.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((mPattern.equals(other.mPattern)) && (mTimeZone.equals(other.mTimeZone))) && (mLocale.equals(other.mLocale))));
    }

    @java.lang.Override
    public int hashCode() {
        return ((_returnReplacementOperatorHotSpot1812.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1812.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1812.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : ((mPattern.hashCode()) + (13 * ((mTimeZone.hashCode()) + (13 * (mLocale.hashCode()))))));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperatorHotSpot1823.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((((("FastDatePrinter[" + (mPattern)) + ",") + (mLocale)) + ",") + (mTimeZone.getID())) + "]"));
    }

    private void readObject(final java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        in.defaultReadObject();
        init();
    }

    private static void appendDigits(final java.lang.Appendable buffer, final int value) throws java.io.IOException {
        buffer.append(((char)((value / 10) + '0')));
        buffer.append(((char)((value % 10) + '0')));
    }

    private static final int MAX_DIGITS = 10;

    private static void appendFullDigits(final java.lang.Appendable buffer, int value, int minFieldWidth) throws java.io.IOException {
        char[] work = new char[MAX_DIGITS];
        int digit = 0;
        while (value != 0) {
            work[digit++] = ((char)((value % 10) + '0'));
            value = value / 10;
        }
        while (digit < minFieldWidth) {
            buffer.append('0');
            --minFieldWidth;
        }
        while ((--digit) >= 0) {
            buffer.append(work[digit]);
        }
    }

    private interface Rule {
        int estimateLength();

        void appendTo(java.lang.Appendable buf, java.util.Calendar calendar) throws java.io.IOException;
    }

    private interface NumberRule extends Rule {
        void appendTo(java.lang.Appendable buffer, int value) throws java.io.IOException;
    }

    private static class CharacterLiteral implements Rule {
        private final char mValue;

        CharacterLiteral(final char value) {
            mValue = value;
        }

        @java.lang.Override
        public int estimateLength() {
            return ((_returnReplacementOperatorHotSpot1784.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1784.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1784.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (1));
        }

        @java.lang.Override
        public void appendTo(final java.lang.Appendable buffer, final java.util.Calendar calendar) throws java.io.IOException {
            buffer.append(mValue);
        }
    }

    private static class StringLiteral implements Rule {
        private final java.lang.String mValue;

        StringLiteral(final java.lang.String value) {
            mValue = value;
        }

        @java.lang.Override
        public int estimateLength() {
            return ((_returnReplacementOperatorHotSpot1790.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1790.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1790.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (mValue.length()));
        }

        @java.lang.Override
        public void appendTo(final java.lang.Appendable buffer, final java.util.Calendar calendar) throws java.io.IOException {
            buffer.append(mValue);
        }
    }

    private static class TextField implements Rule {
        private final int mField;

        private final java.lang.String[] mValues;

        TextField(final int field ,final java.lang.String[] values) {
            mField = field;
            mValues = values;
        }

        @java.lang.Override
        public int estimateLength() {
            int max = 0;
            for (int i = mValues.length ; (--i) >= 0 ; ) {
                final int len = mValues[i].length();
                if (len > max) {
                    max = len;
                } 
            }
            return ((_returnReplacementOperatorHotSpot1791.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1791.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1791.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (max));
        }

        @java.lang.Override
        public void appendTo(final java.lang.Appendable buffer, final java.util.Calendar calendar) throws java.io.IOException {
            buffer.append(mValues[calendar.get(mField)]);
        }
    }

    private static class UnpaddedNumberField implements NumberRule {
        private final int mField;

        UnpaddedNumberField(final int field) {
            mField = field;
        }

        @java.lang.Override
        public int estimateLength() {
            return ((_returnReplacementOperatorHotSpot1804.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1804.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1804.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (4));
        }

        @java.lang.Override
        public void appendTo(final java.lang.Appendable buffer, final java.util.Calendar calendar) throws java.io.IOException {
            appendTo(buffer, calendar.get(mField));
        }

        @java.lang.Override
        public final void appendTo(final java.lang.Appendable buffer, final int value) throws java.io.IOException {
            if (value < 10) {
                buffer.append(((char)(value + '0')));
            } else if (value < 100) {
                org.apache.commons.lang3.time.FastDatePrinter.appendDigits(buffer, value);
            } else {
                org.apache.commons.lang3.time.FastDatePrinter.appendFullDigits(buffer, value, 1);
            }
        }
    }

    private static class UnpaddedMonthField implements NumberRule {
        static final org.apache.commons.lang3.time.FastDatePrinter.UnpaddedMonthField INSTANCE = new org.apache.commons.lang3.time.FastDatePrinter.UnpaddedMonthField();

        UnpaddedMonthField() {
            super();
        }

        @java.lang.Override
        public int estimateLength() {
            return ((_returnReplacementOperatorHotSpot1803.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1803.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1803.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (2));
        }

        @java.lang.Override
        public void appendTo(final java.lang.Appendable buffer, final java.util.Calendar calendar) throws java.io.IOException {
            appendTo(buffer, ((calendar.get(java.util.Calendar.MONTH)) + 1));
        }

        @java.lang.Override
        public final void appendTo(final java.lang.Appendable buffer, final int value) throws java.io.IOException {
            if (value < 10) {
                buffer.append(((char)(value + '0')));
            } else {
                org.apache.commons.lang3.time.FastDatePrinter.appendDigits(buffer, value);
            }
        }
    }

    private static class PaddedNumberField implements NumberRule {
        private final int mField;

        private final int mSize;

        PaddedNumberField(final int field ,final int size) {
            if (size < 3) {
                throw new java.lang.IllegalArgumentException();
            } 
            mField = field;
            mSize = size;
        }

        @java.lang.Override
        public int estimateLength() {
            return ((_returnReplacementOperatorHotSpot1789.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1789.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1789.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (mSize));
        }

        @java.lang.Override
        public void appendTo(final java.lang.Appendable buffer, final java.util.Calendar calendar) throws java.io.IOException {
            appendTo(buffer, calendar.get(mField));
        }

        @java.lang.Override
        public final void appendTo(final java.lang.Appendable buffer, int value) throws java.io.IOException {
            org.apache.commons.lang3.time.FastDatePrinter.appendFullDigits(buffer, value, mSize);
        }
    }

    private static class TwoDigitNumberField implements NumberRule {
        private final int mField;

        TwoDigitNumberField(final int field) {
            mField = field;
        }

        @java.lang.Override
        public int estimateLength() {
            return ((_returnReplacementOperatorHotSpot1801.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1801.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1801.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (2));
        }

        @java.lang.Override
        public void appendTo(final java.lang.Appendable buffer, final java.util.Calendar calendar) throws java.io.IOException {
            appendTo(buffer, calendar.get(mField));
        }

        @java.lang.Override
        public final void appendTo(final java.lang.Appendable buffer, final int value) throws java.io.IOException {
            if (value < 100) {
                org.apache.commons.lang3.time.FastDatePrinter.appendDigits(buffer, value);
            } else {
                org.apache.commons.lang3.time.FastDatePrinter.appendFullDigits(buffer, value, 2);
            }
        }
    }

    private static class TwoDigitYearField implements NumberRule {
        static final org.apache.commons.lang3.time.FastDatePrinter.TwoDigitYearField INSTANCE = new org.apache.commons.lang3.time.FastDatePrinter.TwoDigitYearField();

        TwoDigitYearField() {
            super();
        }

        @java.lang.Override
        public int estimateLength() {
            return ((_returnReplacementOperatorHotSpot1802.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1802.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1802.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (2));
        }

        @java.lang.Override
        public void appendTo(final java.lang.Appendable buffer, final java.util.Calendar calendar) throws java.io.IOException {
            appendTo(buffer, ((calendar.get(java.util.Calendar.YEAR)) % 100));
        }

        @java.lang.Override
        public final void appendTo(final java.lang.Appendable buffer, final int value) throws java.io.IOException {
            org.apache.commons.lang3.time.FastDatePrinter.appendDigits(buffer, value);
        }
    }

    private static class TwoDigitMonthField implements NumberRule {
        static final org.apache.commons.lang3.time.FastDatePrinter.TwoDigitMonthField INSTANCE = new org.apache.commons.lang3.time.FastDatePrinter.TwoDigitMonthField();

        TwoDigitMonthField() {
            super();
        }

        @java.lang.Override
        public int estimateLength() {
            return ((_returnReplacementOperatorHotSpot1800.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1800.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1800.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (2));
        }

        @java.lang.Override
        public void appendTo(final java.lang.Appendable buffer, final java.util.Calendar calendar) throws java.io.IOException {
            appendTo(buffer, ((calendar.get(java.util.Calendar.MONTH)) + 1));
        }

        @java.lang.Override
        public final void appendTo(final java.lang.Appendable buffer, final int value) throws java.io.IOException {
            org.apache.commons.lang3.time.FastDatePrinter.appendDigits(buffer, value);
        }
    }

    private static class TwelveHourField implements NumberRule {
        private final NumberRule mRule;

        TwelveHourField(final NumberRule rule) {
            mRule = rule;
        }

        @java.lang.Override
        public int estimateLength() {
            return ((_returnReplacementOperatorHotSpot1798.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1798.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1798.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (mRule.estimateLength()));
        }

        @java.lang.Override
        public void appendTo(final java.lang.Appendable buffer, final java.util.Calendar calendar) throws java.io.IOException {
            int value = calendar.get(java.util.Calendar.HOUR);
            if (value == 0) {
                value = (calendar.getLeastMaximum(java.util.Calendar.HOUR)) + 1;
            } 
            mRule.appendTo(buffer, value);
        }

        @java.lang.Override
        public void appendTo(final java.lang.Appendable buffer, final int value) throws java.io.IOException {
            mRule.appendTo(buffer, value);
        }
    }

    private static class TwentyFourHourField implements NumberRule {
        private final NumberRule mRule;

        TwentyFourHourField(final NumberRule rule) {
            mRule = rule;
        }

        @java.lang.Override
        public int estimateLength() {
            return ((_returnReplacementOperatorHotSpot1799.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1799.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1799.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (mRule.estimateLength()));
        }

        @java.lang.Override
        public void appendTo(final java.lang.Appendable buffer, final java.util.Calendar calendar) throws java.io.IOException {
            int value = calendar.get(java.util.Calendar.HOUR_OF_DAY);
            if (value == 0) {
                value = (calendar.getMaximum(java.util.Calendar.HOUR_OF_DAY)) + 1;
            } 
            mRule.appendTo(buffer, value);
        }

        @java.lang.Override
        public void appendTo(final java.lang.Appendable buffer, final int value) throws java.io.IOException {
            mRule.appendTo(buffer, value);
        }
    }

    private static final java.util.concurrent.ConcurrentMap<org.apache.commons.lang3.time.FastDatePrinter.TimeZoneDisplayKey, java.lang.String> cTimeZoneDisplayCache = new java.util.concurrent.ConcurrentHashMap<org.apache.commons.lang3.time.FastDatePrinter.TimeZoneDisplayKey, java.lang.String>(7);

    static java.lang.String getTimeZoneDisplay(final java.util.TimeZone tz, final boolean daylight, final int style, final java.util.Locale locale) {
        final org.apache.commons.lang3.time.FastDatePrinter.TimeZoneDisplayKey key = new org.apache.commons.lang3.time.FastDatePrinter.TimeZoneDisplayKey(tz , daylight , style , locale);
        java.lang.String value = cTimeZoneDisplayCache.get(key);
        if (value == null) {
            value = tz.getDisplayName(daylight, style, locale);
            final java.lang.String prior = cTimeZoneDisplayCache.putIfAbsent(key, value);
            if (prior != null) {
                value = prior;
            } 
        } 
        return ((_returnReplacementOperatorHotSpot1821.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (value));
    }

    private static class TimeZoneNameRule implements Rule {
        private final java.util.Locale mLocale;

        private final int mStyle;

        private final java.lang.String mStandard;

        private final java.lang.String mDaylight;

        TimeZoneNameRule(final java.util.TimeZone timeZone ,final java.util.Locale locale ,final int style) {
            mLocale = locale;
            mStyle = style;
            mStandard = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone, false, style, locale);
            mDaylight = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone, true, style, locale);
        }

        @java.lang.Override
        public int estimateLength() {
            return ((_returnReplacementOperatorHotSpot1796.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1796.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1796.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (java.lang.Math.max(mStandard.length(), mDaylight.length())));
        }

        @java.lang.Override
        public void appendTo(final java.lang.Appendable buffer, final java.util.Calendar calendar) throws java.io.IOException {
            final java.util.TimeZone zone = calendar.getTimeZone();
            if ((calendar.get(java.util.Calendar.DST_OFFSET)) != 0) {
                buffer.append(org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(zone, true, mStyle, mLocale));
            } else {
                buffer.append(org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(zone, false, mStyle, mLocale));
            }
        }
    }

    private static class TimeZoneNumberRule implements Rule {
        static final org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNumberRule INSTANCE_COLON = new org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNumberRule(true);

        static final org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNumberRule INSTANCE_NO_COLON = new org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNumberRule(false);

        final boolean mColon;

        TimeZoneNumberRule(final boolean colon) {
            mColon = colon;
        }

        @java.lang.Override
        public int estimateLength() {
            return ((_returnReplacementOperatorHotSpot1797.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1797.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1797.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (5));
        }

        @java.lang.Override
        public void appendTo(final java.lang.Appendable buffer, final java.util.Calendar calendar) throws java.io.IOException {
            int offset = (calendar.get(java.util.Calendar.ZONE_OFFSET)) + (calendar.get(java.util.Calendar.DST_OFFSET));
            if (offset < 0) {
                buffer.append('-');
                offset = -offset;
            } else {
                buffer.append('+');
            }
            final int hours = offset / ((60 * 60) * 1000);
            org.apache.commons.lang3.time.FastDatePrinter.appendDigits(buffer, hours);
            if (mColon) {
                buffer.append(':');
            } 
            final int minutes = (offset / (60 * 1000)) - (60 * hours);
            org.apache.commons.lang3.time.FastDatePrinter.appendDigits(buffer, minutes);
        }
    }

    private static class Iso8601_Rule implements Rule {
        static final org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule ISO8601_HOURS = new org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule(3);

        static final org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule ISO8601_HOURS_MINUTES = new org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule(5);

        static final org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule ISO8601_HOURS_COLON_MINUTES = new org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule(6);

        static org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule getRule(int tokenLen) {
            switch (tokenLen) {
                case 1 :
                    return ((_returnReplacementOperatorHotSpot1786.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule.ISO8601_HOURS));
                case 2 :
                    return ((_returnReplacementOperatorHotSpot1787.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule.ISO8601_HOURS_MINUTES));
                case 3 :
                    return ((_returnReplacementOperatorHotSpot1788.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule.ISO8601_HOURS_COLON_MINUTES));
                default :
                    throw new java.lang.IllegalArgumentException("invalid number of X");
            }
        }

        final int length;

        Iso8601_Rule(final int length) {
            this.length = length;
        }

        @java.lang.Override
        public int estimateLength() {
            return ((_returnReplacementOperatorHotSpot1785.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1785.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1785.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (length));
        }

        @java.lang.Override
        public void appendTo(final java.lang.Appendable buffer, final java.util.Calendar calendar) throws java.io.IOException {
            int offset = (calendar.get(java.util.Calendar.ZONE_OFFSET)) + (calendar.get(java.util.Calendar.DST_OFFSET));
            if (offset == 0) {
                buffer.append("Z");
                return ;
            } 
            if (offset < 0) {
                buffer.append('-');
                offset = -offset;
            } else {
                buffer.append('+');
            }
            final int hours = offset / ((60 * 60) * 1000);
            org.apache.commons.lang3.time.FastDatePrinter.appendDigits(buffer, hours);
            if ((length) < 5) {
                return ;
            } 
            if ((length) == 6) {
                buffer.append(':');
            } 
            final int minutes = (offset / (60 * 1000)) - (60 * hours);
            org.apache.commons.lang3.time.FastDatePrinter.appendDigits(buffer, minutes);
        }
    }

    private static class TimeZoneDisplayKey {
        private final java.util.TimeZone mTimeZone;

        private final int mStyle;

        private final java.util.Locale mLocale;

        TimeZoneDisplayKey(final java.util.TimeZone timeZone ,final boolean daylight ,final int style ,final java.util.Locale locale) {
            mTimeZone = timeZone;
            if (daylight) {
                mStyle = style | -2147483648;
            } else {
                mStyle = style;
            }
            mLocale = locale;
        }

        @java.lang.Override
        public int hashCode() {
            return ((_returnReplacementOperatorHotSpot1795.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1795.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1795.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (((((mStyle) * 31) + (mLocale.hashCode())) * 31) + (mTimeZone.hashCode())));
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if ((this) == obj) {
                return ((_returnReplacementOperatorHotSpot1792.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
            } 
            if (obj instanceof org.apache.commons.lang3.time.FastDatePrinter.TimeZoneDisplayKey) {
                final org.apache.commons.lang3.time.FastDatePrinter.TimeZoneDisplayKey other = ((org.apache.commons.lang3.time.FastDatePrinter.TimeZoneDisplayKey)(obj));
                return ((_returnReplacementOperatorHotSpot1793.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((mTimeZone.equals(other.mTimeZone)) && ((mStyle) == (other.mStyle))) && (mLocale.equals(other.mLocale))));
            } 
            return ((_returnReplacementOperatorHotSpot1794.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        }
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1784 = metamutator.Selector.of(1784,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot1784");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1785 = metamutator.Selector.of(1785,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot1785");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1786 = metamutator.Selector.of(1786,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1786");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1787 = metamutator.Selector.of(1787,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1787");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1788 = metamutator.Selector.of(1788,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1788");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1789 = metamutator.Selector.of(1789,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot1789");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1790 = metamutator.Selector.of(1790,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot1790");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1791 = metamutator.Selector.of(1791,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot1791");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1792 = metamutator.Selector.of(1792,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1792");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1793 = metamutator.Selector.of(1793,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1793");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1794 = metamutator.Selector.of(1794,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1794");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1795 = metamutator.Selector.of(1795,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot1795");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1796 = metamutator.Selector.of(1796,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot1796");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1797 = metamutator.Selector.of(1797,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot1797");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1798 = metamutator.Selector.of(1798,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot1798");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1799 = metamutator.Selector.of(1799,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot1799");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1800 = metamutator.Selector.of(1800,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot1800");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1801 = metamutator.Selector.of(1801,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot1801");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1802 = metamutator.Selector.of(1802,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot1802");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1803 = metamutator.Selector.of(1803,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot1803");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1804 = metamutator.Selector.of(1804,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot1804");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1805 = metamutator.Selector.of(1805,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperatorHotSpot1805");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1806 = metamutator.Selector.of(1806,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperatorHotSpot1806");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1807 = metamutator.Selector.of(1807,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperatorHotSpot1807");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1808 = metamutator.Selector.of(1808,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperatorHotSpot1808");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1809 = metamutator.Selector.of(1809,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperatorHotSpot1809");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1810 = metamutator.Selector.of(1810,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperatorHotSpot1810");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1811 = metamutator.Selector.of(1811,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperatorHotSpot1811");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1812 = metamutator.Selector.of(1812,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperatorHotSpot1812");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1813 = metamutator.Selector.of(1813,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperatorHotSpot1813");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1814 = metamutator.Selector.of(1814,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperatorHotSpot1814");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1815 = metamutator.Selector.of(1815,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperatorHotSpot1815");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1816 = metamutator.Selector.of(1816,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperatorHotSpot1816");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1817 = metamutator.Selector.of(1817,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperatorHotSpot1817");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1818 = metamutator.Selector.of(1818,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperatorHotSpot1818");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1819 = metamutator.Selector.of(1819,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperatorHotSpot1819");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1820 = metamutator.Selector.of(1820,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperatorHotSpot1820");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1821 = metamutator.Selector.of(1821,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperatorHotSpot1821");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1822 = metamutator.Selector.of(1822,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperatorHotSpot1822");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1823 = metamutator.Selector.of(1823,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperatorHotSpot1823");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1824 = metamutator.Selector.of(1824,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperatorHotSpot1824");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1825 = metamutator.Selector.of(1825,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperatorHotSpot1825");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1826 = metamutator.Selector.of(1826,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperatorHotSpot1826");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1827 = metamutator.Selector.of(1827,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperatorHotSpot1827");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1828 = metamutator.Selector.of(1828,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperatorHotSpot1828");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1829 = metamutator.Selector.of(1829,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperatorHotSpot1829");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1830 = metamutator.Selector.of(1830,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperatorHotSpot1830");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1831 = metamutator.Selector.of(1831,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperatorHotSpot1831");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1832 = metamutator.Selector.of(1832,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperatorHotSpot1832");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1833 = metamutator.Selector.of(1833,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperatorHotSpot1833");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1834 = metamutator.Selector.of(1834,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperatorHotSpot1834");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1835 = metamutator.Selector.of(1835,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperatorHotSpot1835");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1836 = metamutator.Selector.of(1836,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperatorHotSpot1836");
}

