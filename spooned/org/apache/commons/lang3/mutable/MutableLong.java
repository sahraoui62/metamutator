package org.apache.commons.lang3.mutable;


public class MutableLong extends java.lang.Number implements java.lang.Comparable<org.apache.commons.lang3.mutable.MutableLong> , org.apache.commons.lang3.mutable.Mutable<java.lang.Number> {
    private static final long serialVersionUID = 62986528375L;

    private long value;

    public MutableLong() {
        super();
    }

    public MutableLong(final long value) {
        super();
        this.value = value;
    }

    public MutableLong(final java.lang.Number value) {
        super();
        this.value = value.longValue();
    }

    public MutableLong(final java.lang.String value) throws java.lang.NumberFormatException {
        super();
        this.value = java.lang.Long.parseLong(value);
    }

    @java.lang.Override
    public java.lang.Long getValue() {
        return java.lang.Long.valueOf(this.value);
    }

    public void setValue(final long value) {
        this.value = value;
    }

    @java.lang.Override
    public void setValue(final java.lang.Number value) {
        this.value = value.longValue();
    }

    public void increment() {
        (value)++;
    }

    public void decrement() {
        (value)--;
    }

    public void add(final long operand) {
        this.value += operand;
    }

    public void add(final java.lang.Number operand) {
        this.value += operand.longValue();
    }

    public void subtract(final long operand) {
        this.value -= operand;
    }

    public void subtract(final java.lang.Number operand) {
        this.value -= operand.longValue();
    }

    @java.lang.Override
    public int intValue() {
        return ((int)(value));
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

    public java.lang.Long toLong() {
        return java.lang.Long.valueOf(longValue());
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj instanceof org.apache.commons.lang3.mutable.MutableLong) {
            return (value) == (((org.apache.commons.lang3.mutable.MutableLong)(obj)).longValue());
        } 
        return false;
    }

    @java.lang.Override
    public int hashCode() {
        return ((int)((value) ^ ((value) >>> 32)));
    }

    @java.lang.Override
    public int compareTo(final org.apache.commons.lang3.mutable.MutableLong other) {
        return org.apache.commons.lang3.math.NumberUtils.compare(this.value, other.value);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return java.lang.String.valueOf(value);
    }
}

