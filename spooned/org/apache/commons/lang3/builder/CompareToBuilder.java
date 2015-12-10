package org.apache.commons.lang3.builder;


public class CompareToBuilder implements org.apache.commons.lang3.builder.Builder<java.lang.Integer> {
    private int comparison;

    public CompareToBuilder() {
        super();
        comparison = 0;
    }

    public static int reflectionCompare(final java.lang.Object lhs, final java.lang.Object rhs) {
        return org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(lhs, rhs, false, null);
    }

    public static int reflectionCompare(final java.lang.Object lhs, final java.lang.Object rhs, final boolean compareTransients) {
        return org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(lhs, rhs, compareTransients, null);
    }

    public static int reflectionCompare(final java.lang.Object lhs, final java.lang.Object rhs, final java.util.Collection<java.lang.String> excludeFields) {
        return org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(lhs, rhs, org.apache.commons.lang3.builder.ReflectionToStringBuilder.toNoNullStringArray(excludeFields));
    }

    public static int reflectionCompare(final java.lang.Object lhs, final java.lang.Object rhs, final java.lang.String... excludeFields) {
        return org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(lhs, rhs, false, null, excludeFields);
    }

    public static int reflectionCompare(final java.lang.Object lhs, final java.lang.Object rhs, final boolean compareTransients, final java.lang.Class<?> reflectUpToClass, final java.lang.String... excludeFields) {
        if (lhs == rhs) {
            return 0;
        } 
        if ((lhs == null) || (rhs == null)) {
            throw new java.lang.NullPointerException();
        } 
        java.lang.Class<?> lhsClazz = lhs.getClass();
        if (!(lhsClazz.isInstance(rhs))) {
            throw new java.lang.ClassCastException();
        } 
        final org.apache.commons.lang3.builder.CompareToBuilder compareToBuilder = new org.apache.commons.lang3.builder.CompareToBuilder();
        org.apache.commons.lang3.builder.CompareToBuilder.reflectionAppend(lhs, rhs, lhsClazz, compareToBuilder, compareTransients, excludeFields);
        while (((lhsClazz.getSuperclass()) != null) && (lhsClazz != reflectUpToClass)) {
            lhsClazz = lhsClazz.getSuperclass();
            org.apache.commons.lang3.builder.CompareToBuilder.reflectionAppend(lhs, rhs, lhsClazz, compareToBuilder, compareTransients, excludeFields);
        }
        return compareToBuilder.toComparison();
    }

    private static void reflectionAppend(final java.lang.Object lhs, final java.lang.Object rhs, final java.lang.Class<?> clazz, final org.apache.commons.lang3.builder.CompareToBuilder builder, final boolean useTransients, final java.lang.String[] excludeFields) {
        final java.lang.reflect.Field[] fields = clazz.getDeclaredFields();
        java.lang.reflect.AccessibleObject.setAccessible(fields, true);
        for (int i = 0 ; (i < (fields.length)) && ((builder.comparison) == 0) ; i++) {
            final java.lang.reflect.Field f = fields[i];
            if ((((!(org.apache.commons.lang3.ArrayUtils.contains(excludeFields, f.getName()))) && (!(f.getName().contains("$")))) && (useTransients || (!(java.lang.reflect.Modifier.isTransient(f.getModifiers()))))) && (!(java.lang.reflect.Modifier.isStatic(f.getModifiers())))) {
                try {
                    builder.append(f.get(lhs), f.get(rhs));
                } catch (final java.lang.IllegalAccessException e) {
                    throw new java.lang.InternalError("Unexpected IllegalAccessException");
                }
            } 
        }
    }

