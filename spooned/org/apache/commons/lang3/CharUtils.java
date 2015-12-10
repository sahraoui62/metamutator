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
        return ((_returnReplacementOperator2543.is("NULL")) ? ( null ) : (java.lang.Character.valueOf(ch)));
    }

    public static java.lang.Character toCharacterObject(final java.lang.String str) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
            return ((_returnReplacementOperator2544.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator2545.is("NULL")) ? ( null ) : (java.lang.Character.valueOf(str.charAt(0))));
    }

    public static char toChar(final java.lang.Character ch) {
        if (ch == null) {
            throw new java.lang.IllegalArgumentException("The Character must not be null");
        } 
        return ((_returnReplacementOperator2530.is("NULL")) ? ( null ) : (ch.charValue()));
    }

    public static char toChar(final java.lang.Character ch, final char defaultValue) {
        if (ch == null) {
            return ((_returnReplacementOperator2531.is("NULL")) ? ( null ) : (defaultValue));
        } 
        return ((_returnReplacementOperator2532.is("NULL")) ? ( null ) : (ch.charValue()));
    }

    public static char toChar(final java.lang.String str) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("The String must not be empty");
        } 
        return ((_returnReplacementOperator2533.is("NULL")) ? ( null ) : (str.charAt(0)));
    }

    public static char toChar(final java.lang.String str, final char defaultValue) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
            return ((_returnReplacementOperator2534.is("NULL")) ? ( null ) : (defaultValue));
        } 
        return ((_returnReplacementOperator2535.is("NULL")) ? ( null ) : (str.charAt(0)));
    }

    public static int toIntValue(final char ch) {
        if ((org.apache.commons.lang3.CharUtils.isAsciiNumeric(ch)) == false) {
            throw new java.lang.IllegalArgumentException((("The character " + ch) + " is not in the range '0' - '9'"));
        } 
        return ((_returnReplacementOperator2537.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2537.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2537.is("ZERO")) ? ( 0 ) : (ch - 48));
    }

    public static int toIntValue(final char ch, final int defaultValue) {
        if ((org.apache.commons.lang3.CharUtils.isAsciiNumeric(ch)) == false) {
            return ((_returnReplacementOperator2538.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2538.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2538.is("ZERO")) ? ( 0 ) : (defaultValue));
        } 
        return ((_returnReplacementOperator2539.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2539.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2539.is("ZERO")) ? ( 0 ) : (ch - 48));
    }

    public static int toIntValue(final java.lang.Character ch) {
        if (ch == null) {
            throw new java.lang.IllegalArgumentException("The character must not be null");
        } 
        return ((_returnReplacementOperator2540.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2540.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2540.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.CharUtils.toIntValue(ch.charValue())));
    }

    public static int toIntValue(final java.lang.Character ch, final int defaultValue) {
        if (ch == null) {
            return ((_returnReplacementOperator2541.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2541.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2541.is("ZERO")) ? ( 0 ) : (defaultValue));
        } 
        return ((_returnReplacementOperator2542.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2542.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2542.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.CharUtils.toIntValue(ch.charValue(), defaultValue)));
    }

    public static java.lang.String toString(final char ch) {
        if (ch < 128) {
            return ((_returnReplacementOperator2546.is("NULL")) ? ( null ) : (org.apache.commons.lang3.CharUtils.CHAR_STRING_ARRAY[ch]));
        } 
        return ((_returnReplacementOperator2547.is("NULL")) ? ( null ) : (new java.lang.String(new char[]{ ch })));
    }

    public static java.lang.String toString(final java.lang.Character ch) {
        if (ch == null) {
            return ((_returnReplacementOperator2548.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator2549.is("NULL")) ? ( null ) : (org.apache.commons.lang3.CharUtils.toString(ch.charValue())));
    }

    public static java.lang.String unicodeEscaped(final char ch) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(6);
        sb.append("\\u");
        sb.append(HEX_DIGITS[((ch >> 12) & 15)]);
        sb.append(HEX_DIGITS[((ch >> 8) & 15)]);
        sb.append(HEX_DIGITS[((ch >> 4) & 15)]);
        sb.append(HEX_DIGITS[(ch & 15)]);
        return ((_returnReplacementOperator2550.is("NULL")) ? ( null ) : (sb.toString()));
    }

    public static java.lang.String unicodeEscaped(final java.lang.Character ch) {
        if (ch == null) {
            return ((_returnReplacementOperator2551.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator2552.is("NULL")) ? ( null ) : (org.apache.commons.lang3.CharUtils.unicodeEscaped(ch.charValue())));
    }

    public static boolean isAscii(final char ch) {
        return ((_returnReplacementOperator2522.is("NULL")) ? ( null ) : (ch < 128));
    }

    public static boolean isAsciiPrintable(final char ch) {
        return ((_returnReplacementOperator2529.is("NULL")) ? ( null ) : ((ch >= 32) && (ch < 127)));
    }

    public static boolean isAsciiControl(final char ch) {
        return ((_returnReplacementOperator2527.is("NULL")) ? ( null ) : ((ch < 32) || (ch == 127)));
    }

    public static boolean isAsciiAlpha(final char ch) {
        return ((_returnReplacementOperator2523.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper(ch)) || (org.apache.commons.lang3.CharUtils.isAsciiAlphaLower(ch))));
    }

    public static boolean isAsciiAlphaUpper(final char ch) {
        return ((_returnReplacementOperator2525.is("NULL")) ? ( null ) : ((ch >= 'A') && (ch <= 'Z')));
    }

    public static boolean isAsciiAlphaLower(final char ch) {
        return ((_returnReplacementOperator2524.is("NULL")) ? ( null ) : ((ch >= 'a') && (ch <= 'z')));
    }

    public static boolean isAsciiNumeric(final char ch) {
        return ((_returnReplacementOperator2528.is("NULL")) ? ( null ) : ((ch >= '0') && (ch <= '9')));
    }

    public static boolean isAsciiAlphanumeric(final char ch) {
        return ((_returnReplacementOperator2526.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.CharUtils.isAsciiAlpha(ch)) || (org.apache.commons.lang3.CharUtils.isAsciiNumeric(ch))));
    }

    public static int compare(char x, char y) {
        return ((_returnReplacementOperator2536.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2536.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2536.is("ZERO")) ? ( 0 ) : (x - y));
    }

    private static final metamutator.Selector _returnReplacementOperator2522 = metamutator.Selector.of(2522,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperator2522");

    private static final metamutator.Selector _returnReplacementOperator2523 = metamutator.Selector.of(2523,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperator2523");

    private static final metamutator.Selector _returnReplacementOperator2524 = metamutator.Selector.of(2524,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperator2524");

    private static final metamutator.Selector _returnReplacementOperator2525 = metamutator.Selector.of(2525,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperator2525");

    private static final metamutator.Selector _returnReplacementOperator2526 = metamutator.Selector.of(2526,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperator2526");

    private static final metamutator.Selector _returnReplacementOperator2527 = metamutator.Selector.of(2527,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperator2527");

    private static final metamutator.Selector _returnReplacementOperator2528 = metamutator.Selector.of(2528,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperator2528");

    private static final metamutator.Selector _returnReplacementOperator2529 = metamutator.Selector.of(2529,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperator2529");

    private static final metamutator.Selector _returnReplacementOperator2530 = metamutator.Selector.of(2530,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperator2530");

    private static final metamutator.Selector _returnReplacementOperator2531 = metamutator.Selector.of(2531,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperator2531");

    private static final metamutator.Selector _returnReplacementOperator2532 = metamutator.Selector.of(2532,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperator2532");

    private static final metamutator.Selector _returnReplacementOperator2533 = metamutator.Selector.of(2533,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperator2533");

    private static final metamutator.Selector _returnReplacementOperator2534 = metamutator.Selector.of(2534,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperator2534");

    private static final metamutator.Selector _returnReplacementOperator2535 = metamutator.Selector.of(2535,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperator2535");

    private static final metamutator.Selector _returnReplacementOperator2536 = metamutator.Selector.of(2536,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperator2536");

    private static final metamutator.Selector _returnReplacementOperator2537 = metamutator.Selector.of(2537,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperator2537");

    private static final metamutator.Selector _returnReplacementOperator2538 = metamutator.Selector.of(2538,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperator2538");

    private static final metamutator.Selector _returnReplacementOperator2539 = metamutator.Selector.of(2539,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperator2539");

    private static final metamutator.Selector _returnReplacementOperator2540 = metamutator.Selector.of(2540,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperator2540");

    private static final metamutator.Selector _returnReplacementOperator2541 = metamutator.Selector.of(2541,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperator2541");

    private static final metamutator.Selector _returnReplacementOperator2542 = metamutator.Selector.of(2542,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperator2542");

    private static final metamutator.Selector _returnReplacementOperator2543 = metamutator.Selector.of(2543,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperator2543");

    private static final metamutator.Selector _returnReplacementOperator2544 = metamutator.Selector.of(2544,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperator2544");

    private static final metamutator.Selector _returnReplacementOperator2545 = metamutator.Selector.of(2545,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperator2545");

    private static final metamutator.Selector _returnReplacementOperator2546 = metamutator.Selector.of(2546,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperator2546");

    private static final metamutator.Selector _returnReplacementOperator2547 = metamutator.Selector.of(2547,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperator2547");

    private static final metamutator.Selector _returnReplacementOperator2548 = metamutator.Selector.of(2548,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperator2548");

    private static final metamutator.Selector _returnReplacementOperator2549 = metamutator.Selector.of(2549,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperator2549");

    private static final metamutator.Selector _returnReplacementOperator2550 = metamutator.Selector.of(2550,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperator2550");

    private static final metamutator.Selector _returnReplacementOperator2551 = metamutator.Selector.of(2551,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperator2551");

    private static final metamutator.Selector _returnReplacementOperator2552 = metamutator.Selector.of(2552,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperator2552");
}

