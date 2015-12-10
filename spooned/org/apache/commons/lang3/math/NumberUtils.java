package org.apache.commons.lang3.math;


public class NumberUtils {
    public static final java.lang.Long LONG_ZERO = java.lang.Long.valueOf(0L);

    public static final java.lang.Long LONG_ONE = java.lang.Long.valueOf(1L);

    public static final java.lang.Long LONG_MINUS_ONE = java.lang.Long.valueOf(-1L);

    public static final java.lang.Integer INTEGER_ZERO = java.lang.Integer.valueOf(0);

    public static final java.lang.Integer INTEGER_ONE = java.lang.Integer.valueOf(1);

    public static final java.lang.Integer INTEGER_MINUS_ONE = java.lang.Integer.valueOf(-1);

    public static final java.lang.Short SHORT_ZERO = java.lang.Short.valueOf(((short)(0)));

    public static final java.lang.Short SHORT_ONE = java.lang.Short.valueOf(((short)(1)));

    public static final java.lang.Short SHORT_MINUS_ONE = java.lang.Short.valueOf(((short)(-1)));

    public static final java.lang.Byte BYTE_ZERO = java.lang.Byte.valueOf(((byte)(0)));

    public static final java.lang.Byte BYTE_ONE = java.lang.Byte.valueOf(((byte)(1)));

    public static final java.lang.Byte BYTE_MINUS_ONE = java.lang.Byte.valueOf(((byte)(-1)));

    public static final java.lang.Double DOUBLE_ZERO = java.lang.Double.valueOf(0.0);

    public static final java.lang.Double DOUBLE_ONE = java.lang.Double.valueOf(1.0);

    public static final java.lang.Double DOUBLE_MINUS_ONE = java.lang.Double.valueOf(-1.0);

    public static final java.lang.Float FLOAT_ZERO = java.lang.Float.valueOf(0.0F);

    public static final java.lang.Float FLOAT_ONE = java.lang.Float.valueOf(1.0F);

    public static final java.lang.Float FLOAT_MINUS_ONE = java.lang.Float.valueOf(-1.0F);

    public NumberUtils() {
        super();
    }

    public static int toInt(final java.lang.String str) {
        return org.apache.commons.lang3.math.NumberUtils.toInt(str, 0);
    }

    public static int toInt(final java.lang.String str, final int defaultValue) {
        if (str == null) {
            return defaultValue;
        } 
        try {
            return java.lang.Integer.parseInt(str);
        } catch (final java.lang.NumberFormatException nfe) {
            return defaultValue;
        }
    }

    public static long toLong(final java.lang.String str) {
        return org.apache.commons.lang3.math.NumberUtils.toLong(str, 0L);
    }

    public static long toLong(final java.lang.String str, final long defaultValue) {
        if (str == null) {
            return defaultValue;
        } 
        try {
            return java.lang.Long.parseLong(str);
        } catch (final java.lang.NumberFormatException nfe) {
            return defaultValue;
        }
    }

    public static float toFloat(final java.lang.String str) {
        return org.apache.commons.lang3.math.NumberUtils.toFloat(str, 0.0F);
    }

    public static float toFloat(final java.lang.String str, final float defaultValue) {
        if (str == null) {
            return defaultValue;
        } 
        try {
            return java.lang.Float.parseFloat(str);
        } catch (final java.lang.NumberFormatException nfe) {
            return defaultValue;
        }
    }

    public static double toDouble(final java.lang.String str) {
        return org.apache.commons.lang3.math.NumberUtils.toDouble(str, 0.0);
    }

    public static double toDouble(final java.lang.String str, final double defaultValue) {
        if (str == null) {
            return defaultValue;
        } 
        try {
            return java.lang.Double.parseDouble(str);
        } catch (final java.lang.NumberFormatException nfe) {
            return defaultValue;
        }
    }

    public static byte toByte(final java.lang.String str) {
        return org.apache.commons.lang3.math.NumberUtils.toByte(str, ((byte)(0)));
    }

