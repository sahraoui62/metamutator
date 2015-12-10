package org.apache.commons.lang3;


public class ObjectUtils {
    public static final org.apache.commons.lang3.ObjectUtils.Null NULL = new org.apache.commons.lang3.ObjectUtils.Null();

    public ObjectUtils() {
        super();
    }

    public static <T>T defaultIfNull(final T object, final T defaultValue) {
        return object != null ? object : defaultValue;
    }

    public static <T>T firstNonNull(final T... values) {
        if (values != null) {
            for (final T val : values) {
                if (val != null) {
                    return val;
                } 
            }
        } 
        return null;
    }

    @java.lang.Deprecated
    public static boolean equals(final java.lang.Object object1, final java.lang.Object object2) {
        if (object1 == object2) {
            return true;
        } 
        if ((object1 == null) || (object2 == null)) {
            return false;
        } 
        return object1.equals(object2);
    }

    public static boolean notEqual(final java.lang.Object object1, final java.lang.Object object2) {
        return (org.apache.commons.lang3.ObjectUtils.equals(object1, object2)) == false;
    }

    @java.lang.Deprecated
    public static int hashCode(final java.lang.Object obj) {
        return obj == null ? 0 : obj.hashCode();
    }

    @java.lang.Deprecated
    public static int hashCodeMulti(final java.lang.Object... objects) {
        int hash = 1;
        if (objects != null) {
            for (final java.lang.Object object : objects) {
                final int tmpHash = org.apache.commons.lang3.ObjectUtils.hashCode(object);
                hash = ((_arithmeticOperatorHotSpot697.is("PLUS")) ? ((hash + 31)) : (_arithmeticOperatorHotSpot697.is("MINUS")) ? ((hash - 31)) : (_arithmeticOperatorHotSpot697.is("MUL")) ? ((hash * 31)) :  ((hash / 31))) + tmpHash;
            }
        } 
        return hash;
    }

    public static java.lang.String identityToString(final java.lang.Object object) {
        if (object == null) {
            return null;
        } 
        final java.lang.StringBuilder builder = new java.lang.StringBuilder();
        org.apache.commons.lang3.ObjectUtils.identityToString(builder, object);
        return builder.toString();
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
        return obj == null ? "" : obj.toString();
    }

    @java.lang.Deprecated
    public static java.lang.String toString(final java.lang.Object obj, final java.lang.String nullStr) {
        return obj == null ? nullStr : obj.toString();
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
        return result;
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
        return result;
    }

    public static <T extends java.lang.Comparable<? super T>>int compare(final T c1, final T c2) {
        return org.apache.commons.lang3.ObjectUtils.compare(c1, c2, false);
    }

    public static <T extends java.lang.Comparable<? super T>>int compare(final T c1, final T c2, final boolean nullGreater) {
        if (c1 == c2) {
            return 0;
        } else if (c1 == null) {
            return nullGreater ? 1 : -1;
        } else if (c2 == null) {
            return nullGreater ? -1 : 1;
        } 
        return c1.compareTo(c2);
    }

    public static <T extends java.lang.Comparable<? super T>>T median(final T... items) {
        org.apache.commons.lang3.Validate.notEmpty(items);
        org.apache.commons.lang3.Validate.noNullElements(items);
        final java.util.TreeSet<T> sort = new java.util.TreeSet<T>();
        java.util.Collections.addAll(sort, items);
        @java.lang.SuppressWarnings(value = "unchecked")
        final T result = ((T)(sort.toArray()[(((_arithmeticOperatorHotSpot695.is("PLUS")) ? (((sort.size()) + 1)) : (_arithmeticOperatorHotSpot695.is("MINUS")) ? (((sort.size()) - 1)) : (_arithmeticOperatorHotSpot695.is("MUL")) ? (((sort.size()) * 1)) :  (((sort.size()) / 1))) / 2)]));
        return result;
    }

    public static <T>T median(final java.util.Comparator<T> comparator, final T... items) {
        org.apache.commons.lang3.Validate.notEmpty(items, "null/empty items");
        org.apache.commons.lang3.Validate.noNullElements(items);
        org.apache.commons.lang3.Validate.notNull(comparator, "null comparator");
        final java.util.TreeSet<T> sort = new java.util.TreeSet<T>(comparator);
        java.util.Collections.addAll(sort, items);
        @java.lang.SuppressWarnings(value = "unchecked")
        final T result = ((T)(sort.toArray()[(((_arithmeticOperatorHotSpot696.is("PLUS")) ? (((sort.size()) + 1)) : (_arithmeticOperatorHotSpot696.is("MINUS")) ? (((sort.size()) - 1)) : (_arithmeticOperatorHotSpot696.is("MUL")) ? (((sort.size()) * 1)) :  (((sort.size()) / 1))) / 2)]));
        return result;
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
            return result;
        } 
        return null;
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
            return checked;
        } 
        return null;
    }

    public static <T>T cloneIfPossible(final T obj) {
        final T clone = org.apache.commons.lang3.ObjectUtils.clone(obj);
        return clone == null ? obj : clone;
    }

    public static class Null implements java.io.Serializable {
        private static final long serialVersionUID = 7092611880189329093L;

        Null() {
            super();
        }

        private java.lang.Object readResolve() {
            return org.apache.commons.lang3.ObjectUtils.NULL;
        }
    }

    public static boolean CONST(final boolean v) {
        return v;
    }

    public static byte CONST(final byte v) {
        return v;
    }

    public static byte CONST_BYTE(final int v) throws java.lang.IllegalArgumentException {
        if ((v < (java.lang.Byte.MIN_VALUE)) || (v > (java.lang.Byte.MAX_VALUE))) {
            throw new java.lang.IllegalArgumentException((("Supplied value must be a valid byte literal between -128 and 127: [" + v) + "]"));
        } 
        return ((byte)(v));
    }

    public static char CONST(final char v) {
        return v;
    }

    public static short CONST(final short v) {
        return v;
    }

    public static short CONST_SHORT(final int v) throws java.lang.IllegalArgumentException {
        if ((v < (java.lang.Short.MIN_VALUE)) || (v > (java.lang.Short.MAX_VALUE))) {
            throw new java.lang.IllegalArgumentException((("Supplied value must be a valid byte literal between -32768 and 32767: [" + v) + "]"));
        } 
        return ((short)(v));
    }

    public static int CONST(final int v) {
        return v;
    }

    public static long CONST(final long v) {
        return v;
    }

    public static float CONST(final float v) {
        return v;
    }

    public static double CONST(final double v) {
        return v;
    }

    public static <T>T CONST(final T v) {
        return v;
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot695 = metamutator.Selector.of(695,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_arithmeticOperatorHotSpot695");

    private static final metamutator.Selector _arithmeticOperatorHotSpot696 = metamutator.Selector.of(696,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_arithmeticOperatorHotSpot696");

    private static final metamutator.Selector _arithmeticOperatorHotSpot697 = metamutator.Selector.of(697,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.ObjectUtils.class).id("_arithmeticOperatorHotSpot697");
}

