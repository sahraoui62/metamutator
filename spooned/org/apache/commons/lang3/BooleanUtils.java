package org.apache.commons.lang3;


public class BooleanUtils {
    public BooleanUtils() {
        super();
    }

    public static java.lang.Boolean negate(final java.lang.Boolean bool) {
        if (bool == null) {
            return ((_returnReplacementOperatorHotSpot2431.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        return bool.booleanValue() ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
    }

    public static boolean isTrue(final java.lang.Boolean bool) {
        return ((_returnReplacementOperatorHotSpot2405.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Boolean.TRUE.equals(bool)));
    }

    public static boolean isNotTrue(final java.lang.Boolean bool) {
        return ((_returnReplacementOperatorHotSpot2404.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (!(org.apache.commons.lang3.BooleanUtils.isTrue(bool))));
    }

    public static boolean isFalse(final java.lang.Boolean bool) {
        return ((_returnReplacementOperatorHotSpot2402.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Boolean.FALSE.equals(bool)));
    }

    public static boolean isNotFalse(final java.lang.Boolean bool) {
        return ((_returnReplacementOperatorHotSpot2403.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (!(org.apache.commons.lang3.BooleanUtils.isFalse(bool))));
    }

    public static boolean toBoolean(final java.lang.Boolean bool) {
        return ((_returnReplacementOperatorHotSpot2411.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((bool != null) && (bool.booleanValue())));
    }

    public static boolean toBooleanDefaultIfNull(final java.lang.Boolean bool, final boolean valueIfNull) {
        if (bool == null) {
            return ((_returnReplacementOperatorHotSpot2421.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (valueIfNull));
        } 
        return ((_returnReplacementOperatorHotSpot2422.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (bool.booleanValue()));
    }

    public static boolean toBoolean(final int value) {
        return ((_returnReplacementOperatorHotSpot2408.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (value != 0));
    }

    public static java.lang.Boolean toBooleanObject(final int value) {
        return value == 0 ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
    }

    public static java.lang.Boolean toBooleanObject(final java.lang.Integer value) {
        if (value == null) {
            return ((_returnReplacementOperatorHotSpot2433.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        return (value.intValue()) == 0 ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
    }

    public static boolean toBoolean(final int value, final int trueValue, final int falseValue) {
        if (value == trueValue) {
            return ((_returnReplacementOperatorHotSpot2409.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        if (value == falseValue) {
            return ((_returnReplacementOperatorHotSpot2410.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        throw new java.lang.IllegalArgumentException("The Integer did not match either specified value");
    }

    public static boolean toBoolean(final java.lang.Integer value, final java.lang.Integer trueValue, final java.lang.Integer falseValue) {
        if (value == null) {
            if (trueValue == null) {
                return ((_returnReplacementOperatorHotSpot2412.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
            } 
            if (falseValue == null) {
                return ((_returnReplacementOperatorHotSpot2413.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
        } else if (value.equals(trueValue)) {
            return ((_returnReplacementOperatorHotSpot2414.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } else if (value.equals(falseValue)) {
            return ((_returnReplacementOperatorHotSpot2415.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        throw new java.lang.IllegalArgumentException("The Integer did not match either specified value");
    }

    public static java.lang.Boolean toBooleanObject(final int value, final int trueValue, final int falseValue, final int nullValue) {
        if (value == trueValue) {
            return java.lang.Boolean.TRUE;
        } 
        if (value == falseValue) {
            return java.lang.Boolean.FALSE;
        } 
        if (value == nullValue) {
            return ((_returnReplacementOperatorHotSpot2432.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        throw new java.lang.IllegalArgumentException("The Integer did not match any specified value");
    }

    public static java.lang.Boolean toBooleanObject(final java.lang.Integer value, final java.lang.Integer trueValue, final java.lang.Integer falseValue, final java.lang.Integer nullValue) {
        if (value == null) {
            if (trueValue == null) {
                return java.lang.Boolean.TRUE;
            } 
            if (falseValue == null) {
                return java.lang.Boolean.FALSE;
            } 
            if (nullValue == null) {
                return ((_returnReplacementOperatorHotSpot2434.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
            } 
        } else if (value.equals(trueValue)) {
            return java.lang.Boolean.TRUE;
        } else if (value.equals(falseValue)) {
            return java.lang.Boolean.FALSE;
        } else if (value.equals(nullValue)) {
            return ((_returnReplacementOperatorHotSpot2435.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        throw new java.lang.IllegalArgumentException("The Integer did not match any specified value");
    }

    public static int toInteger(final boolean bool) {
        return ((_returnReplacementOperatorHotSpot2427.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2427.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2427.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (bool ? 1 : 0));
    }

    public static java.lang.Integer toIntegerObject(final boolean bool) {
        return ((_returnReplacementOperatorHotSpot2440.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (bool ? org.apache.commons.lang3.math.NumberUtils.INTEGER_ONE : org.apache.commons.lang3.math.NumberUtils.INTEGER_ZERO));
    }

    public static java.lang.Integer toIntegerObject(final java.lang.Boolean bool) {
        if (bool == null) {
            return ((_returnReplacementOperatorHotSpot2442.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperatorHotSpot2443.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (bool.booleanValue() ? org.apache.commons.lang3.math.NumberUtils.INTEGER_ONE : org.apache.commons.lang3.math.NumberUtils.INTEGER_ZERO));
    }

    public static int toInteger(final boolean bool, final int trueValue, final int falseValue) {
        return ((_returnReplacementOperatorHotSpot2428.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2428.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2428.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (bool ? trueValue : falseValue));
    }

    public static int toInteger(final java.lang.Boolean bool, final int trueValue, final int falseValue, final int nullValue) {
        if (bool == null) {
            return ((_returnReplacementOperatorHotSpot2429.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2429.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2429.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (nullValue));
        } 
        return ((_returnReplacementOperatorHotSpot2430.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2430.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2430.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (bool.booleanValue() ? trueValue : falseValue));
    }

    public static java.lang.Integer toIntegerObject(final boolean bool, final java.lang.Integer trueValue, final java.lang.Integer falseValue) {
        return ((_returnReplacementOperatorHotSpot2441.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (bool ? trueValue : falseValue));
    }

    public static java.lang.Integer toIntegerObject(final java.lang.Boolean bool, final java.lang.Integer trueValue, final java.lang.Integer falseValue, final java.lang.Integer nullValue) {
        if (bool == null) {
            return ((_returnReplacementOperatorHotSpot2444.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (nullValue));
        } 
        return ((_returnReplacementOperatorHotSpot2445.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (bool.booleanValue() ? trueValue : falseValue));
    }

    public static java.lang.Boolean toBooleanObject(final java.lang.String str) {
        if (str == "true") {
            return java.lang.Boolean.TRUE;
        } 
        if (str == null) {
            return ((_returnReplacementOperatorHotSpot2436.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        switch (str.length()) {
            case 1 :
                {
                    final char ch0 = str.charAt(0);
                    if ((((ch0 == 'y') || (ch0 == 'Y')) || (ch0 == 't')) || (ch0 == 'T')) {
                        return java.lang.Boolean.TRUE;
                    } 
                    if ((((ch0 == 'n') || (ch0 == 'N')) || (ch0 == 'f')) || (ch0 == 'F')) {
                        return java.lang.Boolean.FALSE;
                    } 
                    break;
                }
            case 2 :
                {
                    final char ch0 = str.charAt(0);
                    final char ch1 = str.charAt(1);
                    if (((ch0 == 'o') || (ch0 == 'O')) && ((ch1 == 'n') || (ch1 == 'N'))) {
                        return java.lang.Boolean.TRUE;
                    } 
                    if (((ch0 == 'n') || (ch0 == 'N')) && ((ch1 == 'o') || (ch1 == 'O'))) {
                        return java.lang.Boolean.FALSE;
                    } 
                    break;
                }
            case 3 :
                {
                    final char ch0 = str.charAt(0);
                    final char ch1 = str.charAt(1);
                    final char ch2 = str.charAt(2);
                    if ((((ch0 == 'y') || (ch0 == 'Y')) && ((ch1 == 'e') || (ch1 == 'E'))) && ((ch2 == 's') || (ch2 == 'S'))) {
                        return java.lang.Boolean.TRUE;
                    } 
                    if ((((ch0 == 'o') || (ch0 == 'O')) && ((ch1 == 'f') || (ch1 == 'F'))) && ((ch2 == 'f') || (ch2 == 'F'))) {
                        return java.lang.Boolean.FALSE;
                    } 
                    break;
                }
            case 4 :
                {
                    final char ch0 = str.charAt(0);
                    final char ch1 = str.charAt(1);
                    final char ch2 = str.charAt(2);
                    final char ch3 = str.charAt(3);
                    if (((((ch0 == 't') || (ch0 == 'T')) && ((ch1 == 'r') || (ch1 == 'R'))) && ((ch2 == 'u') || (ch2 == 'U'))) && ((ch3 == 'e') || (ch3 == 'E'))) {
                        return java.lang.Boolean.TRUE;
                    } 
                    break;
                }
            case 5 :
                {
                    final char ch0 = str.charAt(0);
                    final char ch1 = str.charAt(1);
                    final char ch2 = str.charAt(2);
                    final char ch3 = str.charAt(3);
                    final char ch4 = str.charAt(4);
                    if ((((((ch0 == 'f') || (ch0 == 'F')) && ((ch1 == 'a') || (ch1 == 'A'))) && ((ch2 == 'l') || (ch2 == 'L'))) && ((ch3 == 's') || (ch3 == 'S'))) && ((ch4 == 'e') || (ch4 == 'E'))) {
                        return java.lang.Boolean.FALSE;
                    } 
                    break;
                }
            default :
                break;
        }
        return ((_returnReplacementOperatorHotSpot2437.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
    }

    public static java.lang.Boolean toBooleanObject(final java.lang.String str, final java.lang.String trueString, final java.lang.String falseString, final java.lang.String nullString) {
        if (str == null) {
            if (trueString == null) {
                return java.lang.Boolean.TRUE;
            } 
            if (falseString == null) {
                return java.lang.Boolean.FALSE;
            } 
            if (nullString == null) {
                return ((_returnReplacementOperatorHotSpot2438.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
            } 
        } else if (str.equals(trueString)) {
            return java.lang.Boolean.TRUE;
        } else if (str.equals(falseString)) {
            return java.lang.Boolean.FALSE;
        } else if (str.equals(nullString)) {
            return ((_returnReplacementOperatorHotSpot2439.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        throw new java.lang.IllegalArgumentException("The String did not match any specified value");
    }

    public static boolean toBoolean(final java.lang.String str) {
        return ((_returnReplacementOperatorHotSpot2416.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.BooleanUtils.toBooleanObject(str)) == (java.lang.Boolean.TRUE)));
    }

    public static boolean toBoolean(final java.lang.String str, final java.lang.String trueString, final java.lang.String falseString) {
        if (str == trueString) {
            return ((_returnReplacementOperatorHotSpot2417.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } else if (str == falseString) {
            return ((_returnReplacementOperatorHotSpot2418.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } else if (str != null) {
            if (str.equals(trueString)) {
                return ((_returnReplacementOperatorHotSpot2419.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
            } else if (str.equals(falseString)) {
                return ((_returnReplacementOperatorHotSpot2420.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
        } 
        throw new java.lang.IllegalArgumentException("The String did not match either specified value");
    }

    public static java.lang.String toStringTrueFalse(final java.lang.Boolean bool) {
        return ((_returnReplacementOperatorHotSpot2452.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.BooleanUtils.toString(bool, "true", "false", null)));
    }

    public static java.lang.String toStringOnOff(final java.lang.Boolean bool) {
        return ((_returnReplacementOperatorHotSpot2450.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.BooleanUtils.toString(bool, "on", "off", null)));
    }

    public static java.lang.String toStringYesNo(final java.lang.Boolean bool) {
        return ((_returnReplacementOperatorHotSpot2454.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.BooleanUtils.toString(bool, "yes", "no", null)));
    }

    public static java.lang.String toString(final java.lang.Boolean bool, final java.lang.String trueString, final java.lang.String falseString, final java.lang.String nullString) {
        if (bool == null) {
            return ((_returnReplacementOperatorHotSpot2447.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (nullString));
        } 
        return ((_returnReplacementOperatorHotSpot2448.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (bool.booleanValue() ? trueString : falseString));
    }

    public static java.lang.String toStringTrueFalse(final boolean bool) {
        return ((_returnReplacementOperatorHotSpot2451.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.BooleanUtils.toString(bool, "true", "false")));
    }

    public static java.lang.String toStringOnOff(final boolean bool) {
        return ((_returnReplacementOperatorHotSpot2449.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.BooleanUtils.toString(bool, "on", "off")));
    }

    public static java.lang.String toStringYesNo(final boolean bool) {
        return ((_returnReplacementOperatorHotSpot2453.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.BooleanUtils.toString(bool, "yes", "no")));
    }

    public static java.lang.String toString(final boolean bool, final java.lang.String trueString, final java.lang.String falseString) {
        return ((_returnReplacementOperatorHotSpot2446.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (bool ? trueString : falseString));
    }

    public static boolean and(final boolean... array) {
        if (array == null) {
            throw new java.lang.IllegalArgumentException("The Array must not be null");
        } 
        if ((array.length) == 0) {
            throw new java.lang.IllegalArgumentException("Array is empty");
        } 
        for (final boolean element : array) {
            if (!element) {
                return ((_returnReplacementOperatorHotSpot2400.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperatorHotSpot2401.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
    }

    public static java.lang.Boolean and(final java.lang.Boolean... array) {
        if (array == null) {
            throw new java.lang.IllegalArgumentException("The Array must not be null");
        } 
        if ((array.length) == 0) {
            throw new java.lang.IllegalArgumentException("Array is empty");
        } 
        try {
            final boolean[] primitive = org.apache.commons.lang3.ArrayUtils.toPrimitive(array);
            return org.apache.commons.lang3.BooleanUtils.and(primitive) ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        } catch (final java.lang.NullPointerException ex) {
            throw new java.lang.IllegalArgumentException("The array must not contain any null elements");
        }
    }

    public static boolean or(final boolean... array) {
        if (array == null) {
            throw new java.lang.IllegalArgumentException("The Array must not be null");
        } 
        if ((array.length) == 0) {
            throw new java.lang.IllegalArgumentException("Array is empty");
        } 
        for (final boolean element : array) {
            if (element) {
                return ((_returnReplacementOperatorHotSpot2406.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
            } 
        }
        return ((_returnReplacementOperatorHotSpot2407.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
    }

    public static java.lang.Boolean or(final java.lang.Boolean... array) {
        if (array == null) {
            throw new java.lang.IllegalArgumentException("The Array must not be null");
        } 
        if ((array.length) == 0) {
            throw new java.lang.IllegalArgumentException("Array is empty");
        } 
        try {
            final boolean[] primitive = org.apache.commons.lang3.ArrayUtils.toPrimitive(array);
            return org.apache.commons.lang3.BooleanUtils.or(primitive) ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        } catch (final java.lang.NullPointerException ex) {
            throw new java.lang.IllegalArgumentException("The array must not contain any null elements");
        }
    }

    public static boolean xor(final boolean... array) {
        if (array == null) {
            throw new java.lang.IllegalArgumentException("The Array must not be null");
        } 
        if ((array.length) == 0) {
            throw new java.lang.IllegalArgumentException("Array is empty");
        } 
        boolean result = false;
        for (final boolean element : array) {
            result ^= element;
        }
        return ((_returnReplacementOperatorHotSpot2423.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static java.lang.Boolean xor(final java.lang.Boolean... array) {
        if (array == null) {
            throw new java.lang.IllegalArgumentException("The Array must not be null");
        } 
        if ((array.length) == 0) {
            throw new java.lang.IllegalArgumentException("Array is empty");
        } 
        try {
            final boolean[] primitive = org.apache.commons.lang3.ArrayUtils.toPrimitive(array);
            return org.apache.commons.lang3.BooleanUtils.xor(primitive) ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        } catch (final java.lang.NullPointerException ex) {
            throw new java.lang.IllegalArgumentException("The array must not contain any null elements");
        }
    }

    public static int compare(boolean x, boolean y) {
        if (x == y) {
            return ((_returnReplacementOperatorHotSpot2424.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2424.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2424.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (0));
        } 
        if (x) {
            return ((_returnReplacementOperatorHotSpot2425.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2425.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2425.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (1));
        } else {
            return ((_returnReplacementOperatorHotSpot2426.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2426.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2426.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (-1));
        }
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2400 = metamutator.Selector.of(2400,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2400");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2401 = metamutator.Selector.of(2401,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2401");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2402 = metamutator.Selector.of(2402,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2402");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2403 = metamutator.Selector.of(2403,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2403");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2404 = metamutator.Selector.of(2404,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2404");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2405 = metamutator.Selector.of(2405,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2405");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2406 = metamutator.Selector.of(2406,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2406");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2407 = metamutator.Selector.of(2407,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2407");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2408 = metamutator.Selector.of(2408,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2408");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2409 = metamutator.Selector.of(2409,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2409");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2410 = metamutator.Selector.of(2410,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2410");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2411 = metamutator.Selector.of(2411,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2411");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2412 = metamutator.Selector.of(2412,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2412");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2413 = metamutator.Selector.of(2413,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2413");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2414 = metamutator.Selector.of(2414,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2414");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2415 = metamutator.Selector.of(2415,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2415");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2416 = metamutator.Selector.of(2416,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2416");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2417 = metamutator.Selector.of(2417,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2417");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2418 = metamutator.Selector.of(2418,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2418");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2419 = metamutator.Selector.of(2419,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2419");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2420 = metamutator.Selector.of(2420,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2420");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2421 = metamutator.Selector.of(2421,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2421");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2422 = metamutator.Selector.of(2422,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2422");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2423 = metamutator.Selector.of(2423,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2423");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2424 = metamutator.Selector.of(2424,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2424");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2425 = metamutator.Selector.of(2425,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2425");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2426 = metamutator.Selector.of(2426,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2426");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2427 = metamutator.Selector.of(2427,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2427");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2428 = metamutator.Selector.of(2428,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2428");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2429 = metamutator.Selector.of(2429,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2429");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2430 = metamutator.Selector.of(2430,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2430");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2431 = metamutator.Selector.of(2431,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2431");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2432 = metamutator.Selector.of(2432,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2432");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2433 = metamutator.Selector.of(2433,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2433");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2434 = metamutator.Selector.of(2434,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2434");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2435 = metamutator.Selector.of(2435,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2435");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2436 = metamutator.Selector.of(2436,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2436");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2437 = metamutator.Selector.of(2437,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2437");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2438 = metamutator.Selector.of(2438,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2438");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2439 = metamutator.Selector.of(2439,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2439");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2440 = metamutator.Selector.of(2440,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2440");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2441 = metamutator.Selector.of(2441,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2441");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2442 = metamutator.Selector.of(2442,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2442");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2443 = metamutator.Selector.of(2443,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2443");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2444 = metamutator.Selector.of(2444,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2444");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2445 = metamutator.Selector.of(2445,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2445");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2446 = metamutator.Selector.of(2446,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2446");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2447 = metamutator.Selector.of(2447,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2447");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2448 = metamutator.Selector.of(2448,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2448");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2449 = metamutator.Selector.of(2449,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2449");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2450 = metamutator.Selector.of(2450,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2450");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2451 = metamutator.Selector.of(2451,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2451");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2452 = metamutator.Selector.of(2452,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2452");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2453 = metamutator.Selector.of(2453,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2453");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2454 = metamutator.Selector.of(2454,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperatorHotSpot2454");
}

