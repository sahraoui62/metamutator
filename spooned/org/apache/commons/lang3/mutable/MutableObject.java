package org.apache.commons.lang3.mutable;


public class MutableObject<T> implements java.io.Serializable , org.apache.commons.lang3.mutable.Mutable<T> {
    private static final long serialVersionUID = 86241875189L;

    private T value;

    public MutableObject() {
        super();
    }

    public MutableObject(final T value) {
        super();
        this.value = value;
    }

    @java.lang.Override
    public T getValue() {
        return ((_returnReplacementOperatorHotSpot838.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this.value));
    }

    @java.lang.Override
    public void setValue(final T value) {
        this.value = value;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == null) {
            return ((_returnReplacementOperatorHotSpot839.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        if ((this) == obj) {
            return ((_returnReplacementOperatorHotSpot840.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        if ((getClass()) == (obj.getClass())) {
            final org.apache.commons.lang3.mutable.MutableObject<?> that = ((org.apache.commons.lang3.mutable.MutableObject<?>)(obj));
            return ((_returnReplacementOperatorHotSpot841.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this.value.equals(that.value)));
        } 
        return ((_returnReplacementOperatorHotSpot842.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
    }

    @java.lang.Override
    public int hashCode() {
        return ((_returnReplacementOperatorHotSpot843.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot843.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot843.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : ((value) == null ? 0 : value.hashCode()));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperatorHotSpot844.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((value) == null ? "null" : value.toString()));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot838 = metamutator.Selector.of(838,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableObject.class).id("_returnReplacementOperatorHotSpot838");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot839 = metamutator.Selector.of(839,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableObject.class).id("_returnReplacementOperatorHotSpot839");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot840 = metamutator.Selector.of(840,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableObject.class).id("_returnReplacementOperatorHotSpot840");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot841 = metamutator.Selector.of(841,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableObject.class).id("_returnReplacementOperatorHotSpot841");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot842 = metamutator.Selector.of(842,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableObject.class).id("_returnReplacementOperatorHotSpot842");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot843 = metamutator.Selector.of(843,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.mutable.MutableObject.class).id("_returnReplacementOperatorHotSpot843");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot844 = metamutator.Selector.of(844,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.mutable.MutableObject.class).id("_returnReplacementOperatorHotSpot844");
}

