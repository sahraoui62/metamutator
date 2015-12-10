package org.apache.commons.lang3.mutable;


public class MutableDouble extends java.lang.Number implements java.lang.Comparable<org.apache.commons.lang3.mutable.MutableDouble> , org.apache.commons.lang3.mutable.Mutable<java.lang.Number> {
    private static final long serialVersionUID = 1587163916L;

    private double value;

    public MutableDouble() {
        super();
    }

    public MutableDouble(final double value) {
        super();
        this.value = value;
    }

    public MutableDouble(final java.lang.Number value) {
        super();
        this.value = value.doubleValue();
    }

    public MutableDouble(final java.lang.String value) throws java.lang.NumberFormatException {
        super();
        this.value = java.lang.Double.parseDouble(value);
    }

    @java.lang.Override
    public java.lang.Double getValue() {
        return java.lang.Double.valueOf(this.value);
    }

    public void setValue(final double value) {
        this.value = value;
    }

    @java.lang.Override
    public void setValue(final java.lang.Number value) {
        this.value = value.doubleValue();
    }

    public boolean isNaN() {
        return java.lang.Double.isNaN(value);
    }

    public boolean isInfinite() {
        return java.lang.Double.isInfinite(value);
    }

    public void increment() {
        (value)++;
    }

    public void decrement() {
        (value)--;
    }

    public void add(final double operand) {
        this.value += operand;
    }

    public void add(final java.lang.Number operand) {
        this.value += operand.doubleValue();
    }

    public void subtract(final double operand) {
        this.value -= operand;
    }

    public void subtract(final java.lang.Number operand) {
        this.value -= operand.doubleValue();
    }

    @java.lang.Override
    public int intValue() {
        return ((int)(value));
    }

    @java.lang.Override
    public long longValue() {
        return ((long)(value));
    }

    @java.lang.Override
    public float floatValue() {
        return ((float)(value));
    }

    @java.lang.Override
    public double doubleValue() {
        return value;
    }

    public java.lang.Double toDouble() {
        return java.lang.Double.valueOf(doubleValue());
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        return (obj instanceof org.apache.commons.lang3.mutable.MutableDouble) && ((java.lang.Double.doubleToLongBits(((org.apache.commons.lang3.mutable.MutableDouble)(obj)).value)) == (java.lang.Double.doubleToLongBits(value)));
    }

    @java.lang.Override
    public int hashCode() {
        final long bits = java.lang.Double.doubleToLongBits(value);
        return ((int)(bits ^ (bits >>> 32)));
    }

    @java.lang.Override
    public int compareTo(final org.apache.commons.lang3.mutable.MutableDouble other) {
        return java.lang.Double.compare(this.value, other.value);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return java.lang.String.valueOf(value);
    }
}