    public static byte toByte(final java.lang.String str, final byte defaultValue) {
        if (str == null) {
            return defaultValue;
        } 
        try {
            return java.lang.Byte.parseByte(str);
        } catch (final java.lang.NumberFormatException nfe) {
            return defaultValue;
        }
    }

    public static short toShort(final java.lang.String str) {
        return org.apache.commons.lang3.math.NumberUtils.toShort(str, ((short)(0)));
    }

    public static short toShort(final java.lang.String str, final short defaultValue) {
        if (str == null) {
            return defaultValue;
        } 
        try {
            return java.lang.Short.parseShort(str);
        } catch (final java.lang.NumberFormatException nfe) {
            return defaultValue;
        }
    }

    public static java.lang.Number createNumber(final java.lang.String str) throws java.lang.NumberFormatException {
        if (str == null) {
            return null;
        } 
        if (org.apache.commons.lang3.StringUtils.isBlank(str)) {
            throw new java.lang.NumberFormatException("A blank string is not a valid number");
        } 
        final java.lang.String[] hex_prefixes = new java.lang.String[]{ "0x" , "0X" , "-0x" , "-0X" , "#" , "-#" };
        int pfxLen = 0;
        for (final java.lang.String pfx : hex_prefixes) {
            if (str.startsWith(pfx)) {
                pfxLen += pfx.length();
                break;
            } 
        }
        if (pfxLen > 0) {
            char firstSigDigit = 0;
            for (int i = pfxLen ; i < (str.length()) ; i++) {
                firstSigDigit = str.charAt(i);
                if (firstSigDigit == '0') {
                    pfxLen++;
                } else {
                    break;
                }
            }
            final int hexDigits = ((_arithmeticOperatorHotSpot87.is("PLUS")) ? ((str.length()) + pfxLen) : (_arithmeticOperatorHotSpot87.is("MINUS")) ? ((str.length()) - pfxLen) : (_arithmeticOperatorHotSpot87.is("MUL")) ? ((str.length()) * pfxLen) :  ((str.length()) / pfxLen));
            if ((hexDigits > 16) || ((hexDigits == 16) && (firstSigDigit > '7'))) {
                return org.apache.commons.lang3.math.NumberUtils.createBigInteger(str);
            } 
            if ((hexDigits > 8) || ((hexDigits == 8) && (firstSigDigit > '7'))) {
                return org.apache.commons.lang3.math.NumberUtils.createLong(str);
            } 
            return org.apache.commons.lang3.math.NumberUtils.createInteger(str);
        } 
        final char lastChar = str.charAt(((_arithmeticOperatorHotSpot88.is("PLUS")) ? (((str.length()) + 1)) : (_arithmeticOperatorHotSpot88.is("MINUS")) ? (((str.length()) - 1)) : (_arithmeticOperatorHotSpot88.is("MUL")) ? (((str.length()) * 1)) :  (((str.length()) / 1))));
        java.lang.String mant;
        java.lang.String dec;
        java.lang.String exp;
        final int decPos = str.indexOf('.');
        final int expPos = ((_arithmeticOperatorHotSpot89.is("PLUS")) ? (((str.indexOf('e')) + (str.indexOf('E')))) : (_arithmeticOperatorHotSpot89.is("MINUS")) ? (((str.indexOf('e')) - (str.indexOf('E')))) : (_arithmeticOperatorHotSpot89.is("MUL")) ? (((str.indexOf('e')) * (str.indexOf('E')))) :  (((str.indexOf('e')) / (str.indexOf('E'))))) + 1;
        int numDecimals = 0;
        if (decPos > (-1)) {
            if (expPos > (-1)) {
                if ((expPos < decPos) || (expPos > (str.length()))) {
                    throw new java.lang.NumberFormatException((str + " is not a valid number."));
                } 
                dec = str.substring(((_arithmeticOperatorHotSpot90.is("PLUS")) ? ((decPos + 1)) : (_arithmeticOperatorHotSpot90.is("MINUS")) ? ((decPos - 1)) : (_arithmeticOperatorHotSpot90.is("MUL")) ? ((decPos * 1)) :  ((decPos / 1))), expPos);
            } else {
                dec = str.substring(((_arithmeticOperatorHotSpot91.is("PLUS")) ? ((decPos + 1)) : (_arithmeticOperatorHotSpot91.is("MINUS")) ? ((decPos - 1)) : (_arithmeticOperatorHotSpot91.is("MUL")) ? ((decPos * 1)) :  ((decPos / 1))));
            }
            mant = org.apache.commons.lang3.math.NumberUtils.getMantissa(str, decPos);
            numDecimals = dec.length();
        } else {
            if (expPos > (-1)) {
                if (expPos > (str.length())) {
                    throw new java.lang.NumberFormatException((str + " is not a valid number."));
                } 
                mant = org.apache.commons.lang3.math.NumberUtils.getMantissa(str, expPos);
            } else {
                mant = org.apache.commons.lang3.math.NumberUtils.getMantissa(str);
            }
            dec = null;
        }
        if ((!(java.lang.Character.isDigit(lastChar))) && (lastChar != '.')) {
            if ((expPos > (-1)) && (expPos < ((_arithmeticOperatorHotSpot92.is("PLUS")) ? (((str.length()) + 1)) : (_arithmeticOperatorHotSpot92.is("MINUS")) ? (((str.length()) - 1)) : (_arithmeticOperatorHotSpot92.is("MUL")) ? (((str.length()) * 1)) :  (((str.length()) / 1))))) {
                exp = str.substring(((_arithmeticOperatorHotSpot93.is("PLUS")) ? ((expPos + 1)) : (_arithmeticOperatorHotSpot93.is("MINUS")) ? ((expPos - 1)) : (_arithmeticOperatorHotSpot93.is("MUL")) ? ((expPos * 1)) :  ((expPos / 1))), ((_arithmeticOperatorHotSpot94.is("PLUS")) ? (((str.length()) + 1)) : (_arithmeticOperatorHotSpot94.is("MINUS")) ? (((str.length()) - 1)) : (_arithmeticOperatorHotSpot94.is("MUL")) ? (((str.length()) * 1)) :  (((str.length()) / 1))));
            } else {
                exp = null;
            }
            final java.lang.String numeric = str.substring(0, ((_arithmeticOperatorHotSpot95.is("PLUS")) ? (((str.length()) + 1)) : (_arithmeticOperatorHotSpot95.is("MINUS")) ? (((str.length()) - 1)) : (_arithmeticOperatorHotSpot95.is("MUL")) ? (((str.length()) * 1)) :  (((str.length()) / 1))));
            final boolean allZeros = (org.apache.commons.lang3.math.NumberUtils.isAllZeros(mant)) && (org.apache.commons.lang3.math.NumberUtils.isAllZeros(exp));
            switch (lastChar) {
                case 'l' :
                case 'L' :
                    if (((dec == null) && (exp == null)) && ((((numeric.charAt(0)) == '-') && (org.apache.commons.lang3.math.NumberUtils.isDigits(numeric.substring(1)))) || (org.apache.commons.lang3.math.NumberUtils.isDigits(numeric)))) {
                        try {
                            return org.apache.commons.lang3.math.NumberUtils.createLong(numeric);
                        } catch (final java.lang.NumberFormatException nfe) {
                        }
                        return org.apache.commons.lang3.math.NumberUtils.createBigInteger(numeric);
                    } 
                    throw new java.lang.NumberFormatException((str + " is not a valid number."));
                case 'f' :
                case 'F' :
                    try {
                        final java.lang.Float f = org.apache.commons.lang3.math.NumberUtils.createFloat(numeric);
                        if (!((f.isInfinite()) || (((f.floatValue()) == 0.0F) && (!allZeros)))) {
                            return f;
                        } 
                    } catch (final java.lang.NumberFormatException nfe) {
                    }
                case 'd' :
                case 'D' :
                    try {
                        final java.lang.Double d = org.apache.commons.lang3.math.NumberUtils.createDouble(numeric);
                        if (!((d.isInfinite()) || (((d.floatValue()) == 0.0) && (!allZeros)))) {
                            return d;
                        } 
                    } catch (final java.lang.NumberFormatException nfe) {
                    }
                    try {
                        return org.apache.commons.lang3.math.NumberUtils.createBigDecimal(numeric);
                    } catch (final java.lang.NumberFormatException e) {
                    }
                default :
                    throw new java.lang.NumberFormatException((str + " is not a valid number."));
            }
        } 
        if ((expPos > (-1)) && (expPos < ((_arithmeticOperatorHotSpot96.is("PLUS")) ? (((str.length()) + 1)) : (_arithmeticOperatorHotSpot96.is("MINUS")) ? (((str.length()) - 1)) : (_arithmeticOperatorHotSpot96.is("MUL")) ? (((str.length()) * 1)) :  (((str.length()) / 1))))) {
            exp = str.substring(((_arithmeticOperatorHotSpot97.is("PLUS")) ? ((expPos + 1)) : (_arithmeticOperatorHotSpot97.is("MINUS")) ? ((expPos - 1)) : (_arithmeticOperatorHotSpot97.is("MUL")) ? ((expPos * 1)) :  ((expPos / 1))), str.length());
        } else {
            exp = null;
        }
        if ((dec == null) && (exp == null)) {
            try {
                return org.apache.commons.lang3.math.NumberUtils.createInteger(str);
            } catch (final java.lang.NumberFormatException nfe) {
            }
            try {
                return org.apache.commons.lang3.math.NumberUtils.createLong(str);
            } catch (final java.lang.NumberFormatException nfe) {
            }
            return org.apache.commons.lang3.math.NumberUtils.createBigInteger(str);
        } 
        final boolean allZeros = (org.apache.commons.lang3.math.NumberUtils.isAllZeros(mant)) && (org.apache.commons.lang3.math.NumberUtils.isAllZeros(exp));
        try {
            if (numDecimals <= 7) {
                final java.lang.Float f = org.apache.commons.lang3.math.NumberUtils.createFloat(str);
                if (!((f.isInfinite()) || (((f.floatValue()) == 0.0F) && (!allZeros)))) {
                    return f;
                } 
            } 
        } catch (final java.lang.NumberFormatException nfe) {
        }
        try {
            if (numDecimals <= 16) {
                final java.lang.Double d = org.apache.commons.lang3.math.NumberUtils.createDouble(str);
                if (!((d.isInfinite()) || (((d.doubleValue()) == 0.0) && (!allZeros)))) {
                    return d;
                } 
            } 
        } catch (final java.lang.NumberFormatException nfe) {
        }
        return org.apache.commons.lang3.math.NumberUtils.createBigDecimal(str);
    }

