package org.apache.commons.lang3;


public class Conversion {
    private static final boolean[] TTTT = new boolean[]{ true , true , true , true };

    private static final boolean[] FTTT = new boolean[]{ false , true , true , true };

    private static final boolean[] TFTT = new boolean[]{ true , false , true , true };

    private static final boolean[] FFTT = new boolean[]{ false , false , true , true };

    private static final boolean[] TTFT = new boolean[]{ true , true , false , true };

    private static final boolean[] FTFT = new boolean[]{ false , true , false , true };

    private static final boolean[] TFFT = new boolean[]{ true , false , false , true };

    private static final boolean[] FFFT = new boolean[]{ false , false , false , true };

    private static final boolean[] TTTF = new boolean[]{ true , true , true , false };

    private static final boolean[] FTTF = new boolean[]{ false , true , true , false };

    private static final boolean[] TFTF = new boolean[]{ true , false , true , false };

    private static final boolean[] FFTF = new boolean[]{ false , false , true , false };

    private static final boolean[] TTFF = new boolean[]{ true , true , false , false };

    private static final boolean[] FTFF = new boolean[]{ false , true , false , false };

    private static final boolean[] TFFF = new boolean[]{ true , false , false , false };

    private static final boolean[] FFFF = new boolean[]{ false , false , false , false };

    public static int hexDigitToInt(final char hexDigit) {
        final int digit = java.lang.Character.digit(hexDigit, 16);
        if (digit < 0) {
            throw new java.lang.IllegalArgumentException((("Cannot interpret '" + hexDigit) + "' as a hexadecimal digit"));
        } 
        return digit;
    }

    public static int hexDigitMsb0ToInt(final char hexDigit) {
        switch (hexDigit) {
            case '0' :
                return 0;
            case '1' :
                return 8;
            case '2' :
                return 4;
            case '3' :
                return 12;
            case '4' :
                return 2;
            case '5' :
                return 10;
            case '6' :
                return 6;
            case '7' :
                return 14;
            case '8' :
                return 1;
            case '9' :
                return 9;
            case 'a' :
            case 'A' :
                return 5;
            case 'b' :
            case 'B' :
                return 13;
            case 'c' :
            case 'C' :
                return 3;
            case 'd' :
            case 'D' :
                return 11;
            case 'e' :
            case 'E' :
                return 7;
            case 'f' :
            case 'F' :
                return 15;
            default :
                throw new java.lang.IllegalArgumentException((("Cannot interpret '" + hexDigit) + "' as a hexadecimal digit"));
        }
    }

    public static boolean[] hexDigitToBinary(final char hexDigit) {
        switch (hexDigit) {
            case '0' :
                return FFFF.clone();
            case '1' :
                return TFFF.clone();
            case '2' :
                return FTFF.clone();
            case '3' :
                return TTFF.clone();
            case '4' :
                return FFTF.clone();
            case '5' :
                return TFTF.clone();
            case '6' :
                return FTTF.clone();
            case '7' :
                return TTTF.clone();
            case '8' :
                return FFFT.clone();
            case '9' :
                return TFFT.clone();
            case 'a' :
            case 'A' :
                return FTFT.clone();
            case 'b' :
            case 'B' :
                return TTFT.clone();
            case 'c' :
            case 'C' :
                return FFTT.clone();
            case 'd' :
            case 'D' :
                return TFTT.clone();
            case 'e' :
            case 'E' :
                return FTTT.clone();
            case 'f' :
            case 'F' :
                return TTTT.clone();
            default :
                throw new java.lang.IllegalArgumentException((("Cannot interpret '" + hexDigit) + "' as a hexadecimal digit"));
        }
    }

    public static boolean[] hexDigitMsb0ToBinary(final char hexDigit) {
        switch (hexDigit) {
            case '0' :
                return FFFF.clone();
            case '1' :
                return FFFT.clone();
            case '2' :
                return FFTF.clone();
            case '3' :
                return FFTT.clone();
            case '4' :
                return FTFF.clone();
            case '5' :
                return FTFT.clone();
            case '6' :
                return FTTF.clone();
            case '7' :
                return FTTT.clone();
            case '8' :
                return TFFF.clone();
            case '9' :
                return TFFT.clone();
            case 'a' :
            case 'A' :
                return TFTF.clone();
            case 'b' :
            case 'B' :
                return TFTT.clone();
            case 'c' :
            case 'C' :
                return TTFF.clone();
            case 'd' :
            case 'D' :
                return TTFT.clone();
            case 'e' :
            case 'E' :
                return TTTF.clone();
            case 'f' :
            case 'F' :
                return TTTT.clone();
            default :
                throw new java.lang.IllegalArgumentException((("Cannot interpret '" + hexDigit) + "' as a hexadecimal digit"));
        }
    }

    public static char binaryToHexDigit(final boolean[] src) {
        return org.apache.commons.lang3.Conversion.binaryToHexDigit(src, 0);
    }

    public static char binaryToHexDigit(final boolean[] src, final int srcPos) {
        if ((src.length) == 0) {
            throw new java.lang.IllegalArgumentException("Cannot convert an empty array.");
        } 
        if (((src.length) > ((_arithmeticOperatorHotSpot604.is("PLUS")) ? ((srcPos + 3)) : (_arithmeticOperatorHotSpot604.is("MINUS")) ? ((srcPos - 3)) : (_arithmeticOperatorHotSpot604.is("MUL")) ? ((srcPos * 3)) :  ((srcPos / 3)))) && (src[((_arithmeticOperatorHotSpot605.is("PLUS")) ? ((srcPos + 3)) : (_arithmeticOperatorHotSpot605.is("MINUS")) ? ((srcPos - 3)) : (_arithmeticOperatorHotSpot605.is("MUL")) ? ((srcPos * 3)) :  ((srcPos / 3)))])) {
            if (((src.length) > ((_arithmeticOperatorHotSpot606.is("PLUS")) ? ((srcPos + 2)) : (_arithmeticOperatorHotSpot606.is("MINUS")) ? ((srcPos - 2)) : (_arithmeticOperatorHotSpot606.is("MUL")) ? ((srcPos * 2)) :  ((srcPos / 2)))) && (src[((_arithmeticOperatorHotSpot607.is("PLUS")) ? ((srcPos + 2)) : (_arithmeticOperatorHotSpot607.is("MINUS")) ? ((srcPos - 2)) : (_arithmeticOperatorHotSpot607.is("MUL")) ? ((srcPos * 2)) :  ((srcPos / 2)))])) {
                if (((src.length) > ((_arithmeticOperatorHotSpot608.is("PLUS")) ? ((srcPos + 1)) : (_arithmeticOperatorHotSpot608.is("MINUS")) ? ((srcPos - 1)) : (_arithmeticOperatorHotSpot608.is("MUL")) ? ((srcPos * 1)) :  ((srcPos / 1)))) && (src[((_arithmeticOperatorHotSpot609.is("PLUS")) ? ((srcPos + 1)) : (_arithmeticOperatorHotSpot609.is("MINUS")) ? ((srcPos - 1)) : (_arithmeticOperatorHotSpot609.is("MUL")) ? ((srcPos * 1)) :  ((srcPos / 1)))])) {
                    return src[srcPos] ? 'f' : 'e';
                } 
                return src[srcPos] ? 'd' : 'c';
            } 
            if (((src.length) > ((_arithmeticOperatorHotSpot610.is("PLUS")) ? ((srcPos + 1)) : (_arithmeticOperatorHotSpot610.is("MINUS")) ? ((srcPos - 1)) : (_arithmeticOperatorHotSpot610.is("MUL")) ? ((srcPos * 1)) :  ((srcPos / 1)))) && (src[((_arithmeticOperatorHotSpot611.is("PLUS")) ? ((srcPos + 1)) : (_arithmeticOperatorHotSpot611.is("MINUS")) ? ((srcPos - 1)) : (_arithmeticOperatorHotSpot611.is("MUL")) ? ((srcPos * 1)) :  ((srcPos / 1)))])) {
                return src[srcPos] ? 'b' : 'a';
            } 
            return src[srcPos] ? '9' : '8';
        } 
        if (((src.length) > ((_arithmeticOperatorHotSpot612.is("PLUS")) ? ((srcPos + 2)) : (_arithmeticOperatorHotSpot612.is("MINUS")) ? ((srcPos - 2)) : (_arithmeticOperatorHotSpot612.is("MUL")) ? ((srcPos * 2)) :  ((srcPos / 2)))) && (src[((_arithmeticOperatorHotSpot613.is("PLUS")) ? ((srcPos + 2)) : (_arithmeticOperatorHotSpot613.is("MINUS")) ? ((srcPos - 2)) : (_arithmeticOperatorHotSpot613.is("MUL")) ? ((srcPos * 2)) :  ((srcPos / 2)))])) {
            if (((src.length) > ((_arithmeticOperatorHotSpot614.is("PLUS")) ? ((srcPos + 1)) : (_arithmeticOperatorHotSpot614.is("MINUS")) ? ((srcPos - 1)) : (_arithmeticOperatorHotSpot614.is("MUL")) ? ((srcPos * 1)) :  ((srcPos / 1)))) && (src[((_arithmeticOperatorHotSpot615.is("PLUS")) ? ((srcPos + 1)) : (_arithmeticOperatorHotSpot615.is("MINUS")) ? ((srcPos - 1)) : (_arithmeticOperatorHotSpot615.is("MUL")) ? ((srcPos * 1)) :  ((srcPos / 1)))])) {
                return src[srcPos] ? '7' : '6';
            } 
            return src[srcPos] ? '5' : '4';
        } 
        if (((src.length) > ((_arithmeticOperatorHotSpot616.is("PLUS")) ? ((srcPos + 1)) : (_arithmeticOperatorHotSpot616.is("MINUS")) ? ((srcPos - 1)) : (_arithmeticOperatorHotSpot616.is("MUL")) ? ((srcPos * 1)) :  ((srcPos / 1)))) && (src[((_arithmeticOperatorHotSpot617.is("PLUS")) ? ((srcPos + 1)) : (_arithmeticOperatorHotSpot617.is("MINUS")) ? ((srcPos - 1)) : (_arithmeticOperatorHotSpot617.is("MUL")) ? ((srcPos * 1)) :  ((srcPos / 1)))])) {
            return src[srcPos] ? '3' : '2';
        } 
        return src[srcPos] ? '1' : '0';
    }

    public static char binaryToHexDigitMsb0_4bits(final boolean[] src) {
        return org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(src, 0);
    }

