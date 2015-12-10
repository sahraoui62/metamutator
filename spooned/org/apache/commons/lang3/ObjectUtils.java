package org.apache.commons.lang3;


public class ObjectUtils {
    public static final org.apache.commons.lang3.ObjectUtils.Null NULL = new org.apache.commons.lang3.ObjectUtils.Null();

    public ObjectUtils() {
        super();
    }

    public static <T>T defaultIfNull(final T object, final T defaultValue) {
        return ((_returnReplacementOperator2851.is("NULL")) ? ( null ) : (object != null ? object : defaultValue));
    }

    public static <T>T firstNonNull(final T... values) {
        if (values != null) {
            for (final T val : values) {
                if (val != null) {
                    return ((_returnReplacementOperator2852.is("NULL")) ? ( null ) : (val));
                } 
            }
        } 
        return ((_returnReplacementOperator2853.is("NULL")) ? ( null ) : (null));
    }

    @java.lang.Deprecated
    public static boolean equals(final java.lang.Object object1, final java.lang.Object object2) {
        if (object1 == object2) {
            return ((_returnReplacementOperator2858.is("NULL")) ? ( null ) : (true));
        } 
        if ((object1 == null) || (object2 == null)) {
            return ((_returnReplacementOperator2859.is("NULL")) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperator2860.is("NULL")) ? ( null ) : (object1.equals(object2)));
    }

