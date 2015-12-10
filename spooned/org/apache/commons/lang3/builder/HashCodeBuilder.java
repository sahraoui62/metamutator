package org.apache.commons.lang3.builder;


public class HashCodeBuilder implements org.apache.commons.lang3.builder.Builder<java.lang.Integer> {
    private static final int DEFAULT_INITIAL_VALUE = 17;

    private static final int DEFAULT_MULTIPLIER_VALUE = 37;

    private static final java.lang.ThreadLocal<java.util.Set<org.apache.commons.lang3.builder.IDKey>> REGISTRY = new java.lang.ThreadLocal<java.util.Set<org.apache.commons.lang3.builder.IDKey>>();

    static java.util.Set<org.apache.commons.lang3.builder.IDKey> getRegistry() {
        return REGISTRY.get();
    }

    static boolean isRegistered(final java.lang.Object value) {
        final java.util.Set<org.apache.commons.lang3.builder.IDKey> registry = org.apache.commons.lang3.builder.HashCodeBuilder.getRegistry();
        return (registry != null) && (registry.contains(new org.apache.commons.lang3.builder.IDKey(value)));
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
        return org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(initialNonZeroOddNumber, multiplierNonZeroOddNumber, object, false, null);
    }

    public static int reflectionHashCode(final int initialNonZeroOddNumber, final int multiplierNonZeroOddNumber, final java.lang.Object object, final boolean testTransients) {
        return org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(initialNonZeroOddNumber, multiplierNonZeroOddNumber, object, testTransients, null);
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
        return builder.toHashCode();
    }

    public static int reflectionHashCode(final java.lang.Object object, final boolean testTransients) {
        return org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(DEFAULT_INITIAL_VALUE, DEFAULT_MULTIPLIER_VALUE, object, testTransients, null);
    }

    public static int reflectionHashCode(final java.lang.Object object, final java.util.Collection<java.lang.String> excludeFields) {
        return org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(object, org.apache.commons.lang3.builder.ReflectionToStringBuilder.toNoNullStringArray(excludeFields));
    }

