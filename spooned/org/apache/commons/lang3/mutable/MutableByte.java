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
        return ((_returnReplacementOperator788.is("NULL")) ? ( null ) : (java.lang.Byte.valueOf(this.value)));
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
        return ((_returnReplacementOperator782.is("NULL")) ? ( null ) : (value));
    }

    @java.lang.Override
    public int intValue() {
        return ((_returnReplacementOperator787.is("NULL")) ? ( null ) : (value));
    }

    @java.lang.Override
    public long longValue() {
        return ((_returnReplacementOperator791.is("NULL")) ? ( null ) : (value));
    }

    @java.lang.Override
    public float floatValue() {
        return ((_returnReplacementOperator784.is("NULL")) ? ( null ) : (value));
    }

    @java.lang.Override
    public double doubleValue() {
        return ((_returnReplacementOperator783.is("NULL")) ? ( null ) : (value));
    }

    public java.lang.Byte toByte() {
        return ((_returnReplacementOperator789.is("NULL")) ? ( null ) : (java.lang.Byte.valueOf(byteValue())));
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj instanceof org.apache.commons.lang3.mutable.MutableByte) {
            return ((_returnReplacementOperator780.is("NULL")) ? ( null ) : ((value) == (((org.apache.commons.lang3.mutable.MutableByte)(obj)).byteValue())));
        } 
        return ((_returnReplacementOperator781.is("NULL")) ? ( null ) : (false));
    }

    @java.lang.Override
    public int hashCode() {
        return ((_returnReplacementOperator786.is("NULL")) ? ( null ) : (value));
    }

    @java.lang.Override
    public int compareTo(final org.apache.commons.lang3.mutable.MutableByte other) {
        return ((_returnReplacementOperator785.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator785.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator785.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.math.NumberUtils.compare(this.value, other.value)));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperator790.is("NULL")) ? ( null ) : (java.lang.String.valueOf(value)));
    }

    private static final metamutator.Selector _returnReplacementOperator780 = metamutator.Selector.of(780,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableByte.class).id("_returnReplacementOperator780");

    private static final metamutator.Selector _returnReplacementOperator781 = metamutator.Selector.of(781,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableByte.class).id("_returnReplacementOperator781");

    private static final metamutator.Selector _returnReplacementOperator782 = metamutator.Selector.of(782,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableByte.class).id("_returnReplacementOperator782");

    private static final metamutator.Selector _returnReplacementOperator783 = metamutator.Selector.of(783,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableByte.class).id("_returnReplacementOperator783");

    private static final metamutator.Selector _returnReplacementOperator784 = metamutator.Selector.of(784,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableByte.class).id("_returnReplacementOperator784");

    private static final metamutator.Selector _returnReplacementOperator785 = metamutator.Selector.of(785,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.mutable.MutableByte.class).id("_returnReplacementOperator785");

    private static final metamutator.Selector _returnReplacementOperator786 = metamutator.Selector.of(786,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableByte.class).id("_returnReplacementOperator786");

    private static final metamutator.Selector _returnReplacementOperator787 = metamutator.Selector.of(787,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableByte.class).id("_returnReplacementOperator787");

    private static final metamutator.Selector _returnReplacementOperator788 = metamutator.Selector.of(788,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableByte.class).id("_returnReplacementOperator788");

    private static final metamutator.Selector _returnReplacementOperator789 = metamutator.Selector.of(789,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableByte.class).id("_returnReplacementOperator789");

    private static final metamutator.Selector _returnReplacementOperator790 = metamutator.Selector.of(790,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableByte.class).id("_returnReplacementOperator790");

    private static final metamutator.Selector _returnReplacementOperator791 = metamutator.Selector.of(791,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableByte.class).id("_returnReplacementOperator791");
}

