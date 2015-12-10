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
        return ((_returnReplacementOperator2324.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toString(array, "{}")));
    }

    public static java.lang.String toString(final java.lang.Object array, final java.lang.String stringIfNull) {
        if (array == null) {
            return ((_returnReplacementOperator2325.is("NULL")) ? ( null ) : (stringIfNull));
        } 
        return ((_returnReplacementOperator2326.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.builder.ToStringBuilder(array , org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE).append(array).toString()));
    }

    public static int hashCode(final java.lang.Object array) {
        return ((_returnReplacementOperator2154.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2154.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2154.is("ZERO")) ? ( 0 ) : (new org.apache.commons.lang3.builder.HashCodeBuilder().append(array).toHashCode()));
    }

    @java.lang.Deprecated
    public static boolean isEquals(final java.lang.Object array1, final java.lang.Object array2) {
        return ((_returnReplacementOperator1979.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.builder.EqualsBuilder().append(array1, array2).isEquals()));
    }

    public static java.util.Map<java.lang.Object, java.lang.Object> toMap(final java.lang.Object[] array) {
        if (array == null) {
            return ((_returnReplacementOperator2329.is("NULL")) ? ( null ) : (null));
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
        return ((_returnReplacementOperator2330.is("NULL")) ? ( null ) : (map));
    }

    public static <T>T[] toArray(final T... items) {
        return ((_returnReplacementOperator1955.is("NULL")) ? ( null ) : (items));
    }

    public static <T>T[] clone(final T[] array) {
        if (array == null) {
            return ((_returnReplacementOperator1940.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator1941.is("NULL")) ? ( null ) : (array.clone()));
    }

    public static long[] clone(final long[] array) {
        if (array == null) {
            return ((_returnReplacementOperator2336.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator2337.is("NULL")) ? ( null ) : (array.clone()));
    }

    public static int[] clone(final int[] array) {
        if (array == null) {
            return ((_returnReplacementOperator2252.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator2253.is("NULL")) ? ( null ) : (array.clone()));
    }

    public static short[] clone(final short[] array) {
        if (array == null) {
            return ((_returnReplacementOperator2362.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator2363.is("NULL")) ? ( null ) : (array.clone()));
    }

    public static char[] clone(final char[] array) {
        if (array == null) {
            return ((_returnReplacementOperator2079.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator2080.is("NULL")) ? ( null ) : (array.clone()));
    }

    public static byte[] clone(final byte[] array) {
        if (array == null) {
            return ((_returnReplacementOperator2053.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator2054.is("NULL")) ? ( null ) : (array.clone()));
    }

    public static double[] clone(final double[] array) {
        if (array == null) {
            return ((_returnReplacementOperator2105.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator2106.is("NULL")) ? ( null ) : (array.clone()));
    }

    public static float[] clone(final float[] array) {
        if (array == null) {
            return ((_returnReplacementOperator2131.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator2132.is("NULL")) ? ( null ) : (array.clone()));
    }

    public static boolean[] clone(final boolean[] array) {
        if (array == null) {
            return ((_returnReplacementOperator2027.is("NULL")) ? ( null ) : (null));
        } 
        return ((_returnReplacementOperator2028.is("NULL")) ? ( null ) : (array.clone()));
    }

    public static <T>T[] nullToEmpty(final T[] array, final java.lang.Class<T[]> type) {
        if (type == null) {
            throw new java.lang.IllegalArgumentException("The type must not be null");
        } 
        if (array == null) {
            return ((_returnReplacementOperator1942.is("NULL")) ? ( null ) : (type.cast(java.lang.reflect.Array.newInstance(type.getComponentType(), 0))));
        } 
        return ((_returnReplacementOperator1943.is("NULL")) ? ( null ) : (array));
    }

    public static java.lang.Object[] nullToEmpty(final java.lang.Object[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperator2317.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY));
        } 
        return ((_returnReplacementOperator2318.is("NULL")) ? ( null ) : (array));
    }

    public static java.lang.Class<?>[] nullToEmpty(final java.lang.Class<?>[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperator2288.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY));
        } 
        return ((_returnReplacementOperator2289.is("NULL")) ? ( null ) : (array));
    }

    public static java.lang.String[] nullToEmpty(final java.lang.String[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperator2327.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY));
        } 
        return ((_returnReplacementOperator2328.is("NULL")) ? ( null ) : (array));
    }

    public static long[] nullToEmpty(final long[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperator2338.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY));
        } 
        return ((_returnReplacementOperator2339.is("NULL")) ? ( null ) : (array));
    }

    public static int[] nullToEmpty(final int[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperator2254.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY));
        } 
        return ((_returnReplacementOperator2255.is("NULL")) ? ( null ) : (array));
    }

    public static short[] nullToEmpty(final short[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperator2364.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY));
        } 
        return ((_returnReplacementOperator2365.is("NULL")) ? ( null ) : (array));
    }

    public static char[] nullToEmpty(final char[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperator2081.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY));
        } 
        return ((_returnReplacementOperator2082.is("NULL")) ? ( null ) : (array));
    }

    public static byte[] nullToEmpty(final byte[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperator2055.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY));
        } 
        return ((_returnReplacementOperator2056.is("NULL")) ? ( null ) : (array));
    }

    public static double[] nullToEmpty(final double[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperator2107.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY));
        } 
        return ((_returnReplacementOperator2108.is("NULL")) ? ( null ) : (array));
    }

    public static float[] nullToEmpty(final float[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperator2133.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY));
        } 
        return ((_returnReplacementOperator2134.is("NULL")) ? ( null ) : (array));
    }

    public static boolean[] nullToEmpty(final boolean[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperator2029.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_ARRAY));
        } 
        return ((_returnReplacementOperator2030.is("NULL")) ? ( null ) : (array));
    }

    public static java.lang.Long[] nullToEmpty(final java.lang.Long[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperator2305.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY));
        } 
        return ((_returnReplacementOperator2306.is("NULL")) ? ( null ) : (array));
    }

    public static java.lang.Integer[] nullToEmpty(final java.lang.Integer[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperator2300.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY));
        } 
        return ((_returnReplacementOperator2301.is("NULL")) ? ( null ) : (array));
    }

    public static java.lang.Short[] nullToEmpty(final java.lang.Short[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperator2319.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY));
        } 
        return ((_returnReplacementOperator2320.is("NULL")) ? ( null ) : (array));
    }

    public static java.lang.Character[] nullToEmpty(final java.lang.Character[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperator2283.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY));
        } 
        return ((_returnReplacementOperator2284.is("NULL")) ? ( null ) : (array));
    }

    public static java.lang.Byte[] nullToEmpty(final java.lang.Byte[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperator2278.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY));
        } 
        return ((_returnReplacementOperator2279.is("NULL")) ? ( null ) : (array));
    }

    public static java.lang.Double[] nullToEmpty(final java.lang.Double[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperator2290.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY));
        } 
        return ((_returnReplacementOperator2291.is("NULL")) ? ( null ) : (array));
    }

    public static java.lang.Float[] nullToEmpty(final java.lang.Float[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperator2295.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY));
        } 
        return ((_returnReplacementOperator2296.is("NULL")) ? ( null ) : (array));
    }

    public static java.lang.Boolean[] nullToEmpty(final java.lang.Boolean[] array) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperator2273.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY));
        } 
        return ((_returnReplacementOperator2274.is("NULL")) ? ( null ) : (array));
    }

    public static <T>T[] subarray(final T[] array, int startIndexInclusive, int endIndexExclusive) {
        if (array == null) {
            return ((_returnReplacementOperator1952.is("NULL")) ? ( null ) : (null));
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
            return ((_returnReplacementOperator1953.is("NULL")) ? ( null ) : (emptyArray));
        } 
        @java.lang.SuppressWarnings(value = "unchecked")
        final T[] subarray = ((T[])(java.lang.reflect.Array.newInstance(type, newSize)));
        java.lang.System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        return ((_returnReplacementOperator1954.is("NULL")) ? ( null ) : (subarray));
    }

    public static long[] subarray(final long[] array, int startIndexInclusive, int endIndexExclusive) {
        if (array == null) {
            return ((_returnReplacementOperator2348.is("NULL")) ? ( null ) : (null));
        } 
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        } 
        if (endIndexExclusive > (array.length)) {
            endIndexExclusive = array.length;
        } 
        final int newSize = endIndexExclusive - startIndexInclusive;
        if (newSize <= 0) {
            return ((_returnReplacementOperator2349.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY));
        } 
        final long[] subarray = new long[newSize];
        java.lang.System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        return ((_returnReplacementOperator2350.is("NULL")) ? ( null ) : (subarray));
    }

    public static int[] subarray(final int[] array, int startIndexInclusive, int endIndexExclusive) {
        if (array == null) {
            return ((_returnReplacementOperator2264.is("NULL")) ? ( null ) : (null));
        } 
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        } 
        if (endIndexExclusive > (array.length)) {
            endIndexExclusive = array.length;
        } 
        final int newSize = endIndexExclusive - startIndexInclusive;
        if (newSize <= 0) {
            return ((_returnReplacementOperator2265.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY));
        } 
        final int[] subarray = new int[newSize];
        java.lang.System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        return ((_returnReplacementOperator2266.is("NULL")) ? ( null ) : (subarray));
    }

    public static short[] subarray(final short[] array, int startIndexInclusive, int endIndexExclusive) {
        if (array == null) {
            return ((_returnReplacementOperator2374.is("NULL")) ? ( null ) : (null));
        } 
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        } 
        if (endIndexExclusive > (array.length)) {
            endIndexExclusive = array.length;
        } 
        final int newSize = endIndexExclusive - startIndexInclusive;
        if (newSize <= 0) {
            return ((_returnReplacementOperator2375.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY));
        } 
        final short[] subarray = new short[newSize];
        java.lang.System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        return ((_returnReplacementOperator2376.is("NULL")) ? ( null ) : (subarray));
    }

    public static char[] subarray(final char[] array, int startIndexInclusive, int endIndexExclusive) {
        if (array == null) {
            return ((_returnReplacementOperator2091.is("NULL")) ? ( null ) : (null));
        } 
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        } 
        if (endIndexExclusive > (array.length)) {
            endIndexExclusive = array.length;
        } 
        final int newSize = endIndexExclusive - startIndexInclusive;
        if (newSize <= 0) {
            return ((_returnReplacementOperator2092.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY));
        } 
        final char[] subarray = new char[newSize];
        java.lang.System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        return ((_returnReplacementOperator2093.is("NULL")) ? ( null ) : (subarray));
    }

    public static byte[] subarray(final byte[] array, int startIndexInclusive, int endIndexExclusive) {
        if (array == null) {
            return ((_returnReplacementOperator2065.is("NULL")) ? ( null ) : (null));
        } 
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        } 
        if (endIndexExclusive > (array.length)) {
            endIndexExclusive = array.length;
        } 
        final int newSize = endIndexExclusive - startIndexInclusive;
        if (newSize <= 0) {
            return ((_returnReplacementOperator2066.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY));
        } 
        final byte[] subarray = new byte[newSize];
        java.lang.System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        return ((_returnReplacementOperator2067.is("NULL")) ? ( null ) : (subarray));
    }

    public static double[] subarray(final double[] array, int startIndexInclusive, int endIndexExclusive) {
        if (array == null) {
            return ((_returnReplacementOperator2117.is("NULL")) ? ( null ) : (null));
        } 
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        } 
        if (endIndexExclusive > (array.length)) {
            endIndexExclusive = array.length;
        } 
        final int newSize = endIndexExclusive - startIndexInclusive;
        if (newSize <= 0) {
            return ((_returnReplacementOperator2118.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY));
        } 
        final double[] subarray = new double[newSize];
        java.lang.System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        return ((_returnReplacementOperator2119.is("NULL")) ? ( null ) : (subarray));
    }

    public static float[] subarray(final float[] array, int startIndexInclusive, int endIndexExclusive) {
        if (array == null) {
            return ((_returnReplacementOperator2143.is("NULL")) ? ( null ) : (null));
        } 
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        } 
        if (endIndexExclusive > (array.length)) {
            endIndexExclusive = array.length;
        } 
        final int newSize = endIndexExclusive - startIndexInclusive;
        if (newSize <= 0) {
            return ((_returnReplacementOperator2144.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY));
        } 
        final float[] subarray = new float[newSize];
        java.lang.System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        return ((_returnReplacementOperator2145.is("NULL")) ? ( null ) : (subarray));
    }

    public static boolean[] subarray(final boolean[] array, int startIndexInclusive, int endIndexExclusive) {
        if (array == null) {
            return ((_returnReplacementOperator2039.is("NULL")) ? ( null ) : (null));
        } 
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        } 
        if (endIndexExclusive > (array.length)) {
            endIndexExclusive = array.length;
        } 
        final int newSize = endIndexExclusive - startIndexInclusive;
        if (newSize <= 0) {
            return ((_returnReplacementOperator2040.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_ARRAY));
        } 
        final boolean[] subarray = new boolean[newSize];
        java.lang.System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        return ((_returnReplacementOperator2041.is("NULL")) ? ( null ) : (subarray));
    }

    public static boolean isSameLength(final java.lang.Object[] array1, final java.lang.Object[] array2) {
        return ((_returnReplacementOperator1994.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array1)) == (org.apache.commons.lang3.ArrayUtils.getLength(array2))));
    }

    public static boolean isSameLength(final long[] array1, final long[] array2) {
        return ((_returnReplacementOperator1995.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array1)) == (org.apache.commons.lang3.ArrayUtils.getLength(array2))));
    }

    public static boolean isSameLength(final int[] array1, final int[] array2) {
        return ((_returnReplacementOperator1993.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array1)) == (org.apache.commons.lang3.ArrayUtils.getLength(array2))));
    }

    public static boolean isSameLength(final short[] array1, final short[] array2) {
        return ((_returnReplacementOperator1996.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array1)) == (org.apache.commons.lang3.ArrayUtils.getLength(array2))));
    }

    public static boolean isSameLength(final char[] array1, final char[] array2) {
        return ((_returnReplacementOperator1990.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array1)) == (org.apache.commons.lang3.ArrayUtils.getLength(array2))));
    }

    public static boolean isSameLength(final byte[] array1, final byte[] array2) {
        return ((_returnReplacementOperator1989.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array1)) == (org.apache.commons.lang3.ArrayUtils.getLength(array2))));
    }

    public static boolean isSameLength(final double[] array1, final double[] array2) {
        return ((_returnReplacementOperator1991.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array1)) == (org.apache.commons.lang3.ArrayUtils.getLength(array2))));
    }

    public static boolean isSameLength(final float[] array1, final float[] array2) {
        return ((_returnReplacementOperator1992.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array1)) == (org.apache.commons.lang3.ArrayUtils.getLength(array2))));
    }

    public static boolean isSameLength(final boolean[] array1, final boolean[] array2) {
        return ((_returnReplacementOperator1988.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array1)) == (org.apache.commons.lang3.ArrayUtils.getLength(array2))));
    }

    public static int getLength(final java.lang.Object array) {
        if (array == null) {
            return ((_returnReplacementOperator2152.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2152.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2152.is("ZERO")) ? ( 0 ) : (0));
        } 
        return ((_returnReplacementOperator2153.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2153.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2153.is("ZERO")) ? ( 0 ) : (java.lang.reflect.Array.getLength(array)));
    }

    public static boolean isSameType(final java.lang.Object array1, final java.lang.Object array2) {
        if ((array1 == null) || (array2 == null)) {
            throw new java.lang.IllegalArgumentException("The Array must not be null");
        } 
        return ((_returnReplacementOperator1997.is("NULL")) ? ( null ) : (array1.getClass().getName().equals(array2.getClass().getName())));
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
        return ((_returnReplacementOperator2183.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2183.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2183.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.indexOf(array, objectToFind, 0)));
    }

    public static int indexOf(final java.lang.Object[] array, final java.lang.Object objectToFind, int startIndex) {
        if (array == null) {
            return ((_returnReplacementOperator2184.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2184.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2184.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            startIndex = 0;
        } 
        if (objectToFind == null) {
            for (int i = startIndex ; i < (array.length) ; i++) {
                if ((array[i]) == null) {
                    return ((_returnReplacementOperator2185.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2185.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2185.is("ZERO")) ? ( 0 ) : (i));
                } 
            }
        } else if (array.getClass().getComponentType().isInstance(objectToFind)) {
            for (int i = startIndex ; i < (array.length) ; i++) {
                if (objectToFind.equals(array[i])) {
                    return ((_returnReplacementOperator2186.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2186.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2186.is("ZERO")) ? ( 0 ) : (i));
                } 
            }
        } 
        return ((_returnReplacementOperator2187.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2187.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2187.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static int lastIndexOf(final java.lang.Object[] array, final java.lang.Object objectToFind) {
        return ((_returnReplacementOperator2231.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2231.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2231.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.lastIndexOf(array, objectToFind, java.lang.Integer.MAX_VALUE)));
    }

    public static int lastIndexOf(final java.lang.Object[] array, final java.lang.Object objectToFind, int startIndex) {
        if (array == null) {
            return ((_returnReplacementOperator2232.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2232.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2232.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            return ((_returnReplacementOperator2233.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2233.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2233.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } else if (startIndex >= (array.length)) {
            startIndex = (array.length) - 1;
        } 
        if (objectToFind == null) {
            for (int i = startIndex ; i >= 0 ; i--) {
                if ((array[i]) == null) {
                    return ((_returnReplacementOperator2234.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2234.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2234.is("ZERO")) ? ( 0 ) : (i));
                } 
            }
        } else if (array.getClass().getComponentType().isInstance(objectToFind)) {
            for (int i = startIndex ; i >= 0 ; i--) {
                if (objectToFind.equals(array[i])) {
                    return ((_returnReplacementOperator2235.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2235.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2235.is("ZERO")) ? ( 0 ) : (i));
                } 
            }
        } 
        return ((_returnReplacementOperator2236.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2236.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2236.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static boolean contains(final java.lang.Object[] array, final java.lang.Object objectToFind) {
        return ((_returnReplacementOperator1967.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.indexOf(array, objectToFind)) != (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND)));
    }

    public static int indexOf(final long[] array, final long valueToFind) {
        return ((_returnReplacementOperator2188.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2188.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2188.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind, 0)));
    }

    public static int indexOf(final long[] array, final long valueToFind, int startIndex) {
        if (array == null) {
            return ((_returnReplacementOperator2189.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2189.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2189.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            startIndex = 0;
        } 
        for (int i = startIndex ; i < (array.length) ; i++) {
            if (valueToFind == (array[i])) {
                return ((_returnReplacementOperator2190.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2190.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2190.is("ZERO")) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperator2191.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2191.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2191.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static int lastIndexOf(final long[] array, final long valueToFind) {
        return ((_returnReplacementOperator2237.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2237.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2237.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.lastIndexOf(array, valueToFind, java.lang.Integer.MAX_VALUE)));
    }

    public static int lastIndexOf(final long[] array, final long valueToFind, int startIndex) {
        if (array == null) {
            return ((_returnReplacementOperator2238.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2238.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2238.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            return ((_returnReplacementOperator2239.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2239.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2239.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } else if (startIndex >= (array.length)) {
            startIndex = (array.length) - 1;
        } 
        for (int i = startIndex ; i >= 0 ; i--) {
            if (valueToFind == (array[i])) {
                return ((_returnReplacementOperator2240.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2240.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2240.is("ZERO")) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperator2241.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2241.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2241.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static boolean contains(final long[] array, final long valueToFind) {
        return ((_returnReplacementOperator1968.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind)) != (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND)));
    }

    public static int indexOf(final int[] array, final int valueToFind) {
        return ((_returnReplacementOperator2179.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2179.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2179.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind, 0)));
    }

    public static int indexOf(final int[] array, final int valueToFind, int startIndex) {
        if (array == null) {
            return ((_returnReplacementOperator2180.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2180.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2180.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            startIndex = 0;
        } 
        for (int i = startIndex ; i < (array.length) ; i++) {
            if (valueToFind == (array[i])) {
                return ((_returnReplacementOperator2181.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2181.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2181.is("ZERO")) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperator2182.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2182.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2182.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static int lastIndexOf(final int[] array, final int valueToFind) {
        return ((_returnReplacementOperator2226.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2226.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2226.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.lastIndexOf(array, valueToFind, java.lang.Integer.MAX_VALUE)));
    }

    public static int lastIndexOf(final int[] array, final int valueToFind, int startIndex) {
        if (array == null) {
            return ((_returnReplacementOperator2227.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2227.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2227.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            return ((_returnReplacementOperator2228.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2228.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2228.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } else if (startIndex >= (array.length)) {
            startIndex = (array.length) - 1;
        } 
        for (int i = startIndex ; i >= 0 ; i--) {
            if (valueToFind == (array[i])) {
                return ((_returnReplacementOperator2229.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2229.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2229.is("ZERO")) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperator2230.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2230.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2230.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static boolean contains(final int[] array, final int valueToFind) {
        return ((_returnReplacementOperator1966.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind)) != (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND)));
    }

    public static int indexOf(final short[] array, final short valueToFind) {
        return ((_returnReplacementOperator2192.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2192.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2192.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind, 0)));
    }

    public static int indexOf(final short[] array, final short valueToFind, int startIndex) {
        if (array == null) {
            return ((_returnReplacementOperator2193.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2193.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2193.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            startIndex = 0;
        } 
        for (int i = startIndex ; i < (array.length) ; i++) {
            if (valueToFind == (array[i])) {
                return ((_returnReplacementOperator2194.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2194.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2194.is("ZERO")) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperator2195.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2195.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2195.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static int lastIndexOf(final short[] array, final short valueToFind) {
        return ((_returnReplacementOperator2242.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2242.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2242.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.lastIndexOf(array, valueToFind, java.lang.Integer.MAX_VALUE)));
    }

    public static int lastIndexOf(final short[] array, final short valueToFind, int startIndex) {
        if (array == null) {
            return ((_returnReplacementOperator2243.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2243.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2243.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            return ((_returnReplacementOperator2244.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2244.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2244.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } else if (startIndex >= (array.length)) {
            startIndex = (array.length) - 1;
        } 
        for (int i = startIndex ; i >= 0 ; i--) {
            if (valueToFind == (array[i])) {
                return ((_returnReplacementOperator2245.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2245.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2245.is("ZERO")) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperator2246.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2246.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2246.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static boolean contains(final short[] array, final short valueToFind) {
        return ((_returnReplacementOperator1969.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind)) != (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND)));
    }

    public static int indexOf(final char[] array, final char valueToFind) {
        return ((_returnReplacementOperator2163.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2163.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2163.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind, 0)));
    }

    public static int indexOf(final char[] array, final char valueToFind, int startIndex) {
        if (array == null) {
            return ((_returnReplacementOperator2164.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2164.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2164.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            startIndex = 0;
        } 
        for (int i = startIndex ; i < (array.length) ; i++) {
            if (valueToFind == (array[i])) {
                return ((_returnReplacementOperator2165.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2165.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2165.is("ZERO")) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperator2166.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2166.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2166.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static int lastIndexOf(final char[] array, final char valueToFind) {
        return ((_returnReplacementOperator2206.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2206.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2206.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.lastIndexOf(array, valueToFind, java.lang.Integer.MAX_VALUE)));
    }

    public static int lastIndexOf(final char[] array, final char valueToFind, int startIndex) {
        if (array == null) {
            return ((_returnReplacementOperator2207.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2207.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2207.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            return ((_returnReplacementOperator2208.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2208.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2208.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } else if (startIndex >= (array.length)) {
            startIndex = (array.length) - 1;
        } 
        for (int i = startIndex ; i >= 0 ; i--) {
            if (valueToFind == (array[i])) {
                return ((_returnReplacementOperator2209.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2209.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2209.is("ZERO")) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperator2210.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2210.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2210.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static boolean contains(final char[] array, final char valueToFind) {
        return ((_returnReplacementOperator1962.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind)) != (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND)));
    }

    public static int indexOf(final byte[] array, final byte valueToFind) {
        return ((_returnReplacementOperator2159.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2159.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2159.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind, 0)));
    }

    public static int indexOf(final byte[] array, final byte valueToFind, int startIndex) {
        if (array == null) {
            return ((_returnReplacementOperator2160.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2160.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2160.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            startIndex = 0;
        } 
        for (int i = startIndex ; i < (array.length) ; i++) {
            if (valueToFind == (array[i])) {
                return ((_returnReplacementOperator2161.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2161.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2161.is("ZERO")) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperator2162.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2162.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2162.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static int lastIndexOf(final byte[] array, final byte valueToFind) {
        return ((_returnReplacementOperator2201.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2201.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2201.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.lastIndexOf(array, valueToFind, java.lang.Integer.MAX_VALUE)));
    }

    public static int lastIndexOf(final byte[] array, final byte valueToFind, int startIndex) {
        if (array == null) {
            return ((_returnReplacementOperator2202.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2202.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2202.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            return ((_returnReplacementOperator2203.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2203.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2203.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } else if (startIndex >= (array.length)) {
            startIndex = (array.length) - 1;
        } 
        for (int i = startIndex ; i >= 0 ; i--) {
            if (valueToFind == (array[i])) {
                return ((_returnReplacementOperator2204.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2204.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2204.is("ZERO")) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperator2205.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2205.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2205.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static boolean contains(final byte[] array, final byte valueToFind) {
        return ((_returnReplacementOperator1961.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind)) != (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND)));
    }

    public static int indexOf(final double[] array, final double valueToFind) {
        return ((_returnReplacementOperator2167.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2167.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2167.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind, 0)));
    }

    public static int indexOf(final double[] array, final double valueToFind, final double tolerance) {
        return ((_returnReplacementOperator2168.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2168.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2168.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind, 0, tolerance)));
    }

    public static int indexOf(final double[] array, final double valueToFind, int startIndex) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperator2169.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2169.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2169.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            startIndex = 0;
        } 
        for (int i = startIndex ; i < (array.length) ; i++) {
            if (valueToFind == (array[i])) {
                return ((_returnReplacementOperator2170.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2170.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2170.is("ZERO")) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperator2171.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2171.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2171.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static int indexOf(final double[] array, final double valueToFind, int startIndex, final double tolerance) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperator2172.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2172.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2172.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            startIndex = 0;
        } 
        final double min = valueToFind - tolerance;
        final double max = valueToFind + tolerance;
        for (int i = startIndex ; i < (array.length) ; i++) {
            if (((array[i]) >= min) && ((array[i]) <= max)) {
                return ((_returnReplacementOperator2173.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2173.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2173.is("ZERO")) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperator2174.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2174.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2174.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static int lastIndexOf(final double[] array, final double valueToFind) {
        return ((_returnReplacementOperator2211.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2211.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2211.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.lastIndexOf(array, valueToFind, java.lang.Integer.MAX_VALUE)));
    }

    public static int lastIndexOf(final double[] array, final double valueToFind, final double tolerance) {
        return ((_returnReplacementOperator2212.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2212.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2212.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.lastIndexOf(array, valueToFind, java.lang.Integer.MAX_VALUE, tolerance)));
    }

    public static int lastIndexOf(final double[] array, final double valueToFind, int startIndex) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperator2213.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2213.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2213.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            return ((_returnReplacementOperator2214.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2214.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2214.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } else if (startIndex >= (array.length)) {
            startIndex = (array.length) - 1;
        } 
        for (int i = startIndex ; i >= 0 ; i--) {
            if (valueToFind == (array[i])) {
                return ((_returnReplacementOperator2215.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2215.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2215.is("ZERO")) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperator2216.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2216.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2216.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static int lastIndexOf(final double[] array, final double valueToFind, int startIndex, final double tolerance) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperator2217.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2217.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2217.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            return ((_returnReplacementOperator2218.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2218.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2218.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } else if (startIndex >= (array.length)) {
            startIndex = (array.length) - 1;
        } 
        final double min = valueToFind - tolerance;
        final double max = valueToFind + tolerance;
        for (int i = startIndex ; i >= 0 ; i--) {
            if (((array[i]) >= min) && ((array[i]) <= max)) {
                return ((_returnReplacementOperator2219.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2219.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2219.is("ZERO")) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperator2220.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2220.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2220.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static boolean contains(final double[] array, final double valueToFind) {
        return ((_returnReplacementOperator1963.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind)) != (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND)));
    }

    public static boolean contains(final double[] array, final double valueToFind, final double tolerance) {
        return ((_returnReplacementOperator1964.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind, 0, tolerance)) != (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND)));
    }

    public static int indexOf(final float[] array, final float valueToFind) {
        return ((_returnReplacementOperator2175.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2175.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2175.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind, 0)));
    }

    public static int indexOf(final float[] array, final float valueToFind, int startIndex) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperator2176.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2176.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2176.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            startIndex = 0;
        } 
        for (int i = startIndex ; i < (array.length) ; i++) {
            if (valueToFind == (array[i])) {
                return ((_returnReplacementOperator2177.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2177.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2177.is("ZERO")) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperator2178.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2178.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2178.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static int lastIndexOf(final float[] array, final float valueToFind) {
        return ((_returnReplacementOperator2221.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2221.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2221.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.lastIndexOf(array, valueToFind, java.lang.Integer.MAX_VALUE)));
    }

    public static int lastIndexOf(final float[] array, final float valueToFind, int startIndex) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperator2222.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2222.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2222.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            return ((_returnReplacementOperator2223.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2223.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2223.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } else if (startIndex >= (array.length)) {
            startIndex = (array.length) - 1;
        } 
        for (int i = startIndex ; i >= 0 ; i--) {
            if (valueToFind == (array[i])) {
                return ((_returnReplacementOperator2224.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2224.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2224.is("ZERO")) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperator2225.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2225.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2225.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static boolean contains(final float[] array, final float valueToFind) {
        return ((_returnReplacementOperator1965.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind)) != (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND)));
    }

    public static int indexOf(final boolean[] array, final boolean valueToFind) {
        return ((_returnReplacementOperator2155.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2155.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2155.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind, 0)));
    }

    public static int indexOf(final boolean[] array, final boolean valueToFind, int startIndex) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperator2156.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2156.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2156.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            startIndex = 0;
        } 
        for (int i = startIndex ; i < (array.length) ; i++) {
            if (valueToFind == (array[i])) {
                return ((_returnReplacementOperator2157.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2157.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2157.is("ZERO")) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperator2158.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2158.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2158.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static int lastIndexOf(final boolean[] array, final boolean valueToFind) {
        return ((_returnReplacementOperator2196.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2196.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2196.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.lastIndexOf(array, valueToFind, java.lang.Integer.MAX_VALUE)));
    }

    public static int lastIndexOf(final boolean[] array, final boolean valueToFind, int startIndex) {
        if (org.apache.commons.lang3.ArrayUtils.isEmpty(array)) {
            return ((_returnReplacementOperator2197.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2197.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2197.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } 
        if (startIndex < 0) {
            return ((_returnReplacementOperator2198.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2198.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2198.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
        } else if (startIndex >= (array.length)) {
            startIndex = (array.length) - 1;
        } 
        for (int i = startIndex ; i >= 0 ; i--) {
            if (valueToFind == (array[i])) {
                return ((_returnReplacementOperator2199.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2199.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2199.is("ZERO")) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperator2200.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2200.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2200.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND));
    }

    public static boolean contains(final boolean[] array, final boolean valueToFind) {
        return ((_returnReplacementOperator1960.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.indexOf(array, valueToFind)) != (org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND)));
    }

    public static char[] toPrimitive(final java.lang.Character[] array) {
        if (array == null) {
            return ((_returnReplacementOperator2094.is("NULL")) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperator2095.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY));
        } 
        final char[] result = new char[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            result[i] = array[i].charValue();
        }
        return ((_returnReplacementOperator2096.is("NULL")) ? ( null ) : (result));
    }

    public static char[] toPrimitive(final java.lang.Character[] array, final char valueForNull) {
        if (array == null) {
            return ((_returnReplacementOperator2097.is("NULL")) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperator2098.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY));
        } 
        final char[] result = new char[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            final java.lang.Character b = array[i];
            result[i] = b == null ? valueForNull : b.charValue();
        }
        return ((_returnReplacementOperator2099.is("NULL")) ? ( null ) : (result));
    }

    public static java.lang.Character[] toObject(final char[] array) {
        if (array == null) {
            return ((_returnReplacementOperator2285.is("NULL")) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperator2286.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY));
        } 
        final java.lang.Character[] result = new java.lang.Character[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            result[i] = java.lang.Character.valueOf(array[i]);
        }
        return ((_returnReplacementOperator2287.is("NULL")) ? ( null ) : (result));
    }

    public static long[] toPrimitive(final java.lang.Long[] array) {
        if (array == null) {
            return ((_returnReplacementOperator2351.is("NULL")) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperator2352.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY));
        } 
        final long[] result = new long[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            result[i] = array[i].longValue();
        }
        return ((_returnReplacementOperator2353.is("NULL")) ? ( null ) : (result));
    }

    public static long[] toPrimitive(final java.lang.Long[] array, final long valueForNull) {
        if (array == null) {
            return ((_returnReplacementOperator2354.is("NULL")) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperator2355.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY));
        } 
        final long[] result = new long[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            final java.lang.Long b = array[i];
            result[i] = b == null ? valueForNull : b.longValue();
        }
        return ((_returnReplacementOperator2356.is("NULL")) ? ( null ) : (result));
    }

    public static java.lang.Long[] toObject(final long[] array) {
        if (array == null) {
            return ((_returnReplacementOperator2307.is("NULL")) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperator2308.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY));
        } 
        final java.lang.Long[] result = new java.lang.Long[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            result[i] = java.lang.Long.valueOf(array[i]);
        }
        return ((_returnReplacementOperator2309.is("NULL")) ? ( null ) : (result));
    }

    public static int[] toPrimitive(final java.lang.Integer[] array) {
        if (array == null) {
            return ((_returnReplacementOperator2267.is("NULL")) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperator2268.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY));
        } 
        final int[] result = new int[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            result[i] = array[i].intValue();
        }
        return ((_returnReplacementOperator2269.is("NULL")) ? ( null ) : (result));
    }

    public static int[] toPrimitive(final java.lang.Integer[] array, final int valueForNull) {
        if (array == null) {
            return ((_returnReplacementOperator2270.is("NULL")) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperator2271.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY));
        } 
        final int[] result = new int[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            final java.lang.Integer b = array[i];
            result[i] = b == null ? valueForNull : b.intValue();
        }
        return ((_returnReplacementOperator2272.is("NULL")) ? ( null ) : (result));
    }

    public static java.lang.Integer[] toObject(final int[] array) {
        if (array == null) {
            return ((_returnReplacementOperator2302.is("NULL")) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperator2303.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY));
        } 
        final java.lang.Integer[] result = new java.lang.Integer[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            result[i] = java.lang.Integer.valueOf(array[i]);
        }
        return ((_returnReplacementOperator2304.is("NULL")) ? ( null ) : (result));
    }

    public static short[] toPrimitive(final java.lang.Short[] array) {
        if (array == null) {
            return ((_returnReplacementOperator2377.is("NULL")) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperator2378.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY));
        } 
        final short[] result = new short[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            result[i] = array[i].shortValue();
        }
        return ((_returnReplacementOperator2379.is("NULL")) ? ( null ) : (result));
    }

    public static short[] toPrimitive(final java.lang.Short[] array, final short valueForNull) {
        if (array == null) {
            return ((_returnReplacementOperator2380.is("NULL")) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperator2381.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY));
        } 
        final short[] result = new short[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            final java.lang.Short b = array[i];
            result[i] = b == null ? valueForNull : b.shortValue();
        }
        return ((_returnReplacementOperator2382.is("NULL")) ? ( null ) : (result));
    }

    public static java.lang.Short[] toObject(final short[] array) {
        if (array == null) {
            return ((_returnReplacementOperator2321.is("NULL")) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperator2322.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY));
        } 
        final java.lang.Short[] result = new java.lang.Short[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            result[i] = java.lang.Short.valueOf(array[i]);
        }
        return ((_returnReplacementOperator2323.is("NULL")) ? ( null ) : (result));
    }

    public static byte[] toPrimitive(final java.lang.Byte[] array) {
        if (array == null) {
            return ((_returnReplacementOperator2068.is("NULL")) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperator2069.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY));
        } 
        final byte[] result = new byte[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            result[i] = array[i].byteValue();
        }
        return ((_returnReplacementOperator2070.is("NULL")) ? ( null ) : (result));
    }

    public static byte[] toPrimitive(final java.lang.Byte[] array, final byte valueForNull) {
        if (array == null) {
            return ((_returnReplacementOperator2071.is("NULL")) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperator2072.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY));
        } 
        final byte[] result = new byte[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            final java.lang.Byte b = array[i];
            result[i] = b == null ? valueForNull : b.byteValue();
        }
        return ((_returnReplacementOperator2073.is("NULL")) ? ( null ) : (result));
    }

    public static java.lang.Byte[] toObject(final byte[] array) {
        if (array == null) {
            return ((_returnReplacementOperator2280.is("NULL")) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperator2281.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY));
        } 
        final java.lang.Byte[] result = new java.lang.Byte[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            result[i] = java.lang.Byte.valueOf(array[i]);
        }
        return ((_returnReplacementOperator2282.is("NULL")) ? ( null ) : (result));
    }

    public static double[] toPrimitive(final java.lang.Double[] array) {
        if (array == null) {
            return ((_returnReplacementOperator2120.is("NULL")) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperator2121.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY));
        } 
        final double[] result = new double[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            result[i] = array[i].doubleValue();
        }
        return ((_returnReplacementOperator2122.is("NULL")) ? ( null ) : (result));
    }

    public static double[] toPrimitive(final java.lang.Double[] array, final double valueForNull) {
        if (array == null) {
            return ((_returnReplacementOperator2123.is("NULL")) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperator2124.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY));
        } 
        final double[] result = new double[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            final java.lang.Double b = array[i];
            result[i] = b == null ? valueForNull : b.doubleValue();
        }
        return ((_returnReplacementOperator2125.is("NULL")) ? ( null ) : (result));
    }

    public static java.lang.Double[] toObject(final double[] array) {
        if (array == null) {
            return ((_returnReplacementOperator2292.is("NULL")) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperator2293.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY));
        } 
        final java.lang.Double[] result = new java.lang.Double[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            result[i] = java.lang.Double.valueOf(array[i]);
        }
        return ((_returnReplacementOperator2294.is("NULL")) ? ( null ) : (result));
    }

    public static float[] toPrimitive(final java.lang.Float[] array) {
        if (array == null) {
            return ((_returnReplacementOperator2146.is("NULL")) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperator2147.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY));
        } 
        final float[] result = new float[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            result[i] = array[i].floatValue();
        }
        return ((_returnReplacementOperator2148.is("NULL")) ? ( null ) : (result));
    }

    public static float[] toPrimitive(final java.lang.Float[] array, final float valueForNull) {
        if (array == null) {
            return ((_returnReplacementOperator2149.is("NULL")) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperator2150.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY));
        } 
        final float[] result = new float[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            final java.lang.Float b = array[i];
            result[i] = b == null ? valueForNull : b.floatValue();
        }
        return ((_returnReplacementOperator2151.is("NULL")) ? ( null ) : (result));
    }

    public static java.lang.Float[] toObject(final float[] array) {
        if (array == null) {
            return ((_returnReplacementOperator2297.is("NULL")) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperator2298.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY));
        } 
        final java.lang.Float[] result = new java.lang.Float[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            result[i] = java.lang.Float.valueOf(array[i]);
        }
        return ((_returnReplacementOperator2299.is("NULL")) ? ( null ) : (result));
    }

    public static boolean[] toPrimitive(final java.lang.Boolean[] array) {
        if (array == null) {
            return ((_returnReplacementOperator2042.is("NULL")) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperator2043.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_ARRAY));
        } 
        final boolean[] result = new boolean[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            result[i] = array[i].booleanValue();
        }
        return ((_returnReplacementOperator2044.is("NULL")) ? ( null ) : (result));
    }

    public static boolean[] toPrimitive(final java.lang.Boolean[] array, final boolean valueForNull) {
        if (array == null) {
            return ((_returnReplacementOperator2045.is("NULL")) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperator2046.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_ARRAY));
        } 
        final boolean[] result = new boolean[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            final java.lang.Boolean b = array[i];
            result[i] = b == null ? valueForNull : b.booleanValue();
        }
        return ((_returnReplacementOperator2047.is("NULL")) ? ( null ) : (result));
    }

    public static java.lang.Boolean[] toObject(final boolean[] array) {
        if (array == null) {
            return ((_returnReplacementOperator2275.is("NULL")) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperator2276.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY));
        } 
        final java.lang.Boolean[] result = new java.lang.Boolean[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            result[i] = array[i] ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        }
        return ((_returnReplacementOperator2277.is("NULL")) ? ( null ) : (result));
    }

    public static boolean isEmpty(final java.lang.Object[] array) {
        return ((_returnReplacementOperator1976.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array)) == 0));
    }

    public static boolean isEmpty(final long[] array) {
        return ((_returnReplacementOperator1977.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array)) == 0));
    }

    public static boolean isEmpty(final int[] array) {
        return ((_returnReplacementOperator1975.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array)) == 0));
    }

    public static boolean isEmpty(final short[] array) {
        return ((_returnReplacementOperator1978.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array)) == 0));
    }

    public static boolean isEmpty(final char[] array) {
        return ((_returnReplacementOperator1972.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array)) == 0));
    }

    public static boolean isEmpty(final byte[] array) {
        return ((_returnReplacementOperator1971.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array)) == 0));
    }

    public static boolean isEmpty(final double[] array) {
        return ((_returnReplacementOperator1973.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array)) == 0));
    }

    public static boolean isEmpty(final float[] array) {
        return ((_returnReplacementOperator1974.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array)) == 0));
    }

    public static boolean isEmpty(final boolean[] array) {
        return ((_returnReplacementOperator1970.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.ArrayUtils.getLength(array)) == 0));
    }

    public static <T>boolean isNotEmpty(final T[] array) {
        return ((_returnReplacementOperator1956.is("NULL")) ? ( null ) : (!(org.apache.commons.lang3.ArrayUtils.isEmpty(array))));
    }

    public static boolean isNotEmpty(final long[] array) {
        return ((_returnReplacementOperator1986.is("NULL")) ? ( null ) : (!(org.apache.commons.lang3.ArrayUtils.isEmpty(array))));
    }

    public static boolean isNotEmpty(final int[] array) {
        return ((_returnReplacementOperator1985.is("NULL")) ? ( null ) : (!(org.apache.commons.lang3.ArrayUtils.isEmpty(array))));
    }

    public static boolean isNotEmpty(final short[] array) {
        return ((_returnReplacementOperator1987.is("NULL")) ? ( null ) : (!(org.apache.commons.lang3.ArrayUtils.isEmpty(array))));
    }

    public static boolean isNotEmpty(final char[] array) {
        return ((_returnReplacementOperator1982.is("NULL")) ? ( null ) : (!(org.apache.commons.lang3.ArrayUtils.isEmpty(array))));
    }

    public static boolean isNotEmpty(final byte[] array) {
        return ((_returnReplacementOperator1981.is("NULL")) ? ( null ) : (!(org.apache.commons.lang3.ArrayUtils.isEmpty(array))));
    }

    public static boolean isNotEmpty(final double[] array) {
        return ((_returnReplacementOperator1983.is("NULL")) ? ( null ) : (!(org.apache.commons.lang3.ArrayUtils.isEmpty(array))));
    }

    public static boolean isNotEmpty(final float[] array) {
        return ((_returnReplacementOperator1984.is("NULL")) ? ( null ) : (!(org.apache.commons.lang3.ArrayUtils.isEmpty(array))));
    }

    public static boolean isNotEmpty(final boolean[] array) {
        return ((_returnReplacementOperator1980.is("NULL")) ? ( null ) : (!(org.apache.commons.lang3.ArrayUtils.isEmpty(array))));
    }

    public static <T>T[] addAll(final T[] array1, final T... array2) {
        if (array1 == null) {
            return ((_returnReplacementOperator1937.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array2)));
        } else if (array2 == null) {
            return ((_returnReplacementOperator1938.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array1)));
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
        return ((_returnReplacementOperator1939.is("NULL")) ? ( null ) : (joinedArray));
    }

    public static boolean[] addAll(final boolean[] array1, final boolean... array2) {
        if (array1 == null) {
            return ((_returnReplacementOperator2024.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array2)));
        } else if (array2 == null) {
            return ((_returnReplacementOperator2025.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array1)));
        } 
        final boolean[] joinedArray = new boolean[(array1.length) + (array2.length)];
        java.lang.System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        java.lang.System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        return ((_returnReplacementOperator2026.is("NULL")) ? ( null ) : (joinedArray));
    }

    public static char[] addAll(final char[] array1, final char... array2) {
        if (array1 == null) {
            return ((_returnReplacementOperator2076.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array2)));
        } else if (array2 == null) {
            return ((_returnReplacementOperator2077.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array1)));
        } 
        final char[] joinedArray = new char[(array1.length) + (array2.length)];
        java.lang.System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        java.lang.System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        return ((_returnReplacementOperator2078.is("NULL")) ? ( null ) : (joinedArray));
    }

    public static byte[] addAll(final byte[] array1, final byte... array2) {
        if (array1 == null) {
            return ((_returnReplacementOperator2050.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array2)));
        } else if (array2 == null) {
            return ((_returnReplacementOperator2051.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array1)));
        } 
        final byte[] joinedArray = new byte[(array1.length) + (array2.length)];
        java.lang.System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        java.lang.System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        return ((_returnReplacementOperator2052.is("NULL")) ? ( null ) : (joinedArray));
    }

    public static short[] addAll(final short[] array1, final short... array2) {
        if (array1 == null) {
            return ((_returnReplacementOperator2359.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array2)));
        } else if (array2 == null) {
            return ((_returnReplacementOperator2360.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array1)));
        } 
        final short[] joinedArray = new short[(array1.length) + (array2.length)];
        java.lang.System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        java.lang.System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        return ((_returnReplacementOperator2361.is("NULL")) ? ( null ) : (joinedArray));
    }

    public static int[] addAll(final int[] array1, final int... array2) {
        if (array1 == null) {
            return ((_returnReplacementOperator2249.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array2)));
        } else if (array2 == null) {
            return ((_returnReplacementOperator2250.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array1)));
        } 
        final int[] joinedArray = new int[(array1.length) + (array2.length)];
        java.lang.System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        java.lang.System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        return ((_returnReplacementOperator2251.is("NULL")) ? ( null ) : (joinedArray));
    }

    public static long[] addAll(final long[] array1, final long... array2) {
        if (array1 == null) {
            return ((_returnReplacementOperator2333.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array2)));
        } else if (array2 == null) {
            return ((_returnReplacementOperator2334.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array1)));
        } 
        final long[] joinedArray = new long[(array1.length) + (array2.length)];
        java.lang.System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        java.lang.System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        return ((_returnReplacementOperator2335.is("NULL")) ? ( null ) : (joinedArray));
    }

    public static float[] addAll(final float[] array1, final float... array2) {
        if (array1 == null) {
            return ((_returnReplacementOperator2128.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array2)));
        } else if (array2 == null) {
            return ((_returnReplacementOperator2129.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array1)));
        } 
        final float[] joinedArray = new float[(array1.length) + (array2.length)];
        java.lang.System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        java.lang.System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        return ((_returnReplacementOperator2130.is("NULL")) ? ( null ) : (joinedArray));
    }

    public static double[] addAll(final double[] array1, final double... array2) {
        if (array1 == null) {
            return ((_returnReplacementOperator2102.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array2)));
        } else if (array2 == null) {
            return ((_returnReplacementOperator2103.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array1)));
        } 
        final double[] joinedArray = new double[(array1.length) + (array2.length)];
        java.lang.System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        java.lang.System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        return ((_returnReplacementOperator2104.is("NULL")) ? ( null ) : (joinedArray));
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
        return ((_returnReplacementOperator1935.is("NULL")) ? ( null ) : (newArray));
    }

    public static boolean[] add(final boolean[] array, final boolean element) {
        final boolean[] newArray = ((boolean[])(org.apache.commons.lang3.ArrayUtils.copyArrayGrow1(array, java.lang.Boolean.TYPE)));
        newArray[((newArray.length) - 1)] = element;
        return ((_returnReplacementOperator2022.is("NULL")) ? ( null ) : (newArray));
    }

    public static byte[] add(final byte[] array, final byte element) {
        final byte[] newArray = ((byte[])(org.apache.commons.lang3.ArrayUtils.copyArrayGrow1(array, java.lang.Byte.TYPE)));
        newArray[((newArray.length) - 1)] = element;
        return ((_returnReplacementOperator2048.is("NULL")) ? ( null ) : (newArray));
    }

    public static char[] add(final char[] array, final char element) {
        final char[] newArray = ((char[])(org.apache.commons.lang3.ArrayUtils.copyArrayGrow1(array, java.lang.Character.TYPE)));
        newArray[((newArray.length) - 1)] = element;
        return ((_returnReplacementOperator2074.is("NULL")) ? ( null ) : (newArray));
    }

    public static double[] add(final double[] array, final double element) {
        final double[] newArray = ((double[])(org.apache.commons.lang3.ArrayUtils.copyArrayGrow1(array, java.lang.Double.TYPE)));
        newArray[((newArray.length) - 1)] = element;
        return ((_returnReplacementOperator2100.is("NULL")) ? ( null ) : (newArray));
    }

    public static float[] add(final float[] array, final float element) {
        final float[] newArray = ((float[])(org.apache.commons.lang3.ArrayUtils.copyArrayGrow1(array, java.lang.Float.TYPE)));
        newArray[((newArray.length) - 1)] = element;
        return ((_returnReplacementOperator2126.is("NULL")) ? ( null ) : (newArray));
    }

    public static int[] add(final int[] array, final int element) {
        final int[] newArray = ((int[])(org.apache.commons.lang3.ArrayUtils.copyArrayGrow1(array, java.lang.Integer.TYPE)));
        newArray[((newArray.length) - 1)] = element;
        return ((_returnReplacementOperator2247.is("NULL")) ? ( null ) : (newArray));
    }

    public static long[] add(final long[] array, final long element) {
        final long[] newArray = ((long[])(org.apache.commons.lang3.ArrayUtils.copyArrayGrow1(array, java.lang.Long.TYPE)));
        newArray[((newArray.length) - 1)] = element;
        return ((_returnReplacementOperator2332.is("NULL")) ? ( null ) : (newArray));
    }

    public static short[] add(final short[] array, final short element) {
        final short[] newArray = ((short[])(org.apache.commons.lang3.ArrayUtils.copyArrayGrow1(array, java.lang.Short.TYPE)));
        newArray[((newArray.length) - 1)] = element;
        return ((_returnReplacementOperator2358.is("NULL")) ? ( null ) : (newArray));
    }

    private static java.lang.Object copyArrayGrow1(final java.lang.Object array, final java.lang.Class<?> newArrayComponentType) {
        if (array != null) {
            final int arrayLength = java.lang.reflect.Array.getLength(array);
            final java.lang.Object newArray = java.lang.reflect.Array.newInstance(array.getClass().getComponentType(), (arrayLength + 1));
            java.lang.System.arraycopy(array, 0, newArray, 0, arrayLength);
            return ((_returnReplacementOperator2312.is("NULL")) ? ( null ) : (newArray));
        } 
        return ((_returnReplacementOperator2313.is("NULL")) ? ( null ) : (java.lang.reflect.Array.newInstance(newArrayComponentType, 1)));
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
        return ((_returnReplacementOperator1936.is("NULL")) ? ( null ) : (newArray));
    }

    public static boolean[] add(final boolean[] array, final int index, final boolean element) {
        return ((_returnReplacementOperator2023.is("NULL")) ? ( null ) : (((boolean[])(org.apache.commons.lang3.ArrayUtils.add(array, index, java.lang.Boolean.valueOf(element), java.lang.Boolean.TYPE)))));
    }

    public static char[] add(final char[] array, final int index, final char element) {
        return ((_returnReplacementOperator2075.is("NULL")) ? ( null ) : (((char[])(org.apache.commons.lang3.ArrayUtils.add(array, index, java.lang.Character.valueOf(element), java.lang.Character.TYPE)))));
    }

    public static byte[] add(final byte[] array, final int index, final byte element) {
        return ((_returnReplacementOperator2049.is("NULL")) ? ( null ) : (((byte[])(org.apache.commons.lang3.ArrayUtils.add(array, index, java.lang.Byte.valueOf(element), java.lang.Byte.TYPE)))));
    }

    public static short[] add(final short[] array, final int index, final short element) {
        return ((_returnReplacementOperator2357.is("NULL")) ? ( null ) : (((short[])(org.apache.commons.lang3.ArrayUtils.add(array, index, java.lang.Short.valueOf(element), java.lang.Short.TYPE)))));
    }

    public static int[] add(final int[] array, final int index, final int element) {
        return ((_returnReplacementOperator2248.is("NULL")) ? ( null ) : (((int[])(org.apache.commons.lang3.ArrayUtils.add(array, index, java.lang.Integer.valueOf(element), java.lang.Integer.TYPE)))));
    }

    public static long[] add(final long[] array, final int index, final long element) {
        return ((_returnReplacementOperator2331.is("NULL")) ? ( null ) : (((long[])(org.apache.commons.lang3.ArrayUtils.add(array, index, java.lang.Long.valueOf(element), java.lang.Long.TYPE)))));
    }

    public static float[] add(final float[] array, final int index, final float element) {
        return ((_returnReplacementOperator2127.is("NULL")) ? ( null ) : (((float[])(org.apache.commons.lang3.ArrayUtils.add(array, index, java.lang.Float.valueOf(element), java.lang.Float.TYPE)))));
    }

    public static double[] add(final double[] array, final int index, final double element) {
        return ((_returnReplacementOperator2101.is("NULL")) ? ( null ) : (((double[])(org.apache.commons.lang3.ArrayUtils.add(array, index, java.lang.Double.valueOf(element), java.lang.Double.TYPE)))));
    }

    private static java.lang.Object add(final java.lang.Object array, final int index, final java.lang.Object element, final java.lang.Class<?> clss) {
        if (array == null) {
            if (index != 0) {
                throw new java.lang.IndexOutOfBoundsException((("Index: " + index) + ", Length: 0"));
            } 
            final java.lang.Object joinedArray = java.lang.reflect.Array.newInstance(clss, 1);
            java.lang.reflect.Array.set(joinedArray, 0, element);
            return ((_returnReplacementOperator2310.is("NULL")) ? ( null ) : (joinedArray));
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
        return ((_returnReplacementOperator2311.is("NULL")) ? ( null ) : (result));
    }

    @java.lang.SuppressWarnings(value = "unchecked")
    public static <T>T[] remove(final T[] array, final int index) {
        return ((_returnReplacementOperator1944.is("NULL")) ? ( null ) : (((T[])(org.apache.commons.lang3.ArrayUtils.remove(((java.lang.Object)(array)), index)))));
    }

    public static <T>T[] removeElement(final T[] array, final java.lang.Object element) {
        final int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperator1948.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        return ((_returnReplacementOperator1949.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.remove(array, index)));
    }

    public static boolean[] remove(final boolean[] array, final int index) {
        return ((_returnReplacementOperator2031.is("NULL")) ? ( null ) : (((boolean[])(org.apache.commons.lang3.ArrayUtils.remove(((java.lang.Object)(array)), index)))));
    }

    public static boolean[] removeElement(final boolean[] array, final boolean element) {
        final int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperator2035.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        return ((_returnReplacementOperator2036.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.remove(array, index)));
    }

    public static byte[] remove(final byte[] array, final int index) {
        return ((_returnReplacementOperator2057.is("NULL")) ? ( null ) : (((byte[])(org.apache.commons.lang3.ArrayUtils.remove(((java.lang.Object)(array)), index)))));
    }

    public static byte[] removeElement(final byte[] array, final byte element) {
        final int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperator2061.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        return ((_returnReplacementOperator2062.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.remove(array, index)));
    }

    public static char[] remove(final char[] array, final int index) {
        return ((_returnReplacementOperator2083.is("NULL")) ? ( null ) : (((char[])(org.apache.commons.lang3.ArrayUtils.remove(((java.lang.Object)(array)), index)))));
    }

    public static char[] removeElement(final char[] array, final char element) {
        final int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperator2087.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        return ((_returnReplacementOperator2088.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.remove(array, index)));
    }

    public static double[] remove(final double[] array, final int index) {
        return ((_returnReplacementOperator2109.is("NULL")) ? ( null ) : (((double[])(org.apache.commons.lang3.ArrayUtils.remove(((java.lang.Object)(array)), index)))));
    }

    public static double[] removeElement(final double[] array, final double element) {
        final int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperator2113.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        return ((_returnReplacementOperator2114.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.remove(array, index)));
    }

    public static float[] remove(final float[] array, final int index) {
        return ((_returnReplacementOperator2135.is("NULL")) ? ( null ) : (((float[])(org.apache.commons.lang3.ArrayUtils.remove(((java.lang.Object)(array)), index)))));
    }

    public static float[] removeElement(final float[] array, final float element) {
        final int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperator2139.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        return ((_returnReplacementOperator2140.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.remove(array, index)));
    }

    public static int[] remove(final int[] array, final int index) {
        return ((_returnReplacementOperator2256.is("NULL")) ? ( null ) : (((int[])(org.apache.commons.lang3.ArrayUtils.remove(((java.lang.Object)(array)), index)))));
    }

    public static int[] removeElement(final int[] array, final int element) {
        final int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperator2260.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        return ((_returnReplacementOperator2261.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.remove(array, index)));
    }

    public static long[] remove(final long[] array, final int index) {
        return ((_returnReplacementOperator2340.is("NULL")) ? ( null ) : (((long[])(org.apache.commons.lang3.ArrayUtils.remove(((java.lang.Object)(array)), index)))));
    }

    public static long[] removeElement(final long[] array, final long element) {
        final int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperator2344.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        return ((_returnReplacementOperator2345.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.remove(array, index)));
    }

    public static short[] remove(final short[] array, final int index) {
        return ((_returnReplacementOperator2366.is("NULL")) ? ( null ) : (((short[])(org.apache.commons.lang3.ArrayUtils.remove(((java.lang.Object)(array)), index)))));
    }

    public static short[] removeElement(final short[] array, final short element) {
        final int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperator2370.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        return ((_returnReplacementOperator2371.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.remove(array, index)));
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
        return ((_returnReplacementOperator2314.is("NULL")) ? ( null ) : (result));
    }

    @java.lang.SuppressWarnings(value = "unchecked")
    public static <T>T[] removeAll(final T[] array, final int... indices) {
        return ((_returnReplacementOperator1945.is("NULL")) ? ( null ) : (((T[])(org.apache.commons.lang3.ArrayUtils.removeAll(((java.lang.Object)(array)), org.apache.commons.lang3.ArrayUtils.clone(indices))))));
    }

    public static <T>T[] removeElements(final T[] array, final T... values) {
        if ((org.apache.commons.lang3.ArrayUtils.isEmpty(array)) || (org.apache.commons.lang3.ArrayUtils.isEmpty(values))) {
            return ((_returnReplacementOperator1950.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
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
        return ((_returnReplacementOperator1951.is("NULL")) ? ( null ) : (result));
    }

    public static byte[] removeAll(final byte[] array, final int... indices) {
        return ((_returnReplacementOperator2058.is("NULL")) ? ( null ) : (((byte[])(org.apache.commons.lang3.ArrayUtils.removeAll(((java.lang.Object)(array)), org.apache.commons.lang3.ArrayUtils.clone(indices))))));
    }

    public static byte[] removeElements(final byte[] array, final byte... values) {
        if ((org.apache.commons.lang3.ArrayUtils.isEmpty(array)) || (org.apache.commons.lang3.ArrayUtils.isEmpty(values))) {
            return ((_returnReplacementOperator2063.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
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
        return ((_returnReplacementOperator2064.is("NULL")) ? ( null ) : (((byte[])(org.apache.commons.lang3.ArrayUtils.removeAll(array, toRemove)))));
    }

    public static short[] removeAll(final short[] array, final int... indices) {
        return ((_returnReplacementOperator2367.is("NULL")) ? ( null ) : (((short[])(org.apache.commons.lang3.ArrayUtils.removeAll(((java.lang.Object)(array)), org.apache.commons.lang3.ArrayUtils.clone(indices))))));
    }

    public static short[] removeElements(final short[] array, final short... values) {
        if ((org.apache.commons.lang3.ArrayUtils.isEmpty(array)) || (org.apache.commons.lang3.ArrayUtils.isEmpty(values))) {
            return ((_returnReplacementOperator2372.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
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
        return ((_returnReplacementOperator2373.is("NULL")) ? ( null ) : (((short[])(org.apache.commons.lang3.ArrayUtils.removeAll(array, toRemove)))));
    }

    public static int[] removeAll(final int[] array, final int... indices) {
        return ((_returnReplacementOperator2257.is("NULL")) ? ( null ) : (((int[])(org.apache.commons.lang3.ArrayUtils.removeAll(((java.lang.Object)(array)), org.apache.commons.lang3.ArrayUtils.clone(indices))))));
    }

    public static int[] removeElements(final int[] array, final int... values) {
        if ((org.apache.commons.lang3.ArrayUtils.isEmpty(array)) || (org.apache.commons.lang3.ArrayUtils.isEmpty(values))) {
            return ((_returnReplacementOperator2262.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
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
        return ((_returnReplacementOperator2263.is("NULL")) ? ( null ) : (((int[])(org.apache.commons.lang3.ArrayUtils.removeAll(array, toRemove)))));
    }

    public static char[] removeAll(final char[] array, final int... indices) {
        return ((_returnReplacementOperator2084.is("NULL")) ? ( null ) : (((char[])(org.apache.commons.lang3.ArrayUtils.removeAll(((java.lang.Object)(array)), org.apache.commons.lang3.ArrayUtils.clone(indices))))));
    }

    public static char[] removeElements(final char[] array, final char... values) {
        if ((org.apache.commons.lang3.ArrayUtils.isEmpty(array)) || (org.apache.commons.lang3.ArrayUtils.isEmpty(values))) {
            return ((_returnReplacementOperator2089.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
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
        return ((_returnReplacementOperator2090.is("NULL")) ? ( null ) : (((char[])(org.apache.commons.lang3.ArrayUtils.removeAll(array, toRemove)))));
    }

    public static long[] removeAll(final long[] array, final int... indices) {
        return ((_returnReplacementOperator2341.is("NULL")) ? ( null ) : (((long[])(org.apache.commons.lang3.ArrayUtils.removeAll(((java.lang.Object)(array)), org.apache.commons.lang3.ArrayUtils.clone(indices))))));
    }

    public static long[] removeElements(final long[] array, final long... values) {
        if ((org.apache.commons.lang3.ArrayUtils.isEmpty(array)) || (org.apache.commons.lang3.ArrayUtils.isEmpty(values))) {
            return ((_returnReplacementOperator2346.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
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
        return ((_returnReplacementOperator2347.is("NULL")) ? ( null ) : (((long[])(org.apache.commons.lang3.ArrayUtils.removeAll(array, toRemove)))));
    }

    public static float[] removeAll(final float[] array, final int... indices) {
        return ((_returnReplacementOperator2136.is("NULL")) ? ( null ) : (((float[])(org.apache.commons.lang3.ArrayUtils.removeAll(((java.lang.Object)(array)), org.apache.commons.lang3.ArrayUtils.clone(indices))))));
    }

    public static float[] removeElements(final float[] array, final float... values) {
        if ((org.apache.commons.lang3.ArrayUtils.isEmpty(array)) || (org.apache.commons.lang3.ArrayUtils.isEmpty(values))) {
            return ((_returnReplacementOperator2141.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
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
        return ((_returnReplacementOperator2142.is("NULL")) ? ( null ) : (((float[])(org.apache.commons.lang3.ArrayUtils.removeAll(array, toRemove)))));
    }

    public static double[] removeAll(final double[] array, final int... indices) {
        return ((_returnReplacementOperator2110.is("NULL")) ? ( null ) : (((double[])(org.apache.commons.lang3.ArrayUtils.removeAll(((java.lang.Object)(array)), org.apache.commons.lang3.ArrayUtils.clone(indices))))));
    }

    public static double[] removeElements(final double[] array, final double... values) {
        if ((org.apache.commons.lang3.ArrayUtils.isEmpty(array)) || (org.apache.commons.lang3.ArrayUtils.isEmpty(values))) {
            return ((_returnReplacementOperator2115.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
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
        return ((_returnReplacementOperator2116.is("NULL")) ? ( null ) : (((double[])(org.apache.commons.lang3.ArrayUtils.removeAll(array, toRemove)))));
    }

    public static boolean[] removeAll(final boolean[] array, final int... indices) {
        return ((_returnReplacementOperator2032.is("NULL")) ? ( null ) : (((boolean[])(org.apache.commons.lang3.ArrayUtils.removeAll(((java.lang.Object)(array)), org.apache.commons.lang3.ArrayUtils.clone(indices))))));
    }

    public static boolean[] removeElements(final boolean[] array, final boolean... values) {
        if ((org.apache.commons.lang3.ArrayUtils.isEmpty(array)) || (org.apache.commons.lang3.ArrayUtils.isEmpty(values))) {
            return ((_returnReplacementOperator2037.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
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
        return ((_returnReplacementOperator2038.is("NULL")) ? ( null ) : (((boolean[])(org.apache.commons.lang3.ArrayUtils.removeAll(array, toRemove)))));
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
        return ((_returnReplacementOperator2315.is("NULL")) ? ( null ) : (result));
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
        return ((_returnReplacementOperator2316.is("NULL")) ? ( null ) : (result));
    }

    public static <T extends java.lang.Comparable<? super T>>boolean isSorted(final T[] array) {
        return ((_returnReplacementOperator1934.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.isSorted(array, new java.util.Comparator<T>() {
    @java.lang.Override
    public int compare(T o1, T o2) {
        return ((_returnReplacementOperator1933.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1933.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1933.is("ZERO")) ? ( 0 ) : (o1.compareTo(o2)));
    }
})));
    }

    public static <T>boolean isSorted(final T[] array, final java.util.Comparator<T> comparator) {
        if (comparator == null) {
            throw new java.lang.IllegalArgumentException("Comparator should not be null.");
        } 
        if ((array == null) || ((array.length) < 2)) {
            return ((_returnReplacementOperator1957.is("NULL")) ? ( null ) : (true));
        } 
        T previous = array[0];
        final int n = array.length;
        for (int i = 1 ; i < n ; i++) {
            final T current = array[i];
            if ((comparator.compare(previous, current)) > 0) {
                return ((_returnReplacementOperator1958.is("NULL")) ? ( null ) : (false));
            } 
            previous = current;
        }
        return ((_returnReplacementOperator1959.is("NULL")) ? ( null ) : (true));
    }

    public static boolean isSorted(int[] array) {
        if ((array == null) || ((array.length) < 2)) {
            return ((_returnReplacementOperator2013.is("NULL")) ? ( null ) : (true));
        } 
        int previous = array[0];
        final int n = array.length;
        for (int i = 1 ; i < n ; i++) {
            final int current = array[i];
            if ((org.apache.commons.lang3.math.NumberUtils.compare(previous, current)) > 0) {
                return ((_returnReplacementOperator2014.is("NULL")) ? ( null ) : (false));
            } 
            previous = current;
        }
        return ((_returnReplacementOperator2015.is("NULL")) ? ( null ) : (true));
    }

    public static boolean isSorted(long[] array) {
        if ((array == null) || ((array.length) < 2)) {
            return ((_returnReplacementOperator2016.is("NULL")) ? ( null ) : (true));
        } 
        long previous = array[0];
        final int n = array.length;
        for (int i = 1 ; i < n ; i++) {
            final long current = array[i];
            if ((org.apache.commons.lang3.math.NumberUtils.compare(previous, current)) > 0) {
                return ((_returnReplacementOperator2017.is("NULL")) ? ( null ) : (false));
            } 
            previous = current;
        }
        return ((_returnReplacementOperator2018.is("NULL")) ? ( null ) : (true));
    }

    public static boolean isSorted(short[] array) {
        if ((array == null) || ((array.length) < 2)) {
            return ((_returnReplacementOperator2019.is("NULL")) ? ( null ) : (true));
        } 
        short previous = array[0];
        final int n = array.length;
        for (int i = 1 ; i < n ; i++) {
            final short current = array[i];
            if ((org.apache.commons.lang3.math.NumberUtils.compare(previous, current)) > 0) {
                return ((_returnReplacementOperator2020.is("NULL")) ? ( null ) : (false));
            } 
            previous = current;
        }
        return ((_returnReplacementOperator2021.is("NULL")) ? ( null ) : (true));
    }

    public static boolean isSorted(final double[] array) {
        if ((array == null) || ((array.length) < 2)) {
            return ((_returnReplacementOperator2007.is("NULL")) ? ( null ) : (true));
        } 
        double previous = array[0];
        final int n = array.length;
        for (int i = 1 ; i < n ; i++) {
            final double current = array[i];
            if ((java.lang.Double.compare(previous, current)) > 0) {
                return ((_returnReplacementOperator2008.is("NULL")) ? ( null ) : (false));
            } 
            previous = current;
        }
        return ((_returnReplacementOperator2009.is("NULL")) ? ( null ) : (true));
    }

    public static boolean isSorted(final float[] array) {
        if ((array == null) || ((array.length) < 2)) {
            return ((_returnReplacementOperator2010.is("NULL")) ? ( null ) : (true));
        } 
        float previous = array[0];
        final int n = array.length;
        for (int i = 1 ; i < n ; i++) {
            final float current = array[i];
            if ((java.lang.Float.compare(previous, current)) > 0) {
                return ((_returnReplacementOperator2011.is("NULL")) ? ( null ) : (false));
            } 
            previous = current;
        }
        return ((_returnReplacementOperator2012.is("NULL")) ? ( null ) : (true));
    }

    public static boolean isSorted(byte[] array) {
        if ((array == null) || ((array.length) < 2)) {
            return ((_returnReplacementOperator2001.is("NULL")) ? ( null ) : (true));
        } 
        byte previous = array[0];
        final int n = array.length;
        for (int i = 1 ; i < n ; i++) {
            final byte current = array[i];
            if ((org.apache.commons.lang3.math.NumberUtils.compare(previous, current)) > 0) {
                return ((_returnReplacementOperator2002.is("NULL")) ? ( null ) : (false));
            } 
            previous = current;
        }
        return ((_returnReplacementOperator2003.is("NULL")) ? ( null ) : (true));
    }

    public static boolean isSorted(char[] array) {
        if ((array == null) || ((array.length) < 2)) {
            return ((_returnReplacementOperator2004.is("NULL")) ? ( null ) : (true));
        } 
        char previous = array[0];
        final int n = array.length;
        for (int i = 1 ; i < n ; i++) {
            final char current = array[i];
            if ((org.apache.commons.lang3.CharUtils.compare(previous, current)) > 0) {
                return ((_returnReplacementOperator2005.is("NULL")) ? ( null ) : (false));
            } 
            previous = current;
        }
        return ((_returnReplacementOperator2006.is("NULL")) ? ( null ) : (true));
    }

    public static boolean isSorted(boolean[] array) {
        if ((array == null) || ((array.length) < 2)) {
            return ((_returnReplacementOperator1998.is("NULL")) ? ( null ) : (true));
        } 
        boolean previous = array[0];
        final int n = array.length;
        for (int i = 1 ; i < n ; i++) {
            final boolean current = array[i];
            if ((org.apache.commons.lang3.BooleanUtils.compare(previous, current)) > 0) {
                return ((_returnReplacementOperator1999.is("NULL")) ? ( null ) : (false));
            } 
            previous = current;
        }
        return ((_returnReplacementOperator2000.is("NULL")) ? ( null ) : (true));
    }

    public static boolean[] removeAllOccurences(final boolean[] array, final boolean element) {
        int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperator2033.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        int[] indices = new int[(array.length) - index];
        indices[0] = index;
        int count = 1;
        while ((index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element, ((indices[(count - 1)]) + 1))) != (INDEX_NOT_FOUND)) {
            indices[count++] = index;
        }
        return ((_returnReplacementOperator2034.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.removeAll(array, java.util.Arrays.copyOf(indices, count))));
    }

    public static char[] removeAllOccurences(final char[] array, final char element) {
        int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperator2085.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        int[] indices = new int[(array.length) - index];
        indices[0] = index;
        int count = 1;
        while ((index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element, ((indices[(count - 1)]) + 1))) != (INDEX_NOT_FOUND)) {
            indices[count++] = index;
        }
        return ((_returnReplacementOperator2086.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.removeAll(array, java.util.Arrays.copyOf(indices, count))));
    }

    public static byte[] removeAllOccurences(final byte[] array, final byte element) {
        int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperator2059.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        int[] indices = new int[(array.length) - index];
        indices[0] = index;
        int count = 1;
        while ((index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element, ((indices[(count - 1)]) + 1))) != (INDEX_NOT_FOUND)) {
            indices[count++] = index;
        }
        return ((_returnReplacementOperator2060.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.removeAll(array, java.util.Arrays.copyOf(indices, count))));
    }

    public static short[] removeAllOccurences(final short[] array, final short element) {
        int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperator2368.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        int[] indices = new int[(array.length) - index];
        indices[0] = index;
        int count = 1;
        while ((index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element, ((indices[(count - 1)]) + 1))) != (INDEX_NOT_FOUND)) {
            indices[count++] = index;
        }
        return ((_returnReplacementOperator2369.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.removeAll(array, java.util.Arrays.copyOf(indices, count))));
    }

    public static int[] removeAllOccurences(final int[] array, final int element) {
        int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperator2258.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        int[] indices = new int[(array.length) - index];
        indices[0] = index;
        int count = 1;
        while ((index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element, ((indices[(count - 1)]) + 1))) != (INDEX_NOT_FOUND)) {
            indices[count++] = index;
        }
        return ((_returnReplacementOperator2259.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.removeAll(array, java.util.Arrays.copyOf(indices, count))));
    }

    public static long[] removeAllOccurences(final long[] array, final long element) {
        int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperator2342.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        int[] indices = new int[(array.length) - index];
        indices[0] = index;
        int count = 1;
        while ((index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element, ((indices[(count - 1)]) + 1))) != (INDEX_NOT_FOUND)) {
            indices[count++] = index;
        }
        return ((_returnReplacementOperator2343.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.removeAll(array, java.util.Arrays.copyOf(indices, count))));
    }

    public static float[] removeAllOccurences(final float[] array, final float element) {
        int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperator2137.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        int[] indices = new int[(array.length) - index];
        indices[0] = index;
        int count = 1;
        while ((index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element, ((indices[(count - 1)]) + 1))) != (INDEX_NOT_FOUND)) {
            indices[count++] = index;
        }
        return ((_returnReplacementOperator2138.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.removeAll(array, java.util.Arrays.copyOf(indices, count))));
    }

    public static double[] removeAllOccurences(final double[] array, final double element) {
        int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperator2111.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        int[] indices = new int[(array.length) - index];
        indices[0] = index;
        int count = 1;
        while ((index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element, ((indices[(count - 1)]) + 1))) != (INDEX_NOT_FOUND)) {
            indices[count++] = index;
        }
        return ((_returnReplacementOperator2112.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.removeAll(array, java.util.Arrays.copyOf(indices, count))));
    }

    public static <T>T[] removeAllOccurences(final T[] array, final T element) {
        int index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element);
        if (index == (INDEX_NOT_FOUND)) {
            return ((_returnReplacementOperator1946.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(array)));
        } 
        int[] indices = new int[(array.length) - index];
        indices[0] = index;
        int count = 1;
        while ((index = org.apache.commons.lang3.ArrayUtils.indexOf(array, element, ((indices[(count - 1)]) + 1))) != (INDEX_NOT_FOUND)) {
            indices[count++] = index;
        }
        return ((_returnReplacementOperator1947.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.removeAll(array, java.util.Arrays.copyOf(indices, count))));
    }

    private static final metamutator.Selector _returnReplacementOperator1933 = metamutator.Selector.of(1933,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator1933");

    private static final metamutator.Selector _returnReplacementOperator1934 = metamutator.Selector.of(1934,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1934");

    private static final metamutator.Selector _returnReplacementOperator1935 = metamutator.Selector.of(1935,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1935");

    private static final metamutator.Selector _returnReplacementOperator1936 = metamutator.Selector.of(1936,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1936");

    private static final metamutator.Selector _returnReplacementOperator1937 = metamutator.Selector.of(1937,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1937");

    private static final metamutator.Selector _returnReplacementOperator1938 = metamutator.Selector.of(1938,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1938");

    private static final metamutator.Selector _returnReplacementOperator1939 = metamutator.Selector.of(1939,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1939");

    private static final metamutator.Selector _returnReplacementOperator1940 = metamutator.Selector.of(1940,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1940");

    private static final metamutator.Selector _returnReplacementOperator1941 = metamutator.Selector.of(1941,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1941");

    private static final metamutator.Selector _returnReplacementOperator1942 = metamutator.Selector.of(1942,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1942");

    private static final metamutator.Selector _returnReplacementOperator1943 = metamutator.Selector.of(1943,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1943");

    private static final metamutator.Selector _returnReplacementOperator1944 = metamutator.Selector.of(1944,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1944");

    private static final metamutator.Selector _returnReplacementOperator1945 = metamutator.Selector.of(1945,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1945");

    private static final metamutator.Selector _returnReplacementOperator1946 = metamutator.Selector.of(1946,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1946");

    private static final metamutator.Selector _returnReplacementOperator1947 = metamutator.Selector.of(1947,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1947");

    private static final metamutator.Selector _returnReplacementOperator1948 = metamutator.Selector.of(1948,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1948");

    private static final metamutator.Selector _returnReplacementOperator1949 = metamutator.Selector.of(1949,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1949");

    private static final metamutator.Selector _returnReplacementOperator1950 = metamutator.Selector.of(1950,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1950");

    private static final metamutator.Selector _returnReplacementOperator1951 = metamutator.Selector.of(1951,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1951");

    private static final metamutator.Selector _returnReplacementOperator1952 = metamutator.Selector.of(1952,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1952");

    private static final metamutator.Selector _returnReplacementOperator1953 = metamutator.Selector.of(1953,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1953");

    private static final metamutator.Selector _returnReplacementOperator1954 = metamutator.Selector.of(1954,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1954");

    private static final metamutator.Selector _returnReplacementOperator1955 = metamutator.Selector.of(1955,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1955");

    private static final metamutator.Selector _returnReplacementOperator1956 = metamutator.Selector.of(1956,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1956");

    private static final metamutator.Selector _returnReplacementOperator1957 = metamutator.Selector.of(1957,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1957");

    private static final metamutator.Selector _returnReplacementOperator1958 = metamutator.Selector.of(1958,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1958");

    private static final metamutator.Selector _returnReplacementOperator1959 = metamutator.Selector.of(1959,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1959");

    private static final metamutator.Selector _returnReplacementOperator1960 = metamutator.Selector.of(1960,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1960");

    private static final metamutator.Selector _returnReplacementOperator1961 = metamutator.Selector.of(1961,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1961");

    private static final metamutator.Selector _returnReplacementOperator1962 = metamutator.Selector.of(1962,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1962");

    private static final metamutator.Selector _returnReplacementOperator1963 = metamutator.Selector.of(1963,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1963");

    private static final metamutator.Selector _returnReplacementOperator1964 = metamutator.Selector.of(1964,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1964");

    private static final metamutator.Selector _returnReplacementOperator1965 = metamutator.Selector.of(1965,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1965");

    private static final metamutator.Selector _returnReplacementOperator1966 = metamutator.Selector.of(1966,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1966");

    private static final metamutator.Selector _returnReplacementOperator1967 = metamutator.Selector.of(1967,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1967");

    private static final metamutator.Selector _returnReplacementOperator1968 = metamutator.Selector.of(1968,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1968");

    private static final metamutator.Selector _returnReplacementOperator1969 = metamutator.Selector.of(1969,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1969");

    private static final metamutator.Selector _returnReplacementOperator1970 = metamutator.Selector.of(1970,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1970");

    private static final metamutator.Selector _returnReplacementOperator1971 = metamutator.Selector.of(1971,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1971");

    private static final metamutator.Selector _returnReplacementOperator1972 = metamutator.Selector.of(1972,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1972");

    private static final metamutator.Selector _returnReplacementOperator1973 = metamutator.Selector.of(1973,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1973");

    private static final metamutator.Selector _returnReplacementOperator1974 = metamutator.Selector.of(1974,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1974");

    private static final metamutator.Selector _returnReplacementOperator1975 = metamutator.Selector.of(1975,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1975");

    private static final metamutator.Selector _returnReplacementOperator1976 = metamutator.Selector.of(1976,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1976");

    private static final metamutator.Selector _returnReplacementOperator1977 = metamutator.Selector.of(1977,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1977");

    private static final metamutator.Selector _returnReplacementOperator1978 = metamutator.Selector.of(1978,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1978");

    private static final metamutator.Selector _returnReplacementOperator1979 = metamutator.Selector.of(1979,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1979");

    private static final metamutator.Selector _returnReplacementOperator1980 = metamutator.Selector.of(1980,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1980");

    private static final metamutator.Selector _returnReplacementOperator1981 = metamutator.Selector.of(1981,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1981");

    private static final metamutator.Selector _returnReplacementOperator1982 = metamutator.Selector.of(1982,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1982");

    private static final metamutator.Selector _returnReplacementOperator1983 = metamutator.Selector.of(1983,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1983");

    private static final metamutator.Selector _returnReplacementOperator1984 = metamutator.Selector.of(1984,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1984");

    private static final metamutator.Selector _returnReplacementOperator1985 = metamutator.Selector.of(1985,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1985");

    private static final metamutator.Selector _returnReplacementOperator1986 = metamutator.Selector.of(1986,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1986");

    private static final metamutator.Selector _returnReplacementOperator1987 = metamutator.Selector.of(1987,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1987");

    private static final metamutator.Selector _returnReplacementOperator1988 = metamutator.Selector.of(1988,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1988");

    private static final metamutator.Selector _returnReplacementOperator1989 = metamutator.Selector.of(1989,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1989");

    private static final metamutator.Selector _returnReplacementOperator1990 = metamutator.Selector.of(1990,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1990");

    private static final metamutator.Selector _returnReplacementOperator1991 = metamutator.Selector.of(1991,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1991");

    private static final metamutator.Selector _returnReplacementOperator1992 = metamutator.Selector.of(1992,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1992");

    private static final metamutator.Selector _returnReplacementOperator1993 = metamutator.Selector.of(1993,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1993");

    private static final metamutator.Selector _returnReplacementOperator1994 = metamutator.Selector.of(1994,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1994");

    private static final metamutator.Selector _returnReplacementOperator1995 = metamutator.Selector.of(1995,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1995");

    private static final metamutator.Selector _returnReplacementOperator1996 = metamutator.Selector.of(1996,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1996");

    private static final metamutator.Selector _returnReplacementOperator1997 = metamutator.Selector.of(1997,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1997");

    private static final metamutator.Selector _returnReplacementOperator1998 = metamutator.Selector.of(1998,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1998");

    private static final metamutator.Selector _returnReplacementOperator1999 = metamutator.Selector.of(1999,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator1999");

    private static final metamutator.Selector _returnReplacementOperator2000 = metamutator.Selector.of(2000,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2000");

    private static final metamutator.Selector _returnReplacementOperator2001 = metamutator.Selector.of(2001,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2001");

    private static final metamutator.Selector _returnReplacementOperator2002 = metamutator.Selector.of(2002,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2002");

    private static final metamutator.Selector _returnReplacementOperator2003 = metamutator.Selector.of(2003,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2003");

    private static final metamutator.Selector _returnReplacementOperator2004 = metamutator.Selector.of(2004,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2004");

    private static final metamutator.Selector _returnReplacementOperator2005 = metamutator.Selector.of(2005,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2005");

    private static final metamutator.Selector _returnReplacementOperator2006 = metamutator.Selector.of(2006,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2006");

    private static final metamutator.Selector _returnReplacementOperator2007 = metamutator.Selector.of(2007,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2007");

    private static final metamutator.Selector _returnReplacementOperator2008 = metamutator.Selector.of(2008,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2008");

    private static final metamutator.Selector _returnReplacementOperator2009 = metamutator.Selector.of(2009,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2009");

    private static final metamutator.Selector _returnReplacementOperator2010 = metamutator.Selector.of(2010,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2010");

    private static final metamutator.Selector _returnReplacementOperator2011 = metamutator.Selector.of(2011,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2011");

    private static final metamutator.Selector _returnReplacementOperator2012 = metamutator.Selector.of(2012,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2012");

    private static final metamutator.Selector _returnReplacementOperator2013 = metamutator.Selector.of(2013,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2013");

    private static final metamutator.Selector _returnReplacementOperator2014 = metamutator.Selector.of(2014,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2014");

    private static final metamutator.Selector _returnReplacementOperator2015 = metamutator.Selector.of(2015,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2015");

    private static final metamutator.Selector _returnReplacementOperator2016 = metamutator.Selector.of(2016,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2016");

    private static final metamutator.Selector _returnReplacementOperator2017 = metamutator.Selector.of(2017,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2017");

    private static final metamutator.Selector _returnReplacementOperator2018 = metamutator.Selector.of(2018,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2018");

    private static final metamutator.Selector _returnReplacementOperator2019 = metamutator.Selector.of(2019,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2019");

    private static final metamutator.Selector _returnReplacementOperator2020 = metamutator.Selector.of(2020,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2020");

    private static final metamutator.Selector _returnReplacementOperator2021 = metamutator.Selector.of(2021,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2021");

    private static final metamutator.Selector _returnReplacementOperator2022 = metamutator.Selector.of(2022,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2022");

    private static final metamutator.Selector _returnReplacementOperator2023 = metamutator.Selector.of(2023,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2023");

    private static final metamutator.Selector _returnReplacementOperator2024 = metamutator.Selector.of(2024,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2024");

    private static final metamutator.Selector _returnReplacementOperator2025 = metamutator.Selector.of(2025,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2025");

    private static final metamutator.Selector _returnReplacementOperator2026 = metamutator.Selector.of(2026,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2026");

    private static final metamutator.Selector _returnReplacementOperator2027 = metamutator.Selector.of(2027,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2027");

    private static final metamutator.Selector _returnReplacementOperator2028 = metamutator.Selector.of(2028,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2028");

    private static final metamutator.Selector _returnReplacementOperator2029 = metamutator.Selector.of(2029,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2029");

    private static final metamutator.Selector _returnReplacementOperator2030 = metamutator.Selector.of(2030,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2030");

    private static final metamutator.Selector _returnReplacementOperator2031 = metamutator.Selector.of(2031,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2031");

    private static final metamutator.Selector _returnReplacementOperator2032 = metamutator.Selector.of(2032,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2032");

    private static final metamutator.Selector _returnReplacementOperator2033 = metamutator.Selector.of(2033,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2033");

    private static final metamutator.Selector _returnReplacementOperator2034 = metamutator.Selector.of(2034,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2034");

    private static final metamutator.Selector _returnReplacementOperator2035 = metamutator.Selector.of(2035,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2035");

    private static final metamutator.Selector _returnReplacementOperator2036 = metamutator.Selector.of(2036,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2036");

    private static final metamutator.Selector _returnReplacementOperator2037 = metamutator.Selector.of(2037,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2037");

    private static final metamutator.Selector _returnReplacementOperator2038 = metamutator.Selector.of(2038,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2038");

    private static final metamutator.Selector _returnReplacementOperator2039 = metamutator.Selector.of(2039,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2039");

    private static final metamutator.Selector _returnReplacementOperator2040 = metamutator.Selector.of(2040,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2040");

    private static final metamutator.Selector _returnReplacementOperator2041 = metamutator.Selector.of(2041,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2041");

    private static final metamutator.Selector _returnReplacementOperator2042 = metamutator.Selector.of(2042,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2042");

    private static final metamutator.Selector _returnReplacementOperator2043 = metamutator.Selector.of(2043,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2043");

    private static final metamutator.Selector _returnReplacementOperator2044 = metamutator.Selector.of(2044,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2044");

    private static final metamutator.Selector _returnReplacementOperator2045 = metamutator.Selector.of(2045,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2045");

    private static final metamutator.Selector _returnReplacementOperator2046 = metamutator.Selector.of(2046,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2046");

    private static final metamutator.Selector _returnReplacementOperator2047 = metamutator.Selector.of(2047,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2047");

    private static final metamutator.Selector _returnReplacementOperator2048 = metamutator.Selector.of(2048,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2048");

    private static final metamutator.Selector _returnReplacementOperator2049 = metamutator.Selector.of(2049,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2049");

    private static final metamutator.Selector _returnReplacementOperator2050 = metamutator.Selector.of(2050,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2050");

    private static final metamutator.Selector _returnReplacementOperator2051 = metamutator.Selector.of(2051,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2051");

    private static final metamutator.Selector _returnReplacementOperator2052 = metamutator.Selector.of(2052,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2052");

    private static final metamutator.Selector _returnReplacementOperator2053 = metamutator.Selector.of(2053,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2053");

    private static final metamutator.Selector _returnReplacementOperator2054 = metamutator.Selector.of(2054,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2054");

    private static final metamutator.Selector _returnReplacementOperator2055 = metamutator.Selector.of(2055,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2055");

    private static final metamutator.Selector _returnReplacementOperator2056 = metamutator.Selector.of(2056,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2056");

    private static final metamutator.Selector _returnReplacementOperator2057 = metamutator.Selector.of(2057,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2057");

    private static final metamutator.Selector _returnReplacementOperator2058 = metamutator.Selector.of(2058,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2058");

    private static final metamutator.Selector _returnReplacementOperator2059 = metamutator.Selector.of(2059,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2059");

    private static final metamutator.Selector _returnReplacementOperator2060 = metamutator.Selector.of(2060,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2060");

    private static final metamutator.Selector _returnReplacementOperator2061 = metamutator.Selector.of(2061,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2061");

    private static final metamutator.Selector _returnReplacementOperator2062 = metamutator.Selector.of(2062,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2062");

    private static final metamutator.Selector _returnReplacementOperator2063 = metamutator.Selector.of(2063,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2063");

    private static final metamutator.Selector _returnReplacementOperator2064 = metamutator.Selector.of(2064,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2064");

    private static final metamutator.Selector _returnReplacementOperator2065 = metamutator.Selector.of(2065,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2065");

    private static final metamutator.Selector _returnReplacementOperator2066 = metamutator.Selector.of(2066,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2066");

    private static final metamutator.Selector _returnReplacementOperator2067 = metamutator.Selector.of(2067,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2067");

    private static final metamutator.Selector _returnReplacementOperator2068 = metamutator.Selector.of(2068,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2068");

    private static final metamutator.Selector _returnReplacementOperator2069 = metamutator.Selector.of(2069,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2069");

    private static final metamutator.Selector _returnReplacementOperator2070 = metamutator.Selector.of(2070,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2070");

    private static final metamutator.Selector _returnReplacementOperator2071 = metamutator.Selector.of(2071,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2071");

    private static final metamutator.Selector _returnReplacementOperator2072 = metamutator.Selector.of(2072,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2072");

    private static final metamutator.Selector _returnReplacementOperator2073 = metamutator.Selector.of(2073,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2073");

    private static final metamutator.Selector _returnReplacementOperator2074 = metamutator.Selector.of(2074,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2074");

    private static final metamutator.Selector _returnReplacementOperator2075 = metamutator.Selector.of(2075,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2075");

    private static final metamutator.Selector _returnReplacementOperator2076 = metamutator.Selector.of(2076,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2076");

    private static final metamutator.Selector _returnReplacementOperator2077 = metamutator.Selector.of(2077,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2077");

    private static final metamutator.Selector _returnReplacementOperator2078 = metamutator.Selector.of(2078,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2078");

    private static final metamutator.Selector _returnReplacementOperator2079 = metamutator.Selector.of(2079,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2079");

    private static final metamutator.Selector _returnReplacementOperator2080 = metamutator.Selector.of(2080,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2080");

    private static final metamutator.Selector _returnReplacementOperator2081 = metamutator.Selector.of(2081,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2081");

    private static final metamutator.Selector _returnReplacementOperator2082 = metamutator.Selector.of(2082,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2082");

    private static final metamutator.Selector _returnReplacementOperator2083 = metamutator.Selector.of(2083,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2083");

    private static final metamutator.Selector _returnReplacementOperator2084 = metamutator.Selector.of(2084,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2084");

    private static final metamutator.Selector _returnReplacementOperator2085 = metamutator.Selector.of(2085,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2085");

    private static final metamutator.Selector _returnReplacementOperator2086 = metamutator.Selector.of(2086,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2086");

    private static final metamutator.Selector _returnReplacementOperator2087 = metamutator.Selector.of(2087,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2087");

    private static final metamutator.Selector _returnReplacementOperator2088 = metamutator.Selector.of(2088,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2088");

    private static final metamutator.Selector _returnReplacementOperator2089 = metamutator.Selector.of(2089,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2089");

    private static final metamutator.Selector _returnReplacementOperator2090 = metamutator.Selector.of(2090,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2090");

    private static final metamutator.Selector _returnReplacementOperator2091 = metamutator.Selector.of(2091,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2091");

    private static final metamutator.Selector _returnReplacementOperator2092 = metamutator.Selector.of(2092,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2092");

    private static final metamutator.Selector _returnReplacementOperator2093 = metamutator.Selector.of(2093,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2093");

    private static final metamutator.Selector _returnReplacementOperator2094 = metamutator.Selector.of(2094,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2094");

    private static final metamutator.Selector _returnReplacementOperator2095 = metamutator.Selector.of(2095,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2095");

    private static final metamutator.Selector _returnReplacementOperator2096 = metamutator.Selector.of(2096,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2096");

    private static final metamutator.Selector _returnReplacementOperator2097 = metamutator.Selector.of(2097,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2097");

    private static final metamutator.Selector _returnReplacementOperator2098 = metamutator.Selector.of(2098,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2098");

    private static final metamutator.Selector _returnReplacementOperator2099 = metamutator.Selector.of(2099,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2099");

    private static final metamutator.Selector _returnReplacementOperator2100 = metamutator.Selector.of(2100,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2100");

    private static final metamutator.Selector _returnReplacementOperator2101 = metamutator.Selector.of(2101,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2101");

    private static final metamutator.Selector _returnReplacementOperator2102 = metamutator.Selector.of(2102,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2102");

    private static final metamutator.Selector _returnReplacementOperator2103 = metamutator.Selector.of(2103,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2103");

    private static final metamutator.Selector _returnReplacementOperator2104 = metamutator.Selector.of(2104,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2104");

    private static final metamutator.Selector _returnReplacementOperator2105 = metamutator.Selector.of(2105,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2105");

    private static final metamutator.Selector _returnReplacementOperator2106 = metamutator.Selector.of(2106,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2106");

    private static final metamutator.Selector _returnReplacementOperator2107 = metamutator.Selector.of(2107,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2107");

    private static final metamutator.Selector _returnReplacementOperator2108 = metamutator.Selector.of(2108,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2108");

    private static final metamutator.Selector _returnReplacementOperator2109 = metamutator.Selector.of(2109,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2109");

    private static final metamutator.Selector _returnReplacementOperator2110 = metamutator.Selector.of(2110,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2110");

    private static final metamutator.Selector _returnReplacementOperator2111 = metamutator.Selector.of(2111,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2111");

    private static final metamutator.Selector _returnReplacementOperator2112 = metamutator.Selector.of(2112,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2112");

    private static final metamutator.Selector _returnReplacementOperator2113 = metamutator.Selector.of(2113,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2113");

    private static final metamutator.Selector _returnReplacementOperator2114 = metamutator.Selector.of(2114,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2114");

    private static final metamutator.Selector _returnReplacementOperator2115 = metamutator.Selector.of(2115,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2115");

    private static final metamutator.Selector _returnReplacementOperator2116 = metamutator.Selector.of(2116,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2116");

    private static final metamutator.Selector _returnReplacementOperator2117 = metamutator.Selector.of(2117,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2117");

    private static final metamutator.Selector _returnReplacementOperator2118 = metamutator.Selector.of(2118,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2118");

    private static final metamutator.Selector _returnReplacementOperator2119 = metamutator.Selector.of(2119,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2119");

    private static final metamutator.Selector _returnReplacementOperator2120 = metamutator.Selector.of(2120,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2120");

    private static final metamutator.Selector _returnReplacementOperator2121 = metamutator.Selector.of(2121,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2121");

    private static final metamutator.Selector _returnReplacementOperator2122 = metamutator.Selector.of(2122,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2122");

    private static final metamutator.Selector _returnReplacementOperator2123 = metamutator.Selector.of(2123,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2123");

    private static final metamutator.Selector _returnReplacementOperator2124 = metamutator.Selector.of(2124,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2124");

    private static final metamutator.Selector _returnReplacementOperator2125 = metamutator.Selector.of(2125,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2125");

    private static final metamutator.Selector _returnReplacementOperator2126 = metamutator.Selector.of(2126,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2126");

    private static final metamutator.Selector _returnReplacementOperator2127 = metamutator.Selector.of(2127,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2127");

    private static final metamutator.Selector _returnReplacementOperator2128 = metamutator.Selector.of(2128,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2128");

    private static final metamutator.Selector _returnReplacementOperator2129 = metamutator.Selector.of(2129,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2129");

    private static final metamutator.Selector _returnReplacementOperator2130 = metamutator.Selector.of(2130,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2130");

    private static final metamutator.Selector _returnReplacementOperator2131 = metamutator.Selector.of(2131,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2131");

    private static final metamutator.Selector _returnReplacementOperator2132 = metamutator.Selector.of(2132,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2132");

    private static final metamutator.Selector _returnReplacementOperator2133 = metamutator.Selector.of(2133,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2133");

    private static final metamutator.Selector _returnReplacementOperator2134 = metamutator.Selector.of(2134,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2134");

    private static final metamutator.Selector _returnReplacementOperator2135 = metamutator.Selector.of(2135,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2135");

    private static final metamutator.Selector _returnReplacementOperator2136 = metamutator.Selector.of(2136,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2136");

    private static final metamutator.Selector _returnReplacementOperator2137 = metamutator.Selector.of(2137,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2137");

    private static final metamutator.Selector _returnReplacementOperator2138 = metamutator.Selector.of(2138,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2138");

    private static final metamutator.Selector _returnReplacementOperator2139 = metamutator.Selector.of(2139,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2139");

    private static final metamutator.Selector _returnReplacementOperator2140 = metamutator.Selector.of(2140,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2140");

    private static final metamutator.Selector _returnReplacementOperator2141 = metamutator.Selector.of(2141,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2141");

    private static final metamutator.Selector _returnReplacementOperator2142 = metamutator.Selector.of(2142,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2142");

    private static final metamutator.Selector _returnReplacementOperator2143 = metamutator.Selector.of(2143,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2143");

    private static final metamutator.Selector _returnReplacementOperator2144 = metamutator.Selector.of(2144,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2144");

    private static final metamutator.Selector _returnReplacementOperator2145 = metamutator.Selector.of(2145,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2145");

    private static final metamutator.Selector _returnReplacementOperator2146 = metamutator.Selector.of(2146,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2146");

    private static final metamutator.Selector _returnReplacementOperator2147 = metamutator.Selector.of(2147,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2147");

    private static final metamutator.Selector _returnReplacementOperator2148 = metamutator.Selector.of(2148,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2148");

    private static final metamutator.Selector _returnReplacementOperator2149 = metamutator.Selector.of(2149,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2149");

    private static final metamutator.Selector _returnReplacementOperator2150 = metamutator.Selector.of(2150,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2150");

    private static final metamutator.Selector _returnReplacementOperator2151 = metamutator.Selector.of(2151,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2151");

    private static final metamutator.Selector _returnReplacementOperator2152 = metamutator.Selector.of(2152,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2152");

    private static final metamutator.Selector _returnReplacementOperator2153 = metamutator.Selector.of(2153,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2153");

    private static final metamutator.Selector _returnReplacementOperator2154 = metamutator.Selector.of(2154,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2154");

    private static final metamutator.Selector _returnReplacementOperator2155 = metamutator.Selector.of(2155,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2155");

    private static final metamutator.Selector _returnReplacementOperator2156 = metamutator.Selector.of(2156,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2156");

    private static final metamutator.Selector _returnReplacementOperator2157 = metamutator.Selector.of(2157,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2157");

    private static final metamutator.Selector _returnReplacementOperator2158 = metamutator.Selector.of(2158,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2158");

    private static final metamutator.Selector _returnReplacementOperator2159 = metamutator.Selector.of(2159,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2159");

    private static final metamutator.Selector _returnReplacementOperator2160 = metamutator.Selector.of(2160,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2160");

    private static final metamutator.Selector _returnReplacementOperator2161 = metamutator.Selector.of(2161,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2161");

    private static final metamutator.Selector _returnReplacementOperator2162 = metamutator.Selector.of(2162,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2162");

    private static final metamutator.Selector _returnReplacementOperator2163 = metamutator.Selector.of(2163,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2163");

    private static final metamutator.Selector _returnReplacementOperator2164 = metamutator.Selector.of(2164,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2164");

    private static final metamutator.Selector _returnReplacementOperator2165 = metamutator.Selector.of(2165,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2165");

    private static final metamutator.Selector _returnReplacementOperator2166 = metamutator.Selector.of(2166,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2166");

    private static final metamutator.Selector _returnReplacementOperator2167 = metamutator.Selector.of(2167,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2167");

    private static final metamutator.Selector _returnReplacementOperator2168 = metamutator.Selector.of(2168,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2168");

    private static final metamutator.Selector _returnReplacementOperator2169 = metamutator.Selector.of(2169,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2169");

    private static final metamutator.Selector _returnReplacementOperator2170 = metamutator.Selector.of(2170,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2170");

    private static final metamutator.Selector _returnReplacementOperator2171 = metamutator.Selector.of(2171,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2171");

    private static final metamutator.Selector _returnReplacementOperator2172 = metamutator.Selector.of(2172,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2172");

    private static final metamutator.Selector _returnReplacementOperator2173 = metamutator.Selector.of(2173,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2173");

    private static final metamutator.Selector _returnReplacementOperator2174 = metamutator.Selector.of(2174,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2174");

    private static final metamutator.Selector _returnReplacementOperator2175 = metamutator.Selector.of(2175,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2175");

    private static final metamutator.Selector _returnReplacementOperator2176 = metamutator.Selector.of(2176,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2176");

    private static final metamutator.Selector _returnReplacementOperator2177 = metamutator.Selector.of(2177,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2177");

    private static final metamutator.Selector _returnReplacementOperator2178 = metamutator.Selector.of(2178,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2178");

    private static final metamutator.Selector _returnReplacementOperator2179 = metamutator.Selector.of(2179,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2179");

    private static final metamutator.Selector _returnReplacementOperator2180 = metamutator.Selector.of(2180,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2180");

    private static final metamutator.Selector _returnReplacementOperator2181 = metamutator.Selector.of(2181,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2181");

    private static final metamutator.Selector _returnReplacementOperator2182 = metamutator.Selector.of(2182,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2182");

    private static final metamutator.Selector _returnReplacementOperator2183 = metamutator.Selector.of(2183,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2183");

    private static final metamutator.Selector _returnReplacementOperator2184 = metamutator.Selector.of(2184,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2184");

    private static final metamutator.Selector _returnReplacementOperator2185 = metamutator.Selector.of(2185,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2185");

    private static final metamutator.Selector _returnReplacementOperator2186 = metamutator.Selector.of(2186,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2186");

    private static final metamutator.Selector _returnReplacementOperator2187 = metamutator.Selector.of(2187,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2187");

    private static final metamutator.Selector _returnReplacementOperator2188 = metamutator.Selector.of(2188,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2188");

    private static final metamutator.Selector _returnReplacementOperator2189 = metamutator.Selector.of(2189,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2189");

    private static final metamutator.Selector _returnReplacementOperator2190 = metamutator.Selector.of(2190,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2190");

    private static final metamutator.Selector _returnReplacementOperator2191 = metamutator.Selector.of(2191,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2191");

    private static final metamutator.Selector _returnReplacementOperator2192 = metamutator.Selector.of(2192,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2192");

    private static final metamutator.Selector _returnReplacementOperator2193 = metamutator.Selector.of(2193,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2193");

    private static final metamutator.Selector _returnReplacementOperator2194 = metamutator.Selector.of(2194,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2194");

    private static final metamutator.Selector _returnReplacementOperator2195 = metamutator.Selector.of(2195,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2195");

    private static final metamutator.Selector _returnReplacementOperator2196 = metamutator.Selector.of(2196,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2196");

    private static final metamutator.Selector _returnReplacementOperator2197 = metamutator.Selector.of(2197,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2197");

    private static final metamutator.Selector _returnReplacementOperator2198 = metamutator.Selector.of(2198,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2198");

    private static final metamutator.Selector _returnReplacementOperator2199 = metamutator.Selector.of(2199,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2199");

    private static final metamutator.Selector _returnReplacementOperator2200 = metamutator.Selector.of(2200,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2200");

    private static final metamutator.Selector _returnReplacementOperator2201 = metamutator.Selector.of(2201,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2201");

    private static final metamutator.Selector _returnReplacementOperator2202 = metamutator.Selector.of(2202,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2202");

    private static final metamutator.Selector _returnReplacementOperator2203 = metamutator.Selector.of(2203,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2203");

    private static final metamutator.Selector _returnReplacementOperator2204 = metamutator.Selector.of(2204,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2204");

    private static final metamutator.Selector _returnReplacementOperator2205 = metamutator.Selector.of(2205,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2205");

    private static final metamutator.Selector _returnReplacementOperator2206 = metamutator.Selector.of(2206,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2206");

    private static final metamutator.Selector _returnReplacementOperator2207 = metamutator.Selector.of(2207,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2207");

    private static final metamutator.Selector _returnReplacementOperator2208 = metamutator.Selector.of(2208,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2208");

    private static final metamutator.Selector _returnReplacementOperator2209 = metamutator.Selector.of(2209,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2209");

    private static final metamutator.Selector _returnReplacementOperator2210 = metamutator.Selector.of(2210,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2210");

    private static final metamutator.Selector _returnReplacementOperator2211 = metamutator.Selector.of(2211,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2211");

    private static final metamutator.Selector _returnReplacementOperator2212 = metamutator.Selector.of(2212,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2212");

    private static final metamutator.Selector _returnReplacementOperator2213 = metamutator.Selector.of(2213,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2213");

    private static final metamutator.Selector _returnReplacementOperator2214 = metamutator.Selector.of(2214,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2214");

    private static final metamutator.Selector _returnReplacementOperator2215 = metamutator.Selector.of(2215,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2215");

    private static final metamutator.Selector _returnReplacementOperator2216 = metamutator.Selector.of(2216,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2216");

    private static final metamutator.Selector _returnReplacementOperator2217 = metamutator.Selector.of(2217,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2217");

    private static final metamutator.Selector _returnReplacementOperator2218 = metamutator.Selector.of(2218,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2218");

    private static final metamutator.Selector _returnReplacementOperator2219 = metamutator.Selector.of(2219,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2219");

    private static final metamutator.Selector _returnReplacementOperator2220 = metamutator.Selector.of(2220,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2220");

    private static final metamutator.Selector _returnReplacementOperator2221 = metamutator.Selector.of(2221,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2221");

    private static final metamutator.Selector _returnReplacementOperator2222 = metamutator.Selector.of(2222,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2222");

    private static final metamutator.Selector _returnReplacementOperator2223 = metamutator.Selector.of(2223,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2223");

    private static final metamutator.Selector _returnReplacementOperator2224 = metamutator.Selector.of(2224,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2224");

    private static final metamutator.Selector _returnReplacementOperator2225 = metamutator.Selector.of(2225,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2225");

    private static final metamutator.Selector _returnReplacementOperator2226 = metamutator.Selector.of(2226,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2226");

    private static final metamutator.Selector _returnReplacementOperator2227 = metamutator.Selector.of(2227,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2227");

    private static final metamutator.Selector _returnReplacementOperator2228 = metamutator.Selector.of(2228,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2228");

    private static final metamutator.Selector _returnReplacementOperator2229 = metamutator.Selector.of(2229,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2229");

    private static final metamutator.Selector _returnReplacementOperator2230 = metamutator.Selector.of(2230,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2230");

    private static final metamutator.Selector _returnReplacementOperator2231 = metamutator.Selector.of(2231,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2231");

    private static final metamutator.Selector _returnReplacementOperator2232 = metamutator.Selector.of(2232,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2232");

    private static final metamutator.Selector _returnReplacementOperator2233 = metamutator.Selector.of(2233,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2233");

    private static final metamutator.Selector _returnReplacementOperator2234 = metamutator.Selector.of(2234,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2234");

    private static final metamutator.Selector _returnReplacementOperator2235 = metamutator.Selector.of(2235,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2235");

    private static final metamutator.Selector _returnReplacementOperator2236 = metamutator.Selector.of(2236,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2236");

    private static final metamutator.Selector _returnReplacementOperator2237 = metamutator.Selector.of(2237,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2237");

    private static final metamutator.Selector _returnReplacementOperator2238 = metamutator.Selector.of(2238,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2238");

    private static final metamutator.Selector _returnReplacementOperator2239 = metamutator.Selector.of(2239,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2239");

    private static final metamutator.Selector _returnReplacementOperator2240 = metamutator.Selector.of(2240,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2240");

    private static final metamutator.Selector _returnReplacementOperator2241 = metamutator.Selector.of(2241,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2241");

    private static final metamutator.Selector _returnReplacementOperator2242 = metamutator.Selector.of(2242,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2242");

    private static final metamutator.Selector _returnReplacementOperator2243 = metamutator.Selector.of(2243,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2243");

    private static final metamutator.Selector _returnReplacementOperator2244 = metamutator.Selector.of(2244,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2244");

    private static final metamutator.Selector _returnReplacementOperator2245 = metamutator.Selector.of(2245,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2245");

    private static final metamutator.Selector _returnReplacementOperator2246 = metamutator.Selector.of(2246,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2246");

    private static final metamutator.Selector _returnReplacementOperator2247 = metamutator.Selector.of(2247,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2247");

    private static final metamutator.Selector _returnReplacementOperator2248 = metamutator.Selector.of(2248,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2248");

    private static final metamutator.Selector _returnReplacementOperator2249 = metamutator.Selector.of(2249,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2249");

    private static final metamutator.Selector _returnReplacementOperator2250 = metamutator.Selector.of(2250,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2250");

    private static final metamutator.Selector _returnReplacementOperator2251 = metamutator.Selector.of(2251,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2251");

    private static final metamutator.Selector _returnReplacementOperator2252 = metamutator.Selector.of(2252,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2252");

    private static final metamutator.Selector _returnReplacementOperator2253 = metamutator.Selector.of(2253,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2253");

    private static final metamutator.Selector _returnReplacementOperator2254 = metamutator.Selector.of(2254,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2254");

    private static final metamutator.Selector _returnReplacementOperator2255 = metamutator.Selector.of(2255,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2255");

    private static final metamutator.Selector _returnReplacementOperator2256 = metamutator.Selector.of(2256,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2256");

    private static final metamutator.Selector _returnReplacementOperator2257 = metamutator.Selector.of(2257,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2257");

    private static final metamutator.Selector _returnReplacementOperator2258 = metamutator.Selector.of(2258,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2258");

    private static final metamutator.Selector _returnReplacementOperator2259 = metamutator.Selector.of(2259,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2259");

    private static final metamutator.Selector _returnReplacementOperator2260 = metamutator.Selector.of(2260,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2260");

    private static final metamutator.Selector _returnReplacementOperator2261 = metamutator.Selector.of(2261,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2261");

    private static final metamutator.Selector _returnReplacementOperator2262 = metamutator.Selector.of(2262,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2262");

    private static final metamutator.Selector _returnReplacementOperator2263 = metamutator.Selector.of(2263,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2263");

    private static final metamutator.Selector _returnReplacementOperator2264 = metamutator.Selector.of(2264,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2264");

    private static final metamutator.Selector _returnReplacementOperator2265 = metamutator.Selector.of(2265,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2265");

    private static final metamutator.Selector _returnReplacementOperator2266 = metamutator.Selector.of(2266,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2266");

    private static final metamutator.Selector _returnReplacementOperator2267 = metamutator.Selector.of(2267,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2267");

    private static final metamutator.Selector _returnReplacementOperator2268 = metamutator.Selector.of(2268,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2268");

    private static final metamutator.Selector _returnReplacementOperator2269 = metamutator.Selector.of(2269,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2269");

    private static final metamutator.Selector _returnReplacementOperator2270 = metamutator.Selector.of(2270,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2270");

    private static final metamutator.Selector _returnReplacementOperator2271 = metamutator.Selector.of(2271,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2271");

    private static final metamutator.Selector _returnReplacementOperator2272 = metamutator.Selector.of(2272,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2272");

    private static final metamutator.Selector _returnReplacementOperator2273 = metamutator.Selector.of(2273,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2273");

    private static final metamutator.Selector _returnReplacementOperator2274 = metamutator.Selector.of(2274,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2274");

    private static final metamutator.Selector _returnReplacementOperator2275 = metamutator.Selector.of(2275,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2275");

    private static final metamutator.Selector _returnReplacementOperator2276 = metamutator.Selector.of(2276,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2276");

    private static final metamutator.Selector _returnReplacementOperator2277 = metamutator.Selector.of(2277,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2277");

    private static final metamutator.Selector _returnReplacementOperator2278 = metamutator.Selector.of(2278,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2278");

    private static final metamutator.Selector _returnReplacementOperator2279 = metamutator.Selector.of(2279,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2279");

    private static final metamutator.Selector _returnReplacementOperator2280 = metamutator.Selector.of(2280,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2280");

    private static final metamutator.Selector _returnReplacementOperator2281 = metamutator.Selector.of(2281,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2281");

    private static final metamutator.Selector _returnReplacementOperator2282 = metamutator.Selector.of(2282,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2282");

    private static final metamutator.Selector _returnReplacementOperator2283 = metamutator.Selector.of(2283,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2283");

    private static final metamutator.Selector _returnReplacementOperator2284 = metamutator.Selector.of(2284,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2284");

    private static final metamutator.Selector _returnReplacementOperator2285 = metamutator.Selector.of(2285,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2285");

    private static final metamutator.Selector _returnReplacementOperator2286 = metamutator.Selector.of(2286,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2286");

    private static final metamutator.Selector _returnReplacementOperator2287 = metamutator.Selector.of(2287,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2287");

    private static final metamutator.Selector _returnReplacementOperator2288 = metamutator.Selector.of(2288,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2288");

    private static final metamutator.Selector _returnReplacementOperator2289 = metamutator.Selector.of(2289,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2289");

    private static final metamutator.Selector _returnReplacementOperator2290 = metamutator.Selector.of(2290,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2290");

    private static final metamutator.Selector _returnReplacementOperator2291 = metamutator.Selector.of(2291,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2291");

    private static final metamutator.Selector _returnReplacementOperator2292 = metamutator.Selector.of(2292,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2292");

    private static final metamutator.Selector _returnReplacementOperator2293 = metamutator.Selector.of(2293,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2293");

    private static final metamutator.Selector _returnReplacementOperator2294 = metamutator.Selector.of(2294,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2294");

    private static final metamutator.Selector _returnReplacementOperator2295 = metamutator.Selector.of(2295,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2295");

    private static final metamutator.Selector _returnReplacementOperator2296 = metamutator.Selector.of(2296,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2296");

    private static final metamutator.Selector _returnReplacementOperator2297 = metamutator.Selector.of(2297,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2297");

    private static final metamutator.Selector _returnReplacementOperator2298 = metamutator.Selector.of(2298,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2298");

    private static final metamutator.Selector _returnReplacementOperator2299 = metamutator.Selector.of(2299,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2299");

    private static final metamutator.Selector _returnReplacementOperator2300 = metamutator.Selector.of(2300,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2300");

    private static final metamutator.Selector _returnReplacementOperator2301 = metamutator.Selector.of(2301,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2301");

    private static final metamutator.Selector _returnReplacementOperator2302 = metamutator.Selector.of(2302,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2302");

    private static final metamutator.Selector _returnReplacementOperator2303 = metamutator.Selector.of(2303,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2303");

    private static final metamutator.Selector _returnReplacementOperator2304 = metamutator.Selector.of(2304,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2304");

    private static final metamutator.Selector _returnReplacementOperator2305 = metamutator.Selector.of(2305,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2305");

    private static final metamutator.Selector _returnReplacementOperator2306 = metamutator.Selector.of(2306,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2306");

    private static final metamutator.Selector _returnReplacementOperator2307 = metamutator.Selector.of(2307,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2307");

    private static final metamutator.Selector _returnReplacementOperator2308 = metamutator.Selector.of(2308,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2308");

    private static final metamutator.Selector _returnReplacementOperator2309 = metamutator.Selector.of(2309,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2309");

    private static final metamutator.Selector _returnReplacementOperator2310 = metamutator.Selector.of(2310,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2310");

    private static final metamutator.Selector _returnReplacementOperator2311 = metamutator.Selector.of(2311,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2311");

    private static final metamutator.Selector _returnReplacementOperator2312 = metamutator.Selector.of(2312,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2312");

    private static final metamutator.Selector _returnReplacementOperator2313 = metamutator.Selector.of(2313,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2313");

    private static final metamutator.Selector _returnReplacementOperator2314 = metamutator.Selector.of(2314,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2314");

    private static final metamutator.Selector _returnReplacementOperator2315 = metamutator.Selector.of(2315,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2315");

    private static final metamutator.Selector _returnReplacementOperator2316 = metamutator.Selector.of(2316,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2316");

    private static final metamutator.Selector _returnReplacementOperator2317 = metamutator.Selector.of(2317,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2317");

    private static final metamutator.Selector _returnReplacementOperator2318 = metamutator.Selector.of(2318,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2318");

    private static final metamutator.Selector _returnReplacementOperator2319 = metamutator.Selector.of(2319,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2319");

    private static final metamutator.Selector _returnReplacementOperator2320 = metamutator.Selector.of(2320,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2320");

    private static final metamutator.Selector _returnReplacementOperator2321 = metamutator.Selector.of(2321,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2321");

    private static final metamutator.Selector _returnReplacementOperator2322 = metamutator.Selector.of(2322,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2322");

    private static final metamutator.Selector _returnReplacementOperator2323 = metamutator.Selector.of(2323,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2323");

    private static final metamutator.Selector _returnReplacementOperator2324 = metamutator.Selector.of(2324,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2324");

    private static final metamutator.Selector _returnReplacementOperator2325 = metamutator.Selector.of(2325,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2325");

    private static final metamutator.Selector _returnReplacementOperator2326 = metamutator.Selector.of(2326,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2326");

    private static final metamutator.Selector _returnReplacementOperator2327 = metamutator.Selector.of(2327,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2327");

    private static final metamutator.Selector _returnReplacementOperator2328 = metamutator.Selector.of(2328,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2328");

    private static final metamutator.Selector _returnReplacementOperator2329 = metamutator.Selector.of(2329,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2329");

    private static final metamutator.Selector _returnReplacementOperator2330 = metamutator.Selector.of(2330,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2330");

    private static final metamutator.Selector _returnReplacementOperator2331 = metamutator.Selector.of(2331,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2331");

    private static final metamutator.Selector _returnReplacementOperator2332 = metamutator.Selector.of(2332,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2332");

    private static final metamutator.Selector _returnReplacementOperator2333 = metamutator.Selector.of(2333,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2333");

    private static final metamutator.Selector _returnReplacementOperator2334 = metamutator.Selector.of(2334,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2334");

    private static final metamutator.Selector _returnReplacementOperator2335 = metamutator.Selector.of(2335,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2335");

    private static final metamutator.Selector _returnReplacementOperator2336 = metamutator.Selector.of(2336,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2336");

    private static final metamutator.Selector _returnReplacementOperator2337 = metamutator.Selector.of(2337,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2337");

    private static final metamutator.Selector _returnReplacementOperator2338 = metamutator.Selector.of(2338,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2338");

    private static final metamutator.Selector _returnReplacementOperator2339 = metamutator.Selector.of(2339,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2339");

    private static final metamutator.Selector _returnReplacementOperator2340 = metamutator.Selector.of(2340,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2340");

    private static final metamutator.Selector _returnReplacementOperator2341 = metamutator.Selector.of(2341,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2341");

    private static final metamutator.Selector _returnReplacementOperator2342 = metamutator.Selector.of(2342,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2342");

    private static final metamutator.Selector _returnReplacementOperator2343 = metamutator.Selector.of(2343,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2343");

    private static final metamutator.Selector _returnReplacementOperator2344 = metamutator.Selector.of(2344,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2344");

    private static final metamutator.Selector _returnReplacementOperator2345 = metamutator.Selector.of(2345,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2345");

    private static final metamutator.Selector _returnReplacementOperator2346 = metamutator.Selector.of(2346,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2346");

    private static final metamutator.Selector _returnReplacementOperator2347 = metamutator.Selector.of(2347,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2347");

    private static final metamutator.Selector _returnReplacementOperator2348 = metamutator.Selector.of(2348,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2348");

    private static final metamutator.Selector _returnReplacementOperator2349 = metamutator.Selector.of(2349,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2349");

    private static final metamutator.Selector _returnReplacementOperator2350 = metamutator.Selector.of(2350,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2350");

    private static final metamutator.Selector _returnReplacementOperator2351 = metamutator.Selector.of(2351,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2351");

    private static final metamutator.Selector _returnReplacementOperator2352 = metamutator.Selector.of(2352,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2352");

    private static final metamutator.Selector _returnReplacementOperator2353 = metamutator.Selector.of(2353,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2353");

    private static final metamutator.Selector _returnReplacementOperator2354 = metamutator.Selector.of(2354,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2354");

    private static final metamutator.Selector _returnReplacementOperator2355 = metamutator.Selector.of(2355,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2355");

    private static final metamutator.Selector _returnReplacementOperator2356 = metamutator.Selector.of(2356,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2356");

    private static final metamutator.Selector _returnReplacementOperator2357 = metamutator.Selector.of(2357,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2357");

    private static final metamutator.Selector _returnReplacementOperator2358 = metamutator.Selector.of(2358,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2358");

    private static final metamutator.Selector _returnReplacementOperator2359 = metamutator.Selector.of(2359,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2359");

    private static final metamutator.Selector _returnReplacementOperator2360 = metamutator.Selector.of(2360,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2360");

    private static final metamutator.Selector _returnReplacementOperator2361 = metamutator.Selector.of(2361,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2361");

    private static final metamutator.Selector _returnReplacementOperator2362 = metamutator.Selector.of(2362,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2362");

    private static final metamutator.Selector _returnReplacementOperator2363 = metamutator.Selector.of(2363,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2363");

    private static final metamutator.Selector _returnReplacementOperator2364 = metamutator.Selector.of(2364,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2364");

    private static final metamutator.Selector _returnReplacementOperator2365 = metamutator.Selector.of(2365,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2365");

    private static final metamutator.Selector _returnReplacementOperator2366 = metamutator.Selector.of(2366,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2366");

    private static final metamutator.Selector _returnReplacementOperator2367 = metamutator.Selector.of(2367,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2367");

    private static final metamutator.Selector _returnReplacementOperator2368 = metamutator.Selector.of(2368,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2368");

    private static final metamutator.Selector _returnReplacementOperator2369 = metamutator.Selector.of(2369,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2369");

    private static final metamutator.Selector _returnReplacementOperator2370 = metamutator.Selector.of(2370,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2370");

    private static final metamutator.Selector _returnReplacementOperator2371 = metamutator.Selector.of(2371,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2371");

    private static final metamutator.Selector _returnReplacementOperator2372 = metamutator.Selector.of(2372,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2372");

    private static final metamutator.Selector _returnReplacementOperator2373 = metamutator.Selector.of(2373,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2373");

    private static final metamutator.Selector _returnReplacementOperator2374 = metamutator.Selector.of(2374,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2374");

    private static final metamutator.Selector _returnReplacementOperator2375 = metamutator.Selector.of(2375,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2375");

    private static final metamutator.Selector _returnReplacementOperator2376 = metamutator.Selector.of(2376,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2376");

    private static final metamutator.Selector _returnReplacementOperator2377 = metamutator.Selector.of(2377,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2377");

    private static final metamutator.Selector _returnReplacementOperator2378 = metamutator.Selector.of(2378,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2378");

    private static final metamutator.Selector _returnReplacementOperator2379 = metamutator.Selector.of(2379,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2379");

    private static final metamutator.Selector _returnReplacementOperator2380 = metamutator.Selector.of(2380,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2380");

    private static final metamutator.Selector _returnReplacementOperator2381 = metamutator.Selector.of(2381,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2381");

    private static final metamutator.Selector _returnReplacementOperator2382 = metamutator.Selector.of(2382,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ArrayUtils.class).id("_returnReplacementOperator2382");
}

