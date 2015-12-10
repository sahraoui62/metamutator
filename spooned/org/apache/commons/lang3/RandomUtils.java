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
        return ((_returnReplacementOperator2891.is("NULL")) ? ( null ) : (result));
    }

    public static int nextInt(final int startInclusive, final int endExclusive) {
        org.apache.commons.lang3.Validate.isTrue((endExclusive >= startInclusive), "Start value must be smaller or equal to end value.");
        org.apache.commons.lang3.Validate.isTrue((startInclusive >= 0), "Both range values must be non-negative.");
        if (startInclusive == endExclusive) {
            return ((_returnReplacementOperator2899.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2899.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2899.is("ZERO")) ? ( 0 ) : (startInclusive));
        } 
        return ((_returnReplacementOperator2900.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2900.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2900.is("ZERO")) ? ( 0 ) : (startInclusive + (org.apache.commons.lang3.RandomUtils.RANDOM.nextInt((endExclusive - startInclusive)))));
    }

    public static int nextInt() {
        return ((_returnReplacementOperator2898.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2898.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2898.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.RandomUtils.nextInt(0, java.lang.Integer.MAX_VALUE)));
    }

    public static long nextLong(final long startInclusive, final long endExclusive) {
        org.apache.commons.lang3.Validate.isTrue((endExclusive >= startInclusive), "Start value must be smaller or equal to end value.");
        org.apache.commons.lang3.Validate.isTrue((startInclusive >= 0), "Both range values must be non-negative.");
        if (startInclusive == endExclusive) {
            return ((_returnReplacementOperator2902.is("NULL")) ? ( null ) : (startInclusive));
        } 
        return ((_returnReplacementOperator2903.is("NULL")) ? ( null ) : (((long)(org.apache.commons.lang3.RandomUtils.nextDouble(startInclusive, endExclusive)))));
    }

    public static long nextLong() {
        return ((_returnReplacementOperator2901.is("NULL")) ? ( null ) : (org.apache.commons.lang3.RandomUtils.nextLong(0, java.lang.Long.MAX_VALUE)));
    }

    public static double nextDouble(final double startInclusive, final double endInclusive) {
        org.apache.commons.lang3.Validate.isTrue((endInclusive >= startInclusive), "Start value must be smaller or equal to end value.");
        org.apache.commons.lang3.Validate.isTrue((startInclusive >= 0), "Both range values must be non-negative.");
        if (startInclusive == endInclusive) {
            return ((_returnReplacementOperator2893.is("NULL")) ? ( null ) : (startInclusive));
        } 
        return ((_returnReplacementOperator2894.is("NULL")) ? ( null ) : (startInclusive + ((endInclusive - startInclusive) * (org.apache.commons.lang3.RandomUtils.RANDOM.nextDouble()))));
    }

    public static double nextDouble() {
        return ((_returnReplacementOperator2892.is("NULL")) ? ( null ) : (org.apache.commons.lang3.RandomUtils.nextDouble(0, java.lang.Double.MAX_VALUE)));
    }

    public static float nextFloat(final float startInclusive, final float endInclusive) {
        org.apache.commons.lang3.Validate.isTrue((endInclusive >= startInclusive), "Start value must be smaller or equal to end value.");
        org.apache.commons.lang3.Validate.isTrue((startInclusive >= 0), "Both range values must be non-negative.");
        if (startInclusive == endInclusive) {
            return ((_returnReplacementOperator2896.is("NULL")) ? ( null ) : (startInclusive));
        } 
        return ((_returnReplacementOperator2897.is("NULL")) ? ( null ) : (startInclusive + ((endInclusive - startInclusive) * (org.apache.commons.lang3.RandomUtils.RANDOM.nextFloat()))));
    }

    public static float nextFloat() {
        return ((_returnReplacementOperator2895.is("NULL")) ? ( null ) : (org.apache.commons.lang3.RandomUtils.nextFloat(0, java.lang.Float.MAX_VALUE)));
    }

    private static final metamutator.Selector _returnReplacementOperator2891 = metamutator.Selector.of(2891,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.RandomUtils.class).id("_returnReplacementOperator2891");

    private static final metamutator.Selector _returnReplacementOperator2892 = metamutator.Selector.of(2892,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.RandomUtils.class).id("_returnReplacementOperator2892");

    private static final metamutator.Selector _returnReplacementOperator2893 = metamutator.Selector.of(2893,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.RandomUtils.class).id("_returnReplacementOperator2893");

    private static final metamutator.Selector _returnReplacementOperator2894 = metamutator.Selector.of(2894,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.RandomUtils.class).id("_returnReplacementOperator2894");

    private static final metamutator.Selector _returnReplacementOperator2895 = metamutator.Selector.of(2895,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.RandomUtils.class).id("_returnReplacementOperator2895");

    private static final metamutator.Selector _returnReplacementOperator2896 = metamutator.Selector.of(2896,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.RandomUtils.class).id("_returnReplacementOperator2896");

    private static final metamutator.Selector _returnReplacementOperator2897 = metamutator.Selector.of(2897,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.RandomUtils.class).id("_returnReplacementOperator2897");

    private static final metamutator.Selector _returnReplacementOperator2898 = metamutator.Selector.of(2898,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.RandomUtils.class).id("_returnReplacementOperator2898");

    private static final metamutator.Selector _returnReplacementOperator2899 = metamutator.Selector.of(2899,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.RandomUtils.class).id("_returnReplacementOperator2899");

    private static final metamutator.Selector _returnReplacementOperator2900 = metamutator.Selector.of(2900,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.RandomUtils.class).id("_returnReplacementOperator2900");

    private static final metamutator.Selector _returnReplacementOperator2901 = metamutator.Selector.of(2901,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.RandomUtils.class).id("_returnReplacementOperator2901");

    private static final metamutator.Selector _returnReplacementOperator2902 = metamutator.Selector.of(2902,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.RandomUtils.class).id("_returnReplacementOperator2902");

    private static final metamutator.Selector _returnReplacementOperator2903 = metamutator.Selector.of(2903,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.RandomUtils.class).id("_returnReplacementOperator2903");
}

