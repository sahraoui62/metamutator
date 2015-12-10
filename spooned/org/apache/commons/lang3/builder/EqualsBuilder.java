package org.apache.commons.lang3.builder;


public class EqualsBuilder implements org.apache.commons.lang3.builder.Builder<java.lang.Boolean> {
    private static final java.lang.ThreadLocal<java.util.Set<org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.builder.IDKey, org.apache.commons.lang3.builder.IDKey>>> REGISTRY = new java.lang.ThreadLocal<java.util.Set<org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.builder.IDKey, org.apache.commons.lang3.builder.IDKey>>>();

    static java.util.Set<org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.builder.IDKey, org.apache.commons.lang3.builder.IDKey>> getRegistry() {
        return REGISTRY.get();
    }

    static org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.builder.IDKey, org.apache.commons.lang3.builder.IDKey> getRegisterPair(final java.lang.Object lhs, final java.lang.Object rhs) {
        final org.apache.commons.lang3.builder.IDKey left = new org.apache.commons.lang3.builder.IDKey(lhs);
        final org.apache.commons.lang3.builder.IDKey right = new org.apache.commons.lang3.builder.IDKey(rhs);
        return org.apache.commons.lang3.tuple.Pair.of(left, right);
    }

    static boolean isRegistered(final java.lang.Object lhs, final java.lang.Object rhs) {
        final java.util.Set<org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.builder.IDKey, org.apache.commons.lang3.builder.IDKey>> registry = org.apache.commons.lang3.builder.EqualsBuilder.getRegistry();
        final org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.builder.IDKey, org.apache.commons.lang3.builder.IDKey> pair = org.apache.commons.lang3.builder.EqualsBuilder.getRegisterPair(lhs, rhs);
        final org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.builder.IDKey, org.apache.commons.lang3.builder.IDKey> swappedPair = org.apache.commons.lang3.tuple.Pair.of(pair.getLeft(), pair.getRight());
        return (registry != null) && ((registry.contains(pair)) || (registry.contains(swappedPair)));
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
        return org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(lhs, rhs, org.apache.commons.lang3.builder.ReflectionToStringBuilder.toNoNullStringArray(excludeFields));
    }

    public static boolean reflectionEquals(final java.lang.Object lhs, final java.lang.Object rhs, final java.lang.String... excludeFields) {
        return org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(lhs, rhs, false, null, excludeFields);
    }

    public static boolean reflectionEquals(final java.lang.Object lhs, final java.lang.Object rhs, final boolean testTransients) {
        return org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(lhs, rhs, testTransients, null);
    }

