package org.apache.commons.lang3;


public class BooleanUtils {
    public BooleanUtils() {
        super();
    }

    public static java.lang.Boolean negate(final java.lang.Boolean bool) {
        if (bool == null) {
            return ((_returnReplacementOperator2431.is("NULL")) ? ( null ) : (null));
        } 
        return bool.booleanValue() ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
    }

    public static boolean isTrue(final java.lang.Boolean bool) {
        return ((_returnReplacementOperator2405.is("NULL")) ? ( null ) : (java.lang.Boolean.TRUE.equals(bool)));
    }

    public static boolean isNotTrue(final java.lang.Boolean bool) {
        return ((_returnReplacementOperator2404.is("NULL")) ? ( null ) : (!(org.apache.commons.lang3.BooleanUtils.isTrue(bool))));
    }

    public static boolean isFalse(final java.lang.Boolean bool) {
        return ((_returnReplacementOperator2402.is("NULL")) ? ( null ) : (java.lang.Boolean.FALSE.equals(bool)));
    }

    public static boolean isNotFalse(final java.lang.Boolean bool) {
        return ((_returnReplacementOperator2403.is("NULL")) ? ( null ) : (!(org.apache.commons.lang3.BooleanUtils.isFalse(bool))));
    }

    public static boolean toBoolean(final java.lang.Boolean bool) {
        return ((_returnReplacementOperator2411.is("NULL")) ? ( null ) : ((bool != null) && (bool.booleanValue())));
    }

    public static boolean toBooleanDefaultIfNull(final java.lang.Boolean bool, final boolean valueIfNull) {
        if (bool == null) {
            return ((_returnReplacementOperator2421.is("NULL")) ? ( null ) : (valueIfNull));
        } 
        return ((_returnReplacementOperator2422.is("NULL")) ? ( null ) : (bool.booleanValue()));
    }

    public static boolean toBoolean(final int value) {
        return ((_returnReplacementOperator2408.is("NULL")) ? ( null ) : (value != 0));
    }

    public static java.lang.Boolean toBooleanObject(final int value) {
        return value == 0 ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
    }

    public static java.lang.Boolean toBooleanObject(final java.lang.Integer value) {
        if (value == null) {
            return ((_returnReplacementOperator2433.is("NULL")) ? ( null ) : (null));
        } 
        return (value.intValue()) == 0 ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
    }

    public static boolean toBoolean(final int value, final int trueValue, final int falseValue) {
        if (value == trueValue) {
            return ((_returnReplacementOperator2409.is("NULL")) ? ( null ) : (true));
        } 
        if (value == falseValue) {
            return ((_returnReplacementOperator2410.is("NULL")) ? ( null ) : (false));
        } 
        throw new java.lang.IllegalArgumentException("The Integer did not match either specified value");
    }

