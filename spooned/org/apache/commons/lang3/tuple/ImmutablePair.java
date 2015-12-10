package org.apache.commons.lang3.tuple;


public final class ImmutablePair<L, R> extends org.apache.commons.lang3.tuple.Pair<L, R> {
    private static final long serialVersionUID = 4954918890077093841L;

    public final L left;

    public final R right;

    public static <L, R>org.apache.commons.lang3.tuple.ImmutablePair<L, R> of(final L left, final R right) {
        return ((_returnReplacementOperatorHotSpot1859.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.tuple.ImmutablePair<L, R>(left , right)));
    }

    public ImmutablePair(final L left ,final R right) {
        super();
        this.left = left;
        this.right = right;
    }

    @java.lang.Override
    public L getLeft() {
        return ((_returnReplacementOperatorHotSpot1860.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (left));
    }

    @java.lang.Override
    public R getRight() {
        return ((_returnReplacementOperatorHotSpot1861.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (right));
    }

    @java.lang.Override
    public R setValue(final R value) {
        throw new java.lang.UnsupportedOperationException();
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1859 = metamutator.Selector.of(1859,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.tuple.ImmutablePair.class).id("_returnReplacementOperatorHotSpot1859");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1860 = metamutator.Selector.of(1860,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.tuple.ImmutablePair.class).id("_returnReplacementOperatorHotSpot1860");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1861 = metamutator.Selector.of(1861,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.tuple.ImmutablePair.class).id("_returnReplacementOperatorHotSpot1861");
}