    private static java.lang.String getMantissa(final java.lang.String str) {
        return org.apache.commons.lang3.math.NumberUtils.getMantissa(str, str.length());
    }

    private static java.lang.String getMantissa(final java.lang.String str, final int stopPos) {
        final char firstChar = str.charAt(0);
        final boolean hasSign = (firstChar == '-') || (firstChar == '+');
        return hasSign ? str.substring(1, stopPos) : str.substring(0, stopPos);
    }

    private static boolean isAllZeros(final java.lang.String str) {
        if (str == null) {
            return true;
        } 
        for (int i = ((_arithmeticOperatorHotSpot78.is("PLUS")) ? ((str.length()) + 1) : (_arithmeticOperatorHotSpot78.is("MINUS")) ? ((str.length()) - 1) : (_arithmeticOperatorHotSpot78.is("MUL")) ? ((str.length()) * 1) :  ((str.length()) / 1)) ; i >= 0 ; i--) {
            if ((str.charAt(i)) != '0') {
                return false;
            } 
        }
        return (str.length()) > 0;
    }

    public static java.lang.Float createFloat(final java.lang.String str) {
        if (str == null) {
            return null;
        } 
        return java.lang.Float.valueOf(str);
    }

    public static java.lang.Double createDouble(final java.lang.String str) {
        if (str == null) {
            return null;
        } 
        return java.lang.Double.valueOf(str);
    }

