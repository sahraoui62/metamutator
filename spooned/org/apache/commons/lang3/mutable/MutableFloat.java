package org.apache.commons.lang3.mutable;


public class MutableFloat extends java.lang.Number implements java.lang.Comparable<org.apache.commons.lang3.mutable.MutableFloat> , org.apache.commons.lang3.mutable.Mutable<java.lang.Number> {
    private static final long serialVersionUID = 5787169186L;

    private float value;

    public MutableFloat() {
        super();
    }

    public MutableFloat(final float value) {
        super();
        this.value = value;
    }

    public MutableFloat(final java.lang.Number value) {
        super();
        this.value = value.floatValue();
    }

    public MutableFloat(final java.lang.String value) throws java.lang.NumberFormatException {
        super();
        this.value = java.lang.Float.parseFloat(value);
    }

    @java.lang.Override
    public java.lang.Float getValue() {
        return ((_returnReplacementOperator812.is("NULL")) ? ( null ) : (java.lang.Float.valueOf(this.value)));
    }

    public void setValue(final float value) {
        this.value = value;
    }

    @java.lang.Override
    public void setValue(final java.lang.Number value) {
        this.value = value.floatValue();
    }

    public boolean isNaN() {
        return ((_returnReplacementOperator806.is("NULL")) ? ( null ) : (java.lang.Float.isNaN(value)));
    }

    public boolean isInfinite() {
        return ((_returnReplacementOperator805.is("NULL")) ? ( null ) : (java.lang.Float.isInfinite(value)));
    }

    public void increment() {
        (value)++;
    }

    public void decrement() {
        (value)--;
    }

    public void add(final float operand) {
        this.value += operand;
    }

    public void add(final java.lang.Number operand) {
        this.value += operand.floatValue();
    }

    public void subtract(final float operand) {
        this.value -= operand;
    }

    public void subtract(final java.lang.Number operand) {
        this.value -= operand.floatValue();
    }

    @java.lang.Override
    public int intValue() {
        return ((_returnReplacementOperator811.is("NULL")) ? ( null ) : (((int)(value))));
    }

    @java.lang.Override
    public long longValue() {
        return ((_returnReplacementOperator815.is("NULL")) ? ( null ) : (((long)(value))));
    }

    @java.lang.Override
    public float floatValue() {
        return ((_returnReplacementOperator808.is("NULL")) ? ( null ) : (value));
    }

    @java.lang.Override
    public double doubleValue() {
        return ((_returnReplacementOperator807.is("NULL")) ? ( null ) : (value));
    }

    public java.lang.Float toFloat() {
        return ((_returnReplacementOperator813.is("NULL")) ? ( null ) : (java.lang.Float.valueOf(floatValue())));
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        return ((_returnReplacementOperator804.is("NULL")) ? ( null ) : ((obj instanceof org.apache.commons.lang3.mutable.MutableFloat) && ((java.lang.Float.floatToIntBits(((org.apache.commons.lang3.mutable.MutableFloat)(obj)).value)) == (java.lang.Float.floatToIntBits(value)))));
    }

    @java.lang.Override
    public int hashCode() {
        return ((_returnReplacementOperator810.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator810.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator810.is("ZERO")) ? ( 0 ) : (java.lang.Float.floatToIntBits(value)));
    }

    @java.lang.Override
    public int compareTo(final org.apache.commons.lang3.mutable.MutableFloat other) {
        return ((_returnReplacementOperator809.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator809.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator809.is("ZERO")) ? ( 0 ) : (java.lang.Float.compare(this.value, other.value)));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperator814.is("NULL")) ? ( null ) : (java.lang.String.valueOf(value)));
    }

    private static final metamutator.Selector _returnReplacementOperator804 = metamutator.Selector.of(804,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableFloat.class).id("_returnReplacementOperator804");

    private static final metamutator.Selector _returnReplacementOperator805 = metamutator.Selector.of(805,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableFloat.class).id("_returnReplacementOperator805");

    private static final metamutator.Selector _returnReplacementOperator806 = metamutator.Selector.of(806,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableFloat.class).id("_returnReplacementOperator806");

    private static final metamutator.Selector _returnReplacementOperator807 = metamutator.Selector.of(807,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableFloat.class).id("_returnReplacementOperator807");

    private static final metamutator.Selector _returnReplacementOperator808 = metamutator.Selector.of(808,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableFloat.class).id("_returnReplacementOperator808");

    private static final metamutator.Selector _returnReplacementOperator809 = metamutator.Selector.of(809,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.mutable.MutableFloat.class).id("_returnReplacementOperator809");

    private static final metamutator.Selector _returnReplacementOperator810 = metamutator.Selector.of(810,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.mutable.MutableFloat.class).id("_returnReplacementOperator810");

    private static final metamutator.Selector _returnReplacementOperator811 = metamutator.Selector.of(811,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableFloat.class).id("_returnReplacementOperator811");

    private static final metamutator.Selector _returnReplacementOperator812 = metamutator.Selector.of(812,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableFloat.class).id("_returnReplacementOperator812");

    private static final metamutator.Selector _returnReplacementOperator813 = metamutator.Selector.of(813,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableFloat.class).id("_returnReplacementOperator813");

    private static final metamutator.Selector _returnReplacementOperator814 = metamutator.Selector.of(814,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableFloat.class).id("_returnReplacementOperator814");

    private static final metamutator.Selector _returnReplacementOperator815 = metamutator.Selector.of(815,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableFloat.class).id("_returnReplacementOperator815");
}

