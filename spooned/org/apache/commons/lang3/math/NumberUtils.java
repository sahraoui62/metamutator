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
        return ((_returnReplacementOperator723.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator723.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator723.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.math.NumberUtils.toInt(str, 0)));
    }

    public static int toInt(final java.lang.String str, final int defaultValue) {
        if (str == null) {
            return ((_returnReplacementOperator724.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator724.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator724.is("ZERO")) ? ( 0 ) : (defaultValue));
        } 
        try {
            return ((_returnReplacementOperator725.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator725.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator725.is("ZERO")) ? ( 0 ) : (java.lang.Integer.parseInt(str)));
        } catch (final java.lang.NumberFormatException nfe) {
            return ((_returnReplacementOperator726.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator726.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator726.is("ZERO")) ? ( 0 ) : (defaultValue));
        }
    }

    public static long toLong(final java.lang.String str) {
        return ((_returnReplacementOperator760.is("NULL")) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.toLong(str, 0L)));
    }

    public static long toLong(final java.lang.String str, final long defaultValue) {
        if (str == null) {
            return ((_returnReplacementOperator761.is("NULL")) ? ( null ) : (defaultValue));
        } 
        try {
            return ((_returnReplacementOperator762.is("NULL")) ? ( null ) : (java.lang.Long.parseLong(str)));
        } catch (final java.lang.NumberFormatException nfe) {
            return ((_returnReplacementOperator763.is("NULL")) ? ( null ) : (defaultValue));
        }
    }

    public static float toFloat(final java.lang.String str) {
        return ((_returnReplacementOperator705.is("NULL")) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.toFloat(str, 0.0F)));
    }

    public static float toFloat(final java.lang.String str, final float defaultValue) {
        if (str == null) {
            return ((_returnReplacementOperator706.is("NULL")) ? ( null ) : (defaultValue));
        } 
        try {
            return ((_returnReplacementOperator707.is("NULL")) ? ( null ) : (java.lang.Float.parseFloat(str)));
        } catch (final java.lang.NumberFormatException nfe) {
            return ((_returnReplacementOperator708.is("NULL")) ? ( null ) : (defaultValue));
        }
    }

    public static double toDouble(final java.lang.String str) {
        return ((_returnReplacementOperator695.is("NULL")) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.toDouble(str, 0.0)));
    }

    public static double toDouble(final java.lang.String str, final double defaultValue) {
        if (str == null) {
            return ((_returnReplacementOperator696.is("NULL")) ? ( null ) : (defaultValue));
        } 
        try {
            return ((_returnReplacementOperator697.is("NULL")) ? ( null ) : (java.lang.Double.parseDouble(str)));
        } catch (final java.lang.NumberFormatException nfe) {
            return ((_returnReplacementOperator698.is("NULL")) ? ( null ) : (defaultValue));
        }
    }

    public static byte toByte(final java.lang.String str) {
        return ((_returnReplacementOperator685.is("NULL")) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.toByte(str, ((byte)(0)))));
    }

    public static byte toByte(final java.lang.String str, final byte defaultValue) {
        if (str == null) {
            return ((_returnReplacementOperator686.is("NULL")) ? ( null ) : (defaultValue));
        } 
        try {
            return ((_returnReplacementOperator687.is("NULL")) ? ( null ) : (java.lang.Byte.parseByte(str)));
        } catch (final java.lang.NumberFormatException nfe) {
            return ((_returnReplacementOperator688.is("NULL")) ? ( null ) : (defaultValue));
        }
    }

    public static short toShort(final java.lang.String str) {
        return ((_returnReplacementOperator768.is("NULL")) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.toShort(str, ((short)(0)))));
    }

    public static short toShort(final java.lang.String str, final short defaultValue) {
        if (str == null) {
            return ((_returnReplacementOperator769.is("NULL")) ? ( null ) : (defaultValue));
        } 
        try {
            return ((_returnReplacementOperator770.is("NULL")) ? ( null ) : (java.lang.Short.parseShort(str)));
        } catch (final java.lang.NumberFormatException nfe) {
            return ((_returnReplacementOperator771.is("NULL")) ? ( null ) : (defaultValue));
        }
    }

    public static java.lang.Number createNumber(final java.lang.String str) throws java.lang.NumberFormatException {
        if (str == null) {
            return ((_returnReplacementOperator735.is("NULL")) ? ( null ) : (null));
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
            final int hexDigits = (str.length()) - pfxLen;
            if ((hexDigits > 16) || ((hexDigits == 16) && (firstSigDigit > '7'))) {
                return ((_returnReplacementOperator736.is("NULL")) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.createBigInteger(str)));
            } 
            if ((hexDigits > 8) || ((hexDigits == 8) && (firstSigDigit > '7'))) {
                return ((_returnReplacementOperator737.is("NULL")) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.createLong(str)));
            } 
            return ((_returnReplacementOperator738.is("NULL")) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.createInteger(str)));
        } 
        final char lastChar = str.charAt(((str.length()) - 1));
        java.lang.String mant;
        java.lang.String dec;
        java.lang.String exp;
        final int decPos = str.indexOf('.');
        final int expPos = ((str.indexOf('e')) + (str.indexOf('E'))) + 1;
        int numDecimals = 0;
        if (decPos > (-1)) {
            if (expPos > (-1)) {
                if ((expPos < decPos) || (expPos > (str.length()))) {
                    throw new java.lang.NumberFormatException((str + " is not a valid number."));
                } 
                dec = str.substring((decPos + 1), expPos);
            } else {
                dec = str.substring((decPos + 1));
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
            if ((expPos > (-1)) && (expPos < ((str.length()) - 1))) {
                exp = str.substring((expPos + 1), ((str.length()) - 1));
            } else {
                exp = null;
            }
            final java.lang.String numeric = str.substring(0, ((str.length()) - 1));
            final boolean allZeros = (org.apache.commons.lang3.math.NumberUtils.isAllZeros(mant)) && (org.apache.commons.lang3.math.NumberUtils.isAllZeros(exp));
            switch (lastChar) {
                case 'l' :
                case 'L' :
                    if (((dec == null) && (exp == null)) && ((((numeric.charAt(0)) == '-') && (org.apache.commons.lang3.math.NumberUtils.isDigits(numeric.substring(1)))) || (org.apache.commons.lang3.math.NumberUtils.isDigits(numeric)))) {
                        try {
                            return ((_returnReplacementOperator739.is("NULL")) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.createLong(numeric)));
                        } catch (final java.lang.NumberFormatException nfe) {
                        }
                        return ((_returnReplacementOperator740.is("NULL")) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.createBigInteger(numeric)));
                    } 
                    throw new java.lang.NumberFormatException((str + " is not a valid number."));
                case 'f' :
                case 'F' :
                    try {
                        final java.lang.Float f = org.apache.commons.lang3.math.NumberUtils.createFloat(numeric);
                        if (!((f.isInfinite()) || (((f.floatValue()) == 0.0F) && (!allZeros)))) {
                            return ((_returnReplacementOperator741.is("NULL")) ? ( null ) : (f));
                        } 
                    } catch (final java.lang.NumberFormatException nfe) {
                    }
                case 'd' :
                case 'D' :
                    try {
                        final java.lang.Double d = org.apache.commons.lang3.math.NumberUtils.createDouble(numeric);
                        if (!((d.isInfinite()) || (((d.floatValue()) == 0.0) && (!allZeros)))) {
                            return ((_returnReplacementOperator742.is("NULL")) ? ( null ) : (d));
                        } 
                    } catch (final java.lang.NumberFormatException nfe) {
                    }
                    try {
                        return ((_returnReplacementOperator743.is("NULL")) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.createBigDecimal(numeric)));
                    } catch (final java.lang.NumberFormatException e) {
                    }
                default :
                    throw new java.lang.NumberFormatException((str + " is not a valid number."));
            }
        } 
        if ((expPos > (-1)) && (expPos < ((str.length()) - 1))) {
            exp = str.substring((expPos + 1), str.length());
        } else {
            exp = null;
        }
        if ((dec == null) && (exp == null)) {
            try {
                return ((_returnReplacementOperator744.is("NULL")) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.createInteger(str)));
            } catch (final java.lang.NumberFormatException nfe) {
            }
            try {
                return ((_returnReplacementOperator745.is("NULL")) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.createLong(str)));
            } catch (final java.lang.NumberFormatException nfe) {
            }
            return ((_returnReplacementOperator746.is("NULL")) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.createBigInteger(str)));
        } 
        final boolean allZeros = (org.apache.commons.lang3.math.NumberUtils.isAllZeros(mant)) && (org.apache.commons.lang3.math.NumberUtils.isAllZeros(exp));
        try {
            if (numDecimals <= 7) {
                final java.lang.Float f = org.apache.commons.lang3.math.NumberUtils.createFloat(str);
                if (!((f.isInfinite()) || (((f.floatValue()) == 0.0F) && (!allZeros)))) {
                    return ((_returnReplacementOperator747.is("NULL")) ? ( null ) : (f));
                } 
            } 
        } catch (final java.lang.NumberFormatException nfe) {
        }
        try {
            if (numDecimals <= 16) {
                final java.lang.Double d = org.apache.commons.lang3.math.NumberUtils.createDouble(str);
                if (!((d.isInfinite()) || (((d.doubleValue()) == 0.0) && (!allZeros)))) {
                    return ((_returnReplacementOperator748.is("NULL")) ? ( null ) : (d));
                } 
            } 
        } catch (final java.lang.NumberFormatException nfe) {
        }
        return ((_returnReplacementOperator749.is("NULL")) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.createBigDecimal(str)));
    }

    private static java.lang.String getMantissa(final java.lang.String str) {
        return ((_returnReplacementOperator750.is("NULL")) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.getMantissa(str, str.length())));
    }

    private static java.lang.String getMantissa(final java.lang.String str, final int stopPos) {
        final char firstChar = str.charAt(0);
        final boolean hasSign = (firstChar == '-') || (firstChar == '+');
        return ((_returnReplacementOperator751.is("NULL")) ? ( null ) : (hasSign ? str.substring(1, stopPos) : str.substring(0, stopPos)));
    }

    private static boolean isAllZeros(final java.lang.String str) {
        if (str == null) {
            return ((_returnReplacementOperator655.is("NULL")) ? ( null ) : (true));
        } 
        for (int i = (str.length()) - 1 ; i >= 0 ; i--) {
            if ((str.charAt(i)) != '0') {
                return ((_returnReplacementOperator656.is("NULL")) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperator657.is("NULL")) ? ( null ) : ((str.length()) > 0));
    }

    public static java.lang.Float createFloat(final java.lang.String str) {
        if (str == null) {
            return ((_returnReplacementOperator729.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator730.is("NULL")) ? ( null ) : (java.lang.Float.valueOf(str)));
    }

    public static java.lang.Double createDouble(final java.lang.String str) {
        if (str == null) {
            return ((_returnReplacementOperator727.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator728.is("NULL")) ? ( null ) : (java.lang.Double.valueOf(str)));
    }

    public static java.lang.Integer createInteger(final java.lang.String str) {
        if (str == null) {
            return ((_returnReplacementOperator731.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator732.is("NULL")) ? ( null ) : (java.lang.Integer.decode(str)));
    }

    public static java.lang.Long createLong(final java.lang.String str) {
        if (str == null) {
            return ((_returnReplacementOperator733.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator734.is("NULL")) ? ( null ) : (java.lang.Long.decode(str)));
    }

    public static java.math.BigInteger createBigInteger(final java.lang.String str) {
        if (str == null) {
            return ((_returnReplacementOperator754.is("NULL")) ? ( null ) : (null));
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
        } else if ((str.startsWith("0", pos)) && ((str.length()) > (pos + 1))) {
            radix = 8;
            pos++;
        } 
        final java.math.BigInteger value = new java.math.BigInteger(str.substring(pos) , radix);
        return ((_returnReplacementOperator755.is("NULL")) ? ( null ) : (negate ? value.negate() : value));
    }

    public static java.math.BigDecimal createBigDecimal(final java.lang.String str) {
        if (str == null) {
            return ((_returnReplacementOperator752.is("NULL")) ? ( null ) : (null));
        } 
        if (org.apache.commons.lang3.StringUtils.isBlank(str)) {
            throw new java.lang.NumberFormatException("A blank string is not a valid number");
        } 
        if (str.trim().startsWith("--")) {
            throw new java.lang.NumberFormatException((str + " is not a valid number."));
        } 
        return ((_returnReplacementOperator753.is("NULL")) ? ( null ) : (new java.math.BigDecimal(str)));
    }

    public static long min(final long... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        long min = array[0];
        for (int i = 1 ; i < (array.length) ; i++) {
            if ((array[i]) < min) {
                min = array[i];
            } 
        }
        return ((_returnReplacementOperator759.is("NULL")) ? ( null ) : (min));
    }

    public static int min(final int... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        int min = array[0];
        for (int j = 1 ; j < (array.length) ; j++) {
            if ((array[j]) < min) {
                min = array[j];
            } 
        }
        return ((_returnReplacementOperator722.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator722.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator722.is("ZERO")) ? ( 0 ) : (min));
    }

    public static short min(final short... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        short min = array[0];
        for (int i = 1 ; i < (array.length) ; i++) {
            if ((array[i]) < min) {
                min = array[i];
            } 
        }
        return ((_returnReplacementOperator767.is("NULL")) ? ( null ) : (min));
    }

    public static byte min(final byte... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        byte min = array[0];
        for (int i = 1 ; i < (array.length) ; i++) {
            if ((array[i]) < min) {
                min = array[i];
            } 
        }
        return ((_returnReplacementOperator684.is("NULL")) ? ( null ) : (min));
    }

    public static double min(final double... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        double min = array[0];
        for (int i = 1 ; i < (array.length) ; i++) {
            if (java.lang.Double.isNaN(array[i])) {
                return ((_returnReplacementOperator693.is("NULL")) ? ( null ) : (java.lang.Double.NaN));
            } 
            if ((array[i]) < min) {
                min = array[i];
            } 
        }
        return ((_returnReplacementOperator694.is("NULL")) ? ( null ) : (min));
    }

    public static float min(final float... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        float min = array[0];
        for (int i = 1 ; i < (array.length) ; i++) {
            if (java.lang.Float.isNaN(array[i])) {
                return ((_returnReplacementOperator703.is("NULL")) ? ( null ) : (java.lang.Float.NaN));
            } 
            if ((array[i]) < min) {
                min = array[i];
            } 
        }
        return ((_returnReplacementOperator704.is("NULL")) ? ( null ) : (min));
    }

    public static long max(final long... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        long max = array[0];
        for (int j = 1 ; j < (array.length) ; j++) {
            if ((array[j]) > max) {
                max = array[j];
            } 
        }
        return ((_returnReplacementOperator757.is("NULL")) ? ( null ) : (max));
    }

    public static int max(final int... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        int max = array[0];
        for (int j = 1 ; j < (array.length) ; j++) {
            if ((array[j]) > max) {
                max = array[j];
            } 
        }
        return ((_returnReplacementOperator720.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator720.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator720.is("ZERO")) ? ( 0 ) : (max));
    }

    public static short max(final short... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        short max = array[0];
        for (int i = 1 ; i < (array.length) ; i++) {
            if ((array[i]) > max) {
                max = array[i];
            } 
        }
        return ((_returnReplacementOperator765.is("NULL")) ? ( null ) : (max));
    }

    public static byte max(final byte... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        byte max = array[0];
        for (int i = 1 ; i < (array.length) ; i++) {
            if ((array[i]) > max) {
                max = array[i];
            } 
        }
        return ((_returnReplacementOperator682.is("NULL")) ? ( null ) : (max));
    }

    public static double max(final double... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        double max = array[0];
        for (int j = 1 ; j < (array.length) ; j++) {
            if (java.lang.Double.isNaN(array[j])) {
                return ((_returnReplacementOperator690.is("NULL")) ? ( null ) : (java.lang.Double.NaN));
            } 
            if ((array[j]) > max) {
                max = array[j];
            } 
        }
        return ((_returnReplacementOperator691.is("NULL")) ? ( null ) : (max));
    }

    public static float max(final float... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        float max = array[0];
        for (int j = 1 ; j < (array.length) ; j++) {
            if (java.lang.Float.isNaN(array[j])) {
                return ((_returnReplacementOperator700.is("NULL")) ? ( null ) : (java.lang.Float.NaN));
            } 
            if ((array[j]) > max) {
                max = array[j];
            } 
        }
        return ((_returnReplacementOperator701.is("NULL")) ? ( null ) : (max));
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
        return ((_returnReplacementOperator758.is("NULL")) ? ( null ) : (a));
    }

    public static int min(int a, final int b, final int c) {
        if (b < a) {
            a = b;
        } 
        if (c < a) {
            a = c;
        } 
        return ((_returnReplacementOperator721.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator721.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator721.is("ZERO")) ? ( 0 ) : (a));
    }

    public static short min(short a, final short b, final short c) {
        if (b < a) {
            a = b;
        } 
        if (c < a) {
            a = c;
        } 
        return ((_returnReplacementOperator766.is("NULL")) ? ( null ) : (a));
    }

    public static byte min(byte a, final byte b, final byte c) {
        if (b < a) {
            a = b;
        } 
        if (c < a) {
            a = c;
        } 
        return ((_returnReplacementOperator683.is("NULL")) ? ( null ) : (a));
    }

    public static double min(final double a, final double b, final double c) {
        return ((_returnReplacementOperator692.is("NULL")) ? ( null ) : (java.lang.Math.min(java.lang.Math.min(a, b), c)));
    }

    public static float min(final float a, final float b, final float c) {
        return ((_returnReplacementOperator702.is("NULL")) ? ( null ) : (java.lang.Math.min(java.lang.Math.min(a, b), c)));
    }

    public static long max(long a, final long b, final long c) {
        if (b > a) {
            a = b;
        } 
        if (c > a) {
            a = c;
        } 
        return ((_returnReplacementOperator756.is("NULL")) ? ( null ) : (a));
    }

    public static int max(int a, final int b, final int c) {
        if (b > a) {
            a = b;
        } 
        if (c > a) {
            a = c;
        } 
        return ((_returnReplacementOperator719.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator719.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator719.is("ZERO")) ? ( 0 ) : (a));
    }

    public static short max(short a, final short b, final short c) {
        if (b > a) {
            a = b;
        } 
        if (c > a) {
            a = c;
        } 
        return ((_returnReplacementOperator764.is("NULL")) ? ( null ) : (a));
    }

    public static byte max(byte a, final byte b, final byte c) {
        if (b > a) {
            a = b;
        } 
        if (c > a) {
            a = c;
        } 
        return ((_returnReplacementOperator681.is("NULL")) ? ( null ) : (a));
    }

    public static double max(final double a, final double b, final double c) {
        return ((_returnReplacementOperator689.is("NULL")) ? ( null ) : (java.lang.Math.max(java.lang.Math.max(a, b), c)));
    }

    public static float max(final float a, final float b, final float c) {
        return ((_returnReplacementOperator699.is("NULL")) ? ( null ) : (java.lang.Math.max(java.lang.Math.max(a, b), c)));
    }

    public static boolean isDigits(final java.lang.String str) {
        return ((_returnReplacementOperator658.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.isNumeric(str)));
    }

    public static boolean isNumber(final java.lang.String str) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
            return ((_returnReplacementOperator659.is("NULL")) ? ( null ) : (false));
        } 
        final char[] chars = str.toCharArray();
        int sz = chars.length;
        boolean hasExp = false;
        boolean hasDecPoint = false;
        boolean allowSigns = false;
        boolean foundDigit = false;
        final int start = (chars[0]) == '-' ? 1 : 0;
        if ((sz > (start + 1)) && ((chars[start]) == '0')) {
            if (((chars[(start + 1)]) == 'x') || ((chars[(start + 1)]) == 'X')) {
                int i = start + 2;
                if (i == sz) {
                    return ((_returnReplacementOperator660.is("NULL")) ? ( null ) : (false));
                } 
                for ( ; i < (chars.length) ; i++) {
                    if (((((chars[i]) < '0') || ((chars[i]) > '9')) && (((chars[i]) < 'a') || ((chars[i]) > 'f'))) && (((chars[i]) < 'A') || ((chars[i]) > 'F'))) {
                        return ((_returnReplacementOperator661.is("NULL")) ? ( null ) : (false));
                    } 
                }
                return ((_returnReplacementOperator662.is("NULL")) ? ( null ) : (true));
            } else if (java.lang.Character.isDigit(chars[(start + 1)])) {
                int i = start + 1;
                for ( ; i < (chars.length) ; i++) {
                    if (((chars[i]) < '0') || ((chars[i]) > '7')) {
                        return ((_returnReplacementOperator663.is("NULL")) ? ( null ) : (false));
                    } 
                }
                return ((_returnReplacementOperator664.is("NULL")) ? ( null ) : (true));
            } 
        } 
        sz--;
        int i = start;
        while ((i < sz) || (((i < (sz + 1)) && allowSigns) && (!foundDigit))) {
            if (((chars[i]) >= '0') && ((chars[i]) <= '9')) {
                foundDigit = true;
                allowSigns = false;
            } else if ((chars[i]) == '.') {
                if (hasDecPoint || hasExp) {
                    return ((_returnReplacementOperator665.is("NULL")) ? ( null ) : (false));
                } 
                hasDecPoint = true;
            } else if (((chars[i]) == 'e') || ((chars[i]) == 'E')) {
                if (hasExp) {
                    return ((_returnReplacementOperator666.is("NULL")) ? ( null ) : (false));
                } 
                if (!foundDigit) {
                    return ((_returnReplacementOperator667.is("NULL")) ? ( null ) : (false));
                } 
                hasExp = true;
                allowSigns = true;
            } else if (((chars[i]) == '+') || ((chars[i]) == '-')) {
                if (!allowSigns) {
                    return ((_returnReplacementOperator668.is("NULL")) ? ( null ) : (false));
                } 
                allowSigns = false;
                foundDigit = false;
            } else {
                return ((_returnReplacementOperator669.is("NULL")) ? ( null ) : (false));
            }
            i++;
        }
        if (i < (chars.length)) {
            if (((chars[i]) >= '0') && ((chars[i]) <= '9')) {
                return ((_returnReplacementOperator670.is("NULL")) ? ( null ) : (true));
            } 
            if (((chars[i]) == 'e') || ((chars[i]) == 'E')) {
                return ((_returnReplacementOperator671.is("NULL")) ? ( null ) : (false));
            } 
            if ((chars[i]) == '.') {
                if (hasDecPoint || hasExp) {
                    return ((_returnReplacementOperator672.is("NULL")) ? ( null ) : (false));
                } 
                return ((_returnReplacementOperator673.is("NULL")) ? ( null ) : (foundDigit));
            } 
            if ((!allowSigns) && (((((chars[i]) == 'd') || ((chars[i]) == 'D')) || ((chars[i]) == 'f')) || ((chars[i]) == 'F'))) {
                return ((_returnReplacementOperator674.is("NULL")) ? ( null ) : (foundDigit));
            } 
            if (((chars[i]) == 'l') || ((chars[i]) == 'L')) {
                return ((_returnReplacementOperator675.is("NULL")) ? ( null ) : ((foundDigit && (!hasExp)) && (!hasDecPoint)));
            } 
            return ((_returnReplacementOperator676.is("NULL")) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperator677.is("NULL")) ? ( null ) : ((!allowSigns) && foundDigit));
    }

    public static boolean isParsable(final java.lang.String str) {
        if (org.apache.commons.lang3.StringUtils.endsWith(str, ".")) {
            return ((_returnReplacementOperator678.is("NULL")) ? ( null ) : (false));
        } 
        if (org.apache.commons.lang3.StringUtils.startsWith(str, "-")) {
            return ((_returnReplacementOperator679.is("NULL")) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.isDigits(org.apache.commons.lang3.StringUtils.replaceOnce(str.substring(1), ".", org.apache.commons.lang3.StringUtils.EMPTY))));
        } else {
            return ((_returnReplacementOperator680.is("NULL")) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.isDigits(org.apache.commons.lang3.StringUtils.replaceOnce(str, ".", org.apache.commons.lang3.StringUtils.EMPTY))));
        }
    }

    public static int compare(int x, int y) {
        if (x == y) {
            return ((_returnReplacementOperator710.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator710.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator710.is("ZERO")) ? ( 0 ) : (0));
        } 
        if (x < y) {
            return ((_returnReplacementOperator711.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator711.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator711.is("ZERO")) ? ( 0 ) : (-1));
        } else {
            return ((_returnReplacementOperator712.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator712.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator712.is("ZERO")) ? ( 0 ) : (1));
        }
    }

    public static int compare(long x, long y) {
        if (x == y) {
            return ((_returnReplacementOperator713.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator713.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator713.is("ZERO")) ? ( 0 ) : (0));
        } 
        if (x < y) {
            return ((_returnReplacementOperator714.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator714.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator714.is("ZERO")) ? ( 0 ) : (-1));
        } else {
            return ((_returnReplacementOperator715.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator715.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator715.is("ZERO")) ? ( 0 ) : (1));
        }
    }

    public static int compare(short x, short y) {
        if (x == y) {
            return ((_returnReplacementOperator716.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator716.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator716.is("ZERO")) ? ( 0 ) : (0));
        } 
        if (x < y) {
            return ((_returnReplacementOperator717.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator717.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator717.is("ZERO")) ? ( 0 ) : (-1));
        } else {
            return ((_returnReplacementOperator718.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator718.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator718.is("ZERO")) ? ( 0 ) : (1));
        }
    }

    public static int compare(byte x, byte y) {
        return ((_returnReplacementOperator709.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator709.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator709.is("ZERO")) ? ( 0 ) : (x - y));
    }

    private static final metamutator.Selector _returnReplacementOperator655 = metamutator.Selector.of(655,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator655");

    private static final metamutator.Selector _returnReplacementOperator656 = metamutator.Selector.of(656,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator656");

    private static final metamutator.Selector _returnReplacementOperator657 = metamutator.Selector.of(657,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator657");

    private static final metamutator.Selector _returnReplacementOperator658 = metamutator.Selector.of(658,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator658");

    private static final metamutator.Selector _returnReplacementOperator659 = metamutator.Selector.of(659,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator659");

    private static final metamutator.Selector _returnReplacementOperator660 = metamutator.Selector.of(660,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator660");

    private static final metamutator.Selector _returnReplacementOperator661 = metamutator.Selector.of(661,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator661");

    private static final metamutator.Selector _returnReplacementOperator662 = metamutator.Selector.of(662,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator662");

    private static final metamutator.Selector _returnReplacementOperator663 = metamutator.Selector.of(663,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator663");

    private static final metamutator.Selector _returnReplacementOperator664 = metamutator.Selector.of(664,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator664");

    private static final metamutator.Selector _returnReplacementOperator665 = metamutator.Selector.of(665,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator665");

    private static final metamutator.Selector _returnReplacementOperator666 = metamutator.Selector.of(666,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator666");

    private static final metamutator.Selector _returnReplacementOperator667 = metamutator.Selector.of(667,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator667");

    private static final metamutator.Selector _returnReplacementOperator668 = metamutator.Selector.of(668,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator668");

    private static final metamutator.Selector _returnReplacementOperator669 = metamutator.Selector.of(669,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator669");

    private static final metamutator.Selector _returnReplacementOperator670 = metamutator.Selector.of(670,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator670");

    private static final metamutator.Selector _returnReplacementOperator671 = metamutator.Selector.of(671,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator671");

    private static final metamutator.Selector _returnReplacementOperator672 = metamutator.Selector.of(672,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator672");

    private static final metamutator.Selector _returnReplacementOperator673 = metamutator.Selector.of(673,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator673");

    private static final metamutator.Selector _returnReplacementOperator674 = metamutator.Selector.of(674,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator674");

    private static final metamutator.Selector _returnReplacementOperator675 = metamutator.Selector.of(675,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator675");

    private static final metamutator.Selector _returnReplacementOperator676 = metamutator.Selector.of(676,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator676");

    private static final metamutator.Selector _returnReplacementOperator677 = metamutator.Selector.of(677,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator677");

    private static final metamutator.Selector _returnReplacementOperator678 = metamutator.Selector.of(678,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator678");

    private static final metamutator.Selector _returnReplacementOperator679 = metamutator.Selector.of(679,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator679");

    private static final metamutator.Selector _returnReplacementOperator680 = metamutator.Selector.of(680,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator680");

    private static final metamutator.Selector _returnReplacementOperator681 = metamutator.Selector.of(681,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator681");

    private static final metamutator.Selector _returnReplacementOperator682 = metamutator.Selector.of(682,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator682");

    private static final metamutator.Selector _returnReplacementOperator683 = metamutator.Selector.of(683,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator683");

    private static final metamutator.Selector _returnReplacementOperator684 = metamutator.Selector.of(684,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator684");

    private static final metamutator.Selector _returnReplacementOperator685 = metamutator.Selector.of(685,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator685");

    private static final metamutator.Selector _returnReplacementOperator686 = metamutator.Selector.of(686,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator686");

    private static final metamutator.Selector _returnReplacementOperator687 = metamutator.Selector.of(687,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator687");

    private static final metamutator.Selector _returnReplacementOperator688 = metamutator.Selector.of(688,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator688");

    private static final metamutator.Selector _returnReplacementOperator689 = metamutator.Selector.of(689,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator689");

    private static final metamutator.Selector _returnReplacementOperator690 = metamutator.Selector.of(690,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator690");

    private static final metamutator.Selector _returnReplacementOperator691 = metamutator.Selector.of(691,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator691");

    private static final metamutator.Selector _returnReplacementOperator692 = metamutator.Selector.of(692,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator692");

    private static final metamutator.Selector _returnReplacementOperator693 = metamutator.Selector.of(693,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator693");

    private static final metamutator.Selector _returnReplacementOperator694 = metamutator.Selector.of(694,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator694");

    private static final metamutator.Selector _returnReplacementOperator695 = metamutator.Selector.of(695,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator695");

    private static final metamutator.Selector _returnReplacementOperator696 = metamutator.Selector.of(696,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator696");

    private static final metamutator.Selector _returnReplacementOperator697 = metamutator.Selector.of(697,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator697");

    private static final metamutator.Selector _returnReplacementOperator698 = metamutator.Selector.of(698,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator698");

    private static final metamutator.Selector _returnReplacementOperator699 = metamutator.Selector.of(699,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator699");

    private static final metamutator.Selector _returnReplacementOperator700 = metamutator.Selector.of(700,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator700");

    private static final metamutator.Selector _returnReplacementOperator701 = metamutator.Selector.of(701,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator701");

    private static final metamutator.Selector _returnReplacementOperator702 = metamutator.Selector.of(702,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator702");

    private static final metamutator.Selector _returnReplacementOperator703 = metamutator.Selector.of(703,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator703");

    private static final metamutator.Selector _returnReplacementOperator704 = metamutator.Selector.of(704,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator704");

    private static final metamutator.Selector _returnReplacementOperator705 = metamutator.Selector.of(705,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator705");

    private static final metamutator.Selector _returnReplacementOperator706 = metamutator.Selector.of(706,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator706");

    private static final metamutator.Selector _returnReplacementOperator707 = metamutator.Selector.of(707,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator707");

    private static final metamutator.Selector _returnReplacementOperator708 = metamutator.Selector.of(708,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator708");

    private static final metamutator.Selector _returnReplacementOperator709 = metamutator.Selector.of(709,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator709");

    private static final metamutator.Selector _returnReplacementOperator710 = metamutator.Selector.of(710,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator710");

    private static final metamutator.Selector _returnReplacementOperator711 = metamutator.Selector.of(711,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator711");

    private static final metamutator.Selector _returnReplacementOperator712 = metamutator.Selector.of(712,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator712");

    private static final metamutator.Selector _returnReplacementOperator713 = metamutator.Selector.of(713,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator713");

    private static final metamutator.Selector _returnReplacementOperator714 = metamutator.Selector.of(714,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator714");

    private static final metamutator.Selector _returnReplacementOperator715 = metamutator.Selector.of(715,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator715");

    private static final metamutator.Selector _returnReplacementOperator716 = metamutator.Selector.of(716,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator716");

    private static final metamutator.Selector _returnReplacementOperator717 = metamutator.Selector.of(717,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator717");

    private static final metamutator.Selector _returnReplacementOperator718 = metamutator.Selector.of(718,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator718");

    private static final metamutator.Selector _returnReplacementOperator719 = metamutator.Selector.of(719,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator719");

    private static final metamutator.Selector _returnReplacementOperator720 = metamutator.Selector.of(720,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator720");

    private static final metamutator.Selector _returnReplacementOperator721 = metamutator.Selector.of(721,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator721");

    private static final metamutator.Selector _returnReplacementOperator722 = metamutator.Selector.of(722,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator722");

    private static final metamutator.Selector _returnReplacementOperator723 = metamutator.Selector.of(723,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator723");

    private static final metamutator.Selector _returnReplacementOperator724 = metamutator.Selector.of(724,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator724");

    private static final metamutator.Selector _returnReplacementOperator725 = metamutator.Selector.of(725,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator725");

    private static final metamutator.Selector _returnReplacementOperator726 = metamutator.Selector.of(726,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator726");

    private static final metamutator.Selector _returnReplacementOperator727 = metamutator.Selector.of(727,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator727");

    private static final metamutator.Selector _returnReplacementOperator728 = metamutator.Selector.of(728,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator728");

    private static final metamutator.Selector _returnReplacementOperator729 = metamutator.Selector.of(729,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator729");

    private static final metamutator.Selector _returnReplacementOperator730 = metamutator.Selector.of(730,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator730");

    private static final metamutator.Selector _returnReplacementOperator731 = metamutator.Selector.of(731,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator731");

    private static final metamutator.Selector _returnReplacementOperator732 = metamutator.Selector.of(732,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator732");

    private static final metamutator.Selector _returnReplacementOperator733 = metamutator.Selector.of(733,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator733");

    private static final metamutator.Selector _returnReplacementOperator734 = metamutator.Selector.of(734,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator734");

    private static final metamutator.Selector _returnReplacementOperator735 = metamutator.Selector.of(735,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator735");

    private static final metamutator.Selector _returnReplacementOperator736 = metamutator.Selector.of(736,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator736");

    private static final metamutator.Selector _returnReplacementOperator737 = metamutator.Selector.of(737,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator737");

    private static final metamutator.Selector _returnReplacementOperator738 = metamutator.Selector.of(738,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator738");

    private static final metamutator.Selector _returnReplacementOperator739 = metamutator.Selector.of(739,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator739");

    private static final metamutator.Selector _returnReplacementOperator740 = metamutator.Selector.of(740,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator740");

    private static final metamutator.Selector _returnReplacementOperator741 = metamutator.Selector.of(741,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator741");

    private static final metamutator.Selector _returnReplacementOperator742 = metamutator.Selector.of(742,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator742");

    private static final metamutator.Selector _returnReplacementOperator743 = metamutator.Selector.of(743,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator743");

    private static final metamutator.Selector _returnReplacementOperator744 = metamutator.Selector.of(744,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator744");

    private static final metamutator.Selector _returnReplacementOperator745 = metamutator.Selector.of(745,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator745");

    private static final metamutator.Selector _returnReplacementOperator746 = metamutator.Selector.of(746,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator746");

    private static final metamutator.Selector _returnReplacementOperator747 = metamutator.Selector.of(747,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator747");

    private static final metamutator.Selector _returnReplacementOperator748 = metamutator.Selector.of(748,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator748");

    private static final metamutator.Selector _returnReplacementOperator749 = metamutator.Selector.of(749,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator749");

    private static final metamutator.Selector _returnReplacementOperator750 = metamutator.Selector.of(750,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator750");

    private static final metamutator.Selector _returnReplacementOperator751 = metamutator.Selector.of(751,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator751");

    private static final metamutator.Selector _returnReplacementOperator752 = metamutator.Selector.of(752,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator752");

    private static final metamutator.Selector _returnReplacementOperator753 = metamutator.Selector.of(753,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator753");

    private static final metamutator.Selector _returnReplacementOperator754 = metamutator.Selector.of(754,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator754");

    private static final metamutator.Selector _returnReplacementOperator755 = metamutator.Selector.of(755,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator755");

    private static final metamutator.Selector _returnReplacementOperator756 = metamutator.Selector.of(756,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator756");

    private static final metamutator.Selector _returnReplacementOperator757 = metamutator.Selector.of(757,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator757");

    private static final metamutator.Selector _returnReplacementOperator758 = metamutator.Selector.of(758,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator758");

    private static final metamutator.Selector _returnReplacementOperator759 = metamutator.Selector.of(759,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator759");

    private static final metamutator.Selector _returnReplacementOperator760 = metamutator.Selector.of(760,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator760");

    private static final metamutator.Selector _returnReplacementOperator761 = metamutator.Selector.of(761,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator761");

    private static final metamutator.Selector _returnReplacementOperator762 = metamutator.Selector.of(762,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator762");

    private static final metamutator.Selector _returnReplacementOperator763 = metamutator.Selector.of(763,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator763");

    private static final metamutator.Selector _returnReplacementOperator764 = metamutator.Selector.of(764,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator764");

    private static final metamutator.Selector _returnReplacementOperator765 = metamutator.Selector.of(765,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator765");

    private static final metamutator.Selector _returnReplacementOperator766 = metamutator.Selector.of(766,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator766");

    private static final metamutator.Selector _returnReplacementOperator767 = metamutator.Selector.of(767,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator767");

    private static final metamutator.Selector _returnReplacementOperator768 = metamutator.Selector.of(768,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator768");

    private static final metamutator.Selector _returnReplacementOperator769 = metamutator.Selector.of(769,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator769");

    private static final metamutator.Selector _returnReplacementOperator770 = metamutator.Selector.of(770,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator770");

    private static final metamutator.Selector _returnReplacementOperator771 = metamutator.Selector.of(771,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperator771");
}

