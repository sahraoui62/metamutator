package org.apache.commons.lang3.mutable;


public class MutableBoolean implements java.io.Serializable , java.lang.Comparable<org.apache.commons.lang3.mutable.MutableBoolean> , org.apache.commons.lang3.mutable.Mutable<java.lang.Boolean> {
    private static final long serialVersionUID = -4830728138360036487L;

    private boolean value;

    public MutableBoolean() {
        super();
    }

    public MutableBoolean(final boolean value) {
        super();
        this.value = value;
    }

    public MutableBoolean(final java.lang.Boolean value) {
        super();
        this.value = value.booleanValue();
    }

    @java.lang.Override
    public java.lang.Boolean getValue() {
        return java.lang.Boolean.valueOf(this.value);
    }

    public void setValue(final boolean value) {
        this.value = value;
    }

    public void setFalse() {
        this.value = false;
    }

    public void setTrue() {
        this.value = true;
    }

    @java.lang.Override
    public void setValue(final java.lang.Boolean value) {
        this.value = value.booleanValue();
    }

    public boolean isTrue() {
        return ((_returnReplacementOperatorHotSpot776.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((value) == true));
    }

    public boolean isFalse() {
        return ((_returnReplacementOperatorHotSpot775.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((value) == false));
    }

    public boolean booleanValue() {
        return ((_returnReplacementOperatorHotSpot772.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (value));
    }

    public java.lang.Boolean toBoolean() {
        return java.lang.Boolean.valueOf(booleanValue());
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj instanceof org.apache.commons.lang3.mutable.MutableBoolean) {
            return ((_returnReplacementOperatorHotSpot773.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((value) == (((org.apache.commons.lang3.mutable.MutableBoolean)(obj)).booleanValue())));
        } 
        return ((_returnReplacementOperatorHotSpot774.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
    }

    @java.lang.Override
    public int hashCode() {
        return ((_returnReplacementOperatorHotSpot778.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot778.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot778.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (value ? java.lang.Boolean.TRUE.hashCode() : java.lang.Boolean.FALSE.hashCode()));
    }

    @java.lang.Override
    public int compareTo(final org.apache.commons.lang3.mutable.MutableBoolean other) {
        return ((_returnReplacementOperatorHotSpot777.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot777.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot777.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.BooleanUtils.compare(this.value, other.value)));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperatorHotSpot779.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.String.valueOf(value)));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot772 = metamutator.Selector.of(772,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableBoolean.class).id("_returnReplacementOperatorHotSpot772");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot773 = metamutator.Selector.of(773,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableBoolean.class).id("_returnReplacementOperatorHotSpot773");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot774 = metamutator.Selector.of(774,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableBoolean.class).id("_returnReplacementOperatorHotSpot774");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot775 = metamutator.Selector.of(775,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableBoolean.class).id("_returnReplacementOperatorHotSpot775");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot776 = metamutator.Selector.of(776,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableBoolean.class).id("_returnReplacementOperatorHotSpot776");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot777 = metamutator.Selector.of(777,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.mutable.MutableBoolean.class).id("_returnReplacementOperatorHotSpot777");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot778 = metamutator.Selector.of(778,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.mutable.MutableBoolean.class).id("_returnReplacementOperatorHotSpot778");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot779 = metamutator.Selector.of(779,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableBoolean.class).id("_returnReplacementOperatorHotSpot779");
}

