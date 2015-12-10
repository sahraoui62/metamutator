package org.apache.commons.lang3.builder;


public class CompareToBuilder implements org.apache.commons.lang3.builder.Builder<java.lang.Integer> {
    private int comparison;

    public CompareToBuilder() {
        super();
        comparison = 0;
    }

    public static int reflectionCompare(final java.lang.Object lhs, final java.lang.Object rhs) {
        return ((_returnReplacementOperatorHotSpot1.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(lhs, rhs, false, null)));
    }

    public static int reflectionCompare(final java.lang.Object lhs, final java.lang.Object rhs, final boolean compareTransients) {
        return ((_returnReplacementOperatorHotSpot2.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(lhs, rhs, compareTransients, null)));
    }

    public static int reflectionCompare(final java.lang.Object lhs, final java.lang.Object rhs, final java.util.Collection<java.lang.String> excludeFields) {
        return ((_returnReplacementOperatorHotSpot6.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot6.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot6.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(lhs, rhs, org.apache.commons.lang3.builder.ReflectionToStringBuilder.toNoNullStringArray(excludeFields))));
    }

    public static int reflectionCompare(final java.lang.Object lhs, final java.lang.Object rhs, final java.lang.String... excludeFields) {
        return ((_returnReplacementOperatorHotSpot5.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot5.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot5.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(lhs, rhs, false, null, excludeFields)));
    }

