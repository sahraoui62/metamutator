package org.apache.commons.lang3.mutable;


public class MutableShort extends java.lang.Number implements java.lang.Comparable<org.apache.commons.lang3.mutable.MutableShort> , org.apache.commons.lang3.mutable.Mutable<java.lang.Number> {
    private static final long serialVersionUID = -2135791679L;

    private short value;

    public MutableShort() {
        super();
    }

    public MutableShort(final short value) {
        super();
        this.value = value;
    }

    public MutableShort(final java.lang.Number value) {
        super();
        this.value = value.shortValue();
    }

    public MutableShort(final java.lang.String value) throws java.lang.NumberFormatException {
        super();
        this.value = java.lang.Short.parseShort(value);
    }

    @java.lang.Override
    public java.lang.Short getValue() {
        return java.lang.Short.valueOf(this.value);
    }

    public void setValue(final short value) {
        this.value = value;
    }

    @java.lang.Override
    public void setValue(final java.lang.Number value) {
        this.value = value.shortValue();
    }

    public void increment() {
        (value)++;
    }

    public void decrement() {
        (value)--;
    }

    public void add(final short operand) {
        this.value += operand;
    }

    public void add(final java.lang.Number operand) {
        this.value += operand.shortValue();
    }

    public void subtract(final short operand) {
        this.value -= operand;
    }

    public void subtract(final java.lang.Number operand) {
        this.value -= operand.shortValue();
    }

    @java.lang.Override
    public short shortValue() {
        return value;
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

    public java.lang.Short toShort() {
        return java.lang.Short.valueOf(shortValue());
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj instanceof org.apache.commons.lang3.mutable.MutableShort) {
            return (value) == (((org.apache.commons.lang3.mutable.MutableShort)(obj)).shortValue());
        } 
        return false;
    }

    @java.lang.Override
    public int hashCode() {
        return value;
    }

    @java.lang.Override
    public int compareTo(final org.apache.commons.lang3.mutable.MutableShort other) {
        return org.apache.commons.lang3.math.NumberUtils.compare(this.value, other.value);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return java.lang.String.valueOf(value);
    }
}

