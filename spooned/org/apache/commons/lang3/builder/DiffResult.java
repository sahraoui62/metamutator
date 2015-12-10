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
        return java.util.Collections.unmodifiableList(diffs);
    }

    public int getNumberOfDiffs() {
        return diffs.size();
    }

    public org.apache.commons.lang3.builder.ToStringStyle getToStringStyle() {
        return style;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return toString(style);
    }

    public java.lang.String toString(final org.apache.commons.lang3.builder.ToStringStyle style) {
        if ((diffs.size()) == 0) {
            return OBJECTS_SAME_STRING;
        } 
        final org.apache.commons.lang3.builder.ToStringBuilder lhsBuilder = new org.apache.commons.lang3.builder.ToStringBuilder(lhs , style);
        final org.apache.commons.lang3.builder.ToStringBuilder rhsBuilder = new org.apache.commons.lang3.builder.ToStringBuilder(rhs , style);
        for (final org.apache.commons.lang3.builder.Diff<?> diff : diffs) {
            lhsBuilder.append(diff.getFieldName(), diff.getLeft());
            rhsBuilder.append(diff.getFieldName(), diff.getRight());
        }
        return java.lang.String.format("%s %s %s", lhsBuilder.build(), DIFFERS_STRING, rhsBuilder.build());
    }

    @java.lang.Override
    public java.util.Iterator<org.apache.commons.lang3.builder.Diff<?>> iterator() {
        return diffs.iterator();
    }
}

