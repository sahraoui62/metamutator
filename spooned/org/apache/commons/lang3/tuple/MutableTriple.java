package org.apache.commons.lang3.tuple;


public class MutableTriple<L, M, R> extends org.apache.commons.lang3.tuple.Triple<L, M, R> {
    private static final long serialVersionUID = 1L;

    public L left;

    public M middle;

    public R right;

    public static <L, M, R>org.apache.commons.lang3.tuple.MutableTriple<L, M, R> of(final L left, final M middle, final R right) {
        return ((_returnReplacementOperatorHotSpot1870.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.tuple.MutableTriple<L, M, R>(left , middle , right)));
    }

    public MutableTriple() {
        super();
    }

    public MutableTriple(final L left ,final M middle ,final R right) {
        super();
        this.left = left;
        this.middle = middle;
        this.right = right;
    }

    @java.lang.Override
    public L getLeft() {
        return ((_returnReplacementOperatorHotSpot1871.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (left));
    }

    public void setLeft(final L left) {
        this.left = left;
    }

    @java.lang.Override
    public M getMiddle() {
        return ((_returnReplacementOperatorHotSpot1872.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (middle));
    }

    public void setMiddle(final M middle) {
        this.middle = middle;
    }

    @java.lang.Override
    public R getRight() {
        return ((_returnReplacementOperatorHotSpot1873.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (right));
    }

    public void setRight(final R right) {
        this.right = right;
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1870 = metamutator.Selector.of(1870,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.tuple.MutableTriple.class).id("_returnReplacementOperatorHotSpot1870");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1871 = metamutator.Selector.of(1871,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.tuple.MutableTriple.class).id("_returnReplacementOperatorHotSpot1871");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1872 = metamutator.Selector.of(1872,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.tuple.MutableTriple.class).id("_returnReplacementOperatorHotSpot1872");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1873 = metamutator.Selector.of(1873,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.tuple.MutableTriple.class).id("_returnReplacementOperatorHotSpot1873");
}

