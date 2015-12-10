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
        return ((_returnReplacementOperatorHotSpot723.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot723.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot723.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.math.NumberUtils.toInt(str, 0)));
    }

    public static int toInt(final java.lang.String str, final int defaultValue) {
        if (str == null) {
            return ((_returnReplacementOperatorHotSpot724.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot724.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot724.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (defaultValue));
        } 
        try {
            return ((_returnReplacementOperatorHotSpot725.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot725.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot725.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (java.lang.Integer.parseInt(str)));
        } catch (final java.lang.NumberFormatException nfe) {
            return ((_returnReplacementOperatorHotSpot726.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot726.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot726.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (defaultValue));
        }
    }

    public static long toLong(final java.lang.String str) {
        return ((_returnReplacementOperatorHotSpot760.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.toLong(str, 0L)));
    }

    public static long toLong(final java.lang.String str, final long defaultValue) {
        if (str == null) {
            return ((_returnReplacementOperatorHotSpot761.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (defaultValue));
        } 
        try {
            return ((_returnReplacementOperatorHotSpot762.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Long.parseLong(str)));
        } catch (final java.lang.NumberFormatException nfe) {
            return ((_returnReplacementOperatorHotSpot763.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (defaultValue));
        }
    }

    public static float toFloat(final java.lang.String str) {
        return ((_returnReplacementOperatorHotSpot705.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.toFloat(str, 0.0F)));
    }

    public static float toFloat(final java.lang.String str, final float defaultValue) {
        if (str == null) {
            return ((_returnReplacementOperatorHotSpot706.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (defaultValue));
        } 
        try {
            return ((_returnReplacementOperatorHotSpot707.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Float.parseFloat(str)));
        } catch (final java.lang.NumberFormatException nfe) {
            return ((_returnReplacementOperatorHotSpot708.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (defaultValue));
        }
    }

    public static double toDouble(final java.lang.String str) {
        return ((_returnReplacementOperatorHotSpot695.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.toDouble(str, 0.0)));
    }

    public static double toDouble(final java.lang.String str, final double defaultValue) {
        if (str == null) {
            return ((_returnReplacementOperatorHotSpot696.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (defaultValue));
        } 
        try {
            return ((_returnReplacementOperatorHotSpot697.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Double.parseDouble(str)));
        } catch (final java.lang.NumberFormatException nfe) {
            return ((_returnReplacementOperatorHotSpot698.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (defaultValue));
        }
    }

    public static byte toByte(final java.lang.String str) {
        return ((_returnReplacementOperatorHotSpot685.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.toByte(str, ((byte)(0)))));
    }

    public static byte toByte(final java.lang.String str, final byte defaultValue) {
        if (str == null) {
            return ((_returnReplacementOperatorHotSpot686.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (defaultValue));
        } 
        try {
            return ((_returnReplacementOperatorHotSpot687.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Byte.parseByte(str)));
        } catch (final java.lang.NumberFormatException nfe) {
            return ((_returnReplacementOperatorHotSpot688.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (defaultValue));
        }
    }

    public static short toShort(final java.lang.String str) {
        return ((_returnReplacementOperatorHotSpot768.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.toShort(str, ((short)(0)))));
    }

    public static short toShort(final java.lang.String str, final short defaultValue) {
        if (str == null) {
            return ((_returnReplacementOperatorHotSpot769.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (defaultValue));
        } 
        try {
            return ((_returnReplacementOperatorHotSpot770.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Short.parseShort(str)));
        } catch (final java.lang.NumberFormatException nfe) {
            return ((_returnReplacementOperatorHotSpot771.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (defaultValue));
        }
    }

    public static java.lang.Number createNumber(final java.lang.String str) throws java.lang.NumberFormatException {
        if (str == null) {
            return ((_returnReplacementOperatorHotSpot735.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
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
                return ((_returnReplacementOperatorHotSpot736.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.createBigInteger(str)));
            } 
            if ((hexDigits > 8) || ((hexDigits == 8) && (firstSigDigit > '7'))) {
                return ((_returnReplacementOperatorHotSpot737.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.createLong(str)));
            } 
            return ((_returnReplacementOperatorHotSpot738.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.createInteger(str)));
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
                            return ((_returnReplacementOperatorHotSpot739.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.createLong(numeric)));
                        } catch (final java.lang.NumberFormatException nfe) {
                        }
                        return ((_returnReplacementOperatorHotSpot740.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.createBigInteger(numeric)));
                    } 
                    throw new java.lang.NumberFormatException((str + " is not a valid number."));
                case 'f' :
                case 'F' :
                    try {
                        final java.lang.Float f = org.apache.commons.lang3.math.NumberUtils.createFloat(numeric);
                        if (!((f.isInfinite()) || (((f.floatValue()) == 0.0F) && (!allZeros)))) {
                            return ((_returnReplacementOperatorHotSpot741.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (f));
                        } 
                    } catch (final java.lang.NumberFormatException nfe) {
                    }
                case 'd' :
                case 'D' :
                    try {
                        final java.lang.Double d = org.apache.commons.lang3.math.NumberUtils.createDouble(numeric);
                        if (!((d.isInfinite()) || (((d.floatValue()) == 0.0) && (!allZeros)))) {
                            return ((_returnReplacementOperatorHotSpot742.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (d));
                        } 
                    } catch (final java.lang.NumberFormatException nfe) {
                    }
                    try {
                        return ((_returnReplacementOperatorHotSpot743.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.createBigDecimal(numeric)));
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
                return ((_returnReplacementOperatorHotSpot744.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.createInteger(str)));
            } catch (final java.lang.NumberFormatException nfe) {
            }
            try {
                return ((_returnReplacementOperatorHotSpot745.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.createLong(str)));
            } catch (final java.lang.NumberFormatException nfe) {
            }
            return ((_returnReplacementOperatorHotSpot746.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.createBigInteger(str)));
        } 
        final boolean allZeros = (org.apache.commons.lang3.math.NumberUtils.isAllZeros(mant)) && (org.apache.commons.lang3.math.NumberUtils.isAllZeros(exp));
        try {
            if (numDecimals <= 7) {
                final java.lang.Float f = org.apache.commons.lang3.math.NumberUtils.createFloat(str);
                if (!((f.isInfinite()) || (((f.floatValue()) == 0.0F) && (!allZeros)))) {
                    return ((_returnReplacementOperatorHotSpot747.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (f));
                } 
            } 
        } catch (final java.lang.NumberFormatException nfe) {
        }
        try {
            if (numDecimals <= 16) {
                final java.lang.Double d = org.apache.commons.lang3.math.NumberUtils.createDouble(str);
                if (!((d.isInfinite()) || (((d.doubleValue()) == 0.0) && (!allZeros)))) {
                    return ((_returnReplacementOperatorHotSpot748.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (d));
                } 
            } 
        } catch (final java.lang.NumberFormatException nfe) {
        }
        return ((_returnReplacementOperatorHotSpot749.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.createBigDecimal(str)));
    }

    private static java.lang.String getMantissa(final java.lang.String str) {
        return ((_returnReplacementOperatorHotSpot750.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.getMantissa(str, str.length())));
    }

    private static java.lang.String getMantissa(final java.lang.String str, final int stopPos) {
        final char firstChar = str.charAt(0);
        final boolean hasSign = (firstChar == '-') || (firstChar == '+');
        return ((_returnReplacementOperatorHotSpot751.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (hasSign ? str.substring(1, stopPos) : str.substring(0, stopPos)));
    }

    private static boolean isAllZeros(final java.lang.String str) {
        if (str == null) {
            return ((_returnReplacementOperatorHotSpot655.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        for (int i = (str.length()) - 1 ; i >= 0 ; i--) {
            if ((str.charAt(i)) != '0') {
                return ((_returnReplacementOperatorHotSpot656.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperatorHotSpot657.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((str.length()) > 0));
    }

    public static java.lang.Float createFloat(final java.lang.String str) {
        if (str == null) {
            return ((_returnReplacementOperatorHotSpot729.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperatorHotSpot730.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Float.valueOf(str)));
    }

    public static java.lang.Double createDouble(final java.lang.String str) {
        if (str == null) {
            return ((_returnReplacementOperatorHotSpot727.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperatorHotSpot728.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Double.valueOf(str)));
    }

    public static java.lang.Integer createInteger(final java.lang.String str) {
        if (str == null) {
            return ((_returnReplacementOperatorHotSpot731.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperatorHotSpot732.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Integer.decode(str)));
    }

    public static java.lang.Long createLong(final java.lang.String str) {
        if (str == null) {
            return ((_returnReplacementOperatorHotSpot733.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperatorHotSpot734.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Long.decode(str)));
    }

    public static java.math.BigInteger createBigInteger(final java.lang.String str) {
        if (str == null) {
            return ((_returnReplacementOperatorHotSpot754.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
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
        return ((_returnReplacementOperatorHotSpot755.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (negate ? value.negate() : value));
    }

    public static java.math.BigDecimal createBigDecimal(final java.lang.String str) {
        if (str == null) {
            return ((_returnReplacementOperatorHotSpot752.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        if (org.apache.commons.lang3.StringUtils.isBlank(str)) {
            throw new java.lang.NumberFormatException("A blank string is not a valid number");
        } 
        if (str.trim().startsWith("--")) {
            throw new java.lang.NumberFormatException((str + " is not a valid number."));
        } 
        return ((_returnReplacementOperatorHotSpot753.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new java.math.BigDecimal(str)));
    }

    public static long min(final long... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        long min = array[0];
        for (int i = 1 ; i < (array.length) ; i++) {
            if ((array[i]) < min) {
                min = array[i];
            } 
        }
        return ((_returnReplacementOperatorHotSpot759.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (min));
    }

    public static int min(final int... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        int min = array[0];
        for (int j = 1 ; j < (array.length) ; j++) {
            if ((array[j]) < min) {
                min = array[j];
            } 
        }
        return ((_returnReplacementOperatorHotSpot722.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot722.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot722.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (min));
    }

    public static short min(final short... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        short min = array[0];
        for (int i = 1 ; i < (array.length) ; i++) {
            if ((array[i]) < min) {
                min = array[i];
            } 
        }
        return ((_returnReplacementOperatorHotSpot767.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (min));
    }

    public static byte min(final byte... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        byte min = array[0];
        for (int i = 1 ; i < (array.length) ; i++) {
            if ((array[i]) < min) {
                min = array[i];
            } 
        }
        return ((_returnReplacementOperatorHotSpot684.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (min));
    }

    public static double min(final double... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        double min = array[0];
        for (int i = 1 ; i < (array.length) ; i++) {
            if (java.lang.Double.isNaN(array[i])) {
                return ((_returnReplacementOperatorHotSpot693.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Double.NaN));
            } 
            if ((array[i]) < min) {
                min = array[i];
            } 
        }
        return ((_returnReplacementOperatorHotSpot694.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (min));
    }

    public static float min(final float... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        float min = array[0];
        for (int i = 1 ; i < (array.length) ; i++) {
            if (java.lang.Float.isNaN(array[i])) {
                return ((_returnReplacementOperatorHotSpot703.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Float.NaN));
            } 
            if ((array[i]) < min) {
                min = array[i];
            } 
        }
        return ((_returnReplacementOperatorHotSpot704.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (min));
    }

    public static long max(final long... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        long max = array[0];
        for (int j = 1 ; j < (array.length) ; j++) {
            if ((array[j]) > max) {
                max = array[j];
            } 
        }
        return ((_returnReplacementOperatorHotSpot757.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (max));
    }

    public static int max(final int... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        int max = array[0];
        for (int j = 1 ; j < (array.length) ; j++) {
            if ((array[j]) > max) {
                max = array[j];
            } 
        }
        return ((_returnReplacementOperatorHotSpot720.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot720.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot720.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (max));
    }

    public static short max(final short... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        short max = array[0];
        for (int i = 1 ; i < (array.length) ; i++) {
            if ((array[i]) > max) {
                max = array[i];
            } 
        }
        return ((_returnReplacementOperatorHotSpot765.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (max));
    }

    public static byte max(final byte... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        byte max = array[0];
        for (int i = 1 ; i < (array.length) ; i++) {
            if ((array[i]) > max) {
                max = array[i];
            } 
        }
        return ((_returnReplacementOperatorHotSpot682.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (max));
    }

    public static double max(final double... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        double max = array[0];
        for (int j = 1 ; j < (array.length) ; j++) {
            if (java.lang.Double.isNaN(array[j])) {
                return ((_returnReplacementOperatorHotSpot690.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Double.NaN));
            } 
            if ((array[j]) > max) {
                max = array[j];
            } 
        }
        return ((_returnReplacementOperatorHotSpot691.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (max));
    }

    public static float max(final float... array) {
        org.apache.commons.lang3.math.NumberUtils.validateArray(array);
        float max = array[0];
        for (int j = 1 ; j < (array.length) ; j++) {
            if (java.lang.Float.isNaN(array[j])) {
                return ((_returnReplacementOperatorHotSpot700.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Float.NaN));
            } 
            if ((array[j]) > max) {
                max = array[j];
            } 
        }
        return ((_returnReplacementOperatorHotSpot701.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (max));
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
        return ((_returnReplacementOperatorHotSpot758.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (a));
    }

    public static int min(int a, final int b, final int c) {
        if (b < a) {
            a = b;
        } 
        if (c < a) {
            a = c;
        } 
        return ((_returnReplacementOperatorHotSpot721.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot721.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot721.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (a));
    }

    public static short min(short a, final short b, final short c) {
        if (b < a) {
            a = b;
        } 
        if (c < a) {
            a = c;
        } 
        return ((_returnReplacementOperatorHotSpot766.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (a));
    }

    public static byte min(byte a, final byte b, final byte c) {
        if (b < a) {
            a = b;
        } 
        if (c < a) {
            a = c;
        } 
        return ((_returnReplacementOperatorHotSpot683.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (a));
    }

    public static double min(final double a, final double b, final double c) {
        return ((_returnReplacementOperatorHotSpot692.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Math.min(java.lang.Math.min(a, b), c)));
    }

    public static float min(final float a, final float b, final float c) {
        return ((_returnReplacementOperatorHotSpot702.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Math.min(java.lang.Math.min(a, b), c)));
    }

    public static long max(long a, final long b, final long c) {
        if (b > a) {
            a = b;
        } 
        if (c > a) {
            a = c;
        } 
        return ((_returnReplacementOperatorHotSpot756.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (a));
    }

    public static int max(int a, final int b, final int c) {
        if (b > a) {
            a = b;
        } 
        if (c > a) {
            a = c;
        } 
        return ((_returnReplacementOperatorHotSpot719.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot719.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot719.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (a));
    }

    public static short max(short a, final short b, final short c) {
        if (b > a) {
            a = b;
        } 
        if (c > a) {
            a = c;
        } 
        return ((_returnReplacementOperatorHotSpot764.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (a));
    }

    public static byte max(byte a, final byte b, final byte c) {
        if (b > a) {
            a = b;
        } 
        if (c > a) {
            a = c;
        } 
        return ((_returnReplacementOperatorHotSpot681.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (a));
    }

    public static double max(final double a, final double b, final double c) {
        return ((_returnReplacementOperatorHotSpot689.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Math.max(java.lang.Math.max(a, b), c)));
    }

    public static float max(final float a, final float b, final float c) {
        return ((_returnReplacementOperatorHotSpot699.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Math.max(java.lang.Math.max(a, b), c)));
    }

    public static boolean isDigits(final java.lang.String str) {
        return ((_returnReplacementOperatorHotSpot658.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.StringUtils.isNumeric(str)));
    }

    public static boolean isNumber(final java.lang.String str) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
            return ((_returnReplacementOperatorHotSpot659.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
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
                    return ((_returnReplacementOperatorHotSpot660.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
                } 
                for ( ; i < (chars.length) ; i++) {
                    if (((((chars[i]) < '0') || ((chars[i]) > '9')) && (((chars[i]) < 'a') || ((chars[i]) > 'f'))) && (((chars[i]) < 'A') || ((chars[i]) > 'F'))) {
                        return ((_returnReplacementOperatorHotSpot661.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
                    } 
                }
                return ((_returnReplacementOperatorHotSpot662.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
            } else if (java.lang.Character.isDigit(chars[(start + 1)])) {
                int i = start + 1;
                for ( ; i < (chars.length) ; i++) {
                    if (((chars[i]) < '0') || ((chars[i]) > '7')) {
                        return ((_returnReplacementOperatorHotSpot663.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
                    } 
                }
                return ((_returnReplacementOperatorHotSpot664.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
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
                    return ((_returnReplacementOperatorHotSpot665.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
                } 
                hasDecPoint = true;
            } else if (((chars[i]) == 'e') || ((chars[i]) == 'E')) {
                if (hasExp) {
                    return ((_returnReplacementOperatorHotSpot666.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
                } 
                if (!foundDigit) {
                    return ((_returnReplacementOperatorHotSpot667.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
                } 
                hasExp = true;
                allowSigns = true;
            } else if (((chars[i]) == '+') || ((chars[i]) == '-')) {
                if (!allowSigns) {
                    return ((_returnReplacementOperatorHotSpot668.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
                } 
                allowSigns = false;
                foundDigit = false;
            } else {
                return ((_returnReplacementOperatorHotSpot669.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            }
            i++;
        }
        if (i < (chars.length)) {
            if (((chars[i]) >= '0') && ((chars[i]) <= '9')) {
                return ((_returnReplacementOperatorHotSpot670.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
            } 
            if (((chars[i]) == 'e') || ((chars[i]) == 'E')) {
                return ((_returnReplacementOperatorHotSpot671.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
            if ((chars[i]) == '.') {
                if (hasDecPoint || hasExp) {
                    return ((_returnReplacementOperatorHotSpot672.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
                } 
                return ((_returnReplacementOperatorHotSpot673.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (foundDigit));
            } 
            if ((!allowSigns) && (((((chars[i]) == 'd') || ((chars[i]) == 'D')) || ((chars[i]) == 'f')) || ((chars[i]) == 'F'))) {
                return ((_returnReplacementOperatorHotSpot674.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (foundDigit));
            } 
            if (((chars[i]) == 'l') || ((chars[i]) == 'L')) {
                return ((_returnReplacementOperatorHotSpot675.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((foundDigit && (!hasExp)) && (!hasDecPoint)));
            } 
            return ((_returnReplacementOperatorHotSpot676.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperatorHotSpot677.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((!allowSigns) && foundDigit));
    }

    public static boolean isParsable(final java.lang.String str) {
        if (org.apache.commons.lang3.StringUtils.endsWith(str, ".")) {
            return ((_returnReplacementOperatorHotSpot678.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        if (org.apache.commons.lang3.StringUtils.startsWith(str, "-")) {
            return ((_returnReplacementOperatorHotSpot679.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.isDigits(org.apache.commons.lang3.StringUtils.replaceOnce(str.substring(1), ".", org.apache.commons.lang3.StringUtils.EMPTY))));
        } else {
            return ((_returnReplacementOperatorHotSpot680.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.math.NumberUtils.isDigits(org.apache.commons.lang3.StringUtils.replaceOnce(str, ".", org.apache.commons.lang3.StringUtils.EMPTY))));
        }
    }

    public static int compare(int x, int y) {
        if (x == y) {
            return ((_returnReplacementOperatorHotSpot710.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot710.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot710.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (0));
        } 
        if (x < y) {
            return ((_returnReplacementOperatorHotSpot711.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot711.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot711.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (-1));
        } else {
            return ((_returnReplacementOperatorHotSpot712.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot712.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot712.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (1));
        }
    }

    public static int compare(long x, long y) {
        if (x == y) {
            return ((_returnReplacementOperatorHotSpot713.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot713.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot713.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (0));
        } 
        if (x < y) {
            return ((_returnReplacementOperatorHotSpot714.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot714.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot714.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (-1));
        } else {
            return ((_returnReplacementOperatorHotSpot715.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot715.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot715.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (1));
        }
    }

    public static int compare(short x, short y) {
        if (x == y) {
            return ((_returnReplacementOperatorHotSpot716.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot716.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot716.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (0));
        } 
        if (x < y) {
            return ((_returnReplacementOperatorHotSpot717.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot717.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot717.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (-1));
        } else {
            return ((_returnReplacementOperatorHotSpot718.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot718.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot718.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (1));
        }
    }

    public static int compare(byte x, byte y) {
        return ((_returnReplacementOperatorHotSpot709.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot709.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot709.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (x - y));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot655 = metamutator.Selector.of(655,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot655");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot656 = metamutator.Selector.of(656,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot656");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot657 = metamutator.Selector.of(657,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot657");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot658 = metamutator.Selector.of(658,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot658");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot659 = metamutator.Selector.of(659,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot659");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot660 = metamutator.Selector.of(660,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot660");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot661 = metamutator.Selector.of(661,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot661");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot662 = metamutator.Selector.of(662,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot662");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot663 = metamutator.Selector.of(663,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot663");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot664 = metamutator.Selector.of(664,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot664");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot665 = metamutator.Selector.of(665,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot665");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot666 = metamutator.Selector.of(666,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot666");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot667 = metamutator.Selector.of(667,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot667");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot668 = metamutator.Selector.of(668,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot668");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot669 = metamutator.Selector.of(669,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot669");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot670 = metamutator.Selector.of(670,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot670");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot671 = metamutator.Selector.of(671,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot671");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot672 = metamutator.Selector.of(672,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot672");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot673 = metamutator.Selector.of(673,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot673");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot674 = metamutator.Selector.of(674,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot674");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot675 = metamutator.Selector.of(675,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot675");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot676 = metamutator.Selector.of(676,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot676");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot677 = metamutator.Selector.of(677,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot677");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot678 = metamutator.Selector.of(678,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot678");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot679 = metamutator.Selector.of(679,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot679");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot680 = metamutator.Selector.of(680,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot680");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot681 = metamutator.Selector.of(681,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot681");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot682 = metamutator.Selector.of(682,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot682");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot683 = metamutator.Selector.of(683,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot683");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot684 = metamutator.Selector.of(684,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot684");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot685 = metamutator.Selector.of(685,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot685");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot686 = metamutator.Selector.of(686,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot686");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot687 = metamutator.Selector.of(687,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot687");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot688 = metamutator.Selector.of(688,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot688");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot689 = metamutator.Selector.of(689,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot689");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot690 = metamutator.Selector.of(690,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot690");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot691 = metamutator.Selector.of(691,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot691");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot692 = metamutator.Selector.of(692,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot692");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot693 = metamutator.Selector.of(693,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot693");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot694 = metamutator.Selector.of(694,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot694");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot695 = metamutator.Selector.of(695,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot695");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot696 = metamutator.Selector.of(696,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot696");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot697 = metamutator.Selector.of(697,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot697");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot698 = metamutator.Selector.of(698,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot698");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot699 = metamutator.Selector.of(699,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot699");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot700 = metamutator.Selector.of(700,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot700");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot701 = metamutator.Selector.of(701,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot701");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot702 = metamutator.Selector.of(702,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot702");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot703 = metamutator.Selector.of(703,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot703");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot704 = metamutator.Selector.of(704,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot704");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot705 = metamutator.Selector.of(705,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot705");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot706 = metamutator.Selector.of(706,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot706");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot707 = metamutator.Selector.of(707,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot707");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot708 = metamutator.Selector.of(708,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot708");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot709 = metamutator.Selector.of(709,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot709");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot710 = metamutator.Selector.of(710,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot710");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot711 = metamutator.Selector.of(711,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot711");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot712 = metamutator.Selector.of(712,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot712");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot713 = metamutator.Selector.of(713,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot713");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot714 = metamutator.Selector.of(714,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot714");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot715 = metamutator.Selector.of(715,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot715");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot716 = metamutator.Selector.of(716,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot716");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot717 = metamutator.Selector.of(717,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot717");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot718 = metamutator.Selector.of(718,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot718");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot719 = metamutator.Selector.of(719,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot719");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot720 = metamutator.Selector.of(720,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot720");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot721 = metamutator.Selector.of(721,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot721");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot722 = metamutator.Selector.of(722,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot722");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot723 = metamutator.Selector.of(723,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot723");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot724 = metamutator.Selector.of(724,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot724");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot725 = metamutator.Selector.of(725,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot725");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot726 = metamutator.Selector.of(726,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot726");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot727 = metamutator.Selector.of(727,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot727");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot728 = metamutator.Selector.of(728,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot728");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot729 = metamutator.Selector.of(729,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot729");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot730 = metamutator.Selector.of(730,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot730");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot731 = metamutator.Selector.of(731,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot731");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot732 = metamutator.Selector.of(732,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot732");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot733 = metamutator.Selector.of(733,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot733");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot734 = metamutator.Selector.of(734,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot734");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot735 = metamutator.Selector.of(735,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot735");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot736 = metamutator.Selector.of(736,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot736");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot737 = metamutator.Selector.of(737,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot737");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot738 = metamutator.Selector.of(738,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot738");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot739 = metamutator.Selector.of(739,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot739");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot740 = metamutator.Selector.of(740,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot740");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot741 = metamutator.Selector.of(741,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot741");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot742 = metamutator.Selector.of(742,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot742");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot743 = metamutator.Selector.of(743,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot743");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot744 = metamutator.Selector.of(744,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot744");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot745 = metamutator.Selector.of(745,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot745");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot746 = metamutator.Selector.of(746,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot746");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot747 = metamutator.Selector.of(747,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot747");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot748 = metamutator.Selector.of(748,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot748");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot749 = metamutator.Selector.of(749,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot749");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot750 = metamutator.Selector.of(750,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot750");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot751 = metamutator.Selector.of(751,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot751");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot752 = metamutator.Selector.of(752,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot752");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot753 = metamutator.Selector.of(753,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot753");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot754 = metamutator.Selector.of(754,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot754");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot755 = metamutator.Selector.of(755,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot755");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot756 = metamutator.Selector.of(756,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot756");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot757 = metamutator.Selector.of(757,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot757");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot758 = metamutator.Selector.of(758,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot758");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot759 = metamutator.Selector.of(759,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot759");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot760 = metamutator.Selector.of(760,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot760");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot761 = metamutator.Selector.of(761,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot761");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot762 = metamutator.Selector.of(762,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot762");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot763 = metamutator.Selector.of(763,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot763");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot764 = metamutator.Selector.of(764,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot764");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot765 = metamutator.Selector.of(765,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot765");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot766 = metamutator.Selector.of(766,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot766");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot767 = metamutator.Selector.of(767,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot767");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot768 = metamutator.Selector.of(768,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot768");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot769 = metamutator.Selector.of(769,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot769");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot770 = metamutator.Selector.of(770,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot770");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot771 = metamutator.Selector.of(771,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.NumberUtils.class).id("_returnReplacementOperatorHotSpot771");
}

