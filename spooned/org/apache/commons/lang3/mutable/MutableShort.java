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
        return ((_returnReplacementOperatorHotSpot852.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Short.valueOf(this.value)));
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
        return ((_returnReplacementOperatorHotSpot856.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (value));
    }

    @java.lang.Override
    public int intValue() {
        return ((_returnReplacementOperatorHotSpot851.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (value));
    }

    @java.lang.Override
    public long longValue() {
        return ((_returnReplacementOperatorHotSpot855.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (value));
    }

    @java.lang.Override
    public float floatValue() {
        return ((_returnReplacementOperatorHotSpot848.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (value));
    }

    @java.lang.Override
    public double doubleValue() {
        return ((_returnReplacementOperatorHotSpot847.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (value));
    }

    public java.lang.Short toShort() {
        return ((_returnReplacementOperatorHotSpot853.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Short.valueOf(shortValue())));
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj instanceof org.apache.commons.lang3.mutable.MutableShort) {
            return ((_returnReplacementOperatorHotSpot845.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((value) == (((org.apache.commons.lang3.mutable.MutableShort)(obj)).shortValue())));
        } 
        return ((_returnReplacementOperatorHotSpot846.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
    }

    @java.lang.Override
    public int hashCode() {
        return ((_returnReplacementOperatorHotSpot850.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (value));
    }

    @java.lang.Override
    public int compareTo(final org.apache.commons.lang3.mutable.MutableShort other) {
        return ((_returnReplacementOperatorHotSpot849.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot849.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot849.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.math.NumberUtils.compare(this.value, other.value)));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperatorHotSpot854.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.String.valueOf(value)));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot845 = metamutator.Selector.of(845,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableShort.class).id("_returnReplacementOperatorHotSpot845");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot846 = metamutator.Selector.of(846,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableShort.class).id("_returnReplacementOperatorHotSpot846");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot847 = metamutator.Selector.of(847,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableShort.class).id("_returnReplacementOperatorHotSpot847");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot848 = metamutator.Selector.of(848,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableShort.class).id("_returnReplacementOperatorHotSpot848");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot849 = metamutator.Selector.of(849,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.mutable.MutableShort.class).id("_returnReplacementOperatorHotSpot849");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot850 = metamutator.Selector.of(850,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableShort.class).id("_returnReplacementOperatorHotSpot850");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot851 = metamutator.Selector.of(851,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableShort.class).id("_returnReplacementOperatorHotSpot851");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot852 = metamutator.Selector.of(852,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableShort.class).id("_returnReplacementOperatorHotSpot852");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot853 = metamutator.Selector.of(853,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableShort.class).id("_returnReplacementOperatorHotSpot853");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot854 = metamutator.Selector.of(854,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableShort.class).id("_returnReplacementOperatorHotSpot854");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot855 = metamutator.Selector.of(855,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableShort.class).id("_returnReplacementOperatorHotSpot855");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot856 = metamutator.Selector.of(856,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableShort.class).id("_returnReplacementOperatorHotSpot856");
}