    public static boolean reflectionEquals(final java.lang.Object lhs, final java.lang.Object rhs, final boolean testTransients, final java.lang.Class<?> reflectUpToClass, final java.lang.String... excludeFields) {
        if (lhs == rhs) {
            return true;
        } 
        if ((lhs == null) || (rhs == null)) {
            return false;
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
            return false;
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
            return false;
        }
        return equalsBuilder.isEquals();
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
            return this;
        } 
        isEquals = superEquals;
        return this;
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final java.lang.Object lhs, final java.lang.Object rhs) {
        if (!(isEquals)) {
            return this;
        } 
        if (lhs == rhs) {
            return this;
        } 
        if ((lhs == null) || (rhs == null)) {
            setEquals(false);
            return this;
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
        return this;
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final long lhs, final long rhs) {
        if (!(isEquals)) {
            return this;
        } 
        isEquals = lhs == rhs;
        return this;
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final int lhs, final int rhs) {
        if (!(isEquals)) {
            return this;
        } 
        isEquals = lhs == rhs;
        return this;
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final short lhs, final short rhs) {
        if (!(isEquals)) {
            return this;
        } 
        isEquals = lhs == rhs;
        return this;
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final char lhs, final char rhs) {
        if (!(isEquals)) {
            return this;
        } 
        isEquals = lhs == rhs;
        return this;
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final byte lhs, final byte rhs) {
        if (!(isEquals)) {
            return this;
        } 
        isEquals = lhs == rhs;
        return this;
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final double lhs, final double rhs) {
        if (!(isEquals)) {
            return this;
        } 
        return append(java.lang.Double.doubleToLongBits(lhs), java.lang.Double.doubleToLongBits(rhs));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final float lhs, final float rhs) {
        if (!(isEquals)) {
            return this;
        } 
        return append(java.lang.Float.floatToIntBits(lhs), java.lang.Float.floatToIntBits(rhs));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final boolean lhs, final boolean rhs) {
        if (!(isEquals)) {
            return this;
        } 
        isEquals = lhs == rhs;
        return this;
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final java.lang.Object[] lhs, final java.lang.Object[] rhs) {
        if (!(isEquals)) {
            return this;
        } 
        if (lhs == rhs) {
            return this;
        } 
        if ((lhs == null) || (rhs == null)) {
            setEquals(false);
            return this;
        } 
        if ((lhs.length) != (rhs.length)) {
            setEquals(false);
            return this;
        } 
        for (int i = 0 ; (i < (lhs.length)) && (isEquals) ; ++i) {
            append(lhs[i], rhs[i]);
        }
        return this;
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final long[] lhs, final long[] rhs) {
        if (!(isEquals)) {
            return this;
        } 
        if (lhs == rhs) {
            return this;
        } 
        if ((lhs == null) || (rhs == null)) {
            setEquals(false);
            return this;
        } 
        if ((lhs.length) != (rhs.length)) {
            setEquals(false);
            return this;
        } 
        for (int i = 0 ; (i < (lhs.length)) && (isEquals) ; ++i) {
            append(lhs[i], rhs[i]);
        }
        return this;
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final int[] lhs, final int[] rhs) {
        if (!(isEquals)) {
            return this;
        } 
        if (lhs == rhs) {
            return this;
        } 
        if ((lhs == null) || (rhs == null)) {
            setEquals(false);
            return this;
        } 
        if ((lhs.length) != (rhs.length)) {
            setEquals(false);
            return this;
        } 
        for (int i = 0 ; (i < (lhs.length)) && (isEquals) ; ++i) {
            append(lhs[i], rhs[i]);
        }
        return this;
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final short[] lhs, final short[] rhs) {
        if (!(isEquals)) {
            return this;
        } 
        if (lhs == rhs) {
            return this;
        } 
        if ((lhs == null) || (rhs == null)) {
            setEquals(false);
            return this;
        } 
        if ((lhs.length) != (rhs.length)) {
            setEquals(false);
            return this;
        } 
        for (int i = 0 ; (i < (lhs.length)) && (isEquals) ; ++i) {
            append(lhs[i], rhs[i]);
        }
        return this;
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final char[] lhs, final char[] rhs) {
        if (!(isEquals)) {
            return this;
        } 
        if (lhs == rhs) {
            return this;
        } 
        if ((lhs == null) || (rhs == null)) {
            setEquals(false);
            return this;
        } 
        if ((lhs.length) != (rhs.length)) {
            setEquals(false);
            return this;
        } 
        for (int i = 0 ; (i < (lhs.length)) && (isEquals) ; ++i) {
            append(lhs[i], rhs[i]);
        }
        return this;
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final byte[] lhs, final byte[] rhs) {
        if (!(isEquals)) {
            return this;
        } 
        if (lhs == rhs) {
            return this;
        } 
        if ((lhs == null) || (rhs == null)) {
            setEquals(false);
            return this;
        } 
        if ((lhs.length) != (rhs.length)) {
            setEquals(false);
            return this;
        } 
        for (int i = 0 ; (i < (lhs.length)) && (isEquals) ; ++i) {
            append(lhs[i], rhs[i]);
        }
        return this;
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final double[] lhs, final double[] rhs) {
        if (!(isEquals)) {
            return this;
        } 
        if (lhs == rhs) {
            return this;
        } 
        if ((lhs == null) || (rhs == null)) {
            setEquals(false);
            return this;
        } 
        if ((lhs.length) != (rhs.length)) {
            setEquals(false);
            return this;
        } 
        for (int i = 0 ; (i < (lhs.length)) && (isEquals) ; ++i) {
            append(lhs[i], rhs[i]);
        }
        return this;
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final float[] lhs, final float[] rhs) {
        if (!(isEquals)) {
            return this;
        } 
        if (lhs == rhs) {
            return this;
        } 
        if ((lhs == null) || (rhs == null)) {
            setEquals(false);
            return this;
        } 
        if ((lhs.length) != (rhs.length)) {
            setEquals(false);
            return this;
        } 
        for (int i = 0 ; (i < (lhs.length)) && (isEquals) ; ++i) {
            append(lhs[i], rhs[i]);
        }
        return this;
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final boolean[] lhs, final boolean[] rhs) {
        if (!(isEquals)) {
            return this;
        } 
        if (lhs == rhs) {
            return this;
        } 
        if ((lhs == null) || (rhs == null)) {
            setEquals(false);
            return this;
        } 
        if ((lhs.length) != (rhs.length)) {
            setEquals(false);
            return this;
        } 
        for (int i = 0 ; (i < (lhs.length)) && (isEquals) ; ++i) {
            append(lhs[i], rhs[i]);
        }
        return this;
    }

    public boolean isEquals() {
        return this.isEquals;
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
}