    public org.apache.commons.lang3.builder.CompareToBuilder appendSuper(final int superCompareTo) {
        if ((comparison) != 0) {
            return this;
        } 
        comparison = superCompareTo;
        return this;
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final java.lang.Object lhs, final java.lang.Object rhs) {
        return append(lhs, rhs, null);
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final java.lang.Object lhs, final java.lang.Object rhs, final java.util.Comparator<?> comparator) {
        if ((comparison) != 0) {
            return this;
        } 
        if (lhs == rhs) {
            return this;
        } 
        if (lhs == null) {
            comparison = -1;
            return this;
        } 
        if (rhs == null) {
            comparison = +1;
            return this;
        } 
        if (lhs.getClass().isArray()) {
            if (lhs instanceof long[]) {
                append(((long[])(lhs)), ((long[])(rhs)));
            } else if (lhs instanceof int[]) {
                append(((int[])(lhs)), ((int[])(rhs)));
            } else if (lhs instanceof short[]) {
                append(((short[])(lhs)), ((short[])(rhs)));
            } else if (lhs instanceof char[]) {
                append(((char[])(lhs)), ((char[])(rhs)));
            } else if (lhs instanceof byte[]) {
                append(((byte[])(lhs)), ((byte[])(rhs)));
            } else if (lhs instanceof double[]) {
                append(((double[])(lhs)), ((double[])(rhs)));
            } else if (lhs instanceof float[]) {
                append(((float[])(lhs)), ((float[])(rhs)));
            } else if (lhs instanceof boolean[]) {
                append(((boolean[])(lhs)), ((boolean[])(rhs)));
            } else {
                append(((java.lang.Object[])(lhs)), ((java.lang.Object[])(rhs)), comparator);
            }
        } else {
            if (comparator == null) {
                @java.lang.SuppressWarnings(value = "unchecked")
                final java.lang.Comparable<java.lang.Object> comparable = ((java.lang.Comparable<java.lang.Object>)(lhs));
                comparison = comparable.compareTo(rhs);
            } else {
                @java.lang.SuppressWarnings(value = "unchecked")
                final java.util.Comparator<java.lang.Object> comparator2 = ((java.util.Comparator<java.lang.Object>)(comparator));
                comparison = comparator2.compare(lhs, rhs);
            }
        }
        return this;
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final long lhs, final long rhs) {
        if ((comparison) != 0) {
            return this;
        } 
        comparison = lhs < rhs ? -1 : lhs > rhs ? 1 : 0;
        return this;
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final int lhs, final int rhs) {
        if ((comparison) != 0) {
            return this;
        } 
        comparison = lhs < rhs ? -1 : lhs > rhs ? 1 : 0;
        return this;
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final short lhs, final short rhs) {
        if ((comparison) != 0) {
            return this;
        } 
        comparison = lhs < rhs ? -1 : lhs > rhs ? 1 : 0;
        return this;
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final char lhs, final char rhs) {
        if ((comparison) != 0) {
            return this;
        } 
        comparison = lhs < rhs ? -1 : lhs > rhs ? 1 : 0;
        return this;
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final byte lhs, final byte rhs) {
        if ((comparison) != 0) {
            return this;
        } 
        comparison = lhs < rhs ? -1 : lhs > rhs ? 1 : 0;
        return this;
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final double lhs, final double rhs) {
        if ((comparison) != 0) {
            return this;
        } 
        comparison = java.lang.Double.compare(lhs, rhs);
        return this;
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final float lhs, final float rhs) {
        if ((comparison) != 0) {
            return this;
        } 
        comparison = java.lang.Float.compare(lhs, rhs);
        return this;
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final boolean lhs, final boolean rhs) {
        if ((comparison) != 0) {
            return this;
        } 
        if (lhs == rhs) {
            return this;
        } 
        if (lhs == false) {
            comparison = -1;
        } else {
            comparison = +1;
        }
        return this;
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final java.lang.Object[] lhs, final java.lang.Object[] rhs) {
        return append(lhs, rhs, null);
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final java.lang.Object[] lhs, final java.lang.Object[] rhs, final java.util.Comparator<?> comparator) {
        if ((comparison) != 0) {
            return this;
        } 
        if (lhs == rhs) {
            return this;
        } 
        if (lhs == null) {
            comparison = -1;
            return this;
        } 
        if (rhs == null) {
            comparison = +1;
            return this;
        } 
        if ((lhs.length) != (rhs.length)) {
            comparison = (lhs.length) < (rhs.length) ? -1 : +1;
            return this;
        } 
        for (int i = 0 ; (i < (lhs.length)) && ((comparison) == 0) ; i++) {
            append(lhs[i], rhs[i], comparator);
        }
        return this;
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final long[] lhs, final long[] rhs) {
        if ((comparison) != 0) {
            return this;
        } 
        if (lhs == rhs) {
            return this;
        } 
        if (lhs == null) {
            comparison = -1;
            return this;
        } 
        if (rhs == null) {
            comparison = +1;
            return this;
        } 
        if ((lhs.length) != (rhs.length)) {
            comparison = (lhs.length) < (rhs.length) ? -1 : +1;
            return this;
        } 
        for (int i = 0 ; (i < (lhs.length)) && ((comparison) == 0) ; i++) {
            append(lhs[i], rhs[i]);
        }
        return this;
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final int[] lhs, final int[] rhs) {
        if ((comparison) != 0) {
            return this;
        } 
        if (lhs == rhs) {
            return this;
        } 
        if (lhs == null) {
            comparison = -1;
            return this;
        } 
        if (rhs == null) {
            comparison = +1;
            return this;
        } 
        if ((lhs.length) != (rhs.length)) {
            comparison = (lhs.length) < (rhs.length) ? -1 : +1;
            return this;
        } 
        for (int i = 0 ; (i < (lhs.length)) && ((comparison) == 0) ; i++) {
            append(lhs[i], rhs[i]);
        }
        return this;
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final short[] lhs, final short[] rhs) {
        if ((comparison) != 0) {
            return this;
        } 
        if (lhs == rhs) {
            return this;
        } 
        if (lhs == null) {
            comparison = -1;
            return this;
        } 
        if (rhs == null) {
            comparison = +1;
            return this;
        } 
        if ((lhs.length) != (rhs.length)) {
            comparison = (lhs.length) < (rhs.length) ? -1 : +1;
            return this;
        } 
        for (int i = 0 ; (i < (lhs.length)) && ((comparison) == 0) ; i++) {
            append(lhs[i], rhs[i]);
        }
        return this;
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final char[] lhs, final char[] rhs) {
        if ((comparison) != 0) {
            return this;
        } 
        if (lhs == rhs) {
            return this;
        } 
        if (lhs == null) {
            comparison = -1;
            return this;
        } 
        if (rhs == null) {
            comparison = +1;
            return this;
        } 
        if ((lhs.length) != (rhs.length)) {
            comparison = (lhs.length) < (rhs.length) ? -1 : +1;
            return this;
        } 
        for (int i = 0 ; (i < (lhs.length)) && ((comparison) == 0) ; i++) {
            append(lhs[i], rhs[i]);
        }
        return this;
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final byte[] lhs, final byte[] rhs) {
        if ((comparison) != 0) {
            return this;
        } 
        if (lhs == rhs) {
            return this;
        } 
        if (lhs == null) {
            comparison = -1;
            return this;
        } 
        if (rhs == null) {
            comparison = +1;
            return this;
        } 
        if ((lhs.length) != (rhs.length)) {
            comparison = (lhs.length) < (rhs.length) ? -1 : +1;
            return this;
        } 
        for (int i = 0 ; (i < (lhs.length)) && ((comparison) == 0) ; i++) {
            append(lhs[i], rhs[i]);
        }
        return this;
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final double[] lhs, final double[] rhs) {
        if ((comparison) != 0) {
            return this;
        } 
        if (lhs == rhs) {
            return this;
        } 
        if (lhs == null) {
            comparison = -1;
            return this;
        } 
        if (rhs == null) {
            comparison = +1;
            return this;
        } 
        if ((lhs.length) != (rhs.length)) {
            comparison = (lhs.length) < (rhs.length) ? -1 : +1;
            return this;
        } 
        for (int i = 0 ; (i < (lhs.length)) && ((comparison) == 0) ; i++) {
            append(lhs[i], rhs[i]);
        }
        return this;
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final float[] lhs, final float[] rhs) {
        if ((comparison) != 0) {
            return this;
        } 
        if (lhs == rhs) {
            return this;
        } 
        if (lhs == null) {
            comparison = -1;
            return this;
        } 
        if (rhs == null) {
            comparison = +1;
            return this;
        } 
        if ((lhs.length) != (rhs.length)) {
            comparison = (lhs.length) < (rhs.length) ? -1 : +1;
            return this;
        } 
        for (int i = 0 ; (i < (lhs.length)) && ((comparison) == 0) ; i++) {
            append(lhs[i], rhs[i]);
        }
        return this;
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final boolean[] lhs, final boolean[] rhs) {
        if ((comparison) != 0) {
            return this;
        } 
        if (lhs == rhs) {
            return this;
        } 
        if (lhs == null) {
            comparison = -1;
            return this;
        } 
        if (rhs == null) {
            comparison = +1;
            return this;
        } 
        if ((lhs.length) != (rhs.length)) {
            comparison = (lhs.length) < (rhs.length) ? -1 : +1;
            return this;
        } 
        for (int i = 0 ; (i < (lhs.length)) && ((comparison) == 0) ; i++) {
            append(lhs[i], rhs[i]);
        }
        return this;
    }

    public int toComparison() {
        return comparison;
    }

    @java.lang.Override
    public java.lang.Integer build() {
        return java.lang.Integer.valueOf(toComparison());
    }
}