    public static boolean toBoolean(final java.lang.Integer value, final java.lang.Integer trueValue, final java.lang.Integer falseValue) {
        if (value == null) {
            if (trueValue == null) {
                return ((_returnReplacementOperator2412.is("NULL")) ? ( null ) : (true));
            } 
            if (falseValue == null) {
                return ((_returnReplacementOperator2413.is("NULL")) ? ( null ) : (false));
            } 
        } else if (value.equals(trueValue)) {
            return ((_returnReplacementOperator2414.is("NULL")) ? ( null ) : (true));
        } else if (value.equals(falseValue)) {
            return ((_returnReplacementOperator2415.is("NULL")) ? ( null ) : (false));
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
            return ((_returnReplacementOperator2432.is("NULL")) ? ( null ) : (null));
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
                return ((_returnReplacementOperator2434.is("NULL")) ? ( null ) : (null));
            } 
        } else if (value.equals(trueValue)) {
            return java.lang.Boolean.TRUE;
        } else if (value.equals(falseValue)) {
            return java.lang.Boolean.FALSE;
        } else if (value.equals(nullValue)) {
            return ((_returnReplacementOperator2435.is("NULL")) ? ( null ) : (null));
        } 
        throw new java.lang.IllegalArgumentException("The Integer did not match any specified value");
    }

    public static int toInteger(final boolean bool) {
        return ((_returnReplacementOperator2427.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2427.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2427.is("ZERO")) ? ( 0 ) : (bool ? 1 : 0));
    }

    public static java.lang.Integer toIntegerObject(final boolean bool) {
        return ((_returnReplacementOperator2440.is("NULL")) ? ( null ) : (bool ? org.apache.commons.lang3.math.NumberUtils.INTEGER_ONE : org.apache.commons.lang3.math.NumberUtils.INTEGER_ZERO));
    }

    public static java.lang.Integer toIntegerObject(final java.lang.Boolean bool) {
        if (bool == null) {
            return ((_returnReplacementOperator2442.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator2443.is("NULL")) ? ( null ) : (bool.booleanValue() ? org.apache.commons.lang3.math.NumberUtils.INTEGER_ONE : org.apache.commons.lang3.math.NumberUtils.INTEGER_ZERO));
    }

    public static int toInteger(final boolean bool, final int trueValue, final int falseValue) {
        return ((_returnReplacementOperator2428.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2428.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2428.is("ZERO")) ? ( 0 ) : (bool ? trueValue : falseValue));
    }

    public static int toInteger(final java.lang.Boolean bool, final int trueValue, final int falseValue, final int nullValue) {
        if (bool == null) {
            return ((_returnReplacementOperator2429.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2429.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2429.is("ZERO")) ? ( 0 ) : (nullValue));
        } 
        return ((_returnReplacementOperator2430.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2430.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2430.is("ZERO")) ? ( 0 ) : (bool.booleanValue() ? trueValue : falseValue));
    }

    public static java.lang.Integer toIntegerObject(final boolean bool, final java.lang.Integer trueValue, final java.lang.Integer falseValue) {
        return ((_returnReplacementOperator2441.is("NULL")) ? ( null ) : (bool ? trueValue : falseValue));
    }

    public static java.lang.Integer toIntegerObject(final java.lang.Boolean bool, final java.lang.Integer trueValue, final java.lang.Integer falseValue, final java.lang.Integer nullValue) {
        if (bool == null) {
            return ((_returnReplacementOperator2444.is("NULL")) ? ( null ) : (nullValue));
        } 
        return ((_returnReplacementOperator2445.is("NULL")) ? ( null ) : (bool.booleanValue() ? trueValue : falseValue));
    }

    public static java.lang.Boolean toBooleanObject(final java.lang.String str) {
        if (str == "true") {
            return java.lang.Boolean.TRUE;
        } 
        if (str == null) {
            return ((_returnReplacementOperator2436.is("NULL")) ? ( null ) : (null));
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
        return ((_returnReplacementOperator2437.is("NULL")) ? ( null ) : (null));
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
                return ((_returnReplacementOperator2438.is("NULL")) ? ( null ) : (null));
            } 
        } else if (str.equals(trueString)) {
            return java.lang.Boolean.TRUE;
        } else if (str.equals(falseString)) {
            return java.lang.Boolean.FALSE;
        } else if (str.equals(nullString)) {
            return ((_returnReplacementOperator2439.is("NULL")) ? ( null ) : (null));
        } 
        throw new java.lang.IllegalArgumentException("The String did not match any specified value");
    }

    public static boolean toBoolean(final java.lang.String str) {
        return ((_returnReplacementOperator2416.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.BooleanUtils.toBooleanObject(str)) == (java.lang.Boolean.TRUE)));
    }

    public static boolean toBoolean(final java.lang.String str, final java.lang.String trueString, final java.lang.String falseString) {
        if (str == trueString) {
            return ((_returnReplacementOperator2417.is("NULL")) ? ( null ) : (true));
        } else if (str == falseString) {
            return ((_returnReplacementOperator2418.is("NULL")) ? ( null ) : (false));
        } else if (str != null) {
            if (str.equals(trueString)) {
                return ((_returnReplacementOperator2419.is("NULL")) ? ( null ) : (true));
            } else if (str.equals(falseString)) {
                return ((_returnReplacementOperator2420.is("NULL")) ? ( null ) : (false));
            } 
        } 
        throw new java.lang.IllegalArgumentException("The String did not match either specified value");
    }

    public static java.lang.String toStringTrueFalse(final java.lang.Boolean bool) {
        return ((_returnReplacementOperator2452.is("NULL")) ? ( null ) : (org.apache.commons.lang3.BooleanUtils.toString(bool, "true", "false", null)));
    }

    public static java.lang.String toStringOnOff(final java.lang.Boolean bool) {
        return ((_returnReplacementOperator2450.is("NULL")) ? ( null ) : (org.apache.commons.lang3.BooleanUtils.toString(bool, "on", "off", null)));
    }

    public static java.lang.String toStringYesNo(final java.lang.Boolean bool) {
        return ((_returnReplacementOperator2454.is("NULL")) ? ( null ) : (org.apache.commons.lang3.BooleanUtils.toString(bool, "yes", "no", null)));
    }

    public static java.lang.String toString(final java.lang.Boolean bool, final java.lang.String trueString, final java.lang.String falseString, final java.lang.String nullString) {
        if (bool == null) {
            return ((_returnReplacementOperator2447.is("NULL")) ? ( null ) : (nullString));
        } 
        return ((_returnReplacementOperator2448.is("NULL")) ? ( null ) : (bool.booleanValue() ? trueString : falseString));
    }

    public static java.lang.String toStringTrueFalse(final boolean bool) {
        return ((_returnReplacementOperator2451.is("NULL")) ? ( null ) : (org.apache.commons.lang3.BooleanUtils.toString(bool, "true", "false")));
    }

    public static java.lang.String toStringOnOff(final boolean bool) {
        return ((_returnReplacementOperator2449.is("NULL")) ? ( null ) : (org.apache.commons.lang3.BooleanUtils.toString(bool, "on", "off")));
    }

    public static java.lang.String toStringYesNo(final boolean bool) {
        return ((_returnReplacementOperator2453.is("NULL")) ? ( null ) : (org.apache.commons.lang3.BooleanUtils.toString(bool, "yes", "no")));
    }

    public static java.lang.String toString(final boolean bool, final java.lang.String trueString, final java.lang.String falseString) {
        return ((_returnReplacementOperator2446.is("NULL")) ? ( null ) : (bool ? trueString : falseString));
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
                return ((_returnReplacementOperator2400.is("NULL")) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperator2401.is("NULL")) ? ( null ) : (true));
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
                return ((_returnReplacementOperator2406.is("NULL")) ? ( null ) : (true));
            } 
        }
        return ((_returnReplacementOperator2407.is("NULL")) ? ( null ) : (false));
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
        return ((_returnReplacementOperator2423.is("NULL")) ? ( null ) : (result));
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
            return ((_returnReplacementOperator2424.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2424.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2424.is("ZERO")) ? ( 0 ) : (0));
        } 
        if (x) {
            return ((_returnReplacementOperator2425.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2425.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2425.is("ZERO")) ? ( 0 ) : (1));
        } else {
            return ((_returnReplacementOperator2426.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2426.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2426.is("ZERO")) ? ( 0 ) : (-1));
        }
    }

    private static final metamutator.Selector _returnReplacementOperator2400 = metamutator.Selector.of(2400,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2400");

    private static final metamutator.Selector _returnReplacementOperator2401 = metamutator.Selector.of(2401,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2401");

    private static final metamutator.Selector _returnReplacementOperator2402 = metamutator.Selector.of(2402,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2402");

    private static final metamutator.Selector _returnReplacementOperator2403 = metamutator.Selector.of(2403,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2403");

    private static final metamutator.Selector _returnReplacementOperator2404 = metamutator.Selector.of(2404,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2404");

    private static final metamutator.Selector _returnReplacementOperator2405 = metamutator.Selector.of(2405,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2405");

    private static final metamutator.Selector _returnReplacementOperator2406 = metamutator.Selector.of(2406,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2406");

    private static final metamutator.Selector _returnReplacementOperator2407 = metamutator.Selector.of(2407,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2407");

    private static final metamutator.Selector _returnReplacementOperator2408 = metamutator.Selector.of(2408,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2408");

    private static final metamutator.Selector _returnReplacementOperator2409 = metamutator.Selector.of(2409,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2409");

    private static final metamutator.Selector _returnReplacementOperator2410 = metamutator.Selector.of(2410,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2410");

    private static final metamutator.Selector _returnReplacementOperator2411 = metamutator.Selector.of(2411,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2411");

    private static final metamutator.Selector _returnReplacementOperator2412 = metamutator.Selector.of(2412,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2412");

    private static final metamutator.Selector _returnReplacementOperator2413 = metamutator.Selector.of(2413,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2413");

    private static final metamutator.Selector _returnReplacementOperator2414 = metamutator.Selector.of(2414,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2414");

    private static final metamutator.Selector _returnReplacementOperator2415 = metamutator.Selector.of(2415,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2415");

    private static final metamutator.Selector _returnReplacementOperator2416 = metamutator.Selector.of(2416,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2416");

    private static final metamutator.Selector _returnReplacementOperator2417 = metamutator.Selector.of(2417,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2417");

    private static final metamutator.Selector _returnReplacementOperator2418 = metamutator.Selector.of(2418,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2418");

    private static final metamutator.Selector _returnReplacementOperator2419 = metamutator.Selector.of(2419,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2419");

    private static final metamutator.Selector _returnReplacementOperator2420 = metamutator.Selector.of(2420,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2420");

    private static final metamutator.Selector _returnReplacementOperator2421 = metamutator.Selector.of(2421,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2421");

    private static final metamutator.Selector _returnReplacementOperator2422 = metamutator.Selector.of(2422,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2422");

    private static final metamutator.Selector _returnReplacementOperator2423 = metamutator.Selector.of(2423,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2423");

    private static final metamutator.Selector _returnReplacementOperator2424 = metamutator.Selector.of(2424,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2424");

    private static final metamutator.Selector _returnReplacementOperator2425 = metamutator.Selector.of(2425,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2425");

    private static final metamutator.Selector _returnReplacementOperator2426 = metamutator.Selector.of(2426,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2426");

    private static final metamutator.Selector _returnReplacementOperator2427 = metamutator.Selector.of(2427,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2427");

    private static final metamutator.Selector _returnReplacementOperator2428 = metamutator.Selector.of(2428,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2428");

    private static final metamutator.Selector _returnReplacementOperator2429 = metamutator.Selector.of(2429,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2429");

    private static final metamutator.Selector _returnReplacementOperator2430 = metamutator.Selector.of(2430,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2430");

    private static final metamutator.Selector _returnReplacementOperator2431 = metamutator.Selector.of(2431,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2431");

    private static final metamutator.Selector _returnReplacementOperator2432 = metamutator.Selector.of(2432,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2432");

    private static final metamutator.Selector _returnReplacementOperator2433 = metamutator.Selector.of(2433,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2433");

    private static final metamutator.Selector _returnReplacementOperator2434 = metamutator.Selector.of(2434,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2434");

    private static final metamutator.Selector _returnReplacementOperator2435 = metamutator.Selector.of(2435,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2435");

    private static final metamutator.Selector _returnReplacementOperator2436 = metamutator.Selector.of(2436,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2436");

    private static final metamutator.Selector _returnReplacementOperator2437 = metamutator.Selector.of(2437,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2437");

    private static final metamutator.Selector _returnReplacementOperator2438 = metamutator.Selector.of(2438,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2438");

    private static final metamutator.Selector _returnReplacementOperator2439 = metamutator.Selector.of(2439,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2439");

    private static final metamutator.Selector _returnReplacementOperator2440 = metamutator.Selector.of(2440,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2440");

    private static final metamutator.Selector _returnReplacementOperator2441 = metamutator.Selector.of(2441,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2441");

    private static final metamutator.Selector _returnReplacementOperator2442 = metamutator.Selector.of(2442,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2442");

    private static final metamutator.Selector _returnReplacementOperator2443 = metamutator.Selector.of(2443,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2443");

    private static final metamutator.Selector _returnReplacementOperator2444 = metamutator.Selector.of(2444,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2444");

    private static final metamutator.Selector _returnReplacementOperator2445 = metamutator.Selector.of(2445,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2445");

    private static final metamutator.Selector _returnReplacementOperator2446 = metamutator.Selector.of(2446,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2446");

    private static final metamutator.Selector _returnReplacementOperator2447 = metamutator.Selector.of(2447,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2447");

    private static final metamutator.Selector _returnReplacementOperator2448 = metamutator.Selector.of(2448,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2448");

    private static final metamutator.Selector _returnReplacementOperator2449 = metamutator.Selector.of(2449,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2449");

    private static final metamutator.Selector _returnReplacementOperator2450 = metamutator.Selector.of(2450,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2450");

    private static final metamutator.Selector _returnReplacementOperator2451 = metamutator.Selector.of(2451,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2451");

    private static final metamutator.Selector _returnReplacementOperator2452 = metamutator.Selector.of(2452,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2452");

    private static final metamutator.Selector _returnReplacementOperator2453 = metamutator.Selector.of(2453,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2453");

    private static final metamutator.Selector _returnReplacementOperator2454 = metamutator.Selector.of(2454,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.BooleanUtils.class).id("_returnReplacementOperator2454");
}

