package org.apache.commons.lang3.builder;


final class IDKey {
    private final java.lang.Object value;

    private final int id;

    public IDKey(final java.lang.Object _value) {
        id = java.lang.System.identityHashCode(_value);
        value = _value;
    }

    @java.lang.Override
    public int hashCode() {
        return ((_returnReplacementOperatorHotSpot294.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot294.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot294.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (id));
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object other) {
        if (!(other instanceof org.apache.commons.lang3.builder.IDKey)) {
            return ((_returnReplacementOperatorHotSpot291.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        final org.apache.commons.lang3.builder.IDKey idKey = ((org.apache.commons.lang3.builder.IDKey)(other));
        if ((id) != (idKey.id)) {
            return ((_returnReplacementOperatorHotSpot292.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperatorHotSpot293.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((value) == (idKey.value)));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot291 = metamutator.Selector.of(291,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.IDKey.class).id("_returnReplacementOperatorHotSpot291");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot292 = metamutator.Selector.of(292,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.IDKey.class).id("_returnReplacementOperatorHotSpot292");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot293 = metamutator.Selector.of(293,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.IDKey.class).id("_returnReplacementOperatorHotSpot293");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot294 = metamutator.Selector.of(294,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.builder.IDKey.class).id("_returnReplacementOperatorHotSpot294");
}

