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
        return ((_returnReplacementOperator2769.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2769.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2769.is("ZERO")) ? ( 0 ) : (digit));
    }

    public static int hexDigitMsb0ToInt(final char hexDigit) {
        switch (hexDigit) {
            case '0' :
                return ((_returnReplacementOperator2753.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2753.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2753.is("ZERO")) ? ( 0 ) : (0));
            case '1' :
                return ((_returnReplacementOperator2754.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2754.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2754.is("ZERO")) ? ( 0 ) : (8));
            case '2' :
                return ((_returnReplacementOperator2755.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2755.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2755.is("ZERO")) ? ( 0 ) : (4));
            case '3' :
                return ((_returnReplacementOperator2756.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2756.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2756.is("ZERO")) ? ( 0 ) : (12));
            case '4' :
                return ((_returnReplacementOperator2757.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2757.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2757.is("ZERO")) ? ( 0 ) : (2));
            case '5' :
                return ((_returnReplacementOperator2758.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2758.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2758.is("ZERO")) ? ( 0 ) : (10));
            case '6' :
                return ((_returnReplacementOperator2759.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2759.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2759.is("ZERO")) ? ( 0 ) : (6));
            case '7' :
                return ((_returnReplacementOperator2760.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2760.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2760.is("ZERO")) ? ( 0 ) : (14));
            case '8' :
                return ((_returnReplacementOperator2761.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2761.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2761.is("ZERO")) ? ( 0 ) : (1));
            case '9' :
                return ((_returnReplacementOperator2762.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2762.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2762.is("ZERO")) ? ( 0 ) : (9));
            case 'a' :
            case 'A' :
                return ((_returnReplacementOperator2763.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2763.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2763.is("ZERO")) ? ( 0 ) : (5));
            case 'b' :
            case 'B' :
                return ((_returnReplacementOperator2764.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2764.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2764.is("ZERO")) ? ( 0 ) : (13));
            case 'c' :
            case 'C' :
                return ((_returnReplacementOperator2765.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2765.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2765.is("ZERO")) ? ( 0 ) : (3));
            case 'd' :
            case 'D' :
                return ((_returnReplacementOperator2766.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2766.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2766.is("ZERO")) ? ( 0 ) : (11));
            case 'e' :
            case 'E' :
                return ((_returnReplacementOperator2767.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2767.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2767.is("ZERO")) ? ( 0 ) : (7));
            case 'f' :
            case 'F' :
                return ((_returnReplacementOperator2768.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2768.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2768.is("ZERO")) ? ( 0 ) : (15));
            default :
                throw new java.lang.IllegalArgumentException((("Cannot interpret '" + hexDigit) + "' as a hexadecimal digit"));
        }
    }

    public static boolean[] hexDigitToBinary(final char hexDigit) {
        switch (hexDigit) {
            case '0' :
                return ((_returnReplacementOperator2671.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.FFFF.clone()));
            case '1' :
                return ((_returnReplacementOperator2672.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.TFFF.clone()));
            case '2' :
                return ((_returnReplacementOperator2673.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.FTFF.clone()));
            case '3' :
                return ((_returnReplacementOperator2674.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.TTFF.clone()));
            case '4' :
                return ((_returnReplacementOperator2675.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.FFTF.clone()));
            case '5' :
                return ((_returnReplacementOperator2676.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.TFTF.clone()));
            case '6' :
                return ((_returnReplacementOperator2677.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.FTTF.clone()));
            case '7' :
                return ((_returnReplacementOperator2678.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.TTTF.clone()));
            case '8' :
                return ((_returnReplacementOperator2679.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.FFFT.clone()));
            case '9' :
                return ((_returnReplacementOperator2680.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.TFFT.clone()));
            case 'a' :
            case 'A' :
                return ((_returnReplacementOperator2681.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.FTFT.clone()));
            case 'b' :
            case 'B' :
                return ((_returnReplacementOperator2682.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.TTFT.clone()));
            case 'c' :
            case 'C' :
                return ((_returnReplacementOperator2683.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.FFTT.clone()));
            case 'd' :
            case 'D' :
                return ((_returnReplacementOperator2684.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.TFTT.clone()));
            case 'e' :
            case 'E' :
                return ((_returnReplacementOperator2685.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.FTTT.clone()));
            case 'f' :
            case 'F' :
                return ((_returnReplacementOperator2686.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.TTTT.clone()));
            default :
                throw new java.lang.IllegalArgumentException((("Cannot interpret '" + hexDigit) + "' as a hexadecimal digit"));
        }
    }

    public static boolean[] hexDigitMsb0ToBinary(final char hexDigit) {
        switch (hexDigit) {
            case '0' :
                return ((_returnReplacementOperator2655.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.FFFF.clone()));
            case '1' :
                return ((_returnReplacementOperator2656.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.FFFT.clone()));
            case '2' :
                return ((_returnReplacementOperator2657.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.FFTF.clone()));
            case '3' :
                return ((_returnReplacementOperator2658.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.FFTT.clone()));
            case '4' :
                return ((_returnReplacementOperator2659.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.FTFF.clone()));
            case '5' :
                return ((_returnReplacementOperator2660.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.FTFT.clone()));
            case '6' :
                return ((_returnReplacementOperator2661.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.FTTF.clone()));
            case '7' :
                return ((_returnReplacementOperator2662.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.FTTT.clone()));
            case '8' :
                return ((_returnReplacementOperator2663.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.TFFF.clone()));
            case '9' :
                return ((_returnReplacementOperator2664.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.TFFT.clone()));
            case 'a' :
            case 'A' :
                return ((_returnReplacementOperator2665.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.TFTF.clone()));
            case 'b' :
            case 'B' :
                return ((_returnReplacementOperator2666.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.TFTT.clone()));
            case 'c' :
            case 'C' :
                return ((_returnReplacementOperator2667.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.TTFF.clone()));
            case 'd' :
            case 'D' :
                return ((_returnReplacementOperator2668.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.TTFT.clone()));
            case 'e' :
            case 'E' :
                return ((_returnReplacementOperator2669.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.TTTF.clone()));
            case 'f' :
            case 'F' :
                return ((_returnReplacementOperator2670.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.TTTT.clone()));
            default :
                throw new java.lang.IllegalArgumentException((("Cannot interpret '" + hexDigit) + "' as a hexadecimal digit"));
        }
    }

    public static char binaryToHexDigit(final boolean[] src) {
        return ((_returnReplacementOperator2714.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.binaryToHexDigit(src, 0)));
    }

    public static char binaryToHexDigit(final boolean[] src, final int srcPos) {
        if ((src.length) == 0) {
            throw new java.lang.IllegalArgumentException("Cannot convert an empty array.");
        } 
        if (((src.length) > (srcPos + 3)) && (src[(srcPos + 3)])) {
            if (((src.length) > (srcPos + 2)) && (src[(srcPos + 2)])) {
                if (((src.length) > (srcPos + 1)) && (src[(srcPos + 1)])) {
                    return ((_returnReplacementOperator2715.is("NULL")) ? ( null ) : (src[srcPos] ? 'f' : 'e'));
                } 
                return ((_returnReplacementOperator2716.is("NULL")) ? ( null ) : (src[srcPos] ? 'd' : 'c'));
            } 
            if (((src.length) > (srcPos + 1)) && (src[(srcPos + 1)])) {
                return ((_returnReplacementOperator2717.is("NULL")) ? ( null ) : (src[srcPos] ? 'b' : 'a'));
            } 
            return ((_returnReplacementOperator2718.is("NULL")) ? ( null ) : (src[srcPos] ? '9' : '8'));
        } 
        if (((src.length) > (srcPos + 2)) && (src[(srcPos + 2)])) {
            if (((src.length) > (srcPos + 1)) && (src[(srcPos + 1)])) {
                return ((_returnReplacementOperator2719.is("NULL")) ? ( null ) : (src[srcPos] ? '7' : '6'));
            } 
            return ((_returnReplacementOperator2720.is("NULL")) ? ( null ) : (src[srcPos] ? '5' : '4'));
        } 
        if (((src.length) > (srcPos + 1)) && (src[(srcPos + 1)])) {
            return ((_returnReplacementOperator2721.is("NULL")) ? ( null ) : (src[srcPos] ? '3' : '2'));
        } 
        return ((_returnReplacementOperator2722.is("NULL")) ? ( null ) : (src[srcPos] ? '1' : '0'));
    }

    public static char binaryToHexDigitMsb0_4bits(final boolean[] src) {
        return ((_returnReplacementOperator2723.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(src, 0)));
    }

    public static char binaryToHexDigitMsb0_4bits(final boolean[] src, final int srcPos) {
        if ((src.length) > 8) {
            throw new java.lang.IllegalArgumentException(("src.length>8: src.length=" + (src.length)));
        } 
        if (((src.length) - srcPos) < 4) {
            throw new java.lang.IllegalArgumentException(((("src.length-srcPos<4: src.length=" + (src.length)) + ", srcPos=") + srcPos));
        } 
        if (src[(srcPos + 3)]) {
            if (src[(srcPos + 2)]) {
                if (src[(srcPos + 1)]) {
                    return ((_returnReplacementOperator2724.is("NULL")) ? ( null ) : (src[srcPos] ? 'f' : '7'));
                } 
                return ((_returnReplacementOperator2725.is("NULL")) ? ( null ) : (src[srcPos] ? 'b' : '3'));
            } 
            if (src[(srcPos + 1)]) {
                return ((_returnReplacementOperator2726.is("NULL")) ? ( null ) : (src[srcPos] ? 'd' : '5'));
            } 
            return ((_returnReplacementOperator2727.is("NULL")) ? ( null ) : (src[srcPos] ? '9' : '1'));
        } 
        if (src[(srcPos + 2)]) {
            if (src[(srcPos + 1)]) {
                return ((_returnReplacementOperator2728.is("NULL")) ? ( null ) : (src[srcPos] ? 'e' : '6'));
            } 
            return ((_returnReplacementOperator2729.is("NULL")) ? ( null ) : (src[srcPos] ? 'a' : '2'));
        } 
        if (src[(srcPos + 1)]) {
            return ((_returnReplacementOperator2730.is("NULL")) ? ( null ) : (src[srcPos] ? 'c' : '4'));
        } 
        return ((_returnReplacementOperator2731.is("NULL")) ? ( null ) : (src[srcPos] ? '8' : '0'));
    }

    public static char binaryBeMsb0ToHexDigit(final boolean[] src) {
        return ((_returnReplacementOperator2705.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(src, 0)));
    }

    public static char binaryBeMsb0ToHexDigit(boolean[] src, int srcPos) {
        if ((src.length) == 0) {
            throw new java.lang.IllegalArgumentException("Cannot convert an empty array.");
        } 
        final int beSrcPos = ((src.length) - 1) - srcPos;
        final int srcLen = java.lang.Math.min(4, (beSrcPos + 1));
        final boolean[] paddedSrc = new boolean[4];
        java.lang.System.arraycopy(src, ((beSrcPos + 1) - srcLen), paddedSrc, (4 - srcLen), srcLen);
        src = paddedSrc;
        srcPos = 0;
        if (src[srcPos]) {
            if (((src.length) > (srcPos + 1)) && (src[(srcPos + 1)])) {
                if (((src.length) > (srcPos + 2)) && (src[(srcPos + 2)])) {
                    return ((_returnReplacementOperator2706.is("NULL")) ? ( null ) : (((src.length) > (srcPos + 3)) && (src[(srcPos + 3)]) ? 'f' : 'e'));
                } 
                return ((_returnReplacementOperator2707.is("NULL")) ? ( null ) : (((src.length) > (srcPos + 3)) && (src[(srcPos + 3)]) ? 'd' : 'c'));
            } 
            if (((src.length) > (srcPos + 2)) && (src[(srcPos + 2)])) {
                return ((_returnReplacementOperator2708.is("NULL")) ? ( null ) : (((src.length) > (srcPos + 3)) && (src[(srcPos + 3)]) ? 'b' : 'a'));
            } 
            return ((_returnReplacementOperator2709.is("NULL")) ? ( null ) : (((src.length) > (srcPos + 3)) && (src[(srcPos + 3)]) ? '9' : '8'));
        } 
        if (((src.length) > (srcPos + 1)) && (src[(srcPos + 1)])) {
            if (((src.length) > (srcPos + 2)) && (src[(srcPos + 2)])) {
                return ((_returnReplacementOperator2710.is("NULL")) ? ( null ) : (((src.length) > (srcPos + 3)) && (src[(srcPos + 3)]) ? '7' : '6'));
            } 
            return ((_returnReplacementOperator2711.is("NULL")) ? ( null ) : (((src.length) > (srcPos + 3)) && (src[(srcPos + 3)]) ? '5' : '4'));
        } 
        if (((src.length) > (srcPos + 2)) && (src[(srcPos + 2)])) {
            return ((_returnReplacementOperator2712.is("NULL")) ? ( null ) : (((src.length) > (srcPos + 3)) && (src[(srcPos + 3)]) ? '3' : '2'));
        } 
        return ((_returnReplacementOperator2713.is("NULL")) ? ( null ) : (((src.length) > (srcPos + 3)) && (src[(srcPos + 3)]) ? '1' : '0'));
    }

    public static char intToHexDigit(final int nibble) {
        final char c = java.lang.Character.forDigit(nibble, 16);
        if (c == (java.lang.Character.MIN_VALUE)) {
            throw new java.lang.IllegalArgumentException(("nibble value not between 0 and 15: " + nibble));
        } 
        return ((_returnReplacementOperator2732.is("NULL")) ? ( null ) : (c));
    }

    public static char intToHexDigitMsb0(final int nibble) {
        switch (nibble) {
            case 0 :
                return ((_returnReplacementOperator2733.is("NULL")) ? ( null ) : ('0'));
            case 1 :
                return ((_returnReplacementOperator2734.is("NULL")) ? ( null ) : ('8'));
            case 2 :
                return ((_returnReplacementOperator2735.is("NULL")) ? ( null ) : ('4'));
            case 3 :
                return ((_returnReplacementOperator2736.is("NULL")) ? ( null ) : ('c'));
            case 4 :
                return ((_returnReplacementOperator2737.is("NULL")) ? ( null ) : ('2'));
            case 5 :
                return ((_returnReplacementOperator2738.is("NULL")) ? ( null ) : ('a'));
            case 6 :
                return ((_returnReplacementOperator2739.is("NULL")) ? ( null ) : ('6'));
            case 7 :
                return ((_returnReplacementOperator2740.is("NULL")) ? ( null ) : ('e'));
            case 8 :
                return ((_returnReplacementOperator2741.is("NULL")) ? ( null ) : ('1'));
            case 9 :
                return ((_returnReplacementOperator2742.is("NULL")) ? ( null ) : ('9'));
            case 10 :
                return ((_returnReplacementOperator2743.is("NULL")) ? ( null ) : ('5'));
            case 11 :
                return ((_returnReplacementOperator2744.is("NULL")) ? ( null ) : ('d'));
            case 12 :
                return ((_returnReplacementOperator2745.is("NULL")) ? ( null ) : ('3'));
            case 13 :
                return ((_returnReplacementOperator2746.is("NULL")) ? ( null ) : ('b'));
            case 14 :
                return ((_returnReplacementOperator2747.is("NULL")) ? ( null ) : ('7'));
            case 15 :
                return ((_returnReplacementOperator2748.is("NULL")) ? ( null ) : ('f'));
            default :
                throw new java.lang.IllegalArgumentException(("nibble value not between 0 and 15: " + nibble));
        }
    }

    public static long intArrayToLong(final int[] src, final int srcPos, final long dstInit, final int dstPos, final int nInts) {
        if ((((src.length) == 0) && (srcPos == 0)) || (0 == nInts)) {
            return ((_returnReplacementOperator2791.is("NULL")) ? ( null ) : (dstInit));
        } 
        if ((((nInts - 1) * 32) + dstPos) >= 64) {
            throw new java.lang.IllegalArgumentException("(nInts-1)*32+dstPos is greather or equal to than 64");
        } 
        long out = dstInit;
        for (int i = 0 ; i < nInts ; i++) {
            final int shift = (i * 32) + dstPos;
            final long bits = (4294967295L & (src[(i + srcPos)])) << shift;
            final long mask = 4294967295L << shift;
            out = (out & (~mask)) | bits;
        }
        return ((_returnReplacementOperator2792.is("NULL")) ? ( null ) : (out));
    }

    public static long shortArrayToLong(final short[] src, final int srcPos, final long dstInit, final int dstPos, final int nShorts) {
        if ((((src.length) == 0) && (srcPos == 0)) || (0 == nShorts)) {
            return ((_returnReplacementOperator2793.is("NULL")) ? ( null ) : (dstInit));
        } 
        if ((((nShorts - 1) * 16) + dstPos) >= 64) {
            throw new java.lang.IllegalArgumentException("(nShorts-1)*16+dstPos is greather or equal to than 64");
        } 
        long out = dstInit;
        for (int i = 0 ; i < nShorts ; i++) {
            final int shift = (i * 16) + dstPos;
            final long bits = (65535L & (src[(i + srcPos)])) << shift;
            final long mask = 65535L << shift;
            out = (out & (~mask)) | bits;
        }
        return ((_returnReplacementOperator2794.is("NULL")) ? ( null ) : (out));
    }

    public static int shortArrayToInt(final short[] src, final int srcPos, final int dstInit, final int dstPos, final int nShorts) {
        if ((((src.length) == 0) && (srcPos == 0)) || (0 == nShorts)) {
            return ((_returnReplacementOperator2772.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2772.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2772.is("ZERO")) ? ( 0 ) : (dstInit));
        } 
        if ((((nShorts - 1) * 16) + dstPos) >= 32) {
            throw new java.lang.IllegalArgumentException("(nShorts-1)*16+dstPos is greather or equal to than 32");
        } 
        int out = dstInit;
        for (int i = 0 ; i < nShorts ; i++) {
            final int shift = (i * 16) + dstPos;
            final int bits = (65535 & (src[(i + srcPos)])) << shift;
            final int mask = 65535 << shift;
            out = (out & (~mask)) | bits;
        }
        return ((_returnReplacementOperator2773.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2773.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2773.is("ZERO")) ? ( 0 ) : (out));
    }

    public static long byteArrayToLong(final byte[] src, final int srcPos, final long dstInit, final int dstPos, final int nBytes) {
        if ((((src.length) == 0) && (srcPos == 0)) || (0 == nBytes)) {
            return ((_returnReplacementOperator2787.is("NULL")) ? ( null ) : (dstInit));
        } 
        if ((((nBytes - 1) * 8) + dstPos) >= 64) {
            throw new java.lang.IllegalArgumentException("(nBytes-1)*8+dstPos is greather or equal to than 64");
        } 
        long out = dstInit;
        for (int i = 0 ; i < nBytes ; i++) {
            final int shift = (i * 8) + dstPos;
            final long bits = (255L & (src[(i + srcPos)])) << shift;
            final long mask = 255L << shift;
            out = (out & (~mask)) | bits;
        }
        return ((_returnReplacementOperator2788.is("NULL")) ? ( null ) : (out));
    }

    public static int byteArrayToInt(final byte[] src, final int srcPos, final int dstInit, final int dstPos, final int nBytes) {
        if ((((src.length) == 0) && (srcPos == 0)) || (0 == nBytes)) {
            return ((_returnReplacementOperator2751.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2751.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2751.is("ZERO")) ? ( 0 ) : (dstInit));
        } 
        if ((((nBytes - 1) * 8) + dstPos) >= 32) {
            throw new java.lang.IllegalArgumentException("(nBytes-1)*8+dstPos is greather or equal to than 32");
        } 
        int out = dstInit;
        for (int i = 0 ; i < nBytes ; i++) {
            final int shift = (i * 8) + dstPos;
            final int bits = (255 & (src[(i + srcPos)])) << shift;
            final int mask = 255 << shift;
            out = (out & (~mask)) | bits;
        }
        return ((_returnReplacementOperator2752.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2752.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2752.is("ZERO")) ? ( 0 ) : (out));
    }

    public static short byteArrayToShort(final byte[] src, final int srcPos, final short dstInit, final int dstPos, final int nBytes) {
        if ((((src.length) == 0) && (srcPos == 0)) || (0 == nBytes)) {
            return ((_returnReplacementOperator2797.is("NULL")) ? ( null ) : (dstInit));
        } 
        if ((((nBytes - 1) * 8) + dstPos) >= 16) {
            throw new java.lang.IllegalArgumentException("(nBytes-1)*8+dstPos is greather or equal to than 16");
        } 
        short out = dstInit;
        for (int i = 0 ; i < nBytes ; i++) {
            final int shift = (i * 8) + dstPos;
            final int bits = (255 & (src[(i + srcPos)])) << shift;
            final int mask = 255 << shift;
            out = ((short)((out & (~mask)) | bits));
        }
        return ((_returnReplacementOperator2798.is("NULL")) ? ( null ) : (out));
    }

    public static long hexToLong(final java.lang.String src, final int srcPos, final long dstInit, final int dstPos, final int nHex) {
        if (0 == nHex) {
            return ((_returnReplacementOperator2789.is("NULL")) ? ( null ) : (dstInit));
        } 
        if ((((nHex - 1) * 4) + dstPos) >= 64) {
            throw new java.lang.IllegalArgumentException("(nHexs-1)*4+dstPos is greather or equal to than 64");
        } 
        long out = dstInit;
        for (int i = 0 ; i < nHex ; i++) {
            final int shift = (i * 4) + dstPos;
            final long bits = (15L & (org.apache.commons.lang3.Conversion.hexDigitToInt(src.charAt((i + srcPos))))) << shift;
            final long mask = 15L << shift;
            out = (out & (~mask)) | bits;
        }
        return ((_returnReplacementOperator2790.is("NULL")) ? ( null ) : (out));
    }

    public static int hexToInt(final java.lang.String src, final int srcPos, final int dstInit, final int dstPos, final int nHex) {
        if (0 == nHex) {
            return ((_returnReplacementOperator2770.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2770.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2770.is("ZERO")) ? ( 0 ) : (dstInit));
        } 
        if ((((nHex - 1) * 4) + dstPos) >= 32) {
            throw new java.lang.IllegalArgumentException("(nHexs-1)*4+dstPos is greather or equal to than 32");
        } 
        int out = dstInit;
        for (int i = 0 ; i < nHex ; i++) {
            final int shift = (i * 4) + dstPos;
            final int bits = (15 & (org.apache.commons.lang3.Conversion.hexDigitToInt(src.charAt((i + srcPos))))) << shift;
            final int mask = 15 << shift;
            out = (out & (~mask)) | bits;
        }
        return ((_returnReplacementOperator2771.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2771.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2771.is("ZERO")) ? ( 0 ) : (out));
    }

    public static short hexToShort(final java.lang.String src, final int srcPos, final short dstInit, final int dstPos, final int nHex) {
        if (0 == nHex) {
            return ((_returnReplacementOperator2799.is("NULL")) ? ( null ) : (dstInit));
        } 
        if ((((nHex - 1) * 4) + dstPos) >= 16) {
            throw new java.lang.IllegalArgumentException("(nHexs-1)*4+dstPos is greather or equal to than 16");
        } 
        short out = dstInit;
        for (int i = 0 ; i < nHex ; i++) {
            final int shift = (i * 4) + dstPos;
            final int bits = (15 & (org.apache.commons.lang3.Conversion.hexDigitToInt(src.charAt((i + srcPos))))) << shift;
            final int mask = 15 << shift;
            out = ((short)((out & (~mask)) | bits));
        }
        return ((_returnReplacementOperator2800.is("NULL")) ? ( null ) : (out));
    }

    public static byte hexToByte(final java.lang.String src, final int srcPos, final byte dstInit, final int dstPos, final int nHex) {
        if (0 == nHex) {
            return ((_returnReplacementOperator2695.is("NULL")) ? ( null ) : (dstInit));
        } 
        if ((((nHex - 1) * 4) + dstPos) >= 8) {
            throw new java.lang.IllegalArgumentException("(nHexs-1)*4+dstPos is greather or equal to than 8");
        } 
        byte out = dstInit;
        for (int i = 0 ; i < nHex ; i++) {
            final int shift = (i * 4) + dstPos;
            final int bits = (15 & (org.apache.commons.lang3.Conversion.hexDigitToInt(src.charAt((i + srcPos))))) << shift;
            final int mask = 15 << shift;
            out = ((byte)((out & (~mask)) | bits));
        }
        return ((_returnReplacementOperator2696.is("NULL")) ? ( null ) : (out));
    }

    public static long binaryToLong(final boolean[] src, final int srcPos, final long dstInit, final int dstPos, final int nBools) {
        if ((((src.length) == 0) && (srcPos == 0)) || (0 == nBools)) {
            return ((_returnReplacementOperator2785.is("NULL")) ? ( null ) : (dstInit));
        } 
        if (((nBools - 1) + dstPos) >= 64) {
            throw new java.lang.IllegalArgumentException("nBools-1+dstPos is greather or equal to than 64");
        } 
        long out = dstInit;
        for (int i = 0 ; i < nBools ; i++) {
            final int shift = i + dstPos;
            final long bits = (src[(i + srcPos)] ? 1L : 0) << shift;
            final long mask = 1L << shift;
            out = (out & (~mask)) | bits;
        }
        return ((_returnReplacementOperator2786.is("NULL")) ? ( null ) : (out));
    }

    public static int binaryToInt(final boolean[] src, final int srcPos, final int dstInit, final int dstPos, final int nBools) {
        if ((((src.length) == 0) && (srcPos == 0)) || (0 == nBools)) {
            return ((_returnReplacementOperator2749.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2749.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2749.is("ZERO")) ? ( 0 ) : (dstInit));
        } 
        if (((nBools - 1) + dstPos) >= 32) {
            throw new java.lang.IllegalArgumentException("nBools-1+dstPos is greather or equal to than 32");
        } 
        int out = dstInit;
        for (int i = 0 ; i < nBools ; i++) {
            final int shift = i + dstPos;
            final int bits = (src[(i + srcPos)] ? 1 : 0) << shift;
            final int mask = 1 << shift;
            out = (out & (~mask)) | bits;
        }
        return ((_returnReplacementOperator2750.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2750.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2750.is("ZERO")) ? ( 0 ) : (out));
    }

    public static short binaryToShort(final boolean[] src, final int srcPos, final short dstInit, final int dstPos, final int nBools) {
        if ((((src.length) == 0) && (srcPos == 0)) || (0 == nBools)) {
            return ((_returnReplacementOperator2795.is("NULL")) ? ( null ) : (dstInit));
        } 
        if (((nBools - 1) + dstPos) >= 16) {
            throw new java.lang.IllegalArgumentException("nBools-1+dstPos is greather or equal to than 16");
        } 
        short out = dstInit;
        for (int i = 0 ; i < nBools ; i++) {
            final int shift = i + dstPos;
            final int bits = (src[(i + srcPos)] ? 1 : 0) << shift;
            final int mask = 1 << shift;
            out = ((short)((out & (~mask)) | bits));
        }
        return ((_returnReplacementOperator2796.is("NULL")) ? ( null ) : (out));
    }

    public static byte binaryToByte(final boolean[] src, final int srcPos, final byte dstInit, final int dstPos, final int nBools) {
        if ((((src.length) == 0) && (srcPos == 0)) || (0 == nBools)) {
            return ((_returnReplacementOperator2693.is("NULL")) ? ( null ) : (dstInit));
        } 
        if (((nBools - 1) + dstPos) >= 8) {
            throw new java.lang.IllegalArgumentException("nBools-1+dstPos is greather or equal to than 8");
        } 
        byte out = dstInit;
        for (int i = 0 ; i < nBools ; i++) {
            final int shift = i + dstPos;
            final int bits = (src[(i + srcPos)] ? 1 : 0) << shift;
            final int mask = 1 << shift;
            out = ((byte)((out & (~mask)) | bits));
        }
        return ((_returnReplacementOperator2694.is("NULL")) ? ( null ) : (out));
    }

    public static int[] longToIntArray(final long src, final int srcPos, final int[] dst, final int dstPos, final int nInts) {
        if (0 == nInts) {
            return ((_returnReplacementOperator2774.is("NULL")) ? ( null ) : (dst));
        } 
        if ((((nInts - 1) * 32) + srcPos) >= 64) {
            throw new java.lang.IllegalArgumentException("(nInts-1)*32+srcPos is greather or equal to than 64");
        } 
        for (int i = 0 ; i < nInts ; i++) {
            final int shift = (i * 32) + srcPos;
            dst[(dstPos + i)] = ((int)(-1 & (src >> shift)));
        }
        return ((_returnReplacementOperator2775.is("NULL")) ? ( null ) : (dst));
    }

    public static short[] longToShortArray(final long src, final int srcPos, final short[] dst, final int dstPos, final int nShorts) {
        if (0 == nShorts) {
            return ((_returnReplacementOperator2803.is("NULL")) ? ( null ) : (dst));
        } 
        if ((((nShorts - 1) * 16) + srcPos) >= 64) {
            throw new java.lang.IllegalArgumentException("(nShorts-1)*16+srcPos is greather or equal to than 64");
        } 
        for (int i = 0 ; i < nShorts ; i++) {
            final int shift = (i * 16) + srcPos;
            dst[(dstPos + i)] = ((short)(65535 & (src >> shift)));
        }
        return ((_returnReplacementOperator2804.is("NULL")) ? ( null ) : (dst));
    }

    public static short[] intToShortArray(final int src, final int srcPos, final short[] dst, final int dstPos, final int nShorts) {
        if (0 == nShorts) {
            return ((_returnReplacementOperator2801.is("NULL")) ? ( null ) : (dst));
        } 
        if ((((nShorts - 1) * 16) + srcPos) >= 32) {
            throw new java.lang.IllegalArgumentException("(nShorts-1)*16+srcPos is greather or equal to than 32");
        } 
        for (int i = 0 ; i < nShorts ; i++) {
            final int shift = (i * 16) + srcPos;
            dst[(dstPos + i)] = ((short)(65535 & (src >> shift)));
        }
        return ((_returnReplacementOperator2802.is("NULL")) ? ( null ) : (dst));
    }

    public static byte[] longToByteArray(final long src, final int srcPos, final byte[] dst, final int dstPos, final int nBytes) {
        if (0 == nBytes) {
            return ((_returnReplacementOperator2699.is("NULL")) ? ( null ) : (dst));
        } 
        if ((((nBytes - 1) * 8) + srcPos) >= 64) {
            throw new java.lang.IllegalArgumentException("(nBytes-1)*8+srcPos is greather or equal to than 64");
        } 
        for (int i = 0 ; i < nBytes ; i++) {
            final int shift = (i * 8) + srcPos;
            dst[(dstPos + i)] = ((byte)(255 & (src >> shift)));
        }
        return ((_returnReplacementOperator2700.is("NULL")) ? ( null ) : (dst));
    }

    public static byte[] intToByteArray(final int src, final int srcPos, final byte[] dst, final int dstPos, final int nBytes) {
        if (0 == nBytes) {
            return ((_returnReplacementOperator2697.is("NULL")) ? ( null ) : (dst));
        } 
        if ((((nBytes - 1) * 8) + srcPos) >= 32) {
            throw new java.lang.IllegalArgumentException("(nBytes-1)*8+srcPos is greather or equal to than 32");
        } 
        for (int i = 0 ; i < nBytes ; i++) {
            final int shift = (i * 8) + srcPos;
            dst[(dstPos + i)] = ((byte)(255 & (src >> shift)));
        }
        return ((_returnReplacementOperator2698.is("NULL")) ? ( null ) : (dst));
    }

    public static byte[] shortToByteArray(final short src, final int srcPos, final byte[] dst, final int dstPos, final int nBytes) {
        if (0 == nBytes) {
            return ((_returnReplacementOperator2701.is("NULL")) ? ( null ) : (dst));
        } 
        if ((((nBytes - 1) * 8) + srcPos) >= 16) {
            throw new java.lang.IllegalArgumentException("(nBytes-1)*8+srcPos is greather or equal to than 16");
        } 
        for (int i = 0 ; i < nBytes ; i++) {
            final int shift = (i * 8) + srcPos;
            dst[(dstPos + i)] = ((byte)(255 & (src >> shift)));
        }
        return ((_returnReplacementOperator2702.is("NULL")) ? ( null ) : (dst));
    }

    public static java.lang.String longToHex(final long src, final int srcPos, final java.lang.String dstInit, final int dstPos, final int nHexs) {
        if (0 == nHexs) {
            return ((_returnReplacementOperator2780.is("NULL")) ? ( null ) : (dstInit));
        } 
        if ((((nHexs - 1) * 4) + srcPos) >= 64) {
            throw new java.lang.IllegalArgumentException("(nHexs-1)*4+srcPos is greather or equal to than 64");
        } 
        final java.lang.StringBuilder sb = new java.lang.StringBuilder(dstInit);
        int append = sb.length();
        for (int i = 0 ; i < nHexs ; i++) {
            final int shift = (i * 4) + srcPos;
            final int bits = ((int)(15 & (src >> shift)));
            if ((dstPos + i) == append) {
                ++append;
                sb.append(org.apache.commons.lang3.Conversion.intToHexDigit(bits));
            } else {
                sb.setCharAt((dstPos + i), org.apache.commons.lang3.Conversion.intToHexDigit(bits));
            }
        }
        return ((_returnReplacementOperator2781.is("NULL")) ? ( null ) : (sb.toString()));
    }

    public static java.lang.String intToHex(final int src, final int srcPos, final java.lang.String dstInit, final int dstPos, final int nHexs) {
        if (0 == nHexs) {
            return ((_returnReplacementOperator2778.is("NULL")) ? ( null ) : (dstInit));
        } 
        if ((((nHexs - 1) * 4) + srcPos) >= 32) {
            throw new java.lang.IllegalArgumentException("(nHexs-1)*4+srcPos is greather or equal to than 32");
        } 
        final java.lang.StringBuilder sb = new java.lang.StringBuilder(dstInit);
        int append = sb.length();
        for (int i = 0 ; i < nHexs ; i++) {
            final int shift = (i * 4) + srcPos;
            final int bits = 15 & (src >> shift);
            if ((dstPos + i) == append) {
                ++append;
                sb.append(org.apache.commons.lang3.Conversion.intToHexDigit(bits));
            } else {
                sb.setCharAt((dstPos + i), org.apache.commons.lang3.Conversion.intToHexDigit(bits));
            }
        }
        return ((_returnReplacementOperator2779.is("NULL")) ? ( null ) : (sb.toString()));
    }

    public static java.lang.String shortToHex(final short src, final int srcPos, final java.lang.String dstInit, final int dstPos, final int nHexs) {
        if (0 == nHexs) {
            return ((_returnReplacementOperator2782.is("NULL")) ? ( null ) : (dstInit));
        } 
        if ((((nHexs - 1) * 4) + srcPos) >= 16) {
            throw new java.lang.IllegalArgumentException("(nHexs-1)*4+srcPos is greather or equal to than 16");
        } 
        final java.lang.StringBuilder sb = new java.lang.StringBuilder(dstInit);
        int append = sb.length();
        for (int i = 0 ; i < nHexs ; i++) {
            final int shift = (i * 4) + srcPos;
            final int bits = 15 & (src >> shift);
            if ((dstPos + i) == append) {
                ++append;
                sb.append(org.apache.commons.lang3.Conversion.intToHexDigit(bits));
            } else {
                sb.setCharAt((dstPos + i), org.apache.commons.lang3.Conversion.intToHexDigit(bits));
            }
        }
        return ((_returnReplacementOperator2783.is("NULL")) ? ( null ) : (sb.toString()));
    }

    public static java.lang.String byteToHex(final byte src, final int srcPos, final java.lang.String dstInit, final int dstPos, final int nHexs) {
        if (0 == nHexs) {
            return ((_returnReplacementOperator2776.is("NULL")) ? ( null ) : (dstInit));
        } 
        if ((((nHexs - 1) * 4) + srcPos) >= 8) {
            throw new java.lang.IllegalArgumentException("(nHexs-1)*4+srcPos is greather or equal to than 8");
        } 
        final java.lang.StringBuilder sb = new java.lang.StringBuilder(dstInit);
        int append = sb.length();
        for (int i = 0 ; i < nHexs ; i++) {
            final int shift = (i * 4) + srcPos;
            final int bits = 15 & (src >> shift);
            if ((dstPos + i) == append) {
                ++append;
                sb.append(org.apache.commons.lang3.Conversion.intToHexDigit(bits));
            } else {
                sb.setCharAt((dstPos + i), org.apache.commons.lang3.Conversion.intToHexDigit(bits));
            }
        }
        return ((_returnReplacementOperator2777.is("NULL")) ? ( null ) : (sb.toString()));
    }

    public static boolean[] longToBinary(final long src, final int srcPos, final boolean[] dst, final int dstPos, final int nBools) {
        if (0 == nBools) {
            return ((_returnReplacementOperator2689.is("NULL")) ? ( null ) : (dst));
        } 
        if (((nBools - 1) + srcPos) >= 64) {
            throw new java.lang.IllegalArgumentException("nBools-1+srcPos is greather or equal to than 64");
        } 
        for (int i = 0 ; i < nBools ; i++) {
            final int shift = i + srcPos;
            dst[(dstPos + i)] = (1 & (src >> shift)) != 0;
        }
        return ((_returnReplacementOperator2690.is("NULL")) ? ( null ) : (dst));
    }

    public static boolean[] intToBinary(final int src, final int srcPos, final boolean[] dst, final int dstPos, final int nBools) {
        if (0 == nBools) {
            return ((_returnReplacementOperator2687.is("NULL")) ? ( null ) : (dst));
        } 
        if (((nBools - 1) + srcPos) >= 32) {
            throw new java.lang.IllegalArgumentException("nBools-1+srcPos is greather or equal to than 32");
        } 
        for (int i = 0 ; i < nBools ; i++) {
            final int shift = i + srcPos;
            dst[(dstPos + i)] = (1 & (src >> shift)) != 0;
        }
        return ((_returnReplacementOperator2688.is("NULL")) ? ( null ) : (dst));
    }

    public static boolean[] shortToBinary(final short src, final int srcPos, final boolean[] dst, final int dstPos, final int nBools) {
        if (0 == nBools) {
            return ((_returnReplacementOperator2691.is("NULL")) ? ( null ) : (dst));
        } 
        if (((nBools - 1) + srcPos) >= 16) {
            throw new java.lang.IllegalArgumentException("nBools-1+srcPos is greather or equal to than 16");
        } 
        assert (nBools - 1) < (16 - srcPos);
        for (int i = 0 ; i < nBools ; i++) {
            final int shift = i + srcPos;
            dst[(dstPos + i)] = (1 & (src >> shift)) != 0;
        }
        return ((_returnReplacementOperator2692.is("NULL")) ? ( null ) : (dst));
    }

    public static boolean[] byteToBinary(final byte src, final int srcPos, final boolean[] dst, final int dstPos, final int nBools) {
        if (0 == nBools) {
            return ((_returnReplacementOperator2653.is("NULL")) ? ( null ) : (dst));
        } 
        if (((nBools - 1) + srcPos) >= 8) {
            throw new java.lang.IllegalArgumentException("nBools-1+srcPos is greather or equal to than 8");
        } 
        for (int i = 0 ; i < nBools ; i++) {
            final int shift = i + srcPos;
            dst[(dstPos + i)] = (1 & (src >> shift)) != 0;
        }
        return ((_returnReplacementOperator2654.is("NULL")) ? ( null ) : (dst));
    }

    public static byte[] uuidToByteArray(final java.util.UUID src, final byte[] dst, final int dstPos, final int nBytes) {
        if (0 == nBytes) {
            return ((_returnReplacementOperator2703.is("NULL")) ? ( null ) : (dst));
        } 
        if (nBytes > 16) {
            throw new java.lang.IllegalArgumentException("nBytes is greather than 16");
        } 
        org.apache.commons.lang3.Conversion.longToByteArray(src.getMostSignificantBits(), 0, dst, dstPos, (nBytes > 8 ? 8 : nBytes));
        if (nBytes >= 8) {
            org.apache.commons.lang3.Conversion.longToByteArray(src.getLeastSignificantBits(), 0, dst, (dstPos + 8), (nBytes - 8));
        } 
        return ((_returnReplacementOperator2704.is("NULL")) ? ( null ) : (dst));
    }

    public static java.util.UUID byteArrayToUuid(final byte[] src, final int srcPos) {
        if (((src.length) - srcPos) < 16) {
            throw new java.lang.IllegalArgumentException("Need at least 16 bytes for UUID");
        } 
        return ((_returnReplacementOperator2784.is("NULL")) ? ( null ) : (new java.util.UUID(org.apache.commons.lang3.Conversion.byteArrayToLong(src, srcPos, 0, 0, 8) , org.apache.commons.lang3.Conversion.byteArrayToLong(src, (srcPos + 8), 0, 0, 8))));
    }

    private static final metamutator.Selector _returnReplacementOperator2653 = metamutator.Selector.of(2653,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2653");

    private static final metamutator.Selector _returnReplacementOperator2654 = metamutator.Selector.of(2654,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2654");

    private static final metamutator.Selector _returnReplacementOperator2655 = metamutator.Selector.of(2655,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2655");

    private static final metamutator.Selector _returnReplacementOperator2656 = metamutator.Selector.of(2656,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2656");

    private static final metamutator.Selector _returnReplacementOperator2657 = metamutator.Selector.of(2657,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2657");

    private static final metamutator.Selector _returnReplacementOperator2658 = metamutator.Selector.of(2658,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2658");

    private static final metamutator.Selector _returnReplacementOperator2659 = metamutator.Selector.of(2659,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2659");

    private static final metamutator.Selector _returnReplacementOperator2660 = metamutator.Selector.of(2660,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2660");

    private static final metamutator.Selector _returnReplacementOperator2661 = metamutator.Selector.of(2661,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2661");

    private static final metamutator.Selector _returnReplacementOperator2662 = metamutator.Selector.of(2662,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2662");

    private static final metamutator.Selector _returnReplacementOperator2663 = metamutator.Selector.of(2663,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2663");

    private static final metamutator.Selector _returnReplacementOperator2664 = metamutator.Selector.of(2664,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2664");

    private static final metamutator.Selector _returnReplacementOperator2665 = metamutator.Selector.of(2665,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2665");

    private static final metamutator.Selector _returnReplacementOperator2666 = metamutator.Selector.of(2666,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2666");

    private static final metamutator.Selector _returnReplacementOperator2667 = metamutator.Selector.of(2667,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2667");

    private static final metamutator.Selector _returnReplacementOperator2668 = metamutator.Selector.of(2668,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2668");

    private static final metamutator.Selector _returnReplacementOperator2669 = metamutator.Selector.of(2669,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2669");

    private static final metamutator.Selector _returnReplacementOperator2670 = metamutator.Selector.of(2670,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2670");

    private static final metamutator.Selector _returnReplacementOperator2671 = metamutator.Selector.of(2671,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2671");

    private static final metamutator.Selector _returnReplacementOperator2672 = metamutator.Selector.of(2672,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2672");

    private static final metamutator.Selector _returnReplacementOperator2673 = metamutator.Selector.of(2673,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2673");

    private static final metamutator.Selector _returnReplacementOperator2674 = metamutator.Selector.of(2674,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2674");

    private static final metamutator.Selector _returnReplacementOperator2675 = metamutator.Selector.of(2675,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2675");

    private static final metamutator.Selector _returnReplacementOperator2676 = metamutator.Selector.of(2676,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2676");

    private static final metamutator.Selector _returnReplacementOperator2677 = metamutator.Selector.of(2677,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2677");

    private static final metamutator.Selector _returnReplacementOperator2678 = metamutator.Selector.of(2678,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2678");

    private static final metamutator.Selector _returnReplacementOperator2679 = metamutator.Selector.of(2679,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2679");

    private static final metamutator.Selector _returnReplacementOperator2680 = metamutator.Selector.of(2680,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2680");

    private static final metamutator.Selector _returnReplacementOperator2681 = metamutator.Selector.of(2681,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2681");

    private static final metamutator.Selector _returnReplacementOperator2682 = metamutator.Selector.of(2682,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2682");

    private static final metamutator.Selector _returnReplacementOperator2683 = metamutator.Selector.of(2683,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2683");

    private static final metamutator.Selector _returnReplacementOperator2684 = metamutator.Selector.of(2684,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2684");

    private static final metamutator.Selector _returnReplacementOperator2685 = metamutator.Selector.of(2685,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2685");

    private static final metamutator.Selector _returnReplacementOperator2686 = metamutator.Selector.of(2686,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2686");

    private static final metamutator.Selector _returnReplacementOperator2687 = metamutator.Selector.of(2687,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2687");

    private static final metamutator.Selector _returnReplacementOperator2688 = metamutator.Selector.of(2688,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2688");

    private static final metamutator.Selector _returnReplacementOperator2689 = metamutator.Selector.of(2689,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2689");

    private static final metamutator.Selector _returnReplacementOperator2690 = metamutator.Selector.of(2690,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2690");

    private static final metamutator.Selector _returnReplacementOperator2691 = metamutator.Selector.of(2691,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2691");

    private static final metamutator.Selector _returnReplacementOperator2692 = metamutator.Selector.of(2692,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2692");

    private static final metamutator.Selector _returnReplacementOperator2693 = metamutator.Selector.of(2693,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2693");

    private static final metamutator.Selector _returnReplacementOperator2694 = metamutator.Selector.of(2694,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2694");

    private static final metamutator.Selector _returnReplacementOperator2695 = metamutator.Selector.of(2695,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2695");

    private static final metamutator.Selector _returnReplacementOperator2696 = metamutator.Selector.of(2696,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2696");

    private static final metamutator.Selector _returnReplacementOperator2697 = metamutator.Selector.of(2697,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2697");

    private static final metamutator.Selector _returnReplacementOperator2698 = metamutator.Selector.of(2698,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2698");

    private static final metamutator.Selector _returnReplacementOperator2699 = metamutator.Selector.of(2699,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2699");

    private static final metamutator.Selector _returnReplacementOperator2700 = metamutator.Selector.of(2700,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2700");

    private static final metamutator.Selector _returnReplacementOperator2701 = metamutator.Selector.of(2701,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2701");

    private static final metamutator.Selector _returnReplacementOperator2702 = metamutator.Selector.of(2702,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2702");

    private static final metamutator.Selector _returnReplacementOperator2703 = metamutator.Selector.of(2703,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2703");

    private static final metamutator.Selector _returnReplacementOperator2704 = metamutator.Selector.of(2704,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2704");

    private static final metamutator.Selector _returnReplacementOperator2705 = metamutator.Selector.of(2705,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2705");

    private static final metamutator.Selector _returnReplacementOperator2706 = metamutator.Selector.of(2706,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2706");

    private static final metamutator.Selector _returnReplacementOperator2707 = metamutator.Selector.of(2707,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2707");

    private static final metamutator.Selector _returnReplacementOperator2708 = metamutator.Selector.of(2708,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2708");

    private static final metamutator.Selector _returnReplacementOperator2709 = metamutator.Selector.of(2709,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2709");

    private static final metamutator.Selector _returnReplacementOperator2710 = metamutator.Selector.of(2710,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2710");

    private static final metamutator.Selector _returnReplacementOperator2711 = metamutator.Selector.of(2711,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2711");

    private static final metamutator.Selector _returnReplacementOperator2712 = metamutator.Selector.of(2712,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2712");

    private static final metamutator.Selector _returnReplacementOperator2713 = metamutator.Selector.of(2713,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2713");

    private static final metamutator.Selector _returnReplacementOperator2714 = metamutator.Selector.of(2714,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2714");

    private static final metamutator.Selector _returnReplacementOperator2715 = metamutator.Selector.of(2715,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2715");

    private static final metamutator.Selector _returnReplacementOperator2716 = metamutator.Selector.of(2716,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2716");

    private static final metamutator.Selector _returnReplacementOperator2717 = metamutator.Selector.of(2717,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2717");

    private static final metamutator.Selector _returnReplacementOperator2718 = metamutator.Selector.of(2718,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2718");

    private static final metamutator.Selector _returnReplacementOperator2719 = metamutator.Selector.of(2719,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2719");

    private static final metamutator.Selector _returnReplacementOperator2720 = metamutator.Selector.of(2720,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2720");

    private static final metamutator.Selector _returnReplacementOperator2721 = metamutator.Selector.of(2721,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2721");

    private static final metamutator.Selector _returnReplacementOperator2722 = metamutator.Selector.of(2722,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2722");

    private static final metamutator.Selector _returnReplacementOperator2723 = metamutator.Selector.of(2723,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2723");

    private static final metamutator.Selector _returnReplacementOperator2724 = metamutator.Selector.of(2724,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2724");

    private static final metamutator.Selector _returnReplacementOperator2725 = metamutator.Selector.of(2725,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2725");

    private static final metamutator.Selector _returnReplacementOperator2726 = metamutator.Selector.of(2726,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2726");

    private static final metamutator.Selector _returnReplacementOperator2727 = metamutator.Selector.of(2727,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2727");

    private static final metamutator.Selector _returnReplacementOperator2728 = metamutator.Selector.of(2728,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2728");

    private static final metamutator.Selector _returnReplacementOperator2729 = metamutator.Selector.of(2729,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2729");

    private static final metamutator.Selector _returnReplacementOperator2730 = metamutator.Selector.of(2730,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2730");

    private static final metamutator.Selector _returnReplacementOperator2731 = metamutator.Selector.of(2731,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2731");

    private static final metamutator.Selector _returnReplacementOperator2732 = metamutator.Selector.of(2732,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2732");

    private static final metamutator.Selector _returnReplacementOperator2733 = metamutator.Selector.of(2733,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2733");

    private static final metamutator.Selector _returnReplacementOperator2734 = metamutator.Selector.of(2734,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2734");

    private static final metamutator.Selector _returnReplacementOperator2735 = metamutator.Selector.of(2735,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2735");

    private static final metamutator.Selector _returnReplacementOperator2736 = metamutator.Selector.of(2736,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2736");

    private static final metamutator.Selector _returnReplacementOperator2737 = metamutator.Selector.of(2737,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2737");

    private static final metamutator.Selector _returnReplacementOperator2738 = metamutator.Selector.of(2738,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2738");

    private static final metamutator.Selector _returnReplacementOperator2739 = metamutator.Selector.of(2739,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2739");

    private static final metamutator.Selector _returnReplacementOperator2740 = metamutator.Selector.of(2740,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2740");

    private static final metamutator.Selector _returnReplacementOperator2741 = metamutator.Selector.of(2741,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2741");

    private static final metamutator.Selector _returnReplacementOperator2742 = metamutator.Selector.of(2742,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2742");

    private static final metamutator.Selector _returnReplacementOperator2743 = metamutator.Selector.of(2743,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2743");

    private static final metamutator.Selector _returnReplacementOperator2744 = metamutator.Selector.of(2744,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2744");

    private static final metamutator.Selector _returnReplacementOperator2745 = metamutator.Selector.of(2745,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2745");

    private static final metamutator.Selector _returnReplacementOperator2746 = metamutator.Selector.of(2746,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2746");

    private static final metamutator.Selector _returnReplacementOperator2747 = metamutator.Selector.of(2747,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2747");

    private static final metamutator.Selector _returnReplacementOperator2748 = metamutator.Selector.of(2748,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2748");

    private static final metamutator.Selector _returnReplacementOperator2749 = metamutator.Selector.of(2749,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2749");

    private static final metamutator.Selector _returnReplacementOperator2750 = metamutator.Selector.of(2750,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2750");

    private static final metamutator.Selector _returnReplacementOperator2751 = metamutator.Selector.of(2751,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2751");

    private static final metamutator.Selector _returnReplacementOperator2752 = metamutator.Selector.of(2752,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2752");

    private static final metamutator.Selector _returnReplacementOperator2753 = metamutator.Selector.of(2753,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2753");

    private static final metamutator.Selector _returnReplacementOperator2754 = metamutator.Selector.of(2754,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2754");

    private static final metamutator.Selector _returnReplacementOperator2755 = metamutator.Selector.of(2755,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2755");

    private static final metamutator.Selector _returnReplacementOperator2756 = metamutator.Selector.of(2756,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2756");

    private static final metamutator.Selector _returnReplacementOperator2757 = metamutator.Selector.of(2757,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2757");

    private static final metamutator.Selector _returnReplacementOperator2758 = metamutator.Selector.of(2758,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2758");

    private static final metamutator.Selector _returnReplacementOperator2759 = metamutator.Selector.of(2759,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2759");

    private static final metamutator.Selector _returnReplacementOperator2760 = metamutator.Selector.of(2760,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2760");

    private static final metamutator.Selector _returnReplacementOperator2761 = metamutator.Selector.of(2761,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2761");

    private static final metamutator.Selector _returnReplacementOperator2762 = metamutator.Selector.of(2762,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2762");

    private static final metamutator.Selector _returnReplacementOperator2763 = metamutator.Selector.of(2763,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2763");

    private static final metamutator.Selector _returnReplacementOperator2764 = metamutator.Selector.of(2764,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2764");

    private static final metamutator.Selector _returnReplacementOperator2765 = metamutator.Selector.of(2765,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2765");

    private static final metamutator.Selector _returnReplacementOperator2766 = metamutator.Selector.of(2766,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2766");

    private static final metamutator.Selector _returnReplacementOperator2767 = metamutator.Selector.of(2767,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2767");

    private static final metamutator.Selector _returnReplacementOperator2768 = metamutator.Selector.of(2768,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2768");

    private static final metamutator.Selector _returnReplacementOperator2769 = metamutator.Selector.of(2769,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2769");

    private static final metamutator.Selector _returnReplacementOperator2770 = metamutator.Selector.of(2770,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2770");

    private static final metamutator.Selector _returnReplacementOperator2771 = metamutator.Selector.of(2771,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2771");

    private static final metamutator.Selector _returnReplacementOperator2772 = metamutator.Selector.of(2772,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2772");

    private static final metamutator.Selector _returnReplacementOperator2773 = metamutator.Selector.of(2773,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2773");

    private static final metamutator.Selector _returnReplacementOperator2774 = metamutator.Selector.of(2774,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2774");

    private static final metamutator.Selector _returnReplacementOperator2775 = metamutator.Selector.of(2775,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2775");

    private static final metamutator.Selector _returnReplacementOperator2776 = metamutator.Selector.of(2776,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2776");

    private static final metamutator.Selector _returnReplacementOperator2777 = metamutator.Selector.of(2777,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2777");

    private static final metamutator.Selector _returnReplacementOperator2778 = metamutator.Selector.of(2778,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2778");

    private static final metamutator.Selector _returnReplacementOperator2779 = metamutator.Selector.of(2779,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2779");

    private static final metamutator.Selector _returnReplacementOperator2780 = metamutator.Selector.of(2780,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2780");

    private static final metamutator.Selector _returnReplacementOperator2781 = metamutator.Selector.of(2781,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2781");

    private static final metamutator.Selector _returnReplacementOperator2782 = metamutator.Selector.of(2782,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2782");

    private static final metamutator.Selector _returnReplacementOperator2783 = metamutator.Selector.of(2783,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2783");

    private static final metamutator.Selector _returnReplacementOperator2784 = metamutator.Selector.of(2784,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2784");

    private static final metamutator.Selector _returnReplacementOperator2785 = metamutator.Selector.of(2785,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2785");

    private static final metamutator.Selector _returnReplacementOperator2786 = metamutator.Selector.of(2786,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2786");

    private static final metamutator.Selector _returnReplacementOperator2787 = metamutator.Selector.of(2787,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2787");

    private static final metamutator.Selector _returnReplacementOperator2788 = metamutator.Selector.of(2788,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2788");

    private static final metamutator.Selector _returnReplacementOperator2789 = metamutator.Selector.of(2789,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2789");

    private static final metamutator.Selector _returnReplacementOperator2790 = metamutator.Selector.of(2790,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2790");

    private static final metamutator.Selector _returnReplacementOperator2791 = metamutator.Selector.of(2791,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2791");

    private static final metamutator.Selector _returnReplacementOperator2792 = metamutator.Selector.of(2792,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2792");

    private static final metamutator.Selector _returnReplacementOperator2793 = metamutator.Selector.of(2793,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2793");

    private static final metamutator.Selector _returnReplacementOperator2794 = metamutator.Selector.of(2794,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2794");

    private static final metamutator.Selector _returnReplacementOperator2795 = metamutator.Selector.of(2795,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2795");

    private static final metamutator.Selector _returnReplacementOperator2796 = metamutator.Selector.of(2796,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2796");

    private static final metamutator.Selector _returnReplacementOperator2797 = metamutator.Selector.of(2797,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2797");

    private static final metamutator.Selector _returnReplacementOperator2798 = metamutator.Selector.of(2798,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2798");

    private static final metamutator.Selector _returnReplacementOperator2799 = metamutator.Selector.of(2799,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2799");

    private static final metamutator.Selector _returnReplacementOperator2800 = metamutator.Selector.of(2800,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2800");

    private static final metamutator.Selector _returnReplacementOperator2801 = metamutator.Selector.of(2801,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2801");

    private static final metamutator.Selector _returnReplacementOperator2802 = metamutator.Selector.of(2802,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2802");

    private static final metamutator.Selector _returnReplacementOperator2803 = metamutator.Selector.of(2803,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2803");

    private static final metamutator.Selector _returnReplacementOperator2804 = metamutator.Selector.of(2804,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperator2804");
}

