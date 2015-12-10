package org.apache.commons.lang3;


public class ObjectUtils {
    public static final org.apache.commons.lang3.ObjectUtils.Null NULL = new org.apache.commons.lang3.ObjectUtils.Null();

    public ObjectUtils() {
        super();
    }

    public static <T>T defaultIfNull(final T object, final T defaultValue) {
        return ((_returnReplacementOperatorHotSpot2851.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (object != null ? object : defaultValue));
    }

    public static <T>T firstNonNull(final T... values) {
        if (values != null) {
            for (final T val : values) {
                if (val != null) {
                    return ((_returnReplacementOperatorHotSpot2852.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (val));
                } 
            }
        } 
        return ((_returnReplacementOperatorHotSpot2853.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
    }

    @java.lang.Deprecated
    public static boolean equals(final java.lang.Object object1, final java.lang.Object object2) {
        if (object1 == object2) {
            return ((_returnReplacementOperatorHotSpot2858.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        if ((object1 == null) || (object2 == null)) {
            return ((_returnReplacementOperatorHotSpot2859.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperatorHotSpot2860.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (object1.equals(object2)));
    }

    public static boolean notEqual(final java.lang.Object object1, final java.lang.Object object2) {
        return ((_returnReplacementOperatorHotSpot2861.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.ObjectUtils.equals(object1, object2)) == false));
    }

    @java.lang.Deprecated
    public static int hashCode(final java.lang.Object obj) {
        return ((_returnReplacementOperatorHotSpot2868.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2868.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2868.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (obj == null ? 0 : obj.hashCode()));
    }

    @java.lang.Deprecated
    public static int hashCodeMulti(final java.lang.Object... objects) {
        int hash = 1;
        if (objects != null) {
            for (final java.lang.Object object : objects) {
                final int tmpHash = org.apache.commons.lang3.ObjectUtils.hashCode(object);
                hash = (hash * 31) + tmpHash;
            }
        } 
        return ((_returnReplacementOperatorHotSpot2869.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2869.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2869.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (hash));
    }

    public static java.lang.String identityToString(final java.lang.Object object) {
        if (object == null) {
            return ((_returnReplacementOperatorHotSpot2870.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        final java.lang.StringBuilder builder = new java.lang.StringBuilder();
        org.apache.commons.lang3.ObjectUtils.identityToString(builder, object);
        return ((_returnReplacementOperatorHotSpot2871.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (builder.toString()));
    }

    public static void identityToString(final java.lang.Appendable appendable, final java.lang.Object object) throws java.io.IOException {
        if (object == null) {
            throw new java.lang.NullPointerException("Cannot get the toString of a null identity");
        } 
        appendable.append(object.getClass().getName()).append('@').append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(object)));
    }

    public static void identityToString(final org.apache.commons.lang3.text.StrBuilder builder, final java.lang.Object object) {
        if (object == null) {
            throw new java.lang.NullPointerException("Cannot get the toString of a null identity");
        } 
        builder.append(object.getClass().getName()).append('@').append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(object)));
    }

    public static void identityToString(final java.lang.StringBuffer buffer, final java.lang.Object object) {
        if (object == null) {
            throw new java.lang.NullPointerException("Cannot get the toString of a null identity");
        } 
        buffer.append(object.getClass().getName()).append('@').append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(object)));
    }

    public static void identityToString(final java.lang.StringBuilder builder, final java.lang.Object object) {
        if (object == null) {
            throw new java.lang.NullPointerException("Cannot get the toString of a null identity");
        } 
        builder.append(object.getClass().getName()).append('@').append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(object)));
    }

    @java.lang.Deprecated
    public static java.lang.String toString(final java.lang.Object obj) {
        return ((_returnReplacementOperatorHotSpot2872.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (obj == null ? "" : obj.toString()));
    }

    @java.lang.Deprecated
    public static java.lang.String toString(final java.lang.Object obj, final java.lang.String nullStr) {
        return ((_returnReplacementOperatorHotSpot2873.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (obj == null ? nullStr : obj.toString()));
    }

    public static <T extends java.lang.Comparable<? super T>>T min(final T... values) {
        T result = null;
        if (values != null) {
            for (final T value : values) {
                if ((org.apache.commons.lang3.ObjectUtils.compare(value, result, true)) < 0) {
                    result = value;
                } 
            }
        } 
        return ((_returnReplacementOperatorHotSpot2841.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static <T extends java.lang.Comparable<? super T>>T max(final T... values) {
        T result = null;
        if (values != null) {
            for (final T value : values) {
                if ((org.apache.commons.lang3.ObjectUtils.compare(value, result, false)) > 0) {
                    result = value;
                } 
            }
        } 
        return ((_returnReplacementOperatorHotSpot2839.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static <T extends java.lang.Comparable<? super T>>int compare(final T c1, final T c2) {
        return ((_returnReplacementOperatorHotSpot2842.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2842.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2842.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.ObjectUtils.compare(c1, c2, false)));
    }

    public static <T extends java.lang.Comparable<? super T>>int compare(final T c1, final T c2, final boolean nullGreater) {
        if (c1 == c2) {
            return ((_returnReplacementOperatorHotSpot2843.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2843.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2843.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (0));
        } else if (c1 == null) {
            return ((_returnReplacementOperatorHotSpot2844.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2844.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2844.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (nullGreater ? 1 : -1));
        } else if (c2 == null) {
            return ((_returnReplacementOperatorHotSpot2845.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2845.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2845.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (nullGreater ? -1 : 1));
        } 
        return ((_returnReplacementOperatorHotSpot2846.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2846.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2846.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (c1.compareTo(c2)));
    }

    public static <T extends java.lang.Comparable<? super T>>T median(final T... items) {
        org.apache.commons.lang3.Validate.notEmpty(items);
        org.apache.commons.lang3.Validate.noNullElements(items);
        final java.util.TreeSet<T> sort = new java.util.TreeSet<T>();
        java.util.Collections.addAll(sort, items);
        @java.lang.SuppressWarnings(value = "unchecked")
        final T result = ((T)(sort.toArray()[(((sort.size()) - 1) / 2)]));
        return ((_returnReplacementOperatorHotSpot2840.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static <T>T median(final java.util.Comparator<T> comparator, final T... items) {
        org.apache.commons.lang3.Validate.notEmpty(items, "null/empty items");
        org.apache.commons.lang3.Validate.noNullElements(items);
        org.apache.commons.lang3.Validate.notNull(comparator, "null comparator");
        final java.util.TreeSet<T> sort = new java.util.TreeSet<T>(comparator);
        java.util.Collections.addAll(sort, items);
        @java.lang.SuppressWarnings(value = "unchecked")
        final T result = ((T)(sort.toArray()[(((sort.size()) - 1) / 2)]));
        return ((_returnReplacementOperatorHotSpot2854.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static <T>T mode(final T... items) {
        if (org.apache.commons.lang3.ArrayUtils.isNotEmpty(items)) {
            final java.util.HashMap<T, org.apache.commons.lang3.mutable.MutableInt> occurrences = new java.util.HashMap<T, org.apache.commons.lang3.mutable.MutableInt>(items.length);
            for (final T t : items) {
                final org.apache.commons.lang3.mutable.MutableInt count = occurrences.get(t);
                if (count == null) {
                    occurrences.put(t, new org.apache.commons.lang3.mutable.MutableInt(1));
                } else {
                    count.increment();
                }
            }
            T result = null;
            int max = 0;
            for (final java.util.Map.Entry<T, org.apache.commons.lang3.mutable.MutableInt> e : occurrences.entrySet()) {
                final int cmp = e.getValue().intValue();
                if (cmp == max) {
                    result = null;
                } else if (cmp > max) {
                    max = cmp;
                    result = e.getKey();
                } 
            }
            return ((_returnReplacementOperatorHotSpot2855.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
        } 
        return ((_returnReplacementOperatorHotSpot2856.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
    }

    public static <T>T clone(final T obj) {
        if (obj instanceof java.lang.Cloneable) {
            final java.lang.Object result;
            if (obj.getClass().isArray()) {
                final java.lang.Class<?> componentType = obj.getClass().getComponentType();
                if (!(componentType.isPrimitive())) {
                    result = ((java.lang.Object[])(obj)).clone();
                } else {
                    int length = java.lang.reflect.Array.getLength(obj);
                    result = java.lang.reflect.Array.newInstance(componentType, length);
                    while ((length--) > 0) {
                        java.lang.reflect.Array.set(result, length, java.lang.reflect.Array.get(obj, length));
                    }
                }
            } else {
                try {
                    final java.lang.reflect.Method clone = obj.getClass().getMethod("clone");
                    result = clone.invoke(obj);
                } catch (final java.lang.NoSuchMethodException e) {
                    throw new org.apache.commons.lang3.exception.CloneFailedException((("Cloneable type " + (obj.getClass().getName())) + " has no clone method") , e);
                } catch (final java.lang.IllegalAccessException e) {
                    throw new org.apache.commons.lang3.exception.CloneFailedException(("Cannot clone Cloneable type " + (obj.getClass().getName())) , e);
                } catch (final java.lang.reflect.InvocationTargetException e) {
                    throw new org.apache.commons.lang3.exception.CloneFailedException(("Exception cloning Cloneable type " + (obj.getClass().getName())) , e.getCause());
                }
            }
            @java.lang.SuppressWarnings(value = "unchecked")
            final T checked = ((T)(result));
            return ((_returnReplacementOperatorHotSpot2848.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (checked));
        } 
        return ((_returnReplacementOperatorHotSpot2849.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
    }

    public static <T>T cloneIfPossible(final T obj) {
        final T clone = org.apache.commons.lang3.ObjectUtils.clone(obj);
        return ((_returnReplacementOperatorHotSpot2850.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (clone == null ? obj : clone));
    }

    public static class Null implements java.io.Serializable {
        private static final long serialVersionUID = 7092611880189329093L;

        Null() {
            super();
        }

        private java.lang.Object readResolve() {
            return ((_returnReplacementOperatorHotSpot2838.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ObjectUtils.NULL));
        }
    }

    public static boolean CONST(final boolean v) {
        return ((_returnReplacementOperatorHotSpot2857.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (v));
    }

    public static byte CONST(final byte v) {
        return ((_returnReplacementOperatorHotSpot2862.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (v));
    }

    public static byte CONST_BYTE(final int v) throws java.lang.IllegalArgumentException {
        if ((v < (java.lang.Byte.MIN_VALUE)) || (v > (java.lang.Byte.MAX_VALUE))) {
            throw new java.lang.IllegalArgumentException((("Supplied value must be a valid byte literal between -128 and 127: [" + v) + "]"));
        } 
        return ((_returnReplacementOperatorHotSpot2863.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ((byte)( -2147483647 )) : (_returnReplacementOperatorHotSpot2863.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ((byte)( 2147483646 )) : (_returnReplacementOperatorHotSpot2863.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ((byte)( 0 )) : (((byte)(v))));
    }

    public static char CONST(final char v) {
        return ((_returnReplacementOperatorHotSpot2864.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (v));
    }

    public static short CONST(final short v) {
        return ((_returnReplacementOperatorHotSpot2875.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (v));
    }

    public static short CONST_SHORT(final int v) throws java.lang.IllegalArgumentException {
        if ((v < (java.lang.Short.MIN_VALUE)) || (v > (java.lang.Short.MAX_VALUE))) {
            throw new java.lang.IllegalArgumentException((("Supplied value must be a valid byte literal between -32768 and 32767: [" + v) + "]"));
        } 
        return ((_returnReplacementOperatorHotSpot2876.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ((short)( -2147483647 )) : (_returnReplacementOperatorHotSpot2876.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ((short)( 2147483646 )) : (_returnReplacementOperatorHotSpot2876.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ((short)( 0 )) : (((short)(v))));
    }

    public static int CONST(final int v) {
        return ((_returnReplacementOperatorHotSpot2867.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2867.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2867.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (v));
    }

    public static long CONST(final long v) {
        return ((_returnReplacementOperatorHotSpot2874.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (v));
    }

    public static float CONST(final float v) {
        return ((_returnReplacementOperatorHotSpot2866.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (v));
    }

    public static double CONST(final double v) {
        return ((_returnReplacementOperatorHotSpot2865.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (v));
    }

    public static <T>T CONST(final T v) {
        return ((_returnReplacementOperatorHotSpot2847.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (v));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2838 = metamutator.Selector.of(2838,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot2838");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2839 = metamutator.Selector.of(2839,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2839");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2840 = metamutator.Selector.of(2840,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2840");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2841 = metamutator.Selector.of(2841,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2841");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2842 = metamutator.Selector.of(2842,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2842");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2843 = metamutator.Selector.of(2843,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2843");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2844 = metamutator.Selector.of(2844,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2844");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2845 = metamutator.Selector.of(2845,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2845");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2846 = metamutator.Selector.of(2846,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2846");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2847 = metamutator.Selector.of(2847,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2847");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2848 = metamutator.Selector.of(2848,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2848");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2849 = metamutator.Selector.of(2849,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2849");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2850 = metamutator.Selector.of(2850,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2850");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2851 = metamutator.Selector.of(2851,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2851");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2852 = metamutator.Selector.of(2852,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2852");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2853 = metamutator.Selector.of(2853,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2853");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2854 = metamutator.Selector.of(2854,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2854");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2855 = metamutator.Selector.of(2855,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2855");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2856 = metamutator.Selector.of(2856,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2856");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2857 = metamutator.Selector.of(2857,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2857");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2858 = metamutator.Selector.of(2858,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2858");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2859 = metamutator.Selector.of(2859,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2859");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2860 = metamutator.Selector.of(2860,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2860");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2861 = metamutator.Selector.of(2861,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2861");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2862 = metamutator.Selector.of(2862,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2862");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2863 = metamutator.Selector.of(2863,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2863");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2864 = metamutator.Selector.of(2864,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2864");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2865 = metamutator.Selector.of(2865,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2865");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2866 = metamutator.Selector.of(2866,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2866");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2867 = metamutator.Selector.of(2867,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2867");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2868 = metamutator.Selector.of(2868,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2868");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2869 = metamutator.Selector.of(2869,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2869");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2870 = metamutator.Selector.of(2870,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2870");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2871 = metamutator.Selector.of(2871,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2871");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2872 = metamutator.Selector.of(2872,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2872");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2873 = metamutator.Selector.of(2873,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2873");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2874 = metamutator.Selector.of(2874,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2874");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2875 = metamutator.Selector.of(2875,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2875");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2876 = metamutator.Selector.of(2876,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperatorHotSpot2876");
}

