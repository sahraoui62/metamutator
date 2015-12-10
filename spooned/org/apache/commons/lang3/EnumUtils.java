package org.apache.commons.lang3;


public class EnumUtils {
    private static final java.lang.String NULL_ELEMENTS_NOT_PERMITTED = "null elements not permitted";

    private static final java.lang.String CANNOT_STORE_S_S_VALUES_IN_S_BITS = "Cannot store %s %s values in %s bits";

    private static final java.lang.String S_DOES_NOT_SEEM_TO_BE_AN_ENUM_TYPE = "%s does not seem to be an Enum type";

    private static final java.lang.String ENUM_CLASS_MUST_BE_DEFINED = "EnumClass must be defined.";

    public EnumUtils() {
    }

    public static <E extends java.lang.Enum<E>>java.util.Map<java.lang.String, E> getEnumMap(final java.lang.Class<E> enumClass) {
        final java.util.Map<java.lang.String, E> map = new java.util.LinkedHashMap<java.lang.String, E>();
        for (final E e : enumClass.getEnumConstants()) {
            map.put(e.name(), e);
        }
        return ((_returnReplacementOperator2816.is("NULL")) ? ( null ) : (map));
    }

    public static <E extends java.lang.Enum<E>>java.util.List<E> getEnumList(final java.lang.Class<E> enumClass) {
        return ((_returnReplacementOperator2815.is("NULL")) ? ( null ) : (new java.util.ArrayList<E>(java.util.Arrays.asList(enumClass.getEnumConstants()))));
    }

    public static <E extends java.lang.Enum<E>>boolean isValidEnum(final java.lang.Class<E> enumClass, final java.lang.String enumName) {
        if (enumName == null) {
            return ((_returnReplacementOperator2808.is("NULL")) ? ( null ) : (false));
        } 
        try {
            java.lang.Enum.valueOf(enumClass, enumName);
            return ((_returnReplacementOperator2809.is("NULL")) ? ( null ) : (true));
        } catch (final java.lang.IllegalArgumentException ex) {
            return ((_returnReplacementOperator2810.is("NULL")) ? ( null ) : (false));
        }
    }

    public static <E extends java.lang.Enum<E>>E getEnum(final java.lang.Class<E> enumClass, final java.lang.String enumName) {
        if (enumName == null) {
            return ((_returnReplacementOperator2805.is("NULL")) ? ( null ) : (null));
        } 
        try {
            return ((_returnReplacementOperator2806.is("NULL")) ? ( null ) : (java.lang.Enum.valueOf(enumClass, enumName)));
        } catch (final java.lang.IllegalArgumentException ex) {
            return ((_returnReplacementOperator2807.is("NULL")) ? ( null ) : (null));
        }
    }

    public static <E extends java.lang.Enum<E>>long generateBitVector(final java.lang.Class<E> enumClass, final java.lang.Iterable<? extends E> values) {
        org.apache.commons.lang3.EnumUtils.checkBitVectorable(enumClass);
        org.apache.commons.lang3.Validate.notNull(values);
        long total = 0;
        for (final E constant : values) {
            org.apache.commons.lang3.Validate.isTrue((constant != null), NULL_ELEMENTS_NOT_PERMITTED);
            total |= 1L << (constant.ordinal());
        }
        return ((_returnReplacementOperator2818.is("NULL")) ? ( null ) : (total));
    }

    public static <E extends java.lang.Enum<E>>long[] generateBitVectors(final java.lang.Class<E> enumClass, final java.lang.Iterable<? extends E> values) {
        org.apache.commons.lang3.EnumUtils.asEnum(enumClass);
        org.apache.commons.lang3.Validate.notNull(values);
        final java.util.EnumSet<E> condensed = java.util.EnumSet.noneOf(enumClass);
        for (final E constant : values) {
            org.apache.commons.lang3.Validate.isTrue((constant != null), NULL_ELEMENTS_NOT_PERMITTED);
            condensed.add(constant);
        }
        final long[] result = new long[(((enumClass.getEnumConstants().length) - 1) / (java.lang.Long.SIZE)) + 1];
        for (final E value : condensed) {
            result[((value.ordinal()) / (java.lang.Long.SIZE))] |= 1L << ((value.ordinal()) % (java.lang.Long.SIZE));
        }
        org.apache.commons.lang3.ArrayUtils.reverse(result);
        return ((_returnReplacementOperator2820.is("NULL")) ? ( null ) : (result));
    }

    public static <E extends java.lang.Enum<E>>long generateBitVector(final java.lang.Class<E> enumClass, final E... values) {
        org.apache.commons.lang3.Validate.noNullElements(values);
        return ((_returnReplacementOperator2817.is("NULL")) ? ( null ) : (org.apache.commons.lang3.EnumUtils.generateBitVector(enumClass, java.util.Arrays.<E>asList(values))));
    }

    public static <E extends java.lang.Enum<E>>long[] generateBitVectors(final java.lang.Class<E> enumClass, final E... values) {
        org.apache.commons.lang3.EnumUtils.asEnum(enumClass);
        org.apache.commons.lang3.Validate.noNullElements(values);
        final java.util.EnumSet<E> condensed = java.util.EnumSet.noneOf(enumClass);
        java.util.Collections.addAll(condensed, values);
        final long[] result = new long[(((enumClass.getEnumConstants().length) - 1) / (java.lang.Long.SIZE)) + 1];
        for (final E value : condensed) {
            result[((value.ordinal()) / (java.lang.Long.SIZE))] |= 1L << ((value.ordinal()) % (java.lang.Long.SIZE));
        }
        org.apache.commons.lang3.ArrayUtils.reverse(result);
        return ((_returnReplacementOperator2819.is("NULL")) ? ( null ) : (result));
    }