    public static java.lang.Integer createInteger(final java.lang.String str) {
        if (str == null) {
            return null;
        } 
        return java.lang.Integer.decode(str);
    }

    public static java.lang.Long createLong(final java.lang.String str) {
        if (str == null) {
            return null;
        } 
        return java.lang.Long.decode(str);
    }

    public static java.math.BigInteger createBigInteger(final java.lang.String str) {
        if (str == null) {
            return null;
        } 
        int pos = 0;
        int radix = 10;
        boolean negate = false;
        if (str.startsWith("-")) {
            negate = true;
            pos = 1;
        } 
        if ((str.startsWith("0x", pos)) || (str.startsWith("0X", pos))) {
            radix = 16;
            pos += 2;
        } else if (str.startsWith("#", pos)) {
            radix = 16;
            pos++;
        } else if ((str.startsWith("0", pos)) && ((str.length()) > ((_arithmeticOperatorHotSpot98.is("PLUS")) ? ((pos + 1)) : (_arithmeticOperatorHotSpot98.is("MINUS")) ? ((pos - 1)) : (_arithmeticOperatorHotSpot98.is("MUL")) ? ((pos * 1)) :  ((pos / 1))))) {
            radix = 8;
            pos++;
        } 
        final java.math.BigInteger value = new java.math.BigInteger(str.substring(pos) , radix);
        return negate ? value.negate() : value;
    }

