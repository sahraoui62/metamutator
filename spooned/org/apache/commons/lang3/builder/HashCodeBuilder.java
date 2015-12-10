package org.apache.commons.lang3.builder;


public class HashCodeBuilder implements org.apache.commons.lang3.builder.Builder<java.lang.Integer> {
    private static final int DEFAULT_INITIAL_VALUE = 17;

    private static final int DEFAULT_MULTIPLIER_VALUE = 37;

    private static final java.lang.ThreadLocal<java.util.Set<org.apache.commons.lang3.builder.IDKey>> REGISTRY = new java.lang.ThreadLocal<java.util.Set<org.apache.commons.lang3.builder.IDKey>>();

    static java.util.Set<org.apache.commons.lang3.builder.IDKey> getRegistry() {
        return ((_returnReplacementOperator270.is("NULL")) ? ( null ) : (org.apache.commons.lang3.builder.HashCodeBuilder.REGISTRY.get()));
    }

    static boolean isRegistered(final java.lang.Object value) {
        final java.util.Set<org.apache.commons.lang3.builder.IDKey> registry = org.apache.commons.lang3.builder.HashCodeBuilder.getRegistry();
        return ((_returnReplacementOperator261.is("NULL")) ? ( null ) : ((registry != null) && (registry.contains(new org.apache.commons.lang3.builder.IDKey(value)))));
    }

