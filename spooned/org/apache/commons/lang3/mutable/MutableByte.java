package org.apache.commons.lang3.mutable;


public class MutableByte extends java.lang.Number implements java.lang.Comparable<org.apache.commons.lang3.mutable.MutableByte> , org.apache.commons.lang3.mutable.Mutable<java.lang.Number> {
    private static final long serialVersionUID = -1585823265L;

    private byte value;

    public MutableByte() {
        super();
    }

    public MutableByte(final byte value) {
        super();
        this.value = value;
    }

    public MutableByte(final java.lang.Number value) {
        super();
        this.value = value.byteValue();
    }

    public MutableByte(final java.lang.String value) throws java.lang.NumberFormatException {
        super();
        this.value = java.lang.Byte.parseByte(value);
    }

    @java.lang.Override
    public java.lang.Byte getValue() {
        return java.lang.Byte.valueOf(this.value);
    }

    public void setValue(final byte value) {
        this.value = value;
    }

    @java.lang.Override
    public void setValue(final java.lang.Number value) {
        this.value = value.byteValue();
    }

    public void increment() {
        (value)++;
    }

    public void decrement() {
        (value)--;
    }

    public void add(final byte operand) {
        this.value += operand;
    }

    public void add(final java.lang.Number operand) {
        this.value += operand.byteValue();
    }

    public void subtract(final byte operand) {
        this.value -= operand;
    }

    public void subtract(final java.lang.Number operand) {
        this.value -= operand.byteValue();
    }

    @java.lang.Override
    public byte byteValue() {
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

    public java.lang.Byte toByte() {
        return java.lang.Byte.valueOf(byteValue());
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj instanceof org.apache.commons.lang3.mutable.MutableByte) {
            return (value) == (((org.apache.commons.lang3.mutable.MutableByte)(obj)).byteValue());
        } 
        return false;
    }

    @java.lang.Override
    public int hashCode() {
        return value;
    }

    @java.lang.Override
    public int compareTo(final org.apache.commons.lang3.mutable.MutableByte other) {
        return org.apache.commons.lang3.math.NumberUtils.compare(this.value, other.value);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return java.lang.String.valueOf(value);
    }
}

