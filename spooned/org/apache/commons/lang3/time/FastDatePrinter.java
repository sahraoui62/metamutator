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
        return ((_returnReplacementOperator1831.is("NULL")) ? ( null ) : (rules));
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
        return ((_returnReplacementOperator1822.is("NULL")) ? ( null ) : (buf.toString()));
    }

    protected NumberRule selectNumberRule(final int field, final int padding) {
        switch (padding) {
            case 1 :
                return ((_returnReplacementOperator1834.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.time.FastDatePrinter.UnpaddedNumberField(field)));
            case 2 :
                return ((_returnReplacementOperator1835.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.time.FastDatePrinter.TwoDigitNumberField(field)));
            default :
                return ((_returnReplacementOperator1836.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.time.FastDatePrinter.PaddedNumberField(field , padding)));
        }
    }

    @java.lang.Deprecated
    @java.lang.Override
    public java.lang.StringBuffer format(final java.lang.Object obj, final java.lang.StringBuffer toAppendTo, final java.text.FieldPosition pos) {
        if (obj instanceof java.util.Date) {
            return ((_returnReplacementOperator1824.is("NULL")) ? ( null ) : (format(((java.util.Date)(obj)), toAppendTo)));
        } else if (obj instanceof java.util.Calendar) {
            return ((_returnReplacementOperator1825.is("NULL")) ? ( null ) : (format(((java.util.Calendar)(obj)), toAppendTo)));
        } else if (obj instanceof java.lang.Long) {
            return ((_returnReplacementOperator1826.is("NULL")) ? ( null ) : (format(((java.lang.Long)(obj)).longValue(), toAppendTo)));
        } else {
            throw new java.lang.IllegalArgumentException(("Unknown class: " + (obj == null ? "<null>" : obj.getClass().getName())));
        }
    }

    java.lang.String format(java.lang.Object obj) {
        if (obj instanceof java.util.Date) {
            return ((_returnReplacementOperator1814.is("NULL")) ? ( null ) : (format(((java.util.Date)(obj)))));
        } else if (obj instanceof java.util.Calendar) {
            return ((_returnReplacementOperator1815.is("NULL")) ? ( null ) : (format(((java.util.Calendar)(obj)))));
        } else if (obj instanceof java.lang.Long) {
            return ((_returnReplacementOperator1816.is("NULL")) ? ( null ) : (format(((java.lang.Long)(obj)).longValue())));
        } else {
            throw new java.lang.IllegalArgumentException(("Unknown class: " + (obj == null ? "<null>" : obj.getClass().getName())));
        }
    }

    @java.lang.Override
    public java.lang.String format(final long millis) {
        final java.util.Calendar c = newCalendar();
        c.setTimeInMillis(millis);
        return ((_returnReplacementOperator1819.is("NULL")) ? ( null ) : (applyRulesToString(c)));
    }

    private java.lang.String applyRulesToString(final java.util.Calendar c) {
        return ((_returnReplacementOperator1813.is("NULL")) ? ( null ) : (applyRules(c, new java.lang.StringBuilder(mMaxLengthEstimate)).toString()));
    }

    private java.util.GregorianCalendar newCalendar() {
        return ((_returnReplacementOperator1830.is("NULL")) ? ( null ) : (new java.util.GregorianCalendar(mTimeZone , mLocale)));
    }

    @java.lang.Override
    public java.lang.String format(final java.util.Date date) {
        final java.util.Calendar c = newCalendar();
        c.setTime(date);
        return ((_returnReplacementOperator1818.is("NULL")) ? ( null ) : (applyRulesToString(c)));
    }

    @java.lang.Override
    public java.lang.String format(final java.util.Calendar calendar) {
        return ((_returnReplacementOperator1817.is("NULL")) ? ( null ) : (format(calendar, new java.lang.StringBuilder(mMaxLengthEstimate)).toString()));
    }

    @java.lang.Override
    public java.lang.StringBuffer format(final long millis, final java.lang.StringBuffer buf) {
        return ((_returnReplacementOperator1829.is("NULL")) ? ( null ) : (format(new java.util.Date(millis), buf)));
    }

    @java.lang.Override
    public java.lang.StringBuffer format(final java.util.Date date, final java.lang.StringBuffer buf) {
        final java.util.Calendar c = newCalendar();
        c.setTime(date);
        return ((_returnReplacementOperator1828.is("NULL")) ? ( null ) : (applyRules(c, buf)));
    }

    @java.lang.Override
    public java.lang.StringBuffer format(final java.util.Calendar calendar, final java.lang.StringBuffer buf) {
        return ((_returnReplacementOperator1827.is("NULL")) ? ( null ) : (format(calendar.getTime(), buf)));
    }

    @java.lang.Override
    public <B extends java.lang.Appendable>B format(final long millis, final B buf) {
        return ((_returnReplacementOperator1808.is("NULL")) ? ( null ) : (format(new java.util.Date(millis), buf)));
    }

    @java.lang.Override
    public <B extends java.lang.Appendable>B format(final java.util.Date date, final B buf) {
        final java.util.Calendar c = newCalendar();
        c.setTime(date);
        return ((_returnReplacementOperator1807.is("NULL")) ? ( null ) : (applyRules(c, buf)));
    }

    @java.lang.Override
    public <B extends java.lang.Appendable>B format(final java.util.Calendar calendar, final B buf) {
        return ((_returnReplacementOperator1806.is("NULL")) ? ( null ) : (format(calendar.getTime(), buf)));
    }

    protected <B extends java.lang.Appendable>B applyRules(final java.util.Calendar calendar, final B buf) {
        try {
            for (final Rule rule : mRules) {
                rule.appendTo(buf, calendar);
            }
        } catch (java.io.IOException ioe) {
            org.apache.commons.lang3.exception.ExceptionUtils.rethrow(ioe);
        }
        return ((_returnReplacementOperator1805.is("NULL")) ? ( null ) : (buf));
    }

    @java.lang.Override
    public java.lang.String getPattern() {
        return ((_returnReplacementOperator1820.is("NULL")) ? ( null ) : (mPattern));
    }

    @java.lang.Override
    public java.util.TimeZone getTimeZone() {
        return ((_returnReplacementOperator1833.is("NULL")) ? ( null ) : (mTimeZone));
    }

    @java.lang.Override
    public java.util.Locale getLocale() {
        return ((_returnReplacementOperator1832.is("NULL")) ? ( null ) : (mLocale));
    }

    public int getMaxLengthEstimate() {
        return ((_returnReplacementOperator1811.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1811.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1811.is("ZERO")) ? ( 0 ) : (mMaxLengthEstimate));
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if ((obj instanceof org.apache.commons.lang3.time.FastDatePrinter) == false) {
            return ((_returnReplacementOperator1809.is("NULL")) ? ( null ) : (false));
        } 
        final org.apache.commons.lang3.time.FastDatePrinter other = ((org.apache.commons.lang3.time.FastDatePrinter)(obj));
        return ((_returnReplacementOperator1810.is("NULL")) ? ( null ) : (((mPattern.equals(other.mPattern)) && (mTimeZone.equals(other.mTimeZone))) && (mLocale.equals(other.mLocale))));
    }

    @java.lang.Override
    public int hashCode() {
        return ((_returnReplacementOperator1812.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1812.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1812.is("ZERO")) ? ( 0 ) : ((mPattern.hashCode()) + (13 * ((mTimeZone.hashCode()) + (13 * (mLocale.hashCode()))))));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperator1823.is("NULL")) ? ( null ) : (((((("FastDatePrinter[" + (mPattern)) + ",") + (mLocale)) + ",") + (mTimeZone.getID())) + "]"));
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
            return ((_returnReplacementOperator1784.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1784.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1784.is("ZERO")) ? ( 0 ) : (1));
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
            return ((_returnReplacementOperator1790.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1790.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1790.is("ZERO")) ? ( 0 ) : (mValue.length()));
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
            return ((_returnReplacementOperator1791.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1791.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1791.is("ZERO")) ? ( 0 ) : (max));
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
            return ((_returnReplacementOperator1804.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1804.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1804.is("ZERO")) ? ( 0 ) : (4));
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
            return ((_returnReplacementOperator1803.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1803.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1803.is("ZERO")) ? ( 0 ) : (2));
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
            return ((_returnReplacementOperator1789.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1789.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1789.is("ZERO")) ? ( 0 ) : (mSize));
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
            return ((_returnReplacementOperator1801.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1801.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1801.is("ZERO")) ? ( 0 ) : (2));
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
            return ((_returnReplacementOperator1802.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1802.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1802.is("ZERO")) ? ( 0 ) : (2));
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
            return ((_returnReplacementOperator1800.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1800.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1800.is("ZERO")) ? ( 0 ) : (2));
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
            return ((_returnReplacementOperator1798.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1798.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1798.is("ZERO")) ? ( 0 ) : (mRule.estimateLength()));
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
            return ((_returnReplacementOperator1799.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1799.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1799.is("ZERO")) ? ( 0 ) : (mRule.estimateLength()));
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
        return ((_returnReplacementOperator1821.is("NULL")) ? ( null ) : (value));
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
            return ((_returnReplacementOperator1796.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1796.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1796.is("ZERO")) ? ( 0 ) : (java.lang.Math.max(mStandard.length(), mDaylight.length())));
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
            return ((_returnReplacementOperator1797.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1797.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1797.is("ZERO")) ? ( 0 ) : (5));
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
                    return ((_returnReplacementOperator1786.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule.ISO8601_HOURS));
                case 2 :
                    return ((_returnReplacementOperator1787.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule.ISO8601_HOURS_MINUTES));
                case 3 :
                    return ((_returnReplacementOperator1788.is("NULL")) ? ( null ) : (org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule.ISO8601_HOURS_COLON_MINUTES));
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
            return ((_returnReplacementOperator1785.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1785.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1785.is("ZERO")) ? ( 0 ) : (length));
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
            return ((_returnReplacementOperator1795.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1795.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1795.is("ZERO")) ? ( 0 ) : (((((mStyle) * 31) + (mLocale.hashCode())) * 31) + (mTimeZone.hashCode())));
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if ((this) == obj) {
                return ((_returnReplacementOperator1792.is("NULL")) ? ( null ) : (true));
            } 
            if (obj instanceof org.apache.commons.lang3.time.FastDatePrinter.TimeZoneDisplayKey) {
                final org.apache.commons.lang3.time.FastDatePrinter.TimeZoneDisplayKey other = ((org.apache.commons.lang3.time.FastDatePrinter.TimeZoneDisplayKey)(obj));
                return ((_returnReplacementOperator1793.is("NULL")) ? ( null ) : (((mTimeZone.equals(other.mTimeZone)) && ((mStyle) == (other.mStyle))) && (mLocale.equals(other.mLocale))));
            } 
            return ((_returnReplacementOperator1794.is("NULL")) ? ( null ) : (false));
        }
    }

    private static final metamutator.Selector _returnReplacementOperator1784 = metamutator.Selector.of(1784,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator1784");

    private static final metamutator.Selector _returnReplacementOperator1785 = metamutator.Selector.of(1785,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator1785");

    private static final metamutator.Selector _returnReplacementOperator1786 = metamutator.Selector.of(1786,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1786");

    private static final metamutator.Selector _returnReplacementOperator1787 = metamutator.Selector.of(1787,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1787");

    private static final metamutator.Selector _returnReplacementOperator1788 = metamutator.Selector.of(1788,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1788");

    private static final metamutator.Selector _returnReplacementOperator1789 = metamutator.Selector.of(1789,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator1789");

    private static final metamutator.Selector _returnReplacementOperator1790 = metamutator.Selector.of(1790,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator1790");

    private static final metamutator.Selector _returnReplacementOperator1791 = metamutator.Selector.of(1791,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator1791");

    private static final metamutator.Selector _returnReplacementOperator1792 = metamutator.Selector.of(1792,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1792");

    private static final metamutator.Selector _returnReplacementOperator1793 = metamutator.Selector.of(1793,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1793");

    private static final metamutator.Selector _returnReplacementOperator1794 = metamutator.Selector.of(1794,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1794");

    private static final metamutator.Selector _returnReplacementOperator1795 = metamutator.Selector.of(1795,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator1795");

    private static final metamutator.Selector _returnReplacementOperator1796 = metamutator.Selector.of(1796,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator1796");

    private static final metamutator.Selector _returnReplacementOperator1797 = metamutator.Selector.of(1797,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator1797");

    private static final metamutator.Selector _returnReplacementOperator1798 = metamutator.Selector.of(1798,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator1798");

    private static final metamutator.Selector _returnReplacementOperator1799 = metamutator.Selector.of(1799,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator1799");

    private static final metamutator.Selector _returnReplacementOperator1800 = metamutator.Selector.of(1800,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator1800");

    private static final metamutator.Selector _returnReplacementOperator1801 = metamutator.Selector.of(1801,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator1801");

    private static final metamutator.Selector _returnReplacementOperator1802 = metamutator.Selector.of(1802,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator1802");

    private static final metamutator.Selector _returnReplacementOperator1803 = metamutator.Selector.of(1803,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator1803");

    private static final metamutator.Selector _returnReplacementOperator1804 = metamutator.Selector.of(1804,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator1804");

    private static final metamutator.Selector _returnReplacementOperator1805 = metamutator.Selector.of(1805,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperator1805");

    private static final metamutator.Selector _returnReplacementOperator1806 = metamutator.Selector.of(1806,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperator1806");

    private static final metamutator.Selector _returnReplacementOperator1807 = metamutator.Selector.of(1807,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperator1807");

    private static final metamutator.Selector _returnReplacementOperator1808 = metamutator.Selector.of(1808,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperator1808");

    private static final metamutator.Selector _returnReplacementOperator1809 = metamutator.Selector.of(1809,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperator1809");

    private static final metamutator.Selector _returnReplacementOperator1810 = metamutator.Selector.of(1810,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperator1810");

    private static final metamutator.Selector _returnReplacementOperator1811 = metamutator.Selector.of(1811,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperator1811");

    private static final metamutator.Selector _returnReplacementOperator1812 = metamutator.Selector.of(1812,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperator1812");

    private static final metamutator.Selector _returnReplacementOperator1813 = metamutator.Selector.of(1813,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperator1813");

    private static final metamutator.Selector _returnReplacementOperator1814 = metamutator.Selector.of(1814,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperator1814");

    private static final metamutator.Selector _returnReplacementOperator1815 = metamutator.Selector.of(1815,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperator1815");

    private static final metamutator.Selector _returnReplacementOperator1816 = metamutator.Selector.of(1816,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperator1816");

    private static final metamutator.Selector _returnReplacementOperator1817 = metamutator.Selector.of(1817,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperator1817");

    private static final metamutator.Selector _returnReplacementOperator1818 = metamutator.Selector.of(1818,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperator1818");

    private static final metamutator.Selector _returnReplacementOperator1819 = metamutator.Selector.of(1819,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperator1819");

    private static final metamutator.Selector _returnReplacementOperator1820 = metamutator.Selector.of(1820,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperator1820");

    private static final metamutator.Selector _returnReplacementOperator1821 = metamutator.Selector.of(1821,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperator1821");

    private static final metamutator.Selector _returnReplacementOperator1822 = metamutator.Selector.of(1822,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperator1822");

    private static final metamutator.Selector _returnReplacementOperator1823 = metamutator.Selector.of(1823,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperator1823");

    private static final metamutator.Selector _returnReplacementOperator1824 = metamutator.Selector.of(1824,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperator1824");

    private static final metamutator.Selector _returnReplacementOperator1825 = metamutator.Selector.of(1825,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperator1825");

    private static final metamutator.Selector _returnReplacementOperator1826 = metamutator.Selector.of(1826,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperator1826");

    private static final metamutator.Selector _returnReplacementOperator1827 = metamutator.Selector.of(1827,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperator1827");

    private static final metamutator.Selector _returnReplacementOperator1828 = metamutator.Selector.of(1828,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperator1828");

    private static final metamutator.Selector _returnReplacementOperator1829 = metamutator.Selector.of(1829,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperator1829");

    private static final metamutator.Selector _returnReplacementOperator1830 = metamutator.Selector.of(1830,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperator1830");

    private static final metamutator.Selector _returnReplacementOperator1831 = metamutator.Selector.of(1831,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperator1831");

    private static final metamutator.Selector _returnReplacementOperator1832 = metamutator.Selector.of(1832,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperator1832");

    private static final metamutator.Selector _returnReplacementOperator1833 = metamutator.Selector.of(1833,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperator1833");

    private static final metamutator.Selector _returnReplacementOperator1834 = metamutator.Selector.of(1834,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperator1834");

    private static final metamutator.Selector _returnReplacementOperator1835 = metamutator.Selector.of(1835,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperator1835");

    private static final metamutator.Selector _returnReplacementOperator1836 = metamutator.Selector.of(1836,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_returnReplacementOperator1836");
}

