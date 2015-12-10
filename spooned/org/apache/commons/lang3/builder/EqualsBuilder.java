package org.apache.commons.lang3.builder;


public class EqualsBuilder implements org.apache.commons.lang3.builder.Builder<java.lang.Boolean> {
    private static final java.lang.ThreadLocal<java.util.Set<org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.builder.IDKey, org.apache.commons.lang3.builder.IDKey>>> REGISTRY = new java.lang.ThreadLocal<java.util.Set<org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.builder.IDKey, org.apache.commons.lang3.builder.IDKey>>>();

    static java.util.Set<org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.builder.IDKey, org.apache.commons.lang3.builder.IDKey>> getRegistry() {
        return ((_returnReplacementOperator191.is("NULL")) ? ( null ) : (org.apache.commons.lang3.builder.EqualsBuilder.REGISTRY.get()));
    }

    static org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.builder.IDKey, org.apache.commons.lang3.builder.IDKey> getRegisterPair(final java.lang.Object lhs, final java.lang.Object rhs) {
        final org.apache.commons.lang3.builder.IDKey left = new org.apache.commons.lang3.builder.IDKey(lhs);
        final org.apache.commons.lang3.builder.IDKey right = new org.apache.commons.lang3.builder.IDKey(rhs);
        return ((_returnReplacementOperator259.is("NULL")) ? ( null ) : (org.apache.commons.lang3.tuple.Pair.of(left, right)));
    }

    static boolean isRegistered(final java.lang.Object lhs, final java.lang.Object rhs) {
        final java.util.Set<org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.builder.IDKey, org.apache.commons.lang3.builder.IDKey>> registry = org.apache.commons.lang3.builder.EqualsBuilder.getRegistry();
        final org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.builder.IDKey, org.apache.commons.lang3.builder.IDKey> pair = org.apache.commons.lang3.builder.EqualsBuilder.getRegisterPair(lhs, rhs);
        final org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.builder.IDKey, org.apache.commons.lang3.builder.IDKey> swappedPair = org.apache.commons.lang3.tuple.Pair.of(pair.getLeft(), pair.getRight());
        return ((_returnReplacementOperator182.is("NULL")) ? ( null ) : ((registry != null) && ((registry.contains(pair)) || (registry.contains(swappedPair)))));
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
        return ((_returnReplacementOperator190.is("NULL")) ? ( null ) : (org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(lhs, rhs, org.apache.commons.lang3.builder.ReflectionToStringBuilder.toNoNullStringArray(excludeFields))));
    }

    public static boolean reflectionEquals(final java.lang.Object lhs, final java.lang.Object rhs, final java.lang.String... excludeFields) {
        return ((_returnReplacementOperator189.is("NULL")) ? ( null ) : (org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(lhs, rhs, false, null, excludeFields)));
    }

    public static boolean reflectionEquals(final java.lang.Object lhs, final java.lang.Object rhs, final boolean testTransients) {
        return ((_returnReplacementOperator183.is("NULL")) ? ( null ) : (org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(lhs, rhs, testTransients, null)));
    }

