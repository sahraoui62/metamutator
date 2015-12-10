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
        return ((_returnReplacementOperatorHotSpot2816.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (map));
    }

    public static <E extends java.lang.Enum<E>>java.util.List<E> getEnumList(final java.lang.Class<E> enumClass) {
        return ((_returnReplacementOperatorHotSpot2815.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new java.util.ArrayList<E>(java.util.Arrays.asList(enumClass.getEnumConstants()))));
    }

    public static <E extends java.lang.Enum<E>>boolean isValidEnum(final java.lang.Class<E> enumClass, final java.lang.String enumName) {
        if (enumName == null) {
            return ((_returnReplacementOperatorHotSpot2808.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        try {
            java.lang.Enum.valueOf(enumClass, enumName);
            return ((_returnReplacementOperatorHotSpot2809.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } catch (final java.lang.IllegalArgumentException ex) {
            return ((_returnReplacementOperatorHotSpot2810.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        }
    }

    public static <E extends java.lang.Enum<E>>E getEnum(final java.lang.Class<E> enumClass, final java.lang.String enumName) {
        if (enumName == null) {
            return ((_returnReplacementOperatorHotSpot2805.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        try {
            return ((_returnReplacementOperatorHotSpot2806.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Enum.valueOf(enumClass, enumName)));
        } catch (final java.lang.IllegalArgumentException ex) {
            return ((_returnReplacementOperatorHotSpot2807.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
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
        return ((_returnReplacementOperatorHotSpot2818.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (total));
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
        return ((_returnReplacementOperatorHotSpot2820.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static <E extends java.lang.Enum<E>>long generateBitVector(final java.lang.Class<E> enumClass, final E... values) {
        org.apache.commons.lang3.Validate.noNullElements(values);
        return ((_returnReplacementOperatorHotSpot2817.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.EnumUtils.generateBitVector(enumClass, java.util.Arrays.<E>asList(values))));
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
        return ((_returnReplacementOperatorHotSpot2819.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static <E extends java.lang.Enum<E>>java.util.EnumSet<E> processBitVector(final java.lang.Class<E> enumClass, final long value) {
        org.apache.commons.lang3.EnumUtils.checkBitVectorable(enumClass).getEnumConstants();
        return ((_returnReplacementOperatorHotSpot2813.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.EnumUtils.processBitVectors(enumClass, value)));
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
        return ((_returnReplacementOperatorHotSpot2814.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (results));
    }

    private static <E extends java.lang.Enum<E>>java.lang.Class<E> checkBitVectorable(final java.lang.Class<E> enumClass) {
        final E[] constants = org.apache.commons.lang3.EnumUtils.asEnum(enumClass).getEnumConstants();
        org.apache.commons.lang3.Validate.isTrue(((constants.length) <= (java.lang.Long.SIZE)), CANNOT_STORE_S_S_VALUES_IN_S_BITS, java.lang.Integer.valueOf(constants.length), enumClass.getSimpleName(), java.lang.Integer.valueOf(java.lang.Long.SIZE));
        return ((_returnReplacementOperatorHotSpot2812.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (enumClass));
    }

    private static <E extends java.lang.Enum<E>>java.lang.Class<E> asEnum(final java.lang.Class<E> enumClass) {
        org.apache.commons.lang3.Validate.notNull(enumClass, ENUM_CLASS_MUST_BE_DEFINED);
        org.apache.commons.lang3.Validate.isTrue(enumClass.isEnum(), S_DOES_NOT_SEEM_TO_BE_AN_ENUM_TYPE, enumClass);
        return ((_returnReplacementOperatorHotSpot2811.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (enumClass));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2805 = metamutator.Selector.of(2805,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.EnumUtils.class).id("_returnReplacementOperatorHotSpot2805");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2806 = metamutator.Selector.of(2806,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.EnumUtils.class).id("_returnReplacementOperatorHotSpot2806");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2807 = metamutator.Selector.of(2807,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.EnumUtils.class).id("_returnReplacementOperatorHotSpot2807");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2808 = metamutator.Selector.of(2808,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.EnumUtils.class).id("_returnReplacementOperatorHotSpot2808");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2809 = metamutator.Selector.of(2809,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.EnumUtils.class).id("_returnReplacementOperatorHotSpot2809");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2810 = metamutator.Selector.of(2810,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.EnumUtils.class).id("_returnReplacementOperatorHotSpot2810");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2811 = metamutator.Selector.of(2811,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.EnumUtils.class).id("_returnReplacementOperatorHotSpot2811");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2812 = metamutator.Selector.of(2812,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.EnumUtils.class).id("_returnReplacementOperatorHotSpot2812");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2813 = metamutator.Selector.of(2813,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.EnumUtils.class).id("_returnReplacementOperatorHotSpot2813");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2814 = metamutator.Selector.of(2814,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.EnumUtils.class).id("_returnReplacementOperatorHotSpot2814");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2815 = metamutator.Selector.of(2815,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.EnumUtils.class).id("_returnReplacementOperatorHotSpot2815");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2816 = metamutator.Selector.of(2816,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.EnumUtils.class).id("_returnReplacementOperatorHotSpot2816");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2817 = metamutator.Selector.of(2817,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.EnumUtils.class).id("_returnReplacementOperatorHotSpot2817");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2818 = metamutator.Selector.of(2818,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.EnumUtils.class).id("_returnReplacementOperatorHotSpot2818");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2819 = metamutator.Selector.of(2819,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.EnumUtils.class).id("_returnReplacementOperatorHotSpot2819");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2820 = metamutator.Selector.of(2820,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.EnumUtils.class).id("_returnReplacementOperatorHotSpot2820");
}

