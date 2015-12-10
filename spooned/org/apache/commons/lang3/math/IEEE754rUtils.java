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
        return min;
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
        return min;
    }

    public static double min(final double a, final double b, final double c) {
        return org.apache.commons.lang3.math.IEEE754rUtils.min(org.apache.commons.lang3.math.IEEE754rUtils.min(a, b), c);
    }

    public static double min(final double a, final double b) {
        if (java.lang.Double.isNaN(a)) {
            return b;
        } else if (java.lang.Double.isNaN(b)) {
            return a;
        } else {
            return java.lang.Math.min(a, b);
        }
    }

    public static float min(final float a, final float b, final float c) {
        return org.apache.commons.lang3.math.IEEE754rUtils.min(org.apache.commons.lang3.math.IEEE754rUtils.min(a, b), c);
    }

    public static float min(final float a, final float b) {
        if (java.lang.Float.isNaN(a)) {
            return b;
        } else if (java.lang.Float.isNaN(b)) {
            return a;
        } else {
            return java.lang.Math.min(a, b);
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
        return max;
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
        return max;
    }

    public static double max(final double a, final double b, final double c) {
        return org.apache.commons.lang3.math.IEEE754rUtils.max(org.apache.commons.lang3.math.IEEE754rUtils.max(a, b), c);
    }

    public static double max(final double a, final double b) {
        if (java.lang.Double.isNaN(a)) {
            return b;
        } else if (java.lang.Double.isNaN(b)) {
            return a;
        } else {
            return java.lang.Math.max(a, b);
        }
    }

    public static float max(final float a, final float b, final float c) {
        return org.apache.commons.lang3.math.IEEE754rUtils.max(org.apache.commons.lang3.math.IEEE754rUtils.max(a, b), c);
    }

    public static float max(final float a, final float b) {
        if (java.lang.Float.isNaN(a)) {
            return b;
        } else if (java.lang.Float.isNaN(b)) {
            return a;
        } else {
            return java.lang.Math.max(a, b);
        }
    }
}