    public static int reflectionHashCode(final java.lang.Object object, final java.lang.String... excludeFields) {
        return org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(DEFAULT_INITIAL_VALUE, DEFAULT_MULTIPLIER_VALUE, object, false, null, excludeFields);
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
        iTotal = ((_arithmeticOperatorHotSpot1.is("PLUS")) ? (((iTotal) + (iConstant))) : (_arithmeticOperatorHotSpot1.is("MINUS")) ? (((iTotal) - (iConstant))) : (_arithmeticOperatorHotSpot1.is("MUL")) ? (((iTotal) * (iConstant))) :  (((iTotal) / (iConstant)))) + (value ? 0 : 1);
        return this;
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final boolean[] array) {
        if (array == null) {
            iTotal = ((_arithmeticOperatorHotSpot2.is("PLUS")) ? ((iTotal) + (iConstant)) : (_arithmeticOperatorHotSpot2.is("MINUS")) ? ((iTotal) - (iConstant)) : (_arithmeticOperatorHotSpot2.is("MUL")) ? ((iTotal) * (iConstant)) :  ((iTotal) / (iConstant)));
        } else {
            for (final boolean element : array) {
                append(element);
            }
        }
        return this;
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final byte value) {
        iTotal = ((_arithmeticOperatorHotSpot3.is("PLUS")) ? (((iTotal) + (iConstant))) : (_arithmeticOperatorHotSpot3.is("MINUS")) ? (((iTotal) - (iConstant))) : (_arithmeticOperatorHotSpot3.is("MUL")) ? (((iTotal) * (iConstant))) :  (((iTotal) / (iConstant)))) + value;
        return this;
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final byte[] array) {
        if (array == null) {
            iTotal = ((_arithmeticOperatorHotSpot4.is("PLUS")) ? ((iTotal) + (iConstant)) : (_arithmeticOperatorHotSpot4.is("MINUS")) ? ((iTotal) - (iConstant)) : (_arithmeticOperatorHotSpot4.is("MUL")) ? ((iTotal) * (iConstant)) :  ((iTotal) / (iConstant)));
        } else {
            for (final byte element : array) {
                append(element);
            }
        }
        return this;
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final char value) {
        iTotal = ((_arithmeticOperatorHotSpot5.is("PLUS")) ? (((iTotal) + (iConstant))) : (_arithmeticOperatorHotSpot5.is("MINUS")) ? (((iTotal) - (iConstant))) : (_arithmeticOperatorHotSpot5.is("MUL")) ? (((iTotal) * (iConstant))) :  (((iTotal) / (iConstant)))) + value;
        return this;
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final char[] array) {
        if (array == null) {
            iTotal = ((_arithmeticOperatorHotSpot6.is("PLUS")) ? ((iTotal) + (iConstant)) : (_arithmeticOperatorHotSpot6.is("MINUS")) ? ((iTotal) - (iConstant)) : (_arithmeticOperatorHotSpot6.is("MUL")) ? ((iTotal) * (iConstant)) :  ((iTotal) / (iConstant)));
        } else {
            for (final char element : array) {
                append(element);
            }
        }
        return this;
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final double value) {
        return append(java.lang.Double.doubleToLongBits(value));
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final double[] array) {
        if (array == null) {
            iTotal = ((_arithmeticOperatorHotSpot7.is("PLUS")) ? ((iTotal) + (iConstant)) : (_arithmeticOperatorHotSpot7.is("MINUS")) ? ((iTotal) - (iConstant)) : (_arithmeticOperatorHotSpot7.is("MUL")) ? ((iTotal) * (iConstant)) :  ((iTotal) / (iConstant)));
        } else {
            for (final double element : array) {
                append(element);
            }
        }
        return this;
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final float value) {
        iTotal = ((_arithmeticOperatorHotSpot8.is("PLUS")) ? (((iTotal) + (iConstant))) : (_arithmeticOperatorHotSpot8.is("MINUS")) ? (((iTotal) - (iConstant))) : (_arithmeticOperatorHotSpot8.is("MUL")) ? (((iTotal) * (iConstant))) :  (((iTotal) / (iConstant)))) + (java.lang.Float.floatToIntBits(value));
        return this;
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final float[] array) {
        if (array == null) {
            iTotal = ((_arithmeticOperatorHotSpot9.is("PLUS")) ? ((iTotal) + (iConstant)) : (_arithmeticOperatorHotSpot9.is("MINUS")) ? ((iTotal) - (iConstant)) : (_arithmeticOperatorHotSpot9.is("MUL")) ? ((iTotal) * (iConstant)) :  ((iTotal) / (iConstant)));
        } else {
            for (final float element : array) {
                append(element);
            }
        }
        return this;
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final int value) {
        iTotal = ((_arithmeticOperatorHotSpot10.is("PLUS")) ? (((iTotal) + (iConstant))) : (_arithmeticOperatorHotSpot10.is("MINUS")) ? (((iTotal) - (iConstant))) : (_arithmeticOperatorHotSpot10.is("MUL")) ? (((iTotal) * (iConstant))) :  (((iTotal) / (iConstant)))) + value;
        return this;
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final int[] array) {
        if (array == null) {
            iTotal = ((_arithmeticOperatorHotSpot11.is("PLUS")) ? ((iTotal) + (iConstant)) : (_arithmeticOperatorHotSpot11.is("MINUS")) ? ((iTotal) - (iConstant)) : (_arithmeticOperatorHotSpot11.is("MUL")) ? ((iTotal) * (iConstant)) :  ((iTotal) / (iConstant)));
        } else {
            for (final int element : array) {
                append(element);
            }
        }
        return this;
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final long value) {
        iTotal = ((_arithmeticOperatorHotSpot16.is("PLUS")) ? (((iTotal) + (iConstant))) : (_arithmeticOperatorHotSpot16.is("MINUS")) ? (((iTotal) - (iConstant))) : (_arithmeticOperatorHotSpot16.is("MUL")) ? (((iTotal) * (iConstant))) :  (((iTotal) / (iConstant)))) + ((int)((value ^ (value >> 32))));
        return this;
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final long[] array) {
        if (array == null) {
            iTotal = ((_arithmeticOperatorHotSpot17.is("PLUS")) ? ((iTotal) + (iConstant)) : (_arithmeticOperatorHotSpot17.is("MINUS")) ? ((iTotal) - (iConstant)) : (_arithmeticOperatorHotSpot17.is("MUL")) ? ((iTotal) * (iConstant)) :  ((iTotal) / (iConstant)));
        } else {
            for (final long element : array) {
                append(element);
            }
        }
        return this;
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final java.lang.Object object) {
        if (object == null) {
            iTotal = ((_arithmeticOperatorHotSpot12.is("PLUS")) ? ((iTotal) + (iConstant)) : (_arithmeticOperatorHotSpot12.is("MINUS")) ? ((iTotal) - (iConstant)) : (_arithmeticOperatorHotSpot12.is("MUL")) ? ((iTotal) * (iConstant)) :  ((iTotal) / (iConstant)));
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
                    iTotal = ((_arithmeticOperatorHotSpot13.is("PLUS")) ? (((iTotal) + (iConstant))) : (_arithmeticOperatorHotSpot13.is("MINUS")) ? (((iTotal) - (iConstant))) : (_arithmeticOperatorHotSpot13.is("MUL")) ? (((iTotal) * (iConstant))) :  (((iTotal) / (iConstant)))) + (object.hashCode());
                } else {
                    if (org.apache.commons.lang3.builder.HashCodeBuilder.isRegistered(object)) {
                        return this;
                    } 
                    try {
                        org.apache.commons.lang3.builder.HashCodeBuilder.register(object);
                        iTotal = ((_arithmeticOperatorHotSpot14.is("PLUS")) ? (((iTotal) + (iConstant))) : (_arithmeticOperatorHotSpot14.is("MINUS")) ? (((iTotal) - (iConstant))) : (_arithmeticOperatorHotSpot14.is("MUL")) ? (((iTotal) * (iConstant))) :  (((iTotal) / (iConstant)))) + (object.hashCode());
                    } finally {
                        org.apache.commons.lang3.builder.HashCodeBuilder.unregister(object);
                    }
                }
            }
        }
        return this;
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final java.lang.Object[] array) {
        if (array == null) {
            iTotal = ((_arithmeticOperatorHotSpot15.is("PLUS")) ? ((iTotal) + (iConstant)) : (_arithmeticOperatorHotSpot15.is("MINUS")) ? ((iTotal) - (iConstant)) : (_arithmeticOperatorHotSpot15.is("MUL")) ? ((iTotal) * (iConstant)) :  ((iTotal) / (iConstant)));
        } else {
            for (final java.lang.Object element : array) {
                append(element);
            }
        }
        return this;
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final short value) {
        iTotal = ((_arithmeticOperatorHotSpot18.is("PLUS")) ? (((iTotal) + (iConstant))) : (_arithmeticOperatorHotSpot18.is("MINUS")) ? (((iTotal) - (iConstant))) : (_arithmeticOperatorHotSpot18.is("MUL")) ? (((iTotal) * (iConstant))) :  (((iTotal) / (iConstant)))) + value;
        return this;
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder append(final short[] array) {
        if (array == null) {
            iTotal = ((_arithmeticOperatorHotSpot19.is("PLUS")) ? ((iTotal) + (iConstant)) : (_arithmeticOperatorHotSpot19.is("MINUS")) ? ((iTotal) - (iConstant)) : (_arithmeticOperatorHotSpot19.is("MUL")) ? ((iTotal) * (iConstant)) :  ((iTotal) / (iConstant)));
        } else {
            for (final short element : array) {
                append(element);
            }
        }
        return this;
    }

    public org.apache.commons.lang3.builder.HashCodeBuilder appendSuper(final int superHashCode) {
        iTotal = ((_arithmeticOperatorHotSpot20.is("PLUS")) ? (((iTotal) + (iConstant))) : (_arithmeticOperatorHotSpot20.is("MINUS")) ? (((iTotal) - (iConstant))) : (_arithmeticOperatorHotSpot20.is("MUL")) ? (((iTotal) * (iConstant))) :  (((iTotal) / (iConstant)))) + superHashCode;
        return this;
    }

    public int toHashCode() {
        return iTotal;
    }

    @java.lang.Override
    public java.lang.Integer build() {
        return java.lang.Integer.valueOf(toHashCode());
    }

    @java.lang.Override
    public int hashCode() {
        return toHashCode();
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot1 = metamutator.Selector.of(1,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_arithmeticOperatorHotSpot1");

    private static final metamutator.Selector _arithmeticOperatorHotSpot2 = metamutator.Selector.of(2,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_arithmeticOperatorHotSpot2");

    private static final metamutator.Selector _arithmeticOperatorHotSpot3 = metamutator.Selector.of(3,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_arithmeticOperatorHotSpot3");

    private static final metamutator.Selector _arithmeticOperatorHotSpot4 = metamutator.Selector.of(4,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_arithmeticOperatorHotSpot4");

    private static final metamutator.Selector _arithmeticOperatorHotSpot5 = metamutator.Selector.of(5,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_arithmeticOperatorHotSpot5");

    private static final metamutator.Selector _arithmeticOperatorHotSpot6 = metamutator.Selector.of(6,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_arithmeticOperatorHotSpot6");

    private static final metamutator.Selector _arithmeticOperatorHotSpot7 = metamutator.Selector.of(7,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_arithmeticOperatorHotSpot7");

    private static final metamutator.Selector _arithmeticOperatorHotSpot8 = metamutator.Selector.of(8,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_arithmeticOperatorHotSpot8");

    private static final metamutator.Selector _arithmeticOperatorHotSpot9 = metamutator.Selector.of(9,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_arithmeticOperatorHotSpot9");

    private static final metamutator.Selector _arithmeticOperatorHotSpot10 = metamutator.Selector.of(10,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_arithmeticOperatorHotSpot10");

    private static final metamutator.Selector _arithmeticOperatorHotSpot11 = metamutator.Selector.of(11,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_arithmeticOperatorHotSpot11");

    private static final metamutator.Selector _arithmeticOperatorHotSpot12 = metamutator.Selector.of(12,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_arithmeticOperatorHotSpot12");

    private static final metamutator.Selector _arithmeticOperatorHotSpot13 = metamutator.Selector.of(13,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_arithmeticOperatorHotSpot13");

    private static final metamutator.Selector _arithmeticOperatorHotSpot14 = metamutator.Selector.of(14,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_arithmeticOperatorHotSpot14");

    private static final metamutator.Selector _arithmeticOperatorHotSpot15 = metamutator.Selector.of(15,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_arithmeticOperatorHotSpot15");

    private static final metamutator.Selector _arithmeticOperatorHotSpot16 = metamutator.Selector.of(16,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_arithmeticOperatorHotSpot16");

    private static final metamutator.Selector _arithmeticOperatorHotSpot17 = metamutator.Selector.of(17,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_arithmeticOperatorHotSpot17");

    private static final metamutator.Selector _arithmeticOperatorHotSpot18 = metamutator.Selector.of(18,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_arithmeticOperatorHotSpot18");

    private static final metamutator.Selector _arithmeticOperatorHotSpot19 = metamutator.Selector.of(19,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_arithmeticOperatorHotSpot19");

    private static final metamutator.Selector _arithmeticOperatorHotSpot20 = metamutator.Selector.of(20,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.builder.HashCodeBuilder.class).id("_arithmeticOperatorHotSpot20");
}

