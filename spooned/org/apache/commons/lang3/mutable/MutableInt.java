package org.apache.commons.lang3.mutable;


public class MutableInt extends java.lang.Number implements java.lang.Comparable<org.apache.commons.lang3.mutable.MutableInt> , org.apache.commons.lang3.mutable.Mutable<java.lang.Number> {
    private static final long serialVersionUID = 512176391864L;

    private int value;

    public MutableInt() {
        super();
    }

    public MutableInt(final int value) {
        super();
        this.value = value;
    }

    public MutableInt(final java.lang.Number value) {
        super();
        this.value = value.intValue();
    }

    public MutableInt(final java.lang.String value) throws java.lang.NumberFormatException {
        super();
        this.value = java.lang.Integer.parseInt(value);
    }

    @java.lang.Override
    public java.lang.Integer getValue() {
        return java.lang.Integer.valueOf(this.value);
    }

    public void setValue(final int value) {
        this.value = value;
    }

    @java.lang.Override
    public void setValue(final java.lang.Number value) {
        this.value = value.intValue();
    }

    public void increment() {
        (value)++;
    }

    public void decrement() {
        (value)--;
    }

    public void add(final int operand) {
        this.value += operand;
    }

    public void add(final java.lang.Number operand) {
        this.value += operand.intValue();
    }

    public void subtract(final int operand) {
        this.value -= operand;
    }

    public void subtract(final java.lang.Number operand) {
        this.value -= operand.intValue();
    }

    @java.lang.Override
    public int intValue() {
        return value;
    }

    @java.lang.Override
    public long longValue() {
        return value;
    }

    @java.lang.Override
    public float floatValue() {
        return value;
    }

    @java.lang.Override
    public double doubleValue() {
        return value;
    }

    public java.lang.Integer toInteger() {
        return java.lang.Integer.valueOf(intValue());
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj instanceof org.apache.commons.lang3.mutable.MutableInt) {
            return (value) == (((org.apache.commons.lang3.mutable.MutableInt)(obj)).intValue());
        } 
        return false;
    }

    @java.lang.Override
    public int hashCode() {
        return value;
    }

    @java.lang.Override
    public int compareTo(final org.apache.commons.lang3.mutable.MutableInt other) {
        return org.apache.commons.lang3.math.NumberUtils.compare(this.value, other.value);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return java.lang.String.valueOf(value);
    }
}

