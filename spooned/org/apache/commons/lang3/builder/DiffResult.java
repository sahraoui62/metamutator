package org.apache.commons.lang3.builder;


public class DiffResult implements java.lang.Iterable<org.apache.commons.lang3.builder.Diff<?>> {
    public static final java.lang.String OBJECTS_SAME_STRING = "";

    private static final java.lang.String DIFFERS_STRING = "differs from";

    private final java.util.List<org.apache.commons.lang3.builder.Diff<?>> diffs;

    private final java.lang.Object lhs;

    private final java.lang.Object rhs;

    private final org.apache.commons.lang3.builder.ToStringStyle style;

    DiffResult(final java.lang.Object lhs ,final java.lang.Object rhs ,final java.util.List<org.apache.commons.lang3.builder.Diff<?>> diffs ,final org.apache.commons.lang3.builder.ToStringStyle style) {
        if (lhs == null) {
            throw new java.lang.IllegalArgumentException("Left hand object cannot be null");
        } 
        if (rhs == null) {
            throw new java.lang.IllegalArgumentException("Right hand object cannot be null");
        } 
        if (diffs == null) {
            throw new java.lang.IllegalArgumentException("List of differences cannot be null");
        } 
        this.diffs = diffs;
        this.lhs = lhs;
        this.rhs = rhs;
        if (style == null) {
            this.style = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        } else {
            this.style = style;
        }
    }

    public java.util.List<org.apache.commons.lang3.builder.Diff<?>> getDiffs() {
        return ((_returnReplacementOperatorHotSpot179.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.util.Collections.unmodifiableList(diffs)));
    }

    public int getNumberOfDiffs() {
        return ((_returnReplacementOperatorHotSpot174.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot174.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot174.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (diffs.size()));
    }

    public org.apache.commons.lang3.builder.ToStringStyle getToStringStyle() {
        return ((_returnReplacementOperatorHotSpot180.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (style));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperatorHotSpot175.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (toString(style)));
    }

    public java.lang.String toString(final org.apache.commons.lang3.builder.ToStringStyle style) {
        if ((diffs.size()) == 0) {
            return ((_returnReplacementOperatorHotSpot176.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.builder.DiffResult.OBJECTS_SAME_STRING));
        } 
        final org.apache.commons.lang3.builder.ToStringBuilder lhsBuilder = new org.apache.commons.lang3.builder.ToStringBuilder(lhs , style);
        final org.apache.commons.lang3.builder.ToStringBuilder rhsBuilder = new org.apache.commons.lang3.builder.ToStringBuilder(rhs , style);
        for (final org.apache.commons.lang3.builder.Diff<?> diff : diffs) {
            lhsBuilder.append(diff.getFieldName(), diff.getLeft());
            rhsBuilder.append(diff.getFieldName(), diff.getRight());
        }
        return ((_returnReplacementOperatorHotSpot177.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.String.format("%s %s %s", lhsBuilder.build(), org.apache.commons.lang3.builder.DiffResult.DIFFERS_STRING, rhsBuilder.build())));
    }

    @java.lang.Override
    public java.util.Iterator<org.apache.commons.lang3.builder.Diff<?>> iterator() {
        return ((_returnReplacementOperatorHotSpot178.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (diffs.iterator()));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot174 = metamutator.Selector.of(174,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.builder.DiffResult.class).id("_returnReplacementOperatorHotSpot174");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot175 = metamutator.Selector.of(175,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffResult.class).id("_returnReplacementOperatorHotSpot175");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot176 = metamutator.Selector.of(176,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffResult.class).id("_returnReplacementOperatorHotSpot176");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot177 = metamutator.Selector.of(177,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffResult.class).id("_returnReplacementOperatorHotSpot177");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot178 = metamutator.Selector.of(178,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffResult.class).id("_returnReplacementOperatorHotSpot178");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot179 = metamutator.Selector.of(179,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffResult.class).id("_returnReplacementOperatorHotSpot179");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot180 = metamutator.Selector.of(180,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffResult.class).id("_returnReplacementOperatorHotSpot180");
}

