package org.apache.commons.lang3.text;


public abstract class StrMatcher {
    private static final org.apache.commons.lang3.text.StrMatcher COMMA_MATCHER = new org.apache.commons.lang3.text.StrMatcher.CharMatcher(',');

    private static final org.apache.commons.lang3.text.StrMatcher TAB_MATCHER = new org.apache.commons.lang3.text.StrMatcher.CharMatcher('\t');

    private static final org.apache.commons.lang3.text.StrMatcher SPACE_MATCHER = new org.apache.commons.lang3.text.StrMatcher.CharMatcher(' ');

    private static final org.apache.commons.lang3.text.StrMatcher SPLIT_MATCHER = new org.apache.commons.lang3.text.StrMatcher.CharSetMatcher(" \t\n\r\f".toCharArray());

    private static final org.apache.commons.lang3.text.StrMatcher TRIM_MATCHER = new org.apache.commons.lang3.text.StrMatcher.TrimMatcher();

    private static final org.apache.commons.lang3.text.StrMatcher SINGLE_QUOTE_MATCHER = new org.apache.commons.lang3.text.StrMatcher.CharMatcher('\'');

    private static final org.apache.commons.lang3.text.StrMatcher DOUBLE_QUOTE_MATCHER = new org.apache.commons.lang3.text.StrMatcher.CharMatcher('"');

    private static final org.apache.commons.lang3.text.StrMatcher QUOTE_MATCHER = new org.apache.commons.lang3.text.StrMatcher.CharSetMatcher("\'\"".toCharArray());

    private static final org.apache.commons.lang3.text.StrMatcher NONE_MATCHER = new org.apache.commons.lang3.text.StrMatcher.NoMatcher();

    public static org.apache.commons.lang3.text.StrMatcher commaMatcher() {
        return ((_returnReplacementOperator1426.is("NULL")) ? ( null ) : (org.apache.commons.lang3.text.StrMatcher.COMMA_MATCHER));
    }

    public static org.apache.commons.lang3.text.StrMatcher tabMatcher() {
        return ((_returnReplacementOperator1435.is("NULL")) ? ( null ) : (org.apache.commons.lang3.text.StrMatcher.TAB_MATCHER));
    }

    public static org.apache.commons.lang3.text.StrMatcher spaceMatcher() {
        return ((_returnReplacementOperator1431.is("NULL")) ? ( null ) : (org.apache.commons.lang3.text.StrMatcher.SPACE_MATCHER));
    }

    public static org.apache.commons.lang3.text.StrMatcher splitMatcher() {
        return ((_returnReplacementOperator1432.is("NULL")) ? ( null ) : (org.apache.commons.lang3.text.StrMatcher.SPLIT_MATCHER));
    }

    public static org.apache.commons.lang3.text.StrMatcher trimMatcher() {
        return ((_returnReplacementOperator1436.is("NULL")) ? ( null ) : (org.apache.commons.lang3.text.StrMatcher.TRIM_MATCHER));
    }

    public static org.apache.commons.lang3.text.StrMatcher singleQuoteMatcher() {
        return ((_returnReplacementOperator1430.is("NULL")) ? ( null ) : (org.apache.commons.lang3.text.StrMatcher.SINGLE_QUOTE_MATCHER));
    }

    public static org.apache.commons.lang3.text.StrMatcher doubleQuoteMatcher() {
        return ((_returnReplacementOperator1427.is("NULL")) ? ( null ) : (org.apache.commons.lang3.text.StrMatcher.DOUBLE_QUOTE_MATCHER));
    }

    public static org.apache.commons.lang3.text.StrMatcher quoteMatcher() {
        return ((_returnReplacementOperator1429.is("NULL")) ? ( null ) : (org.apache.commons.lang3.text.StrMatcher.QUOTE_MATCHER));
    }

    public static org.apache.commons.lang3.text.StrMatcher noneMatcher() {
        return ((_returnReplacementOperator1428.is("NULL")) ? ( null ) : (org.apache.commons.lang3.text.StrMatcher.NONE_MATCHER));
    }

    public static org.apache.commons.lang3.text.StrMatcher charMatcher(final char ch) {
        return ((_returnReplacementOperator1419.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.text.StrMatcher.CharMatcher(ch)));
    }