    public static java.math.BigDecimal createBigDecimal(final java.lang.String str) {
        if (str == null) {
            return null;
        } 
        if (org.apache.commons.lang3.StringUtils.isBlank(str)) {
            throw new java.lang.NumberFormatException("A blank string is not a valid number");
        } 
        if (str.trim().startsWith("--")) {
            throw new java.lang.NumberFormatException((str + " is not a valid number."));
        } 
        return new java.math.BigDecimal(str);
    }

    public static long min(final long... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        long min = array[0];
        for (int i = 1 ; i < (array.length) ; i++) {
            if ((array[i]) < min) {
                min = array[i];
            } 
        }
        return min;
    }

    public static int min(final int... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        int min = array[0];
        for (int j = 1 ; j < (array.length) ; j++) {
            if ((array[j]) < min) {
                min = array[j];
            } 
        }
        return min;
    }

    public static short min(final short... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        short min = array[0];
        for (int i = 1 ; i < (array.length) ; i++) {
            if ((array[i]) < min) {
                min = array[i];
            } 
        }
        return min;
    }

    public static byte min(final byte... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        byte min = array[0];
        for (int i = 1 ; i < (array.length) ; i++) {
            if ((array[i]) < min) {
                min = array[i];
            } 
        }
        return min;
    }

    public static double min(final double... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        double min = array[0];
        for (int i = 1 ; i < (array.length) ; i++) {
            if (java.lang.Double.isNaN(array[i])) {
                return java.lang.Double.NaN;
            } 
            if ((array[i]) < min) {
                min = array[i];
            } 
        }
        return min;
    }

    public static float min(final float... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        float min = array[0];
        for (int i = 1 ; i < (array.length) ; i++) {
            if (java.lang.Float.isNaN(array[i])) {
                return java.lang.Float.NaN;
            } 
            if ((array[i]) < min) {
                min = array[i];
            } 
        }
        return min;
    }

    public static long max(final long... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        long max = array[0];
        for (int j = 1 ; j < (array.length) ; j++) {
            if ((array[j]) > max) {
                max = array[j];
            } 
        }
        return max;
    }

    public static int max(final int... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        int max = array[0];
        for (int j = 1 ; j < (array.length) ; j++) {
            if ((array[j]) > max) {
                max = array[j];
            } 
        }
        return max;
    }

    public static short max(final short... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        short max = array[0];
        for (int i = 1 ; i < (array.length) ; i++) {
            if ((array[i]) > max) {
                max = array[i];
            } 
        }
        return max;
    }

    public static byte max(final byte... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        byte max = array[0];
        for (int i = 1 ; i < (array.length) ; i++) {
            if ((array[i]) > max) {
                max = array[i];
            } 
        }
        return max;
    }

    public static double max(final double... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        double max = array[0];
        for (int j = 1 ; j < (array.length) ; j++) {
            if (java.lang.Double.isNaN(array[j])) {
                return java.lang.Double.NaN;
            } 
            if ((array[j]) > max) {
                max = array[j];
            } 
        }
        return max;
    }

