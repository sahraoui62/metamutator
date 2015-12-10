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
        return ((_returnReplacementOperator644.is("NULL")) ? ( null ) : (min));
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
        return ((_returnReplacementOperator654.is("NULL")) ? ( null ) : (min));
    }

    public static double min(final double a, final double b, final double c) {
        return ((_returnReplacementOperator643.is("NULL")) ? ( null ) : (org.apache.commons.lang3.math.IEEE754rUtils.min(org.apache.commons.lang3.math.IEEE754rUtils.min(a, b), c)));
    }

    public static double min(final double a, final double b) {
        if (java.lang.Double.isNaN(a)) {
            return ((_returnReplacementOperator640.is("NULL")) ? ( null ) : (b));
        } else if (java.lang.Double.isNaN(b)) {
            return ((_returnReplacementOperator641.is("NULL")) ? ( null ) : (a));
        } else {
            return ((_returnReplacementOperator642.is("NULL")) ? ( null ) : (java.lang.Math.min(a, b)));
        }
    }

    public static float min(final float a, final float b, final float c) {
        return ((_returnReplacementOperator653.is("NULL")) ? ( null ) : (org.apache.commons.lang3.math.IEEE754rUtils.min(org.apache.commons.lang3.math.IEEE754rUtils.min(a, b), c)));
    }

    public static float min(final float a, final float b) {
        if (java.lang.Float.isNaN(a)) {
            return ((_returnReplacementOperator650.is("NULL")) ? ( null ) : (b));
        } else if (java.lang.Float.isNaN(b)) {
            return ((_returnReplacementOperator651.is("NULL")) ? ( null ) : (a));
        } else {
            return ((_returnReplacementOperator652.is("NULL")) ? ( null ) : (java.lang.Math.min(a, b)));
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
        return ((_returnReplacementOperator639.is("NULL")) ? ( null ) : (max));
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
        return ((_returnReplacementOperator649.is("NULL")) ? ( null ) : (max));
    }

    public static double max(final double a, final double b, final double c) {
        return ((_returnReplacementOperator638.is("NULL")) ? ( null ) : (org.apache.commons.lang3.math.IEEE754rUtils.max(org.apache.commons.lang3.math.IEEE754rUtils.max(a, b), c)));
    }

    public static double max(final double a, final double b) {
        if (java.lang.Double.isNaN(a)) {
            return ((_returnReplacementOperator635.is("NULL")) ? ( null ) : (b));
        } else if (java.lang.Double.isNaN(b)) {
            return ((_returnReplacementOperator636.is("NULL")) ? ( null ) : (a));
        } else {
            return ((_returnReplacementOperator637.is("NULL")) ? ( null ) : (java.lang.Math.max(a, b)));
        }
    }

    public static float max(final float a, final float b, final float c) {
        return ((_returnReplacementOperator648.is("NULL")) ? ( null ) : (org.apache.commons.lang3.math.IEEE754rUtils.max(org.apache.commons.lang3.math.IEEE754rUtils.max(a, b), c)));
    }

    public static float max(final float a, final float b) {
        if (java.lang.Float.isNaN(a)) {
            return ((_returnReplacementOperator645.is("NULL")) ? ( null ) : (b));
        } else if (java.lang.Float.isNaN(b)) {
            return ((_returnReplacementOperator646.is("NULL")) ? ( null ) : (a));
        } else {
            return ((_returnReplacementOperator647.is("NULL")) ? ( null ) : (java.lang.Math.max(a, b)));
        }
    }

    private static final metamutator.Selector _returnReplacementOperator635 = metamutator.Selector.of(635,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperator635");

    private static final metamutator.Selector _returnReplacementOperator636 = metamutator.Selector.of(636,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperator636");

    private static final metamutator.Selector _returnReplacementOperator637 = metamutator.Selector.of(637,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperator637");

    private static final metamutator.Selector _returnReplacementOperator638 = metamutator.Selector.of(638,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperator638");

    private static final metamutator.Selector _returnReplacementOperator639 = metamutator.Selector.of(639,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperator639");

    private static final metamutator.Selector _returnReplacementOperator640 = metamutator.Selector.of(640,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperator640");

    private static final metamutator.Selector _returnReplacementOperator641 = metamutator.Selector.of(641,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperator641");

    private static final metamutator.Selector _returnReplacementOperator642 = metamutator.Selector.of(642,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperator642");

    private static final metamutator.Selector _returnReplacementOperator643 = metamutator.Selector.of(643,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperator643");

    private static final metamutator.Selector _returnReplacementOperator644 = metamutator.Selector.of(644,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperator644");

    private static final metamutator.Selector _returnReplacementOperator645 = metamutator.Selector.of(645,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperator645");

    private static final metamutator.Selector _returnReplacementOperator646 = metamutator.Selector.of(646,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperator646");

    private static final metamutator.Selector _returnReplacementOperator647 = metamutator.Selector.of(647,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperator647");

    private static final metamutator.Selector _returnReplacementOperator648 = metamutator.Selector.of(648,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperator648");

    private static final metamutator.Selector _returnReplacementOperator649 = metamutator.Selector.of(649,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperator649");

    private static final metamutator.Selector _returnReplacementOperator650 = metamutator.Selector.of(650,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperator650");

    private static final metamutator.Selector _returnReplacementOperator651 = metamutator.Selector.of(651,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperator651");

    private static final metamutator.Selector _returnReplacementOperator652 = metamutator.Selector.of(652,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperator652");

    private static final metamutator.Selector _returnReplacementOperator653 = metamutator.Selector.of(653,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperator653");

    private static final metamutator.Selector _returnReplacementOperator654 = metamutator.Selector.of(654,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.math.IEEE754rUtils.class).id("_returnReplacementOperator654");
}

