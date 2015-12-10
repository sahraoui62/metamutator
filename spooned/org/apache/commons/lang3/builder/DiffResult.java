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
        return ((_returnReplacementOperator179.is("NULL")) ? ( null ) : (java.util.Collections.unmodifiableList(diffs)));
    }

    public int getNumberOfDiffs() {
        return ((_returnReplacementOperator174.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator174.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator174.is("ZERO")) ? ( 0 ) : (diffs.size()));
    }

    public org.apache.commons.lang3.builder.ToStringStyle getToStringStyle() {
        return ((_returnReplacementOperator180.is("NULL")) ? ( null ) : (style));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperator175.is("NULL")) ? ( null ) : (toString(style)));
    }

    public java.lang.String toString(final org.apache.commons.lang3.builder.ToStringStyle style) {
        if ((diffs.size()) == 0) {
            return ((_returnReplacementOperator176.is("NULL")) ? ( null ) : (org.apache.commons.lang3.builder.DiffResult.OBJECTS_SAME_STRING));
        } 
        final org.apache.commons.lang3.builder.ToStringBuilder lhsBuilder = new org.apache.commons.lang3.builder.ToStringBuilder(lhs , style);
        final org.apache.commons.lang3.builder.ToStringBuilder rhsBuilder = new org.apache.commons.lang3.builder.ToStringBuilder(rhs , style);
        for (final org.apache.commons.lang3.builder.Diff<?> diff : diffs) {
            lhsBuilder.append(diff.getFieldName(), diff.getLeft());
            rhsBuilder.append(diff.getFieldName(), diff.getRight());
        }
        return ((_returnReplacementOperator177.is("NULL")) ? ( null ) : (java.lang.String.format("%s %s %s", lhsBuilder.build(), org.apache.commons.lang3.builder.DiffResult.DIFFERS_STRING, rhsBuilder.build())));
    }

    @java.lang.Override
    public java.util.Iterator<org.apache.commons.lang3.builder.Diff<?>> iterator() {
        return ((_returnReplacementOperator178.is("NULL")) ? ( null ) : (diffs.iterator()));
    }

    private static final metamutator.Selector _returnReplacementOperator174 = metamutator.Selector.of(174,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.builder.DiffResult.class).id("_returnReplacementOperator174");

    private static final metamutator.Selector _returnReplacementOperator175 = metamutator.Selector.of(175,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffResult.class).id("_returnReplacementOperator175");

    private static final metamutator.Selector _returnReplacementOperator176 = metamutator.Selector.of(176,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffResult.class).id("_returnReplacementOperator176");

    private static final metamutator.Selector _returnReplacementOperator177 = metamutator.Selector.of(177,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffResult.class).id("_returnReplacementOperator177");

    private static final metamutator.Selector _returnReplacementOperator178 = metamutator.Selector.of(178,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffResult.class).id("_returnReplacementOperator178");

    private static final metamutator.Selector _returnReplacementOperator179 = metamutator.Selector.of(179,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffResult.class).id("_returnReplacementOperator179");

    private static final metamutator.Selector _returnReplacementOperator180 = metamutator.Selector.of(180,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffResult.class).id("_returnReplacementOperator180");
}