    public static <E extends java.lang.Enum<E>>java.util.EnumSet<E> processBitVector(final java.lang.Class<E> enumClass, final long value) {
        org.apache.commons.lang3.EnumUtils.checkBitVectorable(enumClass).getEnumConstants();
        return ((_returnReplacementOperator2813.is("NULL")) ? ( null ) : (org.apache.commons.lang3.EnumUtils.processBitVectors(enumClass, value)));
    }

    public static <E extends java.lang.Enum<E>>java.util.EnumSet<E> processBitVectors(final java.lang.Class<E> enumClass, final long... values) {
        final java.util.EnumSet<E> results = java.util.EnumSet.noneOf(org.apache.commons.lang3.EnumUtils.asEnum(enumClass));
        final long[] lvalues = org.apache.commons.lang3.ArrayUtils.clone(org.apache.commons.lang3.Validate.notNull(values));
        org.apache.commons.lang3.ArrayUtils.reverse(lvalues);
        for (final E constant : enumClass.getEnumConstants()) {
            final int block = (constant.ordinal()) / (java.lang.Long.SIZE);
            if ((block < (lvalues.length)) && (((lvalues[block]) & (1L << ((constant.ordinal()) % (java.lang.Long.SIZE)))) != 0)) {
                results.add(constant);
            } 
        }
        return ((_returnReplacementOperator2814.is("NULL")) ? ( null ) : (results));
    }

    private static <E extends java.lang.Enum<E>>java.lang.Class<E> checkBitVectorable(final java.lang.Class<E> enumClass) {
        final E[] constants = org.apache.commons.lang3.EnumUtils.asEnum(enumClass).getEnumConstants();
        org.apache.commons.lang3.Validate.isTrue(((constants.length) <= (java.lang.Long.SIZE)), CANNOT_STORE_S_S_VALUES_IN_S_BITS, java.lang.Integer.valueOf(constants.length), enumClass.getSimpleName(), java.lang.Integer.valueOf(java.lang.Long.SIZE));
        return ((_returnReplacementOperator2812.is("NULL")) ? ( null ) : (enumClass));
    }

    private static <E extends java.lang.Enum<E>>java.lang.Class<E> asEnum(final java.lang.Class<E> enumClass) {
        org.apache.commons.lang3.Validate.notNull(enumClass, ENUM_CLASS_MUST_BE_DEFINED);
        org.apache.commons.lang3.Validate.isTrue(enumClass.isEnum(), S_DOES_NOT_SEEM_TO_BE_AN_ENUM_TYPE, enumClass);
        return ((_returnReplacementOperator2811.is("NULL")) ? ( null ) : (enumClass));
    }

    private static final metamutator.Selector _returnReplacementOperator2805 = metamutator.Selector.of(2805,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.EnumUtils.class).id("_returnReplacementOperator2805");

    private static final metamutator.Selector _returnReplacementOperator2806 = metamutator.Selector.of(2806,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.EnumUtils.class).id("_returnReplacementOperator2806");

    private static final metamutator.Selector _returnReplacementOperator2807 = metamutator.Selector.of(2807,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.EnumUtils.class).id("_returnReplacementOperator2807");

    private static final metamutator.Selector _returnReplacementOperator2808 = metamutator.Selector.of(2808,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.EnumUtils.class).id("_returnReplacementOperator2808");

    private static final metamutator.Selector _returnReplacementOperator2809 = metamutator.Selector.of(2809,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.EnumUtils.class).id("_returnReplacementOperator2809");

    private static final metamutator.Selector _returnReplacementOperator2810 = metamutator.Selector.of(2810,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.EnumUtils.class).id("_returnReplacementOperator2810");

    private static final metamutator.Selector _returnReplacementOperator2811 = metamutator.Selector.of(2811,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.EnumUtils.class).id("_returnReplacementOperator2811");

    private static final metamutator.Selector _returnReplacementOperator2812 = metamutator.Selector.of(2812,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.EnumUtils.class).id("_returnReplacementOperator2812");

    private static final metamutator.Selector _returnReplacementOperator2813 = metamutator.Selector.of(2813,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.EnumUtils.class).id("_returnReplacementOperator2813");

    private static final metamutator.Selector _returnReplacementOperator2814 = metamutator.Selector.of(2814,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.EnumUtils.class).id("_returnReplacementOperator2814");

    private static final metamutator.Selector _returnReplacementOperator2815 = metamutator.Selector.of(2815,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.EnumUtils.class).id("_returnReplacementOperator2815");

    private static final metamutator.Selector _returnReplacementOperator2816 = metamutator.Selector.of(2816,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.EnumUtils.class).id("_returnReplacementOperator2816");

    private static final metamutator.Selector _returnReplacementOperator2817 = metamutator.Selector.of(2817,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.EnumUtils.class).id("_returnReplacementOperator2817");

    private static final metamutator.Selector _returnReplacementOperator2818 = metamutator.Selector.of(2818,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.EnumUtils.class).id("_returnReplacementOperator2818");

    private static final metamutator.Selector _returnReplacementOperator2819 = metamutator.Selector.of(2819,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.EnumUtils.class).id("_returnReplacementOperator2819");

    private static final metamutator.Selector _returnReplacementOperator2820 = metamutator.Selector.of(2820,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.EnumUtils.class).id("_returnReplacementOperator2820");
}