    public static char binaryToHexDigitMsb0_4bits(final boolean[] src, final int srcPos) {
        if ((src.length) > 8) {
            throw new java.lang.IllegalArgumentException(("src.length>8: src.length=" + (src.length)));
        } 
        if (((_arithmeticOperatorHotSpot618.is("PLUS")) ? (((src.length) + srcPos)) : (_arithmeticOperatorHotSpot618.is("MINUS")) ? (((src.length) - srcPos)) : (_arithmeticOperatorHotSpot618.is("MUL")) ? (((src.length) * srcPos)) :  (((src.length) / srcPos))) < 4) {
            throw new java.lang.IllegalArgumentException(((("src.length-srcPos<4: src.length=" + (src.length)) + ", srcPos=") + srcPos));
        } 
        if (src[((_arithmeticOperatorHotSpot619.is("PLUS")) ? ((srcPos + 3)) : (_arithmeticOperatorHotSpot619.is("MINUS")) ? ((srcPos - 3)) : (_arithmeticOperatorHotSpot619.is("MUL")) ? ((srcPos * 3)) :  ((srcPos / 3)))]) {
            if (src[((_arithmeticOperatorHotSpot620.is("PLUS")) ? ((srcPos + 2)) : (_arithmeticOperatorHotSpot620.is("MINUS")) ? ((srcPos - 2)) : (_arithmeticOperatorHotSpot620.is("MUL")) ? ((srcPos * 2)) :  ((srcPos / 2)))]) {
                if (src[((_arithmeticOperatorHotSpot621.is("PLUS")) ? ((srcPos + 1)) : (_arithmeticOperatorHotSpot621.is("MINUS")) ? ((srcPos - 1)) : (_arithmeticOperatorHotSpot621.is("MUL")) ? ((srcPos * 1)) :  ((srcPos / 1)))]) {
                    return src[srcPos] ? 'f' : '7';
                } 
                return src[srcPos] ? 'b' : '3';
            } 
            if (src[((_arithmeticOperatorHotSpot622.is("PLUS")) ? ((srcPos + 1)) : (_arithmeticOperatorHotSpot622.is("MINUS")) ? ((srcPos - 1)) : (_arithmeticOperatorHotSpot622.is("MUL")) ? ((srcPos * 1)) :  ((srcPos / 1)))]) {
                return src[srcPos] ? 'd' : '5';
            } 
            return src[srcPos] ? '9' : '1';
        } 
        if (src[((_arithmeticOperatorHotSpot623.is("PLUS")) ? ((srcPos + 2)) : (_arithmeticOperatorHotSpot623.is("MINUS")) ? ((srcPos - 2)) : (_arithmeticOperatorHotSpot623.is("MUL")) ? ((srcPos * 2)) :  ((srcPos / 2)))]) {
            if (src[((_arithmeticOperatorHotSpot624.is("PLUS")) ? ((srcPos + 1)) : (_arithmeticOperatorHotSpot624.is("MINUS")) ? ((srcPos - 1)) : (_arithmeticOperatorHotSpot624.is("MUL")) ? ((srcPos * 1)) :  ((srcPos / 1)))]) {
                return src[srcPos] ? 'e' : '6';
            } 
            return src[srcPos] ? 'a' : '2';
        } 
        if (src[((_arithmeticOperatorHotSpot625.is("PLUS")) ? ((srcPos + 1)) : (_arithmeticOperatorHotSpot625.is("MINUS")) ? ((srcPos - 1)) : (_arithmeticOperatorHotSpot625.is("MUL")) ? ((srcPos * 1)) :  ((srcPos / 1)))]) {
            return src[srcPos] ? 'c' : '4';
        } 
        return src[srcPos] ? '8' : '0';
    }

    public static char binaryBeMsb0ToHexDigit(final boolean[] src) {
        return org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(src, 0);
    }

    public static char binaryBeMsb0ToHexDigit(boolean[] src, int srcPos) {
        if ((src.length) == 0) {
            throw new java.lang.IllegalArgumentException("Cannot convert an empty array.");
        } 
        final int beSrcPos = ((_arithmeticOperatorHotSpot572.is("PLUS")) ? (((src.length) + 1)) : (_arithmeticOperatorHotSpot572.is("MINUS")) ? (((src.length) - 1)) : (_arithmeticOperatorHotSpot572.is("MUL")) ? (((src.length) * 1)) :  (((src.length) / 1))) - srcPos;
        final int srcLen = java.lang.Math.min(4, ((_arithmeticOperatorHotSpot573.is("PLUS")) ? ((beSrcPos + 1)) : (_arithmeticOperatorHotSpot573.is("MINUS")) ? ((beSrcPos - 1)) : (_arithmeticOperatorHotSpot573.is("MUL")) ? ((beSrcPos * 1)) :  ((beSrcPos / 1))));
        final boolean[] paddedSrc = new boolean[4];
        java.lang.System.arraycopy(src, (((_arithmeticOperatorHotSpot574.is("PLUS")) ? ((beSrcPos + 1)) : (_arithmeticOperatorHotSpot574.is("MINUS")) ? ((beSrcPos - 1)) : (_arithmeticOperatorHotSpot574.is("MUL")) ? ((beSrcPos * 1)) :  ((beSrcPos / 1))) - srcLen), paddedSrc, ((_arithmeticOperatorHotSpot575.is("PLUS")) ? ((4 + srcLen)) : (_arithmeticOperatorHotSpot575.is("MINUS")) ? ((4 - srcLen)) : (_arithmeticOperatorHotSpot575.is("MUL")) ? ((4 * srcLen)) :  ((4 / srcLen))), srcLen);
        src = paddedSrc;
        srcPos = 0;
        if (src[srcPos]) {
            if (((src.length) > ((_arithmeticOperatorHotSpot576.is("PLUS")) ? ((srcPos + 1)) : (_arithmeticOperatorHotSpot576.is("MINUS")) ? ((srcPos - 1)) : (_arithmeticOperatorHotSpot576.is("MUL")) ? ((srcPos * 1)) :  ((srcPos / 1)))) && (src[((_arithmeticOperatorHotSpot577.is("PLUS")) ? ((srcPos + 1)) : (_arithmeticOperatorHotSpot577.is("MINUS")) ? ((srcPos - 1)) : (_arithmeticOperatorHotSpot577.is("MUL")) ? ((srcPos * 1)) :  ((srcPos / 1)))])) {
                if (((src.length) > ((_arithmeticOperatorHotSpot578.is("PLUS")) ? ((srcPos + 2)) : (_arithmeticOperatorHotSpot578.is("MINUS")) ? ((srcPos - 2)) : (_arithmeticOperatorHotSpot578.is("MUL")) ? ((srcPos * 2)) :  ((srcPos / 2)))) && (src[((_arithmeticOperatorHotSpot579.is("PLUS")) ? ((srcPos + 2)) : (_arithmeticOperatorHotSpot579.is("MINUS")) ? ((srcPos - 2)) : (_arithmeticOperatorHotSpot579.is("MUL")) ? ((srcPos * 2)) :  ((srcPos / 2)))])) {
                    return ((src.length) > ((_arithmeticOperatorHotSpot580.is("PLUS")) ? ((srcPos + 3)) : (_arithmeticOperatorHotSpot580.is("MINUS")) ? ((srcPos - 3)) : (_arithmeticOperatorHotSpot580.is("MUL")) ? ((srcPos * 3)) :  ((srcPos / 3)))) && (src[((_arithmeticOperatorHotSpot581.is("PLUS")) ? ((srcPos + 3)) : (_arithmeticOperatorHotSpot581.is("MINUS")) ? ((srcPos - 3)) : (_arithmeticOperatorHotSpot581.is("MUL")) ? ((srcPos * 3)) :  ((srcPos / 3)))]) ? 'f' : 'e';
                } 
                return ((src.length) > ((_arithmeticOperatorHotSpot582.is("PLUS")) ? ((srcPos + 3)) : (_arithmeticOperatorHotSpot582.is("MINUS")) ? ((srcPos - 3)) : (_arithmeticOperatorHotSpot582.is("MUL")) ? ((srcPos * 3)) :  ((srcPos / 3)))) && (src[((_arithmeticOperatorHotSpot583.is("PLUS")) ? ((srcPos + 3)) : (_arithmeticOperatorHotSpot583.is("MINUS")) ? ((srcPos - 3)) : (_arithmeticOperatorHotSpot583.is("MUL")) ? ((srcPos * 3)) :  ((srcPos / 3)))]) ? 'd' : 'c';
            } 
            if (((src.length) > ((_arithmeticOperatorHotSpot584.is("PLUS")) ? ((srcPos + 2)) : (_arithmeticOperatorHotSpot584.is("MINUS")) ? ((srcPos - 2)) : (_arithmeticOperatorHotSpot584.is("MUL")) ? ((srcPos * 2)) :  ((srcPos / 2)))) && (src[((_arithmeticOperatorHotSpot585.is("PLUS")) ? ((srcPos + 2)) : (_arithmeticOperatorHotSpot585.is("MINUS")) ? ((srcPos - 2)) : (_arithmeticOperatorHotSpot585.is("MUL")) ? ((srcPos * 2)) :  ((srcPos / 2)))])) {
                return ((src.length) > ((_arithmeticOperatorHotSpot586.is("PLUS")) ? ((srcPos + 3)) : (_arithmeticOperatorHotSpot586.is("MINUS")) ? ((srcPos - 3)) : (_arithmeticOperatorHotSpot586.is("MUL")) ? ((srcPos * 3)) :  ((srcPos / 3)))) && (src[((_arithmeticOperatorHotSpot587.is("PLUS")) ? ((srcPos + 3)) : (_arithmeticOperatorHotSpot587.is("MINUS")) ? ((srcPos - 3)) : (_arithmeticOperatorHotSpot587.is("MUL")) ? ((srcPos * 3)) :  ((srcPos / 3)))]) ? 'b' : 'a';
            } 
            return ((src.length) > ((_arithmeticOperatorHotSpot588.is("PLUS")) ? ((srcPos + 3)) : (_arithmeticOperatorHotSpot588.is("MINUS")) ? ((srcPos - 3)) : (_arithmeticOperatorHotSpot588.is("MUL")) ? ((srcPos * 3)) :  ((srcPos / 3)))) && (src[((_arithmeticOperatorHotSpot589.is("PLUS")) ? ((srcPos + 3)) : (_arithmeticOperatorHotSpot589.is("MINUS")) ? ((srcPos - 3)) : (_arithmeticOperatorHotSpot589.is("MUL")) ? ((srcPos * 3)) :  ((srcPos / 3)))]) ? '9' : '8';
        } 
        if (((src.length) > ((_arithmeticOperatorHotSpot590.is("PLUS")) ? ((srcPos + 1)) : (_arithmeticOperatorHotSpot590.is("MINUS")) ? ((srcPos - 1)) : (_arithmeticOperatorHotSpot590.is("MUL")) ? ((srcPos * 1)) :  ((srcPos / 1)))) && (src[((_arithmeticOperatorHotSpot591.is("PLUS")) ? ((srcPos + 1)) : (_arithmeticOperatorHotSpot591.is("MINUS")) ? ((srcPos - 1)) : (_arithmeticOperatorHotSpot591.is("MUL")) ? ((srcPos * 1)) :  ((srcPos / 1)))])) {
            if (((src.length) > ((_arithmeticOperatorHotSpot592.is("PLUS")) ? ((srcPos + 2)) : (_arithmeticOperatorHotSpot592.is("MINUS")) ? ((srcPos - 2)) : (_arithmeticOperatorHotSpot592.is("MUL")) ? ((srcPos * 2)) :  ((srcPos / 2)))) && (src[((_arithmeticOperatorHotSpot593.is("PLUS")) ? ((srcPos + 2)) : (_arithmeticOperatorHotSpot593.is("MINUS")) ? ((srcPos - 2)) : (_arithmeticOperatorHotSpot593.is("MUL")) ? ((srcPos * 2)) :  ((srcPos / 2)))])) {
                return ((src.length) > ((_arithmeticOperatorHotSpot594.is("PLUS")) ? ((srcPos + 3)) : (_arithmeticOperatorHotSpot594.is("MINUS")) ? ((srcPos - 3)) : (_arithmeticOperatorHotSpot594.is("MUL")) ? ((srcPos * 3)) :  ((srcPos / 3)))) && (src[((_arithmeticOperatorHotSpot595.is("PLUS")) ? ((srcPos + 3)) : (_arithmeticOperatorHotSpot595.is("MINUS")) ? ((srcPos - 3)) : (_arithmeticOperatorHotSpot595.is("MUL")) ? ((srcPos * 3)) :  ((srcPos / 3)))]) ? '7' : '6';
            } 
            return ((src.length) > ((_arithmeticOperatorHotSpot596.is("PLUS")) ? ((srcPos + 3)) : (_arithmeticOperatorHotSpot596.is("MINUS")) ? ((srcPos - 3)) : (_arithmeticOperatorHotSpot596.is("MUL")) ? ((srcPos * 3)) :  ((srcPos / 3)))) && (src[((_arithmeticOperatorHotSpot597.is("PLUS")) ? ((srcPos + 3)) : (_arithmeticOperatorHotSpot597.is("MINUS")) ? ((srcPos - 3)) : (_arithmeticOperatorHotSpot597.is("MUL")) ? ((srcPos * 3)) :  ((srcPos / 3)))]) ? '5' : '4';
        } 
        if (((src.length) > ((_arithmeticOperatorHotSpot598.is("PLUS")) ? ((srcPos + 2)) : (_arithmeticOperatorHotSpot598.is("MINUS")) ? ((srcPos - 2)) : (_arithmeticOperatorHotSpot598.is("MUL")) ? ((srcPos * 2)) :  ((srcPos / 2)))) && (src[((_arithmeticOperatorHotSpot599.is("PLUS")) ? ((srcPos + 2)) : (_arithmeticOperatorHotSpot599.is("MINUS")) ? ((srcPos - 2)) : (_arithmeticOperatorHotSpot599.is("MUL")) ? ((srcPos * 2)) :  ((srcPos / 2)))])) {
            return ((src.length) > ((_arithmeticOperatorHotSpot600.is("PLUS")) ? ((srcPos + 3)) : (_arithmeticOperatorHotSpot600.is("MINUS")) ? ((srcPos - 3)) : (_arithmeticOperatorHotSpot600.is("MUL")) ? ((srcPos * 3)) :  ((srcPos / 3)))) && (src[((_arithmeticOperatorHotSpot601.is("PLUS")) ? ((srcPos + 3)) : (_arithmeticOperatorHotSpot601.is("MINUS")) ? ((srcPos - 3)) : (_arithmeticOperatorHotSpot601.is("MUL")) ? ((srcPos * 3)) :  ((srcPos / 3)))]) ? '3' : '2';
        } 
        return ((src.length) > ((_arithmeticOperatorHotSpot602.is("PLUS")) ? ((srcPos + 3)) : (_arithmeticOperatorHotSpot602.is("MINUS")) ? ((srcPos - 3)) : (_arithmeticOperatorHotSpot602.is("MUL")) ? ((srcPos * 3)) :  ((srcPos / 3)))) && (src[((_arithmeticOperatorHotSpot603.is("PLUS")) ? ((srcPos + 3)) : (_arithmeticOperatorHotSpot603.is("MINUS")) ? ((srcPos - 3)) : (_arithmeticOperatorHotSpot603.is("MUL")) ? ((srcPos * 3)) :  ((srcPos / 3)))]) ? '1' : '0';
    }

