package org.apache.commons.lang3.builder;


public class HashCodeBuilder implements org.apache.commons.lang3.builder.Builder<java.lang.Integer> {
    private static final int DEFAULT_INITIAL_VALUE = 17;

    private static final int DEFAULT_MULTIPLIER_VALUE = 37;

    private static final java.lang.ThreadLocal<java.util.Set<org.apache.commons.lang3.builder.IDKey>> REGISTRY = new java.lang.ThreadLocal<java.util.Set<org.apache.commons.lang3.builder.IDKey>>();

    static java.util.Set<org.apache.commons.lang3.builder.IDKey> getRegistry() {
        return ((_returnReplacementOperatorHotSpot270.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.builder.HashCodeBuilder.REGISTRY.get()));
    }

    static boolean isRegistered(final java.lang.Object value) {
        final java.util.Set<org.apache.commons.lang3.builder.IDKey> registry = org.apache.commons.lang3.builder.HashCodeBuilder.getRegistry();
        return ((_returnReplacementOperatorHotSpot261.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((registry != null) && (registry.contains(new org.apache.commons.lang3.builder.IDKey(value)))));
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
        return ((_returnReplacementOperatorHotSpot263.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot263.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot263.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(initialNonZeroOddNumber, multiplierNonZeroOddNumber, object, false, null)));
    }

    public static int reflectionHashCode(final int initialNonZeroOddNumber, final int multiplierNonZeroOddNumber, final java.lang.Object object, final boolean testTransients) {
        return ((_returnReplacementOperatorHotSpot264.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot264.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot264.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(initialNonZeroOddNumber, multiplierNonZeroOddNumber, object, testTransients, null)));
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
        return ((_returnReplacementOperatorHotSpot260.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot260.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot260.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (builder.toHashCode()));
    }

    public static int reflectionHashCode(final java.lang.Object object, final boolean testTransients) {
        return ((_returnReplacementOperatorHotSpot265.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot265.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot265.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(org.apache.commons.lang3.builder.HashCodeBuilder.DEFAULT_INITIAL_VALUE, org.apache.commons.lang3.builder.HashCodeBuilder.DEFAULT_MULTIPLIER_VALUE, object, testTransients, null)));
    }

    public static int reflectionHashCode(final java.lang.Object object, final java.util.Collection<java.lang.String> excludeFields) {
        return ((_returnReplacementOperatorHotSpot267.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot267.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot267.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(object, org.apache.commons.lang3.builder.ReflectionToStringBuilder.toNoNullStringArray(excludeFields))));
    }

    public static int reflectionHashCode(final java.lang.Object object, final java.lang.String... excludeFields) {
        return ((_returnReplacementOperatorHotSpot266.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot266.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot266.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(org.apache.commons.lang3.builder.HashCodeBuilder.DEFAULT_INITIAL_VALUE, org.apache.commons.lang3.builder.HashCodeBuilder.DEFAULT_MULTIPLIER_VALUE, object, false, null, excludeFields)));
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
        return ((_returnReplacementOperatorHotSpot271.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final boolean[] array) {
        if (array == null) {
            iTotal = (iTotal) * (iConstant);
        } else {
            for (final boolean element : array) {
                append(element);
            }
        }
        return ((_returnReplacementOperatorHotSpot272.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final byte value) {
        iTotal = ((iTotal) * (iConstant)) + value;
        return ((_returnReplacementOperatorHotSpot273.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final byte[] array) {
        if (array == null) {
            iTotal = (iTotal) * (iConstant);
        } else {
            for (final byte element : array) {
                append(element);
            }
        }
        return ((_returnReplacementOperatorHotSpot274.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final char value) {
        iTotal = ((iTotal) * (iConstant)) + value;
        return ((_returnReplacementOperatorHotSpot275.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final char[] array) {
        if (array == null) {
            iTotal = (iTotal) * (iConstant);
        } else {
            for (final char element : array) {
                append(element);
            }
        }
        return ((_returnReplacementOperatorHotSpot276.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final double value) {
        return ((_returnReplacementOperatorHotSpot277.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(java.lang.Double.doubleToLongBits(value))));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final double[] array) {
        if (array == null) {
            iTotal = (iTotal) * (iConstant);
        } else {
            for (final double element : array) {
                append(element);
            }
        }
        return ((_returnReplacementOperatorHotSpot278.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final float value) {
        iTotal = ((iTotal) * (iConstant)) + (java.lang.Float.floatToIntBits(value));
        return ((_returnReplacementOperatorHotSpot279.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final float[] array) {
        if (array == null) {
            iTotal = (iTotal) * (iConstant);
        } else {
            for (final float element : array) {
                append(element);
            }
        }
        return ((_returnReplacementOperatorHotSpot280.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final int value) {
        iTotal = ((iTotal) * (iConstant)) + value;
        return ((_returnReplacementOperatorHotSpot281.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final int[] array) {
        if (array == null) {
            iTotal = (iTotal) * (iConstant);
        } else {
            for (final int element : array) {
                append(element);
            }
        }
        return ((_returnReplacementOperatorHotSpot282.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final long value) {
        iTotal = ((iTotal) * (iConstant)) + ((int)((value ^ (value >> 32))));
        return ((_returnReplacementOperatorHotSpot286.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final long[] array) {
        if (array == null) {
            iTotal = (iTotal) * (iConstant);
        } else {
            for (final long element : array) {
                append(element);
            }
        }
        return ((_returnReplacementOperatorHotSpot287.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
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
                        return ((_returnReplacementOperatorHotSpot283.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
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
        return ((_returnReplacementOperatorHotSpot284.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final java.lang.Object[] array) {
        if (array == null) {
            iTotal = (iTotal) * (iConstant);
        } else {
            for (final java.lang.Object element : array) {
                append(element);
            }
        }
        return ((_returnReplacementOperatorHotSpot285.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final short value) {
        iTotal = ((iTotal) * (iConstant)) + value;
        return ((_returnReplacementOperatorHotSpot288.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final short[] array) {
        if (array == null) {
            iTotal = (iTotal) * (iConstant);
        } else {
            for (final short element : array) {
                append(element);
            }
        }
        return ((_returnReplacementOperatorHotSpot289.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder appendSuper(final int superHashCode) {
        iTotal = ((iTotal) * (iConstant)) + superHashCode;
        return ((_returnReplacementOperatorHotSpot290.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public int toHashCode() {
        return ((_returnReplacementOperatorHotSpot268.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot268.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot268.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (iTotal));
    }

    @java.lang.Override
    public java.lang.Integer build() {
        return ((_returnReplacementOperatorHotSpot269.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Integer.valueOf(toHashCode())));
    }

    @java.lang.Override
    public int hashCode() {
        return ((_returnReplacementOperatorHotSpot262.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot262.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot262.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (toHashCode()));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot260 = metamutator.Selector.of(260,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperatorHotSpot260");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot261 = metamutator.Selector.of(261,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperatorHotSpot261");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot262 = metamutator.Selector.of(262,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperatorHotSpot262");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot263 = metamutator.Selector.of(263,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperatorHotSpot263");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot264 = metamutator.Selector.of(264,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperatorHotSpot264");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot265 = metamutator.Selector.of(265,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperatorHotSpot265");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot266 = metamutator.Selector.of(266,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperatorHotSpot266");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot267 = metamutator.Selector.of(267,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperatorHotSpot267");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot268 = metamutator.Selector.of(268,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperatorHotSpot268");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot269 = metamutator.Selector.of(269,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperatorHotSpot269");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot270 = metamutator.Selector.of(270,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperatorHotSpot270");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot271 = metamutator.Selector.of(271,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperatorHotSpot271");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot272 = metamutator.Selector.of(272,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperatorHotSpot272");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot273 = metamutator.Selector.of(273,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperatorHotSpot273");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot274 = metamutator.Selector.of(274,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperatorHotSpot274");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot275 = metamutator.Selector.of(275,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperatorHotSpot275");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot276 = metamutator.Selector.of(276,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperatorHotSpot276");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot277 = metamutator.Selector.of(277,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperatorHotSpot277");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot278 = metamutator.Selector.of(278,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperatorHotSpot278");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot279 = metamutator.Selector.of(279,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperatorHotSpot279");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot280 = metamutator.Selector.of(280,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperatorHotSpot280");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot281 = metamutator.Selector.of(281,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperatorHotSpot281");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot282 = metamutator.Selector.of(282,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperatorHotSpot282");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot283 = metamutator.Selector.of(283,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperatorHotSpot283");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot284 = metamutator.Selector.of(284,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperatorHotSpot284");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot285 = metamutator.Selector.of(285,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperatorHotSpot285");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot286 = metamutator.Selector.of(286,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperatorHotSpot286");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot287 = metamutator.Selector.of(287,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperatorHotSpot287");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot288 = metamutator.Selector.of(288,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperatorHotSpot288");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot289 = metamutator.Selector.of(289,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperatorHotSpot289");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot290 = metamutator.Selector.of(290,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_returnReplacementOperatorHotSpot290");
}

