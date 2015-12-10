package org.apache.commons.lang3;


public class CharUtils {
    private static final java.lang.String[] CHAR_STRING_ARRAY = new java.lang.String[128];

    private static final char[] HEX_DIGITS = new char[]{ '0' , '1' , '2' , '3' , '4' , '5' , '6' , '7' , '8' , '9' , 'a' , 'b' , 'c' , 'd' , 'e' , 'f' };

    public static final char LF = '\n';

    public static final char CR = '\r';

    static {
        for (char c = 0 ; c < (CHAR_STRING_ARRAY.length) ; c++) {
            CHAR_STRING_ARRAY[c] = java.lang.String.valueOf(c);
        }
    }

    public CharUtils() {
        super();
    }

    @java.lang.Deprecated
    public static java.lang.Character toCharacterObject(final char ch) {
        return java.lang.Character.valueOf(ch);
    }

    public static java.lang.Character toCharacterObject(final java.lang.String str) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
            return null;
        } 
        return java.lang.Character.valueOf(str.charAt(0));
    }

    public static char toChar(final java.lang.Character ch) {
        if (ch == null) {
            throw new java.lang.IllegalArgumentException("The Character must not be null");
        } 
        return ch.charValue();
    }

    public static char toChar(final java.lang.Character ch, final char defaultValue) {
        if (ch == null) {
            return defaultValue;
        } 
        return ch.charValue();
    }

    public static char toChar(final java.lang.String str) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("The String must not be empty");
        } 
        return str.charAt(0);
    }

    public static char toChar(final java.lang.String str, final char defaultValue) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
            return defaultValue;
        } 
        return str.charAt(0);
    }

    public static int toIntValue(final char ch) {
        if ((org.apache.commons.lang3.CharUtils.isAsciiNumeric(ch)) == false) {
            throw new java.lang.IllegalArgumentException((("The character " + ch) + " is not in the range '0' - '9'"));
        } 
        return ((_arithmeticOperatorHotSpot526.is("PLUS")) ? (ch + 48) : (_arithmeticOperatorHotSpot526.is("MINUS")) ? (ch - 48) : (_arithmeticOperatorHotSpot526.is("MUL")) ? (ch * 48) :  (ch / 48));
    }

    public static int toIntValue(final char ch, final int defaultValue) {
        if ((org.apache.commons.lang3.CharUtils.isAsciiNumeric(ch)) == false) {
            return defaultValue;
        } 
        return ((_arithmeticOperatorHotSpot527.is("PLUS")) ? (ch + 48) : (_arithmeticOperatorHotSpot527.is("MINUS")) ? (ch - 48) : (_arithmeticOperatorHotSpot527.is("MUL")) ? (ch * 48) :  (ch / 48));
    }

    public static int toIntValue(final java.lang.Character ch) {
        if (ch == null) {
            throw new java.lang.IllegalArgumentException("The character must not be null");
        } 
        return org.apache.commons.lang3.CharUtils.toIntValue(ch.charValue());
    }

    public static int toIntValue(final java.lang.Character ch, final int defaultValue) {
        if (ch == null) {
            return defaultValue;
        } 
        return org.apache.commons.lang3.CharUtils.toIntValue(ch.charValue(), defaultValue);
    }

    public static java.lang.String toString(final char ch) {
        if (ch < 128) {
            return CHAR_STRING_ARRAY[ch];
        } 
        return new java.lang.String(new char[]{ ch });
    }

    public static java.lang.String toString(final java.lang.Character ch) {
        if (ch == null) {
            return null;
        } 
        return org.apache.commons.lang3.CharUtils.toString(ch.charValue());
    }

    public static java.lang.String unicodeEscaped(final char ch) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(6);
        sb.append("\\u");
        sb.append(HEX_DIGITS[((ch >> 12) & 15)]);
        sb.append(HEX_DIGITS[((ch >> 8) & 15)]);
        sb.append(HEX_DIGITS[((ch >> 4) & 15)]);
        sb.append(HEX_DIGITS[(ch & 15)]);
        return sb.toString();
    }

    public static java.lang.String unicodeEscaped(final java.lang.Character ch) {
        if (ch == null) {
            return null;
        } 
        return org.apache.commons.lang3.CharUtils.unicodeEscaped(ch.charValue());
    }

    public static boolean isAscii(final char ch) {
        return ch < 128;
    }

    public static boolean isAsciiPrintable(final char ch) {
        return (ch >= 32) && (ch < 127);
    }

    public static boolean isAsciiControl(final char ch) {
        return (ch < 32) || (ch == 127);
    }

    public static boolean isAsciiAlpha(final char ch) {
        return (org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper(ch)) || (org.apache.commons.lang3.CharUtils.isAsciiAlphaLower(ch));
    }

    public static boolean isAsciiAlphaUpper(final char ch) {
        return (ch >= 'A') && (ch <= 'Z');
    }

    public static boolean isAsciiAlphaLower(final char ch) {
        return (ch >= 'a') && (ch <= 'z');
    }

    public static boolean isAsciiNumeric(final char ch) {
        return (ch >= '0') && (ch <= '9');
    }

    public static boolean isAsciiAlphanumeric(final char ch) {
        return (org.apache.commons.lang3.CharUtils.isAsciiAlpha(ch)) || (org.apache.commons.lang3.CharUtils.isAsciiNumeric(ch));
    }

    public static int compare(char x, char y) {
        return ((_arithmeticOperatorHotSpot525.is("PLUS")) ? (x + y) : (_arithmeticOperatorHotSpot525.is("MINUS")) ? (x - y) : (_arithmeticOperatorHotSpot525.is("MUL")) ? (x * y) :  (x / y));
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot525 = metamutator.Selector.of(525,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.CharUtils.class).id("_arithmeticOperatorHotSpot525");

    private static final metamutator.Selector _arithmeticOperatorHotSpot526 = metamutator.Selector.of(526,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.CharUtils.class).id("_arithmeticOperatorHotSpot526");

    private static final metamutator.Selector _arithmeticOperatorHotSpot527 = metamutator.Selector.of(527,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.CharUtils.class).id("_arithmeticOperatorHotSpot527");
}