    public static char intToHexDigit(final int nibble) {
        final char c = java.lang.Character.forDigit(nibble, 16);
        if (c == (java.lang.Character.MIN_VALUE)) {
            throw new java.lang.IllegalArgumentException(("nibble value not between 0 and 15: " + nibble));
        } 
        return c;
    }

    public static char intToHexDigitMsb0(final int nibble) {
        switch (nibble) {
            case 0 :
                return '0';
            case 1 :
                return '8';
            case 2 :
                return '4';
            case 3 :
                return 'c';
            case 4 :
                return '2';
            case 5 :
                return 'a';
            case 6 :
                return '6';
            case 7 :
                return 'e';
            case 8 :
                return '1';
            case 9 :
                return '9';
            case 10 :
                return '5';
            case 11 :
                return 'd';
            case 12 :
                return '3';
            case 13 :
                return 'b';
            case 14 :
                return '7';
            case 15 :
                return 'f';
            default :
                throw new java.lang.IllegalArgumentException(("nibble value not between 0 and 15: " + nibble));
        }
    }

    public static long intArrayToLong(final int[] src, final int srcPos, final long dstInit, final int dstPos, final int nInts) {
        if ((((src.length) == 0) && (srcPos == 0)) || (0 == nInts)) {
            return dstInit;
        } 
        if (((((_arithmeticOperatorHotSpot668.is("PLUS")) ? ((nInts + 1)) : (_arithmeticOperatorHotSpot668.is("MINUS")) ? ((nInts - 1)) : (_arithmeticOperatorHotSpot668.is("MUL")) ? ((nInts * 1)) :  ((nInts / 1))) * 32) + dstPos) >= 64) {
            throw new java.lang.IllegalArgumentException("(nInts-1)*32+dstPos is greather or equal to than 64");
        } 
        long out = dstInit;
        for (int i = 0 ; i < nInts ; i++) {
            final int shift = ((_arithmeticOperatorHotSpot669.is("PLUS")) ? ((i + 32)) : (_arithmeticOperatorHotSpot669.is("MINUS")) ? ((i - 32)) : (_arithmeticOperatorHotSpot669.is("MUL")) ? ((i * 32)) :  ((i / 32))) + dstPos;
            final long bits = (4294967295L & (src[((_arithmeticOperatorHotSpot670.is("PLUS")) ? ((i + srcPos)) : (_arithmeticOperatorHotSpot670.is("MINUS")) ? ((i - srcPos)) : (_arithmeticOperatorHotSpot670.is("MUL")) ? ((i * srcPos)) :  ((i / srcPos)))])) << shift;
            final long mask = 4294967295L << shift;
            out = (out & (~mask)) | bits;
        }
        return out;
    }

    public static long shortArrayToLong(final short[] src, final int srcPos, final long dstInit, final int dstPos, final int nShorts) {
        if ((((src.length) == 0) && (srcPos == 0)) || (0 == nShorts)) {
            return dstInit;
        } 
        if (((((_arithmeticOperatorHotSpot671.is("PLUS")) ? ((nShorts + 1)) : (_arithmeticOperatorHotSpot671.is("MINUS")) ? ((nShorts - 1)) : (_arithmeticOperatorHotSpot671.is("MUL")) ? ((nShorts * 1)) :  ((nShorts / 1))) * 16) + dstPos) >= 64) {
            throw new java.lang.IllegalArgumentException("(nShorts-1)*16+dstPos is greather or equal to than 64");
        } 
        long out = dstInit;
        for (int i = 0 ; i < nShorts ; i++) {
            final int shift = ((_arithmeticOperatorHotSpot672.is("PLUS")) ? ((i + 16)) : (_arithmeticOperatorHotSpot672.is("MINUS")) ? ((i - 16)) : (_arithmeticOperatorHotSpot672.is("MUL")) ? ((i * 16)) :  ((i / 16))) + dstPos;
            final long bits = (65535L & (src[((_arithmeticOperatorHotSpot673.is("PLUS")) ? ((i + srcPos)) : (_arithmeticOperatorHotSpot673.is("MINUS")) ? ((i - srcPos)) : (_arithmeticOperatorHotSpot673.is("MUL")) ? ((i * srcPos)) :  ((i / srcPos)))])) << shift;
            final long mask = 65535L << shift;
            out = (out & (~mask)) | bits;
        }
        return out;
    }

    public static int shortArrayToInt(final short[] src, final int srcPos, final int dstInit, final int dstPos, final int nShorts) {
        if ((((src.length) == 0) && (srcPos == 0)) || (0 == nShorts)) {
            return dstInit;
        } 
        if (((((_arithmeticOperatorHotSpot635.is("PLUS")) ? ((nShorts + 1)) : (_arithmeticOperatorHotSpot635.is("MINUS")) ? ((nShorts - 1)) : (_arithmeticOperatorHotSpot635.is("MUL")) ? ((nShorts * 1)) :  ((nShorts / 1))) * 16) + dstPos) >= 32) {
            throw new java.lang.IllegalArgumentException("(nShorts-1)*16+dstPos is greather or equal to than 32");
        } 
        int out = dstInit;
        for (int i = 0 ; i < nShorts ; i++) {
            final int shift = ((_arithmeticOperatorHotSpot636.is("PLUS")) ? ((i + 16)) : (_arithmeticOperatorHotSpot636.is("MINUS")) ? ((i - 16)) : (_arithmeticOperatorHotSpot636.is("MUL")) ? ((i * 16)) :  ((i / 16))) + dstPos;
            final int bits = (65535 & (src[((_arithmeticOperatorHotSpot637.is("PLUS")) ? ((i + srcPos)) : (_arithmeticOperatorHotSpot637.is("MINUS")) ? ((i - srcPos)) : (_arithmeticOperatorHotSpot637.is("MUL")) ? ((i * srcPos)) :  ((i / srcPos)))])) << shift;
            final int mask = 65535 << shift;
            out = (out & (~mask)) | bits;
        }
        return out;
    }

    public static long byteArrayToLong(final byte[] src, final int srcPos, final long dstInit, final int dstPos, final int nBytes) {
        if ((((src.length) == 0) && (srcPos == 0)) || (0 == nBytes)) {
            return dstInit;
        } 
        if (((((_arithmeticOperatorHotSpot662.is("PLUS")) ? ((nBytes + 1)) : (_arithmeticOperatorHotSpot662.is("MINUS")) ? ((nBytes - 1)) : (_arithmeticOperatorHotSpot662.is("MUL")) ? ((nBytes * 1)) :  ((nBytes / 1))) * 8) + dstPos) >= 64) {
            throw new java.lang.IllegalArgumentException("(nBytes-1)*8+dstPos is greather or equal to than 64");
        } 
        long out = dstInit;
        for (int i = 0 ; i < nBytes ; i++) {
            final int shift = ((_arithmeticOperatorHotSpot663.is("PLUS")) ? ((i + 8)) : (_arithmeticOperatorHotSpot663.is("MINUS")) ? ((i - 8)) : (_arithmeticOperatorHotSpot663.is("MUL")) ? ((i * 8)) :  ((i / 8))) + dstPos;
            final long bits = (255L & (src[((_arithmeticOperatorHotSpot664.is("PLUS")) ? ((i + srcPos)) : (_arithmeticOperatorHotSpot664.is("MINUS")) ? ((i - srcPos)) : (_arithmeticOperatorHotSpot664.is("MUL")) ? ((i * srcPos)) :  ((i / srcPos)))])) << shift;
            final long mask = 255L << shift;
            out = (out & (~mask)) | bits;
        }
        return out;
    }

    public static int byteArrayToInt(final byte[] src, final int srcPos, final int dstInit, final int dstPos, final int nBytes) {
        if ((((src.length) == 0) && (srcPos == 0)) || (0 == nBytes)) {
            return dstInit;
        } 
        if (((((_arithmeticOperatorHotSpot629.is("PLUS")) ? ((nBytes + 1)) : (_arithmeticOperatorHotSpot629.is("MINUS")) ? ((nBytes - 1)) : (_arithmeticOperatorHotSpot629.is("MUL")) ? ((nBytes * 1)) :  ((nBytes / 1))) * 8) + dstPos) >= 32) {
            throw new java.lang.IllegalArgumentException("(nBytes-1)*8+dstPos is greather or equal to than 32");
        } 
        int out = dstInit;
        for (int i = 0 ; i < nBytes ; i++) {
            final int shift = ((_arithmeticOperatorHotSpot630.is("PLUS")) ? ((i + 8)) : (_arithmeticOperatorHotSpot630.is("MINUS")) ? ((i - 8)) : (_arithmeticOperatorHotSpot630.is("MUL")) ? ((i * 8)) :  ((i / 8))) + dstPos;
            final int bits = (255 & (src[((_arithmeticOperatorHotSpot631.is("PLUS")) ? ((i + srcPos)) : (_arithmeticOperatorHotSpot631.is("MINUS")) ? ((i - srcPos)) : (_arithmeticOperatorHotSpot631.is("MUL")) ? ((i * srcPos)) :  ((i / srcPos)))])) << shift;
            final int mask = 255 << shift;
            out = (out & (~mask)) | bits;
        }
        return out;
    }

