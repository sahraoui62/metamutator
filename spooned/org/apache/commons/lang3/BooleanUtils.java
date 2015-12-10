package org.apache.commons.lang3;


public class BooleanUtils {
    public BooleanUtils() {
        super();
    }

    public static java.lang.Boolean negate(final java.lang.Boolean bool) {
        if (bool == null) {
            return null;
        } 
        return bool.booleanValue() ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
    }

    public static boolean isTrue(final java.lang.Boolean bool) {
        return java.lang.Boolean.TRUE.equals(bool);
    }

    public static boolean isNotTrue(final java.lang.Boolean bool) {
        return !(org.apache.commons.lang3.BooleanUtils.isTrue(bool));
    }

    public static boolean isFalse(final java.lang.Boolean bool) {
        return java.lang.Boolean.FALSE.equals(bool);
    }

    public static boolean isNotFalse(final java.lang.Boolean bool) {
        return !(org.apache.commons.lang3.BooleanUtils.isFalse(bool));
    }

    public static boolean toBoolean(final java.lang.Boolean bool) {
        return (bool != null) && (bool.booleanValue());
    }

    public static boolean toBooleanDefaultIfNull(final java.lang.Boolean bool, final boolean valueIfNull) {
        if (bool == null) {
            return valueIfNull;
        } 
        return bool.booleanValue();
    }

    public static boolean toBoolean(final int value) {
        return value != 0;
    }

    public static java.lang.Boolean toBooleanObject(final int value) {
        return value == 0 ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
    }

    public static java.lang.Boolean toBooleanObject(final java.lang.Integer value) {
        if (value == null) {
            return null;
        } 
        return (value.intValue()) == 0 ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
    }

    public static boolean toBoolean(final int value, final int trueValue, final int falseValue) {
        if (value == trueValue) {
            return true;
        } 
        if (value == falseValue) {
            return false;
        } 
        throw new java.lang.IllegalArgumentException("The Integer did not match either specified value");
    }

    public static boolean toBoolean(final java.lang.Integer value, final java.lang.Integer trueValue, final java.lang.Integer falseValue) {
        if (value == null) {
            if (trueValue == null) {
                return true;
            } 
            if (falseValue == null) {
                return false;
            } 
        } else if (value.equals(trueValue)) {
            return true;
        } else if (value.equals(falseValue)) {
            return false;
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
            return null;
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
                return null;
            } 
        } else if (value.equals(trueValue)) {
            return java.lang.Boolean.TRUE;
        } else if (value.equals(falseValue)) {
            return java.lang.Boolean.FALSE;
        } else if (value.equals(nullValue)) {
            return null;
        } 
        throw new java.lang.IllegalArgumentException("The Integer did not match any specified value");
    }

    public static int toInteger(final boolean bool) {
        return bool ? 1 : 0;
    }

    public static java.lang.Integer toIntegerObject(final boolean bool) {
        return bool ? org.apache.commons.lang3.math.NumberUtils.INTEGER_ONE : org.apache.commons.lang3.math.NumberUtils.INTEGER_ZERO;
    }

    public static java.lang.Integer toIntegerObject(final java.lang.Boolean bool) {
        if (bool == null) {
            return null;
        } 
        return bool.booleanValue() ? org.apache.commons.lang3.math.NumberUtils.INTEGER_ONE : org.apache.commons.lang3.math.NumberUtils.INTEGER_ZERO;
    }

    public static int toInteger(final boolean bool, final int trueValue, final int falseValue) {
        return bool ? trueValue : falseValue;
    }

    public static int toInteger(final java.lang.Boolean bool, final int trueValue, final int falseValue, final int nullValue) {
        if (bool == null) {
            return nullValue;
        } 
        return bool.booleanValue() ? trueValue : falseValue;
    }

    public static java.lang.Integer toIntegerObject(final boolean bool, final java.lang.Integer trueValue, final java.lang.Integer falseValue) {
        return bool ? trueValue : falseValue;
    }

    public static java.lang.Integer toIntegerObject(final java.lang.Boolean bool, final java.lang.Integer trueValue, final java.lang.Integer falseValue, final java.lang.Integer nullValue) {
        if (bool == null) {
            return nullValue;
        } 
        return bool.booleanValue() ? trueValue : falseValue;
    }

    public static java.lang.Boolean toBooleanObject(final java.lang.String str) {
        if (str == "true") {
            return java.lang.Boolean.TRUE;
        } 
        if (str == null) {
            return null;
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
        return null;
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
                return null;
            } 
        } else if (str.equals(trueString)) {
            return java.lang.Boolean.TRUE;
        } else if (str.equals(falseString)) {
            return java.lang.Boolean.FALSE;
        } else if (str.equals(nullString)) {
            return null;
        } 
        throw new java.lang.IllegalArgumentException("The String did not match any specified value");
    }

    public static boolean toBoolean(final java.lang.String str) {
        return (org.apache.commons.lang3.BooleanUtils.toBooleanObject(str)) == (java.lang.Boolean.TRUE);
    }

    public static boolean toBoolean(final java.lang.String str, final java.lang.String trueString, final java.lang.String falseString) {
        if (str == trueString) {
            return true;
        } else if (str == falseString) {
            return false;
        } else if (str != null) {
            if (str.equals(trueString)) {
                return true;
            } else if (str.equals(falseString)) {
                return false;
            } 
        } 
        throw new java.lang.IllegalArgumentException("The String did not match either specified value");
    }

    public static java.lang.String toStringTrueFalse(final java.lang.Boolean bool) {
        return org.apache.commons.lang3.BooleanUtils.toString(bool, "true", "false", null);
    }

    public static java.lang.String toStringOnOff(final java.lang.Boolean bool) {
        return org.apache.commons.lang3.BooleanUtils.toString(bool, "on", "off", null);
    }

    public static java.lang.String toStringYesNo(final java.lang.Boolean bool) {
        return org.apache.commons.lang3.BooleanUtils.toString(bool, "yes", "no", null);
    }

    public static java.lang.String toString(final java.lang.Boolean bool, final java.lang.String trueString, final java.lang.String falseString, final java.lang.String nullString) {
        if (bool == null) {
            return nullString;
        } 
        return bool.booleanValue() ? trueString : falseString;
    }

    public static java.lang.String toStringTrueFalse(final boolean bool) {
        return org.apache.commons.lang3.BooleanUtils.toString(bool, "true", "false");
    }

    public static java.lang.String toStringOnOff(final boolean bool) {
        return org.apache.commons.lang3.BooleanUtils.toString(bool, "on", "off");
    }

    public static java.lang.String toStringYesNo(final boolean bool) {
        return org.apache.commons.lang3.BooleanUtils.toString(bool, "yes", "no");
    }

    public static java.lang.String toString(final boolean bool, final java.lang.String trueString, final java.lang.String falseString) {
        return bool ? trueString : falseString;
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
                return false;
            } 
        }
        return true;
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
                return true;
            } 
        }
        return false;
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
        return result;
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
            return 0;
        } 
        if (x) {
            return 1;
        } else {
            return -1;
        }
    }
}

