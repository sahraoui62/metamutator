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
        return ((_returnReplacementOperator852.is("NULL")) ? ( null ) : (java.lang.Short.valueOf(this.value)));
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
        return ((_returnReplacementOperator856.is("NULL")) ? ( null ) : (value));
    }

    @java.lang.Override
    public int intValue() {
        return ((_returnReplacementOperator851.is("NULL")) ? ( null ) : (value));
    }

    @java.lang.Override
    public long longValue() {
        return ((_returnReplacementOperator855.is("NULL")) ? ( null ) : (value));
    }

    @java.lang.Override
    public float floatValue() {
        return ((_returnReplacementOperator848.is("NULL")) ? ( null ) : (value));
    }

    @java.lang.Override
    public double doubleValue() {
        return ((_returnReplacementOperator847.is("NULL")) ? ( null ) : (value));
    }

    public java.lang.Short toShort() {
        return ((_returnReplacementOperator853.is("NULL")) ? ( null ) : (java.lang.Short.valueOf(shortValue())));
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj instanceof org.apache.commons.lang3.mutable.MutableShort) {
            return ((_returnReplacementOperator845.is("NULL")) ? ( null ) : ((value) == (((org.apache.commons.lang3.mutable.MutableShort)(obj)).shortValue())));
        } 
        return ((_returnReplacementOperator846.is("NULL")) ? ( null ) : (false));
    }

    @java.lang.Override
    public int hashCode() {
        return ((_returnReplacementOperator850.is("NULL")) ? ( null ) : (value));
    }

    @java.lang.Override
    public int compareTo(final org.apache.commons.lang3.mutable.MutableShort other) {
        return ((_returnReplacementOperator849.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator849.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator849.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.math.NumberUtils.compare(this.value, other.value)));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperator854.is("NULL")) ? ( null ) : (java.lang.String.valueOf(value)));
    }

    private static final metamutator.Selector _returnReplacementOperator845 = metamutator.Selector.of(845,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableShort.class).id("_returnReplacementOperator845");

    private static final metamutator.Selector _returnReplacementOperator846 = metamutator.Selector.of(846,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableShort.class).id("_returnReplacementOperator846");

    private static final metamutator.Selector _returnReplacementOperator847 = metamutator.Selector.of(847,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableShort.class).id("_returnReplacementOperator847");

    private static final metamutator.Selector _returnReplacementOperator848 = metamutator.Selector.of(848,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableShort.class).id("_returnReplacementOperator848");

    private static final metamutator.Selector _returnReplacementOperator849 = metamutator.Selector.of(849,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.mutable.MutableShort.class).id("_returnReplacementOperator849");

    private static final metamutator.Selector _returnReplacementOperator850 = metamutator.Selector.of(850,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableShort.class).id("_returnReplacementOperator850");

    private static final metamutator.Selector _returnReplacementOperator851 = metamutator.Selector.of(851,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableShort.class).id("_returnReplacementOperator851");

    private static final metamutator.Selector _returnReplacementOperator852 = metamutator.Selector.of(852,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableShort.class).id("_returnReplacementOperator852");

    private static final metamutator.Selector _returnReplacementOperator853 = metamutator.Selector.of(853,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableShort.class).id("_returnReplacementOperator853");

    private static final metamutator.Selector _returnReplacementOperator854 = metamutator.Selector.of(854,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableShort.class).id("_returnReplacementOperator854");

    private static final metamutator.Selector _returnReplacementOperator855 = metamutator.Selector.of(855,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableShort.class).id("_returnReplacementOperator855");

    private static final metamutator.Selector _returnReplacementOperator856 = metamutator.Selector.of(856,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableShort.class).id("_returnReplacementOperator856");
}