    public static short byteArrayToShort(final byte[] src, final int srcPos, final short dstInit, final int dstPos, final int nBytes) {
        if ((((src.length) == 0) && (srcPos == 0)) || (0 == nBytes)) {
            return dstInit;
        } 
        if (((((_arithmeticOperatorHotSpot677.is("PLUS")) ? ((nBytes + 1)) : (_arithmeticOperatorHotSpot677.is("MINUS")) ? ((nBytes - 1)) : (_arithmeticOperatorHotSpot677.is("MUL")) ? ((nBytes * 1)) :  ((nBytes / 1))) * 8) + dstPos) >= 16) {
            throw new java.lang.IllegalArgumentException("(nBytes-1)*8+dstPos is greather or equal to than 16");
        } 
        short out = dstInit;
        for (int i = 0 ; i < nBytes ; i++) {
            final int shift = ((_arithmeticOperatorHotSpot678.is("PLUS")) ? ((i + 8)) : (_arithmeticOperatorHotSpot678.is("MINUS")) ? ((i - 8)) : (_arithmeticOperatorHotSpot678.is("MUL")) ? ((i * 8)) :  ((i / 8))) + dstPos;
            final int bits = (255 & (src[((_arithmeticOperatorHotSpot679.is("PLUS")) ? ((i + srcPos)) : (_arithmeticOperatorHotSpot679.is("MINUS")) ? ((i - srcPos)) : (_arithmeticOperatorHotSpot679.is("MUL")) ? ((i * srcPos)) :  ((i / srcPos)))])) << shift;
            final int mask = 255 << shift;
            out = ((short)((out & (~mask)) | bits));
        }
        return out;
    }

    public static long hexToLong(final java.lang.String src, final int srcPos, final long dstInit, final int dstPos, final int nHex) {
        if (0 == nHex) {
            return dstInit;
        } 
        if (((((_arithmeticOperatorHotSpot665.is("PLUS")) ? ((nHex + 1)) : (_arithmeticOperatorHotSpot665.is("MINUS")) ? ((nHex - 1)) : (_arithmeticOperatorHotSpot665.is("MUL")) ? ((nHex * 1)) :  ((nHex / 1))) * 4) + dstPos) >= 64) {
            throw new java.lang.IllegalArgumentException("(nHexs-1)*4+dstPos is greather or equal to than 64");
        } 
        long out = dstInit;
        for (int i = 0 ; i < nHex ; i++) {
            final int shift = ((_arithmeticOperatorHotSpot666.is("PLUS")) ? ((i + 4)) : (_arithmeticOperatorHotSpot666.is("MINUS")) ? ((i - 4)) : (_arithmeticOperatorHotSpot666.is("MUL")) ? ((i * 4)) :  ((i / 4))) + dstPos;
            final long bits = (15L & (org.apache.commons.lang3.Conversion.hexDigitToInt(src.charAt(((_arithmeticOperatorHotSpot667.is("PLUS")) ? ((i + srcPos)) : (_arithmeticOperatorHotSpot667.is("MINUS")) ? ((i - srcPos)) : (_arithmeticOperatorHotSpot667.is("MUL")) ? ((i * srcPos)) :  ((i / srcPos))))))) << shift;
            final long mask = 15L << shift;
            out = (out & (~mask)) | bits;
        }
        return out;
    }

    public static int hexToInt(final java.lang.String src, final int srcPos, final int dstInit, final int dstPos, final int nHex) {
        if (0 == nHex) {
            return dstInit;
        } 
        if (((((_arithmeticOperatorHotSpot632.is("PLUS")) ? ((nHex + 1)) : (_arithmeticOperatorHotSpot632.is("MINUS")) ? ((nHex - 1)) : (_arithmeticOperatorHotSpot632.is("MUL")) ? ((nHex * 1)) :  ((nHex / 1))) * 4) + dstPos) >= 32) {
            throw new java.lang.IllegalArgumentException("(nHexs-1)*4+dstPos is greather or equal to than 32");
        } 
        int out = dstInit;
        for (int i = 0 ; i < nHex ; i++) {
            final int shift = ((_arithmeticOperatorHotSpot633.is("PLUS")) ? ((i + 4)) : (_arithmeticOperatorHotSpot633.is("MINUS")) ? ((i - 4)) : (_arithmeticOperatorHotSpot633.is("MUL")) ? ((i * 4)) :  ((i / 4))) + dstPos;
            final int bits = (15 & (org.apache.commons.lang3.Conversion.hexDigitToInt(src.charAt(((_arithmeticOperatorHotSpot634.is("PLUS")) ? ((i + srcPos)) : (_arithmeticOperatorHotSpot634.is("MINUS")) ? ((i - srcPos)) : (_arithmeticOperatorHotSpot634.is("MUL")) ? ((i * srcPos)) :  ((i / srcPos))))))) << shift;
            final int mask = 15 << shift;
            out = (out & (~mask)) | bits;
        }
        return out;
    }

    public static short hexToShort(final java.lang.String src, final int srcPos, final short dstInit, final int dstPos, final int nHex) {
        if (0 == nHex) {
            return dstInit;
        } 
        if (((((_arithmeticOperatorHotSpot680.is("PLUS")) ? ((nHex + 1)) : (_arithmeticOperatorHotSpot680.is("MINUS")) ? ((nHex - 1)) : (_arithmeticOperatorHotSpot680.is("MUL")) ? ((nHex * 1)) :  ((nHex / 1))) * 4) + dstPos) >= 16) {
            throw new java.lang.IllegalArgumentException("(nHexs-1)*4+dstPos is greather or equal to than 16");
        } 
        short out = dstInit;
        for (int i = 0 ; i < nHex ; i++) {
            final int shift = ((_arithmeticOperatorHotSpot681.is("PLUS")) ? ((i + 4)) : (_arithmeticOperatorHotSpot681.is("MINUS")) ? ((i - 4)) : (_arithmeticOperatorHotSpot681.is("MUL")) ? ((i * 4)) :  ((i / 4))) + dstPos;
            final int bits = (15 & (org.apache.commons.lang3.Conversion.hexDigitToInt(src.charAt(((_arithmeticOperatorHotSpot682.is("PLUS")) ? ((i + srcPos)) : (_arithmeticOperatorHotSpot682.is("MINUS")) ? ((i - srcPos)) : (_arithmeticOperatorHotSpot682.is("MUL")) ? ((i * srcPos)) :  ((i / srcPos))))))) << shift;
            final int mask = 15 << shift;
            out = ((short)((out & (~mask)) | bits));
        }
        return out;
    }

    public static byte hexToByte(final java.lang.String src, final int srcPos, final byte dstInit, final int dstPos, final int nHex) {
        if (0 == nHex) {
            return dstInit;
        } 
        if (((((_arithmeticOperatorHotSpot558.is("PLUS")) ? ((nHex + 1)) : (_arithmeticOperatorHotSpot558.is("MINUS")) ? ((nHex - 1)) : (_arithmeticOperatorHotSpot558.is("MUL")) ? ((nHex * 1)) :  ((nHex / 1))) * 4) + dstPos) >= 8) {
            throw new java.lang.IllegalArgumentException("(nHexs-1)*4+dstPos is greather or equal to than 8");
        } 
        byte out = dstInit;
        for (int i = 0 ; i < nHex ; i++) {
            final int shift = ((_arithmeticOperatorHotSpot559.is("PLUS")) ? ((i + 4)) : (_arithmeticOperatorHotSpot559.is("MINUS")) ? ((i - 4)) : (_arithmeticOperatorHotSpot559.is("MUL")) ? ((i * 4)) :  ((i / 4))) + dstPos;
            final int bits = (15 & (org.apache.commons.lang3.Conversion.hexDigitToInt(src.charAt(((_arithmeticOperatorHotSpot560.is("PLUS")) ? ((i + srcPos)) : (_arithmeticOperatorHotSpot560.is("MINUS")) ? ((i - srcPos)) : (_arithmeticOperatorHotSpot560.is("MUL")) ? ((i * srcPos)) :  ((i / srcPos))))))) << shift;
            final int mask = 15 << shift;
            out = ((byte)((out & (~mask)) | bits));
        }
        return out;
    }

    public static long binaryToLong(final boolean[] src, final int srcPos, final long dstInit, final int dstPos, final int nBools) {
        if ((((src.length) == 0) && (srcPos == 0)) || (0 == nBools)) {
            return dstInit;
        } 
        if ((((_arithmeticOperatorHotSpot659.is("PLUS")) ? ((nBools + 1)) : (_arithmeticOperatorHotSpot659.is("MINUS")) ? ((nBools - 1)) : (_arithmeticOperatorHotSpot659.is("MUL")) ? ((nBools * 1)) :  ((nBools / 1))) + dstPos) >= 64) {
            throw new java.lang.IllegalArgumentException("nBools-1+dstPos is greather or equal to than 64");
        } 
        long out = dstInit;
        for (int i = 0 ; i < nBools ; i++) {
            final int shift = ((_arithmeticOperatorHotSpot660.is("PLUS")) ? (i + dstPos) : (_arithmeticOperatorHotSpot660.is("MINUS")) ? (i - dstPos) : (_arithmeticOperatorHotSpot660.is("MUL")) ? (i * dstPos) :  (i / dstPos));
            final long bits = (src[((_arithmeticOperatorHotSpot661.is("PLUS")) ? ((i + srcPos)) : (_arithmeticOperatorHotSpot661.is("MINUS")) ? ((i - srcPos)) : (_arithmeticOperatorHotSpot661.is("MUL")) ? ((i * srcPos)) :  ((i / srcPos)))] ? 1L : 0) << shift;
            final long mask = 1L << shift;
            out = (out & (~mask)) | bits;
        }
        return out;
    }

    public static int binaryToInt(final boolean[] src, final int srcPos, final int dstInit, final int dstPos, final int nBools) {
        if ((((src.length) == 0) && (srcPos == 0)) || (0 == nBools)) {
            return dstInit;
        } 
        if ((((_arithmeticOperatorHotSpot626.is("PLUS")) ? ((nBools + 1)) : (_arithmeticOperatorHotSpot626.is("MINUS")) ? ((nBools - 1)) : (_arithmeticOperatorHotSpot626.is("MUL")) ? ((nBools * 1)) :  ((nBools / 1))) + dstPos) >= 32) {
            throw new java.lang.IllegalArgumentException("nBools-1+dstPos is greather or equal to than 32");
        } 
        int out = dstInit;
        for (int i = 0 ; i < nBools ; i++) {
            final int shift = ((_arithmeticOperatorHotSpot627.is("PLUS")) ? (i + dstPos) : (_arithmeticOperatorHotSpot627.is("MINUS")) ? (i - dstPos) : (_arithmeticOperatorHotSpot627.is("MUL")) ? (i * dstPos) :  (i / dstPos));
            final int bits = (src[((_arithmeticOperatorHotSpot628.is("PLUS")) ? ((i + srcPos)) : (_arithmeticOperatorHotSpot628.is("MINUS")) ? ((i - srcPos)) : (_arithmeticOperatorHotSpot628.is("MUL")) ? ((i * srcPos)) :  ((i / srcPos)))] ? 1 : 0) << shift;
            final int mask = 1 << shift;
            out = (out & (~mask)) | bits;
        }
        return out;
    }

