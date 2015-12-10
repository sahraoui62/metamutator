package org.apache.commons.lang3;


public class ArrayUtils {
    public static final java.lang.Object[] EMPTY_OBJECT_ARRAY = new java.lang.Object[0];

    public static final java.lang.Class<?>[] EMPTY_CLASS_ARRAY = new java.lang.Class[0];

    public static final java.lang.String[] EMPTY_STRING_ARRAY = new java.lang.String[0];

    public static final long[] EMPTY_LONG_ARRAY = new long[0];

    public static final java.lang.Long[] EMPTY_LONG_OBJECT_ARRAY = new java.lang.Long[0];

    public static final int[] EMPTY_INT_ARRAY = new int[0];

    public static final java.lang.Integer[] EMPTY_INTEGER_OBJECT_ARRAY = new java.lang.Integer[0];

    public static final short[] EMPTY_SHORT_ARRAY = new short[0];

    public static final java.lang.Short[] EMPTY_SHORT_OBJECT_ARRAY = new java.lang.Short[0];

    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];

    public static final java.lang.Byte[] EMPTY_BYTE_OBJECT_ARRAY = new java.lang.Byte[0];

    public static final double[] EMPTY_DOUBLE_ARRAY = new double[0];

    public static final java.lang.Double[] EMPTY_DOUBLE_OBJECT_ARRAY = new java.lang.Double[0];

    public static final float[] EMPTY_FLOAT_ARRAY = new float[0];

    public static final java.lang.Float[] EMPTY_FLOAT_OBJECT_ARRAY = new java.lang.Float[0];

    public static final boolean[] EMPTY_BOOLEAN_ARRAY = new boolean[0];

    public static final java.lang.Boolean[] EMPTY_BOOLEAN_OBJECT_ARRAY = new java.lang.Boolean[0];

    public static final char[] EMPTY_CHAR_ARRAY = new char[0];

    public static final java.lang.Character[] EMPTY_CHARACTER_OBJECT_ARRAY = new java.lang.Character[0];

    public static final int INDEX_NOT_FOUND = -1;

    public ArrayUtils() {
        super();
    }

    public static java.lang.String toString(final java.lang.Object array) {
        return ((_returnReplacementOperatorHotSpot2324.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toString(array, "{}")));
    }

    public static java.lang.String toString(final java.lang.Object array, final java.lang.String stringIfNull) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2325.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (stringIfNull));
        } 
        return ((_returnReplacementOperatorHotSpot2326.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.builder.ToStringBuilder(array , org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE).append(array).toString()));
    }

    public static int hashCode(final java.lang.Object array) {
        return ((_returnReplacementOperatorHotSpot2154.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2154.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2154.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (new org.apache.commons.lang3.builder.HashCodeBuilder().append(array).toHashCode()));
    }

    @java.lang.Deprecated
    public static boolean isEquals(final java.lang.Object array1, final java.lang.Object array2) {
        return ((_returnReplacementOperatorHotSpot1979.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.builder.EqualsBuilder().append(array1, array2).isEquals()));
    }

    public static java.util.Map<java.lang.Object, java.lang.Object> toMap(final java.lang.Object[] array) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2329.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        final java.util.Map<java.lang.Object, java.lang.Object> map = new java.util.HashMap<java.lang.Object, java.lang.Object>(((int)((array.length) * 1.5)));
        for (int i = 0 ; i < (array.length) ; i++) {
            final java.lang.Object object = array[i];
            if (object instanceof java.util.Map.Entry<?, ?>) {
                final java.util.Map.Entry<?, ?> entry = ((java.util.Map.Entry<?, ?>)(object));
                map.put(entry.getKey(), entry.getValue());
            } else if (object instanceof java.lang.Object[]) {
                final java.lang.Object[] entry = ((java.lang.Object[])(object));
                if ((entry.length) < 2) {
                    throw new java.lang.IllegalArgumentException((((("Array element " + i) + ", '") + object) + "', has a length less than 2"));
                } 
                map.put(entry[0], entry[1]);
            } else {
                throw new java.lang.IllegalArgumentException((((("Array element " + i) + ", '") + object) + "', is neither of type Map.Entry nor an Array"));
            }
        }
        return ((_returnReplacementOperatorHotSpot2330.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (map));
    }

    public static <T>T[] toArray(final T... items) {
        return ((_returnReplacementOperatorHotSpot1955.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (items));
    }

    public static <T>T[] clone(final T[] array) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot1940.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperatorHotSpot1941.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array.clone()));
    }

    public static long[] clone(final long[] array) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2336.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperatorHotSpot2337.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array.clone()));
    }

    public static int[] clone(final int[] array) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2252.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperatorHotSpot2253.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array.clone()));
    }

    public static short[] clone(final short[] array) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2362.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperatorHotSpot2363.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array.clone()));
    }

    public static char[] clone(final char[] array) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2079.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperatorHotSpot2080.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array.clone()));
    }

    public static byte[] clone(final byte[] array) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2053.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperatorHotSpot2054.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array.clone()));
    }

    public static double[] clone(final double[] array) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2105.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperatorHotSpot2106.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array.clone()));
    }

    public static float[] clone(final float[] array) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2131.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperatorHotSpot2132.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array.clone()));
    }

    public static boolean[] clone(final boolean[] array) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2027.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperatorHotSpot2028.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array.clone()));
    }

    public static <T>T[] nullToEmpty(final T[] array, final java.lang.Class<T[]> type) {
        if (type == null) {
            throw new java.lang.IllegalArgumentException("The type must not be null");
        } 
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot1942.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (type.cast(java.lang.reflect.Array.newInstance(type.getComponentType(), 0))));
        } 
        return ((_returnReplacementOperatorHotSpot1943.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array));
    }

    public static java.lang.Object[] nullToEmpty(final java.lang.Object[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperatorHotSpot2317.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY));
        } 
        return ((_returnReplacementOperatorHotSpot2318.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array));
    }

    public static java.lang.Class<?>[] nullToEmpty(final java.lang.Class<?>[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperatorHotSpot2288.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY));
        } 
        return ((_returnReplacementOperatorHotSpot2289.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array));
    }

    public static java.lang.String[] nullToEmpty(final java.lang.String[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperatorHotSpot2327.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY));
        } 
        return ((_returnReplacementOperatorHotSpot2328.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array));
    }

    public static long[] nullToEmpty(final long[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperatorHotSpot2338.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY));
        } 
        return ((_returnReplacementOperatorHotSpot2339.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array));
    }

    public static int[] nullToEmpty(final int[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperatorHotSpot2254.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY));
        } 
        return ((_returnReplacementOperatorHotSpot2255.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array));
    }

    public static short[] nullToEmpty(final short[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperatorHotSpot2364.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY));
        } 
        return ((_returnReplacementOperatorHotSpot2365.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array));
    }

    public static char[] nullToEmpty(final char[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperatorHotSpot2081.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY));
        } 
        return ((_returnReplacementOperatorHotSpot2082.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array));
    }

    public static byte[] nullToEmpty(final byte[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperatorHotSpot2055.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY));
        } 
        return ((_returnReplacementOperatorHotSpot2056.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array));
    }

    public static double[] nullToEmpty(final double[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperatorHotSpot2107.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY));
        } 
        return ((_returnReplacementOperatorHotSpot2108.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array));
    }

    public static float[] nullToEmpty(final float[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperatorHotSpot2133.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY));
        } 
        return ((_returnReplacementOperatorHotSpot2134.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array));
    }

    public static boolean[] nullToEmpty(final boolean[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperatorHotSpot2029.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_ARRAY));
        } 
        return ((_returnReplacementOperatorHotSpot2030.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array));
    }

    public static java.lang.Long[] nullToEmpty(final java.lang.Long[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperatorHotSpot2305.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY));
        } 
        return ((_returnReplacementOperatorHotSpot2306.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array));
    }

    public static java.lang.Integer[] nullToEmpty(final java.lang.Integer[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperatorHotSpot2300.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY));
        } 
        return ((_returnReplacementOperatorHotSpot2301.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array));
    }

    public static java.lang.Short[] nullToEmpty(final java.lang.Short[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperatorHotSpot2319.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY));
        } 
        return ((_returnReplacementOperatorHotSpot2320.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array));
    }

    public static java.lang.Character[] nullToEmpty(final java.lang.Character[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperatorHotSpot2283.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY));
        } 
        return ((_returnReplacementOperatorHotSpot2284.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array));
    }

    public static java.lang.Byte[] nullToEmpty(final java.lang.Byte[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperatorHotSpot2278.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY));
        } 
        return ((_returnReplacementOperatorHotSpot2279.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array));
    }

    public static java.lang.Double[] nullToEmpty(final java.lang.Double[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperatorHotSpot2290.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY));
        } 
        return ((_returnReplacementOperatorHotSpot2291.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array));
    }

    public static java.lang.Float[] nullToEmpty(final java.lang.Float[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperatorHotSpot2295.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY));
        } 
        return ((_returnReplacementOperatorHotSpot2296.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array));
    }

    public static java.lang.Boolean[] nullToEmpty(final java.lang.Boolean[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperatorHotSpot2273.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY));
        } 
        return ((_returnReplacementOperatorHotSpot2274.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array));
    }

    public static <T>T[] subarray(final T[] array, int startIndexInclusive, int endIndexExclusive) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot1952.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        } 
        if (endIndexExclusive > (array.length)) {
            endIndexExclusive = array.length;
        } 
        final int newSize = endIndexExclusive - startIndexInclusive;
        final java.lang.Class<?> type = array.getClass().getComponentType();
        if (newSize <= 0) {
            @java.lang.SuppressWarnings(value = "unchecked")
            final T[] emptyArray = ((T[])(java.lang.reflect.Array.newInstance(type, 0)));
            return ((_returnReplacementOperatorHotSpot1953.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (emptyArray));
        } 
        @java.lang.SuppressWarnings(value = "unchecked")
        final T[] subarray = ((T[])(java.lang.reflect.Array.newInstance(type, newSize)));
        java.lang.System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        return ((_returnReplacementOperatorHotSpot1954.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (subarray));
    }

    public static long[] subarray(final long[] array, int startIndexInclusive, int endIndexExclusive) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2348.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        } 
        if (endIndexExclusive > (array.length)) {
            endIndexExclusive = array.length;
        } 
        final int newSize = endIndexExclusive - startIndexInclusive;
        if (newSize <= 0) {
            return ((_returnReplacementOperatorHotSpot2349.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY));
        } 
        final long[] subarray = new long[newSize];
        java.lang.System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        return ((_returnReplacementOperatorHotSpot2350.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (subarray));
    }

    public static int[] subarray(final int[] array, int startIndexInclusive, int endIndexExclusive) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2264.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        } 
        if (endIndexExclusive > (array.length)) {
            endIndexExclusive = array.length;
        } 
        final int newSize = endIndexExclusive - startIndexInclusive;
        if (newSize <= 0) {
            return ((_returnReplacementOperatorHotSpot2265.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY));
        } 
        final int[] subarray = new int[newSize];
        java.lang.System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        return ((_returnReplacementOperatorHotSpot2266.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (subarray));
    }

    public static short[] subarray(final short[] array, int startIndexInclusive, int endIndexExclusive) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2374.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        } 
        if (endIndexExclusive > (array.length)) {
            endIndexExclusive = array.length;
        } 
        final int newSize = endIndexExclusive - startIndexInclusive;
        if (newSize <= 0) {
            return ((_returnReplacementOperatorHotSpot2375.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY));
        } 
        final short[] subarray = new short[newSize];
        java.lang.System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        return ((_returnReplacementOperatorHotSpot2376.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (subarray));
    }

    public static char[] subarray(final char[] array, int startIndexInclusive, int endIndexExclusive) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2091.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        } 
        if (endIndexExclusive > (array.length)) {
            endIndexExclusive = array.length;
        } 
        final int newSize = endIndexExclusive - startIndexInclusive;
        if (newSize <= 0) {
            return ((_returnReplacementOperatorHotSpot2092.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY));
        } 
        final char[] subarray = new char[newSize];
        java.lang.System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        return ((_returnReplacementOperatorHotSpot2093.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (subarray));
    }

    public static byte[] subarray(final byte[] array, int startIndexInclusive, int endIndexExclusive) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2065.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        } 
        if (endIndexExclusive > (array.length)) {
            endIndexExclusive = array.length;
        } 
        final int newSize = endIndexExclusive - startIndexInclusive;
        if (newSize <= 0) {
            return ((_returnReplacementOperatorHotSpot2066.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY));
        } 
        final byte[] subarray = new byte[newSize];
        java.lang.System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        return ((_returnReplacementOperatorHotSpot2067.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (subarray));
    }

    public static double[] subarray(final double[] array, int startIndexInclusive, int endIndexExclusive) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2117.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        } 
        if (endIndexExclusive > (array.length)) {
            endIndexExclusive = array.length;
        } 
        final int newSize = endIndexExclusive - startIndexInclusive;
        if (newSize <= 0) {
            return ((_returnReplacementOperatorHotSpot2118.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY));
        } 
        final double[] subarray = new double[newSize];
        java.lang.System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        return ((_returnReplacementOperatorHotSpot2119.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (subarray));
    }

    public static float[] subarray(final float[] array, int startIndexInclusive, int endIndexExclusive) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2143.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        } 
        if (endIndexExclusive > (array.length)) {
            endIndexExclusive = array.length;
        } 
        final int newSize = endIndexExclusive - startIndexInclusive;
        if (newSize <= 0) {
            return ((_returnReplacementOperatorHotSpot2144.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY));
        } 
        final float[] subarray = new float[newSize];
        java.lang.System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        return ((_returnReplacementOperatorHotSpot2145.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (subarray));
    }

    public static boolean[] subarray(final boolean[] array, int startIndexInclusive, int endIndexExclusive) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2039.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        } 
        if (endIndexExclusive > (array.length)) {
            endIndexExclusive = array.length;
        } 
        final int newSize = endIndexExclusive - startIndexInclusive;
        if (newSize <= 0) {
            return ((_returnReplacementOperatorHotSpot2040.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_ARRAY));
        } 
        final boolean[] subarray = new boolean[newSize];
        java.lang.System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        return ((_returnReplacementOperatorHotSpot2041.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (subarray));
    }

    public static boolean isSameLength(final java.lang.Object[] array1, final java.lang.Object[] array2) {
        return ((_returnReplacementOperatorHotSpot1994.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array1)) == (org.apache.commons.lang3.ArrayUtils.getLength(array2))));
    }

    public static boolean isSameLength(final long[] array1, final long[] array2) {
        return ((_returnReplacementOperatorHotSpot1995.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array1)) == (org.apache.commons.lang3.ArrayUtils.getLength(array2))));
    }

    public static boolean isSameLength(final int[] array1, final int[] array2) {
        return ((_returnReplacementOperatorHotSpot1993.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array1)) == (org.apache.commons.lang3.ArrayUtils.getLength(array2))));
    }

    public static boolean isSameLength(final short[] array1, final short[] array2) {
        return ((_returnReplacementOperatorHotSpot1996.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array1)) == (org.apache.commons.lang3.ArrayUtils.getLength(array2))));
    }

    public static boolean isSameLength(final char[] array1, final char[] array2) {
        return ((_returnReplacementOperatorHotSpot1990.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array1)) == (org.apache.commons.lang3.ArrayUtils.getLength(array2))));
    }

    public static boolean isSameLength(final byte[] array1, final byte[] array2) {
        return ((_returnReplacementOperatorHotSpot1989.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array1)) == (org.apache.commons.lang3.ArrayUtils.getLength(array2))));
    }

    public static boolean isSameLength(final double[] array1, final double[] array2) {
        return ((_returnReplacementOperatorHotSpot1991.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array1)) == (org.apache.commons.lang3.ArrayUtils.getLength(array2))));
    }

    public static boolean isSameLength(final float[] array1, final float[] array2) {
        return ((_returnReplacementOperatorHotSpot1992.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array1)) == (org.apache.commons.lang3.ArrayUtils.getLength(array2))));
    }

    public static boolean isSameLength(final boolean[] array1, final boolean[] array2) {
        return ((_returnReplacementOperatorHotSpot1988.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array1)) == (org.apache.commons.lang3.ArrayUtils.getLength(array2))));
    }

    public static int getLength(final java.lang.Object array) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2152.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2152.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2152.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (0));
        } 
        return ((_returnReplacementOperatorHotSpot2153.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2153.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2153.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (java.lang.reflect.Array.getLength(array)));
    }

    public static boolean isSameType(final java.lang.Object array1, final java.lang.Object array2) {
        if ((array1 == null) || (array2 == null)) {
            throw new java.lang.IllegalArgumentException("The Array must not be null");
        } 
        return ((_returnReplacementOperatorHotSpot1997.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array1.getClass().getName().equals(array2.getClass().getName())));
    }

    public static void reverse(final java.lang.Object[] array) {
        if (array == null) {
            return ;
        } 
        org.apache.commons.lang3.ArrayUtils.reverse(array, 0, array.length);
    }

    public static void reverse(final long[] array) {
        if (array == null) {
            return ;
        } 
        org.apache.commons.lang3.ArrayUtils.reverse(array, 0, array.length);
    }

    public static void reverse(final int[] array) {
        if (array == null) {
            return ;
        } 
        org.apache.commons.lang3.ArrayUtils.reverse(array, 0, array.length);
    }

    public static void reverse(final short[] array) {
        if (array == null) {
            return ;
        } 
        org.apache.commons.lang3.ArrayUtils.reverse(array, 0, array.length);
    }

    public static void reverse(final char[] array) {
        if (array == null) {
            return ;
        } 
        org.apache.commons.lang3.ArrayUtils.reverse(array, 0, array.length);
    }

    public static void reverse(final byte[] array) {
        if (array == null) {
            return ;
        } 
        org.apache.commons.lang3.ArrayUtils.reverse(array, 0, array.length);
    }

    public static void reverse(final double[] array) {
        if (array == null) {
            return ;
        } 
        org.apache.commons.lang3.ArrayUtils.reverse(array, 0, array.length);
    }

    public static void reverse(final float[] array) {
        if (array == null) {
            return ;
        } 
        org.apache.commons.lang3.ArrayUtils.reverse(array, 0, array.length);
    }

    public static void reverse(final boolean[] array) {
        if (array == null) {
            return ;
        } 
        org.apache.commons.lang3.ArrayUtils.reverse(array, 0, array.length);
    }

    public static void reverse(final boolean[] array, final int startIndexInclusive, final int endIndexExclusive) {
        if (array == null) {
            return ;
        } 
        int i = startIndexInclusive < 0 ? 0 : startIndexInclusive;
        int j = (java.lang.Math.min(array.length, endIndexExclusive)) - 1;
        boolean tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }

    public static void reverse(final byte[] array, final int startIndexInclusive, final int endIndexExclusive) {
        if (array == null) {
            return ;
        } 
        int i = startIndexInclusive < 0 ? 0 : startIndexInclusive;
        int j = (java.lang.Math.min(array.length, endIndexExclusive)) - 1;
        byte tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }

    public static void reverse(final char[] array, final int startIndexInclusive, final int endIndexExclusive) {
        if (array == null) {
            return ;
        } 
        int i = startIndexInclusive < 0 ? 0 : startIndexInclusive;
        int j = (java.lang.Math.min(array.length, endIndexExclusive)) - 1;
        char tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }

    public static void reverse(final double[] array, final int startIndexInclusive, final int endIndexExclusive) {
        if (array == null) {
            return ;
        } 
        int i = startIndexInclusive < 0 ? 0 : startIndexInclusive;
        int j = (java.lang.Math.min(array.length, endIndexExclusive)) - 1;
        double tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }

    public static void reverse(final float[] array, final int startIndexInclusive, final int endIndexExclusive) {
        if (array == null) {
            return ;
        } 
        int i = startIndexInclusive < 0 ? 0 : startIndexInclusive;
        int j = (java.lang.Math.min(array.length, endIndexExclusive)) - 1;
        float tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }

    public static void reverse(final int[] array, final int startIndexInclusive, final int endIndexExclusive) {
        if (array == null) {
            return ;
        } 
        int i = startIndexInclusive < 0 ? 0 : startIndexInclusive;
        int j = (java.lang.Math.min(array.length, endIndexExclusive)) - 1;
        int tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }

    public static void reverse(final long[] array, final int startIndexInclusive, final int endIndexExclusive) {
        if (array == null) {
            return ;
        } 
        int i = startIndexInclusive < 0 ? 0 : startIndexInclusive;
        int j = (java.lang.Math.min(array.length, endIndexExclusive)) - 1;
        long tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }

    public static void reverse(final java.lang.Object[] array, final int startIndexInclusive, final int endIndexExclusive) {
        if (array == null) {
            return ;
        } 
        int i = startIndexInclusive < 0 ? 0 : startIndexInclusive;
        int j = (java.lang.Math.min(array.length, endIndexExclusive)) - 1;
        java.lang.Object tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }

    public static void reverse(final short[] array, final int startIndexInclusive, final int endIndexExclusive) {
        if (array == null) {
            return ;
        } 
        int i = startIndexInclusive < 0 ? 0 : startIndexInclusive;
        int j = (java.lang.Math.min(array.length, endIndexExclusive)) - 1;
        short tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }

    public static void swap(final java.lang.Object[] array, int offset1, int offset2) {
        if ((array == null) || ((array.length) == 0)) {
            return ;
        } 
        org.apache.commons.lang3.ArrayUtils.swap(array, offset1, offset2, 1);
    }

    public static void swap(final long[] array, int offset1, int offset2) {
        if ((array == null) || ((array.length) == 0)) {
            return ;
        } 
        org.apache.commons.lang3.ArrayUtils.swap(array, offset1, offset2, 1);
    }

    public static void swap(final int[] array, int offset1, int offset2) {
        if ((array == null) || ((array.length) == 0)) {
            return ;
        } 
        org.apache.commons.lang3.ArrayUtils.swap(array, offset1, offset2, 1);
    }

    public static void swap(final short[] array, int offset1, int offset2) {
        if ((array == null) || ((array.length) == 0)) {
            return ;
        } 
        org.apache.commons.lang3.ArrayUtils.swap(array, offset1, offset2, 1);
    }

    public static void swap(final char[] array, int offset1, int offset2) {
        if ((array == null) || ((array.length) == 0)) {
            return ;
        } 
        org.apache.commons.lang3.ArrayUtils.swap(array, offset1, offset2, 1);
    }

    public static void swap(final byte[] array, int offset1, int offset2) {
        if ((array == null) || ((array.length) == 0)) {
            return ;
        } 
        org.apache.commons.lang3.ArrayUtils.swap(array, offset1, offset2, 1);
    }

    public static void swap(final double[] array, int offset1, int offset2) {
        if ((array == null) || ((array.length) == 0)) {
            return ;
        } 
        org.apache.commons.lang3.ArrayUtils.swap(array, offset1, offset2, 1);
    }

    public static void swap(final float[] array, int offset1, int offset2) {
        if ((array == null) || ((array.length) == 0)) {
            return ;
        } 
        org.apache.commons.lang3.ArrayUtils.swap(array, offset1, offset2, 1);
    }

    public static void swap(final boolean[] array, int offset1, int offset2) {
        if ((array == null) || ((array.length) == 0)) {
            return ;
        } 
        org.apache.commons.lang3.ArrayUtils.swap(array, offset1, offset2, 1);
    }

    public static void swap(final boolean[] array, int offset1, int offset2, int len) {
        if ((((array == null) || ((array.length) == 0)) || (offset1 >= (array.length))) || (offset2 >= (array.length))) {
            return ;
        } 
        if (offset1 < 0) {
            offset1 = 0;
        } 
        if (offset2 < 0) {
            offset2 = 0;
        } 
        len = java.lang.Math.min(java.lang.Math.min(len, ((array.length) - offset1)), ((array.length) - offset2));
        for (int i = 0 ; i < len ; i++ , offset1++ , offset2++) {
            boolean aux = array[offset1];
            array[offset1] = array[offset2];
            array[offset2] = aux;
        }
    }

    public static void swap(final byte[] array, int offset1, int offset2, int len) {
        if ((((array == null) || ((array.length) == 0)) || (offset1 >= (array.length))) || (offset2 >= (array.length))) {
            return ;
        } 
        if (offset1 < 0) {
            offset1 = 0;
        } 
        if (offset2 < 0) {
            offset2 = 0;
        } 
        len = java.lang.Math.min(java.lang.Math.min(len, ((array.length) - offset1)), ((array.length) - offset2));
        for (int i = 0 ; i < len ; i++ , offset1++ , offset2++) {
            byte aux = array[offset1];
            array[offset1] = array[offset2];
            array[offset2] = aux;
        }
    }

    public static void swap(final char[] array, int offset1, int offset2, int len) {
        if ((((array == null) || ((array.length) == 0)) || (offset1 >= (array.length))) || (offset2 >= (array.length))) {
            return ;
        } 
        if (offset1 < 0) {
            offset1 = 0;
        } 
        if (offset2 < 0) {
            offset2 = 0;
        } 
        len = java.lang.Math.min(java.lang.Math.min(len, ((array.length) - offset1)), ((array.length) - offset2));
        for (int i = 0 ; i < len ; i++ , offset1++ , offset2++) {
            char aux = array[offset1];
            array[offset1] = array[offset2];
            array[offset2] = aux;
        }
    }

    public static void swap(final double[] array, int offset1, int offset2, int len) {
        if ((((array == null) || ((array.length) == 0)) || (offset1 >= (array.length))) || (offset2 >= (array.length))) {
            return ;
        } 
        if (offset1 < 0) {
            offset1 = 0;
        } 
        if (offset2 < 0) {
            offset2 = 0;
        } 
        len = java.lang.Math.min(java.lang.Math.min(len, ((array.length) - offset1)), ((array.length) - offset2));
        for (int i = 0 ; i < len ; i++ , offset1++ , offset2++) {
            double aux = array[offset1];
            array[offset1] = array[offset2];
            array[offset2] = aux;
        }
    }

    public static void swap(final float[] array, int offset1, int offset2, int len) {
        if ((((array == null) || ((array.length) == 0)) || (offset1 >= (array.length))) || (offset2 >= (array.length))) {
            return ;
        } 
        if (offset1 < 0) {
            offset1 = 0;
        } 
        if (offset2 < 0) {
            offset2 = 0;
        } 
        len = java.lang.Math.min(java.lang.Math.min(len, ((array.length) - offset1)), ((array.length) - offset2));
        for (int i = 0 ; i < len ; i++ , offset1++ , offset2++) {
            float aux = array[offset1];
            array[offset1] = array[offset2];
            array[offset2] = aux;
        }
    }

    public static void swap(final int[] array, int offset1, int offset2, int len) {
        if ((((array == null) || ((array.length) == 0)) || (offset1 >= (array.length))) || (offset2 >= (array.length))) {
            return ;
        } 
        if (offset1 < 0) {
            offset1 = 0;
        } 
        if (offset2 < 0) {
            offset2 = 0;
        } 
        len = java.lang.Math.min(java.lang.Math.min(len, ((array.length) - offset1)), ((array.length) - offset2));
        for (int i = 0 ; i < len ; i++ , offset1++ , offset2++) {
            int aux = array[offset1];
            array[offset1] = array[offset2];
            array[offset2] = aux;
        }
    }

    public static void swap(final long[] array, int offset1, int offset2, int len) {
        if ((((array == null) || ((array.length) == 0)) || (offset1 >= (array.length))) || (offset2 >= (array.length))) {
            return ;
        } 
        if (offset1 < 0) {
            offset1 = 0;
        } 
        if (offset2 < 0) {
            offset2 = 0;
        } 
        len = java.lang.Math.min(java.lang.Math.min(len, ((array.length) - offset1)), ((array.length) - offset2));
        for (int i = 0 ; i < len ; i++ , offset1++ , offset2++) {
            long aux = array[offset1];
            array[offset1] = array[offset2];
            array[offset2] = aux;
        }
    }

    public static void swap(final java.lang.Object[] array, int offset1, int offset2, int len) {
        if ((((array == null) || ((array.length) == 0)) || (offset1 >= (array.length))) || (offset2 >= (array.length))) {
            return ;
        } 
        if (offset1 < 0) {
            offset1 = 0;
        } 
        if (offset2 < 0) {
            offset2 = 0;
        } 
        len = java.lang.Math.min(java.lang.Math.min(len, ((array.length) - offset1)), ((array.length) - offset2));
        for (int i = 0 ; i < len ; i++ , offset1++ , offset2++) {
            java.lang.Object aux = array[offset1];
            array[offset1] = array[offset2];
            array[offset2] = aux;
        }
    }

    public static void swap(final short[] array, int offset1, int offset2, int len) {
        if ((((array == null) || ((array.length) == 0)) || (offset1 >= (array.length))) || (offset2 >= (array.length))) {
            return ;
        } 
        if (offset1 < 0) {
            offset1 = 0;
        } 
        if (offset2 < 0) {
            offset2 = 0;
        } 
        if (offset1 == offset2) {
            return ;
        } 
        len = java.lang.Math.min(java.lang.Math.min(len, ((array.length) - offset1)), ((array.length) - offset2));
        for (int i = 0 ; i < len ; i++ , offset1++ , offset2++) {
            short aux = array[offset1];
            array[offset1] = array[offset2];
            array[offset2] = aux;
        }
    }

    public static void shift(final java.lang.Object[] array, int offset) {
        if (array == null) {
            return ;
        } 
        org.apache.commons.lang3.ArrayUtils.shift(array, 0, array.length, offset);
    }

    public static void shift(final long[] array, int offset) {
        if (array == null) {
            return ;
        } 
        org.apache.commons.lang3.ArrayUtils.shift(array, 0, array.length, offset);
    }

    public static void shift(final int[] array, int offset) {
        if (array == null) {
            return ;
        } 
        org.apache.commons.lang3.ArrayUtils.shift(array, 0, array.length, offset);
    }

    public static void shift(final short[] array, int offset) {
        if (array == null) {
            return ;
        } 
        org.apache.commons.lang3.ArrayUtils.shift(array, 0, array.length, offset);
    }

    public static void shift(final char[] array, int offset) {
        if (array == null) {
            return ;
        } 
        org.apache.commons.lang3.ArrayUtils.shift(array, 0, array.length, offset);
    }

    public static void shift(final byte[] array, int offset) {
        if (array == null) {
            return ;
        } 
        org.apache.commons.lang3.ArrayUtils.shift(array, 0, array.length, offset);
    }

    public static void shift(final double[] array, int offset) {
        if (array == null) {
            return ;
        } 
        org.apache.commons.lang3.ArrayUtils.shift(array, 0, array.length, offset);
    }

    public static void shift(final float[] array, int offset) {
        if (array == null) {
            return ;
        } 
        org.apache.commons.lang3.ArrayUtils.shift(array, 0, array.length, offset);
    }

    public static void shift(final boolean[] array, int offset) {
        if (array == null) {
            return ;
        } 
        org.apache.commons.lang3.ArrayUtils.shift(array, 0, array.length, offset);
    }

    public static void shift(final boolean[] array, int startIndexInclusive, int endIndexExclusive, int offset) {
        if (array == null) {
            return ;
        } 
        if ((startIndexInclusive >= ((array.length) - 1)) || (endIndexExclusive <= 0)) {
            return ;
        } 
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        } 
        if (endIndexExclusive >= (array.length)) {
            endIndexExclusive = array.length;
        } 
        int n = endIndexExclusive - startIndexInclusive;
        if (n <= 1) {
            return ;
        } 
        offset %= n;
        if (offset < 0) {
            offset += n;
        } 
        while ((n > 1) && (offset > 0)) {
            int n_offset = n - offset;
            if (offset > n_offset) {
                org.apache.commons.lang3.ArrayUtils.swap(array, startIndexInclusive, ((startIndexInclusive + n) - n_offset), n_offset);
                n = offset;
                offset -= n_offset;
            } else if (offset < n_offset) {
                org.apache.commons.lang3.ArrayUtils.swap(array, startIndexInclusive, (startIndexInclusive + n_offset), offset);
                startIndexInclusive += offset;
                n = n_offset;
            } else {
                org.apache.commons.lang3.ArrayUtils.swap(array, startIndexInclusive, (startIndexInclusive + n_offset), offset);
                break;
            }
        }
    }

    public static void shift(final byte[] array, int startIndexInclusive, int endIndexExclusive, int offset) {
        if (array == null) {
            return ;
        } 
        if ((startIndexInclusive >= ((array.length) - 1)) || (endIndexExclusive <= 0)) {
            return ;
        } 
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        } 
        if (endIndexExclusive >= (array.length)) {
            endIndexExclusive = array.length;
        } 
        int n = endIndexExclusive - startIndexInclusive;
        if (n <= 1) {
            return ;
        } 
        offset %= n;
        if (offset < 0) {
            offset += n;
        } 
        while ((n > 1) && (offset > 0)) {
            int n_offset = n - offset;
            if (offset > n_offset) {
                org.apache.commons.lang3.ArrayUtils.swap(array, startIndexInclusive, ((startIndexInclusive + n) - n_offset), n_offset);
                n = offset;
                offset -= n_offset;
            } else if (offset < n_offset) {
                org.apache.commons.lang3.ArrayUtils.swap(array, startIndexInclusive, (startIndexInclusive + n_offset), offset);
                startIndexInclusive += offset;
                n = n_offset;
            } else {
                org.apache.commons.lang3.ArrayUtils.swap(array, startIndexInclusive, (startIndexInclusive + n_offset), offset);
                break;
            }
        }
    }

    public static void shift(final char[] array, int startIndexInclusive, int endIndexExclusive, int offset) {
        if (array == null) {
            return ;
        } 
        if ((startIndexInclusive >= ((array.length) - 1)) || (endIndexExclusive <= 0)) {
            return ;
        } 
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        } 
        if (endIndexExclusive >= (array.length)) {
            endIndexExclusive = array.length;
        } 
        int n = endIndexExclusive - startIndexInclusive;
        if (n <= 1) {
            return ;
        } 
        offset %= n;
        if (offset < 0) {
            offset += n;
        } 
        while ((n > 1) && (offset > 0)) {
            int n_offset = n - offset;
            if (offset > n_offset) {
                org.apache.commons.lang3.ArrayUtils.swap(array, startIndexInclusive, ((startIndexInclusive + n) - n_offset), n_offset);
                n = offset;
                offset -= n_offset;
            } else if (offset < n_offset) {
                org.apache.commons.lang3.ArrayUtils.swap(array, startIndexInclusive, (startIndexInclusive + n_offset), offset);
                startIndexInclusive += offset;
                n = n_offset;
            } else {
                org.apache.commons.lang3.ArrayUtils.swap(array, startIndexInclusive, (startIndexInclusive + n_offset), offset);
                break;
            }
        }
    }

    public static void shift(final double[] array, int startIndexInclusive, int endIndexExclusive, int offset) {
        if (array == null) {
            return ;
        } 
        if ((startIndexInclusive >= ((array.length) - 1)) || (endIndexExclusive <= 0)) {
            return ;
        } 
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        } 
        if (endIndexExclusive >= (array.length)) {
            endIndexExclusive = array.length;
        } 
        int n = endIndexExclusive - startIndexInclusive;
        if (n <= 1) {
            return ;
        } 
        offset %= n;
        if (offset < 0) {
            offset += n;
        } 
        while ((n > 1) && (offset > 0)) {
            int n_offset = n - offset;
            if (offset > n_offset) {
                org.apache.commons.lang3.ArrayUtils.swap(array, startIndexInclusive, ((startIndexInclusive + n) - n_offset), n_offset);
                n = offset;
                offset -= n_offset;
            } else if (offset < n_offset) {
                org.apache.commons.lang3.ArrayUtils.swap(array, startIndexInclusive, (startIndexInclusive + n_offset), offset);
                startIndexInclusive += offset;
                n = n_offset;
            } else {
                org.apache.commons.lang3.ArrayUtils.swap(array, startIndexInclusive, (startIndexInclusive + n_offset), offset);
                break;
            }
        }
    }

    public static void shift(final float[] array, int startIndexInclusive, int endIndexExclusive, int offset) {
        if (array == null) {
            return ;
        } 
        if ((startIndexInclusive >= ((array.length) - 1)) || (endIndexExclusive <= 0)) {
            return ;
        } 
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        } 
        if (endIndexExclusive >= (array.length)) {
            endIndexExclusive = array.length;
        } 
        int n = endIndexExclusive - startIndexInclusive;
        if (n <= 1) {
            return ;
        } 
        offset %= n;
        if (offset < 0) {
            offset += n;
        } 
        while ((n > 1) && (offset > 0)) {
            int n_offset = n - offset;
            if (offset > n_offset) {
                org.apache.commons.lang3.ArrayUtils.swap(array, startIndexInclusive, ((startIndexInclusive + n) - n_offset), n_offset);
                n = offset;
                offset -= n_offset;
            } else if (offset < n_offset) {
                org.apache.commons.lang3.ArrayUtils.swap(array, startIndexInclusive, (startIndexInclusive + n_offset), offset);
                startIndexInclusive += offset;
                n = n_offset;
            } else {
                org.apache.commons.lang3.ArrayUtils.swap(array, startIndexInclusive, (startIndexInclusive + n_offset), offset);
                break;
            }
        }
    }

    public static void shift(final int[] array, int startIndexInclusive, int endIndexExclusive, int offset) {
        if (array == null) {
            return ;
        } 
        if ((startIndexInclusive >= ((array.length) - 1)) || (endIndexExclusive <= 0)) {
            return ;
        } 
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        } 
        if (endIndexExclusive >= (array.length)) {
            endIndexExclusive = array.length;
        } 
        int n = endIndexExclusive - startIndexInclusive;
        if (n <= 1) {
            return ;
        } 
        offset %= n;
        if (offset < 0) {
            offset += n;
        } 
        while ((n > 1) && (offset > 0)) {
            int n_offset = n - offset;
            if (offset > n_offset) {
                org.apache.commons.lang3.ArrayUtils.swap(array, startIndexInclusive, ((startIndexInclusive + n) - n_offset), n_offset);
                n = offset;
                offset -= n_offset;
            } else if (offset < n_offset) {
                org.apache.commons.lang3.ArrayUtils.swap(array, startIndexInclusive, (startIndexInclusive + n_offset), offset);
                startIndexInclusive += offset;
                n = n_offset;
            } else {
                org.apache.commons.lang3.ArrayUtils.swap(array, startIndexInclusive, (startIndexInclusive + n_offset), offset);
                break;
            }
        }
    }

    public static void shift(final long[] array, int startIndexInclusive, int endIndexExclusive, int offset) {
        if (array == null) {
            return ;
        } 
        if ((startIndexInclusive >= ((array.length) - 1)) || (endIndexExclusive <= 0)) {
            return ;
        } 
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        } 
        if (endIndexExclusive >= (array.length)) {
            endIndexExclusive = array.length;
        } 
        int n = endIndexExclusive - startIndexInclusive;
        if (n <= 1) {
            return ;
        } 
        offset %= n;
        if (offset < 0) {
            offset += n;
        } 
        while ((n > 1) && (offset > 0)) {
            int n_offset = n - offset;
            if (offset > n_offset) {
                org.apache.commons.lang3.ArrayUtils.swap(array, startIndexInclusive, ((startIndexInclusive + n) - n_offset), n_offset);
                n = offset;
                offset -= n_offset;
            } else if (offset < n_offset) {
                org.apache.commons.lang3.ArrayUtils.swap(array, startIndexInclusive, (startIndexInclusive + n_offset), offset);
                startIndexInclusive += offset;
                n = n_offset;
            } else {
                org.apache.commons.lang3.ArrayUtils.swap(array, startIndexInclusive, (startIndexInclusive + n_offset), offset);
                break;
            }
        }
    }

    public static void shift(final java.lang.Object[] array, int startIndexInclusive, int endIndexExclusive, int offset) {
        if (array == null) {
            return ;
        } 
        if ((startIndexInclusive >= ((array.length) - 1)) || (endIndexExclusive <= 0)) {
            return ;
        } 
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        } 
        if (endIndexExclusive >= (array.length)) {
            endIndexExclusive = array.length;
        } 
        int n = endIndexExclusive - startIndexInclusive;
        if (n <= 1) {
            return ;
        } 
        offset %= n;
        if (offset < 0) {
            offset += n;
        } 
        while ((n > 1) && (offset > 0)) {
            int n_offset = n - offset;
            if (offset > n_offset) {
                org.apache.commons.lang3.ArrayUtils.swap(array, startIndexInclusive, ((startIndexInclusive + n) - n_offset), n_offset);
                n = offset;
                offset -= n_offset;
            } else if (offset < n_offset) {
                org.apache.commons.lang3.ArrayUtils.swap(array, startIndexInclusive, (startIndexInclusive + n_offset), offset);
                startIndexInclusive += offset;
                n = n_offset;
            } else {
                org.apache.commons.lang3.ArrayUtils.swap(array, startIndexInclusive, (startIndexInclusive + n_offset), offset);
                break;
            }
        }
    }

    public static void shift(final short[] array, int startIndexInclusive, int endIndexExclusive, int offset) {
        if (array == null) {
            return ;
        } 
        if ((startIndexInclusive >= ((array.length) - 1)) || (endIndexExclusive <= 0)) {
            return ;
        } 
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        } 
        if (endIndexExclusive >= (array.length)) {
            endIndexExclusive = array.length;
        } 
        int n = endIndexExclusive - startIndexInclusive;
        if (n <= 1) {
            return ;
        } 
        offset %= n;
        if (offset < 0) {
            offset += n;
        } 
        while ((n > 1) && (offset > 0)) {
            int n_offset = n - offset;
            if (offset > n_offset) {
                org.apache.commons.lang3.ArrayUtils.swap(array, startIndexInclusive, ((startIndexInclusive + n) - n_offset), n_offset);
                n = offset;
                offset -= n_offset;
            } else if (offset < n_offset) {
                org.apache.commons.lang3.ArrayUtils.swap(array, startIndexInclusive, (startIndexInclusive + n_offset), offset);
                startIndexInclusive += offset;
                n = n_offset;
            } else {
                org.apache.commons.lang3.ArrayUtils.swap(array, startIndexInclusive, (startIndexInclusive + n_offset), offset);
                break;
            }
        }
    }

    public static int indexOf(final java.lang.Object[] array, final java.lang.Object objectToFind) {
        return ((_returnReplacementOperatorHotSpot2183.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2183.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2183.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.indexOf(array, objectToFind, 0)));
    }

    public static int indexOf(final java.lang.Object[] array, final java.lang.Object objectToFind, int startIndex) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2184.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2184.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2184.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            startIndex = 0;
        } 
        if (objectToFind == null) {
            for (int i = startIndex ; i < (array.length) ; i++) {
                if ((array[i]) == null) {
                    return ((_returnReplacementOperatorHotSpot2185.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2185.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2185.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (i));
                } 
            }
        } else if (array.getClass().getComponentType().isInstance(objectToFind)) {
            for (int i = startIndex ; i < (array.length) ; i++) {
                if (objectToFind.equals(array[i])) {
                    return ((_returnReplacementOperatorHotSpot2186.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2186.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2186.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (i));
                } 
            }
        } 
        return ((_returnReplacementOperatorHotSpot2187.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2187.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2187.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static int lastIndexOf(final java.lang.Object[] array, final java.lang.Object objectToFind) {
        return ((_returnReplacementOperatorHotSpot2231.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2231.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2231.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.lastIndexOf(array, objectToFind, java.lang.Integer.MAX_VALUE)));
    }

    public static int lastIndexOf(final java.lang.Object[] array, final java.lang.Object objectToFind, int startIndex) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2232.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2232.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2232.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            return ((_returnReplacementOperatorHotSpot2233.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2233.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2233.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } else if (startIndex >= (array.length)) {
            startIndex = (array.length) - 1;
        } 
        if (objectToFind == null) {
            for (int i = startIndex ; i >= 0 ; i--) {
                if ((array[i]) == null) {
                    return ((_returnReplacementOperatorHotSpot2234.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2234.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2234.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (i));
                } 
            }
        } else if (array.getClass().getComponentType().isInstance(objectToFind)) {
            for (int i = startIndex ; i >= 0 ; i--) {
                if (objectToFind.equals(array[i])) {
                    return ((_returnReplacementOperatorHotSpot2235.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2235.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2235.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (i));
                } 
            }
        } 
        return ((_returnReplacementOperatorHotSpot2236.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2236.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2236.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static boolean contains(final java.lang.Object[] array, final java.lang.Object objectToFind) {
        return ((_returnReplacementOperatorHotSpot1967.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.indexOf(array, objectToFind)) != (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND)));
    }

    public static int indexOf(final long[] array, final long valueToFind) {
        return ((_returnReplacementOperatorHotSpot2188.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2188.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2188.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind, 0)));
    }

    public static int indexOf(final long[] array, final long valueToFind, int startIndex) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2189.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2189.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2189.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            startIndex = 0;
        } 
        for (int i = startIndex ; i < (array.length) ; i++) {
            if (valueToFind == (array[i])) {
                return ((_returnReplacementOperatorHotSpot2190.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2190.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2190.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperatorHotSpot2191.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2191.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2191.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static int lastIndexOf(final long[] array, final long valueToFind) {
        return ((_returnReplacementOperatorHotSpot2237.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2237.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2237.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.lastIndexOf(array, valueToFind, java.lang.Integer.MAX_VALUE)));
    }

    public static int lastIndexOf(final long[] array, final long valueToFind, int startIndex) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2238.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2238.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2238.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            return ((_returnReplacementOperatorHotSpot2239.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2239.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2239.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } else if (startIndex >= (array.length)) {
            startIndex = (array.length) - 1;
        } 
        for (int i = startIndex ; i >= 0 ; i--) {
            if (valueToFind == (array[i])) {
                return ((_returnReplacementOperatorHotSpot2240.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2240.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2240.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperatorHotSpot2241.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2241.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2241.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static boolean contains(final long[] array, final long valueToFind) {
        return ((_returnReplacementOperatorHotSpot1968.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind)) != (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND)));
    }

    public static int indexOf(final int[] array, final int valueToFind) {
        return ((_returnReplacementOperatorHotSpot2179.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2179.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2179.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind, 0)));
    }

    public static int indexOf(final int[] array, final int valueToFind, int startIndex) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2180.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2180.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2180.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            startIndex = 0;
        } 
        for (int i = startIndex ; i < (array.length) ; i++) {
            if (valueToFind == (array[i])) {
                return ((_returnReplacementOperatorHotSpot2181.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2181.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2181.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperatorHotSpot2182.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2182.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2182.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static int lastIndexOf(final int[] array, final int valueToFind) {
        return ((_returnReplacementOperatorHotSpot2226.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2226.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2226.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.lastIndexOf(array, valueToFind, java.lang.Integer.MAX_VALUE)));
    }

    public static int lastIndexOf(final int[] array, final int valueToFind, int startIndex) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2227.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2227.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2227.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            return ((_returnReplacementOperatorHotSpot2228.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2228.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2228.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } else if (startIndex >= (array.length)) {
            startIndex = (array.length) - 1;
        } 
        for (int i = startIndex ; i >= 0 ; i--) {
            if (valueToFind == (array[i])) {
                return ((_returnReplacementOperatorHotSpot2229.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2229.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2229.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperatorHotSpot2230.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2230.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2230.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static boolean contains(final int[] array, final int valueToFind) {
        return ((_returnReplacementOperatorHotSpot1966.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind)) != (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND)));
    }

    public static int indexOf(final short[] array, final short valueToFind) {
        return ((_returnReplacementOperatorHotSpot2192.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2192.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2192.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind, 0)));
    }

    public static int indexOf(final short[] array, final short valueToFind, int startIndex) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2193.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2193.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2193.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            startIndex = 0;
        } 
        for (int i = startIndex ; i < (array.length) ; i++) {
            if (valueToFind == (array[i])) {
                return ((_returnReplacementOperatorHotSpot2194.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2194.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2194.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperatorHotSpot2195.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2195.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2195.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static int lastIndexOf(final short[] array, final short valueToFind) {
        return ((_returnReplacementOperatorHotSpot2242.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2242.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2242.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.lastIndexOf(array, valueToFind, java.lang.Integer.MAX_VALUE)));
    }

    public static int lastIndexOf(final short[] array, final short valueToFind, int startIndex) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2243.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2243.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2243.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            return ((_returnReplacementOperatorHotSpot2244.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2244.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2244.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } else if (startIndex >= (array.length)) {
            startIndex = (array.length) - 1;
        } 
        for (int i = startIndex ; i >= 0 ; i--) {
            if (valueToFind == (array[i])) {
                return ((_returnReplacementOperatorHotSpot2245.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2245.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2245.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperatorHotSpot2246.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2246.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2246.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static boolean contains(final short[] array, final short valueToFind) {
        return ((_returnReplacementOperatorHotSpot1969.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind)) != (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND)));
    }

    public static int indexOf(final char[] array, final char valueToFind) {
        return ((_returnReplacementOperatorHotSpot2163.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2163.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2163.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind, 0)));
    }

    public static int indexOf(final char[] array, final char valueToFind, int startIndex) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2164.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2164.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2164.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            startIndex = 0;
        } 
        for (int i = startIndex ; i < (array.length) ; i++) {
            if (valueToFind == (array[i])) {
                return ((_returnReplacementOperatorHotSpot2165.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2165.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2165.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperatorHotSpot2166.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2166.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2166.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static int lastIndexOf(final char[] array, final char valueToFind) {
        return ((_returnReplacementOperatorHotSpot2206.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2206.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2206.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.lastIndexOf(array, valueToFind, java.lang.Integer.MAX_VALUE)));
    }

    public static int lastIndexOf(final char[] array, final char valueToFind, int startIndex) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2207.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2207.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2207.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            return ((_returnReplacementOperatorHotSpot2208.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2208.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2208.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } else if (startIndex >= (array.length)) {
            startIndex = (array.length) - 1;
        } 
        for (int i = startIndex ; i >= 0 ; i--) {
            if (valueToFind == (array[i])) {
                return ((_returnReplacementOperatorHotSpot2209.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2209.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2209.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperatorHotSpot2210.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2210.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2210.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static boolean contains(final char[] array, final char valueToFind) {
        return ((_returnReplacementOperatorHotSpot1962.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind)) != (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND)));
    }

    public static int indexOf(final byte[] array, final byte valueToFind) {
        return ((_returnReplacementOperatorHotSpot2159.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2159.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2159.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind, 0)));
    }

    public static int indexOf(final byte[] array, final byte valueToFind, int startIndex) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2160.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2160.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2160.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            startIndex = 0;
        } 
        for (int i = startIndex ; i < (array.length) ; i++) {
            if (valueToFind == (array[i])) {
                return ((_returnReplacementOperatorHotSpot2161.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2161.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2161.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperatorHotSpot2162.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2162.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2162.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static int lastIndexOf(final byte[] array, final byte valueToFind) {
        return ((_returnReplacementOperatorHotSpot2201.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2201.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2201.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.lastIndexOf(array, valueToFind, java.lang.Integer.MAX_VALUE)));
    }

    public static int lastIndexOf(final byte[] array, final byte valueToFind, int startIndex) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2202.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2202.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2202.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            return ((_returnReplacementOperatorHotSpot2203.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2203.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2203.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } else if (startIndex >= (array.length)) {
            startIndex = (array.length) - 1;
        } 
        for (int i = startIndex ; i >= 0 ; i--) {
            if (valueToFind == (array[i])) {
                return ((_returnReplacementOperatorHotSpot2204.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2204.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2204.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperatorHotSpot2205.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2205.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2205.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static boolean contains(final byte[] array, final byte valueToFind) {
        return ((_returnReplacementOperatorHotSpot1961.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind)) != (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND)));
    }

    public static int indexOf(final double[] array, final double valueToFind) {
        return ((_returnReplacementOperatorHotSpot2167.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2167.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2167.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind, 0)));
    }

    public static int indexOf(final double[] array, final double valueToFind, final double tolerance) {
        return ((_returnReplacementOperatorHotSpot2168.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2168.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2168.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind, 0, tolerance)));
    }

    public static int indexOf(final double[] array, final double valueToFind, int startIndex) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperatorHotSpot2169.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2169.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2169.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            startIndex = 0;
        } 
        for (int i = startIndex ; i < (array.length) ; i++) {
            if (valueToFind == (array[i])) {
                return ((_returnReplacementOperatorHotSpot2170.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2170.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2170.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperatorHotSpot2171.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2171.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2171.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static int indexOf(final double[] array, final double valueToFind, int startIndex, final double tolerance) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperatorHotSpot2172.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2172.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2172.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            startIndex = 0;
        } 
        final double min = valueToFind - tolerance;
        final double max = valueToFind + tolerance;
        for (int i = startIndex ; i < (array.length) ; i++) {
            if (((array[i]) >= min) && ((array[i]) <= max)) {
                return ((_returnReplacementOperatorHotSpot2173.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2173.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2173.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperatorHotSpot2174.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2174.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2174.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static int lastIndexOf(final double[] array, final double valueToFind) {
        return ((_returnReplacementOperatorHotSpot2211.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2211.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2211.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.lastIndexOf(array, valueToFind, java.lang.Integer.MAX_VALUE)));
    }

    public static int lastIndexOf(final double[] array, final double valueToFind, final double tolerance) {
        return ((_returnReplacementOperatorHotSpot2212.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2212.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2212.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.lastIndexOf(array, valueToFind, java.lang.Integer.MAX_VALUE, tolerance)));
    }

    public static int lastIndexOf(final double[] array, final double valueToFind, int startIndex) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperatorHotSpot2213.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2213.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2213.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            return ((_returnReplacementOperatorHotSpot2214.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2214.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2214.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } else if (startIndex >= (array.length)) {
            startIndex = (array.length) - 1;
        } 
        for (int i = startIndex ; i >= 0 ; i--) {
            if (valueToFind == (array[i])) {
                return ((_returnReplacementOperatorHotSpot2215.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2215.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2215.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperatorHotSpot2216.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2216.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2216.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static int lastIndexOf(final double[] array, final double valueToFind, int startIndex, final double tolerance) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperatorHotSpot2217.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2217.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2217.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            return ((_returnReplacementOperatorHotSpot2218.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2218.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2218.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } else if (startIndex >= (array.length)) {
            startIndex = (array.length) - 1;
        } 
        final double min = valueToFind - tolerance;
        final double max = valueToFind + tolerance;
        for (int i = startIndex ; i >= 0 ; i--) {
            if (((array[i]) >= min) && ((array[i]) <= max)) {
                return ((_returnReplacementOperatorHotSpot2219.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2219.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2219.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperatorHotSpot2220.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2220.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2220.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static boolean contains(final double[] array, final double valueToFind) {
        return ((_returnReplacementOperatorHotSpot1963.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind)) != (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND)));
    }

    public static boolean contains(final double[] array, final double valueToFind, final double tolerance) {
        return ((_returnReplacementOperatorHotSpot1964.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind, 0, tolerance)) != (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND)));
    }

    public static int indexOf(final float[] array, final float valueToFind) {
        return ((_returnReplacementOperatorHotSpot2175.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2175.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2175.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind, 0)));
    }

    public static int indexOf(final float[] array, final float valueToFind, int startIndex) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperatorHotSpot2176.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2176.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2176.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            startIndex = 0;
        } 
        for (int i = startIndex ; i < (array.length) ; i++) {
            if (valueToFind == (array[i])) {
                return ((_returnReplacementOperatorHotSpot2177.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2177.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2177.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperatorHotSpot2178.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2178.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2178.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static int lastIndexOf(final float[] array, final float valueToFind) {
        return ((_returnReplacementOperatorHotSpot2221.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2221.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2221.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.lastIndexOf(array, valueToFind, java.lang.Integer.MAX_VALUE)));
    }

    public static int lastIndexOf(final float[] array, final float valueToFind, int startIndex) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperatorHotSpot2222.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2222.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2222.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            return ((_returnReplacementOperatorHotSpot2223.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2223.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2223.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } else if (startIndex >= (array.length)) {
            startIndex = (array.length) - 1;
        } 
        for (int i = startIndex ; i >= 0 ; i--) {
            if (valueToFind == (array[i])) {
                return ((_returnReplacementOperatorHotSpot2224.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2224.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2224.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperatorHotSpot2225.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2225.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2225.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static boolean contains(final float[] array, final float valueToFind) {
        return ((_returnReplacementOperatorHotSpot1965.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind)) != (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND)));
    }

    public static int indexOf(final boolean[] array, final boolean valueToFind) {
        return ((_returnReplacementOperatorHotSpot2155.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2155.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2155.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind, 0)));
    }

    public static int indexOf(final boolean[] array, final boolean valueToFind, int startIndex) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperatorHotSpot2156.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2156.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2156.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            startIndex = 0;
        } 
        for (int i = startIndex ; i < (array.length) ; i++) {
            if (valueToFind == (array[i])) {
                return ((_returnReplacementOperatorHotSpot2157.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2157.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2157.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperatorHotSpot2158.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2158.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2158.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static int lastIndexOf(final boolean[] array, final boolean valueToFind) {
        return ((_returnReplacementOperatorHotSpot2196.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2196.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2196.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.lastIndexOf(array, valueToFind, java.lang.Integer.MAX_VALUE)));
    }

    public static int lastIndexOf(final boolean[] array, final boolean valueToFind, int startIndex) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperatorHotSpot2197.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2197.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2197.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            return ((_returnReplacementOperatorHotSpot2198.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2198.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2198.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } else if (startIndex >= (array.length)) {
            startIndex = (array.length) - 1;
        } 
        for (int i = startIndex ; i >= 0 ; i--) {
            if (valueToFind == (array[i])) {
                return ((_returnReplacementOperatorHotSpot2199.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2199.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2199.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperatorHotSpot2200.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2200.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2200.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static boolean contains(final boolean[] array, final boolean valueToFind) {
        return ((_returnReplacementOperatorHotSpot1960.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind)) != (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND)));
    }

    public static char[] toPrimitive(final java.lang.Character[] array) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2094.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperatorHotSpot2095.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY));
        } 
        final char[] result = new char[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            result[i] = array[i].charValue();
        }
        return ((_returnReplacementOperatorHotSpot2096.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static char[] toPrimitive(final java.lang.Character[] array, final char valueForNull) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2097.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperatorHotSpot2098.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY));
        } 
        final char[] result = new char[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            final java.lang.Character b = array[i];
            result[i] = b == null ? valueForNull : b.charValue();
        }
        return ((_returnReplacementOperatorHotSpot2099.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static java.lang.Character[] toObject(final char[] array) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2285.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperatorHotSpot2286.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY));
        } 
        final java.lang.Character[] result = new java.lang.Character[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            result[i] = java.lang.Character.valueOf(array[i]);
        }
        return ((_returnReplacementOperatorHotSpot2287.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static long[] toPrimitive(final java.lang.Long[] array) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2351.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperatorHotSpot2352.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY));
        } 
        final long[] result = new long[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            result[i] = array[i].longValue();
        }
        return ((_returnReplacementOperatorHotSpot2353.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static long[] toPrimitive(final java.lang.Long[] array, final long valueForNull) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2354.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperatorHotSpot2355.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY));
        } 
        final long[] result = new long[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            final java.lang.Long b = array[i];
            result[i] = b == null ? valueForNull : b.longValue();
        }
        return ((_returnReplacementOperatorHotSpot2356.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static java.lang.Long[] toObject(final long[] array) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2307.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperatorHotSpot2308.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY));
        } 
        final java.lang.Long[] result = new java.lang.Long[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            result[i] = java.lang.Long.valueOf(array[i]);
        }
        return ((_returnReplacementOperatorHotSpot2309.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static int[] toPrimitive(final java.lang.Integer[] array) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2267.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperatorHotSpot2268.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY));
        } 
        final int[] result = new int[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            result[i] = array[i].intValue();
        }
        return ((_returnReplacementOperatorHotSpot2269.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static int[] toPrimitive(final java.lang.Integer[] array, final int valueForNull) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2270.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperatorHotSpot2271.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY));
        } 
        final int[] result = new int[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            final java.lang.Integer b = array[i];
            result[i] = b == null ? valueForNull : b.intValue();
        }
        return ((_returnReplacementOperatorHotSpot2272.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static java.lang.Integer[] toObject(final int[] array) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2302.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperatorHotSpot2303.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY));
        } 
        final java.lang.Integer[] result = new java.lang.Integer[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            result[i] = java.lang.Integer.valueOf(array[i]);
        }
        return ((_returnReplacementOperatorHotSpot2304.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static short[] toPrimitive(final java.lang.Short[] array) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2377.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperatorHotSpot2378.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY));
        } 
        final short[] result = new short[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            result[i] = array[i].shortValue();
        }
        return ((_returnReplacementOperatorHotSpot2379.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static short[] toPrimitive(final java.lang.Short[] array, final short valueForNull) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2380.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperatorHotSpot2381.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY));
        } 
        final short[] result = new short[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            final java.lang.Short b = array[i];
            result[i] = b == null ? valueForNull : b.shortValue();
        }
        return ((_returnReplacementOperatorHotSpot2382.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static java.lang.Short[] toObject(final short[] array) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2321.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperatorHotSpot2322.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY));
        } 
        final java.lang.Short[] result = new java.lang.Short[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            result[i] = java.lang.Short.valueOf(array[i]);
        }
        return ((_returnReplacementOperatorHotSpot2323.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static byte[] toPrimitive(final java.lang.Byte[] array) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2068.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperatorHotSpot2069.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY));
        } 
        final byte[] result = new byte[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            result[i] = array[i].byteValue();
        }
        return ((_returnReplacementOperatorHotSpot2070.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static byte[] toPrimitive(final java.lang.Byte[] array, final byte valueForNull) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2071.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperatorHotSpot2072.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY));
        } 
        final byte[] result = new byte[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            final java.lang.Byte b = array[i];
            result[i] = b == null ? valueForNull : b.byteValue();
        }
        return ((_returnReplacementOperatorHotSpot2073.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static java.lang.Byte[] toObject(final byte[] array) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2280.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperatorHotSpot2281.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY));
        } 
        final java.lang.Byte[] result = new java.lang.Byte[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            result[i] = java.lang.Byte.valueOf(array[i]);
        }
        return ((_returnReplacementOperatorHotSpot2282.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static double[] toPrimitive(final java.lang.Double[] array) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2120.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperatorHotSpot2121.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY));
        } 
        final double[] result = new double[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            result[i] = array[i].doubleValue();
        }
        return ((_returnReplacementOperatorHotSpot2122.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static double[] toPrimitive(final java.lang.Double[] array, final double valueForNull) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2123.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperatorHotSpot2124.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY));
        } 
        final double[] result = new double[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            final java.lang.Double b = array[i];
            result[i] = b == null ? valueForNull : b.doubleValue();
        }
        return ((_returnReplacementOperatorHotSpot2125.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static java.lang.Double[] toObject(final double[] array) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2292.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperatorHotSpot2293.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY));
        } 
        final java.lang.Double[] result = new java.lang.Double[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            result[i] = java.lang.Double.valueOf(array[i]);
        }
        return ((_returnReplacementOperatorHotSpot2294.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static float[] toPrimitive(final java.lang.Float[] array) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2146.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperatorHotSpot2147.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY));
        } 
        final float[] result = new float[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            result[i] = array[i].floatValue();
        }
        return ((_returnReplacementOperatorHotSpot2148.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static float[] toPrimitive(final java.lang.Float[] array, final float valueForNull) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2149.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperatorHotSpot2150.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY));
        } 
        final float[] result = new float[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            final java.lang.Float b = array[i];
            result[i] = b == null ? valueForNull : b.floatValue();
        }
        return ((_returnReplacementOperatorHotSpot2151.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static java.lang.Float[] toObject(final float[] array) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2297.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperatorHotSpot2298.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY));
        } 
        final java.lang.Float[] result = new java.lang.Float[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            result[i] = java.lang.Float.valueOf(array[i]);
        }
        return ((_returnReplacementOperatorHotSpot2299.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static boolean[] toPrimitive(final java.lang.Boolean[] array) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2042.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperatorHotSpot2043.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_ARRAY));
        } 
        final boolean[] result = new boolean[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            result[i] = array[i].booleanValue();
        }
        return ((_returnReplacementOperatorHotSpot2044.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static boolean[] toPrimitive(final java.lang.Boolean[] array, final boolean valueForNull) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2045.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperatorHotSpot2046.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_ARRAY));
        } 
        final boolean[] result = new boolean[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            final java.lang.Boolean b = array[i];
            result[i] = b == null ? valueForNull : b.booleanValue();
        }
        return ((_returnReplacementOperatorHotSpot2047.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static java.lang.Boolean[] toObject(final boolean[] array) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2275.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperatorHotSpot2276.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY));
        } 
        final java.lang.Boolean[] result = new java.lang.Boolean[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            result[i] = array[i] ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        }
        return ((_returnReplacementOperatorHotSpot2277.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static boolean isEmpty(final java.lang.Object[] array) {
        return ((_returnReplacementOperatorHotSpot1976.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array)) == 0));
    }

    public static boolean isEmpty(final long[] array) {
        return ((_returnReplacementOperatorHotSpot1977.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array)) == 0));
    }

    public static boolean isEmpty(final int[] array) {
        return ((_returnReplacementOperatorHotSpot1975.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array)) == 0));
    }

    public static boolean isEmpty(final short[] array) {
        return ((_returnReplacementOperatorHotSpot1978.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array)) == 0));
    }

    public static boolean isEmpty(final char[] array) {
        return ((_returnReplacementOperatorHotSpot1972.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array)) == 0));
    }

    public static boolean isEmpty(final byte[] array) {
        return ((_returnReplacementOperatorHotSpot1971.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array)) == 0));
    }

    public static boolean isEmpty(final double[] array) {
        return ((_returnReplacementOperatorHotSpot1973.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array)) == 0));
    }

    public static boolean isEmpty(final float[] array) {
        return ((_returnReplacementOperatorHotSpot1974.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array)) == 0));
    }

    public static boolean isEmpty(final boolean[] array) {
        return ((_returnReplacementOperatorHotSpot1970.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array)) == 0));
    }

    public static <T>boolean isNotEmpty(final T[] array) {
        return ((_returnReplacementOperatorHotSpot1956.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (!(org.apache.commons.lang3.ArrayUtils.isEmpty(array))));
    }

    public static boolean isNotEmpty(final long[] array) {
        return ((_returnReplacementOperatorHotSpot1986.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (!(org.apache.commons.lang3.ArrayUtils.isEmpty(array))));
    }

    public static boolean isNotEmpty(final int[] array) {
        return ((_returnReplacementOperatorHotSpot1985.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (!(org.apache.commons.lang3.ArrayUtils.isEmpty(array))));
    }

    public static boolean isNotEmpty(final short[] array) {
        return ((_returnReplacementOperatorHotSpot1987.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (!(org.apache.commons.lang3.ArrayUtils.isEmpty(array))));
    }

    public static boolean isNotEmpty(final char[] array) {
        return ((_returnReplacementOperatorHotSpot1982.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (!(org.apache.commons.lang3.ArrayUtils.isEmpty(array))));
    }

    public static boolean isNotEmpty(final byte[] array) {
        return ((_returnReplacementOperatorHotSpot1981.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (!(org.apache.commons.lang3.ArrayUtils.isEmpty(array))));
    }

    public static boolean isNotEmpty(final double[] array) {
        return ((_returnReplacementOperatorHotSpot1983.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (!(org.apache.commons.lang3.ArrayUtils.isEmpty(array))));
    }

    public static boolean isNotEmpty(final float[] array) {
        return ((_returnReplacementOperatorHotSpot1984.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (!(org.apache.commons.lang3.ArrayUtils.isEmpty(array))));
    }

    public static boolean isNotEmpty(final boolean[] array) {
        return ((_returnReplacementOperatorHotSpot1980.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (!(org.apache.commons.lang3.ArrayUtils.isEmpty(array))));
    }

    public static <T>T[] addAll(final T[] array1, final T... array2) {
        if (array1 == null) {
            return ((_returnReplacementOperatorHotSpot1937.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array2)));
        } else if (array2 == null) {
            return ((_returnReplacementOperatorHotSpot1938.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array1)));
        } 
        final java.lang.Class<?> type1 = array1.getClass().getComponentType();
        @java.lang.SuppressWarnings(value = "unchecked")
        final T[] joinedArray = ((T[])(java.lang.reflect.Array.newInstance(type1, ((array1.length) + (array2.length)))));
        java.lang.System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        try {
            java.lang.System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        } catch (final java.lang.ArrayStoreException ase) {
            final java.lang.Class<?> type2 = array2.getClass().getComponentType();
            if (!(type1.isAssignableFrom(type2))) {
                throw new java.lang.IllegalArgumentException(((("Cannot store " + (type2.getName())) + " in an array of ") + (type1.getName())) , ase);
            } 
            throw ase;
        }
        return ((_returnReplacementOperatorHotSpot1939.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (joinedArray));
    }

    public static boolean[] addAll(final boolean[] array1, final boolean... array2) {
        if (array1 == null) {
            return ((_returnReplacementOperatorHotSpot2024.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array2)));
        } else if (array2 == null) {
            return ((_returnReplacementOperatorHotSpot2025.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array1)));
        } 
        final boolean[] joinedArray = new boolean[(array1.length) + (array2.length)];
        java.lang.System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        java.lang.System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        return ((_returnReplacementOperatorHotSpot2026.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (joinedArray));
    }

    public static char[] addAll(final char[] array1, final char... array2) {
        if (array1 == null) {
            return ((_returnReplacementOperatorHotSpot2076.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array2)));
        } else if (array2 == null) {
            return ((_returnReplacementOperatorHotSpot2077.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array1)));
        } 
        final char[] joinedArray = new char[(array1.length) + (array2.length)];
        java.lang.System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        java.lang.System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        return ((_returnReplacementOperatorHotSpot2078.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (joinedArray));
    }

    public static byte[] addAll(final byte[] array1, final byte... array2) {
        if (array1 == null) {
            return ((_returnReplacementOperatorHotSpot2050.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array2)));
        } else if (array2 == null) {
            return ((_returnReplacementOperatorHotSpot2051.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array1)));
        } 
        final byte[] joinedArray = new byte[(array1.length) + (array2.length)];
        java.lang.System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        java.lang.System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        return ((_returnReplacementOperatorHotSpot2052.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (joinedArray));
    }

    public static short[] addAll(final short[] array1, final short... array2) {
        if (array1 == null) {
            return ((_returnReplacementOperatorHotSpot2359.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array2)));
        } else if (array2 == null) {
            return ((_returnReplacementOperatorHotSpot2360.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array1)));
        } 
        final short[] joinedArray = new short[(array1.length) + (array2.length)];
        java.lang.System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        java.lang.System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        return ((_returnReplacementOperatorHotSpot2361.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (joinedArray));
    }

    public static int[] addAll(final int[] array1, final int... array2) {
        if (array1 == null) {
            return ((_returnReplacementOperatorHotSpot2249.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array2)));
        } else if (array2 == null) {
            return ((_returnReplacementOperatorHotSpot2250.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array1)));
        } 
        final int[] joinedArray = new int[(array1.length) + (array2.length)];
        java.lang.System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        java.lang.System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        return ((_returnReplacementOperatorHotSpot2251.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (joinedArray));
    }

    public static long[] addAll(final long[] array1, final long... array2) {
        if (array1 == null) {
            return ((_returnReplacementOperatorHotSpot2333.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array2)));
        } else if (array2 == null) {
            return ((_returnReplacementOperatorHotSpot2334.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array1)));
        } 
        final long[] joinedArray = new long[(array1.length) + (array2.length)];
        java.lang.System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        java.lang.System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        return ((_returnReplacementOperatorHotSpot2335.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (joinedArray));
    }

    public static float[] addAll(final float[] array1, final float... array2) {
        if (array1 == null) {
            return ((_returnReplacementOperatorHotSpot2128.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array2)));
        } else if (array2 == null) {
            return ((_returnReplacementOperatorHotSpot2129.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array1)));
        } 
        final float[] joinedArray = new float[(array1.length) + (array2.length)];
        java.lang.System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        java.lang.System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        return ((_returnReplacementOperatorHotSpot2130.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (joinedArray));
    }

    public static double[] addAll(final double[] array1, final double... array2) {
        if (array1 == null) {
            return ((_returnReplacementOperatorHotSpot2102.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array2)));
        } else if (array2 == null) {
            return ((_returnReplacementOperatorHotSpot2103.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array1)));
        } 
        final double[] joinedArray = new double[(array1.length) + (array2.length)];
        java.lang.System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        java.lang.System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        return ((_returnReplacementOperatorHotSpot2104.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (joinedArray));
    }

    public static <T>T[] add(final T[] array, final T element) {
        java.lang.Class<?> type;
        if (array != null) {
            type = array.getClass().getComponentType();
        } else if (element != null) {
            type = element.getClass();
        } else {
            throw new java.lang.IllegalArgumentException("Arguments cannot both be null");
        }
        @java.lang.SuppressWarnings(value = "unchecked")
        final T[] newArray = ((T[])(org.apache.commons.lang3.ArrayUtils.copyArrayGrow1(array, type)));
        newArray[((newArray.length) - 1)] = element;
        return ((_returnReplacementOperatorHotSpot1935.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (newArray));
    }

    public static boolean[] add(final boolean[] array, final boolean element) {
        final boolean[] newArray = ((boolean[])(org.apache.commons.lang3.ArrayUtils.copyArrayGrow1(array, java.lang.Boolean.TYPE)));
        newArray[((newArray.length) - 1)] = element;
        return ((_returnReplacementOperatorHotSpot2022.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (newArray));
    }

    public static byte[] add(final byte[] array, final byte element) {
        final byte[] newArray = ((byte[])(org.apache.commons.lang3.ArrayUtils.copyArrayGrow1(array, java.lang.Byte.TYPE)));
        newArray[((newArray.length) - 1)] = element;
        return ((_returnReplacementOperatorHotSpot2048.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (newArray));
    }

    public static char[] add(final char[] array, final char element) {
        final char[] newArray = ((char[])(org.apache.commons.lang3.ArrayUtils.copyArrayGrow1(array, java.lang.Character.TYPE)));
        newArray[((newArray.length) - 1)] = element;
        return ((_returnReplacementOperatorHotSpot2074.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (newArray));
    }

    public static double[] add(final double[] array, final double element) {
        final double[] newArray = ((double[])(org.apache.commons.lang3.ArrayUtils.copyArrayGrow1(array, java.lang.Double.TYPE)));
        newArray[((newArray.length) - 1)] = element;
        return ((_returnReplacementOperatorHotSpot2100.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (newArray));
    }

    public static float[] add(final float[] array, final float element) {
        final float[] newArray = ((float[])(org.apache.commons.lang3.ArrayUtils.copyArrayGrow1(array, java.lang.Float.TYPE)));
        newArray[((newArray.length) - 1)] = element;
        return ((_returnReplacementOperatorHotSpot2126.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (newArray));
    }

    public static int[] add(final int[] array, final int element) {
        final int[] newArray = ((int[])(org.apache.commons.lang3.ArrayUtils.copyArrayGrow1(array, java.lang.Integer.TYPE)));
        newArray[((newArray.length) - 1)] = element;
        return ((_returnReplacementOperatorHotSpot2247.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (newArray));
    }

    public static long[] add(final long[] array, final long element) {
        final long[] newArray = ((long[])(org.apache.commons.lang3.ArrayUtils.copyArrayGrow1(array, java.lang.Long.TYPE)));
        newArray[((newArray.length) - 1)] = element;
        return ((_returnReplacementOperatorHotSpot2332.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (newArray));
    }

    public static short[] add(final short[] array, final short element) {
        final short[] newArray = ((short[])(org.apache.commons.lang3.ArrayUtils.copyArrayGrow1(array, java.lang.Short.TYPE)));
        newArray[((newArray.length) - 1)] = element;
        return ((_returnReplacementOperatorHotSpot2358.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (newArray));
    }

    private static java.lang.Object copyArrayGrow1(final java.lang.Object array, final java.lang.Class<?> newArrayComponentType) {
        if (array != null) {
            final int arrayLength = java.lang.reflect.Array.getLength(array);
            final java.lang.Object newArray = java.lang.reflect.Array.newInstance(array.getClass().getComponentType(), (arrayLength + 1));
            java.lang.System.arraycopy(array, 0, newArray, 0, arrayLength);
            return ((_returnReplacementOperatorHotSpot2312.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (newArray));
        } 
        return ((_returnReplacementOperatorHotSpot2313.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.reflect.Array.newInstance(newArrayComponentType, 1)));
    }

    public static <T>T[] add(final T[] array, final int index, final T element) {
        java.lang.Class<?> clss = null;
        if (array != null) {
            clss = array.getClass().getComponentType();
        } else if (element != null) {
            clss = element.getClass();
        } else {
            throw new java.lang.IllegalArgumentException("Array and element cannot both be null");
        }
        @java.lang.SuppressWarnings(value = "unchecked")
        final T[] newArray = ((T[])(org.apache.commons.lang3.ArrayUtils.add(array, index, element, clss)));
        return ((_returnReplacementOperatorHotSpot1936.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (newArray));
    }

    public static boolean[] add(final boolean[] array, final int index, final boolean element) {
        return ((_returnReplacementOperatorHotSpot2023.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((boolean[])(org.apache.commons.lang3.ArrayUtils.add(array, index, java.lang.Boolean.valueOf(element), java.lang.Boolean.TYPE)))));
    }

    public static char[] add(final char[] array, final int index, final char element) {
        return ((_returnReplacementOperatorHotSpot2075.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((char[])(org.apache.commons.lang3.ArrayUtils.add(array, index, java.lang.Character.valueOf(element), java.lang.Character.TYPE)))));
    }

    public static byte[] add(final byte[] array, final int index, final byte element) {
        return ((_returnReplacementOperatorHotSpot2049.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((byte[])(org.apache.commons.lang3.ArrayUtils.add(array, index, java.lang.Byte.valueOf(element), java.lang.Byte.TYPE)))));
    }

    public static short[] add(final short[] array, final int index, final short element) {
        return ((_returnReplacementOperatorHotSpot2357.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((short[])(org.apache.commons.lang3.ArrayUtils.add(array, index, java.lang.Short.valueOf(element), java.lang.Short.TYPE)))));
    }

    public static int[] add(final int[] array, final int index, final int element) {
        return ((_returnReplacementOperatorHotSpot2248.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((int[])(org.apache.commons.lang3.ArrayUtils.add(array, index, java.lang.Integer.valueOf(element), java.lang.Integer.TYPE)))));
    }

    public static long[] add(final long[] array, final int index, final long element) {
        return ((_returnReplacementOperatorHotSpot2331.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((long[])(org.apache.commons.lang3.ArrayUtils.add(array, index, java.lang.Long.valueOf(element), java.lang.Long.TYPE)))));
    }

    public static float[] add(final float[] array, final int index, final float element) {
        return ((_returnReplacementOperatorHotSpot2127.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((float[])(org.apache.commons.lang3.ArrayUtils.add(array, index, java.lang.Float.valueOf(element), java.lang.Float.TYPE)))));
    }

    public static double[] add(final double[] array, final int index, final double element) {
        return ((_returnReplacementOperatorHotSpot2101.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((double[])(org.apache.commons.lang3.ArrayUtils.add(array, index, java.lang.Double.valueOf(element), java.lang.Double.TYPE)))));
    }

    private static java.lang.Object add(final java.lang.Object array, final int index, final java.lang.Object element, final java.lang.Class<?> clss) {
        if (array == null) {
            if (index != 0) {
                throw new java.lang.IndexOutOfBoundsException((("Index: " + index) + ", Length: 0"));
            } 
            final java.lang.Object joinedArray = java.lang.reflect.Array.newInstance(clss, 1);
            java.lang.reflect.Array.set(joinedArray, 0, element);
            return ((_returnReplacementOperatorHotSpot2310.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (joinedArray));
        } 
        final int length = java.lang.reflect.Array.getLength(array);
        if ((index > length) || (index < 0)) {
            throw new java.lang.IndexOutOfBoundsException(((("Index: " + index) + ", Length: ") + length));
        } 
        final java.lang.Object result = java.lang.reflect.Array.newInstance(clss, (length + 1));
        java.lang.System.arraycopy(array, 0, result, 0, index);
        java.lang.reflect.Array.set(result, index, element);
        if (index < length) {
            java.lang.System.arraycopy(array, index, result, (index + 1), (length - index));
        } 
        return ((_returnReplacementOperatorHotSpot2311.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    @java.lang.SuppressWarnings(value = "unchecked")
    public static <T>T[] remove(final T[] array, final int index) {
        return ((_returnReplacementOperatorHotSpot1944.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((T[])(org.apache.commons.lang3.ArrayUtils.remove(((java.lang.Object)(array)), index)))));
    }

    public static <T>T[] removeElement(final T[] array, final java.lang.Object element) {
        final int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperatorHotSpot1948.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        return ((_returnReplacementOperatorHotSpot1949.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.remove(array, index)));
    }

    public static boolean[] remove(final boolean[] array, final int index) {
        return ((_returnReplacementOperatorHotSpot2031.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((boolean[])(org.apache.commons.lang3.ArrayUtils.remove(((java.lang.Object)(array)), index)))));
    }

    public static boolean[] removeElement(final boolean[] array, final boolean element) {
        final int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperatorHotSpot2035.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        return ((_returnReplacementOperatorHotSpot2036.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.remove(array, index)));
    }

    public static byte[] remove(final byte[] array, final int index) {
        return ((_returnReplacementOperatorHotSpot2057.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((byte[])(org.apache.commons.lang3.ArrayUtils.remove(((java.lang.Object)(array)), index)))));
    }

    public static byte[] removeElement(final byte[] array, final byte element) {
        final int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperatorHotSpot2061.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        return ((_returnReplacementOperatorHotSpot2062.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.remove(array, index)));
    }

    public static char[] remove(final char[] array, final int index) {
        return ((_returnReplacementOperatorHotSpot2083.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((char[])(org.apache.commons.lang3.ArrayUtils.remove(((java.lang.Object)(array)), index)))));
    }

    public static char[] removeElement(final char[] array, final char element) {
        final int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperatorHotSpot2087.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        return ((_returnReplacementOperatorHotSpot2088.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.remove(array, index)));
    }

    public static double[] remove(final double[] array, final int index) {
        return ((_returnReplacementOperatorHotSpot2109.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((double[])(org.apache.commons.lang3.ArrayUtils.remove(((java.lang.Object)(array)), index)))));
    }

    public static double[] removeElement(final double[] array, final double element) {
        final int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperatorHotSpot2113.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        return ((_returnReplacementOperatorHotSpot2114.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.remove(array, index)));
    }

    public static float[] remove(final float[] array, final int index) {
        return ((_returnReplacementOperatorHotSpot2135.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((float[])(org.apache.commons.lang3.ArrayUtils.remove(((java.lang.Object)(array)), index)))));
    }

    public static float[] removeElement(final float[] array, final float element) {
        final int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperatorHotSpot2139.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        return ((_returnReplacementOperatorHotSpot2140.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.remove(array, index)));
    }

    public static int[] remove(final int[] array, final int index) {
        return ((_returnReplacementOperatorHotSpot2256.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((int[])(org.apache.commons.lang3.ArrayUtils.remove(((java.lang.Object)(array)), index)))));
    }

    public static int[] removeElement(final int[] array, final int element) {
        final int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperatorHotSpot2260.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        return ((_returnReplacementOperatorHotSpot2261.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.remove(array, index)));
    }

    public static long[] remove(final long[] array, final int index) {
        return ((_returnReplacementOperatorHotSpot2340.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((long[])(org.apache.commons.lang3.ArrayUtils.remove(((java.lang.Object)(array)), index)))));
    }

    public static long[] removeElement(final long[] array, final long element) {
        final int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperatorHotSpot2344.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        return ((_returnReplacementOperatorHotSpot2345.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.remove(array, index)));
    }

    public static short[] remove(final short[] array, final int index) {
        return ((_returnReplacementOperatorHotSpot2366.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((short[])(org.apache.commons.lang3.ArrayUtils.remove(((java.lang.Object)(array)), index)))));
    }

    public static short[] removeElement(final short[] array, final short element) {
        final int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperatorHotSpot2370.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        return ((_returnReplacementOperatorHotSpot2371.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.remove(array, index)));
    }

    private static java.lang.Object remove(final java.lang.Object array, final int index) {
        final int length = org.apache.commons.lang3.ArrayUtils.getLength(array);
        if ((index < 0) || (index >= length)) {
            throw new java.lang.IndexOutOfBoundsException(((("Index: " + index) + ", Length: ") + length));
        } 
        final java.lang.Object result = java.lang.reflect.Array.newInstance(array.getClass().getComponentType(), (length - 1));
        java.lang.System.arraycopy(array, 0, result, 0, index);
        if (index < (length - 1)) {
            java.lang.System.arraycopy(array, (index + 1), result, index, ((length - index) - 1));
        } 
        return ((_returnReplacementOperatorHotSpot2314.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    @java.lang.SuppressWarnings(value = "unchecked")
    public static <T>T[] removeAll(final T[] array, final int... indices) {
        return ((_returnReplacementOperatorHotSpot1945.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((T[])(org.apache.commons.lang3.ArrayUtils.removeAll(((java.lang.Object)(array)), org.apache.commons.lang3.ArrayUtils.clone(indices))))));
    }

    public static <T>T[] removeElements(final T[] array, final T... values) {
        if ((org.apache.commons.lang3.ArrayUtils.isEmpty(array)) || (org.apache.commons.lang3.ArrayUtils.isEmpty(values))) {
            return ((_returnReplacementOperatorHotSpot1950.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        final java.util.HashMap<T, org.apache.commons.lang3.mutable.MutableInt> occurrences = new java.util.HashMap<T, org.apache.commons.lang3.mutable.MutableInt>(values.length);
        for (final T v : values) {
            final org.apache.commons.lang3.mutable.MutableInt count = occurrences.get(v);
            if (count == null) {
                occurrences.put(v, new org.apache.commons.lang3.mutable.MutableInt(1));
            } else {
                count.increment();
            }
        }
        final java.util.BitSet toRemove = new java.util.BitSet();
        for (final java.util.Map.Entry<T, org.apache.commons.lang3.mutable.MutableInt> e : occurrences.entrySet()) {
            final T v = e.getKey();
            int found = 0;
            for (int i = 0, ct = e.getValue().intValue() ; i < ct ; i++) {
                found = org.apache.commons.lang3.ArrayUtils.indexOf(array, v, found);
                if (found < 0) {
                    break;
                } 
                toRemove.set(found++);
            }
        }
        @java.lang.SuppressWarnings(value = "unchecked")
        final T[] result = ((T[])(org.apache.commons.lang3.ArrayUtils.removeAll(array, toRemove)));
        return ((_returnReplacementOperatorHotSpot1951.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static byte[] removeAll(final byte[] array, final int... indices) {
        return ((_returnReplacementOperatorHotSpot2058.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((byte[])(org.apache.commons.lang3.ArrayUtils.removeAll(((java.lang.Object)(array)), org.apache.commons.lang3.ArrayUtils.clone(indices))))));
    }

    public static byte[] removeElements(final byte[] array, final byte... values) {
        if ((org.apache.commons.lang3.ArrayUtils.isEmpty(array)) || (org.apache.commons.lang3.ArrayUtils.isEmpty(values))) {
            return ((_returnReplacementOperatorHotSpot2063.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        final java.util.Map<java.lang.Byte, org.apache.commons.lang3.mutable.MutableInt> occurrences = new java.util.HashMap<java.lang.Byte, org.apache.commons.lang3.mutable.MutableInt>(values.length);
        for (final byte v : values) {
            final java.lang.Byte boxed = java.lang.Byte.valueOf(v);
            final org.apache.commons.lang3.mutable.MutableInt count = occurrences.get(boxed);
            if (count == null) {
                occurrences.put(boxed, new org.apache.commons.lang3.mutable.MutableInt(1));
            } else {
                count.increment();
            }
        }
        final java.util.BitSet toRemove = new java.util.BitSet();
        for (final java.util.Map.Entry<java.lang.Byte, org.apache.commons.lang3.mutable.MutableInt> e : occurrences.entrySet()) {
            final java.lang.Byte v = e.getKey();
            int found = 0;
            for (int i = 0, ct = e.getValue().intValue() ; i < ct ; i++) {
                found = org.apache.commons.lang3.ArrayUtils.indexOf(array, v.byteValue(), found);
                if (found < 0) {
                    break;
                } 
                toRemove.set(found++);
            }
        }
        return ((_returnReplacementOperatorHotSpot2064.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((byte[])(org.apache.commons.lang3.ArrayUtils.removeAll(array, toRemove)))));
    }

    public static short[] removeAll(final short[] array, final int... indices) {
        return ((_returnReplacementOperatorHotSpot2367.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((short[])(org.apache.commons.lang3.ArrayUtils.removeAll(((java.lang.Object)(array)), org.apache.commons.lang3.ArrayUtils.clone(indices))))));
    }

    public static short[] removeElements(final short[] array, final short... values) {
        if ((org.apache.commons.lang3.ArrayUtils.isEmpty(array)) || (org.apache.commons.lang3.ArrayUtils.isEmpty(values))) {
            return ((_returnReplacementOperatorHotSpot2372.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        final java.util.HashMap<java.lang.Short, org.apache.commons.lang3.mutable.MutableInt> occurrences = new java.util.HashMap<java.lang.Short, org.apache.commons.lang3.mutable.MutableInt>(values.length);
        for (final short v : values) {
            final java.lang.Short boxed = java.lang.Short.valueOf(v);
            final org.apache.commons.lang3.mutable.MutableInt count = occurrences.get(boxed);
            if (count == null) {
                occurrences.put(boxed, new org.apache.commons.lang3.mutable.MutableInt(1));
            } else {
                count.increment();
            }
        }
        final java.util.BitSet toRemove = new java.util.BitSet();
        for (final java.util.Map.Entry<java.lang.Short, org.apache.commons.lang3.mutable.MutableInt> e : occurrences.entrySet()) {
            final java.lang.Short v = e.getKey();
            int found = 0;
            for (int i = 0, ct = e.getValue().intValue() ; i < ct ; i++) {
                found = org.apache.commons.lang3.ArrayUtils.indexOf(array, v.shortValue(), found);
                if (found < 0) {
                    break;
                } 
                toRemove.set(found++);
            }
        }
        return ((_returnReplacementOperatorHotSpot2373.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((short[])(org.apache.commons.lang3.ArrayUtils.removeAll(array, toRemove)))));
    }

    public static int[] removeAll(final int[] array, final int... indices) {
        return ((_returnReplacementOperatorHotSpot2257.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((int[])(org.apache.commons.lang3.ArrayUtils.removeAll(((java.lang.Object)(array)), org.apache.commons.lang3.ArrayUtils.clone(indices))))));
    }

    public static int[] removeElements(final int[] array, final int... values) {
        if ((org.apache.commons.lang3.ArrayUtils.isEmpty(array)) || (org.apache.commons.lang3.ArrayUtils.isEmpty(values))) {
            return ((_returnReplacementOperatorHotSpot2262.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        final java.util.HashMap<java.lang.Integer, org.apache.commons.lang3.mutable.MutableInt> occurrences = new java.util.HashMap<java.lang.Integer, org.apache.commons.lang3.mutable.MutableInt>(values.length);
        for (final int v : values) {
            final java.lang.Integer boxed = java.lang.Integer.valueOf(v);
            final org.apache.commons.lang3.mutable.MutableInt count = occurrences.get(boxed);
            if (count == null) {
                occurrences.put(boxed, new org.apache.commons.lang3.mutable.MutableInt(1));
            } else {
                count.increment();
            }
        }
        final java.util.BitSet toRemove = new java.util.BitSet();
        for (final java.util.Map.Entry<java.lang.Integer, org.apache.commons.lang3.mutable.MutableInt> e : occurrences.entrySet()) {
            final java.lang.Integer v = e.getKey();
            int found = 0;
            for (int i = 0, ct = e.getValue().intValue() ; i < ct ; i++) {
                found = org.apache.commons.lang3.ArrayUtils.indexOf(array, v.intValue(), found);
                if (found < 0) {
                    break;
                } 
                toRemove.set(found++);
            }
        }
        return ((_returnReplacementOperatorHotSpot2263.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((int[])(org.apache.commons.lang3.ArrayUtils.removeAll(array, toRemove)))));
    }

    public static char[] removeAll(final char[] array, final int... indices) {
        return ((_returnReplacementOperatorHotSpot2084.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((char[])(org.apache.commons.lang3.ArrayUtils.removeAll(((java.lang.Object)(array)), org.apache.commons.lang3.ArrayUtils.clone(indices))))));
    }

    public static char[] removeElements(final char[] array, final char... values) {
        if ((org.apache.commons.lang3.ArrayUtils.isEmpty(array)) || (org.apache.commons.lang3.ArrayUtils.isEmpty(values))) {
            return ((_returnReplacementOperatorHotSpot2089.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        final java.util.HashMap<java.lang.Character, org.apache.commons.lang3.mutable.MutableInt> occurrences = new java.util.HashMap<java.lang.Character, org.apache.commons.lang3.mutable.MutableInt>(values.length);
        for (final char v : values) {
            final java.lang.Character boxed = java.lang.Character.valueOf(v);
            final org.apache.commons.lang3.mutable.MutableInt count = occurrences.get(boxed);
            if (count == null) {
                occurrences.put(boxed, new org.apache.commons.lang3.mutable.MutableInt(1));
            } else {
                count.increment();
            }
        }
        final java.util.BitSet toRemove = new java.util.BitSet();
        for (final java.util.Map.Entry<java.lang.Character, org.apache.commons.lang3.mutable.MutableInt> e : occurrences.entrySet()) {
            final java.lang.Character v = e.getKey();
            int found = 0;
            for (int i = 0, ct = e.getValue().intValue() ; i < ct ; i++) {
                found = org.apache.commons.lang3.ArrayUtils.indexOf(array, v.charValue(), found);
                if (found < 0) {
                    break;
                } 
                toRemove.set(found++);
            }
        }
        return ((_returnReplacementOperatorHotSpot2090.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((char[])(org.apache.commons.lang3.ArrayUtils.removeAll(array, toRemove)))));
    }

    public static long[] removeAll(final long[] array, final int... indices) {
        return ((_returnReplacementOperatorHotSpot2341.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((long[])(org.apache.commons.lang3.ArrayUtils.removeAll(((java.lang.Object)(array)), org.apache.commons.lang3.ArrayUtils.clone(indices))))));
    }

    public static long[] removeElements(final long[] array, final long... values) {
        if ((org.apache.commons.lang3.ArrayUtils.isEmpty(array)) || (org.apache.commons.lang3.ArrayUtils.isEmpty(values))) {
            return ((_returnReplacementOperatorHotSpot2346.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        final java.util.HashMap<java.lang.Long, org.apache.commons.lang3.mutable.MutableInt> occurrences = new java.util.HashMap<java.lang.Long, org.apache.commons.lang3.mutable.MutableInt>(values.length);
        for (final long v : values) {
            final java.lang.Long boxed = java.lang.Long.valueOf(v);
            final org.apache.commons.lang3.mutable.MutableInt count = occurrences.get(boxed);
            if (count == null) {
                occurrences.put(boxed, new org.apache.commons.lang3.mutable.MutableInt(1));
            } else {
                count.increment();
            }
        }
        final java.util.BitSet toRemove = new java.util.BitSet();
        for (final java.util.Map.Entry<java.lang.Long, org.apache.commons.lang3.mutable.MutableInt> e : occurrences.entrySet()) {
            final java.lang.Long v = e.getKey();
            int found = 0;
            for (int i = 0, ct = e.getValue().intValue() ; i < ct ; i++) {
                found = org.apache.commons.lang3.ArrayUtils.indexOf(array, v.longValue(), found);
                if (found < 0) {
                    break;
                } 
                toRemove.set(found++);
            }
        }
        return ((_returnReplacementOperatorHotSpot2347.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((long[])(org.apache.commons.lang3.ArrayUtils.removeAll(array, toRemove)))));
    }

    public static float[] removeAll(final float[] array, final int... indices) {
        return ((_returnReplacementOperatorHotSpot2136.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((float[])(org.apache.commons.lang3.ArrayUtils.removeAll(((java.lang.Object)(array)), org.apache.commons.lang3.ArrayUtils.clone(indices))))));
    }

    public static float[] removeElements(final float[] array, final float... values) {
        if ((org.apache.commons.lang3.ArrayUtils.isEmpty(array)) || (org.apache.commons.lang3.ArrayUtils.isEmpty(values))) {
            return ((_returnReplacementOperatorHotSpot2141.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        final java.util.HashMap<java.lang.Float, org.apache.commons.lang3.mutable.MutableInt> occurrences = new java.util.HashMap<java.lang.Float, org.apache.commons.lang3.mutable.MutableInt>(values.length);
        for (final float v : values) {
            final java.lang.Float boxed = java.lang.Float.valueOf(v);
            final org.apache.commons.lang3.mutable.MutableInt count = occurrences.get(boxed);
            if (count == null) {
                occurrences.put(boxed, new org.apache.commons.lang3.mutable.MutableInt(1));
            } else {
                count.increment();
            }
        }
        final java.util.BitSet toRemove = new java.util.BitSet();
        for (final java.util.Map.Entry<java.lang.Float, org.apache.commons.lang3.mutable.MutableInt> e : occurrences.entrySet()) {
            final java.lang.Float v = e.getKey();
            int found = 0;
            for (int i = 0, ct = e.getValue().intValue() ; i < ct ; i++) {
                found = org.apache.commons.lang3.ArrayUtils.indexOf(array, v.floatValue(), found);
                if (found < 0) {
                    break;
                } 
                toRemove.set(found++);
            }
        }
        return ((_returnReplacementOperatorHotSpot2142.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((float[])(org.apache.commons.lang3.ArrayUtils.removeAll(array, toRemove)))));
    }

    public static double[] removeAll(final double[] array, final int... indices) {
        return ((_returnReplacementOperatorHotSpot2110.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((double[])(org.apache.commons.lang3.ArrayUtils.removeAll(((java.lang.Object)(array)), org.apache.commons.lang3.ArrayUtils.clone(indices))))));
    }

    public static double[] removeElements(final double[] array, final double... values) {
        if ((org.apache.commons.lang3.ArrayUtils.isEmpty(array)) || (org.apache.commons.lang3.ArrayUtils.isEmpty(values))) {
            return ((_returnReplacementOperatorHotSpot2115.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        final java.util.HashMap<java.lang.Double, org.apache.commons.lang3.mutable.MutableInt> occurrences = new java.util.HashMap<java.lang.Double, org.apache.commons.lang3.mutable.MutableInt>(values.length);
        for (final double v : values) {
            final java.lang.Double boxed = java.lang.Double.valueOf(v);
            final org.apache.commons.lang3.mutable.MutableInt count = occurrences.get(boxed);
            if (count == null) {
                occurrences.put(boxed, new org.apache.commons.lang3.mutable.MutableInt(1));
            } else {
                count.increment();
            }
        }
        final java.util.BitSet toRemove = new java.util.BitSet();
        for (final java.util.Map.Entry<java.lang.Double, org.apache.commons.lang3.mutable.MutableInt> e : occurrences.entrySet()) {
            final java.lang.Double v = e.getKey();
            int found = 0;
            for (int i = 0, ct = e.getValue().intValue() ; i < ct ; i++) {
                found = org.apache.commons.lang3.ArrayUtils.indexOf(array, v.doubleValue(), found);
                if (found < 0) {
                    break;
                } 
                toRemove.set(found++);
            }
        }
        return ((_returnReplacementOperatorHotSpot2116.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((double[])(org.apache.commons.lang3.ArrayUtils.removeAll(array, toRemove)))));
    }

    public static boolean[] removeAll(final boolean[] array, final int... indices) {
        return ((_returnReplacementOperatorHotSpot2032.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((boolean[])(org.apache.commons.lang3.ArrayUtils.removeAll(((java.lang.Object)(array)), org.apache.commons.lang3.ArrayUtils.clone(indices))))));
    }

    public static boolean[] removeElements(final boolean[] array, final boolean... values) {
        if ((org.apache.commons.lang3.ArrayUtils.isEmpty(array)) || (org.apache.commons.lang3.ArrayUtils.isEmpty(values))) {
            return ((_returnReplacementOperatorHotSpot2037.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        final java.util.HashMap<java.lang.Boolean, org.apache.commons.lang3.mutable.MutableInt> occurrences = new java.util.HashMap<java.lang.Boolean, org.apache.commons.lang3.mutable.MutableInt>(2);
        for (final boolean v : values) {
            final java.lang.Boolean boxed = java.lang.Boolean.valueOf(v);
            final org.apache.commons.lang3.mutable.MutableInt count = occurrences.get(boxed);
            if (count == null) {
                occurrences.put(boxed, new org.apache.commons.lang3.mutable.MutableInt(1));
            } else {
                count.increment();
            }
        }
        final java.util.BitSet toRemove = new java.util.BitSet();
        for (final java.util.Map.Entry<java.lang.Boolean, org.apache.commons.lang3.mutable.MutableInt> e : occurrences.entrySet()) {
            final java.lang.Boolean v = e.getKey();
            int found = 0;
            for (int i = 0, ct = e.getValue().intValue() ; i < ct ; i++) {
                found = org.apache.commons.lang3.ArrayUtils.indexOf(array, v.booleanValue(), found);
                if (found < 0) {
                    break;
                } 
                toRemove.set(found++);
            }
        }
        return ((_returnReplacementOperatorHotSpot2038.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((boolean[])(org.apache.commons.lang3.ArrayUtils.removeAll(array, toRemove)))));
    }

    static java.lang.Object removeAll(final java.lang.Object array, final int... indices) {
        final int length = org.apache.commons.lang3.ArrayUtils.getLength(array);
        int diff = 0;
        if (org.apache.commons.lang3.ArrayUtils.isNotEmpty(indices)) {
            java.util.Arrays.sort(indices);
            int i = indices.length;
            int prevIndex = length;
            while ((--i) >= 0) {
                final int index = indices[i];
                if ((index < 0) || (index >= length)) {
                    throw new java.lang.IndexOutOfBoundsException(((("Index: " + index) + ", Length: ") + length));
                } 
                if (index >= prevIndex) {
                    continue;
                } 
                diff++;
                prevIndex = index;
            }
        } 
        final java.lang.Object result = java.lang.reflect.Array.newInstance(array.getClass().getComponentType(), (length - diff));
        if (diff < length) {
            int end = length;
            int dest = length - diff;
            for (int i = (indices.length) - 1 ; i >= 0 ; i--) {
                final int index = indices[i];
                if ((end - index) > 1) {
                    final int cp = (end - index) - 1;
                    dest -= cp;
                    java.lang.System.arraycopy(array, (index + 1), result, dest, cp);
                } 
                end = index;
            }
            if (end > 0) {
                java.lang.System.arraycopy(array, 0, result, 0, end);
            } 
        } 
        return ((_returnReplacementOperatorHotSpot2315.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    static java.lang.Object removeAll(final java.lang.Object array, final java.util.BitSet indices) {
        final int srcLength = org.apache.commons.lang3.ArrayUtils.getLength(array);
        final int removals = indices.cardinality();
        final java.lang.Object result = java.lang.reflect.Array.newInstance(array.getClass().getComponentType(), (srcLength - removals));
        int srcIndex = 0;
        int destIndex = 0;
        int count;
        int set;
        while ((set = indices.nextSetBit(srcIndex)) != (-1)) {
            count = set - srcIndex;
            if (count > 0) {
                java.lang.System.arraycopy(array, srcIndex, result, destIndex, count);
                destIndex += count;
            } 
            srcIndex = indices.nextClearBit(set);
        }
        count = srcLength - srcIndex;
        if (count > 0) {
            java.lang.System.arraycopy(array, srcIndex, result, destIndex, count);
        } 
        return ((_returnReplacementOperatorHotSpot2316.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static <T extends java.lang.Comparable<? super T>>boolean isSorted(final T[] array) {
        return ((_returnReplacementOperatorHotSpot1934.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.isSorted(array, new java.util.Comparator<T>() {
    @java.lang.Override
    public int compare(T o1, T o2) {
        return ((_returnReplacementOperatorHotSpot1933.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1933.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1933.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (o1.compareTo(o2)));
    }
})));
    }

    public static <T>boolean isSorted(final T[] array, final java.util.Comparator<T> comparator) {
        if (comparator == null) {
            throw new java.lang.IllegalArgumentException("Comparator should not be null.");
        } 
        if ((array == null) || ((array.length) < 2)) {
            return ((_returnReplacementOperatorHotSpot1957.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        T previous = array[0];
        final int n = array.length;
        for (int i = 1 ; i < n ; i++) {
            final T current = array[i];
            if ((comparator.compare(previous, current)) > 0) {
                return ((_returnReplacementOperatorHotSpot1958.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
            previous = current;
        }
        return ((_returnReplacementOperatorHotSpot1959.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
    }

    public static boolean isSorted(int[] array) {
        if ((array == null) || ((array.length) < 2)) {
            return ((_returnReplacementOperatorHotSpot2013.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        int previous = array[0];
        final int n = array.length;
        for (int i = 1 ; i < n ; i++) {
            final int current = array[i];
            if ((org.apache.commons.lang3.math.NumberUtils.compare(previous, current)) > 0) {
                return ((_returnReplacementOperatorHotSpot2014.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
            previous = current;
        }
        return ((_returnReplacementOperatorHotSpot2015.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
    }

    public static boolean isSorted(long[] array) {
        if ((array == null) || ((array.length) < 2)) {
            return ((_returnReplacementOperatorHotSpot2016.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        long previous = array[0];
        final int n = array.length;
        for (int i = 1 ; i < n ; i++) {
            final long current = array[i];
            if ((org.apache.commons.lang3.math.NumberUtils.compare(previous, current)) > 0) {
                return ((_returnReplacementOperatorHotSpot2017.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
            previous = current;
        }
        return ((_returnReplacementOperatorHotSpot2018.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
    }

    public static boolean isSorted(short[] array) {
        if ((array == null) || ((array.length) < 2)) {
            return ((_returnReplacementOperatorHotSpot2019.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        short previous = array[0];
        final int n = array.length;
        for (int i = 1 ; i < n ; i++) {
            final short current = array[i];
            if ((org.apache.commons.lang3.math.NumberUtils.compare(previous, current)) > 0) {
                return ((_returnReplacementOperatorHotSpot2020.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
            previous = current;
        }
        return ((_returnReplacementOperatorHotSpot2021.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
    }

    public static boolean isSorted(final double[] array) {
        if ((array == null) || ((array.length) < 2)) {
            return ((_returnReplacementOperatorHotSpot2007.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        double previous = array[0];
        final int n = array.length;
        for (int i = 1 ; i < n ; i++) {
            final double current = array[i];
            if ((java.lang.Double.compare(previous, current)) > 0) {
                return ((_returnReplacementOperatorHotSpot2008.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
            previous = current;
        }
        return ((_returnReplacementOperatorHotSpot2009.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
    }

    public static boolean isSorted(final float[] array) {
        if ((array == null) || ((array.length) < 2)) {
            return ((_returnReplacementOperatorHotSpot2010.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        float previous = array[0];
        final int n = array.length;
        for (int i = 1 ; i < n ; i++) {
            final float current = array[i];
            if ((java.lang.Float.compare(previous, current)) > 0) {
                return ((_returnReplacementOperatorHotSpot2011.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
            previous = current;
        }
        return ((_returnReplacementOperatorHotSpot2012.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
    }

    public static boolean isSorted(byte[] array) {
        if ((array == null) || ((array.length) < 2)) {
            return ((_returnReplacementOperatorHotSpot2001.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        byte previous = array[0];
        final int n = array.length;
        for (int i = 1 ; i < n ; i++) {
            final byte current = array[i];
            if ((org.apache.commons.lang3.math.NumberUtils.compare(previous, current)) > 0) {
                return ((_returnReplacementOperatorHotSpot2002.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
            previous = current;
        }
        return ((_returnReplacementOperatorHotSpot2003.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
    }

    public static boolean isSorted(char[] array) {
        if ((array == null) || ((array.length) < 2)) {
            return ((_returnReplacementOperatorHotSpot2004.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        char previous = array[0];
        final int n = array.length;
        for (int i = 1 ; i < n ; i++) {
            final char current = array[i];
            if ((org.apache.commons.lang3.CharUtils.compare(previous, current)) > 0) {
                return ((_returnReplacementOperatorHotSpot2005.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
            previous = current;
        }
        return ((_returnReplacementOperatorHotSpot2006.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
    }

    public static boolean isSorted(boolean[] array) {
        if ((array == null) || ((array.length) < 2)) {
            return ((_returnReplacementOperatorHotSpot1998.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        boolean previous = array[0];
        final int n = array.length;
        for (int i = 1 ; i < n ; i++) {
            final boolean current = array[i];
            if ((org.apache.commons.lang3.BooleanUtils.compare(previous, current)) > 0) {
                return ((_returnReplacementOperatorHotSpot1999.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
            previous = current;
        }
        return ((_returnReplacementOperatorHotSpot2000.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
    }

    public static boolean[] removeAllOccurences(final boolean[] array, final boolean element) {
        int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperatorHotSpot2033.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        int[] indices = new int[(array.length) - index];
        indices[0] = index;
        int count = 1;
        while ((index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element, ((indices[(count - 1)]) + 1))) != (INDEX_NOT_FOUND)) {
            indices[count++] = index;
        }
        return ((_returnReplacementOperatorHotSpot2034.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.removeAll(array, java.util.Arrays.copyOf(indices, count))));
    }

    public static char[] removeAllOccurences(final char[] array, final char element) {
        int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperatorHotSpot2085.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        int[] indices = new int[(array.length) - index];
        indices[0] = index;
        int count = 1;
        while ((index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element, ((indices[(count - 1)]) + 1))) != (INDEX_NOT_FOUND)) {
            indices[count++] = index;
        }
        return ((_returnReplacementOperatorHotSpot2086.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.removeAll(array, java.util.Arrays.copyOf(indices, count))));
    }

    public static byte[] removeAllOccurences(final byte[] array, final byte element) {
        int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperatorHotSpot2059.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        int[] indices = new int[(array.length) - index];
        indices[0] = index;
        int count = 1;
        while ((index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element, ((indices[(count - 1)]) + 1))) != (INDEX_NOT_FOUND)) {
            indices[count++] = index;
        }
        return ((_returnReplacementOperatorHotSpot2060.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.removeAll(array, java.util.Arrays.copyOf(indices, count))));
    }

    public static short[] removeAllOccurences(final short[] array, final short element) {
        int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperatorHotSpot2368.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        int[] indices = new int[(array.length) - index];
        indices[0] = index;
        int count = 1;
        while ((index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element, ((indices[(count - 1)]) + 1))) != (INDEX_NOT_FOUND)) {
            indices[count++] = index;
        }
        return ((_returnReplacementOperatorHotSpot2369.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.removeAll(array, java.util.Arrays.copyOf(indices, count))));
    }

    public static int[] removeAllOccurences(final int[] array, final int element) {
        int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperatorHotSpot2258.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        int[] indices = new int[(array.length) - index];
        indices[0] = index;
        int count = 1;
        while ((index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element, ((indices[(count - 1)]) + 1))) != (INDEX_NOT_FOUND)) {
            indices[count++] = index;
        }
        return ((_returnReplacementOperatorHotSpot2259.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.removeAll(array, java.util.Arrays.copyOf(indices, count))));
    }

    public static long[] removeAllOccurences(final long[] array, final long element) {
        int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperatorHotSpot2342.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        int[] indices = new int[(array.length) - index];
        indices[0] = index;
        int count = 1;
        while ((index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element, ((indices[(count - 1)]) + 1))) != (INDEX_NOT_FOUND)) {
            indices[count++] = index;
        }
        return ((_returnReplacementOperatorHotSpot2343.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.removeAll(array, java.util.Arrays.copyOf(indices, count))));
    }

    public static float[] removeAllOccurences(final float[] array, final float element) {
        int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperatorHotSpot2137.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        int[] indices = new int[(array.length) - index];
        indices[0] = index;
        int count = 1;
        while ((index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element, ((indices[(count - 1)]) + 1))) != (INDEX_NOT_FOUND)) {
            indices[count++] = index;
        }
        return ((_returnReplacementOperatorHotSpot2138.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.removeAll(array, java.util.Arrays.copyOf(indices, count))));
    }

    public static double[] removeAllOccurences(final double[] array, final double element) {
        int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperatorHotSpot2111.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        int[] indices = new int[(array.length) - index];
        indices[0] = index;
        int count = 1;
        while ((index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element, ((indices[(count - 1)]) + 1))) != (INDEX_NOT_FOUND)) {
            indices[count++] = index;
        }
        return ((_returnReplacementOperatorHotSpot2112.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.removeAll(array, java.util.Arrays.copyOf(indices, count))));
    }

    public static <T>T[] removeAllOccurences(final T[] array, final T element) {
        int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperatorHotSpot1946.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        int[] indices = new int[(array.length) - index];
        indices[0] = index;
        int count = 1;
        while ((index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element, ((indices[(count - 1)]) + 1))) != (INDEX_NOT_FOUND)) {
            indices[count++] = index;
        }
        return ((_returnReplacementOperatorHotSpot1947.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.removeAll(array, java.util.Arrays.copyOf(indices, count))));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1933 = metamutator.Selector.of(1933,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot1933");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1934 = metamutator.Selector.of(1934,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1934");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1935 = metamutator.Selector.of(1935,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1935");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1936 = metamutator.Selector.of(1936,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1936");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1937 = metamutator.Selector.of(1937,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1937");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1938 = metamutator.Selector.of(1938,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1938");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1939 = metamutator.Selector.of(1939,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1939");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1940 = metamutator.Selector.of(1940,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1940");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1941 = metamutator.Selector.of(1941,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1941");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1942 = metamutator.Selector.of(1942,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1942");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1943 = metamutator.Selector.of(1943,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1943");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1944 = metamutator.Selector.of(1944,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1944");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1945 = metamutator.Selector.of(1945,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1945");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1946 = metamutator.Selector.of(1946,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1946");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1947 = metamutator.Selector.of(1947,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1947");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1948 = metamutator.Selector.of(1948,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1948");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1949 = metamutator.Selector.of(1949,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1949");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1950 = metamutator.Selector.of(1950,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1950");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1951 = metamutator.Selector.of(1951,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1951");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1952 = metamutator.Selector.of(1952,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1952");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1953 = metamutator.Selector.of(1953,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1953");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1954 = metamutator.Selector.of(1954,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1954");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1955 = metamutator.Selector.of(1955,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1955");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1956 = metamutator.Selector.of(1956,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1956");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1957 = metamutator.Selector.of(1957,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1957");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1958 = metamutator.Selector.of(1958,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1958");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1959 = metamutator.Selector.of(1959,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1959");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1960 = metamutator.Selector.of(1960,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1960");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1961 = metamutator.Selector.of(1961,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1961");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1962 = metamutator.Selector.of(1962,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1962");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1963 = metamutator.Selector.of(1963,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1963");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1964 = metamutator.Selector.of(1964,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1964");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1965 = metamutator.Selector.of(1965,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1965");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1966 = metamutator.Selector.of(1966,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1966");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1967 = metamutator.Selector.of(1967,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1967");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1968 = metamutator.Selector.of(1968,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1968");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1969 = metamutator.Selector.of(1969,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1969");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1970 = metamutator.Selector.of(1970,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1970");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1971 = metamutator.Selector.of(1971,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1971");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1972 = metamutator.Selector.of(1972,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1972");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1973 = metamutator.Selector.of(1973,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1973");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1974 = metamutator.Selector.of(1974,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1974");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1975 = metamutator.Selector.of(1975,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1975");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1976 = metamutator.Selector.of(1976,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1976");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1977 = metamutator.Selector.of(1977,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1977");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1978 = metamutator.Selector.of(1978,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1978");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1979 = metamutator.Selector.of(1979,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1979");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1980 = metamutator.Selector.of(1980,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1980");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1981 = metamutator.Selector.of(1981,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1981");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1982 = metamutator.Selector.of(1982,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1982");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1983 = metamutator.Selector.of(1983,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1983");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1984 = metamutator.Selector.of(1984,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1984");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1985 = metamutator.Selector.of(1985,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1985");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1986 = metamutator.Selector.of(1986,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1986");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1987 = metamutator.Selector.of(1987,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1987");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1988 = metamutator.Selector.of(1988,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1988");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1989 = metamutator.Selector.of(1989,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1989");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1990 = metamutator.Selector.of(1990,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1990");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1991 = metamutator.Selector.of(1991,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1991");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1992 = metamutator.Selector.of(1992,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1992");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1993 = metamutator.Selector.of(1993,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1993");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1994 = metamutator.Selector.of(1994,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1994");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1995 = metamutator.Selector.of(1995,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1995");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1996 = metamutator.Selector.of(1996,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1996");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1997 = metamutator.Selector.of(1997,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1997");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1998 = metamutator.Selector.of(1998,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1998");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1999 = metamutator.Selector.of(1999,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot1999");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2000 = metamutator.Selector.of(2000,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2000");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2001 = metamutator.Selector.of(2001,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2001");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2002 = metamutator.Selector.of(2002,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2002");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2003 = metamutator.Selector.of(2003,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2003");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2004 = metamutator.Selector.of(2004,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2004");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2005 = metamutator.Selector.of(2005,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2005");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2006 = metamutator.Selector.of(2006,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2006");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2007 = metamutator.Selector.of(2007,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2007");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2008 = metamutator.Selector.of(2008,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2008");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2009 = metamutator.Selector.of(2009,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2009");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2010 = metamutator.Selector.of(2010,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2010");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2011 = metamutator.Selector.of(2011,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2011");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2012 = metamutator.Selector.of(2012,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2012");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2013 = metamutator.Selector.of(2013,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2013");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2014 = metamutator.Selector.of(2014,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2014");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2015 = metamutator.Selector.of(2015,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2015");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2016 = metamutator.Selector.of(2016,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2016");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2017 = metamutator.Selector.of(2017,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2017");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2018 = metamutator.Selector.of(2018,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2018");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2019 = metamutator.Selector.of(2019,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2019");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2020 = metamutator.Selector.of(2020,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2020");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2021 = metamutator.Selector.of(2021,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2021");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2022 = metamutator.Selector.of(2022,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2022");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2023 = metamutator.Selector.of(2023,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2023");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2024 = metamutator.Selector.of(2024,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2024");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2025 = metamutator.Selector.of(2025,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2025");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2026 = metamutator.Selector.of(2026,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2026");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2027 = metamutator.Selector.of(2027,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2027");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2028 = metamutator.Selector.of(2028,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2028");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2029 = metamutator.Selector.of(2029,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2029");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2030 = metamutator.Selector.of(2030,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2030");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2031 = metamutator.Selector.of(2031,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2031");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2032 = metamutator.Selector.of(2032,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2032");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2033 = metamutator.Selector.of(2033,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2033");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2034 = metamutator.Selector.of(2034,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2034");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2035 = metamutator.Selector.of(2035,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2035");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2036 = metamutator.Selector.of(2036,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2036");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2037 = metamutator.Selector.of(2037,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2037");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2038 = metamutator.Selector.of(2038,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2038");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2039 = metamutator.Selector.of(2039,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2039");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2040 = metamutator.Selector.of(2040,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2040");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2041 = metamutator.Selector.of(2041,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2041");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2042 = metamutator.Selector.of(2042,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2042");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2043 = metamutator.Selector.of(2043,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2043");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2044 = metamutator.Selector.of(2044,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2044");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2045 = metamutator.Selector.of(2045,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2045");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2046 = metamutator.Selector.of(2046,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2046");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2047 = metamutator.Selector.of(2047,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2047");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2048 = metamutator.Selector.of(2048,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2048");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2049 = metamutator.Selector.of(2049,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2049");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2050 = metamutator.Selector.of(2050,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2050");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2051 = metamutator.Selector.of(2051,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2051");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2052 = metamutator.Selector.of(2052,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2052");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2053 = metamutator.Selector.of(2053,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2053");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2054 = metamutator.Selector.of(2054,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2054");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2055 = metamutator.Selector.of(2055,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2055");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2056 = metamutator.Selector.of(2056,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2056");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2057 = metamutator.Selector.of(2057,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2057");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2058 = metamutator.Selector.of(2058,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2058");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2059 = metamutator.Selector.of(2059,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2059");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2060 = metamutator.Selector.of(2060,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2060");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2061 = metamutator.Selector.of(2061,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2061");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2062 = metamutator.Selector.of(2062,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2062");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2063 = metamutator.Selector.of(2063,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2063");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2064 = metamutator.Selector.of(2064,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2064");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2065 = metamutator.Selector.of(2065,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2065");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2066 = metamutator.Selector.of(2066,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2066");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2067 = metamutator.Selector.of(2067,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2067");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2068 = metamutator.Selector.of(2068,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2068");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2069 = metamutator.Selector.of(2069,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2069");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2070 = metamutator.Selector.of(2070,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2070");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2071 = metamutator.Selector.of(2071,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2071");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2072 = metamutator.Selector.of(2072,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2072");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2073 = metamutator.Selector.of(2073,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2073");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2074 = metamutator.Selector.of(2074,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2074");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2075 = metamutator.Selector.of(2075,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2075");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2076 = metamutator.Selector.of(2076,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2076");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2077 = metamutator.Selector.of(2077,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2077");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2078 = metamutator.Selector.of(2078,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2078");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2079 = metamutator.Selector.of(2079,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2079");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2080 = metamutator.Selector.of(2080,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2080");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2081 = metamutator.Selector.of(2081,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2081");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2082 = metamutator.Selector.of(2082,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2082");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2083 = metamutator.Selector.of(2083,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2083");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2084 = metamutator.Selector.of(2084,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2084");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2085 = metamutator.Selector.of(2085,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2085");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2086 = metamutator.Selector.of(2086,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2086");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2087 = metamutator.Selector.of(2087,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2087");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2088 = metamutator.Selector.of(2088,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2088");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2089 = metamutator.Selector.of(2089,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2089");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2090 = metamutator.Selector.of(2090,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2090");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2091 = metamutator.Selector.of(2091,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2091");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2092 = metamutator.Selector.of(2092,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2092");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2093 = metamutator.Selector.of(2093,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2093");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2094 = metamutator.Selector.of(2094,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2094");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2095 = metamutator.Selector.of(2095,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2095");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2096 = metamutator.Selector.of(2096,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2096");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2097 = metamutator.Selector.of(2097,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2097");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2098 = metamutator.Selector.of(2098,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2098");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2099 = metamutator.Selector.of(2099,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2099");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2100 = metamutator.Selector.of(2100,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2100");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2101 = metamutator.Selector.of(2101,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2101");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2102 = metamutator.Selector.of(2102,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2102");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2103 = metamutator.Selector.of(2103,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2103");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2104 = metamutator.Selector.of(2104,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2104");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2105 = metamutator.Selector.of(2105,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2105");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2106 = metamutator.Selector.of(2106,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2106");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2107 = metamutator.Selector.of(2107,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2107");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2108 = metamutator.Selector.of(2108,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2108");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2109 = metamutator.Selector.of(2109,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2109");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2110 = metamutator.Selector.of(2110,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2110");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2111 = metamutator.Selector.of(2111,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2111");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2112 = metamutator.Selector.of(2112,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2112");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2113 = metamutator.Selector.of(2113,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2113");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2114 = metamutator.Selector.of(2114,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2114");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2115 = metamutator.Selector.of(2115,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2115");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2116 = metamutator.Selector.of(2116,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2116");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2117 = metamutator.Selector.of(2117,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2117");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2118 = metamutator.Selector.of(2118,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2118");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2119 = metamutator.Selector.of(2119,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2119");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2120 = metamutator.Selector.of(2120,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2120");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2121 = metamutator.Selector.of(2121,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2121");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2122 = metamutator.Selector.of(2122,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2122");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2123 = metamutator.Selector.of(2123,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2123");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2124 = metamutator.Selector.of(2124,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2124");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2125 = metamutator.Selector.of(2125,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2125");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2126 = metamutator.Selector.of(2126,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2126");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2127 = metamutator.Selector.of(2127,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2127");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2128 = metamutator.Selector.of(2128,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2128");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2129 = metamutator.Selector.of(2129,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2129");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2130 = metamutator.Selector.of(2130,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2130");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2131 = metamutator.Selector.of(2131,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2131");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2132 = metamutator.Selector.of(2132,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2132");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2133 = metamutator.Selector.of(2133,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2133");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2134 = metamutator.Selector.of(2134,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2134");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2135 = metamutator.Selector.of(2135,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2135");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2136 = metamutator.Selector.of(2136,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2136");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2137 = metamutator.Selector.of(2137,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2137");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2138 = metamutator.Selector.of(2138,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2138");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2139 = metamutator.Selector.of(2139,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2139");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2140 = metamutator.Selector.of(2140,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2140");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2141 = metamutator.Selector.of(2141,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2141");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2142 = metamutator.Selector.of(2142,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2142");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2143 = metamutator.Selector.of(2143,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2143");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2144 = metamutator.Selector.of(2144,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2144");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2145 = metamutator.Selector.of(2145,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2145");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2146 = metamutator.Selector.of(2146,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2146");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2147 = metamutator.Selector.of(2147,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2147");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2148 = metamutator.Selector.of(2148,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2148");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2149 = metamutator.Selector.of(2149,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2149");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2150 = metamutator.Selector.of(2150,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2150");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2151 = metamutator.Selector.of(2151,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2151");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2152 = metamutator.Selector.of(2152,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2152");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2153 = metamutator.Selector.of(2153,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2153");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2154 = metamutator.Selector.of(2154,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2154");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2155 = metamutator.Selector.of(2155,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2155");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2156 = metamutator.Selector.of(2156,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2156");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2157 = metamutator.Selector.of(2157,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2157");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2158 = metamutator.Selector.of(2158,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2158");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2159 = metamutator.Selector.of(2159,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2159");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2160 = metamutator.Selector.of(2160,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2160");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2161 = metamutator.Selector.of(2161,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2161");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2162 = metamutator.Selector.of(2162,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2162");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2163 = metamutator.Selector.of(2163,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2163");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2164 = metamutator.Selector.of(2164,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2164");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2165 = metamutator.Selector.of(2165,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2165");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2166 = metamutator.Selector.of(2166,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2166");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2167 = metamutator.Selector.of(2167,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2167");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2168 = metamutator.Selector.of(2168,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2168");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2169 = metamutator.Selector.of(2169,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2169");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2170 = metamutator.Selector.of(2170,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2170");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2171 = metamutator.Selector.of(2171,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2171");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2172 = metamutator.Selector.of(2172,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2172");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2173 = metamutator.Selector.of(2173,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2173");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2174 = metamutator.Selector.of(2174,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2174");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2175 = metamutator.Selector.of(2175,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2175");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2176 = metamutator.Selector.of(2176,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2176");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2177 = metamutator.Selector.of(2177,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2177");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2178 = metamutator.Selector.of(2178,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2178");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2179 = metamutator.Selector.of(2179,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2179");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2180 = metamutator.Selector.of(2180,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2180");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2181 = metamutator.Selector.of(2181,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2181");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2182 = metamutator.Selector.of(2182,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2182");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2183 = metamutator.Selector.of(2183,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2183");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2184 = metamutator.Selector.of(2184,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2184");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2185 = metamutator.Selector.of(2185,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2185");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2186 = metamutator.Selector.of(2186,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2186");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2187 = metamutator.Selector.of(2187,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2187");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2188 = metamutator.Selector.of(2188,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2188");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2189 = metamutator.Selector.of(2189,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2189");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2190 = metamutator.Selector.of(2190,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2190");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2191 = metamutator.Selector.of(2191,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2191");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2192 = metamutator.Selector.of(2192,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2192");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2193 = metamutator.Selector.of(2193,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2193");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2194 = metamutator.Selector.of(2194,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2194");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2195 = metamutator.Selector.of(2195,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2195");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2196 = metamutator.Selector.of(2196,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2196");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2197 = metamutator.Selector.of(2197,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2197");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2198 = metamutator.Selector.of(2198,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2198");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2199 = metamutator.Selector.of(2199,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2199");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2200 = metamutator.Selector.of(2200,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2200");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2201 = metamutator.Selector.of(2201,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2201");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2202 = metamutator.Selector.of(2202,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2202");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2203 = metamutator.Selector.of(2203,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2203");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2204 = metamutator.Selector.of(2204,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2204");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2205 = metamutator.Selector.of(2205,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2205");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2206 = metamutator.Selector.of(2206,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2206");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2207 = metamutator.Selector.of(2207,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2207");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2208 = metamutator.Selector.of(2208,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2208");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2209 = metamutator.Selector.of(2209,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2209");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2210 = metamutator.Selector.of(2210,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2210");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2211 = metamutator.Selector.of(2211,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2211");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2212 = metamutator.Selector.of(2212,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2212");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2213 = metamutator.Selector.of(2213,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2213");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2214 = metamutator.Selector.of(2214,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2214");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2215 = metamutator.Selector.of(2215,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2215");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2216 = metamutator.Selector.of(2216,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2216");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2217 = metamutator.Selector.of(2217,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2217");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2218 = metamutator.Selector.of(2218,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2218");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2219 = metamutator.Selector.of(2219,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2219");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2220 = metamutator.Selector.of(2220,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2220");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2221 = metamutator.Selector.of(2221,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2221");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2222 = metamutator.Selector.of(2222,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2222");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2223 = metamutator.Selector.of(2223,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2223");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2224 = metamutator.Selector.of(2224,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2224");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2225 = metamutator.Selector.of(2225,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2225");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2226 = metamutator.Selector.of(2226,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2226");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2227 = metamutator.Selector.of(2227,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2227");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2228 = metamutator.Selector.of(2228,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2228");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2229 = metamutator.Selector.of(2229,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2229");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2230 = metamutator.Selector.of(2230,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2230");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2231 = metamutator.Selector.of(2231,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2231");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2232 = metamutator.Selector.of(2232,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2232");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2233 = metamutator.Selector.of(2233,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2233");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2234 = metamutator.Selector.of(2234,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2234");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2235 = metamutator.Selector.of(2235,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2235");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2236 = metamutator.Selector.of(2236,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2236");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2237 = metamutator.Selector.of(2237,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2237");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2238 = metamutator.Selector.of(2238,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2238");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2239 = metamutator.Selector.of(2239,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2239");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2240 = metamutator.Selector.of(2240,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2240");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2241 = metamutator.Selector.of(2241,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2241");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2242 = metamutator.Selector.of(2242,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2242");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2243 = metamutator.Selector.of(2243,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2243");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2244 = metamutator.Selector.of(2244,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2244");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2245 = metamutator.Selector.of(2245,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2245");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2246 = metamutator.Selector.of(2246,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2246");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2247 = metamutator.Selector.of(2247,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2247");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2248 = metamutator.Selector.of(2248,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2248");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2249 = metamutator.Selector.of(2249,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2249");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2250 = metamutator.Selector.of(2250,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2250");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2251 = metamutator.Selector.of(2251,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2251");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2252 = metamutator.Selector.of(2252,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2252");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2253 = metamutator.Selector.of(2253,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2253");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2254 = metamutator.Selector.of(2254,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2254");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2255 = metamutator.Selector.of(2255,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2255");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2256 = metamutator.Selector.of(2256,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2256");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2257 = metamutator.Selector.of(2257,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2257");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2258 = metamutator.Selector.of(2258,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2258");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2259 = metamutator.Selector.of(2259,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2259");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2260 = metamutator.Selector.of(2260,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2260");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2261 = metamutator.Selector.of(2261,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2261");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2262 = metamutator.Selector.of(2262,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2262");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2263 = metamutator.Selector.of(2263,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2263");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2264 = metamutator.Selector.of(2264,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2264");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2265 = metamutator.Selector.of(2265,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2265");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2266 = metamutator.Selector.of(2266,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2266");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2267 = metamutator.Selector.of(2267,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2267");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2268 = metamutator.Selector.of(2268,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2268");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2269 = metamutator.Selector.of(2269,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2269");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2270 = metamutator.Selector.of(2270,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2270");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2271 = metamutator.Selector.of(2271,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2271");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2272 = metamutator.Selector.of(2272,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2272");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2273 = metamutator.Selector.of(2273,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2273");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2274 = metamutator.Selector.of(2274,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2274");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2275 = metamutator.Selector.of(2275,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2275");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2276 = metamutator.Selector.of(2276,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2276");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2277 = metamutator.Selector.of(2277,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2277");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2278 = metamutator.Selector.of(2278,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2278");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2279 = metamutator.Selector.of(2279,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2279");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2280 = metamutator.Selector.of(2280,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2280");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2281 = metamutator.Selector.of(2281,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2281");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2282 = metamutator.Selector.of(2282,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2282");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2283 = metamutator.Selector.of(2283,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2283");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2284 = metamutator.Selector.of(2284,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2284");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2285 = metamutator.Selector.of(2285,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2285");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2286 = metamutator.Selector.of(2286,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2286");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2287 = metamutator.Selector.of(2287,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2287");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2288 = metamutator.Selector.of(2288,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2288");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2289 = metamutator.Selector.of(2289,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2289");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2290 = metamutator.Selector.of(2290,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2290");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2291 = metamutator.Selector.of(2291,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2291");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2292 = metamutator.Selector.of(2292,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2292");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2293 = metamutator.Selector.of(2293,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2293");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2294 = metamutator.Selector.of(2294,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2294");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2295 = metamutator.Selector.of(2295,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2295");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2296 = metamutator.Selector.of(2296,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2296");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2297 = metamutator.Selector.of(2297,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2297");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2298 = metamutator.Selector.of(2298,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2298");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2299 = metamutator.Selector.of(2299,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2299");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2300 = metamutator.Selector.of(2300,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2300");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2301 = metamutator.Selector.of(2301,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2301");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2302 = metamutator.Selector.of(2302,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2302");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2303 = metamutator.Selector.of(2303,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2303");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2304 = metamutator.Selector.of(2304,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2304");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2305 = metamutator.Selector.of(2305,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2305");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2306 = metamutator.Selector.of(2306,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2306");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2307 = metamutator.Selector.of(2307,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2307");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2308 = metamutator.Selector.of(2308,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2308");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2309 = metamutator.Selector.of(2309,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2309");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2310 = metamutator.Selector.of(2310,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2310");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2311 = metamutator.Selector.of(2311,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2311");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2312 = metamutator.Selector.of(2312,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2312");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2313 = metamutator.Selector.of(2313,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2313");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2314 = metamutator.Selector.of(2314,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2314");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2315 = metamutator.Selector.of(2315,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2315");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2316 = metamutator.Selector.of(2316,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2316");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2317 = metamutator.Selector.of(2317,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2317");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2318 = metamutator.Selector.of(2318,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2318");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2319 = metamutator.Selector.of(2319,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2319");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2320 = metamutator.Selector.of(2320,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2320");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2321 = metamutator.Selector.of(2321,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2321");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2322 = metamutator.Selector.of(2322,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2322");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2323 = metamutator.Selector.of(2323,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2323");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2324 = metamutator.Selector.of(2324,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2324");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2325 = metamutator.Selector.of(2325,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2325");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2326 = metamutator.Selector.of(2326,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2326");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2327 = metamutator.Selector.of(2327,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2327");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2328 = metamutator.Selector.of(2328,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2328");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2329 = metamutator.Selector.of(2329,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2329");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2330 = metamutator.Selector.of(2330,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2330");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2331 = metamutator.Selector.of(2331,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2331");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2332 = metamutator.Selector.of(2332,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2332");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2333 = metamutator.Selector.of(2333,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2333");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2334 = metamutator.Selector.of(2334,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2334");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2335 = metamutator.Selector.of(2335,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2335");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2336 = metamutator.Selector.of(2336,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2336");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2337 = metamutator.Selector.of(2337,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2337");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2338 = metamutator.Selector.of(2338,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2338");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2339 = metamutator.Selector.of(2339,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2339");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2340 = metamutator.Selector.of(2340,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2340");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2341 = metamutator.Selector.of(2341,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2341");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2342 = metamutator.Selector.of(2342,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2342");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2343 = metamutator.Selector.of(2343,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2343");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2344 = metamutator.Selector.of(2344,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2344");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2345 = metamutator.Selector.of(2345,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2345");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2346 = metamutator.Selector.of(2346,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2346");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2347 = metamutator.Selector.of(2347,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2347");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2348 = metamutator.Selector.of(2348,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2348");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2349 = metamutator.Selector.of(2349,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2349");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2350 = metamutator.Selector.of(2350,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2350");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2351 = metamutator.Selector.of(2351,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2351");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2352 = metamutator.Selector.of(2352,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2352");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2353 = metamutator.Selector.of(2353,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2353");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2354 = metamutator.Selector.of(2354,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2354");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2355 = metamutator.Selector.of(2355,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2355");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2356 = metamutator.Selector.of(2356,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2356");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2357 = metamutator.Selector.of(2357,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2357");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2358 = metamutator.Selector.of(2358,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2358");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2359 = metamutator.Selector.of(2359,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2359");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2360 = metamutator.Selector.of(2360,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2360");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2361 = metamutator.Selector.of(2361,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2361");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2362 = metamutator.Selector.of(2362,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2362");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2363 = metamutator.Selector.of(2363,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2363");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2364 = metamutator.Selector.of(2364,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2364");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2365 = metamutator.Selector.of(2365,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2365");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2366 = metamutator.Selector.of(2366,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2366");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2367 = metamutator.Selector.of(2367,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2367");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2368 = metamutator.Selector.of(2368,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2368");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2369 = metamutator.Selector.of(2369,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2369");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2370 = metamutator.Selector.of(2370,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2370");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2371 = metamutator.Selector.of(2371,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2371");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2372 = metamutator.Selector.of(2372,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2372");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2373 = metamutator.Selector.of(2373,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2373");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2374 = metamutator.Selector.of(2374,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2374");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2375 = metamutator.Selector.of(2375,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2375");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2376 = metamutator.Selector.of(2376,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2376");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2377 = metamutator.Selector.of(2377,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2377");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2378 = metamutator.Selector.of(2378,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2378");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2379 = metamutator.Selector.of(2379,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2379");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2380 = metamutator.Selector.of(2380,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2380");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2381 = metamutator.Selector.of(2381,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2381");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2382 = metamutator.Selector.of(2382,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperatorHotSpot2382");
}

