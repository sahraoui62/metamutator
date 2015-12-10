package org.apache.commons.lang3.builder;


public abstract class Diff<T> extends org.apache.commons.lang3.tuple.Pair<T, T> {
    private static final long serialVersionUID = 1L;

    private final java.lang.reflect.Type type;

    private final java.lang.String fieldName;

    protected Diff(final java.lang.String fieldName) {
        this.type = org.apache.commons.lang3.ObjectUtils.defaultIfNull(org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(getClass(), org.apache.commons.lang3.builder.Diff.class).get(org.apache.commons.lang3.builder.Diff.class.getTypeParameters()[0]), java.lang.Object.class);
        this.fieldName = fieldName;
    }

    public final java.lang.reflect.Type getType() {
        return ((_returnReplacementOperatorHotSpot91.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (type));
    }

    public final java.lang.String getFieldName() {
        return ((_returnReplacementOperatorHotSpot89.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (fieldName));
    }

    @java.lang.Override
    public final java.lang.String toString() {
        return ((_returnReplacementOperatorHotSpot90.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.String.format("[%s: %s, %s]", fieldName, getLeft(), getRight())));
    }

    @java.lang.Override
    public final T setValue(final T value) {
        throw new java.lang.UnsupportedOperationException("Cannot alter Diff object.");
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot89 = metamutator.Selector.of(89,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.Diff.class).id("_returnReplacementOperatorHotSpot89");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot90 = metamutator.Selector.of(90,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.Diff.class).id("_returnReplacementOperatorHotSpot90");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot91 = metamutator.Selector.of(91,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.Diff.class).id("_returnReplacementOperatorHotSpot91");
}

