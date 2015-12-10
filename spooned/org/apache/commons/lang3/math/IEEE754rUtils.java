package org.apache.commons.lang3.math;


public class IEEE754rUtils {
    public static double min(final double... array) {
        if (array == null) {
            throw new java.lang.IllegalArgumentException("The Array must not be null");
        } 
        org.apache.commons.lang3.Validate.isTrue(((array.length) != 0), "Array cannot be empty.");
        double min = array[0];
        for (int i = 1 ; i < (array.length) ; i++) {
            min = org.apache.commons.lang3.math.IEEE754rUtils.min(array[i], min);
        }
        return ((_returnReplacementOperatorHotSpot644.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (min));
    }

    public static float min(final float... array) {
        if (array == null) {
            throw new java.lang.IllegalArgumentException("The Array must not be null");
        } 
        org.apache.commons.lang3.Validate.isTrue(((array.length) != 0), "Array cannot be empty.");
        float min = array[0];
        for (int i = 1 ; i < (array.length) ; i++) {
            min = org.apache.commons.lang3.math.IEEE754rUtils.min(array[i], min);
        }
        return ((_returnReplacementOperatorHotSpot654.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (min));
    }

    public static double min(final double a, final double b, final double c) {
        return ((_returnReplacementOperatorHotSpot643.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.math.IEEE754rUtils.min(org.apache.commons.lang3.math.IEEE754rUtils.min(a, b), c)));
    }

    public static double min(final double a, final double b) {
        if (java.lang.Double.isNaN(a)) {
            return ((_returnReplacementOperatorHotSpot640.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (b));
        } else if (java.lang.Double.isNaN(b)) {
            return ((_returnReplacementOperatorHotSpot641.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (a));
        } else {
            return ((_returnReplacementOperatorHotSpot642.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Math.min(a, b)));
        }
    }

    public static float min(final float a, final float b, final float c) {
        return ((_returnReplacementOperatorHotSpot653.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.math.IEEE754rUtils.min(org.apache.commons.lang3.math.IEEE754rUtils.min(a, b), c)));
    }

    public static float min(final float a, final float b) {
        if (java.lang.Float.isNaN(a)) {
            return ((_returnReplacementOperatorHotSpot650.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (b));
        } else if (java.lang.Float.isNaN(b)) {
            return ((_returnReplacementOperatorHotSpot651.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (a));
        } else {
            return ((_returnReplacementOperatorHotSpot652.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Math.min(a, b)));
        }
    }

    public static double max(final double... array) {
        if (array == null) {
            throw new java.lang.IllegalArgumentException("The Array must not be null");
        } 
        org.apache.commons.lang3.Validate.isTrue(((array.length) != 0), "Array cannot be empty.");
        double max = array[0];
        for (int j = 1 ; j < (array.length) ; j++) {
            max = org.apache.commons.lang3.math.IEEE754rUtils.max(array[j], max);
        }
        return ((_returnReplacementOperatorHotSpot639.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (max));
    }

    public static float max(final float... array) {
        if (array == null) {
            throw new java.lang.IllegalArgumentException("The Array must not be null");
        } 
        org.apache.commons.lang3.Validate.isTrue(((array.length) != 0), "Array cannot be empty.");
        float max = array[0];
        for (int j = 1 ; j < (array.length) ; j++) {
            max = org.apache.commons.lang3.math.IEEE754rUtils.max(array[j], max);
        }
        return ((_returnReplacementOperatorHotSpot649.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (max));
    }

    public static double max(final double a, final double b, final double c) {
        return ((_returnReplacementOperatorHotSpot638.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.math.IEEE754rUtils.max(org.apache.commons.lang3.math.IEEE754rUtils.max(a, b), c)));
    }

    public static double max(final double a, final double b) {
        if (java.lang.Double.isNaN(a)) {
            return ((_returnReplacementOperatorHotSpot635.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (b));
        } else if (java.lang.Double.isNaN(b)) {
            return ((_returnReplacementOperatorHotSpot636.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (a));
        } else {
            return ((_returnReplacementOperatorHotSpot637.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Math.max(a, b)));
        }
    }

    public static float max(final float a, final float b, final float c) {
        return ((_returnReplacementOperatorHotSpot648.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.math.IEEE754rUtils.max(org.apache.commons.lang3.math.IEEE754rUtils.max(a, b), c)));
    }

    public static float max(final float a, final float b) {
        if (java.lang.Float.isNaN(a)) {
            return ((_returnReplacementOperatorHotSpot645.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (b));
        } else if (java.lang.Float.isNaN(b)) {
            return ((_returnReplacementOperatorHotSpot646.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (a));
        } else {
            return ((_returnReplacementOperatorHotSpot647.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Math.max(a, b)));
        }
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot635 = metamutator.Selector.of(635,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperatorHotSpot635");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot636 = metamutator.Selector.of(636,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperatorHotSpot636");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot637 = metamutator.Selector.of(637,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperatorHotSpot637");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot638 = metamutator.Selector.of(638,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperatorHotSpot638");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot639 = metamutator.Selector.of(639,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperatorHotSpot639");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot640 = metamutator.Selector.of(640,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperatorHotSpot640");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot641 = metamutator.Selector.of(641,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperatorHotSpot641");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot642 = metamutator.Selector.of(642,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperatorHotSpot642");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot643 = metamutator.Selector.of(643,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperatorHotSpot643");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot644 = metamutator.Selector.of(644,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperatorHotSpot644");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot645 = metamutator.Selector.of(645,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperatorHotSpot645");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot646 = metamutator.Selector.of(646,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperatorHotSpot646");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot647 = metamutator.Selector.of(647,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperatorHotSpot647");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot648 = metamutator.Selector.of(648,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperatorHotSpot648");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot649 = metamutator.Selector.of(649,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperatorHotSpot649");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot650 = metamutator.Selector.of(650,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperatorHotSpot650");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot651 = metamutator.Selector.of(651,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperatorHotSpot651");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot652 = metamutator.Selector.of(652,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperatorHotSpot652");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot653 = metamutator.Selector.of(653,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperatorHotSpot653");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot654 = metamutator.Selector.of(654,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperatorHotSpot654");
}

