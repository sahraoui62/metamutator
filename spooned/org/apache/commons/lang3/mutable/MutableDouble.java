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
        return ((_returnReplacementOperator800.is("NULL")) ? ( null ) : (java.lang.Double.valueOf(this.value)));
    }

    public void setValue(final double value) {
        this.value = value;
    }

    @java.lang.Override
    public void setValue(final java.lang.Number value) {
        this.value = value.doubleValue();
    }

    public boolean isNaN() {
        return ((_returnReplacementOperator794.is("NULL")) ? ( null ) : (java.lang.Double.isNaN(value)));
    }

    public boolean isInfinite() {
        return ((_returnReplacementOperator793.is("NULL")) ? ( null ) : (java.lang.Double.isInfinite(value)));
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
        return ((_returnReplacementOperator799.is("NULL")) ? ( null ) : (((int)(value))));
    }

    @java.lang.Override
    public long longValue() {
        return ((_returnReplacementOperator803.is("NULL")) ? ( null ) : (((long)(value))));
    }

    @java.lang.Override
    public float floatValue() {
        return ((_returnReplacementOperator796.is("NULL")) ? ( null ) : (((float)(value))));
    }

    @java.lang.Override
    public double doubleValue() {
        return ((_returnReplacementOperator795.is("NULL")) ? ( null ) : (value));
    }

    public java.lang.Double toDouble() {
        return ((_returnReplacementOperator801.is("NULL")) ? ( null ) : (java.lang.Double.valueOf(doubleValue())));
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        return ((_returnReplacementOperator792.is("NULL")) ? ( null ) : ((obj instanceof org.apache.commons.lang3.mutable.MutableDouble) && ((java.lang.Double.doubleToLongBits(((org.apache.commons.lang3.mutable.MutableDouble)(obj)).value)) == (java.lang.Double.doubleToLongBits(value)))));
    }

    @java.lang.Override
    public int hashCode() {
        final long bits = java.lang.Double.doubleToLongBits(value);
        return ((_returnReplacementOperator798.is("NULL")) ? ( null ) : (((int)(bits ^ (bits >>> 32)))));
    }

    @java.lang.Override
    public int compareTo(final org.apache.commons.lang3.mutable.MutableDouble other) {
        return ((_returnReplacementOperator797.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator797.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator797.is("ZERO")) ? ( 0 ) : (java.lang.Double.compare(this.value, other.value)));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperator802.is("NULL")) ? ( null ) : (java.lang.String.valueOf(value)));
    }

    private static final metamutator.Selector _returnReplacementOperator792 = metamutator.Selector.of(792,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableDouble.class).id("_returnReplacementOperator792");

    private static final metamutator.Selector _returnReplacementOperator793 = metamutator.Selector.of(793,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableDouble.class).id("_returnReplacementOperator793");

    private static final metamutator.Selector _returnReplacementOperator794 = metamutator.Selector.of(794,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableDouble.class).id("_returnReplacementOperator794");

    private static final metamutator.Selector _returnReplacementOperator795 = metamutator.Selector.of(795,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableDouble.class).id("_returnReplacementOperator795");

    private static final metamutator.Selector _returnReplacementOperator796 = metamutator.Selector.of(796,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableDouble.class).id("_returnReplacementOperator796");

    private static final metamutator.Selector _returnReplacementOperator797 = metamutator.Selector.of(797,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.mutable.MutableDouble.class).id("_returnReplacementOperator797");

    private static final metamutator.Selector _returnReplacementOperator798 = metamutator.Selector.of(798,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableDouble.class).id("_returnReplacementOperator798");

    private static final metamutator.Selector _returnReplacementOperator799 = metamutator.Selector.of(799,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableDouble.class).id("_returnReplacementOperator799");

    private static final metamutator.Selector _returnReplacementOperator800 = metamutator.Selector.of(800,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableDouble.class).id("_returnReplacementOperator800");

    private static final metamutator.Selector _returnReplacementOperator801 = metamutator.Selector.of(801,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableDouble.class).id("_returnReplacementOperator801");

    private static final metamutator.Selector _returnReplacementOperator802 = metamutator.Selector.of(802,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableDouble.class).id("_returnReplacementOperator802");

    private static final metamutator.Selector _returnReplacementOperator803 = metamutator.Selector.of(803,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableDouble.class).id("_returnReplacementOperator803");
}

