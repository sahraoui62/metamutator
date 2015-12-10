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
        return ((_returnReplacementOperatorHotSpot2769.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2769.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2769.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (digit));
    }

    public static int hexDigitMsb0ToInt(final char hexDigit) {
        switch (hexDigit) {
            case '0' :
                return ((_returnReplacementOperatorHotSpot2753.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2753.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2753.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (0));
            case '1' :
                return ((_returnReplacementOperatorHotSpot2754.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2754.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2754.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (8));
            case '2' :
                return ((_returnReplacementOperatorHotSpot2755.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2755.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2755.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (4));
            case '3' :
                return ((_returnReplacementOperatorHotSpot2756.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2756.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2756.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (12));
            case '4' :
                return ((_returnReplacementOperatorHotSpot2757.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2757.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2757.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (2));
            case '5' :
                return ((_returnReplacementOperatorHotSpot2758.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2758.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2758.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (10));
            case '6' :
                return ((_returnReplacementOperatorHotSpot2759.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2759.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2759.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (6));
            case '7' :
                return ((_returnReplacementOperatorHotSpot2760.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2760.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2760.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (14));
            case '8' :
                return ((_returnReplacementOperatorHotSpot2761.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2761.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2761.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (1));
            case '9' :
                return ((_returnReplacementOperatorHotSpot2762.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2762.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2762.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (9));
            case 'a' :
            case 'A' :
                return ((_returnReplacementOperatorHotSpot2763.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2763.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2763.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (5));
            case 'b' :
            case 'B' :
                return ((_returnReplacementOperatorHotSpot2764.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2764.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2764.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (13));
            case 'c' :
            case 'C' :
                return ((_returnReplacementOperatorHotSpot2765.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2765.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2765.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (3));
            case 'd' :
            case 'D' :
                return ((_returnReplacementOperatorHotSpot2766.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2766.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2766.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (11));
            case 'e' :
            case 'E' :
                return ((_returnReplacementOperatorHotSpot2767.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2767.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2767.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (7));
            case 'f' :
            case 'F' :
                return ((_returnReplacementOperatorHotSpot2768.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2768.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2768.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (15));
            default :
                throw new java.lang.IllegalArgumentException((("Cannot interpret '" + hexDigit) + "' as a hexadecimal digit"));
        }
    }

    public static boolean[] hexDigitToBinary(final char hexDigit) {
        switch (hexDigit) {
            case '0' :
                return ((_returnReplacementOperatorHotSpot2671.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.FFFF.clone()));
            case '1' :
                return ((_returnReplacementOperatorHotSpot2672.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.TFFF.clone()));
            case '2' :
                return ((_returnReplacementOperatorHotSpot2673.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.FTFF.clone()));
            case '3' :
                return ((_returnReplacementOperatorHotSpot2674.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.TTFF.clone()));
            case '4' :
                return ((_returnReplacementOperatorHotSpot2675.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.FFTF.clone()));
            case '5' :
                return ((_returnReplacementOperatorHotSpot2676.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.TFTF.clone()));
            case '6' :
                return ((_returnReplacementOperatorHotSpot2677.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.FTTF.clone()));
            case '7' :
                return ((_returnReplacementOperatorHotSpot2678.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.TTTF.clone()));
            case '8' :
                return ((_returnReplacementOperatorHotSpot2679.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.FFFT.clone()));
            case '9' :
                return ((_returnReplacementOperatorHotSpot2680.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.TFFT.clone()));
            case 'a' :
            case 'A' :
                return ((_returnReplacementOperatorHotSpot2681.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.FTFT.clone()));
            case 'b' :
            case 'B' :
                return ((_returnReplacementOperatorHotSpot2682.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.TTFT.clone()));
            case 'c' :
            case 'C' :
                return ((_returnReplacementOperatorHotSpot2683.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.FFTT.clone()));
            case 'd' :
            case 'D' :
                return ((_returnReplacementOperatorHotSpot2684.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.TFTT.clone()));
            case 'e' :
            case 'E' :
                return ((_returnReplacementOperatorHotSpot2685.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.FTTT.clone()));
            case 'f' :
            case 'F' :
                return ((_returnReplacementOperatorHotSpot2686.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.TTTT.clone()));
            default :
                throw new java.lang.IllegalArgumentException((("Cannot interpret '" + hexDigit) + "' as a hexadecimal digit"));
        }
    }

    public static boolean[] hexDigitMsb0ToBinary(final char hexDigit) {
        switch (hexDigit) {
            case '0' :
                return ((_returnReplacementOperatorHotSpot2655.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.FFFF.clone()));
            case '1' :
                return ((_returnReplacementOperatorHotSpot2656.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.FFFT.clone()));
            case '2' :
                return ((_returnReplacementOperatorHotSpot2657.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.FFTF.clone()));
            case '3' :
                return ((_returnReplacementOperatorHotSpot2658.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.FFTT.clone()));
            case '4' :
                return ((_returnReplacementOperatorHotSpot2659.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.FTFF.clone()));
            case '5' :
                return ((_returnReplacementOperatorHotSpot2660.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.FTFT.clone()));
            case '6' :
                return ((_returnReplacementOperatorHotSpot2661.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.FTTF.clone()));
            case '7' :
                return ((_returnReplacementOperatorHotSpot2662.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.FTTT.clone()));
            case '8' :
                return ((_returnReplacementOperatorHotSpot2663.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.TFFF.clone()));
            case '9' :
                return ((_returnReplacementOperatorHotSpot2664.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.TFFT.clone()));
            case 'a' :
            case 'A' :
                return ((_returnReplacementOperatorHotSpot2665.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.TFTF.clone()));
            case 'b' :
            case 'B' :
                return ((_returnReplacementOperatorHotSpot2666.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.TFTT.clone()));
            case 'c' :
            case 'C' :
                return ((_returnReplacementOperatorHotSpot2667.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.TTFF.clone()));
            case 'd' :
            case 'D' :
                return ((_returnReplacementOperatorHotSpot2668.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.TTFT.clone()));
            case 'e' :
            case 'E' :
                return ((_returnReplacementOperatorHotSpot2669.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.TTTF.clone()));
            case 'f' :
            case 'F' :
                return ((_returnReplacementOperatorHotSpot2670.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.TTTT.clone()));
            default :
                throw new java.lang.IllegalArgumentException((("Cannot interpret '" + hexDigit) + "' as a hexadecimal digit"));
        }
    }

    public static char binaryToHexDigit(final boolean[] src) {
        return ((_returnReplacementOperatorHotSpot2714.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.binaryToHexDigit(src, 0)));
    }

    public static char binaryToHexDigit(final boolean[] src, final int srcPos) {
        if ((src.length) == 0) {
            throw new java.lang.IllegalArgumentException("Cannot convert an empty array.");
        } 
        if (((src.length) > (srcPos + 3)) && (src[(srcPos + 3)])) {
            if (((src.length) > (srcPos + 2)) && (src[(srcPos + 2)])) {
                if (((src.length) > (srcPos + 1)) && (src[(srcPos + 1)])) {
                    return ((_returnReplacementOperatorHotSpot2715.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (src[srcPos] ? 'f' : 'e'));
                } 
                return ((_returnReplacementOperatorHotSpot2716.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (src[srcPos] ? 'd' : 'c'));
            } 
            if (((src.length) > (srcPos + 1)) && (src[(srcPos + 1)])) {
                return ((_returnReplacementOperatorHotSpot2717.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (src[srcPos] ? 'b' : 'a'));
            } 
            return ((_returnReplacementOperatorHotSpot2718.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (src[srcPos] ? '9' : '8'));
        } 
        if (((src.length) > (srcPos + 2)) && (src[(srcPos + 2)])) {
            if (((src.length) > (srcPos + 1)) && (src[(srcPos + 1)])) {
                return ((_returnReplacementOperatorHotSpot2719.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (src[srcPos] ? '7' : '6'));
            } 
            return ((_returnReplacementOperatorHotSpot2720.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (src[srcPos] ? '5' : '4'));
        } 
        if (((src.length) > (srcPos + 1)) && (src[(srcPos + 1)])) {
            return ((_returnReplacementOperatorHotSpot2721.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (src[srcPos] ? '3' : '2'));
        } 
        return ((_returnReplacementOperatorHotSpot2722.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (src[srcPos] ? '1' : '0'));
    }

    public static char binaryToHexDigitMsb0_4bits(final boolean[] src) {
        return ((_returnReplacementOperatorHotSpot2723.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(src, 0)));
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
                    return ((_returnReplacementOperatorHotSpot2724.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (src[srcPos] ? 'f' : '7'));
                } 
                return ((_returnReplacementOperatorHotSpot2725.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (src[srcPos] ? 'b' : '3'));
            } 
            if (src[(srcPos + 1)]) {
                return ((_returnReplacementOperatorHotSpot2726.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (src[srcPos] ? 'd' : '5'));
            } 
            return ((_returnReplacementOperatorHotSpot2727.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (src[srcPos] ? '9' : '1'));
        } 
        if (src[(srcPos + 2)]) {
            if (src[(srcPos + 1)]) {
                return ((_returnReplacementOperatorHotSpot2728.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (src[srcPos] ? 'e' : '6'));
            } 
            return ((_returnReplacementOperatorHotSpot2729.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (src[srcPos] ? 'a' : '2'));
        } 
        if (src[(srcPos + 1)]) {
            return ((_returnReplacementOperatorHotSpot2730.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (src[srcPos] ? 'c' : '4'));
        } 
        return ((_returnReplacementOperatorHotSpot2731.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (src[srcPos] ? '8' : '0'));
    }

    public static char binaryBeMsb0ToHexDigit(final boolean[] src) {
        return ((_returnReplacementOperatorHotSpot2705.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(src, 0)));
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
                    return ((_returnReplacementOperatorHotSpot2706.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((src.length) > (srcPos + 3)) && (src[(srcPos + 3)]) ? 'f' : 'e'));
                } 
                return ((_returnReplacementOperatorHotSpot2707.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((src.length) > (srcPos + 3)) && (src[(srcPos + 3)]) ? 'd' : 'c'));
            } 
            if (((src.length) > (srcPos + 2)) && (src[(srcPos + 2)])) {
                return ((_returnReplacementOperatorHotSpot2708.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((src.length) > (srcPos + 3)) && (src[(srcPos + 3)]) ? 'b' : 'a'));
            } 
            return ((_returnReplacementOperatorHotSpot2709.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((src.length) > (srcPos + 3)) && (src[(srcPos + 3)]) ? '9' : '8'));
        } 
        if (((src.length) > (srcPos + 1)) && (src[(srcPos + 1)])) {
            if (((src.length) > (srcPos + 2)) && (src[(srcPos + 2)])) {
                return ((_returnReplacementOperatorHotSpot2710.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((src.length) > (srcPos + 3)) && (src[(srcPos + 3)]) ? '7' : '6'));
            } 
            return ((_returnReplacementOperatorHotSpot2711.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((src.length) > (srcPos + 3)) && (src[(srcPos + 3)]) ? '5' : '4'));
        } 
        if (((src.length) > (srcPos + 2)) && (src[(srcPos + 2)])) {
            return ((_returnReplacementOperatorHotSpot2712.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((src.length) > (srcPos + 3)) && (src[(srcPos + 3)]) ? '3' : '2'));
        } 
        return ((_returnReplacementOperatorHotSpot2713.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((src.length) > (srcPos + 3)) && (src[(srcPos + 3)]) ? '1' : '0'));
    }

    public static char intToHexDigit(final int nibble) {
        final char c = java.lang.Character.forDigit(nibble, 16);
        if (c == (java.lang.Character.MIN_VALUE)) {
            throw new java.lang.IllegalArgumentException(("nibble value not between 0 and 15: " + nibble));
        } 
        return ((_returnReplacementOperatorHotSpot2732.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (c));
    }

    public static char intToHexDigitMsb0(final int nibble) {
        switch (nibble) {
            case 0 :
                return ((_returnReplacementOperatorHotSpot2733.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ('0'));
            case 1 :
                return ((_returnReplacementOperatorHotSpot2734.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ('8'));
            case 2 :
                return ((_returnReplacementOperatorHotSpot2735.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ('4'));
            case 3 :
                return ((_returnReplacementOperatorHotSpot2736.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ('c'));
            case 4 :
                return ((_returnReplacementOperatorHotSpot2737.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ('2'));
            case 5 :
                return ((_returnReplacementOperatorHotSpot2738.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ('a'));
            case 6 :
                return ((_returnReplacementOperatorHotSpot2739.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ('6'));
            case 7 :
                return ((_returnReplacementOperatorHotSpot2740.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ('e'));
            case 8 :
                return ((_returnReplacementOperatorHotSpot2741.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ('1'));
            case 9 :
                return ((_returnReplacementOperatorHotSpot2742.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ('9'));
            case 10 :
                return ((_returnReplacementOperatorHotSpot2743.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ('5'));
            case 11 :
                return ((_returnReplacementOperatorHotSpot2744.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ('d'));
            case 12 :
                return ((_returnReplacementOperatorHotSpot2745.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ('3'));
            case 13 :
                return ((_returnReplacementOperatorHotSpot2746.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ('b'));
            case 14 :
                return ((_returnReplacementOperatorHotSpot2747.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ('7'));
            case 15 :
                return ((_returnReplacementOperatorHotSpot2748.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ('f'));
            default :
                throw new java.lang.IllegalArgumentException(("nibble value not between 0 and 15: " + nibble));
        }
    }

    public static long intArrayToLong(final int[] src, final int srcPos, final long dstInit, final int dstPos, final int nInts) {
        if ((((src.length) == 0) && (srcPos == 0)) || (0 == nInts)) {
            return ((_returnReplacementOperatorHotSpot2791.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dstInit));
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
        return ((_returnReplacementOperatorHotSpot2792.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (out));
    }

    public static long shortArrayToLong(final short[] src, final int srcPos, final long dstInit, final int dstPos, final int nShorts) {
        if ((((src.length) == 0) && (srcPos == 0)) || (0 == nShorts)) {
            return ((_returnReplacementOperatorHotSpot2793.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dstInit));
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
        return ((_returnReplacementOperatorHotSpot2794.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (out));
    }

    public static int shortArrayToInt(final short[] src, final int srcPos, final int dstInit, final int dstPos, final int nShorts) {
        if ((((src.length) == 0) && (srcPos == 0)) || (0 == nShorts)) {
            return ((_returnReplacementOperatorHotSpot2772.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2772.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2772.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (dstInit));
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
        return ((_returnReplacementOperatorHotSpot2773.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2773.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2773.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (out));
    }

    public static long byteArrayToLong(final byte[] src, final int srcPos, final long dstInit, final int dstPos, final int nBytes) {
        if ((((src.length) == 0) && (srcPos == 0)) || (0 == nBytes)) {
            return ((_returnReplacementOperatorHotSpot2787.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dstInit));
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
        return ((_returnReplacementOperatorHotSpot2788.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (out));
    }

    public static int byteArrayToInt(final byte[] src, final int srcPos, final int dstInit, final int dstPos, final int nBytes) {
        if ((((src.length) == 0) && (srcPos == 0)) || (0 == nBytes)) {
            return ((_returnReplacementOperatorHotSpot2751.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2751.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2751.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (dstInit));
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
        return ((_returnReplacementOperatorHotSpot2752.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2752.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2752.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (out));
    }

    public static short byteArrayToShort(final byte[] src, final int srcPos, final short dstInit, final int dstPos, final int nBytes) {
        if ((((src.length) == 0) && (srcPos == 0)) || (0 == nBytes)) {
            return ((_returnReplacementOperatorHotSpot2797.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dstInit));
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
        return ((_returnReplacementOperatorHotSpot2798.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (out));
    }

    public static long hexToLong(final java.lang.String src, final int srcPos, final long dstInit, final int dstPos, final int nHex) {
        if (0 == nHex) {
            return ((_returnReplacementOperatorHotSpot2789.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dstInit));
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
        return ((_returnReplacementOperatorHotSpot2790.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (out));
    }

    public static int hexToInt(final java.lang.String src, final int srcPos, final int dstInit, final int dstPos, final int nHex) {
        if (0 == nHex) {
            return ((_returnReplacementOperatorHotSpot2770.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2770.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2770.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (dstInit));
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
        return ((_returnReplacementOperatorHotSpot2771.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2771.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2771.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (out));
    }

    public static short hexToShort(final java.lang.String src, final int srcPos, final short dstInit, final int dstPos, final int nHex) {
        if (0 == nHex) {
            return ((_returnReplacementOperatorHotSpot2799.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dstInit));
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
        return ((_returnReplacementOperatorHotSpot2800.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (out));
    }

    public static byte hexToByte(final java.lang.String src, final int srcPos, final byte dstInit, final int dstPos, final int nHex) {
        if (0 == nHex) {
            return ((_returnReplacementOperatorHotSpot2695.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dstInit));
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
        return ((_returnReplacementOperatorHotSpot2696.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (out));
    }

    public static long binaryToLong(final boolean[] src, final int srcPos, final long dstInit, final int dstPos, final int nBools) {
        if ((((src.length) == 0) && (srcPos == 0)) || (0 == nBools)) {
            return ((_returnReplacementOperatorHotSpot2785.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dstInit));
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
        return ((_returnReplacementOperatorHotSpot2786.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (out));
    }

    public static int binaryToInt(final boolean[] src, final int srcPos, final int dstInit, final int dstPos, final int nBools) {
        if ((((src.length) == 0) && (srcPos == 0)) || (0 == nBools)) {
            return ((_returnReplacementOperatorHotSpot2749.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2749.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2749.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (dstInit));
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
        return ((_returnReplacementOperatorHotSpot2750.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2750.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2750.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (out));
    }

    public static short binaryToShort(final boolean[] src, final int srcPos, final short dstInit, final int dstPos, final int nBools) {
        if ((((src.length) == 0) && (srcPos == 0)) || (0 == nBools)) {
            return ((_returnReplacementOperatorHotSpot2795.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dstInit));
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
        return ((_returnReplacementOperatorHotSpot2796.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (out));
    }

    public static byte binaryToByte(final boolean[] src, final int srcPos, final byte dstInit, final int dstPos, final int nBools) {
        if ((((src.length) == 0) && (srcPos == 0)) || (0 == nBools)) {
            return ((_returnReplacementOperatorHotSpot2693.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dstInit));
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
        return ((_returnReplacementOperatorHotSpot2694.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (out));
    }

    public static int[] longToIntArray(final long src, final int srcPos, final int[] dst, final int dstPos, final int nInts) {
        if (0 == nInts) {
            return ((_returnReplacementOperatorHotSpot2774.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dst));
        } 
        if ((((nInts - 1) * 32) + srcPos) >= 64) {
            throw new java.lang.IllegalArgumentException("(nInts-1)*32+srcPos is greather or equal to than 64");
        } 
        for (int i = 0 ; i < nInts ; i++) {
            final int shift = (i * 32) + srcPos;
            dst[(dstPos + i)] = ((int)(-1 & (src >> shift)));
        }
        return ((_returnReplacementOperatorHotSpot2775.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dst));
    }

    public static short[] longToShortArray(final long src, final int srcPos, final short[] dst, final int dstPos, final int nShorts) {
        if (0 == nShorts) {
            return ((_returnReplacementOperatorHotSpot2803.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dst));
        } 
        if ((((nShorts - 1) * 16) + srcPos) >= 64) {
            throw new java.lang.IllegalArgumentException("(nShorts-1)*16+srcPos is greather or equal to than 64");
        } 
        for (int i = 0 ; i < nShorts ; i++) {
            final int shift = (i * 16) + srcPos;
            dst[(dstPos + i)] = ((short)(65535 & (src >> shift)));
        }
        return ((_returnReplacementOperatorHotSpot2804.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dst));
    }

    public static short[] intToShortArray(final int src, final int srcPos, final short[] dst, final int dstPos, final int nShorts) {
        if (0 == nShorts) {
            return ((_returnReplacementOperatorHotSpot2801.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dst));
        } 
        if ((((nShorts - 1) * 16) + srcPos) >= 32) {
            throw new java.lang.IllegalArgumentException("(nShorts-1)*16+srcPos is greather or equal to than 32");
        } 
        for (int i = 0 ; i < nShorts ; i++) {
            final int shift = (i * 16) + srcPos;
            dst[(dstPos + i)] = ((short)(65535 & (src >> shift)));
        }
        return ((_returnReplacementOperatorHotSpot2802.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dst));
    }

    public static byte[] longToByteArray(final long src, final int srcPos, final byte[] dst, final int dstPos, final int nBytes) {
        if (0 == nBytes) {
            return ((_returnReplacementOperatorHotSpot2699.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dst));
        } 
        if ((((nBytes - 1) * 8) + srcPos) >= 64) {
            throw new java.lang.IllegalArgumentException("(nBytes-1)*8+srcPos is greather or equal to than 64");
        } 
        for (int i = 0 ; i < nBytes ; i++) {
            final int shift = (i * 8) + srcPos;
            dst[(dstPos + i)] = ((byte)(255 & (src >> shift)));
        }
        return ((_returnReplacementOperatorHotSpot2700.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dst));
    }

    public static byte[] intToByteArray(final int src, final int srcPos, final byte[] dst, final int dstPos, final int nBytes) {
        if (0 == nBytes) {
            return ((_returnReplacementOperatorHotSpot2697.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dst));
        } 
        if ((((nBytes - 1) * 8) + srcPos) >= 32) {
            throw new java.lang.IllegalArgumentException("(nBytes-1)*8+srcPos is greather or equal to than 32");
        } 
        for (int i = 0 ; i < nBytes ; i++) {
            final int shift = (i * 8) + srcPos;
            dst[(dstPos + i)] = ((byte)(255 & (src >> shift)));
        }
        return ((_returnReplacementOperatorHotSpot2698.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dst));
    }

    public static byte[] shortToByteArray(final short src, final int srcPos, final byte[] dst, final int dstPos, final int nBytes) {
        if (0 == nBytes) {
            return ((_returnReplacementOperatorHotSpot2701.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dst));
        } 
        if ((((nBytes - 1) * 8) + srcPos) >= 16) {
            throw new java.lang.IllegalArgumentException("(nBytes-1)*8+srcPos is greather or equal to than 16");
        } 
        for (int i = 0 ; i < nBytes ; i++) {
            final int shift = (i * 8) + srcPos;
            dst[(dstPos + i)] = ((byte)(255 & (src >> shift)));
        }
        return ((_returnReplacementOperatorHotSpot2702.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dst));
    }

    public static java.lang.String longToHex(final long src, final int srcPos, final java.lang.String dstInit, final int dstPos, final int nHexs) {
        if (0 == nHexs) {
            return ((_returnReplacementOperatorHotSpot2780.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dstInit));
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
        return ((_returnReplacementOperatorHotSpot2781.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (sb.toString()));
    }

    public static java.lang.String intToHex(final int src, final int srcPos, final java.lang.String dstInit, final int dstPos, final int nHexs) {
        if (0 == nHexs) {
            return ((_returnReplacementOperatorHotSpot2778.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dstInit));
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
        return ((_returnReplacementOperatorHotSpot2779.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (sb.toString()));
    }

    public static java.lang.String shortToHex(final short src, final int srcPos, final java.lang.String dstInit, final int dstPos, final int nHexs) {
        if (0 == nHexs) {
            return ((_returnReplacementOperatorHotSpot2782.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dstInit));
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
        return ((_returnReplacementOperatorHotSpot2783.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (sb.toString()));
    }

    public static java.lang.String byteToHex(final byte src, final int srcPos, final java.lang.String dstInit, final int dstPos, final int nHexs) {
        if (0 == nHexs) {
            return ((_returnReplacementOperatorHotSpot2776.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dstInit));
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
        return ((_returnReplacementOperatorHotSpot2777.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (sb.toString()));
    }

    public static boolean[] longToBinary(final long src, final int srcPos, final boolean[] dst, final int dstPos, final int nBools) {
        if (0 == nBools) {
            return ((_returnReplacementOperatorHotSpot2689.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dst));
        } 
        if (((nBools - 1) + srcPos) >= 64) {
            throw new java.lang.IllegalArgumentException("nBools-1+srcPos is greather or equal to than 64");
        } 
        for (int i = 0 ; i < nBools ; i++) {
            final int shift = i + srcPos;
            dst[(dstPos + i)] = (1 & (src >> shift)) != 0;
        }
        return ((_returnReplacementOperatorHotSpot2690.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dst));
    }

    public static boolean[] intToBinary(final int src, final int srcPos, final boolean[] dst, final int dstPos, final int nBools) {
        if (0 == nBools) {
            return ((_returnReplacementOperatorHotSpot2687.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dst));
        } 
        if (((nBools - 1) + srcPos) >= 32) {
            throw new java.lang.IllegalArgumentException("nBools-1+srcPos is greather or equal to than 32");
        } 
        for (int i = 0 ; i < nBools ; i++) {
            final int shift = i + srcPos;
            dst[(dstPos + i)] = (1 & (src >> shift)) != 0;
        }
        return ((_returnReplacementOperatorHotSpot2688.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dst));
    }

    public static boolean[] shortToBinary(final short src, final int srcPos, final boolean[] dst, final int dstPos, final int nBools) {
        if (0 == nBools) {
            return ((_returnReplacementOperatorHotSpot2691.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dst));
        } 
        if (((nBools - 1) + srcPos) >= 16) {
            throw new java.lang.IllegalArgumentException("nBools-1+srcPos is greather or equal to than 16");
        } 
        assert (nBools - 1) < (16 - srcPos);
        for (int i = 0 ; i < nBools ; i++) {
            final int shift = i + srcPos;
            dst[(dstPos + i)] = (1 & (src >> shift)) != 0;
        }
        return ((_returnReplacementOperatorHotSpot2692.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dst));
    }

    public static boolean[] byteToBinary(final byte src, final int srcPos, final boolean[] dst, final int dstPos, final int nBools) {
        if (0 == nBools) {
            return ((_returnReplacementOperatorHotSpot2653.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dst));
        } 
        if (((nBools - 1) + srcPos) >= 8) {
            throw new java.lang.IllegalArgumentException("nBools-1+srcPos is greather or equal to than 8");
        } 
        for (int i = 0 ; i < nBools ; i++) {
            final int shift = i + srcPos;
            dst[(dstPos + i)] = (1 & (src >> shift)) != 0;
        }
        return ((_returnReplacementOperatorHotSpot2654.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dst));
    }

    public static byte[] uuidToByteArray(final java.util.UUID src, final byte[] dst, final int dstPos, final int nBytes) {
        if (0 == nBytes) {
            return ((_returnReplacementOperatorHotSpot2703.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dst));
        } 
        if (nBytes > 16) {
            throw new java.lang.IllegalArgumentException("nBytes is greather than 16");
        } 
        org.apache.commons.lang3.Conversion.longToByteArray(src.getMostSignificantBits(), 0, dst, dstPos, (nBytes > 8 ? 8 : nBytes));
        if (nBytes >= 8) {
            org.apache.commons.lang3.Conversion.longToByteArray(src.getLeastSignificantBits(), 0, dst, (dstPos + 8), (nBytes - 8));
        } 
        return ((_returnReplacementOperatorHotSpot2704.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (dst));
    }

    public static java.util.UUID byteArrayToUuid(final byte[] src, final int srcPos) {
        if (((src.length) - srcPos) < 16) {
            throw new java.lang.IllegalArgumentException("Need at least 16 bytes for UUID");
        } 
        return ((_returnReplacementOperatorHotSpot2784.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new java.util.UUID(org.apache.commons.lang3.Conversion.byteArrayToLong(src, srcPos, 0, 0, 8) , org.apache.commons.lang3.Conversion.byteArrayToLong(src, (srcPos + 8), 0, 0, 8))));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2653 = metamutator.Selector.of(2653,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2653");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2654 = metamutator.Selector.of(2654,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2654");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2655 = metamutator.Selector.of(2655,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2655");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2656 = metamutator.Selector.of(2656,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2656");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2657 = metamutator.Selector.of(2657,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2657");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2658 = metamutator.Selector.of(2658,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2658");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2659 = metamutator.Selector.of(2659,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2659");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2660 = metamutator.Selector.of(2660,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2660");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2661 = metamutator.Selector.of(2661,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2661");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2662 = metamutator.Selector.of(2662,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2662");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2663 = metamutator.Selector.of(2663,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2663");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2664 = metamutator.Selector.of(2664,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2664");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2665 = metamutator.Selector.of(2665,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2665");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2666 = metamutator.Selector.of(2666,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2666");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2667 = metamutator.Selector.of(2667,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2667");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2668 = metamutator.Selector.of(2668,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2668");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2669 = metamutator.Selector.of(2669,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2669");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2670 = metamutator.Selector.of(2670,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2670");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2671 = metamutator.Selector.of(2671,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2671");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2672 = metamutator.Selector.of(2672,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2672");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2673 = metamutator.Selector.of(2673,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2673");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2674 = metamutator.Selector.of(2674,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2674");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2675 = metamutator.Selector.of(2675,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2675");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2676 = metamutator.Selector.of(2676,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2676");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2677 = metamutator.Selector.of(2677,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2677");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2678 = metamutator.Selector.of(2678,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2678");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2679 = metamutator.Selector.of(2679,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2679");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2680 = metamutator.Selector.of(2680,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2680");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2681 = metamutator.Selector.of(2681,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2681");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2682 = metamutator.Selector.of(2682,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2682");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2683 = metamutator.Selector.of(2683,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2683");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2684 = metamutator.Selector.of(2684,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2684");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2685 = metamutator.Selector.of(2685,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2685");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2686 = metamutator.Selector.of(2686,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2686");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2687 = metamutator.Selector.of(2687,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2687");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2688 = metamutator.Selector.of(2688,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2688");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2689 = metamutator.Selector.of(2689,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2689");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2690 = metamutator.Selector.of(2690,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2690");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2691 = metamutator.Selector.of(2691,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2691");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2692 = metamutator.Selector.of(2692,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2692");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2693 = metamutator.Selector.of(2693,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2693");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2694 = metamutator.Selector.of(2694,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2694");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2695 = metamutator.Selector.of(2695,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2695");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2696 = metamutator.Selector.of(2696,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2696");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2697 = metamutator.Selector.of(2697,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2697");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2698 = metamutator.Selector.of(2698,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2698");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2699 = metamutator.Selector.of(2699,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2699");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2700 = metamutator.Selector.of(2700,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2700");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2701 = metamutator.Selector.of(2701,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2701");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2702 = metamutator.Selector.of(2702,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2702");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2703 = metamutator.Selector.of(2703,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2703");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2704 = metamutator.Selector.of(2704,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2704");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2705 = metamutator.Selector.of(2705,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2705");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2706 = metamutator.Selector.of(2706,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2706");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2707 = metamutator.Selector.of(2707,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2707");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2708 = metamutator.Selector.of(2708,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2708");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2709 = metamutator.Selector.of(2709,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2709");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2710 = metamutator.Selector.of(2710,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2710");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2711 = metamutator.Selector.of(2711,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2711");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2712 = metamutator.Selector.of(2712,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2712");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2713 = metamutator.Selector.of(2713,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2713");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2714 = metamutator.Selector.of(2714,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2714");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2715 = metamutator.Selector.of(2715,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2715");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2716 = metamutator.Selector.of(2716,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2716");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2717 = metamutator.Selector.of(2717,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2717");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2718 = metamutator.Selector.of(2718,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2718");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2719 = metamutator.Selector.of(2719,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2719");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2720 = metamutator.Selector.of(2720,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2720");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2721 = metamutator.Selector.of(2721,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2721");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2722 = metamutator.Selector.of(2722,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2722");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2723 = metamutator.Selector.of(2723,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2723");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2724 = metamutator.Selector.of(2724,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2724");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2725 = metamutator.Selector.of(2725,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2725");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2726 = metamutator.Selector.of(2726,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2726");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2727 = metamutator.Selector.of(2727,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2727");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2728 = metamutator.Selector.of(2728,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2728");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2729 = metamutator.Selector.of(2729,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2729");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2730 = metamutator.Selector.of(2730,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2730");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2731 = metamutator.Selector.of(2731,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2731");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2732 = metamutator.Selector.of(2732,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2732");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2733 = metamutator.Selector.of(2733,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2733");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2734 = metamutator.Selector.of(2734,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2734");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2735 = metamutator.Selector.of(2735,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2735");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2736 = metamutator.Selector.of(2736,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2736");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2737 = metamutator.Selector.of(2737,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2737");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2738 = metamutator.Selector.of(2738,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2738");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2739 = metamutator.Selector.of(2739,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2739");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2740 = metamutator.Selector.of(2740,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2740");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2741 = metamutator.Selector.of(2741,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2741");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2742 = metamutator.Selector.of(2742,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2742");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2743 = metamutator.Selector.of(2743,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2743");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2744 = metamutator.Selector.of(2744,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2744");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2745 = metamutator.Selector.of(2745,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2745");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2746 = metamutator.Selector.of(2746,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2746");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2747 = metamutator.Selector.of(2747,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2747");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2748 = metamutator.Selector.of(2748,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2748");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2749 = metamutator.Selector.of(2749,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2749");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2750 = metamutator.Selector.of(2750,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2750");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2751 = metamutator.Selector.of(2751,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2751");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2752 = metamutator.Selector.of(2752,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2752");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2753 = metamutator.Selector.of(2753,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2753");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2754 = metamutator.Selector.of(2754,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2754");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2755 = metamutator.Selector.of(2755,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2755");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2756 = metamutator.Selector.of(2756,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2756");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2757 = metamutator.Selector.of(2757,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2757");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2758 = metamutator.Selector.of(2758,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2758");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2759 = metamutator.Selector.of(2759,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2759");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2760 = metamutator.Selector.of(2760,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2760");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2761 = metamutator.Selector.of(2761,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2761");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2762 = metamutator.Selector.of(2762,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2762");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2763 = metamutator.Selector.of(2763,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2763");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2764 = metamutator.Selector.of(2764,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2764");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2765 = metamutator.Selector.of(2765,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2765");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2766 = metamutator.Selector.of(2766,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2766");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2767 = metamutator.Selector.of(2767,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2767");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2768 = metamutator.Selector.of(2768,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2768");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2769 = metamutator.Selector.of(2769,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2769");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2770 = metamutator.Selector.of(2770,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2770");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2771 = metamutator.Selector.of(2771,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2771");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2772 = metamutator.Selector.of(2772,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2772");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2773 = metamutator.Selector.of(2773,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2773");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2774 = metamutator.Selector.of(2774,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2774");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2775 = metamutator.Selector.of(2775,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2775");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2776 = metamutator.Selector.of(2776,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2776");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2777 = metamutator.Selector.of(2777,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2777");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2778 = metamutator.Selector.of(2778,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2778");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2779 = metamutator.Selector.of(2779,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2779");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2780 = metamutator.Selector.of(2780,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2780");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2781 = metamutator.Selector.of(2781,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2781");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2782 = metamutator.Selector.of(2782,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2782");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2783 = metamutator.Selector.of(2783,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2783");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2784 = metamutator.Selector.of(2784,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2784");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2785 = metamutator.Selector.of(2785,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2785");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2786 = metamutator.Selector.of(2786,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2786");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2787 = metamutator.Selector.of(2787,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2787");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2788 = metamutator.Selector.of(2788,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2788");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2789 = metamutator.Selector.of(2789,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2789");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2790 = metamutator.Selector.of(2790,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2790");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2791 = metamutator.Selector.of(2791,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2791");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2792 = metamutator.Selector.of(2792,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2792");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2793 = metamutator.Selector.of(2793,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2793");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2794 = metamutator.Selector.of(2794,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2794");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2795 = metamutator.Selector.of(2795,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2795");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2796 = metamutator.Selector.of(2796,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2796");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2797 = metamutator.Selector.of(2797,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2797");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2798 = metamutator.Selector.of(2798,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2798");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2799 = metamutator.Selector.of(2799,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2799");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2800 = metamutator.Selector.of(2800,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2800");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2801 = metamutator.Selector.of(2801,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2801");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2802 = metamutator.Selector.of(2802,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2802");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2803 = metamutator.Selector.of(2803,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2803");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2804 = metamutator.Selector.of(2804,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Conversion.class).id("_returnReplacementOperatorHotSpot2804");
}

