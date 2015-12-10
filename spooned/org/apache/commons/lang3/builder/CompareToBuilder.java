package org.apache.commons.lang3.builder;


public class CompareToBuilder implements org.apache.commons.lang3.builder.Builder<java.lang.Integer> {
    private int comparison;

    public CompareToBuilder() {
        super();
        comparison = 0;
    }

    public static int reflectionCompare(final java.lang.Object lhs, final java.lang.Object rhs) {
        return ((_returnReplacementOperator1.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(lhs, rhs, false, null)));
    }

    public static int reflectionCompare(final java.lang.Object lhs, final java.lang.Object rhs, final boolean compareTransients) {
        return ((_returnReplacementOperator2.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(lhs, rhs, compareTransients, null)));
    }

    public static int reflectionCompare(final java.lang.Object lhs, final java.lang.Object rhs, final java.util.Collection<java.lang.String> excludeFields) {
        return ((_returnReplacementOperator6.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator6.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator6.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(lhs, rhs, org.apache.commons.lang3.builder.ReflectionToStringBuilder.toNoNullStringArray(excludeFields))));
    }

    public static int reflectionCompare(final java.lang.Object lhs, final java.lang.Object rhs, final java.lang.String... excludeFields) {
        return ((_returnReplacementOperator5.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator5.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator5.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(lhs, rhs, false, null, excludeFields)));
    }