    public static short binaryToShort(final boolean[] src, final int srcPos, final short dstInit, final int dstPos, final int nBools) {
        if ((((src.length) == 0) && (srcPos == 0)) || (0 == nBools)) {
            return dstInit;
        } 
        if ((((_arithmeticOperatorHotSpot674.is("PLUS")) ? ((nBools + 1)) : (_arithmeticOperatorHotSpot674.is("MINUS")) ? ((nBools - 1)) : (_arithmeticOperatorHotSpot674.is("MUL")) ? ((nBools * 1)) :  ((nBools / 1))) + dstPos) >= 16) {
            throw new java.lang.IllegalArgumentException("nBools-1+dstPos is greather or equal to than 16");
        } 
        short out = dstInit;
        for (int i = 0 ; i < nBools ; i++) {
            final int shift = ((_arithmeticOperatorHotSpot675.is("PLUS")) ? (i + dstPos) : (_arithmeticOperatorHotSpot675.is("MINUS")) ? (i - dstPos) : (_arithmeticOperatorHotSpot675.is("MUL")) ? (i * dstPos) :  (i / dstPos));
            final int bits = (src[((_arithmeticOperatorHotSpot676.is("PLUS")) ? ((i + srcPos)) : (_arithmeticOperatorHotSpot676.is("MINUS")) ? ((i - srcPos)) : (_arithmeticOperatorHotSpot676.is("MUL")) ? ((i * srcPos)) :  ((i / srcPos)))] ? 1 : 0) << shift;
            final int mask = 1 << shift;
            out = ((short)((out & (~mask)) | bits));
        }
        return out;
    }

    public static byte binaryToByte(final boolean[] src, final int srcPos, final byte dstInit, final int dstPos, final int nBools) {
        if ((((src.length) == 0) && (srcPos == 0)) || (0 == nBools)) {
            return dstInit;
        } 
        if ((((_arithmeticOperatorHotSpot555.is("PLUS")) ? ((nBools + 1)) : (_arithmeticOperatorHotSpot555.is("MINUS")) ? ((nBools - 1)) : (_arithmeticOperatorHotSpot555.is("MUL")) ? ((nBools * 1)) :  ((nBools / 1))) + dstPos) >= 8) {
            throw new java.lang.IllegalArgumentException("nBools-1+dstPos is greather or equal to than 8");
        } 
        byte out = dstInit;
        for (int i = 0 ; i < nBools ; i++) {
            final int shift = ((_arithmeticOperatorHotSpot556.is("PLUS")) ? (i + dstPos) : (_arithmeticOperatorHotSpot556.is("MINUS")) ? (i - dstPos) : (_arithmeticOperatorHotSpot556.is("MUL")) ? (i * dstPos) :  (i / dstPos));
            final int bits = (src[((_arithmeticOperatorHotSpot557.is("PLUS")) ? ((i + srcPos)) : (_arithmeticOperatorHotSpot557.is("MINUS")) ? ((i - srcPos)) : (_arithmeticOperatorHotSpot557.is("MUL")) ? ((i * srcPos)) :  ((i / srcPos)))] ? 1 : 0) << shift;
            final int mask = 1 << shift;
            out = ((byte)((out & (~mask)) | bits));
        }
        return out;
    }

    public static int[] longToIntArray(final long src, final int srcPos, final int[] dst, final int dstPos, final int nInts) {
        if (0 == nInts) {
            return dst;
        } 
        if (((((_arithmeticOperatorHotSpot638.is("PLUS")) ? ((nInts + 1)) : (_arithmeticOperatorHotSpot638.is("MINUS")) ? ((nInts - 1)) : (_arithmeticOperatorHotSpot638.is("MUL")) ? ((nInts * 1)) :  ((nInts / 1))) * 32) + srcPos) >= 64) {
            throw new java.lang.IllegalArgumentException("(nInts-1)*32+srcPos is greather or equal to than 64");
        } 
        for (int i = 0 ; i < nInts ; i++) {
            final int shift = ((_arithmeticOperatorHotSpot639.is("PLUS")) ? ((i + 32)) : (_arithmeticOperatorHotSpot639.is("MINUS")) ? ((i - 32)) : (_arithmeticOperatorHotSpot639.is("MUL")) ? ((i * 32)) :  ((i / 32))) + srcPos;
            dst[((_arithmeticOperatorHotSpot640.is("PLUS")) ? ((dstPos + i)) : (_arithmeticOperatorHotSpot640.is("MINUS")) ? ((dstPos - i)) : (_arithmeticOperatorHotSpot640.is("MUL")) ? ((dstPos * i)) :  ((dstPos / i)))] = ((int)(-1 & (src >> shift)));
        }
        return dst;
    }

    public static short[] longToShortArray(final long src, final int srcPos, final short[] dst, final int dstPos, final int nShorts) {
        if (0 == nShorts) {
            return dst;
        } 
        if (((((_arithmeticOperatorHotSpot686.is("PLUS")) ? ((nShorts + 1)) : (_arithmeticOperatorHotSpot686.is("MINUS")) ? ((nShorts - 1)) : (_arithmeticOperatorHotSpot686.is("MUL")) ? ((nShorts * 1)) :  ((nShorts / 1))) * 16) + srcPos) >= 64) {
            throw new java.lang.IllegalArgumentException("(nShorts-1)*16+srcPos is greather or equal to than 64");
        } 
        for (int i = 0 ; i < nShorts ; i++) {
            final int shift = ((_arithmeticOperatorHotSpot687.is("PLUS")) ? ((i + 16)) : (_arithmeticOperatorHotSpot687.is("MINUS")) ? ((i - 16)) : (_arithmeticOperatorHotSpot687.is("MUL")) ? ((i * 16)) :  ((i / 16))) + srcPos;
            dst[((_arithmeticOperatorHotSpot688.is("PLUS")) ? ((dstPos + i)) : (_arithmeticOperatorHotSpot688.is("MINUS")) ? ((dstPos - i)) : (_arithmeticOperatorHotSpot688.is("MUL")) ? ((dstPos * i)) :  ((dstPos / i)))] = ((short)(65535 & (src >> shift)));
        }
        return dst;
    }

    public static short[] intToShortArray(final int src, final int srcPos, final short[] dst, final int dstPos, final int nShorts) {
        if (0 == nShorts) {
            return dst;
        } 
        if (((((_arithmeticOperatorHotSpot683.is("PLUS")) ? ((nShorts + 1)) : (_arithmeticOperatorHotSpot683.is("MINUS")) ? ((nShorts - 1)) : (_arithmeticOperatorHotSpot683.is("MUL")) ? ((nShorts * 1)) :  ((nShorts / 1))) * 16) + srcPos) >= 32) {
            throw new java.lang.IllegalArgumentException("(nShorts-1)*16+srcPos is greather or equal to than 32");
        } 
        for (int i = 0 ; i < nShorts ; i++) {
            final int shift = ((_arithmeticOperatorHotSpot684.is("PLUS")) ? ((i + 16)) : (_arithmeticOperatorHotSpot684.is("MINUS")) ? ((i - 16)) : (_arithmeticOperatorHotSpot684.is("MUL")) ? ((i * 16)) :  ((i / 16))) + srcPos;
            dst[((_arithmeticOperatorHotSpot685.is("PLUS")) ? ((dstPos + i)) : (_arithmeticOperatorHotSpot685.is("MINUS")) ? ((dstPos - i)) : (_arithmeticOperatorHotSpot685.is("MUL")) ? ((dstPos * i)) :  ((dstPos / i)))] = ((short)(65535 & (src >> shift)));
        }
        return dst;
    }

    public static byte[] longToByteArray(final long src, final int srcPos, final byte[] dst, final int dstPos, final int nBytes) {
        if (0 == nBytes) {
            return dst;
        } 
        if (((((_arithmeticOperatorHotSpot564.is("PLUS")) ? ((nBytes + 1)) : (_arithmeticOperatorHotSpot564.is("MINUS")) ? ((nBytes - 1)) : (_arithmeticOperatorHotSpot564.is("MUL")) ? ((nBytes * 1)) :  ((nBytes / 1))) * 8) + srcPos) >= 64) {
            throw new java.lang.IllegalArgumentException("(nBytes-1)*8+srcPos is greather or equal to than 64");
        } 
        for (int i = 0 ; i < nBytes ; i++) {
            final int shift = ((_arithmeticOperatorHotSpot565.is("PLUS")) ? ((i + 8)) : (_arithmeticOperatorHotSpot565.is("MINUS")) ? ((i - 8)) : (_arithmeticOperatorHotSpot565.is("MUL")) ? ((i * 8)) :  ((i / 8))) + srcPos;
            dst[((_arithmeticOperatorHotSpot566.is("PLUS")) ? ((dstPos + i)) : (_arithmeticOperatorHotSpot566.is("MINUS")) ? ((dstPos - i)) : (_arithmeticOperatorHotSpot566.is("MUL")) ? ((dstPos * i)) :  ((dstPos / i)))] = ((byte)(255 & (src >> shift)));
        }
        return dst;
    }

    public static byte[] intToByteArray(final int src, final int srcPos, final byte[] dst, final int dstPos, final int nBytes) {
        if (0 == nBytes) {
            return dst;
        } 
        if (((((_arithmeticOperatorHotSpot561.is("PLUS")) ? ((nBytes + 1)) : (_arithmeticOperatorHotSpot561.is("MINUS")) ? ((nBytes - 1)) : (_arithmeticOperatorHotSpot561.is("MUL")) ? ((nBytes * 1)) :  ((nBytes / 1))) * 8) + srcPos) >= 32) {
            throw new java.lang.IllegalArgumentException("(nBytes-1)*8+srcPos is greather or equal to than 32");
        } 
        for (int i = 0 ; i < nBytes ; i++) {
            final int shift = ((_arithmeticOperatorHotSpot562.is("PLUS")) ? ((i + 8)) : (_arithmeticOperatorHotSpot562.is("MINUS")) ? ((i - 8)) : (_arithmeticOperatorHotSpot562.is("MUL")) ? ((i * 8)) :  ((i / 8))) + srcPos;
            dst[((_arithmeticOperatorHotSpot563.is("PLUS")) ? ((dstPos + i)) : (_arithmeticOperatorHotSpot563.is("MINUS")) ? ((dstPos - i)) : (_arithmeticOperatorHotSpot563.is("MUL")) ? ((dstPos * i)) :  ((dstPos / i)))] = ((byte)(255 & (src >> shift)));
        }
        return dst;
    }

    public static byte[] shortToByteArray(final short src, final int srcPos, final byte[] dst, final int dstPos, final int nBytes) {
        if (0 == nBytes) {
            return dst;
        } 
        if (((((_arithmeticOperatorHotSpot567.is("PLUS")) ? ((nBytes + 1)) : (_arithmeticOperatorHotSpot567.is("MINUS")) ? ((nBytes - 1)) : (_arithmeticOperatorHotSpot567.is("MUL")) ? ((nBytes * 1)) :  ((nBytes / 1))) * 8) + srcPos) >= 16) {
            throw new java.lang.IllegalArgumentException("(nBytes-1)*8+srcPos is greather or equal to than 16");
        } 
        for (int i = 0 ; i < nBytes ; i++) {
            final int shift = ((_arithmeticOperatorHotSpot568.is("PLUS")) ? ((i + 8)) : (_arithmeticOperatorHotSpot568.is("MINUS")) ? ((i - 8)) : (_arithmeticOperatorHotSpot568.is("MUL")) ? ((i * 8)) :  ((i / 8))) + srcPos;
            dst[((_arithmeticOperatorHotSpot569.is("PLUS")) ? ((dstPos + i)) : (_arithmeticOperatorHotSpot569.is("MINUS")) ? ((dstPos - i)) : (_arithmeticOperatorHotSpot569.is("MUL")) ? ((dstPos * i)) :  ((dstPos / i)))] = ((byte)(255 & (src >> shift)));
        }
        return dst;
    }