    public static boolean notEqual(final java.lang.Object object1, final java.lang.Object object2) {
        return ((_returnReplacementOperator2861.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.ObjectUtils.equals(object1, object2)) == false));
    }

    @java.lang.Deprecated
    public static int hashCode(final java.lang.Object obj) {
        return ((_returnReplacementOperator2868.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2868.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2868.is("ZERO")) ? ( 0 ) : (obj == null ? 0 : obj.hashCode()));
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
        return ((_returnReplacementOperator2869.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2869.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2869.is("ZERO")) ? ( 0 ) : (hash));
    }

    public static java.lang.String identityToString(final java.lang.Object object) {
        if (object == null) {
            return ((_returnReplacementOperator2870.is("NULL")) ? ( null ) : (null));
        } 
        final java.lang.StringBuilder builder = new java.lang.StringBuilder();
        org.apache.commons.lang3.ObjectUtils.identityToString(builder, object);
        return ((_returnReplacementOperator2871.is("NULL")) ? ( null ) : (builder.toString()));
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
        return ((_returnReplacementOperator2872.is("NULL")) ? ( null ) : (obj == null ? "" : obj.toString()));
    }

    @java.lang.Deprecated
    public static java.lang.String toString(final java.lang.Object obj, final java.lang.String nullStr) {
        return ((_returnReplacementOperator2873.is("NULL")) ? ( null ) : (obj == null ? nullStr : obj.toString()));
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
        return ((_returnReplacementOperator2841.is("NULL")) ? ( null ) : (result));
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
        return ((_returnReplacementOperator2839.is("NULL")) ? ( null ) : (result));
    }

    public static <T extends java.lang.Comparable<? super T>>int compare(final T c1, final T c2) {
        return ((_returnReplacementOperator2842.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2842.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2842.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.ObjectUtils.compare(c1, c2, false)));
    }

    public static <T extends java.lang.Comparable<? super T>>int compare(final T c1, final T c2, final boolean nullGreater) {
        if (c1 == c2) {
            return ((_returnReplacementOperator2843.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2843.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2843.is("ZERO")) ? ( 0 ) : (0));
        } else if (c1 == null) {
            return ((_returnReplacementOperator2844.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2844.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2844.is("ZERO")) ? ( 0 ) : (nullGreater ? 1 : -1));
        } else if (c2 == null) {
            return ((_returnReplacementOperator2845.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2845.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2845.is("ZERO")) ? ( 0 ) : (nullGreater ? -1 : 1));
        } 
        return ((_returnReplacementOperator2846.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2846.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2846.is("ZERO")) ? ( 0 ) : (c1.compareTo(c2)));
    }

    public static <T extends java.lang.Comparable<? super T>>T median(final T... items) {
        org.apache.commons.lang3.Validate.notEmpty(items);
        org.apache.commons.lang3.Validate.noNullElements(items);
        final java.util.TreeSet<T> sort = new java.util.TreeSet<T>();
        java.util.Collections.addAll(sort, items);
        @java.lang.SuppressWarnings(value = "unchecked")
        final T result = ((T)(sort.toArray()[(((sort.size()) - 1) / 2)]));
        return ((_returnReplacementOperator2840.is("NULL")) ? ( null ) : (result));
    }

    public static <T>T median(final java.util.Comparator<T> comparator, final T... items) {
        org.apache.commons.lang3.Validate.notEmpty(items, "null/empty items");
        org.apache.commons.lang3.Validate.noNullElements(items);
        org.apache.commons.lang3.Validate.notNull(comparator, "null comparator");
        final java.util.TreeSet<T> sort = new java.util.TreeSet<T>(comparator);
        java.util.Collections.addAll(sort, items);
        @java.lang.SuppressWarnings(value = "unchecked")
        final T result = ((T)(sort.toArray()[(((sort.size()) - 1) / 2)]));
        return ((_returnReplacementOperator2854.is("NULL")) ? ( null ) : (result));
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
            return ((_returnReplacementOperator2855.is("NULL")) ? ( null ) : (result));
        } 
        return ((_returnReplacementOperator2856.is("NULL")) ? ( null ) : (null));
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
            return ((_returnReplacementOperator2848.is("NULL")) ? ( null ) : (checked));
        } 
        return ((_returnReplacementOperator2849.is("NULL")) ? ( null ) : (null));
    }

    public static <T>T cloneIfPossible(final T obj) {
        final T clone = org.apache.commons.lang3.ObjectUtils.clone(obj);
        return ((_returnReplacementOperator2850.is("NULL")) ? ( null ) : (clone == null ? obj : clone));
    }

    public static class Null implements java.io.Serializable {
        private static final long serialVersionUID = 7092611880189329093L;

        Null() {
            super();
        }

        private java.lang.Object readResolve() {
            return ((_returnReplacementOperator2838.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ObjectUtils.NULL));
        }
    }

    public static boolean CONST(final boolean v) {
        return ((_returnReplacementOperator2857.is("NULL")) ? ( null ) : (v));
    }

    public static byte CONST(final byte v) {
        return ((_returnReplacementOperator2862.is("NULL")) ? ( null ) : (v));
    }

    public static byte CONST_BYTE(final int v) throws java.lang.IllegalArgumentException {
        if ((v < (java.lang.Byte.MIN_VALUE)) || (v > (java.lang.Byte.MAX_VALUE))) {
            throw new java.lang.IllegalArgumentException((("Supplied value must be a valid byte literal between -128 and 127: [" + v) + "]"));
        } 
        return ((_returnReplacementOperator2863.is("INT_MIN")) ? ((byte)( -2147483647 )) : (_returnReplacementOperator2863.is("INT_MAX")) ? ((byte)( 2147483646 )) : (_returnReplacementOperator2863.is("ZERO")) ? ((byte)( 0 )) : (((byte)(v))));
    }

    public static char CONST(final char v) {
        return ((_returnReplacementOperator2864.is("NULL")) ? ( null ) : (v));
    }

    public static short CONST(final short v) {
        return ((_returnReplacementOperator2875.is("NULL")) ? ( null ) : (v));
    }

    public static short CONST_SHORT(final int v) throws java.lang.IllegalArgumentException {
        if ((v < (java.lang.Short.MIN_VALUE)) || (v > (java.lang.Short.MAX_VALUE))) {
            throw new java.lang.IllegalArgumentException((("Supplied value must be a valid byte literal between -32768 and 32767: [" + v) + "]"));
        } 
        return ((_returnReplacementOperator2876.is("INT_MIN")) ? ((short)( -2147483647 )) : (_returnReplacementOperator2876.is("INT_MAX")) ? ((short)( 2147483646 )) : (_returnReplacementOperator2876.is("ZERO")) ? ((short)( 0 )) : (((short)(v))));
    }

    public static int CONST(final int v) {
        return ((_returnReplacementOperator2867.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2867.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2867.is("ZERO")) ? ( 0 ) : (v));
    }

    public static long CONST(final long v) {
        return ((_returnReplacementOperator2874.is("NULL")) ? ( null ) : (v));
    }

    public static float CONST(final float v) {
        return ((_returnReplacementOperator2866.is("NULL")) ? ( null ) : (v));
    }

    public static double CONST(final double v) {
        return ((_returnReplacementOperator2865.is("NULL")) ? ( null ) : (v));
    }

    public static <T>T CONST(final T v) {
        return ((_returnReplacementOperator2847.is("NULL")) ? ( null ) : (v));
    }

    private static final metamutator.Selector _returnReplacementOperator2838 = metamutator.Selector.of(2838,new String[]{"INIT","NULL"}).id("_returnReplacementOperator2838");

    private static final metamutator.Selector _returnReplacementOperator2839 = metamutator.Selector.of(2839,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2839");

    private static final metamutator.Selector _returnReplacementOperator2840 = metamutator.Selector.of(2840,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2840");

    private static final metamutator.Selector _returnReplacementOperator2841 = metamutator.Selector.of(2841,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2841");

    private static final metamutator.Selector _returnReplacementOperator2842 = metamutator.Selector.of(2842,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2842");

    private static final metamutator.Selector _returnReplacementOperator2843 = metamutator.Selector.of(2843,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2843");

    private static final metamutator.Selector _returnReplacementOperator2844 = metamutator.Selector.of(2844,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2844");

    private static final metamutator.Selector _returnReplacementOperator2845 = metamutator.Selector.of(2845,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2845");

    private static final metamutator.Selector _returnReplacementOperator2846 = metamutator.Selector.of(2846,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2846");

    private static final metamutator.Selector _returnReplacementOperator2847 = metamutator.Selector.of(2847,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2847");

    private static final metamutator.Selector _returnReplacementOperator2848 = metamutator.Selector.of(2848,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2848");

    private static final metamutator.Selector _returnReplacementOperator2849 = metamutator.Selector.of(2849,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2849");

    private static final metamutator.Selector _returnReplacementOperator2850 = metamutator.Selector.of(2850,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2850");

    private static final metamutator.Selector _returnReplacementOperator2851 = metamutator.Selector.of(2851,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2851");

    private static final metamutator.Selector _returnReplacementOperator2852 = metamutator.Selector.of(2852,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2852");

    private static final metamutator.Selector _returnReplacementOperator2853 = metamutator.Selector.of(2853,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2853");

    private static final metamutator.Selector _returnReplacementOperator2854 = metamutator.Selector.of(2854,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2854");

    private static final metamutator.Selector _returnReplacementOperator2855 = metamutator.Selector.of(2855,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2855");

    private static final metamutator.Selector _returnReplacementOperator2856 = metamutator.Selector.of(2856,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2856");

    private static final metamutator.Selector _returnReplacementOperator2857 = metamutator.Selector.of(2857,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2857");

    private static final metamutator.Selector _returnReplacementOperator2858 = metamutator.Selector.of(2858,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2858");

    private static final metamutator.Selector _returnReplacementOperator2859 = metamutator.Selector.of(2859,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2859");

    private static final metamutator.Selector _returnReplacementOperator2860 = metamutator.Selector.of(2860,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2860");

    private static final metamutator.Selector _returnReplacementOperator2861 = metamutator.Selector.of(2861,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2861");

    private static final metamutator.Selector _returnReplacementOperator2862 = metamutator.Selector.of(2862,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2862");

    private static final metamutator.Selector _returnReplacementOperator2863 = metamutator.Selector.of(2863,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2863");

    private static final metamutator.Selector _returnReplacementOperator2864 = metamutator.Selector.of(2864,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2864");

    private static final metamutator.Selector _returnReplacementOperator2865 = metamutator.Selector.of(2865,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2865");

    private static final metamutator.Selector _returnReplacementOperator2866 = metamutator.Selector.of(2866,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2866");

    private static final metamutator.Selector _returnReplacementOperator2867 = metamutator.Selector.of(2867,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2867");

    private static final metamutator.Selector _returnReplacementOperator2868 = metamutator.Selector.of(2868,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2868");

    private static final metamutator.Selector _returnReplacementOperator2869 = metamutator.Selector.of(2869,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2869");

    private static final metamutator.Selector _returnReplacementOperator2870 = metamutator.Selector.of(2870,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2870");

    private static final metamutator.Selector _returnReplacementOperator2871 = metamutator.Selector.of(2871,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2871");

    private static final metamutator.Selector _returnReplacementOperator2872 = metamutator.Selector.of(2872,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2872");

    private static final metamutator.Selector _returnReplacementOperator2873 = metamutator.Selector.of(2873,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2873");

    private static final metamutator.Selector _returnReplacementOperator2874 = metamutator.Selector.of(2874,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2874");

    private static final metamutator.Selector _returnReplacementOperator2875 = metamutator.Selector.of(2875,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2875");

    private static final metamutator.Selector _returnReplacementOperator2876 = metamutator.Selector.of(2876,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_returnReplacementOperator2876");
}

