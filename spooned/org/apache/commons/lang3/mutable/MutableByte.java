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
        return ((_returnReplacementOperatorHotSpot788.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Byte.valueOf(this.value)));
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
        return ((_returnReplacementOperatorHotSpot782.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (value));
    }

    @java.lang.Override
    public int intValue() {
        return ((_returnReplacementOperatorHotSpot787.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (value));
    }

    @java.lang.Override
    public long longValue() {
        return ((_returnReplacementOperatorHotSpot791.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (value));
    }

    @java.lang.Override
    public float floatValue() {
        return ((_returnReplacementOperatorHotSpot784.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (value));
    }

    @java.lang.Override
    public double doubleValue() {
        return ((_returnReplacementOperatorHotSpot783.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (value));
    }

    public java.lang.Byte toByte() {
        return ((_returnReplacementOperatorHotSpot789.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Byte.valueOf(byteValue())));
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj instanceof org.apache.commons.lang3.mutable.MutableByte) {
            return ((_returnReplacementOperatorHotSpot780.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((value) == (((org.apache.commons.lang3.mutable.MutableByte)(obj)).byteValue())));
        } 
        return ((_returnReplacementOperatorHotSpot781.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
    }

    @java.lang.Override
    public int hashCode() {
        return ((_returnReplacementOperatorHotSpot786.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (value));
    }

    @java.lang.Override
    public int compareTo(final org.apache.commons.lang3.mutable.MutableByte other) {
        return ((_returnReplacementOperatorHotSpot785.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot785.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot785.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.math.NumberUtils.compare(this.value, other.value)));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperatorHotSpot790.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.String.valueOf(value)));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot780 = metamutator.Selector.of(780,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableByte.class).id("_returnReplacementOperatorHotSpot780");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot781 = metamutator.Selector.of(781,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableByte.class).id("_returnReplacementOperatorHotSpot781");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot782 = metamutator.Selector.of(782,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableByte.class).id("_returnReplacementOperatorHotSpot782");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot783 = metamutator.Selector.of(783,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableByte.class).id("_returnReplacementOperatorHotSpot783");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot784 = metamutator.Selector.of(784,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableByte.class).id("_returnReplacementOperatorHotSpot784");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot785 = metamutator.Selector.of(785,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.mutable.MutableByte.class).id("_returnReplacementOperatorHotSpot785");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot786 = metamutator.Selector.of(786,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableByte.class).id("_returnReplacementOperatorHotSpot786");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot787 = metamutator.Selector.of(787,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableByte.class).id("_returnReplacementOperatorHotSpot787");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot788 = metamutator.Selector.of(788,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableByte.class).id("_returnReplacementOperatorHotSpot788");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot789 = metamutator.Selector.of(789,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableByte.class).id("_returnReplacementOperatorHotSpot789");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot790 = metamutator.Selector.of(790,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableByte.class).id("_returnReplacementOperatorHotSpot790");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot791 = metamutator.Selector.of(791,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableByte.class).id("_returnReplacementOperatorHotSpot791");
}

