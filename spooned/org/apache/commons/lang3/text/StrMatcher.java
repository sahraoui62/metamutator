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
        return COMMA_MATCHER;
    }

    public static org.apache.commons.lang3.text.StrMatcher tabMatcher() {
        return TAB_MATCHER;
    }

    public static org.apache.commons.lang3.text.StrMatcher spaceMatcher() {
        return SPACE_MATCHER;
    }

    public static org.apache.commons.lang3.text.StrMatcher splitMatcher() {
        return SPLIT_MATCHER;
    }

    public static org.apache.commons.lang3.text.StrMatcher trimMatcher() {
        return TRIM_MATCHER;
    }

    public static org.apache.commons.lang3.text.StrMatcher singleQuoteMatcher() {
        return SINGLE_QUOTE_MATCHER;
    }

    public static org.apache.commons.lang3.text.StrMatcher doubleQuoteMatcher() {
        return DOUBLE_QUOTE_MATCHER;
    }

    public static org.apache.commons.lang3.text.StrMatcher quoteMatcher() {
        return QUOTE_MATCHER;
    }

    public static org.apache.commons.lang3.text.StrMatcher noneMatcher() {
        return NONE_MATCHER;
    }

    public static org.apache.commons.lang3.text.StrMatcher charMatcher(final char ch) {
        return new org.apache.commons.lang3.text.StrMatcher.CharMatcher(ch);
    }

    public static org.apache.commons.lang3.text.StrMatcher charSetMatcher(final char... chars) {
        if ((chars == null) || ((chars.length) == 0)) {
            return NONE_MATCHER;
        } 
        if ((chars.length) == 1) {
            return new org.apache.commons.lang3.text.StrMatcher.CharMatcher(chars[0]);
        } 
        return new org.apache.commons.lang3.text.StrMatcher.CharSetMatcher(chars);
    }

    public static org.apache.commons.lang3.text.StrMatcher charSetMatcher(final java.lang.String chars) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(chars)) {
            return NONE_MATCHER;
        } 
        if ((chars.length()) == 1) {
            return new org.apache.commons.lang3.text.StrMatcher.CharMatcher(chars.charAt(0));
        } 
        return new org.apache.commons.lang3.text.StrMatcher.CharSetMatcher(chars.toCharArray());
    }

    public static org.apache.commons.lang3.text.StrMatcher stringMatcher(final java.lang.String str) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
            return NONE_MATCHER;
        } 
        return new org.apache.commons.lang3.text.StrMatcher.StringMatcher(str);
    }

    protected StrMatcher() {
        super();
    }

    public abstract int isMatch(char[] buffer, int pos, int bufferStart, int bufferEnd);

    public int isMatch(final char[] buffer, final int pos) {
        return isMatch(buffer, pos, 0, buffer.length);
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
            return (java.util.Arrays.binarySearch(chars, buffer[pos])) >= 0 ? 1 : 0;
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
            return (ch) == (buffer[pos]) ? 1 : 0;
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
            if (((_arithmeticOperatorHotSpot247.is("PLUS")) ? ((pos + len)) : (_arithmeticOperatorHotSpot247.is("MINUS")) ? ((pos - len)) : (_arithmeticOperatorHotSpot247.is("MUL")) ? ((pos * len)) :  ((pos / len))) > bufferEnd) {
                return 0;
            } 
            for (int i = 0 ; i < (chars.length) ; i++ , pos++) {
                if ((chars[i]) != (buffer[pos])) {
                    return 0;
                } 
            }
            return len;
        }

        @java.lang.Override
        public java.lang.String toString() {
            return ((super.toString()) + ' ') + (java.util.Arrays.toString(chars));
        }
    }

    static final class NoMatcher extends org.apache.commons.lang3.text.StrMatcher {
        NoMatcher() {
            super();
        }

        @java.lang.Override
        public int isMatch(final char[] buffer, final int pos, final int bufferStart, final int bufferEnd) {
            return 0;
        }
    }

    static final class TrimMatcher extends org.apache.commons.lang3.text.StrMatcher {
        TrimMatcher() {
            super();
        }

        @java.lang.Override
        public int isMatch(final char[] buffer, final int pos, final int bufferStart, final int bufferEnd) {
            return (buffer[pos]) <= 32 ? 1 : 0;
        }
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot247 = metamutator.Selector.of(247,new String[]{"PLUS","MINUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot247");
}