    public static float max(final float... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        float max = array[0];
        for (int j = 1 ; j < (array.length) ; j++) {
            if (java.lang.Float.isNaN(array[j])) {
                return java.lang.Float.NaN;
            } 
            if ((array[j]) > max) {
                max = array[j];
            } 
        }
        return max;
    }

    private static void validateArray(final java.lang.Object array) {
        if (array == null) {
            throw new java.lang.IllegalArgumentException("The Array must not be null");
        } 
        org.apache.commons.lang3.Validate.isTrue(((java.lang.reflect.Array.getLength(array)) != 0), "Array cannot be empty.");
    }

    public static long min(long a, final long b, final long c) {
        if (b < a) {
            a = b;
        } 
        if (c < a) {
            a = c;
        } 
        return a;
    }

    public static int min(int a, final int b, final int c) {
        if (b < a) {
            a = b;
        } 
        if (c < a) {
            a = c;
        } 
        return a;
    }

    public static short min(short a, final short b, final short c) {
        if (b < a) {
            a = b;
        } 
        if (c < a) {
            a = c;
        } 
        return a;
    }

    public static byte min(byte a, final byte b, final byte c) {
        if (b < a) {
            a = b;
        } 
        if (c < a) {
            a = c;
        } 
        return a;
    }

    public static double min(final double a, final double b, final double c) {
        return java.lang.Math.min(java.lang.Math.min(a, b), c);
    }

    public static float min(final float a, final float b, final float c) {
        return java.lang.Math.min(java.lang.Math.min(a, b), c);
    }

    public static long max(long a, final long b, final long c) {
        if (b > a) {
            a = b;
        } 
        if (c > a) {
            a = c;
        } 
        return a;
    }

    public static int max(int a, final int b, final int c) {
        if (b > a) {
            a = b;
        } 
        if (c > a) {
            a = c;
        } 
        return a;
    }

    public static short max(short a, final short b, final short c) {
        if (b > a) {
            a = b;
        } 
        if (c > a) {
            a = c;
        } 
        return a;
    }

    public static byte max(byte a, final byte b, final byte c) {
        if (b > a) {
            a = b;
        } 
        if (c > a) {
            a = c;
        } 
        return a;
    }

    public static double max(final double a, final double b, final double c) {
        return java.lang.Math.max(java.lang.Math.max(a, b), c);
    }

    public static float max(final float a, final float b, final float c) {
        return java.lang.Math.max(java.lang.Math.max(a, b), c);
    }

    public static boolean isDigits(final java.lang.String str) {
        return org.apache.commons.lang3.StringUtils.isNumeric(str);
    }