    public static org.apache.commons.lang3.text.StrMatcher charSetMatcher(final char... chars) {
        if ((chars == null) || ((chars.length) == 0)) {
            return ((_returnReplacementOperator1420.is("NULL")) ? ( null ) : (org.apache.commons.lang3.text.StrMatcher.NONE_MATCHER));
        } 
        if ((chars.length) == 1) {
            return ((_returnReplacementOperator1421.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.text.StrMatcher.CharMatcher(chars[0])));
        } 
        return ((_returnReplacementOperator1422.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.text.StrMatcher.CharSetMatcher(chars)));
    }

    public static org.apache.commons.lang3.text.StrMatcher charSetMatcher(final java.lang.String chars) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(chars)) {
            return ((_returnReplacementOperator1423.is("NULL")) ? ( null ) : (org.apache.commons.lang3.text.StrMatcher.NONE_MATCHER));
        } 
        if ((chars.length()) == 1) {
            return ((_returnReplacementOperator1424.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.text.StrMatcher.CharMatcher(chars.charAt(0))));
        } 
        return ((_returnReplacementOperator1425.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.text.StrMatcher.CharSetMatcher(chars.toCharArray())));
    }

    public static org.apache.commons.lang3.text.StrMatcher stringMatcher(final java.lang.String str) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
            return ((_returnReplacementOperator1433.is("NULL")) ? ( null ) : (org.apache.commons.lang3.text.StrMatcher.NONE_MATCHER));
        } 
        return ((_returnReplacementOperator1434.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.text.StrMatcher.StringMatcher(str)));
    }

    protected StrMatcher() {
        super();
    }

    public abstract int isMatch(char[] buffer, int pos, int bufferStart, int bufferEnd);

    public int isMatch(final char[] buffer, final int pos) {
        return ((_returnReplacementOperator1418.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1418.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1418.is("ZERO")) ? ( 0 ) : (isMatch(buffer, pos, 0, buffer.length)));
    }

    static final class CharSetMatcher extends org.apache.commons.lang3.text.StrMatcher {
        private final char[] chars;

        CharSetMatcher(final char[] chars) {
            super();
            this.chars = chars.clone();
            java.util.Arrays.sort(this.chars);
        }

        @java.lang.Override
        public int isMatch(final char[] buffer, final int pos, final int bufferStart, final int bufferEnd) {
            return ((_returnReplacementOperator1411.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1411.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1411.is("ZERO")) ? ( 0 ) : ((java.util.Arrays.binarySearch(chars, buffer[pos])) >= 0 ? 1 : 0));
        }
    }

    static final class CharMatcher extends org.apache.commons.lang3.text.StrMatcher {
        private final char ch;

        CharMatcher(final char ch) {
            super();
            this.ch = ch;
        }

        @java.lang.Override
        public int isMatch(final char[] buffer, final int pos, final int bufferStart, final int bufferEnd) {
            return ((_returnReplacementOperator1410.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1410.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1410.is("ZERO")) ? ( 0 ) : ((ch) == (buffer[pos]) ? 1 : 0));
        }
    }

    static final class StringMatcher extends org.apache.commons.lang3.text.StrMatcher {
        private final char[] chars;

        StringMatcher(final java.lang.String str) {
            super();
            chars = str.toCharArray();
        }

        @java.lang.Override
        public int isMatch(final char[] buffer, int pos, final int bufferStart, final int bufferEnd) {
            final int len = chars.length;
            if ((pos + len) > bufferEnd) {
                return ((_returnReplacementOperator1413.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1413.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1413.is("ZERO")) ? ( 0 ) : (0));
            } 
            for (int i = 0 ; i < (chars.length) ; i++ , pos++) {
                if ((chars[i]) != (buffer[pos])) {
                    return ((_returnReplacementOperator1414.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1414.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1414.is("ZERO")) ? ( 0 ) : (0));
                } 
            }
            return ((_returnReplacementOperator1415.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1415.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1415.is("ZERO")) ? ( 0 ) : (len));
        }

        @java.lang.Override
        public java.lang.String toString() {
            return ((_returnReplacementOperator1416.is("NULL")) ? ( null ) : (((super.toString()) + ' ') + (java.util.Arrays.toString(chars))));
        }
    }

    static final class NoMatcher extends org.apache.commons.lang3.text.StrMatcher {
        NoMatcher() {
            super();
        }

        @java.lang.Override
        public int isMatch(final char[] buffer, final int pos, final int bufferStart, final int bufferEnd) {
            return ((_returnReplacementOperator1412.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1412.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1412.is("ZERO")) ? ( 0 ) : (0));
        }
    }

    static final class TrimMatcher extends org.apache.commons.lang3.text.StrMatcher {
        TrimMatcher() {
            super();
        }

        @java.lang.Override
        public int isMatch(final char[] buffer, final int pos, final int bufferStart, final int bufferEnd) {
            return ((_returnReplacementOperator1417.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1417.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1417.is("ZERO")) ? ( 0 ) : ((buffer[pos]) <= 32 ? 1 : 0));
        }
    }

    private static final metamutator.Selector _returnReplacementOperator1410 = metamutator.Selector.of(1410,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator1410");

    private static final metamutator.Selector _returnReplacementOperator1411 = metamutator.Selector.of(1411,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator1411");

    private static final metamutator.Selector _returnReplacementOperator1412 = metamutator.Selector.of(1412,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator1412");

    private static final metamutator.Selector _returnReplacementOperator1413 = metamutator.Selector.of(1413,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator1413");

    private static final metamutator.Selector _returnReplacementOperator1414 = metamutator.Selector.of(1414,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator1414");

    private static final metamutator.Selector _returnReplacementOperator1415 = metamutator.Selector.of(1415,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator1415");

    private static final metamutator.Selector _returnReplacementOperator1416 = metamutator.Selector.of(1416,new String[]{"INIT","NULL"}).id("_returnReplacementOperator1416");

    private static final metamutator.Selector _returnReplacementOperator1417 = metamutator.Selector.of(1417,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator1417");

    private static final metamutator.Selector _returnReplacementOperator1418 = metamutator.Selector.of(1418,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperator1418");

    private static final metamutator.Selector _returnReplacementOperator1419 = metamutator.Selector.of(1419,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperator1419");

    private static final metamutator.Selector _returnReplacementOperator1420 = metamutator.Selector.of(1420,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperator1420");

    private static final metamutator.Selector _returnReplacementOperator1421 = metamutator.Selector.of(1421,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperator1421");

    private static final metamutator.Selector _returnReplacementOperator1422 = metamutator.Selector.of(1422,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperator1422");

    private static final metamutator.Selector _returnReplacementOperator1423 = metamutator.Selector.of(1423,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperator1423");

    private static final metamutator.Selector _returnReplacementOperator1424 = metamutator.Selector.of(1424,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperator1424");

    private static final metamutator.Selector _returnReplacementOperator1425 = metamutator.Selector.of(1425,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperator1425");

    private static final metamutator.Selector _returnReplacementOperator1426 = metamutator.Selector.of(1426,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperator1426");

    private static final metamutator.Selector _returnReplacementOperator1427 = metamutator.Selector.of(1427,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperator1427");

    private static final metamutator.Selector _returnReplacementOperator1428 = metamutator.Selector.of(1428,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperator1428");

    private static final metamutator.Selector _returnReplacementOperator1429 = metamutator.Selector.of(1429,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperator1429");

    private static final metamutator.Selector _returnReplacementOperator1430 = metamutator.Selector.of(1430,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperator1430");

    private static final metamutator.Selector _returnReplacementOperator1431 = metamutator.Selector.of(1431,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperator1431");

    private static final metamutator.Selector _returnReplacementOperator1432 = metamutator.Selector.of(1432,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperator1432");

    private static final metamutator.Selector _returnReplacementOperator1433 = metamutator.Selector.of(1433,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperator1433");

    private static final metamutator.Selector _returnReplacementOperator1434 = metamutator.Selector.of(1434,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperator1434");

    private static final metamutator.Selector _returnReplacementOperator1435 = metamutator.Selector.of(1435,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperator1435");

    private static final metamutator.Selector _returnReplacementOperator1436 = metamutator.Selector.of(1436,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperator1436");
}