    public static java.lang.String longToHex(final long src, final int srcPos, final java.lang.String dstInit, final int dstPos, final int nHexs) {
        if (0 == nHexs) {
            return dstInit;
        } 
        if (((((_arithmeticOperatorHotSpot649.is("PLUS")) ? ((nHexs + 1)) : (_arithmeticOperatorHotSpot649.is("MINUS")) ? ((nHexs - 1)) : (_arithmeticOperatorHotSpot649.is("MUL")) ? ((nHexs * 1)) :  ((nHexs / 1))) * 4) + srcPos) >= 64) {
            throw new java.lang.IllegalArgumentException("(nHexs-1)*4+srcPos is greather or equal to than 64");
        } 
        final java.lang.StringBuilder sb = new java.lang.StringBuilder(dstInit);
        int append = sb.length();
        for (int i = 0 ; i < nHexs ; i++) {
            final int shift = ((_arithmeticOperatorHotSpot650.is("PLUS")) ? ((i + 4)) : (_arithmeticOperatorHotSpot650.is("MINUS")) ? ((i - 4)) : (_arithmeticOperatorHotSpot650.is("MUL")) ? ((i * 4)) :  ((i / 4))) + srcPos;
            final int bits = ((int)(15 & (src >> shift)));
            if (((_arithmeticOperatorHotSpot651.is("PLUS")) ? ((dstPos + i)) : (_arithmeticOperatorHotSpot651.is("MINUS")) ? ((dstPos - i)) : (_arithmeticOperatorHotSpot651.is("MUL")) ? ((dstPos * i)) :  ((dstPos / i))) == append) {
                ++append;
                sb.append(org.apache.commons.lang3.Conversion.intToHexDigit(bits));
            } else {
                sb.setCharAt(((_arithmeticOperatorHotSpot652.is("PLUS")) ? ((dstPos + i)) : (_arithmeticOperatorHotSpot652.is("MINUS")) ? ((dstPos - i)) : (_arithmeticOperatorHotSpot652.is("MUL")) ? ((dstPos * i)) :  ((dstPos / i))), org.apache.commons.lang3.Conversion.intToHexDigit(bits));
            }
        }
        return sb.toString();
    }

    public static java.lang.String intToHex(final int src, final int srcPos, final java.lang.String dstInit, final int dstPos, final int nHexs) {
        if (0 == nHexs) {
            return dstInit;
        } 
        if (((((_arithmeticOperatorHotSpot645.is("PLUS")) ? ((nHexs + 1)) : (_arithmeticOperatorHotSpot645.is("MINUS")) ? ((nHexs - 1)) : (_arithmeticOperatorHotSpot645.is("MUL")) ? ((nHexs * 1)) :  ((nHexs / 1))) * 4) + srcPos) >= 32) {
            throw new java.lang.IllegalArgumentException("(nHexs-1)*4+srcPos is greather or equal to than 32");
        } 
        final java.lang.StringBuilder sb = new java.lang.StringBuilder(dstInit);
        int append = sb.length();
        for (int i = 0 ; i < nHexs ; i++) {
            final int shift = ((_arithmeticOperatorHotSpot646.is("PLUS")) ? ((i + 4)) : (_arithmeticOperatorHotSpot646.is("MINUS")) ? ((i - 4)) : (_arithmeticOperatorHotSpot646.is("MUL")) ? ((i * 4)) :  ((i / 4))) + srcPos;
            final int bits = 15 & (src >> shift);
            if (((_arithmeticOperatorHotSpot647.is("PLUS")) ? ((dstPos + i)) : (_arithmeticOperatorHotSpot647.is("MINUS")) ? ((dstPos - i)) : (_arithmeticOperatorHotSpot647.is("MUL")) ? ((dstPos * i)) :  ((dstPos / i))) == append) {
                ++append;
                sb.append(org.apache.commons.lang3.Conversion.intToHexDigit(bits));
            } else {
                sb.setCharAt(((_arithmeticOperatorHotSpot648.is("PLUS")) ? ((dstPos + i)) : (_arithmeticOperatorHotSpot648.is("MINUS")) ? ((dstPos - i)) : (_arithmeticOperatorHotSpot648.is("MUL")) ? ((dstPos * i)) :  ((dstPos / i))), org.apache.commons.lang3.Conversion.intToHexDigit(bits));
            }
        }
        return sb.toString();
    }

    public static java.lang.String shortToHex(final short src, final int srcPos, final java.lang.String dstInit, final int dstPos, final int nHexs) {
        if (0 == nHexs) {
            return dstInit;
        } 
        if (((((_arithmeticOperatorHotSpot653.is("PLUS")) ? ((nHexs + 1)) : (_arithmeticOperatorHotSpot653.is("MINUS")) ? ((nHexs - 1)) : (_arithmeticOperatorHotSpot653.is("MUL")) ? ((nHexs * 1)) :  ((nHexs / 1))) * 4) + srcPos) >= 16) {
            throw new java.lang.IllegalArgumentException("(nHexs-1)*4+srcPos is greather or equal to than 16");
        } 
        final java.lang.StringBuilder sb = new java.lang.StringBuilder(dstInit);
        int append = sb.length();
        for (int i = 0 ; i < nHexs ; i++) {
            final int shift = ((_arithmeticOperatorHotSpot654.is("PLUS")) ? ((i + 4)) : (_arithmeticOperatorHotSpot654.is("MINUS")) ? ((i - 4)) : (_arithmeticOperatorHotSpot654.is("MUL")) ? ((i * 4)) :  ((i / 4))) + srcPos;
            final int bits = 15 & (src >> shift);
            if (((_arithmeticOperatorHotSpot655.is("PLUS")) ? ((dstPos + i)) : (_arithmeticOperatorHotSpot655.is("MINUS")) ? ((dstPos - i)) : (_arithmeticOperatorHotSpot655.is("MUL")) ? ((dstPos * i)) :  ((dstPos / i))) == append) {
                ++append;
                sb.append(org.apache.commons.lang3.Conversion.intToHexDigit(bits));
            } else {
                sb.setCharAt(((_arithmeticOperatorHotSpot656.is("PLUS")) ? ((dstPos + i)) : (_arithmeticOperatorHotSpot656.is("MINUS")) ? ((dstPos - i)) : (_arithmeticOperatorHotSpot656.is("MUL")) ? ((dstPos * i)) :  ((dstPos / i))), org.apache.commons.lang3.Conversion.intToHexDigit(bits));
            }
        }
        return sb.toString();
    }

    public static java.lang.String byteToHex(final byte src, final int srcPos, final java.lang.String dstInit, final int dstPos, final int nHexs) {
        if (0 == nHexs) {
            return dstInit;
        } 
        if (((((_arithmeticOperatorHotSpot641.is("PLUS")) ? ((nHexs + 1)) : (_arithmeticOperatorHotSpot641.is("MINUS")) ? ((nHexs - 1)) : (_arithmeticOperatorHotSpot641.is("MUL")) ? ((nHexs * 1)) :  ((nHexs / 1))) * 4) + srcPos) >= 8) {
            throw new java.lang.IllegalArgumentException("(nHexs-1)*4+srcPos is greather or equal to than 8");
        } 
        final java.lang.StringBuilder sb = new java.lang.StringBuilder(dstInit);
        int append = sb.length();
        for (int i = 0 ; i < nHexs ; i++) {
            final int shift = ((_arithmeticOperatorHotSpot642.is("PLUS")) ? ((i + 4)) : (_arithmeticOperatorHotSpot642.is("MINUS")) ? ((i - 4)) : (_arithmeticOperatorHotSpot642.is("MUL")) ? ((i * 4)) :  ((i / 4))) + srcPos;
            final int bits = 15 & (src >> shift);
            if (((_arithmeticOperatorHotSpot643.is("PLUS")) ? ((dstPos + i)) : (_arithmeticOperatorHotSpot643.is("MINUS")) ? ((dstPos - i)) : (_arithmeticOperatorHotSpot643.is("MUL")) ? ((dstPos * i)) :  ((dstPos / i))) == append) {
                ++append;
                sb.append(org.apache.commons.lang3.Conversion.intToHexDigit(bits));
            } else {
                sb.setCharAt(((_arithmeticOperatorHotSpot644.is("PLUS")) ? ((dstPos + i)) : (_arithmeticOperatorHotSpot644.is("MINUS")) ? ((dstPos - i)) : (_arithmeticOperatorHotSpot644.is("MUL")) ? ((dstPos * i)) :  ((dstPos / i))), org.apache.commons.lang3.Conversion.intToHexDigit(bits));
            }
        }
        return sb.toString();
    }

    public static boolean[] longToBinary(final long src, final int srcPos, final boolean[] dst, final int dstPos, final int nBools) {
        if (0 == nBools) {
            return dst;
        } 
        if ((((_arithmeticOperatorHotSpot547.is("PLUS")) ? ((nBools + 1)) : (_arithmeticOperatorHotSpot547.is("MINUS")) ? ((nBools - 1)) : (_arithmeticOperatorHotSpot547.is("MUL")) ? ((nBools * 1)) :  ((nBools / 1))) + srcPos) >= 64) {
            throw new java.lang.IllegalArgumentException("nBools-1+srcPos is greather or equal to than 64");
        } 
        for (int i = 0 ; i < nBools ; i++) {
            final int shift = ((_arithmeticOperatorHotSpot548.is("PLUS")) ? (i + srcPos) : (_arithmeticOperatorHotSpot548.is("MINUS")) ? (i - srcPos) : (_arithmeticOperatorHotSpot548.is("MUL")) ? (i * srcPos) :  (i / srcPos));
            dst[((_arithmeticOperatorHotSpot549.is("PLUS")) ? ((dstPos + i)) : (_arithmeticOperatorHotSpot549.is("MINUS")) ? ((dstPos - i)) : (_arithmeticOperatorHotSpot549.is("MUL")) ? ((dstPos * i)) :  ((dstPos / i)))] = (1 & (src >> shift)) != 0;
        }
        return dst;
    }

    public static boolean[] intToBinary(final int src, final int srcPos, final boolean[] dst, final int dstPos, final int nBools) {
        if (0 == nBools) {
            return dst;
        } 
        if ((((_arithmeticOperatorHotSpot544.is("PLUS")) ? ((nBools + 1)) : (_arithmeticOperatorHotSpot544.is("MINUS")) ? ((nBools - 1)) : (_arithmeticOperatorHotSpot544.is("MUL")) ? ((nBools * 1)) :  ((nBools / 1))) + srcPos) >= 32) {
            throw new java.lang.IllegalArgumentException("nBools-1+srcPos is greather or equal to than 32");
        } 
        for (int i = 0 ; i < nBools ; i++) {
            final int shift = ((_arithmeticOperatorHotSpot545.is("PLUS")) ? (i + srcPos) : (_arithmeticOperatorHotSpot545.is("MINUS")) ? (i - srcPos) : (_arithmeticOperatorHotSpot545.is("MUL")) ? (i * srcPos) :  (i / srcPos));
            dst[((_arithmeticOperatorHotSpot546.is("PLUS")) ? ((dstPos + i)) : (_arithmeticOperatorHotSpot546.is("MINUS")) ? ((dstPos - i)) : (_arithmeticOperatorHotSpot546.is("MUL")) ? ((dstPos * i)) :  ((dstPos / i)))] = (1 & (src >> shift)) != 0;
        }
        return dst;
    }