    public static boolean reflectionEquals(final java.lang.Object lhs, final java.lang.Object rhs, final boolean testTransients, final java.lang.Class<?> reflectUpToClass, final java.lang.String... excludeFields) {
        if (lhs == rhs) {
            return ((_returnReplacementOperator184.is("NULL")) ? ( null ) : (true));
        } 
        if ((lhs == null) || (rhs == null)) {
            return ((_returnReplacementOperator185.is("NULL")) ? ( null ) : (false));
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
            return ((_returnReplacementOperator186.is("NULL")) ? ( null ) : (false));
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
            return ((_returnReplacementOperator187.is("NULL")) ? ( null ) : (false));
        }
        return ((_returnReplacementOperator188.is("NULL")) ? ( null ) : (equalsBuilder.isEquals()));
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
            return ((_returnReplacementOperator257.is("NULL")) ? ( null ) : (this));
        } 
        isEquals = superEquals;
        return ((_returnReplacementOperator258.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final java.lang.Object lhs, final java.lang.Object rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperator234.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperator235.is("NULL")) ? ( null ) : (this));
        } 
        if ((lhs == null) || (rhs == null)) {
            setEquals(false);
            return ((_returnReplacementOperator236.is("NULL")) ? ( null ) : (this));
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
        return ((_returnReplacementOperator237.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final long lhs, final long rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperator243.is("NULL")) ? ( null ) : (this));
        } 
        isEquals = lhs == rhs;
        return ((_returnReplacementOperator244.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final int lhs, final int rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperator227.is("NULL")) ? ( null ) : (this));
        } 
        isEquals = lhs == rhs;
        return ((_returnReplacementOperator228.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final short lhs, final short rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperator250.is("NULL")) ? ( null ) : (this));
        } 
        isEquals = lhs == rhs;
        return ((_returnReplacementOperator251.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final char lhs, final char rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperator206.is("NULL")) ? ( null ) : (this));
        } 
        isEquals = lhs == rhs;
        return ((_returnReplacementOperator207.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final byte lhs, final byte rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperator199.is("NULL")) ? ( null ) : (this));
        } 
        isEquals = lhs == rhs;
        return ((_returnReplacementOperator200.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final double lhs, final double rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperator213.is("NULL")) ? ( null ) : (this));
        } 
        return ((_returnReplacementOperator214.is("NULL")) ? ( null ) : (append(java.lang.Double.doubleToLongBits(lhs), java.lang.Double.doubleToLongBits(rhs))));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final float lhs, final float rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperator220.is("NULL")) ? ( null ) : (this));
        } 
        return ((_returnReplacementOperator221.is("NULL")) ? ( null ) : (append(java.lang.Float.floatToIntBits(lhs), java.lang.Float.floatToIntBits(rhs))));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final boolean lhs, final boolean rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperator192.is("NULL")) ? ( null ) : (this));
        } 
        isEquals = lhs == rhs;
        return ((_returnReplacementOperator193.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final java.lang.Object[] lhs, final java.lang.Object[] rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperator238.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperator239.is("NULL")) ? ( null ) : (this));
        } 
        if ((lhs == null) || (rhs == null)) {
            setEquals(false);
            return ((_returnReplacementOperator240.is("NULL")) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            setEquals(false);
            return ((_returnReplacementOperator241.is("NULL")) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && (isEquals) ; ++i) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperator242.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final long[] lhs, final long[] rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperator245.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperator246.is("NULL")) ? ( null ) : (this));
        } 
        if ((lhs == null) || (rhs == null)) {
            setEquals(false);
            return ((_returnReplacementOperator247.is("NULL")) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            setEquals(false);
            return ((_returnReplacementOperator248.is("NULL")) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && (isEquals) ; ++i) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperator249.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final int[] lhs, final int[] rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperator229.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperator230.is("NULL")) ? ( null ) : (this));
        } 
        if ((lhs == null) || (rhs == null)) {
            setEquals(false);
            return ((_returnReplacementOperator231.is("NULL")) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            setEquals(false);
            return ((_returnReplacementOperator232.is("NULL")) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && (isEquals) ; ++i) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperator233.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final short[] lhs, final short[] rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperator252.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperator253.is("NULL")) ? ( null ) : (this));
        } 
        if ((lhs == null) || (rhs == null)) {
            setEquals(false);
            return ((_returnReplacementOperator254.is("NULL")) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            setEquals(false);
            return ((_returnReplacementOperator255.is("NULL")) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && (isEquals) ; ++i) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperator256.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final char[] lhs, final char[] rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperator208.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperator209.is("NULL")) ? ( null ) : (this));
        } 
        if ((lhs == null) || (rhs == null)) {
            setEquals(false);
            return ((_returnReplacementOperator210.is("NULL")) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            setEquals(false);
            return ((_returnReplacementOperator211.is("NULL")) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && (isEquals) ; ++i) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperator212.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final byte[] lhs, final byte[] rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperator201.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperator202.is("NULL")) ? ( null ) : (this));
        } 
        if ((lhs == null) || (rhs == null)) {
            setEquals(false);
            return ((_returnReplacementOperator203.is("NULL")) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            setEquals(false);
            return ((_returnReplacementOperator204.is("NULL")) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && (isEquals) ; ++i) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperator205.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final double[] lhs, final double[] rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperator215.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperator216.is("NULL")) ? ( null ) : (this));
        } 
        if ((lhs == null) || (rhs == null)) {
            setEquals(false);
            return ((_returnReplacementOperator217.is("NULL")) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            setEquals(false);
            return ((_returnReplacementOperator218.is("NULL")) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && (isEquals) ; ++i) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperator219.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final float[] lhs, final float[] rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperator222.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperator223.is("NULL")) ? ( null ) : (this));
        } 
        if ((lhs == null) || (rhs == null)) {
            setEquals(false);
            return ((_returnReplacementOperator224.is("NULL")) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            setEquals(false);
            return ((_returnReplacementOperator225.is("NULL")) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && (isEquals) ; ++i) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperator226.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(final boolean[] lhs, final boolean[] rhs) {
        if (!(isEquals)) {
            return ((_returnReplacementOperator194.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperator195.is("NULL")) ? ( null ) : (this));
        } 
        if ((lhs == null) || (rhs == null)) {
            setEquals(false);
            return ((_returnReplacementOperator196.is("NULL")) ? ( null ) : (this));
        } 
        if ((lhs.length) != (rhs.length)) {
            setEquals(false);
            return ((_returnReplacementOperator197.is("NULL")) ? ( null ) : (this));
        } 
        for (int i = 0 ; (i < (lhs.length)) && (isEquals) ; ++i) {
            append(lhs[i], rhs[i]);
        }
        return ((_returnReplacementOperator198.is("NULL")) ? ( null ) : (this));
    }

    public boolean isEquals() {
        return ((_returnReplacementOperator181.is("NULL")) ? ( null ) : (this.isEquals));
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

    private static final metamutator.Selector _returnReplacementOperator181 = metamutator.Selector.of(181,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator181");

    private static final metamutator.Selector _returnReplacementOperator182 = metamutator.Selector.of(182,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator182");

    private static final metamutator.Selector _returnReplacementOperator183 = metamutator.Selector.of(183,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator183");

    private static final metamutator.Selector _returnReplacementOperator184 = metamutator.Selector.of(184,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator184");

    private static final metamutator.Selector _returnReplacementOperator185 = metamutator.Selector.of(185,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator185");

    private static final metamutator.Selector _returnReplacementOperator186 = metamutator.Selector.of(186,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator186");

    private static final metamutator.Selector _returnReplacementOperator187 = metamutator.Selector.of(187,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator187");

    private static final metamutator.Selector _returnReplacementOperator188 = metamutator.Selector.of(188,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator188");

    private static final metamutator.Selector _returnReplacementOperator189 = metamutator.Selector.of(189,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator189");

    private static final metamutator.Selector _returnReplacementOperator190 = metamutator.Selector.of(190,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator190");

    private static final metamutator.Selector _returnReplacementOperator191 = metamutator.Selector.of(191,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator191");

    private static final metamutator.Selector _returnReplacementOperator192 = metamutator.Selector.of(192,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator192");

    private static final metamutator.Selector _returnReplacementOperator193 = metamutator.Selector.of(193,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator193");

    private static final metamutator.Selector _returnReplacementOperator194 = metamutator.Selector.of(194,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator194");

    private static final metamutator.Selector _returnReplacementOperator195 = metamutator.Selector.of(195,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator195");

    private static final metamutator.Selector _returnReplacementOperator196 = metamutator.Selector.of(196,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator196");

    private static final metamutator.Selector _returnReplacementOperator197 = metamutator.Selector.of(197,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator197");

    private static final metamutator.Selector _returnReplacementOperator198 = metamutator.Selector.of(198,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator198");

    private static final metamutator.Selector _returnReplacementOperator199 = metamutator.Selector.of(199,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator199");

    private static final metamutator.Selector _returnReplacementOperator200 = metamutator.Selector.of(200,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator200");

    private static final metamutator.Selector _returnReplacementOperator201 = metamutator.Selector.of(201,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator201");

    private static final metamutator.Selector _returnReplacementOperator202 = metamutator.Selector.of(202,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator202");

    private static final metamutator.Selector _returnReplacementOperator203 = metamutator.Selector.of(203,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator203");

    private static final metamutator.Selector _returnReplacementOperator204 = metamutator.Selector.of(204,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator204");

    private static final metamutator.Selector _returnReplacementOperator205 = metamutator.Selector.of(205,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator205");

    private static final metamutator.Selector _returnReplacementOperator206 = metamutator.Selector.of(206,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator206");

    private static final metamutator.Selector _returnReplacementOperator207 = metamutator.Selector.of(207,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator207");

    private static final metamutator.Selector _returnReplacementOperator208 = metamutator.Selector.of(208,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator208");

    private static final metamutator.Selector _returnReplacementOperator209 = metamutator.Selector.of(209,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator209");

    private static final metamutator.Selector _returnReplacementOperator210 = metamutator.Selector.of(210,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator210");

    private static final metamutator.Selector _returnReplacementOperator211 = metamutator.Selector.of(211,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator211");

    private static final metamutator.Selector _returnReplacementOperator212 = metamutator.Selector.of(212,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator212");

    private static final metamutator.Selector _returnReplacementOperator213 = metamutator.Selector.of(213,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator213");

    private static final metamutator.Selector _returnReplacementOperator214 = metamutator.Selector.of(214,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator214");

    private static final metamutator.Selector _returnReplacementOperator215 = metamutator.Selector.of(215,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator215");

    private static final metamutator.Selector _returnReplacementOperator216 = metamutator.Selector.of(216,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator216");

    private static final metamutator.Selector _returnReplacementOperator217 = metamutator.Selector.of(217,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator217");

    private static final metamutator.Selector _returnReplacementOperator218 = metamutator.Selector.of(218,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator218");

    private static final metamutator.Selector _returnReplacementOperator219 = metamutator.Selector.of(219,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator219");

    private static final metamutator.Selector _returnReplacementOperator220 = metamutator.Selector.of(220,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator220");

    private static final metamutator.Selector _returnReplacementOperator221 = metamutator.Selector.of(221,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator221");

    private static final metamutator.Selector _returnReplacementOperator222 = metamutator.Selector.of(222,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator222");

    private static final metamutator.Selector _returnReplacementOperator223 = metamutator.Selector.of(223,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator223");

    private static final metamutator.Selector _returnReplacementOperator224 = metamutator.Selector.of(224,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator224");

    private static final metamutator.Selector _returnReplacementOperator225 = metamutator.Selector.of(225,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator225");

    private static final metamutator.Selector _returnReplacementOperator226 = metamutator.Selector.of(226,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator226");

    private static final metamutator.Selector _returnReplacementOperator227 = metamutator.Selector.of(227,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator227");

    private static final metamutator.Selector _returnReplacementOperator228 = metamutator.Selector.of(228,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator228");

    private static final metamutator.Selector _returnReplacementOperator229 = metamutator.Selector.of(229,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator229");

    private static final metamutator.Selector _returnReplacementOperator230 = metamutator.Selector.of(230,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator230");

    private static final metamutator.Selector _returnReplacementOperator231 = metamutator.Selector.of(231,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator231");

    private static final metamutator.Selector _returnReplacementOperator232 = metamutator.Selector.of(232,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator232");

    private static final metamutator.Selector _returnReplacementOperator233 = metamutator.Selector.of(233,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator233");

    private static final metamutator.Selector _returnReplacementOperator234 = metamutator.Selector.of(234,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator234");

    private static final metamutator.Selector _returnReplacementOperator235 = metamutator.Selector.of(235,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator235");

    private static final metamutator.Selector _returnReplacementOperator236 = metamutator.Selector.of(236,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator236");

    private static final metamutator.Selector _returnReplacementOperator237 = metamutator.Selector.of(237,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator237");

    private static final metamutator.Selector _returnReplacementOperator238 = metamutator.Selector.of(238,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator238");

    private static final metamutator.Selector _returnReplacementOperator239 = metamutator.Selector.of(239,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator239");

    private static final metamutator.Selector _returnReplacementOperator240 = metamutator.Selector.of(240,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator240");

    private static final metamutator.Selector _returnReplacementOperator241 = metamutator.Selector.of(241,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator241");

    private static final metamutator.Selector _returnReplacementOperator242 = metamutator.Selector.of(242,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator242");

    private static final metamutator.Selector _returnReplacementOperator243 = metamutator.Selector.of(243,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator243");

    private static final metamutator.Selector _returnReplacementOperator244 = metamutator.Selector.of(244,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator244");

    private static final metamutator.Selector _returnReplacementOperator245 = metamutator.Selector.of(245,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator245");

    private static final metamutator.Selector _returnReplacementOperator246 = metamutator.Selector.of(246,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator246");

    private static final metamutator.Selector _returnReplacementOperator247 = metamutator.Selector.of(247,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator247");

    private static final metamutator.Selector _returnReplacementOperator248 = metamutator.Selector.of(248,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator248");

    private static final metamutator.Selector _returnReplacementOperator249 = metamutator.Selector.of(249,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator249");

    private static final metamutator.Selector _returnReplacementOperator250 = metamutator.Selector.of(250,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator250");

    private static final metamutator.Selector _returnReplacementOperator251 = metamutator.Selector.of(251,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator251");

    private static final metamutator.Selector _returnReplacementOperator252 = metamutator.Selector.of(252,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator252");

    private static final metamutator.Selector _returnReplacementOperator253 = metamutator.Selector.of(253,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator253");

    private static final metamutator.Selector _returnReplacementOperator254 = metamutator.Selector.of(254,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator254");

    private static final metamutator.Selector _returnReplacementOperator255 = metamutator.Selector.of(255,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator255");

    private static final metamutator.Selector _returnReplacementOperator256 = metamutator.Selector.of(256,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator256");

    private static final metamutator.Selector _returnReplacementOperator257 = metamutator.Selector.of(257,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator257");

    private static final metamutator.Selector _returnReplacementOperator258 = metamutator.Selector.of(258,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator258");

    private static final metamutator.Selector _returnReplacementOperator259 = metamutator.Selector.of(259,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.EqualsBuilder.class).id("_returnReplacementOperator259");
}

