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
        return ((_returnReplacementOperatorHotSpot1426.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.text.StrMatcher.COMMA_MATCHER));
    }

    public static org.apache.commons.lang3.text.StrMatcher tabMatcher() {
        return ((_returnReplacementOperatorHotSpot1435.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.text.StrMatcher.TAB_MATCHER));
    }

    public static org.apache.commons.lang3.text.StrMatcher spaceMatcher() {
        return ((_returnReplacementOperatorHotSpot1431.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.text.StrMatcher.SPACE_MATCHER));
    }

    public static org.apache.commons.lang3.text.StrMatcher splitMatcher() {
        return ((_returnReplacementOperatorHotSpot1432.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.text.StrMatcher.SPLIT_MATCHER));
    }

    public static org.apache.commons.lang3.text.StrMatcher trimMatcher() {
        return ((_returnReplacementOperatorHotSpot1436.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.text.StrMatcher.TRIM_MATCHER));
    }

    public static org.apache.commons.lang3.text.StrMatcher singleQuoteMatcher() {
        return ((_returnReplacementOperatorHotSpot1430.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.text.StrMatcher.SINGLE_QUOTE_MATCHER));
    }

    public static org.apache.commons.lang3.text.StrMatcher doubleQuoteMatcher() {
        return ((_returnReplacementOperatorHotSpot1427.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.text.StrMatcher.DOUBLE_QUOTE_MATCHER));
    }

    public static org.apache.commons.lang3.text.StrMatcher quoteMatcher() {
        return ((_returnReplacementOperatorHotSpot1429.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.text.StrMatcher.QUOTE_MATCHER));
    }

    public static org.apache.commons.lang3.text.StrMatcher noneMatcher() {
        return ((_returnReplacementOperatorHotSpot1428.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.text.StrMatcher.NONE_MATCHER));
    }

    public static org.apache.commons.lang3.text.StrMatcher charMatcher(final char ch) {
        return ((_returnReplacementOperatorHotSpot1419.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.text.StrMatcher.CharMatcher(ch)));
    }

    public static org.apache.commons.lang3.text.StrMatcher charSetMatcher(final char... chars) {
        if ((chars == null) || ((chars.length) == 0)) {
            return ((_returnReplacementOperatorHotSpot1420.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.text.StrMatcher.NONE_MATCHER));
        } 
        if ((chars.length) == 1) {
            return ((_returnReplacementOperatorHotSpot1421.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.text.StrMatcher.CharMatcher(chars[0])));
        } 
        return ((_returnReplacementOperatorHotSpot1422.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.text.StrMatcher.CharSetMatcher(chars)));
    }

    public static org.apache.commons.lang3.text.StrMatcher charSetMatcher(final java.lang.String chars) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(chars)) {
            return ((_returnReplacementOperatorHotSpot1423.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.text.StrMatcher.NONE_MATCHER));
        } 
        if ((chars.length()) == 1) {
            return ((_returnReplacementOperatorHotSpot1424.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.text.StrMatcher.CharMatcher(chars.charAt(0))));
        } 
        return ((_returnReplacementOperatorHotSpot1425.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.text.StrMatcher.CharSetMatcher(chars.toCharArray())));
    }

    public static org.apache.commons.lang3.text.StrMatcher stringMatcher(final java.lang.String str) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
            return ((_returnReplacementOperatorHotSpot1433.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.text.StrMatcher.NONE_MATCHER));
        } 
        return ((_returnReplacementOperatorHotSpot1434.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.text.StrMatcher.StringMatcher(str)));
    }

    protected StrMatcher() {
        super();
    }

    public abstract int isMatch(char[] buffer, int pos, int bufferStart, int bufferEnd);

    public int isMatch(final char[] buffer, final int pos) {
        return ((_returnReplacementOperatorHotSpot1418.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1418.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1418.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (isMatch(buffer, pos, 0, buffer.length)));
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
            return ((_returnReplacementOperatorHotSpot1411.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1411.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1411.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : ((java.util.Arrays.binarySearch(chars, buffer[pos])) >= 0 ? 1 : 0));
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
            return ((_returnReplacementOperatorHotSpot1410.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1410.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1410.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : ((ch) == (buffer[pos]) ? 1 : 0));
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
                return ((_returnReplacementOperatorHotSpot1413.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1413.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1413.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (0));
            } 
            for (int i = 0 ; i < (chars.length) ; i++ , pos++) {
                if ((chars[i]) != (buffer[pos])) {
                    return ((_returnReplacementOperatorHotSpot1414.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1414.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1414.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (0));
                } 
            }
            return ((_returnReplacementOperatorHotSpot1415.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1415.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1415.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (len));
        }

        @java.lang.Override
        public java.lang.String toString() {
            return ((_returnReplacementOperatorHotSpot1416.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((super.toString()) + ' ') + (java.util.Arrays.toString(chars))));
        }
    }

    static final class NoMatcher extends org.apache.commons.lang3.text.StrMatcher {
        NoMatcher() {
            super();
        }

        @java.lang.Override
        public int isMatch(final char[] buffer, final int pos, final int bufferStart, final int bufferEnd) {
            return ((_returnReplacementOperatorHotSpot1412.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1412.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1412.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (0));
        }
    }

    static final class TrimMatcher extends org.apache.commons.lang3.text.StrMatcher {
        TrimMatcher() {
            super();
        }

        @java.lang.Override
        public int isMatch(final char[] buffer, final int pos, final int bufferStart, final int bufferEnd) {
            return ((_returnReplacementOperatorHotSpot1417.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1417.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1417.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : ((buffer[pos]) <= 32 ? 1 : 0));
        }
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1410 = metamutator.Selector.of(1410,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot1410");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1411 = metamutator.Selector.of(1411,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot1411");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1412 = metamutator.Selector.of(1412,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot1412");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1413 = metamutator.Selector.of(1413,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot1413");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1414 = metamutator.Selector.of(1414,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot1414");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1415 = metamutator.Selector.of(1415,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot1415");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1416 = metamutator.Selector.of(1416,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1416");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1417 = metamutator.Selector.of(1417,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot1417");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1418 = metamutator.Selector.of(1418,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperatorHotSpot1418");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1419 = metamutator.Selector.of(1419,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperatorHotSpot1419");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1420 = metamutator.Selector.of(1420,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperatorHotSpot1420");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1421 = metamutator.Selector.of(1421,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperatorHotSpot1421");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1422 = metamutator.Selector.of(1422,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperatorHotSpot1422");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1423 = metamutator.Selector.of(1423,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperatorHotSpot1423");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1424 = metamutator.Selector.of(1424,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperatorHotSpot1424");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1425 = metamutator.Selector.of(1425,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperatorHotSpot1425");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1426 = metamutator.Selector.of(1426,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperatorHotSpot1426");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1427 = metamutator.Selector.of(1427,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperatorHotSpot1427");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1428 = metamutator.Selector.of(1428,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperatorHotSpot1428");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1429 = metamutator.Selector.of(1429,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperatorHotSpot1429");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1430 = metamutator.Selector.of(1430,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperatorHotSpot1430");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1431 = metamutator.Selector.of(1431,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperatorHotSpot1431");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1432 = metamutator.Selector.of(1432,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperatorHotSpot1432");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1433 = metamutator.Selector.of(1433,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperatorHotSpot1433");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1434 = metamutator.Selector.of(1434,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperatorHotSpot1434");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1435 = metamutator.Selector.of(1435,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperatorHotSpot1435");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1436 = metamutator.Selector.of(1436,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrMatcher.class).id("_returnReplacementOperatorHotSpot1436");
}

