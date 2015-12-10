package org.apache.commons.lang3.concurrent;


public class ConstantInitializer<T> implements org.apache.commons.lang3.concurrent.ConcurrentInitializer<T> {
    private static final java.lang.String FMT_TO_STRING = "ConstantInitializer@%d [ object = %s ]";

    private final T object;

    public ConstantInitializer(final T obj) {
        object = obj;
    }

    public final T getObject() {
        return ((_returnReplacementOperatorHotSpot483.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (object));
    }

    @java.lang.Override
    public T get() throws org.apache.commons.lang3.concurrent.ConcurrentException {
        return ((_returnReplacementOperatorHotSpot482.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (getObject()));
    }

    @java.lang.Override
    public int hashCode() {
        return ((_returnReplacementOperatorHotSpot487.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot487.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot487.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : ((getObject()) != null ? getObject().hashCode() : 0));
    }

    @java.lang.SuppressWarnings(value = "deprecation")
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if ((this) == obj) {
            return ((_returnReplacementOperatorHotSpot484.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        if (!(obj instanceof org.apache.commons.lang3.concurrent.ConstantInitializer<?>)) {
            return ((_returnReplacementOperatorHotSpot485.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        final org.apache.commons.lang3.concurrent.ConstantInitializer<?> c = ((org.apache.commons.lang3.concurrent.ConstantInitializer<?>)(obj));
        return ((_returnReplacementOperatorHotSpot486.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ObjectUtils.equals(getObject(), c.getObject())));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperatorHotSpot488.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.String.format(org.apache.commons.lang3.concurrent.ConstantInitializer.FMT_TO_STRING, java.lang.Integer.valueOf(java.lang.System.identityHashCode(this)), java.lang.String.valueOf(getObject()))));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot482 = metamutator.Selector.of(482,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.ConstantInitializer.class).id("_returnReplacementOperatorHotSpot482");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot483 = metamutator.Selector.of(483,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.ConstantInitializer.class).id("_returnReplacementOperatorHotSpot483");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot484 = metamutator.Selector.of(484,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.ConstantInitializer.class).id("_returnReplacementOperatorHotSpot484");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot485 = metamutator.Selector.of(485,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.ConstantInitializer.class).id("_returnReplacementOperatorHotSpot485");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot486 = metamutator.Selector.of(486,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.ConstantInitializer.class).id("_returnReplacementOperatorHotSpot486");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot487 = metamutator.Selector.of(487,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.concurrent.ConstantInitializer.class).id("_returnReplacementOperatorHotSpot487");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot488 = metamutator.Selector.of(488,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.concurrent.ConstantInitializer.class).id("_returnReplacementOperatorHotSpot488");
}

