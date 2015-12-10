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
        return ((_returnReplacementOperatorHotSpot812.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Float.valueOf(this.value)));
    }

    public void setValue(final float value) {
        this.value = value;
    }

    @java.lang.Override
    public void setValue(final java.lang.Number value) {
        this.value = value.floatValue();
    }

    public boolean isNaN() {
        return ((_returnReplacementOperatorHotSpot806.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Float.isNaN(value)));
    }

    public boolean isInfinite() {
        return ((_returnReplacementOperatorHotSpot805.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Float.isInfinite(value)));
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
        return ((_returnReplacementOperatorHotSpot811.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((int)(value))));
    }

    @java.lang.Override
    public long longValue() {
        return ((_returnReplacementOperatorHotSpot815.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((long)(value))));
    }

    @java.lang.Override
    public float floatValue() {
        return ((_returnReplacementOperatorHotSpot808.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (value));
    }

    @java.lang.Override
    public double doubleValue() {
        return ((_returnReplacementOperatorHotSpot807.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (value));
    }

    public java.lang.Float toFloat() {
        return ((_returnReplacementOperatorHotSpot813.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Float.valueOf(floatValue())));
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        return ((_returnReplacementOperatorHotSpot804.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((obj instanceof org.apache.commons.lang3.mutable.MutableFloat) && ((java.lang.Float.floatToIntBits(((org.apache.commons.lang3.mutable.MutableFloat)(obj)).value)) == (java.lang.Float.floatToIntBits(value)))));
    }

    @java.lang.Override
    public int hashCode() {
        return ((_returnReplacementOperatorHotSpot810.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot810.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot810.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (java.lang.Float.floatToIntBits(value)));
    }

    @java.lang.Override
    public int compareTo(final org.apache.commons.lang3.mutable.MutableFloat other) {
        return ((_returnReplacementOperatorHotSpot809.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot809.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot809.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (java.lang.Float.compare(this.value, other.value)));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperatorHotSpot814.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.String.valueOf(value)));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot804 = metamutator.Selector.of(804,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableFloat.class).id("_returnReplacementOperatorHotSpot804");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot805 = metamutator.Selector.of(805,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableFloat.class).id("_returnReplacementOperatorHotSpot805");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot806 = metamutator.Selector.of(806,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableFloat.class).id("_returnReplacementOperatorHotSpot806");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot807 = metamutator.Selector.of(807,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableFloat.class).id("_returnReplacementOperatorHotSpot807");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot808 = metamutator.Selector.of(808,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableFloat.class).id("_returnReplacementOperatorHotSpot808");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot809 = metamutator.Selector.of(809,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.mutable.MutableFloat.class).id("_returnReplacementOperatorHotSpot809");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot810 = metamutator.Selector.of(810,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.mutable.MutableFloat.class).id("_returnReplacementOperatorHotSpot810");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot811 = metamutator.Selector.of(811,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableFloat.class).id("_returnReplacementOperatorHotSpot811");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot812 = metamutator.Selector.of(812,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableFloat.class).id("_returnReplacementOperatorHotSpot812");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot813 = metamutator.Selector.of(813,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableFloat.class).id("_returnReplacementOperatorHotSpot813");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot814 = metamutator.Selector.of(814,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableFloat.class).id("_returnReplacementOperatorHotSpot814");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot815 = metamutator.Selector.of(815,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableFloat.class).id("_returnReplacementOperatorHotSpot815");
}