    public static int reflectionCompare(final java.lang.Object lhs, final java.lang.Object rhs, final boolean compareTransients, final java.lang.Class<?> reflectUpToClass, final java.lang.String... excludeFields) {
        if (lhs == rhs) {
            return ((_returnReplacementOperatorHotSpot3.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot3.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot3.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (0));
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
        return ((_returnReplacementOperatorHotSpot4.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot4.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot4.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (compareToBuilder.toComparison()));
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
            return ((_returnReplacementOperatorHotSpot87.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        comparison = superCompareTo;
        return ((_returnReplacementOperatorHotSpot88.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final java.lang.Object lhs, final java.lang.Object rhs) {
        return ((_returnReplacementOperatorHotSpot58.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(lhs, rhs, null)));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final java.lang.Object lhs, final java.lang.Object rhs, final java.util.Comparator<?> comparator) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperatorHotSpot59.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperatorHotSpot60.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs == null) {
            comparison = -1;
            return ((_returnReplacementOperatorHotSpot61.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (rhs == null) {
            comparison = +1;
            return ((_returnReplacementOperatorHotSpot62.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
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
        return ((_returnReplacementOperatorHotSpot63.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final long lhs, final long rhs) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperatorHotSpot71.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        comparison = lhs < rhs ? -1 : lhs > rhs ? 1 : 0;
        return ((_returnReplacementOperatorHotSpot72.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final int lhs, final int rhs) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperatorHotSpot50.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        comparison = lhs < rhs ? -1 : lhs > rhs ? 1 : 0;
        return ((_returnReplacementOperatorHotSpot51.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final short lhs, final short rhs) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperatorHotSpot79.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        comparison = lhs < rhs ? -1 : lhs > rhs ? 1 : 0;
        return ((_returnReplacementOperatorHotSpot80.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final char lhs, final char rhs) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperatorHotSpot26.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        comparison = lhs < rhs ? -1 : lhs > rhs ? 1 : 0;
        return ((_returnReplacementOperatorHotSpot27.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final byte lhs, final byte rhs) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperatorHotSpot18.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        comparison = lhs < rhs ? -1 : lhs > rhs ? 1 : 0;
        return ((_returnReplacementOperatorHotSpot19.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final double lhs, final double rhs) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperatorHotSpot34.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        comparison = java.lang.Double.compare(lhs, rhs);
        return ((_returnReplacementOperatorHotSpot35.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final float lhs, final float rhs) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperatorHotSpot42.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        comparison = java.lang.Float.compare(lhs, rhs);
        return ((_returnReplacementOperatorHotSpot43.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final boolean lhs, final boolean rhs) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperatorHotSpot9.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperatorHotSpot10.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs == false) {
            comparison = -1;
        } else {
            comparison = +1;
        }
        return ((_returnReplacementOperatorHotSpot11.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final java.lang.Object[] lhs, final java.lang.Object[] rhs) {
        return ((_returnReplacementOperatorHotSpot64.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(lhs, rhs, null)));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final java.lang.Object[] lhs, final java.lang.Object[] rhs, final java.util.Comparator<?> comparator) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperatorHotSpot65.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperatorHotSpot66.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs == null) {
            comparison = -1;
            return ((_returnReplacementOperatorHotSpot67.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (rhs == null) {
            comparison = +1;
            return ((_returnReplacementOperatorHotSpot68.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            comparison = (lhs.length) < (rhs.length) ? -1 : +1;
            return ((_returnReplacementOperatorHotSpot69.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && ((comparison) == 0) ; i++) {
            append(lhs[i], rhs[i], comparator);
        }
        return ((_returnReplacementOperatorHotSpot70.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final long[] lhs, final long[] rhs) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperatorHotSpot73.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperatorHotSpot74.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs == null) {
            comparison = -1;
            return ((_returnReplacementOperatorHotSpot75.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (rhs == null) {
            comparison = +1;
            return ((_returnReplacementOperatorHotSpot76.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            comparison = (lhs.length) < (rhs.length) ? -1 : +1;
            return ((_returnReplacementOperatorHotSpot77.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && ((comparison) == 0) ; i++) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperatorHotSpot78.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final int[] lhs, final int[] rhs) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperatorHotSpot52.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperatorHotSpot53.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs == null) {
            comparison = -1;
            return ((_returnReplacementOperatorHotSpot54.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (rhs == null) {
            comparison = +1;
            return ((_returnReplacementOperatorHotSpot55.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            comparison = (lhs.length) < (rhs.length) ? -1 : +1;
            return ((_returnReplacementOperatorHotSpot56.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && ((comparison) == 0) ; i++) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperatorHotSpot57.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final short[] lhs, final short[] rhs) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperatorHotSpot81.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperatorHotSpot82.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs == null) {
            comparison = -1;
            return ((_returnReplacementOperatorHotSpot83.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (rhs == null) {
            comparison = +1;
            return ((_returnReplacementOperatorHotSpot84.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            comparison = (lhs.length) < (rhs.length) ? -1 : +1;
            return ((_returnReplacementOperatorHotSpot85.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && ((comparison) == 0) ; i++) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperatorHotSpot86.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final char[] lhs, final char[] rhs) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperatorHotSpot28.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperatorHotSpot29.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs == null) {
            comparison = -1;
            return ((_returnReplacementOperatorHotSpot30.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (rhs == null) {
            comparison = +1;
            return ((_returnReplacementOperatorHotSpot31.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            comparison = (lhs.length) < (rhs.length) ? -1 : +1;
            return ((_returnReplacementOperatorHotSpot32.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && ((comparison) == 0) ; i++) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperatorHotSpot33.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final byte[] lhs, final byte[] rhs) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperatorHotSpot20.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperatorHotSpot21.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs == null) {
            comparison = -1;
            return ((_returnReplacementOperatorHotSpot22.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (rhs == null) {
            comparison = +1;
            return ((_returnReplacementOperatorHotSpot23.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            comparison = (lhs.length) < (rhs.length) ? -1 : +1;
            return ((_returnReplacementOperatorHotSpot24.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && ((comparison) == 0) ; i++) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperatorHotSpot25.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final double[] lhs, final double[] rhs) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperatorHotSpot36.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperatorHotSpot37.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs == null) {
            comparison = -1;
            return ((_returnReplacementOperatorHotSpot38.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (rhs == null) {
            comparison = +1;
            return ((_returnReplacementOperatorHotSpot39.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            comparison = (lhs.length) < (rhs.length) ? -1 : +1;
            return ((_returnReplacementOperatorHotSpot40.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && ((comparison) == 0) ; i++) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperatorHotSpot41.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final float[] lhs, final float[] rhs) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperatorHotSpot44.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperatorHotSpot45.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs == null) {
            comparison = -1;
            return ((_returnReplacementOperatorHotSpot46.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (rhs == null) {
            comparison = +1;
            return ((_returnReplacementOperatorHotSpot47.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            comparison = (lhs.length) < (rhs.length) ? -1 : +1;
            return ((_returnReplacementOperatorHotSpot48.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && ((comparison) == 0) ; i++) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperatorHotSpot49.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(final boolean[] lhs, final boolean[] rhs) {
        if ((comparison) != 0) {
            return ((_returnReplacementOperatorHotSpot12.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperatorHotSpot13.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs == null) {
            comparison = -1;
            return ((_returnReplacementOperatorHotSpot14.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (rhs == null) {
            comparison = +1;
            return ((_returnReplacementOperatorHotSpot15.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            comparison = (lhs.length) < (rhs.length) ? -1 : +1;
            return ((_returnReplacementOperatorHotSpot16.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && ((comparison) == 0) ; i++) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperatorHotSpot17.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public int toComparison() {
        return ((_returnReplacementOperatorHotSpot7.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot7.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot7.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (comparison));
    }

    @java.lang.Override
    public java.lang.Integer build() {
        return ((_returnReplacementOperatorHotSpot8.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Integer.valueOf(toComparison())));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1 = metamutator.Selector.of(1,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot1");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2 = metamutator.Selector.of(2,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot2");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3 = metamutator.Selector.of(3,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot3");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot4 = metamutator.Selector.of(4,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot4");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot5 = metamutator.Selector.of(5,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot5");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot6 = metamutator.Selector.of(6,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot6");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot7 = metamutator.Selector.of(7,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot7");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot8 = metamutator.Selector.of(8,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot8");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot9 = metamutator.Selector.of(9,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot9");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot10 = metamutator.Selector.of(10,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot10");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot11 = metamutator.Selector.of(11,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot11");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot12 = metamutator.Selector.of(12,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot12");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot13 = metamutator.Selector.of(13,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot13");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot14 = metamutator.Selector.of(14,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot14");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot15 = metamutator.Selector.of(15,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot15");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot16 = metamutator.Selector.of(16,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot16");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot17 = metamutator.Selector.of(17,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot17");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot18 = metamutator.Selector.of(18,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot18");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot19 = metamutator.Selector.of(19,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot19");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot20 = metamutator.Selector.of(20,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot20");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot21 = metamutator.Selector.of(21,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot21");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot22 = metamutator.Selector.of(22,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot22");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot23 = metamutator.Selector.of(23,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot23");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot24 = metamutator.Selector.of(24,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot24");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot25 = metamutator.Selector.of(25,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot25");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot26 = metamutator.Selector.of(26,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot26");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot27 = metamutator.Selector.of(27,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot27");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot28 = metamutator.Selector.of(28,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot28");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot29 = metamutator.Selector.of(29,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot29");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot30 = metamutator.Selector.of(30,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot30");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot31 = metamutator.Selector.of(31,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot31");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot32 = metamutator.Selector.of(32,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot32");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot33 = metamutator.Selector.of(33,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot33");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot34 = metamutator.Selector.of(34,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot34");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot35 = metamutator.Selector.of(35,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot35");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot36 = metamutator.Selector.of(36,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot36");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot37 = metamutator.Selector.of(37,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot37");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot38 = metamutator.Selector.of(38,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot38");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot39 = metamutator.Selector.of(39,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot39");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot40 = metamutator.Selector.of(40,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot40");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot41 = metamutator.Selector.of(41,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot41");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot42 = metamutator.Selector.of(42,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot42");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot43 = metamutator.Selector.of(43,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot43");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot44 = metamutator.Selector.of(44,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot44");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot45 = metamutator.Selector.of(45,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot45");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot46 = metamutator.Selector.of(46,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot46");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot47 = metamutator.Selector.of(47,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot47");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot48 = metamutator.Selector.of(48,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot48");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot49 = metamutator.Selector.of(49,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot49");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot50 = metamutator.Selector.of(50,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot50");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot51 = metamutator.Selector.of(51,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot51");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot52 = metamutator.Selector.of(52,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot52");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot53 = metamutator.Selector.of(53,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot53");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot54 = metamutator.Selector.of(54,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot54");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot55 = metamutator.Selector.of(55,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot55");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot56 = metamutator.Selector.of(56,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot56");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot57 = metamutator.Selector.of(57,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot57");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot58 = metamutator.Selector.of(58,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot58");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot59 = metamutator.Selector.of(59,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot59");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot60 = metamutator.Selector.of(60,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot60");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot61 = metamutator.Selector.of(61,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot61");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot62 = metamutator.Selector.of(62,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot62");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot63 = metamutator.Selector.of(63,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot63");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot64 = metamutator.Selector.of(64,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot64");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot65 = metamutator.Selector.of(65,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot65");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot66 = metamutator.Selector.of(66,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot66");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot67 = metamutator.Selector.of(67,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot67");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot68 = metamutator.Selector.of(68,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot68");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot69 = metamutator.Selector.of(69,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot69");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot70 = metamutator.Selector.of(70,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot70");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot71 = metamutator.Selector.of(71,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot71");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot72 = metamutator.Selector.of(72,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot72");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot73 = metamutator.Selector.of(73,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot73");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot74 = metamutator.Selector.of(74,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot74");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot75 = metamutator.Selector.of(75,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot75");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot76 = metamutator.Selector.of(76,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot76");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot77 = metamutator.Selector.of(77,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot77");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot78 = metamutator.Selector.of(78,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot78");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot79 = metamutator.Selector.of(79,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot79");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot80 = metamutator.Selector.of(80,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot80");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot81 = metamutator.Selector.of(81,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot81");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot82 = metamutator.Selector.of(82,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot82");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot83 = metamutator.Selector.of(83,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot83");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot84 = metamutator.Selector.of(84,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot84");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot85 = metamutator.Selector.of(85,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot85");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot86 = metamutator.Selector.of(86,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot86");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot87 = metamutator.Selector.of(87,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot87");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot88 = metamutator.Selector.of(88,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.CompareToBuilder.class).id("_returnReplacementOperatorHotSpot88");
}