    public static boolean[] shortToBinary(final short src, final int srcPos, final boolean[] dst, final int dstPos, final int nBools) {
        if (0 == nBools) {
            return dst;
        } 
        if ((((_arithmeticOperatorHotSpot550.is("PLUS")) ? ((nBools + 1)) : (_arithmeticOperatorHotSpot550.is("MINUS")) ? ((nBools - 1)) : (_arithmeticOperatorHotSpot550.is("MUL")) ? ((nBools * 1)) :  ((nBools / 1))) + srcPos) >= 16) {
            throw new java.lang.IllegalArgumentException("nBools-1+srcPos is greather or equal to than 16");
        } 
        assert ((_arithmeticOperatorHotSpot551.is("PLUS")) ? ((nBools + 1)) : (_arithmeticOperatorHotSpot551.is("MINUS")) ? ((nBools - 1)) : (_arithmeticOperatorHotSpot551.is("MUL")) ? ((nBools * 1)) :  ((nBools / 1))) < ((_arithmeticOperatorHotSpot552.is("PLUS")) ? ((16 + srcPos)) : (_arithmeticOperatorHotSpot552.is("MINUS")) ? ((16 - srcPos)) : (_arithmeticOperatorHotSpot552.is("MUL")) ? ((16 * srcPos)) :  ((16 / srcPos)));
        for (int i = 0 ; i < nBools ; i++) {
            final int shift = ((_arithmeticOperatorHotSpot553.is("PLUS")) ? (i + srcPos) : (_arithmeticOperatorHotSpot553.is("MINUS")) ? (i - srcPos) : (_arithmeticOperatorHotSpot553.is("MUL")) ? (i * srcPos) :  (i / srcPos));
            dst[((_arithmeticOperatorHotSpot554.is("PLUS")) ? ((dstPos + i)) : (_arithmeticOperatorHotSpot554.is("MINUS")) ? ((dstPos - i)) : (_arithmeticOperatorHotSpot554.is("MUL")) ? ((dstPos * i)) :  ((dstPos / i)))] = (1 & (src >> shift)) != 0;
        }
        return dst;
    }

    public static boolean[] byteToBinary(final byte src, final int srcPos, final boolean[] dst, final int dstPos, final int nBools) {
        if (0 == nBools) {
            return dst;
        } 
        if ((((_arithmeticOperatorHotSpot541.is("PLUS")) ? ((nBools + 1)) : (_arithmeticOperatorHotSpot541.is("MINUS")) ? ((nBools - 1)) : (_arithmeticOperatorHotSpot541.is("MUL")) ? ((nBools * 1)) :  ((nBools / 1))) + srcPos) >= 8) {
            throw new java.lang.IllegalArgumentException("nBools-1+srcPos is greather or equal to than 8");
        } 
        for (int i = 0 ; i < nBools ; i++) {
            final int shift = ((_arithmeticOperatorHotSpot542.is("PLUS")) ? (i + srcPos) : (_arithmeticOperatorHotSpot542.is("MINUS")) ? (i - srcPos) : (_arithmeticOperatorHotSpot542.is("MUL")) ? (i * srcPos) :  (i / srcPos));
            dst[((_arithmeticOperatorHotSpot543.is("PLUS")) ? ((dstPos + i)) : (_arithmeticOperatorHotSpot543.is("MINUS")) ? ((dstPos - i)) : (_arithmeticOperatorHotSpot543.is("MUL")) ? ((dstPos * i)) :  ((dstPos / i)))] = (1 & (src >> shift)) != 0;
        }
        return dst;
    }

    public static byte[] uuidToByteArray(final java.util.UUID src, final byte[] dst, final int dstPos, final int nBytes) {
        if (0 == nBytes) {
            return dst;
        } 
        if (nBytes > 16) {
            throw new java.lang.IllegalArgumentException("nBytes is greather than 16");
        } 
        org.apache.commons.lang3.Conversion.longToByteArray(src.getMostSignificantBits(), 0, dst, dstPos, (nBytes > 8 ? 8 : nBytes));
        if (nBytes >= 8) {
            org.apache.commons.lang3.Conversion.longToByteArray(src.getLeastSignificantBits(), 0, dst, ((_arithmeticOperatorHotSpot570.is("PLUS")) ? ((dstPos + 8)) : (_arithmeticOperatorHotSpot570.is("MINUS")) ? ((dstPos - 8)) : (_arithmeticOperatorHotSpot570.is("MUL")) ? ((dstPos * 8)) :  ((dstPos / 8))), ((_arithmeticOperatorHotSpot571.is("PLUS")) ? ((nBytes + 8)) : (_arithmeticOperatorHotSpot571.is("MINUS")) ? ((nBytes - 8)) : (_arithmeticOperatorHotSpot571.is("MUL")) ? ((nBytes * 8)) :  ((nBytes / 8))));
        } 
        return dst;
    }

