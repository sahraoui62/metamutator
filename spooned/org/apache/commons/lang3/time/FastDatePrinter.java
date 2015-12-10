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
        return rules;
    }

    protected java.lang.String parseToken(final java.lang.String pattern, final int[] indexRef) {
        final java.lang.StringBuilder buf = new java.lang.StringBuilder();
        int i = indexRef[0];
        final int length = pattern.length();
        char c = pattern.charAt(i);
        if (((c >= 'A') && (c <= 'Z')) || ((c >= 'a') && (c <= 'z'))) {
            buf.append(c);
            while (((_arithmeticOperatorHotSpot334.is("PLUS")) ? ((i + 1)) : (_arithmeticOperatorHotSpot334.is("MINUS")) ? ((i - 1)) : (_arithmeticOperatorHotSpot334.is("MUL")) ? ((i * 1)) :  ((i / 1))) < length) {
                final char peek = pattern.charAt(((_arithmeticOperatorHotSpot335.is("PLUS")) ? ((i + 1)) : (_arithmeticOperatorHotSpot335.is("MINUS")) ? ((i - 1)) : (_arithmeticOperatorHotSpot335.is("MUL")) ? ((i * 1)) :  ((i / 1))));
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
                    if ((((_arithmeticOperatorHotSpot336.is("PLUS")) ? ((i + 1)) : (_arithmeticOperatorHotSpot336.is("MINUS")) ? ((i - 1)) : (_arithmeticOperatorHotSpot336.is("MUL")) ? ((i * 1)) :  ((i / 1))) < length) && ((pattern.charAt(((_arithmeticOperatorHotSpot337.is("PLUS")) ? ((i + 1)) : (_arithmeticOperatorHotSpot337.is("MINUS")) ? ((i - 1)) : (_arithmeticOperatorHotSpot337.is("MUL")) ? ((i * 1)) :  ((i / 1))))) == '\'')) {
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
        return buf.toString();
    }

    protected NumberRule selectNumberRule(final int field, final int padding) {
        switch (padding) {
            case 1 :
                return new org.apache.commons.lang3.time.FastDatePrinter.UnpaddedNumberField(field);
            case 2 :
                return new org.apache.commons.lang3.time.FastDatePrinter.TwoDigitNumberField(field);
            default :
                return new org.apache.commons.lang3.time.FastDatePrinter.PaddedNumberField(field , padding);
        }
    }

    @java.lang.Deprecated
    @java.lang.Override
    public java.lang.StringBuffer format(final java.lang.Object obj, final java.lang.StringBuffer toAppendTo, final java.text.FieldPosition pos) {
        if (obj instanceof java.util.Date) {
            return format(((java.util.Date)(obj)), toAppendTo);
        } else if (obj instanceof java.util.Calendar) {
            return format(((java.util.Calendar)(obj)), toAppendTo);
        } else if (obj instanceof java.lang.Long) {
            return format(((java.lang.Long)(obj)).longValue(), toAppendTo);
        } else {
            throw new java.lang.IllegalArgumentException(("Unknown class: " + (obj == null ? "<null>" : obj.getClass().getName())));
        }
    }

    java.lang.String format(java.lang.Object obj) {
        if (obj instanceof java.util.Date) {
            return format(((java.util.Date)(obj)));
        } else if (obj instanceof java.util.Calendar) {
            return format(((java.util.Calendar)(obj)));
        } else if (obj instanceof java.lang.Long) {
            return format(((java.lang.Long)(obj)).longValue());
        } else {
            throw new java.lang.IllegalArgumentException(("Unknown class: " + (obj == null ? "<null>" : obj.getClass().getName())));
        }
    }

    @java.lang.Override
    public java.lang.String format(final long millis) {
        final java.util.Calendar c = newCalendar();
        c.setTimeInMillis(millis);
        return applyRulesToString(c);
    }

    private java.lang.String applyRulesToString(final java.util.Calendar c) {
        return applyRules(c, new java.lang.StringBuilder(mMaxLengthEstimate)).toString();
    }

    private java.util.GregorianCalendar newCalendar() {
        return new java.util.GregorianCalendar(mTimeZone , mLocale);
    }

    @java.lang.Override
    public java.lang.String format(final java.util.Date date) {
        final java.util.Calendar c = newCalendar();
        c.setTime(date);
        return applyRulesToString(c);
    }

    @java.lang.Override
    public java.lang.String format(final java.util.Calendar calendar) {
        return format(calendar, new java.lang.StringBuilder(mMaxLengthEstimate)).toString();
    }

    @java.lang.Override
    public java.lang.StringBuffer format(final long millis, final java.lang.StringBuffer buf) {
        return format(new java.util.Date(millis), buf);
    }

    @java.lang.Override
    public java.lang.StringBuffer format(final java.util.Date date, final java.lang.StringBuffer buf) {
        final java.util.Calendar c = newCalendar();
        c.setTime(date);
        return applyRules(c, buf);
    }

    @java.lang.Override
    public java.lang.StringBuffer format(final java.util.Calendar calendar, final java.lang.StringBuffer buf) {
        return format(calendar.getTime(), buf);
    }

    @java.lang.Override
    public <B extends java.lang.Appendable>B format(final long millis, final B buf) {
        return format(new java.util.Date(millis), buf);
    }

    @java.lang.Override
    public <B extends java.lang.Appendable>B format(final java.util.Date date, final B buf) {
        final java.util.Calendar c = newCalendar();
        c.setTime(date);
        return applyRules(c, buf);
    }

    @java.lang.Override
    public <B extends java.lang.Appendable>B format(final java.util.Calendar calendar, final B buf) {
        return format(calendar.getTime(), buf);
    }

    protected <B extends java.lang.Appendable>B applyRules(final java.util.Calendar calendar, final B buf) {
        try {
            for (final Rule rule : mRules) {
                rule.appendTo(buf, calendar);
            }
        } catch (java.io.IOException ioe) {
            org.apache.commons.lang3.exception.ExceptionUtils.rethrow(ioe);
        }
        return buf;
    }

    @java.lang.Override
    public java.lang.String getPattern() {
        return mPattern;
    }

    @java.lang.Override
    public java.util.TimeZone getTimeZone() {
        return mTimeZone;
    }

    @java.lang.Override
    public java.util.Locale getLocale() {
        return mLocale;
    }

    public int getMaxLengthEstimate() {
        return mMaxLengthEstimate;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if ((obj instanceof org.apache.commons.lang3.time.FastDatePrinter) == false) {
            return false;
        } 
        final org.apache.commons.lang3.time.FastDatePrinter other = ((org.apache.commons.lang3.time.FastDatePrinter)(obj));
        return ((mPattern.equals(other.mPattern)) && (mTimeZone.equals(other.mTimeZone))) && (mLocale.equals(other.mLocale));
    }

    @java.lang.Override
    public int hashCode() {
        return (mPattern.hashCode()) + (13 * ((mTimeZone.hashCode()) + ((_arithmeticOperatorHotSpot333.is("PLUS")) ? ((13 + (mLocale.hashCode()))) : (_arithmeticOperatorHotSpot333.is("MINUS")) ? ((13 - (mLocale.hashCode()))) : (_arithmeticOperatorHotSpot333.is("MUL")) ? ((13 * (mLocale.hashCode()))) :  ((13 / (mLocale.hashCode()))))));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((((("FastDatePrinter[" + (mPattern)) + ",") + (mLocale)) + ",") + (mTimeZone.getID())) + "]";
    }

    private void readObject(final java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        in.defaultReadObject();
        init();
    }

    private static void appendDigits(final java.lang.Appendable buffer, final int value) throws java.io.IOException {
        buffer.append(((char)(((_arithmeticOperatorHotSpot338.is("PLUS")) ? ((value + 10)) : (_arithmeticOperatorHotSpot338.is("MINUS")) ? ((value - 10)) : (_arithmeticOperatorHotSpot338.is("MUL")) ? ((value * 10)) :  ((value / 10))) + '0')));
        buffer.append(((_arithmeticOperatorHotSpot339.is("PLUS")) ? (((char)((value % 10) + '0'))) : (_arithmeticOperatorHotSpot339.is("MINUS")) ? (((char)((value % 10) - '0'))) : (_arithmeticOperatorHotSpot339.is("MUL")) ? (((char)((value % 10) * '0'))) :  (((char)((value % 10) / '0')))));
    }

    private static final int MAX_DIGITS = 10;

    private static void appendFullDigits(final java.lang.Appendable buffer, int value, int minFieldWidth) throws java.io.IOException {
        char[] work = new char[MAX_DIGITS];
        int digit = 0;
        while (value != 0) {
            work[digit++] = ((_arithmeticOperatorHotSpot340.is("PLUS")) ? (((char)((value % 10) + '0'))) : (_arithmeticOperatorHotSpot340.is("MINUS")) ? (((char)((value % 10) - '0'))) : (_arithmeticOperatorHotSpot340.is("MUL")) ? (((char)((value % 10) * '0'))) :  (((char)((value % 10) / '0'))));
            value = ((_arithmeticOperatorHotSpot341.is("PLUS")) ? (value + 10) : (_arithmeticOperatorHotSpot341.is("MINUS")) ? (value - 10) : (_arithmeticOperatorHotSpot341.is("MUL")) ? (value * 10) :  (value / 10));
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
            return 1;
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
            return mValue.length();
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
            return max;
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
            return 4;
        }

        @java.lang.Override
        public void appendTo(final java.lang.Appendable buffer, final java.util.Calendar calendar) throws java.io.IOException {
            appendTo(buffer, calendar.get(mField));
        }

        @java.lang.Override
        public final void appendTo(final java.lang.Appendable buffer, final int value) throws java.io.IOException {
            if (value < 10) {
                buffer.append(((_arithmeticOperatorHotSpot332.is("PLUS")) ? (((char)(value + '0'))) : (_arithmeticOperatorHotSpot332.is("MINUS")) ? (((char)(value - '0'))) : (_arithmeticOperatorHotSpot332.is("MUL")) ? (((char)(value * '0'))) :  (((char)(value / '0')))));
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
            return 2;
        }

        @java.lang.Override
        public void appendTo(final java.lang.Appendable buffer, final java.util.Calendar calendar) throws java.io.IOException {
            appendTo(buffer, ((_arithmeticOperatorHotSpot331.is("PLUS")) ? (((calendar.get(java.util.Calendar.MONTH)) + 1)) : (_arithmeticOperatorHotSpot331.is("MINUS")) ? (((calendar.get(java.util.Calendar.MONTH)) - 1)) : (_arithmeticOperatorHotSpot331.is("MUL")) ? (((calendar.get(java.util.Calendar.MONTH)) * 1)) :  (((calendar.get(java.util.Calendar.MONTH)) / 1))));
        }

        @java.lang.Override
        public final void appendTo(final java.lang.Appendable buffer, final int value) throws java.io.IOException {
            if (value < 10) {
                buffer.append(((_arithmeticOperatorHotSpot330.is("PLUS")) ? (((char)(value + '0'))) : (_arithmeticOperatorHotSpot330.is("MINUS")) ? (((char)(value - '0'))) : (_arithmeticOperatorHotSpot330.is("MUL")) ? (((char)(value * '0'))) :  (((char)(value / '0')))));
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
            return mSize;
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
            return 2;
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
            return 2;
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
            return 2;
        }

        @java.lang.Override
        public void appendTo(final java.lang.Appendable buffer, final java.util.Calendar calendar) throws java.io.IOException {
            appendTo(buffer, ((_arithmeticOperatorHotSpot329.is("PLUS")) ? (((calendar.get(java.util.Calendar.MONTH)) + 1)) : (_arithmeticOperatorHotSpot329.is("MINUS")) ? (((calendar.get(java.util.Calendar.MONTH)) - 1)) : (_arithmeticOperatorHotSpot329.is("MUL")) ? (((calendar.get(java.util.Calendar.MONTH)) * 1)) :  (((calendar.get(java.util.Calendar.MONTH)) / 1))));
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
            return mRule.estimateLength();
        }

        @java.lang.Override
        public void appendTo(final java.lang.Appendable buffer, final java.util.Calendar calendar) throws java.io.IOException {
            int value = calendar.get(java.util.Calendar.HOUR);
            if (value == 0) {
                value = ((_arithmeticOperatorHotSpot327.is("PLUS")) ? ((calendar.getLeastMaximum(java.util.Calendar.HOUR)) + 1) : (_arithmeticOperatorHotSpot327.is("MINUS")) ? ((calendar.getLeastMaximum(java.util.Calendar.HOUR)) - 1) : (_arithmeticOperatorHotSpot327.is("MUL")) ? ((calendar.getLeastMaximum(java.util.Calendar.HOUR)) * 1) :  ((calendar.getLeastMaximum(java.util.Calendar.HOUR)) / 1));
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
            return mRule.estimateLength();
        }

        @java.lang.Override
        public void appendTo(final java.lang.Appendable buffer, final java.util.Calendar calendar) throws java.io.IOException {
            int value = calendar.get(java.util.Calendar.HOUR_OF_DAY);
            if (value == 0) {
                value = ((_arithmeticOperatorHotSpot328.is("PLUS")) ? ((calendar.getMaximum(java.util.Calendar.HOUR_OF_DAY)) + 1) : (_arithmeticOperatorHotSpot328.is("MINUS")) ? ((calendar.getMaximum(java.util.Calendar.HOUR_OF_DAY)) - 1) : (_arithmeticOperatorHotSpot328.is("MUL")) ? ((calendar.getMaximum(java.util.Calendar.HOUR_OF_DAY)) * 1) :  ((calendar.getMaximum(java.util.Calendar.HOUR_OF_DAY)) / 1));
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
        return value;
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
            return java.lang.Math.max(mStandard.length(), mDaylight.length());
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
            return 5;
        }

        @java.lang.Override
        public void appendTo(final java.lang.Appendable buffer, final java.util.Calendar calendar) throws java.io.IOException {
            int offset = ((_arithmeticOperatorHotSpot323.is("PLUS")) ? ((calendar.get(java.util.Calendar.ZONE_OFFSET)) + (calendar.get(java.util.Calendar.DST_OFFSET))) : (_arithmeticOperatorHotSpot323.is("MINUS")) ? ((calendar.get(java.util.Calendar.ZONE_OFFSET)) - (calendar.get(java.util.Calendar.DST_OFFSET))) : (_arithmeticOperatorHotSpot323.is("MUL")) ? ((calendar.get(java.util.Calendar.ZONE_OFFSET)) * (calendar.get(java.util.Calendar.DST_OFFSET))) :  ((calendar.get(java.util.Calendar.ZONE_OFFSET)) / (calendar.get(java.util.Calendar.DST_OFFSET))));
            if (offset < 0) {
                buffer.append('-');
                offset = -offset;
            } else {
                buffer.append('+');
            }
            final int hours = offset / (((_arithmeticOperatorHotSpot324.is("PLUS")) ? ((60 + 60)) : (_arithmeticOperatorHotSpot324.is("MINUS")) ? ((60 - 60)) : (_arithmeticOperatorHotSpot324.is("MUL")) ? ((60 * 60)) :  ((60 / 60))) * 1000);
            org.apache.commons.lang3.time.FastDatePrinter.appendDigits(buffer, hours);
            if (mColon) {
                buffer.append(':');
            } 
            final int minutes = (offset / ((_arithmeticOperatorHotSpot325.is("PLUS")) ? ((60 + 1000)) : (_arithmeticOperatorHotSpot325.is("MINUS")) ? ((60 - 1000)) : (_arithmeticOperatorHotSpot325.is("MUL")) ? ((60 * 1000)) :  ((60 / 1000)))) - ((_arithmeticOperatorHotSpot326.is("PLUS")) ? ((60 + hours)) : (_arithmeticOperatorHotSpot326.is("MINUS")) ? ((60 - hours)) : (_arithmeticOperatorHotSpot326.is("MUL")) ? ((60 * hours)) :  ((60 / hours)));
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
                    return ISO8601_HOURS;
                case 2 :
                    return ISO8601_HOURS_MINUTES;
                case 3 :
                    return ISO8601_HOURS_COLON_MINUTES;
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
            return length;
        }

        @java.lang.Override
        public void appendTo(final java.lang.Appendable buffer, final java.util.Calendar calendar) throws java.io.IOException {
            int offset = ((_arithmeticOperatorHotSpot318.is("PLUS")) ? ((calendar.get(java.util.Calendar.ZONE_OFFSET)) + (calendar.get(java.util.Calendar.DST_OFFSET))) : (_arithmeticOperatorHotSpot318.is("MINUS")) ? ((calendar.get(java.util.Calendar.ZONE_OFFSET)) - (calendar.get(java.util.Calendar.DST_OFFSET))) : (_arithmeticOperatorHotSpot318.is("MUL")) ? ((calendar.get(java.util.Calendar.ZONE_OFFSET)) * (calendar.get(java.util.Calendar.DST_OFFSET))) :  ((calendar.get(java.util.Calendar.ZONE_OFFSET)) / (calendar.get(java.util.Calendar.DST_OFFSET))));
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
            final int hours = offset / (((_arithmeticOperatorHotSpot319.is("PLUS")) ? ((60 + 60)) : (_arithmeticOperatorHotSpot319.is("MINUS")) ? ((60 - 60)) : (_arithmeticOperatorHotSpot319.is("MUL")) ? ((60 * 60)) :  ((60 / 60))) * 1000);
            org.apache.commons.lang3.time.FastDatePrinter.appendDigits(buffer, hours);
            if ((length) < 5) {
                return ;
            } 
            if ((length) == 6) {
                buffer.append(':');
            } 
            final int minutes = (offset / ((_arithmeticOperatorHotSpot320.is("PLUS")) ? ((60 + 1000)) : (_arithmeticOperatorHotSpot320.is("MINUS")) ? ((60 - 1000)) : (_arithmeticOperatorHotSpot320.is("MUL")) ? ((60 * 1000)) :  ((60 / 1000)))) - ((_arithmeticOperatorHotSpot321.is("PLUS")) ? ((60 + hours)) : (_arithmeticOperatorHotSpot321.is("MINUS")) ? ((60 - hours)) : (_arithmeticOperatorHotSpot321.is("MUL")) ? ((60 * hours)) :  ((60 / hours)));
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
            return ((((_arithmeticOperatorHotSpot322.is("PLUS")) ? (((mStyle) + 31)) : (_arithmeticOperatorHotSpot322.is("MINUS")) ? (((mStyle) - 31)) : (_arithmeticOperatorHotSpot322.is("MUL")) ? (((mStyle) * 31)) :  (((mStyle) / 31))) + (mLocale.hashCode())) * 31) + (mTimeZone.hashCode());
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if ((this) == obj) {
                return true;
            } 
            if (obj instanceof org.apache.commons.lang3.time.FastDatePrinter.TimeZoneDisplayKey) {
                final org.apache.commons.lang3.time.FastDatePrinter.TimeZoneDisplayKey other = ((org.apache.commons.lang3.time.FastDatePrinter.TimeZoneDisplayKey)(obj));
                return ((mTimeZone.equals(other.mTimeZone)) && ((mStyle) == (other.mStyle))) && (mLocale.equals(other.mLocale));
            } 
            return false;
        }
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot318 = metamutator.Selector.of(318,new String[]{"PLUS","MINUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot318");

    private static final metamutator.Selector _arithmeticOperatorHotSpot319 = metamutator.Selector.of(319,new String[]{"MUL","PLUS","MINUS","DIV"}).id("_arithmeticOperatorHotSpot319");

    private static final metamutator.Selector _arithmeticOperatorHotSpot320 = metamutator.Selector.of(320,new String[]{"MUL","PLUS","MINUS","DIV"}).id("_arithmeticOperatorHotSpot320");

    private static final metamutator.Selector _arithmeticOperatorHotSpot321 = metamutator.Selector.of(321,new String[]{"MUL","PLUS","MINUS","DIV"}).id("_arithmeticOperatorHotSpot321");

    private static final metamutator.Selector _arithmeticOperatorHotSpot322 = metamutator.Selector.of(322,new String[]{"MUL","PLUS","MINUS","DIV"}).id("_arithmeticOperatorHotSpot322");

    private static final metamutator.Selector _arithmeticOperatorHotSpot323 = metamutator.Selector.of(323,new String[]{"PLUS","MINUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot323");

    private static final metamutator.Selector _arithmeticOperatorHotSpot324 = metamutator.Selector.of(324,new String[]{"MUL","PLUS","MINUS","DIV"}).id("_arithmeticOperatorHotSpot324");

    private static final metamutator.Selector _arithmeticOperatorHotSpot325 = metamutator.Selector.of(325,new String[]{"MUL","PLUS","MINUS","DIV"}).id("_arithmeticOperatorHotSpot325");

    private static final metamutator.Selector _arithmeticOperatorHotSpot326 = metamutator.Selector.of(326,new String[]{"MUL","PLUS","MINUS","DIV"}).id("_arithmeticOperatorHotSpot326");

    private static final metamutator.Selector _arithmeticOperatorHotSpot327 = metamutator.Selector.of(327,new String[]{"PLUS","MINUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot327");

    private static final metamutator.Selector _arithmeticOperatorHotSpot328 = metamutator.Selector.of(328,new String[]{"PLUS","MINUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot328");

    private static final metamutator.Selector _arithmeticOperatorHotSpot329 = metamutator.Selector.of(329,new String[]{"PLUS","MINUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot329");

    private static final metamutator.Selector _arithmeticOperatorHotSpot330 = metamutator.Selector.of(330,new String[]{"PLUS","MINUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot330");

    private static final metamutator.Selector _arithmeticOperatorHotSpot331 = metamutator.Selector.of(331,new String[]{"PLUS","MINUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot331");

    private static final metamutator.Selector _arithmeticOperatorHotSpot332 = metamutator.Selector.of(332,new String[]{"PLUS","MINUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot332");

    private static final metamutator.Selector _arithmeticOperatorHotSpot333 = metamutator.Selector.of(333,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_arithmeticOperatorHotSpot333");

    private static final metamutator.Selector _arithmeticOperatorHotSpot334 = metamutator.Selector.of(334,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_arithmeticOperatorHotSpot334");

    private static final metamutator.Selector _arithmeticOperatorHotSpot335 = metamutator.Selector.of(335,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_arithmeticOperatorHotSpot335");

    private static final metamutator.Selector _arithmeticOperatorHotSpot336 = metamutator.Selector.of(336,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_arithmeticOperatorHotSpot336");

    private static final metamutator.Selector _arithmeticOperatorHotSpot337 = metamutator.Selector.of(337,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_arithmeticOperatorHotSpot337");

    private static final metamutator.Selector _arithmeticOperatorHotSpot338 = metamutator.Selector.of(338,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_arithmeticOperatorHotSpot338");

    private static final metamutator.Selector _arithmeticOperatorHotSpot339 = metamutator.Selector.of(339,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_arithmeticOperatorHotSpot339");

    private static final metamutator.Selector _arithmeticOperatorHotSpot340 = metamutator.Selector.of(340,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_arithmeticOperatorHotSpot340");

    private static final metamutator.Selector _arithmeticOperatorHotSpot341 = metamutator.Selector.of(341,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.time.FastDatePrinter.class).id("_arithmeticOperatorHotSpot341");
}

