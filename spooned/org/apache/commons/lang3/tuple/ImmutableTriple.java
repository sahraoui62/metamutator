package org.apache.commons.lang3.tuple;


public final class ImmutableTriple<L, M, R> extends org.apache.commons.lang3.tuple.Triple<L, M, R> {
    private static final long serialVersionUID = 1L;

    public final L left;

    public final M middle;

    public final R right;

    public static <L, M, R>org.apache.commons.lang3.tuple.ImmutableTriple<L, M, R> of(final L left, final M middle, final R right) {
        return ((_returnReplacementOperatorHotSpot1862.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.tuple.ImmutableTriple<L, M, R>(left , middle , right)));
    }

    public ImmutableTriple(final L left ,final M middle ,final R right) {
        super();
        this.left = left;
        this.middle = middle;
        this.right = right;
    }

    @java.lang.Override
    public L getLeft() {
        return ((_returnReplacementOperatorHotSpot1863.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (left));
    }

    @java.lang.Override
    public M getMiddle() {
        return ((_returnReplacementOperatorHotSpot1864.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (middle));
    }

    @java.lang.Override
    public R getRight() {
        return ((_returnReplacementOperatorHotSpot1865.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (right));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1862 = metamutator.Selector.of(1862,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.tuple.ImmutableTriple.class).id("_returnReplacementOperatorHotSpot1862");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1863 = metamutator.Selector.of(1863,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.tuple.ImmutableTriple.class).id("_returnReplacementOperatorHotSpot1863");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1864 = metamutator.Selector.of(1864,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.tuple.ImmutableTriple.class).id("_returnReplacementOperatorHotSpot1864");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1865 = metamutator.Selector.of(1865,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.tuple.ImmutableTriple.class).id("_returnReplacementOperatorHotSpot1865");
}

