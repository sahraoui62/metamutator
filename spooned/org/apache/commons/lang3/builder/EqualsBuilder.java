package org.apache.commons.lang3.builder;


public class EqualsBuilder implements org.apache.commons.lang3.builder.Builder<java.lang.Boolean> {
    private static final java.lang.ThreadLocal<java.util.Set<org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.builder.IDKey, org.apache.commons.lang3.builder.IDKey>>> REGISTRY = new java.lang.ThreadLocal<java.util.Set<org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.builder.IDKey, org.apache.commons.lang3.builder.IDKey>>>();

    static java.util.Set<org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.builder.IDKey, org.apache.commons.lang3.builder.IDKey>> getRegistry() {
        return ((_returnReplacementOperatorHotSpot191.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.builder.EqualsBuilder.REGISTRY.get()));
    }

    static org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.builder.IDKey, org.apache.commons.lang3.builder.IDKey> getRegisterPair(final java.lang.Object lhs, final java.lang.Object rhs) {
        final org.apache.commons.lang3.builder.IDKey left = new org.apache.commons.lang3.builder.IDKey(lhs);
        final org.apache.commons.lang3.builder.IDKey right = new org.apache.commons.lang3.builder.IDKey(rhs);
        return ((_returnReplacementOperatorHotSpot259.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.tuple.Pair.of(left, right)));
    }