    public static boolean isNumber(final java.lang.String str) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
            return false;
        } 
        final char[] chars = str.toCharArray();
        int sz = chars.length;
        boolean hasExp = false;
        boolean hasDecPoint = false;
        boolean allowSigns = false;
        boolean foundDigit = false;
        final int start = (chars[0]) == '-' ? 1 : 0;
        if ((sz > ((_arithmeticOperatorHotSpot79.is("PLUS")) ? ((start + 1)) : (_arithmeticOperatorHotSpot79.is("MINUS")) ? ((start - 1)) : (_arithmeticOperatorHotSpot79.is("MUL")) ? ((start * 1)) :  ((start / 1)))) && ((chars[start]) == '0')) {
            if (((chars[((_arithmeticOperatorHotSpot80.is("PLUS")) ? ((start + 1)) : (_arithmeticOperatorHotSpot80.is("MINUS")) ? ((start - 1)) : (_arithmeticOperatorHotSpot80.is("MUL")) ? ((start * 1)) :  ((start / 1)))]) == 'x') || ((chars[((_arithmeticOperatorHotSpot81.is("PLUS")) ? ((start + 1)) : (_arithmeticOperatorHotSpot81.is("MINUS")) ? ((start - 1)) : (_arithmeticOperatorHotSpot81.is("MUL")) ? ((start * 1)) :  ((start / 1)))]) == 'X')) {
                int i = ((_arithmeticOperatorHotSpot82.is("PLUS")) ? (start + 2) : (_arithmeticOperatorHotSpot82.is("MINUS")) ? (start - 2) : (_arithmeticOperatorHotSpot82.is("MUL")) ? (start * 2) :  (start / 2));
                if (i == sz) {
                    return false;
                } 
                for ( ; i < (chars.length) ; i++) {
                    if (((((chars[i]) < '0') || ((chars[i]) > '9')) && (((chars[i]) < 'a') || ((chars[i]) > 'f'))) && (((chars[i]) < 'A') || ((chars[i]) > 'F'))) {
                        return false;
                    } 
                }
                return true;
            } else if (java.lang.Character.isDigit(chars[((_arithmeticOperatorHotSpot83.is("PLUS")) ? ((start + 1)) : (_arithmeticOperatorHotSpot83.is("MINUS")) ? ((start - 1)) : (_arithmeticOperatorHotSpot83.is("MUL")) ? ((start * 1)) :  ((start / 1)))])) {
                int i = ((_arithmeticOperatorHotSpot84.is("PLUS")) ? (start + 1) : (_arithmeticOperatorHotSpot84.is("MINUS")) ? (start - 1) : (_arithmeticOperatorHotSpot84.is("MUL")) ? (start * 1) :  (start / 1));
                for ( ; i < (chars.length) ; i++) {
                    if (((chars[i]) < '0') || ((chars[i]) > '7')) {
                        return false;
                    } 
                }
                return true;
            } 
        } 
        sz--;
        int i = start;
        while ((i < sz) || (((i < ((_arithmeticOperatorHotSpot85.is("PLUS")) ? ((sz + 1)) : (_arithmeticOperatorHotSpot85.is("MINUS")) ? ((sz - 1)) : (_arithmeticOperatorHotSpot85.is("MUL")) ? ((sz * 1)) :  ((sz / 1)))) && allowSigns) && (!foundDigit))) {
            if (((chars[i]) >= '0') && ((chars[i]) <= '9')) {
                foundDigit = true;
                allowSigns = false;
            } else if ((chars[i]) == '.') {
                if (hasDecPoint || hasExp) {
                    return false;
                } 
                hasDecPoint = true;
            } else if (((chars[i]) == 'e') || ((chars[i]) == 'E')) {
                if (hasExp) {
                    return false;
                } 
                if (!foundDigit) {
                    return false;
                } 
                hasExp = true;
                allowSigns = true;
            } else if (((chars[i]) == '+') || ((chars[i]) == '-')) {
                if (!allowSigns) {
                    return false;
                } 
                allowSigns = false;
                foundDigit = false;
            } else {
                return false;
            }
            i++;
        }
        if (i < (chars.length)) {
            if (((chars[i]) >= '0') && ((chars[i]) <= '9')) {
                return true;
            } 
            if (((chars[i]) == 'e') || ((chars[i]) == 'E')) {
                return false;
            } 
            if ((chars[i]) == '.') {
                if (hasDecPoint || hasExp) {
                    return false;
                } 
                return foundDigit;
            } 
            if ((!allowSigns) && (((((chars[i]) == 'd') || ((chars[i]) == 'D')) || ((chars[i]) == 'f')) || ((chars[i]) == 'F'))) {
                return foundDigit;
            } 
            if (((chars[i]) == 'l') || ((chars[i]) == 'L')) {
                return (foundDigit && (!hasExp)) && (!hasDecPoint);
            } 
            return false;
        } 
        return (!allowSigns) && foundDigit;
    }

    public static boolean isParsable(final java.lang.String str) {
        if (org.apache.commons.lang3.StringUtils.endsWith(str, ".")) {
            return false;
        } 
        if (org.apache.commons.lang3.StringUtils.startsWith(str, "-")) {
            return org.apache.commons.lang3.math.NumberUtils.isDigits(org.apache.commons.lang3.StringUtils.replaceOnce(str.substring(1), ".", org.apache.commons.lang3.StringUtils.EMPTY));
        } else {
            return org.apache.commons.lang3.math.NumberUtils.isDigits(org.apache.commons.lang3.StringUtils.replaceOnce(str, ".", org.apache.commons.lang3.StringUtils.EMPTY));
        }
    }

    public static int compare(int x, int y) {
        if (x == y) {
            return 0;
        } 
        if (x < y) {
            return -1;
        } else {
            return 1;
        }
    }

    public static int compare(long x, long y) {
        if (x == y) {
            return 0;
        } 
        if (x < y) {
            return -1;
        } else {
            return 1;
        }
    }

    public static int compare(short x, short y) {
        if (x == y) {
            return 0;
        } 
        if (x < y) {
            return -1;
        } else {
            return 1;
        }
    }

    public static int compare(byte x, byte y) {
        return ((_arithmeticOperatorHotSpot86.is("PLUS")) ? (x + y) : (_arithmeticOperatorHotSpot86.is("MINUS")) ? (x - y) : (_arithmeticOperatorHotSpot86.is("MUL")) ? (x * y) :  (x / y));
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot78 = metamutator.Selector.of(78,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_arithmeticOperatorHotSpot78");

    private static final metamutator.Selector _arithmeticOperatorHotSpot79 = metamutator.Selector.of(79,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_arithmeticOperatorHotSpot79");

    private static final metamutator.Selector _arithmeticOperatorHotSpot80 = metamutator.Selector.of(80,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_arithmeticOperatorHotSpot80");

    private static final metamutator.Selector _arithmeticOperatorHotSpot81 = metamutator.Selector.of(81,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_arithmeticOperatorHotSpot81");

    private static final metamutator.Selector _arithmeticOperatorHotSpot82 = metamutator.Selector.of(82,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_arithmeticOperatorHotSpot82");

    private static final metamutator.Selector _arithmeticOperatorHotSpot83 = metamutator.Selector.of(83,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_arithmeticOperatorHotSpot83");

    private static final metamutator.Selector _arithmeticOperatorHotSpot84 = metamutator.Selector.of(84,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_arithmeticOperatorHotSpot84");

    private static final metamutator.Selector _arithmeticOperatorHotSpot85 = metamutator.Selector.of(85,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_arithmeticOperatorHotSpot85");

    private static final metamutator.Selector _arithmeticOperatorHotSpot86 = metamutator.Selector.of(86,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_arithmeticOperatorHotSpot86");

    private static final metamutator.Selector _arithmeticOperatorHotSpot87 = metamutator.Selector.of(87,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_arithmeticOperatorHotSpot87");

    private static final metamutator.Selector _arithmeticOperatorHotSpot88 = metamutator.Selector.of(88,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_arithmeticOperatorHotSpot88");

    private static final metamutator.Selector _arithmeticOperatorHotSpot89 = metamutator.Selector.of(89,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_arithmeticOperatorHotSpot89");

    private static final metamutator.Selector _arithmeticOperatorHotSpot90 = metamutator.Selector.of(90,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_arithmeticOperatorHotSpot90");

    private static final metamutator.Selector _arithmeticOperatorHotSpot91 = metamutator.Selector.of(91,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_arithmeticOperatorHotSpot91");

    private static final metamutator.Selector _arithmeticOperatorHotSpot92 = metamutator.Selector.of(92,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_arithmeticOperatorHotSpot92");

    private static final metamutator.Selector _arithmeticOperatorHotSpot93 = metamutator.Selector.of(93,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_arithmeticOperatorHotSpot93");

    private static final metamutator.Selector _arithmeticOperatorHotSpot94 = metamutator.Selector.of(94,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_arithmeticOperatorHotSpot94");

    private static final metamutator.Selector _arithmeticOperatorHotSpot95 = metamutator.Selector.of(95,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_arithmeticOperatorHotSpot95");

    private static final metamutator.Selector _arithmeticOperatorHotSpot96 = metamutator.Selector.of(96,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_arithmeticOperatorHotSpot96");

    private static final metamutator.Selector _arithmeticOperatorHotSpot97 = metamutator.Selector.of(97,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_arithmeticOperatorHotSpot97");

    private static final metamutator.Selector _arithmeticOperatorHotSpot98 = metamutator.Selector.of(98,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_arithmeticOperatorHotSpot98");
}