    public static java.util.UUID byteArrayToUuid(final byte[] src, final int srcPos) {
        if (((_arithmeticOperatorHotSpot657.is("PLUS")) ? (((src.length) + srcPos)) : (_arithmeticOperatorHotSpot657.is("MINUS")) ? (((src.length) - srcPos)) : (_arithmeticOperatorHotSpot657.is("MUL")) ? (((src.length) * srcPos)) :  (((src.length) / srcPos))) < 16) {
            throw new java.lang.IllegalArgumentException("Need at least 16 bytes for UUID");
        } 
        return new java.util.UUID(org.apache.commons.lang3.Conversion.byteArrayToLong(src, srcPos, 0, 0, 8) , org.apache.commons.lang3.Conversion.byteArrayToLong(src, ((_arithmeticOperatorHotSpot658.is("PLUS")) ? ((srcPos + 8)) : (_arithmeticOperatorHotSpot658.is("MINUS")) ? ((srcPos - 8)) : (_arithmeticOperatorHotSpot658.is("MUL")) ? ((srcPos * 8)) :  ((srcPos / 8))), 0, 0, 8));
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot541 = metamutator.Selector.of(541,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot541");

    private static final metamutator.Selector _arithmeticOperatorHotSpot542 = metamutator.Selector.of(542,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot542");

    private static final metamutator.Selector _arithmeticOperatorHotSpot543 = metamutator.Selector.of(543,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot543");

    private static final metamutator.Selector _arithmeticOperatorHotSpot544 = metamutator.Selector.of(544,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot544");

    private static final metamutator.Selector _arithmeticOperatorHotSpot545 = metamutator.Selector.of(545,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot545");

    private static final metamutator.Selector _arithmeticOperatorHotSpot546 = metamutator.Selector.of(546,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot546");

    private static final metamutator.Selector _arithmeticOperatorHotSpot547 = metamutator.Selector.of(547,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot547");

    private static final metamutator.Selector _arithmeticOperatorHotSpot548 = metamutator.Selector.of(548,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot548");

    private static final metamutator.Selector _arithmeticOperatorHotSpot549 = metamutator.Selector.of(549,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot549");

    private static final metamutator.Selector _arithmeticOperatorHotSpot550 = metamutator.Selector.of(550,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot550");

    private static final metamutator.Selector _arithmeticOperatorHotSpot551 = metamutator.Selector.of(551,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot551");

    private static final metamutator.Selector _arithmeticOperatorHotSpot552 = metamutator.Selector.of(552,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot552");

    private static final metamutator.Selector _arithmeticOperatorHotSpot553 = metamutator.Selector.of(553,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot553");

    private static final metamutator.Selector _arithmeticOperatorHotSpot554 = metamutator.Selector.of(554,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot554");

    private static final metamutator.Selector _arithmeticOperatorHotSpot555 = metamutator.Selector.of(555,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot555");

    private static final metamutator.Selector _arithmeticOperatorHotSpot556 = metamutator.Selector.of(556,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot556");

    private static final metamutator.Selector _arithmeticOperatorHotSpot557 = metamutator.Selector.of(557,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot557");

    private static final metamutator.Selector _arithmeticOperatorHotSpot558 = metamutator.Selector.of(558,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot558");

    private static final metamutator.Selector _arithmeticOperatorHotSpot559 = metamutator.Selector.of(559,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot559");

    private static final metamutator.Selector _arithmeticOperatorHotSpot560 = metamutator.Selector.of(560,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot560");

    private static final metamutator.Selector _arithmeticOperatorHotSpot561 = metamutator.Selector.of(561,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot561");

    private static final metamutator.Selector _arithmeticOperatorHotSpot562 = metamutator.Selector.of(562,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot562");

    private static final metamutator.Selector _arithmeticOperatorHotSpot563 = metamutator.Selector.of(563,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot563");

    private static final metamutator.Selector _arithmeticOperatorHotSpot564 = metamutator.Selector.of(564,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot564");

    private static final metamutator.Selector _arithmeticOperatorHotSpot565 = metamutator.Selector.of(565,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot565");

    private static final metamutator.Selector _arithmeticOperatorHotSpot566 = metamutator.Selector.of(566,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot566");

    private static final metamutator.Selector _arithmeticOperatorHotSpot567 = metamutator.Selector.of(567,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot567");

    private static final metamutator.Selector _arithmeticOperatorHotSpot568 = metamutator.Selector.of(568,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot568");

    private static final metamutator.Selector _arithmeticOperatorHotSpot569 = metamutator.Selector.of(569,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot569");

    private static final metamutator.Selector _arithmeticOperatorHotSpot570 = metamutator.Selector.of(570,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot570");

    private static final metamutator.Selector _arithmeticOperatorHotSpot571 = metamutator.Selector.of(571,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot571");

    private static final metamutator.Selector _arithmeticOperatorHotSpot572 = metamutator.Selector.of(572,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot572");

    private static final metamutator.Selector _arithmeticOperatorHotSpot573 = metamutator.Selector.of(573,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot573");

    private static final metamutator.Selector _arithmeticOperatorHotSpot574 = metamutator.Selector.of(574,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot574");

    private static final metamutator.Selector _arithmeticOperatorHotSpot575 = metamutator.Selector.of(575,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot575");

    private static final metamutator.Selector _arithmeticOperatorHotSpot576 = metamutator.Selector.of(576,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot576");

    private static final metamutator.Selector _arithmeticOperatorHotSpot577 = metamutator.Selector.of(577,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot577");

    private static final metamutator.Selector _arithmeticOperatorHotSpot578 = metamutator.Selector.of(578,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot578");

    private static final metamutator.Selector _arithmeticOperatorHotSpot579 = metamutator.Selector.of(579,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot579");

    private static final metamutator.Selector _arithmeticOperatorHotSpot580 = metamutator.Selector.of(580,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot580");

    private static final metamutator.Selector _arithmeticOperatorHotSpot581 = metamutator.Selector.of(581,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot581");

    private static final metamutator.Selector _arithmeticOperatorHotSpot582 = metamutator.Selector.of(582,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot582");

    private static final metamutator.Selector _arithmeticOperatorHotSpot583 = metamutator.Selector.of(583,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot583");

    private static final metamutator.Selector _arithmeticOperatorHotSpot584 = metamutator.Selector.of(584,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot584");

    private static final metamutator.Selector _arithmeticOperatorHotSpot585 = metamutator.Selector.of(585,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot585");

    private static final metamutator.Selector _arithmeticOperatorHotSpot586 = metamutator.Selector.of(586,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot586");

    private static final metamutator.Selector _arithmeticOperatorHotSpot587 = metamutator.Selector.of(587,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot587");

    private static final metamutator.Selector _arithmeticOperatorHotSpot588 = metamutator.Selector.of(588,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot588");

    private static final metamutator.Selector _arithmeticOperatorHotSpot589 = metamutator.Selector.of(589,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot589");

    private static final metamutator.Selector _arithmeticOperatorHotSpot590 = metamutator.Selector.of(590,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot590");

    private static final metamutator.Selector _arithmeticOperatorHotSpot591 = metamutator.Selector.of(591,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot591");

    private static final metamutator.Selector _arithmeticOperatorHotSpot592 = metamutator.Selector.of(592,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot592");

    private static final metamutator.Selector _arithmeticOperatorHotSpot593 = metamutator.Selector.of(593,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot593");

    private static final metamutator.Selector _arithmeticOperatorHotSpot594 = metamutator.Selector.of(594,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot594");

    private static final metamutator.Selector _arithmeticOperatorHotSpot595 = metamutator.Selector.of(595,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot595");

    private static final metamutator.Selector _arithmeticOperatorHotSpot596 = metamutator.Selector.of(596,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot596");

    private static final metamutator.Selector _arithmeticOperatorHotSpot597 = metamutator.Selector.of(597,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot597");

    private static final metamutator.Selector _arithmeticOperatorHotSpot598 = metamutator.Selector.of(598,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot598");

    private static final metamutator.Selector _arithmeticOperatorHotSpot599 = metamutator.Selector.of(599,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot599");

    private static final metamutator.Selector _arithmeticOperatorHotSpot600 = metamutator.Selector.of(600,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot600");

    private static final metamutator.Selector _arithmeticOperatorHotSpot601 = metamutator.Selector.of(601,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot601");

    private static final metamutator.Selector _arithmeticOperatorHotSpot602 = metamutator.Selector.of(602,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot602");

    private static final metamutator.Selector _arithmeticOperatorHotSpot603 = metamutator.Selector.of(603,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot603");

    private static final metamutator.Selector _arithmeticOperatorHotSpot604 = metamutator.Selector.of(604,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot604");

    private static final metamutator.Selector _arithmeticOperatorHotSpot605 = metamutator.Selector.of(605,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot605");

    private static final metamutator.Selector _arithmeticOperatorHotSpot606 = metamutator.Selector.of(606,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot606");

    private static final metamutator.Selector _arithmeticOperatorHotSpot607 = metamutator.Selector.of(607,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot607");

    private static final metamutator.Selector _arithmeticOperatorHotSpot608 = metamutator.Selector.of(608,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot608");

    private static final metamutator.Selector _arithmeticOperatorHotSpot609 = metamutator.Selector.of(609,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot609");

    private static final metamutator.Selector _arithmeticOperatorHotSpot610 = metamutator.Selector.of(610,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot610");

    private static final metamutator.Selector _arithmeticOperatorHotSpot611 = metamutator.Selector.of(611,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot611");

    private static final metamutator.Selector _arithmeticOperatorHotSpot612 = metamutator.Selector.of(612,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot612");

    private static final metamutator.Selector _arithmeticOperatorHotSpot613 = metamutator.Selector.of(613,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot613");

    private static final metamutator.Selector _arithmeticOperatorHotSpot614 = metamutator.Selector.of(614,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot614");

    private static final metamutator.Selector _arithmeticOperatorHotSpot615 = metamutator.Selector.of(615,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot615");

    private static final metamutator.Selector _arithmeticOperatorHotSpot616 = metamutator.Selector.of(616,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot616");

    private static final metamutator.Selector _arithmeticOperatorHotSpot617 = metamutator.Selector.of(617,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot617");

    private static final metamutator.Selector _arithmeticOperatorHotSpot618 = metamutator.Selector.of(618,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot618");

    private static final metamutator.Selector _arithmeticOperatorHotSpot619 = metamutator.Selector.of(619,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot619");

    private static final metamutator.Selector _arithmeticOperatorHotSpot620 = metamutator.Selector.of(620,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot620");

    private static final metamutator.Selector _arithmeticOperatorHotSpot621 = metamutator.Selector.of(621,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot621");

    private static final metamutator.Selector _arithmeticOperatorHotSpot622 = metamutator.Selector.of(622,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot622");

    private static final metamutator.Selector _arithmeticOperatorHotSpot623 = metamutator.Selector.of(623,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot623");

    private static final metamutator.Selector _arithmeticOperatorHotSpot624 = metamutator.Selector.of(624,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot624");

    private static final metamutator.Selector _arithmeticOperatorHotSpot625 = metamutator.Selector.of(625,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot625");

    private static final metamutator.Selector _arithmeticOperatorHotSpot626 = metamutator.Selector.of(626,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot626");

    private static final metamutator.Selector _arithmeticOperatorHotSpot627 = metamutator.Selector.of(627,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot627");

    private static final metamutator.Selector _arithmeticOperatorHotSpot628 = metamutator.Selector.of(628,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot628");

    private static final metamutator.Selector _arithmeticOperatorHotSpot629 = metamutator.Selector.of(629,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot629");

    private static final metamutator.Selector _arithmeticOperatorHotSpot630 = metamutator.Selector.of(630,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot630");

    private static final metamutator.Selector _arithmeticOperatorHotSpot631 = metamutator.Selector.of(631,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot631");

    private static final metamutator.Selector _arithmeticOperatorHotSpot632 = metamutator.Selector.of(632,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot632");

    private static final metamutator.Selector _arithmeticOperatorHotSpot633 = metamutator.Selector.of(633,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot633");

    private static final metamutator.Selector _arithmeticOperatorHotSpot634 = metamutator.Selector.of(634,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot634");

    private static final metamutator.Selector _arithmeticOperatorHotSpot635 = metamutator.Selector.of(635,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot635");

    private static final metamutator.Selector _arithmeticOperatorHotSpot636 = metamutator.Selector.of(636,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot636");

    private static final metamutator.Selector _arithmeticOperatorHotSpot637 = metamutator.Selector.of(637,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot637");

    private static final metamutator.Selector _arithmeticOperatorHotSpot638 = metamutator.Selector.of(638,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot638");

    private static final metamutator.Selector _arithmeticOperatorHotSpot639 = metamutator.Selector.of(639,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot639");

    private static final metamutator.Selector _arithmeticOperatorHotSpot640 = metamutator.Selector.of(640,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot640");

    private static final metamutator.Selector _arithmeticOperatorHotSpot641 = metamutator.Selector.of(641,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot641");

    private static final metamutator.Selector _arithmeticOperatorHotSpot642 = metamutator.Selector.of(642,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot642");

    private static final metamutator.Selector _arithmeticOperatorHotSpot643 = metamutator.Selector.of(643,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot643");

    private static final metamutator.Selector _arithmeticOperatorHotSpot644 = metamutator.Selector.of(644,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot644");

    private static final metamutator.Selector _arithmeticOperatorHotSpot645 = metamutator.Selector.of(645,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot645");

    private static final metamutator.Selector _arithmeticOperatorHotSpot646 = metamutator.Selector.of(646,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot646");

    private static final metamutator.Selector _arithmeticOperatorHotSpot647 = metamutator.Selector.of(647,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot647");

    private static final metamutator.Selector _arithmeticOperatorHotSpot648 = metamutator.Selector.of(648,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot648");

    private static final metamutator.Selector _arithmeticOperatorHotSpot649 = metamutator.Selector.of(649,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot649");

    private static final metamutator.Selector _arithmeticOperatorHotSpot650 = metamutator.Selector.of(650,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot650");

    private static final metamutator.Selector _arithmeticOperatorHotSpot651 = metamutator.Selector.of(651,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot651");

    private static final metamutator.Selector _arithmeticOperatorHotSpot652 = metamutator.Selector.of(652,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot652");

    private static final metamutator.Selector _arithmeticOperatorHotSpot653 = metamutator.Selector.of(653,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot653");

    private static final metamutator.Selector _arithmeticOperatorHotSpot654 = metamutator.Selector.of(654,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot654");

    private static final metamutator.Selector _arithmeticOperatorHotSpot655 = metamutator.Selector.of(655,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot655");

    private static final metamutator.Selector _arithmeticOperatorHotSpot656 = metamutator.Selector.of(656,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot656");

    private static final metamutator.Selector _arithmeticOperatorHotSpot657 = metamutator.Selector.of(657,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot657");

    private static final metamutator.Selector _arithmeticOperatorHotSpot658 = metamutator.Selector.of(658,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot658");

    private static final metamutator.Selector _arithmeticOperatorHotSpot659 = metamutator.Selector.of(659,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot659");

    private static final metamutator.Selector _arithmeticOperatorHotSpot660 = metamutator.Selector.of(660,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot660");

    private static final metamutator.Selector _arithmeticOperatorHotSpot661 = metamutator.Selector.of(661,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot661");

    private static final metamutator.Selector _arithmeticOperatorHotSpot662 = metamutator.Selector.of(662,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot662");

    private static final metamutator.Selector _arithmeticOperatorHotSpot663 = metamutator.Selector.of(663,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot663");

    private static final metamutator.Selector _arithmeticOperatorHotSpot664 = metamutator.Selector.of(664,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot664");

    private static final metamutator.Selector _arithmeticOperatorHotSpot665 = metamutator.Selector.of(665,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot665");

    private static final metamutator.Selector _arithmeticOperatorHotSpot666 = metamutator.Selector.of(666,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot666");

    private static final metamutator.Selector _arithmeticOperatorHotSpot667 = metamutator.Selector.of(667,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot667");

    private static final metamutator.Selector _arithmeticOperatorHotSpot668 = metamutator.Selector.of(668,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot668");

    private static final metamutator.Selector _arithmeticOperatorHotSpot669 = metamutator.Selector.of(669,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot669");

    private static final metamutator.Selector _arithmeticOperatorHotSpot670 = metamutator.Selector.of(670,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot670");

    private static final metamutator.Selector _arithmeticOperatorHotSpot671 = metamutator.Selector.of(671,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot671");

    private static final metamutator.Selector _arithmeticOperatorHotSpot672 = metamutator.Selector.of(672,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot672");

    private static final metamutator.Selector _arithmeticOperatorHotSpot673 = metamutator.Selector.of(673,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot673");

    private static final metamutator.Selector _arithmeticOperatorHotSpot674 = metamutator.Selector.of(674,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot674");

    private static final metamutator.Selector _arithmeticOperatorHotSpot675 = metamutator.Selector.of(675,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot675");

    private static final metamutator.Selector _arithmeticOperatorHotSpot676 = metamutator.Selector.of(676,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot676");

    private static final metamutator.Selector _arithmeticOperatorHotSpot677 = metamutator.Selector.of(677,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot677");

    private static final metamutator.Selector _arithmeticOperatorHotSpot678 = metamutator.Selector.of(678,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot678");

    private static final metamutator.Selector _arithmeticOperatorHotSpot679 = metamutator.Selector.of(679,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot679");

    private static final metamutator.Selector _arithmeticOperatorHotSpot680 = metamutator.Selector.of(680,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot680");

    private static final metamutator.Selector _arithmeticOperatorHotSpot681 = metamutator.Selector.of(681,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot681");

    private static final metamutator.Selector _arithmeticOperatorHotSpot682 = metamutator.Selector.of(682,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot682");

    private static final metamutator.Selector _arithmeticOperatorHotSpot683 = metamutator.Selector.of(683,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot683");

    private static final metamutator.Selector _arithmeticOperatorHotSpot684 = metamutator.Selector.of(684,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot684");

    private static final metamutator.Selector _arithmeticOperatorHotSpot685 = metamutator.Selector.of(685,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot685");

    private static final metamutator.Selector _arithmeticOperatorHotSpot686 = metamutator.Selector.of(686,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot686");

    private static final metamutator.Selector _arithmeticOperatorHotSpot687 = metamutator.Selector.of(687,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot687");

    private static final metamutator.Selector _arithmeticOperatorHotSpot688 = metamutator.Selector.of(688,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.Conversion.class).id("_arithmeticOperatorHotSpot688");
}