    static boolean isRegistered(final java.lang.Object lhs, final java.lang.Object rhs) {
        final java.util.Set<org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.builder.IDKey, org.apache.commons.lang3.builder.IDKey>> registry = org.apache.commons.lang3.builder.EqualsBuilder.getRegistry();
        final org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.builder.IDKey, org.apache.commons.lang3.builder.IDKey> pair = org.apache.commons.lang3.builder.EqualsBuilder.getRegisterPair(lhs, rhs);
        final org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.builder.IDKey, org.apache.commons.lang3.builder.IDKey> swappedPair = org.apache.commons.lang3.tuple.Pair.of(pair.getLeft(), pair.getRight());
        return ((_returnReplacementOperatorHotSpot182.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((registry != null) && ((registry.contains(pair)) || (registry.contains(swappedPair)))));
    }

    static void register(final java.lang.Object lhs, final java.lang.Object rhs) {
        synchronized(org.apache.commons.lang3.builder.EqualsBuilder.class) {
            if ((org.apache.commons.lang3.builder.EqualsBuilder.getRegistry()) == null) {
                REGISTRY.set(new java.util.HashSet<org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.builder.IDKey, org.apache.commons.lang3.builder.IDKey>>());
            } 
        }
        final java.util.Set<org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.builder.IDKey, org.apache.commons.lang3.builder.IDKey>> registry = org.apache.commons.lang3.builder.EqualsBuilder.getRegistry();
        final org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.builder.IDKey, org.apache.commons.lang3.builder.IDKey> pair = org.apache.commons.lang3.builder.EqualsBuilder.getRegisterPair(lhs, rhs);
        registry.add(pair);
    }

    static void unregister(final java.lang.Object lhs, final java.lang.Object rhs) {
        java.util.Set<org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.builder.IDKey, org.apache.commons.lang3.builder.IDKey>> registry = org.apache.commons.lang3.builder.EqualsBuilder.getRegistry();
        if (registry != null) {
            final org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.builder.IDKey, org.apache.commons.lang3.builder.IDKey> pair = org.apache.commons.lang3.builder.EqualsBuilder.getRegisterPair(lhs, rhs);
            registry.remove(pair);
            synchronized(org.apache.commons.lang3.builder.EqualsBuilder.class) {
                registry = org.apache.commons.lang3.builder.EqualsBuilder.getRegistry();
                if ((registry != null) && (registry.isEmpty())) {
                    REGISTRY.remove();
                } 
            }
        } 
    }

    private boolean isEquals = true;

    public EqualsBuilder() {
    }

    public static boolean reflectionEquals(final java.lang.Object lhs, final java.lang.Object rhs, final java.util.Collection<java.lang.String> excludeFields) {
        return ((_returnReplacementOperatorHotSpot190.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(lhs, rhs, org.apache.commons.lang3.builder.ReflectionToStringBuilder.toNoNullStringArray(excludeFields))));
    }

    public static boolean reflectionEquals(final java.lang.Object lhs, final java.lang.Object rhs, final java.lang.String... excludeFields) {
        return ((_returnReplacementOperatorHotSpot189.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(lhs, rhs, false, null, excludeFields)));
    }

    public static boolean reflectionEquals(final java.lang.Object lhs, final java.lang.Object rhs, final boolean testTransients) {
        return ((_returnReplacementOperatorHotSpot183.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(lhs, rhs, testTransients, null)));
    }

    public static boolean reflectionEquals(final java.lang.Object lhs, final java.lang.Object rhs, final boolean testTransients, final java.lang.Class<?> reflectUpToClass, final java.lang.String... excludeFields) {
        if (lhs == rhs) {
            return ((_returnReplacementOperatorHotSpot184.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        if ((lhs == null) || (rhs == null)) {
            return ((_returnReplacementOperatorHotSpot185.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        final java.lang.Class<?> lhsClass = lhs.getClass();
        final java.lang.Class<?> rhsClass = rhs.getClass();
        java.lang.Class<?> testClass;
        if (lhsClass.isInstance(rhs)) {
            testClass = lhsClass;
            if (!(rhsClass.isInstance(lhs))) {
                testClass = rhsClass;
            } 
        } else if (rhsClass.isInstance(lhs)) {
            testClass = rhsClass;
            if (!(lhsClass.isInstance(rhs))) {
                testClass = lhsClass;
            } 
        } else {
            return ((_returnReplacementOperatorHotSpot186.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        }
        final org.apache.commons.lang3.builder.EqualsBuilder equalsBuilder = new org.apache.commons.lang3.builder.EqualsBuilder();
        try {
            if (testClass.isArray()) {
                equalsBuilder.append(lhs, rhs);
            } else {
                org.apache.commons.lang3.builder.EqualsBuilder.reflectionAppend(lhs, rhs, testClass, equalsBuilder, testTransients, excludeFields);
                while (((testClass.getSuperclass()) != null) && (testClass != reflectUpToClass)) {
                    testClass = testClass.getSuperclass();
                    org.apache.commons.lang3.builder.EqualsBuilder.reflectionAppend(lhs, rhs, testClass, equalsBuilder, testTransients, excludeFields);
                }
            }
        } catch (final java.lang.IllegalArgumentException e) {
            return ((_returnReplacementOperatorHotSpot187.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        }
        return ((_returnReplacementOperatorHotSpot188.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (equalsBuilder.isEquals()));
    }

    private static void reflectionAppend(final java.lang.Object lhs, final java.lang.Object rhs, final java.lang.Class<?> clazz, final org.apache.commons.lang3.builder.EqualsBuilder builder, final boolean useTransients, final java.lang.String[] excludeFields) {
        if (org.apache.commons.lang3.builder.EqualsBuilder.isRegistered(lhs, rhs)) {
            return ;
        } 
        try {
            org.apache.commons.lang3.builder.EqualsBuilder.register(lhs, rhs);
            final java.lang.reflect.Field[] fields = clazz.getDeclaredFields();
            java.lang.reflect.AccessibleObject.setAccessible(fields, true);
            for (int i = 0 ; (i < (fields.length)) && (builder.isEquals) ; i++) {
                final java.lang.reflect.Field f = fields[i];
                if (((((!(org.apache.commons.lang3.ArrayUtils.contains(excludeFields, f.getName()))) && (!(f.getName().contains("$")))) && (useTransients || (!(java.lang.reflect.Modifier.isTransient(f.getModifiers()))))) && (!(java.lang.reflect.Modifier.isStatic(f.getModifiers())))) && (!(f.isAnnotationPresent(org.apache.commons.lang3.builder.EqualsExclude.class)))) {
                    try {
                        builder.append(f.get(lhs), f.get(rhs));
                    } catch (final java.lang.IllegalAccessException e) {
                        throw new java.lang.InternalError("Unexpected IllegalAccessException");
                    }
                } 
            }
        } finally {
            org.apache.commons.lang3.builder.EqualsBuilder.unregister(lhs, rhs);
        }
    }

    public org.apache.commons.lang3.builder.EqualsBuilder appendSuper(final boolean superEquals) {
        if (!(isEquals)) {
            return ((_returnReplacementOperatorHotSpot257.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        isEquals = superEquals;
        return ((_returnReplacementOperatorHotSpot258.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final java.lang.Object lhs, final java.lang.Object rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperatorHotSpot234.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperatorHotSpot235.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if ((lhs == null) || (rhs == null)) {
            setEquals(false);
            return ((_returnReplacementOperatorHotSpot236.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        final java.lang.Class<?> lhsClass = lhs.getClass();
        if (!(lhsClass.isArray())) {
            isEquals = lhs.equals(rhs);
        } else if ((lhs.getClass()) != (rhs.getClass())) {
            setEquals(false);
        } else if (lhs instanceof long[]) {
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
            append(((java.lang.Object[])(lhs)), ((java.lang.Object[])(rhs)));
        }
        return ((_returnReplacementOperatorHotSpot237.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final long lhs, final long rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperatorHotSpot243.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        isEquals = lhs == rhs;
        return ((_returnReplacementOperatorHotSpot244.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final int lhs, final int rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperatorHotSpot227.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        isEquals = lhs == rhs;
        return ((_returnReplacementOperatorHotSpot228.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final short lhs, final short rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperatorHotSpot250.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        isEquals = lhs == rhs;
        return ((_returnReplacementOperatorHotSpot251.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final char lhs, final char rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperatorHotSpot206.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        isEquals = lhs == rhs;
        return ((_returnReplacementOperatorHotSpot207.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final byte lhs, final byte rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperatorHotSpot199.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        isEquals = lhs == rhs;
        return ((_returnReplacementOperatorHotSpot200.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final double lhs, final double rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperatorHotSpot213.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        return ((_returnReplacementOperatorHotSpot214.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(java.lang.Double.doubleToLongBits(lhs), java.lang.Double.doubleToLongBits(rhs))));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final float lhs, final float rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperatorHotSpot220.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        return ((_returnReplacementOperatorHotSpot221.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(java.lang.Float.floatToIntBits(lhs), java.lang.Float.floatToIntBits(rhs))));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final boolean lhs, final boolean rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperatorHotSpot192.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        isEquals = lhs == rhs;
        return ((_returnReplacementOperatorHotSpot193.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final java.lang.Object[] lhs, final java.lang.Object[] rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperatorHotSpot238.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperatorHotSpot239.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if ((lhs == null) || (rhs == null)) {
            setEquals(false);
            return ((_returnReplacementOperatorHotSpot240.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            setEquals(false);
            return ((_returnReplacementOperatorHotSpot241.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && (isEquals) ; ++i) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperatorHotSpot242.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final long[] lhs, final long[] rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperatorHotSpot245.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperatorHotSpot246.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if ((lhs == null) || (rhs == null)) {
            setEquals(false);
            return ((_returnReplacementOperatorHotSpot247.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            setEquals(false);
            return ((_returnReplacementOperatorHotSpot248.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && (isEquals) ; ++i) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperatorHotSpot249.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final int[] lhs, final int[] rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperatorHotSpot229.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperatorHotSpot230.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if ((lhs == null) || (rhs == null)) {
            setEquals(false);
            return ((_returnReplacementOperatorHotSpot231.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            setEquals(false);
            return ((_returnReplacementOperatorHotSpot232.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && (isEquals) ; ++i) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperatorHotSpot233.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final short[] lhs, final short[] rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperatorHotSpot252.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperatorHotSpot253.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if ((lhs == null) || (rhs == null)) {
            setEquals(false);
            return ((_returnReplacementOperatorHotSpot254.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            setEquals(false);
            return ((_returnReplacementOperatorHotSpot255.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && (isEquals) ; ++i) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperatorHotSpot256.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final char[] lhs, final char[] rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperatorHotSpot208.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperatorHotSpot209.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if ((lhs == null) || (rhs == null)) {
            setEquals(false);
            return ((_returnReplacementOperatorHotSpot210.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            setEquals(false);
            return ((_returnReplacementOperatorHotSpot211.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && (isEquals) ; ++i) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperatorHotSpot212.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final byte[] lhs, final byte[] rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperatorHotSpot201.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperatorHotSpot202.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if ((lhs == null) || (rhs == null)) {
            setEquals(false);
            return ((_returnReplacementOperatorHotSpot203.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            setEquals(false);
            return ((_returnReplacementOperatorHotSpot204.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && (isEquals) ; ++i) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperatorHotSpot205.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final double[] lhs, final double[] rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperatorHotSpot215.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperatorHotSpot216.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if ((lhs == null) || (rhs == null)) {
            setEquals(false);
            return ((_returnReplacementOperatorHotSpot217.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            setEquals(false);
            return ((_returnReplacementOperatorHotSpot218.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && (isEquals) ; ++i) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperatorHotSpot219.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final float[] lhs, final float[] rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperatorHotSpot222.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperatorHotSpot223.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if ((lhs == null) || (rhs == null)) {
            setEquals(false);
            return ((_returnReplacementOperatorHotSpot224.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            setEquals(false);
            return ((_returnReplacementOperatorHotSpot225.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && (isEquals) ; ++i) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperatorHotSpot226.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final boolean[] lhs, final boolean[] rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperatorHotSpot194.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperatorHotSpot195.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if ((lhs == null) || (rhs == null)) {
            setEquals(false);
            return ((_returnReplacementOperatorHotSpot196.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            setEquals(false);
            return ((_returnReplacementOperatorHotSpot197.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && (isEquals) ; ++i) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperatorHotSpot198.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public boolean isEquals() {
        return ((_returnReplacementOperatorHotSpot181.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this.isEquals));
    }

    @java.lang.Override
    public java.lang.Boolean build() {
        return java.lang.Boolean.valueOf(isEquals());
    }

    protected void setEquals(final boolean isEquals) {
        this.isEquals = isEquals;
    }

    public void reset() {
        this.isEquals = true;
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot181 = metamutator.Selector.of(181,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot181");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot182 = metamutator.Selector.of(182,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot182");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot183 = metamutator.Selector.of(183,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot183");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot184 = metamutator.Selector.of(184,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot184");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot185 = metamutator.Selector.of(185,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot185");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot186 = metamutator.Selector.of(186,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot186");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot187 = metamutator.Selector.of(187,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot187");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot188 = metamutator.Selector.of(188,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot188");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot189 = metamutator.Selector.of(189,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot189");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot190 = metamutator.Selector.of(190,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot190");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot191 = metamutator.Selector.of(191,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot191");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot192 = metamutator.Selector.of(192,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot192");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot193 = metamutator.Selector.of(193,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot193");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot194 = metamutator.Selector.of(194,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot194");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot195 = metamutator.Selector.of(195,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot195");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot196 = metamutator.Selector.of(196,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot196");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot197 = metamutator.Selector.of(197,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot197");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot198 = metamutator.Selector.of(198,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot198");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot199 = metamutator.Selector.of(199,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot199");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot200 = metamutator.Selector.of(200,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot200");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot201 = metamutator.Selector.of(201,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot201");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot202 = metamutator.Selector.of(202,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot202");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot203 = metamutator.Selector.of(203,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot203");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot204 = metamutator.Selector.of(204,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot204");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot205 = metamutator.Selector.of(205,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot205");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot206 = metamutator.Selector.of(206,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot206");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot207 = metamutator.Selector.of(207,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot207");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot208 = metamutator.Selector.of(208,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot208");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot209 = metamutator.Selector.of(209,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot209");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot210 = metamutator.Selector.of(210,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot210");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot211 = metamutator.Selector.of(211,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot211");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot212 = metamutator.Selector.of(212,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot212");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot213 = metamutator.Selector.of(213,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot213");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot214 = metamutator.Selector.of(214,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot214");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot215 = metamutator.Selector.of(215,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot215");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot216 = metamutator.Selector.of(216,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot216");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot217 = metamutator.Selector.of(217,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot217");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot218 = metamutator.Selector.of(218,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot218");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot219 = metamutator.Selector.of(219,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot219");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot220 = metamutator.Selector.of(220,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot220");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot221 = metamutator.Selector.of(221,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot221");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot222 = metamutator.Selector.of(222,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot222");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot223 = metamutator.Selector.of(223,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot223");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot224 = metamutator.Selector.of(224,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot224");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot225 = metamutator.Selector.of(225,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot225");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot226 = metamutator.Selector.of(226,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot226");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot227 = metamutator.Selector.of(227,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot227");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot228 = metamutator.Selector.of(228,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot228");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot229 = metamutator.Selector.of(229,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot229");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot230 = metamutator.Selector.of(230,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot230");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot231 = metamutator.Selector.of(231,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot231");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot232 = metamutator.Selector.of(232,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot232");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot233 = metamutator.Selector.of(233,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot233");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot234 = metamutator.Selector.of(234,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot234");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot235 = metamutator.Selector.of(235,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot235");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot236 = metamutator.Selector.of(236,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot236");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot237 = metamutator.Selector.of(237,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot237");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot238 = metamutator.Selector.of(238,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot238");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot239 = metamutator.Selector.of(239,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot239");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot240 = metamutator.Selector.of(240,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot240");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot241 = metamutator.Selector.of(241,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot241");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot242 = metamutator.Selector.of(242,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot242");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot243 = metamutator.Selector.of(243,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot243");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot244 = metamutator.Selector.of(244,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot244");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot245 = metamutator.Selector.of(245,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot245");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot246 = metamutator.Selector.of(246,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot246");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot247 = metamutator.Selector.of(247,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot247");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot248 = metamutator.Selector.of(248,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot248");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot249 = metamutator.Selector.of(249,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot249");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot250 = metamutator.Selector.of(250,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot250");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot251 = metamutator.Selector.of(251,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot251");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot252 = metamutator.Selector.of(252,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot252");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot253 = metamutator.Selector.of(253,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot253");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot254 = metamutator.Selector.of(254,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot254");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot255 = metamutator.Selector.of(255,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot255");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot256 = metamutator.Selector.of(256,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot256");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot257 = metamutator.Selector.of(257,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot257");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot258 = metamutator.Selector.of(258,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot258");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot259 = metamutator.Selector.of(259,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperatorHotSpot259");
}