    private static void reflectionAppend(final java.lang.Object object, final java.lang.Class<?> clazz, final org.apache.commons.lang3.builder.HashCodeBuilder builder, final boolean useTransients, final java.lang.String[] excludeFields) {
        if (org.apache.commons.lang3.builder.HashCodeBuilder.isRegistered(object)) {
            return ;
        } 
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder.register(object);
            final java.lang.reflect.Field[] fields = clazz.getDeclaredFields();
            java.lang.reflect.AccessibleObject.setAccessible(fields, true);
            for (final java.lang.reflect.Field field : fields) {
                if (((((!(org.apache.commons.lang3.ArrayUtils.contains(excludeFields, field.getName()))) && (!(field.getName().contains("$")))) && (useTransients || (!(java.lang.reflect.Modifier.isTransient(field.getModifiers()))))) && (!(java.lang.reflect.Modifier.isStatic(field.getModifiers())))) && (!(field.isAnnotationPresent(org.apache.commons.lang3.builder.HashCodeExclude.class)))) {
                    try {
                        final java.lang.Object fieldValue = field.get(object);
                        builder.append(fieldValue);
                    } catch (final java.lang.IllegalAccessException e) {
                        throw new java.lang.InternalError("Unexpected IllegalAccessException");
                    }
                } 
            }
        } finally {
            org.apache.commons.lang3.builder.HashCodeBuilder.unregister(object);
        }
    }

    public static int reflectionHashCode(final int initialNonZeroOddNumber, final int multiplierNonZeroOddNumber, final java.lang.Object object) {
        return ((_returnReplacementOperator263.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator263.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator263.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(initialNonZeroOddNumber, multiplierNonZeroOddNumber, object, false, null)));
    }

    public static int reflectionHashCode(final int initialNonZeroOddNumber, final int multiplierNonZeroOddNumber, final java.lang.Object object, final boolean testTransients) {
        return ((_returnReplacementOperator264.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator264.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator264.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(initialNonZeroOddNumber, multiplierNonZeroOddNumber, object, testTransients, null)));
    }

    public static <T>int reflectionHashCode(final int initialNonZeroOddNumber, final int multiplierNonZeroOddNumber, final T object, final boolean testTransients, final java.lang.Class<? super T> reflectUpToClass, final java.lang.String... excludeFields) {
        if (object == null) {
            throw new java.lang.IllegalArgumentException("The object to build a hash code for must not be null");
        } 
        final org.apache.commons.lang3.builder.HashCodeBuilder builder = new org.apache.commons.lang3.builder.HashCodeBuilder(initialNonZeroOddNumber , multiplierNonZeroOddNumber);
        java.lang.Class<?> clazz = object.getClass();
        org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(object, clazz, builder, testTransients, excludeFields);
        while (((clazz.getSuperclass()) != null) && (clazz != reflectUpToClass)) {
            clazz = clazz.getSuperclass();
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(object, clazz, builder, testTransients, excludeFields);
        }
        return ((_returnReplacementOperator260.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator260.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator260.is("ZERO")) ? ( 0 ) : (builder.toHashCode()));
    }

    public static int reflectionHashCode(final java.lang.Object object, final boolean testTransients) {
        return ((_returnReplacementOperator265.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator265.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator265.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(org.apache.commons.lang3.builder.HashCodeBuilder.DEFAULT_INITIAL_VALUE, org.apache.commons.lang3.builder.HashCodeBuilder.DEFAULT_MULTIPLIER_VALUE, object, testTransients, null)));
    }

    public static int reflectionHashCode(final java.lang.Object object, final java.util.Collection<java.lang.String> excludeFields) {
        return ((_returnReplacementOperator267.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator267.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator267.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(object, org.apache.commons.lang3.builder.ReflectionToStringBuilder.toNoNullStringArray(excludeFields))));
    }

    public static int reflectionHashCode(final java.lang.Object object, final java.lang.String... excludeFields) {
        return ((_returnReplacementOperator266.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator266.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator266.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(org.apache.commons.lang3.builder.HashCodeBuilder.DEFAULT_INITIAL_VALUE, org.apache.commons.lang3.builder.HashCodeBuilder.DEFAULT_MULTIPLIER_VALUE, object, false, null, excludeFields)));
    }

    static void register(final java.lang.Object value) {
        synchronized(org.apache.commons.lang3.builder.HashCodeBuilder.class) {
            if ((org.apache.commons.lang3.builder.HashCodeBuilder.getRegistry()) == null) {
                REGISTRY.set(new java.util.HashSet<org.apache.commons.lang3.builder.IDKey>());
            } 
        }
        org.apache.commons.lang3.builder.HashCodeBuilder.getRegistry().add(new org.apache.commons.lang3.builder.IDKey(value));
    }

    static void unregister(final java.lang.Object value) {
        java.util.Set<org.apache.commons.lang3.builder.IDKey> registry = org.apache.commons.lang3.builder.HashCodeBuilder.getRegistry();
        if (registry != null) {
            registry.remove(new org.apache.commons.lang3.builder.IDKey(value));
            synchronized(org.apache.commons.lang3.builder.HashCodeBuilder.class) {
                registry = org.apache.commons.lang3.builder.HashCodeBuilder.getRegistry();
                if ((registry != null) && (registry.isEmpty())) {
                    REGISTRY.remove();
                } 
            }
        } 
    }

    private final int iConstant;

    private int iTotal = 0;

    public HashCodeBuilder() {
        iConstant = 37;
        iTotal = 17;
    }

    public HashCodeBuilder(final int initialOddNumber ,final int multiplierOddNumber) {
        org.apache.commons.lang3.Validate.isTrue(((initialOddNumber % 2) != 0), "HashCodeBuilder requires an odd initial value");
        org.apache.commons.lang3.Validate.isTrue(((multiplierOddNumber % 2) != 0), "HashCodeBuilder requires an odd multiplier");
        iConstant = multiplierOddNumber;
        iTotal = initialOddNumber;
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final boolean value) {
        iTotal = ((iTotal) * (iConstant)) + (value ? 0 : 1);
        return ((_returnReplacementOperator271.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final boolean[] array) {
        if (array == null) {
            iTotal = (iTotal) * (iConstant);
        } else {
            for (final boolean element : array) {
                append(element);
            }
        }
        return ((_returnReplacementOperator272.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final byte value) {
        iTotal = ((iTotal) * (iConstant)) + value;
        return ((_returnReplacementOperator273.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final byte[] array) {
        if (array == null) {
            iTotal = (iTotal) * (iConstant);
        } else {
            for (final byte element : array) {
                append(element);
            }
        }
        return ((_returnReplacementOperator274.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final char value) {
        iTotal = ((iTotal) * (iConstant)) + value;
        return ((_returnReplacementOperator275.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final char[] array) {
        if (array == null) {
            iTotal = (iTotal) * (iConstant);
        } else {
            for (final char element : array) {
                append(element);
            }
        }
        return ((_returnReplacementOperator276.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final double value) {
        return ((_returnReplacementOperator277.is("NULL")) ? ( null ) : (append(java.lang.Double.doubleToLongBits(value))));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final double[] array) {
        if (array == null) {
            iTotal = (iTotal) * (iConstant);
        } else {
            for (final double element : array) {
                append(element);
            }
        }
        return ((_returnReplacementOperator278.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final float value) {
        iTotal = ((iTotal) * (iConstant)) + (java.lang.Float.floatToIntBits(value));
        return ((_returnReplacementOperator279.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final float[] array) {
        if (array == null) {
            iTotal = (iTotal) * (iConstant);
        } else {
            for (final float element : array) {
                append(element);
            }
        }
        return ((_returnReplacementOperator280.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final int value) {
        iTotal = ((iTotal) * (iConstant)) + value;
        return ((_returnReplacementOperator281.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final int[] array) {
        if (array == null) {
            iTotal = (iTotal) * (iConstant);
        } else {
            for (final int element : array) {
                append(element);
            }
        }
        return ((_returnReplacementOperator282.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final long value) {
        iTotal = ((iTotal) * (iConstant)) + ((int)((value ^ (value >> 32))));
        return ((_returnReplacementOperator286.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final long[] array) {
        if (array == null) {
            iTotal = (iTotal) * (iConstant);
        } else {
            for (final long element : array) {
                append(element);
            }
        }
        return ((_returnReplacementOperator287.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final java.lang.Object object) {
        if (object == null) {
            iTotal = (iTotal) * (iConstant);
        } else {
            if (object.getClass().isArray()) {
                if (object instanceof long[]) {
                    append(((long[])(object)));
                } else if (object instanceof int[]) {
                    append(((int[])(object)));
                } else if (object instanceof short[]) {
                    append(((short[])(object)));
                } else if (object instanceof char[]) {
                    append(((char[])(object)));
                } else if (object instanceof byte[]) {
                    append(((byte[])(object)));
                } else if (object instanceof double[]) {
                    append(((double[])(object)));
                } else if (object instanceof float[]) {
                    append(((float[])(object)));
                } else if (object instanceof boolean[]) {
                    append(((boolean[])(object)));
                } else {
                    append(((java.lang.Object[])(object)));
                }
            } else {
                if (object instanceof java.lang.Long) {
                    append(((java.lang.Long)(object)).longValue());
                } else if (object instanceof java.lang.Integer) {
                    append(((java.lang.Integer)(object)).intValue());
                } else if (object instanceof java.lang.Short) {
                    append(((java.lang.Short)(object)).shortValue());
                } else if (object instanceof java.lang.Character) {
                    append(((java.lang.Character)(object)).charValue());
                } else if (object instanceof java.lang.Byte) {
                    append(((java.lang.Byte)(object)).byteValue());
                } else if (object instanceof java.lang.Double) {
                    append(((java.lang.Double)(object)).doubleValue());
                } else if (object instanceof java.lang.Float) {
                    append(((java.lang.Float)(object)).floatValue());
                } else if (object instanceof java.lang.Boolean) {
                    append(((java.lang.Boolean)(object)).booleanValue());
                } else if (object instanceof java.lang.String) {
                    iTotal = ((iTotal) * (iConstant)) + (object.hashCode());
                } else {
                    if (org.apache.commons.lang3.builder.HashCodeBuilder.isRegistered(object)) {
                        return ((_returnReplacementOperator283.is("NULL")) ? ( null ) : (this));
                    } 
                    try {
                        org.apache.commons.lang3.builder.HashCodeBuilder.register(object);
                        iTotal = ((iTotal) * (iConstant)) + (object.hashCode());
                    } finally {
                        org.apache.commons.lang3.builder.HashCodeBuilder.unregister(object);
                    }
                }
            }
        }
        return ((_returnReplacementOperator284.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final java.lang.Object[] array) {
        if (array == null) {
            iTotal = (iTotal) * (iConstant);
        } else {
            for (final java.lang.Object element : array) {
                append(element);
            }
        }
        return ((_returnReplacementOperator285.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final short value) {
        iTotal = ((iTotal) * (iConstant)) + value;
        return ((_returnReplacementOperator288.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final short[] array) {
        if (array == null) {
            iTotal = (iTotal) * (iConstant);
        } else {
            for (final short element : array) {
                append(element);
            }
        }
        return ((_returnReplacementOperator289.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder appendSuper(final int superHashCode) {
        iTotal = ((iTotal) * (iConstant)) + superHashCode;
        return ((_returnReplacementOperator290.is("NULL")) ? ( null ) : (this));
    }

    public int toHashCode() {
        return ((_returnReplacementOperator268.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator268.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator268.is("ZERO")) ? ( 0 ) : (iTotal));
    }

    @java.lang.Override
    public java.lang.Integer build() {
        return ((_returnReplacementOperator269.is("NULL")) ? ( null ) : (java.lang.Integer.valueOf(toHashCode())));
    }

    @java.lang.Override
    public int hashCode() {
        return ((_returnReplacementOperator262.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator262.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator262.is("ZERO")) ? ( 0 ) : (toHashCode()));
    }

    private static final metamutator.Selector _returnReplacementOperator260 = metamutator.Selector.of(260,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperator260");

    private static final metamutator.Selector _returnReplacementOperator261 = metamutator.Selector.of(261,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperator261");

    private static final metamutator.Selector _returnReplacementOperator262 = metamutator.Selector.of(262,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperator262");

    private static final metamutator.Selector _returnReplacementOperator263 = metamutator.Selector.of(263,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperator263");

    private static final metamutator.Selector _returnReplacementOperator264 = metamutator.Selector.of(264,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperator264");

    private static final metamutator.Selector _returnReplacementOperator265 = metamutator.Selector.of(265,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperator265");

    private static final metamutator.Selector _returnReplacementOperator266 = metamutator.Selector.of(266,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperator266");

    private static final metamutator.Selector _returnReplacementOperator267 = metamutator.Selector.of(267,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperator267");

    private static final metamutator.Selector _returnReplacementOperator268 = metamutator.Selector.of(268,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperator268");

    private static final metamutator.Selector _returnReplacementOperator269 = metamutator.Selector.of(269,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperator269");

    private static final metamutator.Selector _returnReplacementOperator270 = metamutator.Selector.of(270,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperator270");

    private static final metamutator.Selector _returnReplacementOperator271 = metamutator.Selector.of(271,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperator271");

    private static final metamutator.Selector _returnReplacementOperator272 = metamutator.Selector.of(272,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperator272");

    private static final metamutator.Selector _returnReplacementOperator273 = metamutator.Selector.of(273,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperator273");

    private static final metamutator.Selector _returnReplacementOperator274 = metamutator.Selector.of(274,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperator274");

    private static final metamutator.Selector _returnReplacementOperator275 = metamutator.Selector.of(275,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperator275");

    private static final metamutator.Selector _returnReplacementOperator276 = metamutator.Selector.of(276,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperator276");

    private static final metamutator.Selector _returnReplacementOperator277 = metamutator.Selector.of(277,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperator277");

    private static final metamutator.Selector _returnReplacementOperator278 = metamutator.Selector.of(278,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperator278");

    private static final metamutator.Selector _returnReplacementOperator279 = metamutator.Selector.of(279,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperator279");

    private static final metamutator.Selector _returnReplacementOperator280 = metamutator.Selector.of(280,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperator280");

    private static final metamutator.Selector _returnReplacementOperator281 = metamutator.Selector.of(281,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperator281");

    private static final metamutator.Selector _returnReplacementOperator282 = metamutator.Selector.of(282,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperator282");

    private static final metamutator.Selector _returnReplacementOperator283 = metamutator.Selector.of(283,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperator283");

    private static final metamutator.Selector _returnReplacementOperator284 = metamutator.Selector.of(284,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperator284");

    private static final metamutator.Selector _returnReplacementOperator285 = metamutator.Selector.of(285,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperator285");

    private static final metamutator.Selector _returnReplacementOperator286 = metamutator.Selector.of(286,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperator286");

    private static final metamutator.Selector _returnReplacementOperator287 = metamutator.Selector.of(287,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperator287");

    private static final metamutator.Selector _returnReplacementOperator288 = metamutator.Selector.of(288,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperator288");

    private static final metamutator.Selector _returnReplacementOperator289 = metamutator.Selector.of(289,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperator289");

    private static final metamutator.Selector _returnReplacementOperator290 = metamutator.Selector.of(290,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperator290");
}