    public static int reflectionCompare(final java.lang.Object lhs, final java.lang.Object rhs, final boolean compareTransients, final java.lang.Class<?> reflectUpToClass, final java.lang.String... excludeFields) {
        if (lhs == rhs) {
            return ((_returnReplacementOperator3.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator3.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator3.is("ZERO")) ? ( 0 ) : (0));
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
        return ((_returnReplacementOperator4.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator4.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator4.is("ZERO")) ? ( 0 ) : (compareToBuilder.toComparison()));
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
            return ((_returnReplacementOperator87.is("NULL")) ? ( null ) : (this));
        } 
        comparison = superCompareTo;
        return ((_returnReplacementOperator88.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final java.lang.Object lhs, final java.lang.Object rhs) {
        return ((_returnReplacementOperator58.is("NULL")) ? ( null ) : (append(lhs, rhs, null)));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final java.lang.Object lhs, final java.lang.Object rhs, final java.util.Comparator<?> comparator) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperator59.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperator60.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs == null) {
            comparison = -1;
            return ((_returnReplacementOperator61.is("NULL")) ? ( null ) : (this));
        } 
        if (rhs == null) {
            comparison = +1;
            return ((_returnReplacementOperator62.is("NULL")) ? ( null ) : (this));
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
        return ((_returnReplacementOperator63.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final long lhs, final long rhs) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperator71.is("NULL")) ? ( null ) : (this));
        } 
        comparison = lhs < rhs ? -1 : lhs > rhs ? 1 : 0;
        return ((_returnReplacementOperator72.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final int lhs, final int rhs) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperator50.is("NULL")) ? ( null ) : (this));
        } 
        comparison = lhs < rhs ? -1 : lhs > rhs ? 1 : 0;
        return ((_returnReplacementOperator51.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final short lhs, final short rhs) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperator79.is("NULL")) ? ( null ) : (this));
        } 
        comparison = lhs < rhs ? -1 : lhs > rhs ? 1 : 0;
        return ((_returnReplacementOperator80.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final char lhs, final char rhs) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperator26.is("NULL")) ? ( null ) : (this));
        } 
        comparison = lhs < rhs ? -1 : lhs > rhs ? 1 : 0;
        return ((_returnReplacementOperator27.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final byte lhs, final byte rhs) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperator18.is("NULL")) ? ( null ) : (this));
        } 
        comparison = lhs < rhs ? -1 : lhs > rhs ? 1 : 0;
        return ((_returnReplacementOperator19.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final double lhs, final double rhs) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperator34.is("NULL")) ? ( null ) : (this));
        } 
        comparison = java.lang.Double.compare(lhs, rhs);
        return ((_returnReplacementOperator35.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final float lhs, final float rhs) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperator42.is("NULL")) ? ( null ) : (this));
        } 
        comparison = java.lang.Float.compare(lhs, rhs);
        return ((_returnReplacementOperator43.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final boolean lhs, final boolean rhs) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperator9.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperator10.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs == false) {
            comparison = -1;
        } else {
            comparison = +1;
        }
        return ((_returnReplacementOperator11.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final java.lang.Object[] lhs, final java.lang.Object[] rhs) {
        return ((_returnReplacementOperator64.is("NULL")) ? ( null ) : (append(lhs, rhs, null)));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final java.lang.Object[] lhs, final java.lang.Object[] rhs, final java.util.Comparator<?> comparator) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperator65.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperator66.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs == null) {
            comparison = -1;
            return ((_returnReplacementOperator67.is("NULL")) ? ( null ) : (this));
        } 
        if (rhs == null) {
            comparison = +1;
            return ((_returnReplacementOperator68.is("NULL")) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            comparison = (lhs.length) < (rhs.length) ? -1 : +1;
            return ((_returnReplacementOperator69.is("NULL")) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && ((comparison) == 0) ; i++) {
            append(lhs[i], rhs[i], comparator);
        }
        return ((_returnReplacementOperator70.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final long[] lhs, final long[] rhs) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperator73.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperator74.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs == null) {
            comparison = -1;
            return ((_returnReplacementOperator75.is("NULL")) ? ( null ) : (this));
        } 
        if (rhs == null) {
            comparison = +1;
            return ((_returnReplacementOperator76.is("NULL")) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            comparison = (lhs.length) < (rhs.length) ? -1 : +1;
            return ((_returnReplacementOperator77.is("NULL")) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && ((comparison) == 0) ; i++) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperator78.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final int[] lhs, final int[] rhs) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperator52.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperator53.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs == null) {
            comparison = -1;
            return ((_returnReplacementOperator54.is("NULL")) ? ( null ) : (this));
        } 
        if (rhs == null) {
            comparison = +1;
            return ((_returnReplacementOperator55.is("NULL")) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            comparison = (lhs.length) < (rhs.length) ? -1 : +1;
            return ((_returnReplacementOperator56.is("NULL")) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && ((comparison) == 0) ; i++) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperator57.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final short[] lhs, final short[] rhs) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperator81.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperator82.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs == null) {
            comparison = -1;
            return ((_returnReplacementOperator83.is("NULL")) ? ( null ) : (this));
        } 
        if (rhs == null) {
            comparison = +1;
            return ((_returnReplacementOperator84.is("NULL")) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            comparison = (lhs.length) < (rhs.length) ? -1 : +1;
            return ((_returnReplacementOperator85.is("NULL")) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && ((comparison) == 0) ; i++) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperator86.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final char[] lhs, final char[] rhs) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperator28.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperator29.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs == null) {
            comparison = -1;
            return ((_returnReplacementOperator30.is("NULL")) ? ( null ) : (this));
        } 
        if (rhs == null) {
            comparison = +1;
            return ((_returnReplacementOperator31.is("NULL")) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            comparison = (lhs.length) < (rhs.length) ? -1 : +1;
            return ((_returnReplacementOperator32.is("NULL")) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && ((comparison) == 0) ; i++) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperator33.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final byte[] lhs, final byte[] rhs) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperator20.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperator21.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs == null) {
            comparison = -1;
            return ((_returnReplacementOperator22.is("NULL")) ? ( null ) : (this));
        } 
        if (rhs == null) {
            comparison = +1;
            return ((_returnReplacementOperator23.is("NULL")) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            comparison = (lhs.length) < (rhs.length) ? -1 : +1;
            return ((_returnReplacementOperator24.is("NULL")) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && ((comparison) == 0) ; i++) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperator25.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final double[] lhs, final double[] rhs) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperator36.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperator37.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs == null) {
            comparison = -1;
            return ((_returnReplacementOperator38.is("NULL")) ? ( null ) : (this));
        } 
        if (rhs == null) {
            comparison = +1;
            return ((_returnReplacementOperator39.is("NULL")) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            comparison = (lhs.length) < (rhs.length) ? -1 : +1;
            return ((_returnReplacementOperator40.is("NULL")) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && ((comparison) == 0) ; i++) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperator41.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final float[] lhs, final float[] rhs) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperator44.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperator45.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs == null) {
            comparison = -1;
            return ((_returnReplacementOperator46.is("NULL")) ? ( null ) : (this));
        } 
        if (rhs == null) {
            comparison = +1;
            return ((_returnReplacementOperator47.is("NULL")) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            comparison = (lhs.length) < (rhs.length) ? -1 : +1;
            return ((_returnReplacementOperator48.is("NULL")) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && ((comparison) == 0) ; i++) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperator49.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final boolean[] lhs, final boolean[] rhs) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperator12.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperator13.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs == null) {
            comparison = -1;
            return ((_returnReplacementOperator14.is("NULL")) ? ( null ) : (this));
        } 
        if (rhs == null) {
            comparison = +1;
            return ((_returnReplacementOperator15.is("NULL")) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            comparison = (lhs.length) < (rhs.length) ? -1 : +1;
            return ((_returnReplacementOperator16.is("NULL")) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && ((comparison) == 0) ; i++) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperator17.is("NULL")) ? ( null ) : (this));
    }

    public int toComparison() {
        return ((_returnReplacementOperator7.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator7.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator7.is("ZERO")) ? ( 0 ) : (comparison));
    }

    @java.lang.Override
    public java.lang.Integer build() {
        return ((_returnReplacementOperator8.is("NULL")) ? ( null ) : (java.lang.Integer.valueOf(toComparison())));
    }

    private static final metamutator.Selector _returnReplacementOperator1 = metamutator.Selector.of(1,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator1");

    private static final metamutator.Selector _returnReplacementOperator2 = metamutator.Selector.of(2,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator2");

    private static final metamutator.Selector _returnReplacementOperator3 = metamutator.Selector.of(3,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator3");

    private static final metamutator.Selector _returnReplacementOperator4 = metamutator.Selector.of(4,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator4");

    private static final metamutator.Selector _returnReplacementOperator5 = metamutator.Selector.of(5,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator5");

    private static final metamutator.Selector _returnReplacementOperator6 = metamutator.Selector.of(6,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator6");

    private static final metamutator.Selector _returnReplacementOperator7 = metamutator.Selector.of(7,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator7");

    private static final metamutator.Selector _returnReplacementOperator8 = metamutator.Selector.of(8,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator8");

    private static final metamutator.Selector _returnReplacementOperator9 = metamutator.Selector.of(9,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator9");

    private static final metamutator.Selector _returnReplacementOperator10 = metamutator.Selector.of(10,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator10");

    private static final metamutator.Selector _returnReplacementOperator11 = metamutator.Selector.of(11,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator11");

    private static final metamutator.Selector _returnReplacementOperator12 = metamutator.Selector.of(12,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator12");

    private static final metamutator.Selector _returnReplacementOperator13 = metamutator.Selector.of(13,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator13");

    private static final metamutator.Selector _returnReplacementOperator14 = metamutator.Selector.of(14,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator14");

    private static final metamutator.Selector _returnReplacementOperator15 = metamutator.Selector.of(15,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator15");

    private static final metamutator.Selector _returnReplacementOperator16 = metamutator.Selector.of(16,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator16");

    private static final metamutator.Selector _returnReplacementOperator17 = metamutator.Selector.of(17,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator17");

    private static final metamutator.Selector _returnReplacementOperator18 = metamutator.Selector.of(18,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator18");

    private static final metamutator.Selector _returnReplacementOperator19 = metamutator.Selector.of(19,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator19");

    private static final metamutator.Selector _returnReplacementOperator20 = metamutator.Selector.of(20,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator20");

    private static final metamutator.Selector _returnReplacementOperator21 = metamutator.Selector.of(21,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator21");

    private static final metamutator.Selector _returnReplacementOperator22 = metamutator.Selector.of(22,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator22");

    private static final metamutator.Selector _returnReplacementOperator23 = metamutator.Selector.of(23,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator23");

    private static final metamutator.Selector _returnReplacementOperator24 = metamutator.Selector.of(24,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator24");

    private static final metamutator.Selector _returnReplacementOperator25 = metamutator.Selector.of(25,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator25");

    private static final metamutator.Selector _returnReplacementOperator26 = metamutator.Selector.of(26,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator26");

    private static final metamutator.Selector _returnReplacementOperator27 = metamutator.Selector.of(27,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator27");

    private static final metamutator.Selector _returnReplacementOperator28 = metamutator.Selector.of(28,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator28");

    private static final metamutator.Selector _returnReplacementOperator29 = metamutator.Selector.of(29,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator29");

    private static final metamutator.Selector _returnReplacementOperator30 = metamutator.Selector.of(30,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator30");

    private static final metamutator.Selector _returnReplacementOperator31 = metamutator.Selector.of(31,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator31");

    private static final metamutator.Selector _returnReplacementOperator32 = metamutator.Selector.of(32,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator32");

    private static final metamutator.Selector _returnReplacementOperator33 = metamutator.Selector.of(33,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator33");

    private static final metamutator.Selector _returnReplacementOperator34 = metamutator.Selector.of(34,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator34");

    private static final metamutator.Selector _returnReplacementOperator35 = metamutator.Selector.of(35,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator35");

    private static final metamutator.Selector _returnReplacementOperator36 = metamutator.Selector.of(36,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator36");

    private static final metamutator.Selector _returnReplacementOperator37 = metamutator.Selector.of(37,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator37");

    private static final metamutator.Selector _returnReplacementOperator38 = metamutator.Selector.of(38,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator38");

    private static final metamutator.Selector _returnReplacementOperator39 = metamutator.Selector.of(39,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator39");

    private static final metamutator.Selector _returnReplacementOperator40 = metamutator.Selector.of(40,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator40");

    private static final metamutator.Selector _returnReplacementOperator41 = metamutator.Selector.of(41,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator41");

    private static final metamutator.Selector _returnReplacementOperator42 = metamutator.Selector.of(42,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator42");

    private static final metamutator.Selector _returnReplacementOperator43 = metamutator.Selector.of(43,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator43");

    private static final metamutator.Selector _returnReplacementOperator44 = metamutator.Selector.of(44,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator44");

    private static final metamutator.Selector _returnReplacementOperator45 = metamutator.Selector.of(45,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator45");

    private static final metamutator.Selector _returnReplacementOperator46 = metamutator.Selector.of(46,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator46");

    private static final metamutator.Selector _returnReplacementOperator47 = metamutator.Selector.of(47,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator47");

    private static final metamutator.Selector _returnReplacementOperator48 = metamutator.Selector.of(48,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator48");

    private static final metamutator.Selector _returnReplacementOperator49 = metamutator.Selector.of(49,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator49");

    private static final metamutator.Selector _returnReplacementOperator50 = metamutator.Selector.of(50,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator50");

    private static final metamutator.Selector _returnReplacementOperator51 = metamutator.Selector.of(51,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator51");

    private static final metamutator.Selector _returnReplacementOperator52 = metamutator.Selector.of(52,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator52");

    private static final metamutator.Selector _returnReplacementOperator53 = metamutator.Selector.of(53,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator53");

    private static final metamutator.Selector _returnReplacementOperator54 = metamutator.Selector.of(54,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator54");

    private static final metamutator.Selector _returnReplacementOperator55 = metamutator.Selector.of(55,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator55");

    private static final metamutator.Selector _returnReplacementOperator56 = metamutator.Selector.of(56,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator56");

    private static final metamutator.Selector _returnReplacementOperator57 = metamutator.Selector.of(57,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator57");

    private static final metamutator.Selector _returnReplacementOperator58 = metamutator.Selector.of(58,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator58");

    private static final metamutator.Selector _returnReplacementOperator59 = metamutator.Selector.of(59,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator59");

    private static final metamutator.Selector _returnReplacementOperator60 = metamutator.Selector.of(60,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator60");

    private static final metamutator.Selector _returnReplacementOperator61 = metamutator.Selector.of(61,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator61");

    private static final metamutator.Selector _returnReplacementOperator62 = metamutator.Selector.of(62,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator62");

    private static final metamutator.Selector _returnReplacementOperator63 = metamutator.Selector.of(63,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator63");

    private static final metamutator.Selector _returnReplacementOperator64 = metamutator.Selector.of(64,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator64");

    private static final metamutator.Selector _returnReplacementOperator65 = metamutator.Selector.of(65,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator65");

    private static final metamutator.Selector _returnReplacementOperator66 = metamutator.Selector.of(66,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator66");

    private static final metamutator.Selector _returnReplacementOperator67 = metamutator.Selector.of(67,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator67");

    private static final metamutator.Selector _returnReplacementOperator68 = metamutator.Selector.of(68,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator68");

    private static final metamutator.Selector _returnReplacementOperator69 = metamutator.Selector.of(69,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator69");

    private static final metamutator.Selector _returnReplacementOperator70 = metamutator.Selector.of(70,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator70");

    private static final metamutator.Selector _returnReplacementOperator71 = metamutator.Selector.of(71,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator71");

    private static final metamutator.Selector _returnReplacementOperator72 = metamutator.Selector.of(72,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator72");

    private static final metamutator.Selector _returnReplacementOperator73 = metamutator.Selector.of(73,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator73");

    private static final metamutator.Selector _returnReplacementOperator74 = metamutator.Selector.of(74,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator74");

    private static final metamutator.Selector _returnReplacementOperator75 = metamutator.Selector.of(75,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator75");

    private static final metamutator.Selector _returnReplacementOperator76 = metamutator.Selector.of(76,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator76");

    private static final metamutator.Selector _returnReplacementOperator77 = metamutator.Selector.of(77,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator77");

    private static final metamutator.Selector _returnReplacementOperator78 = metamutator.Selector.of(78,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator78");

    private static final metamutator.Selector _returnReplacementOperator79 = metamutator.Selector.of(79,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator79");

    private static final metamutator.Selector _returnReplacementOperator80 = metamutator.Selector.of(80,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator80");

    private static final metamutator.Selector _returnReplacementOperator81 = metamutator.Selector.of(81,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator81");

    private static final metamutator.Selector _returnReplacementOperator82 = metamutator.Selector.of(82,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator82");

    private static final metamutator.Selector _returnReplacementOperator83 = metamutator.Selector.of(83,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator83");

    private static final metamutator.Selector _returnReplacementOperator84 = metamutator.Selector.of(84,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator84");

    private static final metamutator.Selector _returnReplacementOperator85 = metamutator.Selector.of(85,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator85");

    private static final metamutator.Selector _returnReplacementOperator86 = metamutator.Selector.of(86,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator86");

    private static final metamutator.Selector _returnReplacementOperator87 = metamutator.Selector.of(87,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator87");

    private static final metamutator.Selector _returnReplacementOperator88 = metamutator.Selector.of(88,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperator88");
}

