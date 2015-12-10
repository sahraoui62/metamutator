package org.apache.commons.lang3;


public class RandomUtils {
    private static final java.util.Random RANDOM = new java.util.Random();

    public RandomUtils() {
        super();
    }

    public static byte[] nextBytes(final int count) {
        org.apache.commons.lang3.Validate.isTrue((count >= 0), "Count cannot be negative.");
        final byte[] result = new byte[count];
        RANDOM.nextBytes(result);
        return ((_returnReplacementOperatorHotSpot2891.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static int nextInt(final int startInclusive, final int endExclusive) {
        org.apache.commons.lang3.Validate.isTrue((endExclusive >= startInclusive), "Start value must be smaller or equal to end value.");
        org.apache.commons.lang3.Validate.isTrue((startInclusive >= 0), "Both range values must be non-negative.");
        if (startInclusive == endExclusive) {
            return ((_returnReplacementOperatorHotSpot2899.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2899.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2899.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (startInclusive));
        } 
        return ((_returnReplacementOperatorHotSpot2900.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2900.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2900.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (startInclusive + (org.apache.commons.lang3.RandomUtils.RANDOM.nextInt((endExclusive - startInclusive)))));
    }

    public static int nextInt() {
        return ((_returnReplacementOperatorHotSpot2898.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2898.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2898.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.RandomUtils.nextInt(0, java.lang.Integer.MAX_VALUE)));
    }

    public static long nextLong(final long startInclusive, final long endExclusive) {
        org.apache.commons.lang3.Validate.isTrue((endExclusive >= startInclusive), "Start value must be smaller or equal to end value.");
        org.apache.commons.lang3.Validate.isTrue((startInclusive >= 0), "Both range values must be non-negative.");
        if (startInclusive == endExclusive) {
            return ((_returnReplacementOperatorHotSpot2902.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (startInclusive));
        } 
        return ((_returnReplacementOperatorHotSpot2903.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((long)(org.apache.commons.lang3.RandomUtils.nextDouble(startInclusive, endExclusive)))));
    }

    public static long nextLong() {
        return ((_returnReplacementOperatorHotSpot2901.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.RandomUtils.nextLong(0, java.lang.Long.MAX_VALUE)));
    }

    public static double nextDouble(final double startInclusive, final double endInclusive) {
        org.apache.commons.lang3.Validate.isTrue((endInclusive >= startInclusive), "Start value must be smaller or equal to end value.");
        org.apache.commons.lang3.Validate.isTrue((startInclusive >= 0), "Both range values must be non-negative.");
        if (startInclusive == endInclusive) {
            return ((_returnReplacementOperatorHotSpot2893.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (startInclusive));
        } 
        return ((_returnReplacementOperatorHotSpot2894.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (startInclusive + ((endInclusive - startInclusive) * (org.apache.commons.lang3.RandomUtils.RANDOM.nextDouble()))));
    }

    public static double nextDouble() {
        return ((_returnReplacementOperatorHotSpot2892.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.RandomUtils.nextDouble(0, java.lang.Double.MAX_VALUE)));
    }

    public static float nextFloat(final float startInclusive, final float endInclusive) {
        org.apache.commons.lang3.Validate.isTrue((endInclusive >= startInclusive), "Start value must be smaller or equal to end value.");
        org.apache.commons.lang3.Validate.isTrue((startInclusive >= 0), "Both range values must be non-negative.");
        if (startInclusive == endInclusive) {
            return ((_returnReplacementOperatorHotSpot2896.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (startInclusive));
        } 
        return ((_returnReplacementOperatorHotSpot2897.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (startInclusive + ((endInclusive - startInclusive) * (org.apache.commons.lang3.RandomUtils.RANDOM.nextFloat()))));
    }

    public static float nextFloat() {
        return ((_returnReplacementOperatorHotSpot2895.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.RandomUtils.nextFloat(0, java.lang.Float.MAX_VALUE)));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2891 = metamutator.Selector.of(2891,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.RandomUtils.class).id("_returnReplacementOperatorHotSpot2891");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2892 = metamutator.Selector.of(2892,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.RandomUtils.class).id("_returnReplacementOperatorHotSpot2892");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2893 = metamutator.Selector.of(2893,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.RandomUtils.class).id("_returnReplacementOperatorHotSpot2893");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2894 = metamutator.Selector.of(2894,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.RandomUtils.class).id("_returnReplacementOperatorHotSpot2894");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2895 = metamutator.Selector.of(2895,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.RandomUtils.class).id("_returnReplacementOperatorHotSpot2895");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2896 = metamutator.Selector.of(2896,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.RandomUtils.class).id("_returnReplacementOperatorHotSpot2896");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2897 = metamutator.Selector.of(2897,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.RandomUtils.class).id("_returnReplacementOperatorHotSpot2897");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2898 = metamutator.Selector.of(2898,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.RandomUtils.class).id("_returnReplacementOperatorHotSpot2898");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2899 = metamutator.Selector.of(2899,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.RandomUtils.class).id("_returnReplacementOperatorHotSpot2899");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2900 = metamutator.Selector.of(2900,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.RandomUtils.class).id("_returnReplacementOperatorHotSpot2900");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2901 = metamutator.Selector.of(2901,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.RandomUtils.class).id("_returnReplacementOperatorHotSpot2901");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2902 = metamutator.Selector.of(2902,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.RandomUtils.class).id("_returnReplacementOperatorHotSpot2902");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2903 = metamutator.Selector.of(2903,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.RandomUtils.class).id("_returnReplacementOperatorHotSpot2903");
}

