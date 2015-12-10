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
        return ((_returnReplacementOperatorHotSpot800.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Double.valueOf(this.value)));
    }

    public void setValue(final double value) {
        this.value = value;
    }

    @java.lang.Override
    public void setValue(final java.lang.Number value) {
        this.value = value.doubleValue();
    }

    public boolean isNaN() {
        return ((_returnReplacementOperatorHotSpot794.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Double.isNaN(value)));
    }

    public boolean isInfinite() {
        return ((_returnReplacementOperatorHotSpot793.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Double.isInfinite(value)));
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
        return ((_returnReplacementOperatorHotSpot799.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((int)(value))));
    }

    @java.lang.Override
    public long longValue() {
        return ((_returnReplacementOperatorHotSpot803.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((long)(value))));
    }

    @java.lang.Override
    public float floatValue() {
        return ((_returnReplacementOperatorHotSpot796.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((float)(value))));
    }

    @java.lang.Override
    public double doubleValue() {
        return ((_returnReplacementOperatorHotSpot795.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (value));
    }

    public java.lang.Double toDouble() {
        return ((_returnReplacementOperatorHotSpot801.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Double.valueOf(doubleValue())));
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        return ((_returnReplacementOperatorHotSpot792.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((obj instanceof org.apache.commons.lang3.mutable.MutableDouble) && ((java.lang.Double.doubleToLongBits(((org.apache.commons.lang3.mutable.MutableDouble)(obj)).value)) == (java.lang.Double.doubleToLongBits(value)))));
    }

    @java.lang.Override
    public int hashCode() {
        final long bits = java.lang.Double.doubleToLongBits(value);
        return ((_returnReplacementOperatorHotSpot798.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((int)(bits ^ (bits >>> 32)))));
    }

    @java.lang.Override
    public int compareTo(final org.apache.commons.lang3.mutable.MutableDouble other) {
        return ((_returnReplacementOperatorHotSpot797.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot797.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot797.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (java.lang.Double.compare(this.value, other.value)));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperatorHotSpot802.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.String.valueOf(value)));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot792 = metamutator.Selector.of(792,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableDouble.class).id("_returnReplacementOperatorHotSpot792");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot793 = metamutator.Selector.of(793,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableDouble.class).id("_returnReplacementOperatorHotSpot793");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot794 = metamutator.Selector.of(794,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableDouble.class).id("_returnReplacementOperatorHotSpot794");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot795 = metamutator.Selector.of(795,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableDouble.class).id("_returnReplacementOperatorHotSpot795");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot796 = metamutator.Selector.of(796,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableDouble.class).id("_returnReplacementOperatorHotSpot796");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot797 = metamutator.Selector.of(797,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.mutable.MutableDouble.class).id("_returnReplacementOperatorHotSpot797");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot798 = metamutator.Selector.of(798,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableDouble.class).id("_returnReplacementOperatorHotSpot798");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot799 = metamutator.Selector.of(799,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableDouble.class).id("_returnReplacementOperatorHotSpot799");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot800 = metamutator.Selector.of(800,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableDouble.class).id("_returnReplacementOperatorHotSpot800");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot801 = metamutator.Selector.of(801,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableDouble.class).id("_returnReplacementOperatorHotSpot801");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot802 = metamutator.Selector.of(802,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableDouble.class).id("_returnReplacementOperatorHotSpot802");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot803 = metamutator.Selector.of(803,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableDouble.class).id("_returnReplacementOperatorHotSpot803");
}

