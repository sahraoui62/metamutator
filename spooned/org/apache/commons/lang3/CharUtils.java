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
        return ((_returnReplacementOperatorHotSpot2543.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Character.valueOf(ch)));
    }

    public static java.lang.Character toCharacterObject(final java.lang.String str) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
            return ((_returnReplacementOperatorHotSpot2544.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperatorHotSpot2545.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Character.valueOf(str.charAt(0))));
    }

    public static char toChar(final java.lang.Character ch) {
        if (ch == null) {
            throw new java.lang.IllegalArgumentException("The Character must not be null");
        } 
        return ((_returnReplacementOperatorHotSpot2530.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (ch.charValue()));
    }

    public static char toChar(final java.lang.Character ch, final char defaultValue) {
        if (ch == null) {
            return ((_returnReplacementOperatorHotSpot2531.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (defaultValue));
        } 
        return ((_returnReplacementOperatorHotSpot2532.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (ch.charValue()));
    }

    public static char toChar(final java.lang.String str) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("The String must not be empty");
        } 
        return ((_returnReplacementOperatorHotSpot2533.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (str.charAt(0)));
    }

    public static char toChar(final java.lang.String str, final char defaultValue) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
            return ((_returnReplacementOperatorHotSpot2534.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (defaultValue));
        } 
        return ((_returnReplacementOperatorHotSpot2535.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (str.charAt(0)));
    }

    public static int toIntValue(final char ch) {
        if ((org.apache.commons.lang3.CharUtils.isAsciiNumeric(ch)) == false) {
            throw new java.lang.IllegalArgumentException((("The character " + ch) + " is not in the range '0' - '9'"));
        } 
        return ((_returnReplacementOperatorHotSpot2537.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2537.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2537.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (ch - 48));
    }

    public static int toIntValue(final char ch, final int defaultValue) {
        if ((org.apache.commons.lang3.CharUtils.isAsciiNumeric(ch)) == false) {
            return ((_returnReplacementOperatorHotSpot2538.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2538.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2538.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (defaultValue));
        } 
        return ((_returnReplacementOperatorHotSpot2539.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2539.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2539.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (ch - 48));
    }

    public static int toIntValue(final java.lang.Character ch) {
        if (ch == null) {
            throw new java.lang.IllegalArgumentException("The character must not be null");
        } 
        return ((_returnReplacementOperatorHotSpot2540.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2540.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2540.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.CharUtils.toIntValue(ch.charValue())));
    }

    public static int toIntValue(final java.lang.Character ch, final int defaultValue) {
        if (ch == null) {
            return ((_returnReplacementOperatorHotSpot2541.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2541.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2541.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (defaultValue));
        } 
        return ((_returnReplacementOperatorHotSpot2542.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2542.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2542.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.CharUtils.toIntValue(ch.charValue(), defaultValue)));
    }

    public static java.lang.String toString(final char ch) {
        if (ch < 128) {
            return ((_returnReplacementOperatorHotSpot2546.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.CharUtils.CHAR_STRING_ARRAY[ch]));
        } 
        return ((_returnReplacementOperatorHotSpot2547.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new java.lang.String(new char[]{ ch })));
    }

    public static java.lang.String toString(final java.lang.Character ch) {
        if (ch == null) {
            return ((_returnReplacementOperatorHotSpot2548.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperatorHotSpot2549.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.CharUtils.toString(ch.charValue())));
    }

    public static java.lang.String unicodeEscaped(final char ch) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(6);
        sb.append("\\u");
        sb.append(HEX_DIGITS[((ch >> 12) & 15)]);
        sb.append(HEX_DIGITS[((ch >> 8) & 15)]);
        sb.append(HEX_DIGITS[((ch >> 4) & 15)]);
        sb.append(HEX_DIGITS[(ch & 15)]);
        return ((_returnReplacementOperatorHotSpot2550.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (sb.toString()));
    }

    public static java.lang.String unicodeEscaped(final java.lang.Character ch) {
        if (ch == null) {
            return ((_returnReplacementOperatorHotSpot2551.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperatorHotSpot2552.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.CharUtils.unicodeEscaped(ch.charValue())));
    }

    public static boolean isAscii(final char ch) {
        return ((_returnReplacementOperatorHotSpot2522.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (ch < 128));
    }

    public static boolean isAsciiPrintable(final char ch) {
        return ((_returnReplacementOperatorHotSpot2529.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((ch >= 32) && (ch < 127)));
    }

    public static boolean isAsciiControl(final char ch) {
        return ((_returnReplacementOperatorHotSpot2527.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((ch < 32) || (ch == 127)));
    }

    public static boolean isAsciiAlpha(final char ch) {
        return ((_returnReplacementOperatorHotSpot2523.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper(ch)) || (org.apache.commons.lang3.CharUtils.isAsciiAlphaLower(ch))));
    }

    public static boolean isAsciiAlphaUpper(final char ch) {
        return ((_returnReplacementOperatorHotSpot2525.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((ch >= 'A') && (ch <= 'Z')));
    }

    public static boolean isAsciiAlphaLower(final char ch) {
        return ((_returnReplacementOperatorHotSpot2524.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((ch >= 'a') && (ch <= 'z')));
    }

    public static boolean isAsciiNumeric(final char ch) {
        return ((_returnReplacementOperatorHotSpot2528.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((ch >= '0') && (ch <= '9')));
    }

    public static boolean isAsciiAlphanumeric(final char ch) {
        return ((_returnReplacementOperatorHotSpot2526.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.CharUtils.isAsciiAlpha(ch)) || (org.apache.commons.lang3.CharUtils.isAsciiNumeric(ch))));
    }

    public static int compare(char x, char y) {
        return ((_returnReplacementOperatorHotSpot2536.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2536.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2536.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (x - y));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2522 = metamutator.Selector.of(2522,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperatorHotSpot2522");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2523 = metamutator.Selector.of(2523,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperatorHotSpot2523");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2524 = metamutator.Selector.of(2524,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperatorHotSpot2524");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2525 = metamutator.Selector.of(2525,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperatorHotSpot2525");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2526 = metamutator.Selector.of(2526,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperatorHotSpot2526");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2527 = metamutator.Selector.of(2527,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperatorHotSpot2527");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2528 = metamutator.Selector.of(2528,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperatorHotSpot2528");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2529 = metamutator.Selector.of(2529,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperatorHotSpot2529");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2530 = metamutator.Selector.of(2530,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperatorHotSpot2530");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2531 = metamutator.Selector.of(2531,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperatorHotSpot2531");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2532 = metamutator.Selector.of(2532,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperatorHotSpot2532");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2533 = metamutator.Selector.of(2533,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperatorHotSpot2533");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2534 = metamutator.Selector.of(2534,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperatorHotSpot2534");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2535 = metamutator.Selector.of(2535,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperatorHotSpot2535");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2536 = metamutator.Selector.of(2536,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperatorHotSpot2536");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2537 = metamutator.Selector.of(2537,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperatorHotSpot2537");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2538 = metamutator.Selector.of(2538,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperatorHotSpot2538");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2539 = metamutator.Selector.of(2539,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperatorHotSpot2539");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2540 = metamutator.Selector.of(2540,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperatorHotSpot2540");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2541 = metamutator.Selector.of(2541,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperatorHotSpot2541");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2542 = metamutator.Selector.of(2542,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperatorHotSpot2542");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2543 = metamutator.Selector.of(2543,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperatorHotSpot2543");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2544 = metamutator.Selector.of(2544,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperatorHotSpot2544");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2545 = metamutator.Selector.of(2545,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperatorHotSpot2545");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2546 = metamutator.Selector.of(2546,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperatorHotSpot2546");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2547 = metamutator.Selector.of(2547,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperatorHotSpot2547");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2548 = metamutator.Selector.of(2548,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperatorHotSpot2548");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2549 = metamutator.Selector.of(2549,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperatorHotSpot2549");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2550 = metamutator.Selector.of(2550,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperatorHotSpot2550");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2551 = metamutator.Selector.of(2551,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperatorHotSpot2551");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2552 = metamutator.Selector.of(2552,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharUtils.class).id("_returnReplacementOperatorHotSpot2552");
}

