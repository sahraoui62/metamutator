package org.apache.commons.lang3;


final class CharRange implements java.io.Serializable , java.lang.Iterable<java.lang.Character> {
    private static final long serialVersionUID = 8270183163158333422L;

    private final char start;

    private final char end;

    private final boolean negated;

    private transient java.lang.String iToString;

    private CharRange(char start ,char end ,final boolean negated) {
        super();
        if (start > end) {
            final char temp = start;
            start = end;
            end = temp;
        } 
        this.start = start;
        this.end = end;
        this.negated = negated;
    }

    public static org.apache.commons.lang3.CharRange is(final char ch) {
        return ((_returnReplacementOperator2474.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.CharRange(ch , ch , false)));
    }

    public static org.apache.commons.lang3.CharRange isNot(final char ch) {
        return ((_returnReplacementOperator2476.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.CharRange(ch , ch , true)));
    }

    public static org.apache.commons.lang3.CharRange isIn(final char start, final char end) {
        return ((_returnReplacementOperator2475.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.CharRange(start , end , false)));
    }

    public static org.apache.commons.lang3.CharRange isNotIn(final char start, final char end) {
        return ((_returnReplacementOperator2477.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.CharRange(start , end , true)));
    }

    public char getStart() {
        return ((_returnReplacementOperator2470.is("NULL")) ? ( null ) : (this.start));
    }

    public char getEnd() {
        return ((_returnReplacementOperator2469.is("NULL")) ? ( null ) : (this.end));
    }

    public boolean isNegated() {
        return ((_returnReplacementOperator2468.is("NULL")) ? ( null ) : (negated));
    }

    public boolean contains(final char ch) {
        return ((_returnReplacementOperator2460.is("NULL")) ? ( null ) : (((ch >= (start)) && (ch <= (end))) != (negated)));
    }

    public boolean contains(final org.apache.commons.lang3.CharRange range) {
        if (range == null) {
            throw new java.lang.IllegalArgumentException("The Range must not be null");
        } 
        if (negated) {
            if (range.negated) {
                return ((_returnReplacementOperator2461.is("NULL")) ? ( null ) : (((start) >= (range.start)) && ((end) <= (range.end))));
            } 
            return ((_returnReplacementOperator2462.is("NULL")) ? ( null ) : (((range.end) < (start)) || ((range.start) > (end))));
        } 
        if (range.negated) {
            return ((_returnReplacementOperator2463.is("NULL")) ? ( null ) : (((start) == 0) && ((end) == (java.lang.Character.MAX_VALUE))));
        } 
        return ((_returnReplacementOperator2464.is("NULL")) ? ( null ) : (((start) <= (range.start)) && ((end) >= (range.end))));
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == (this)) {
            return ((_returnReplacementOperator2465.is("NULL")) ? ( null ) : (true));
        } 
        if ((obj instanceof org.apache.commons.lang3.CharRange) == false) {
            return ((_returnReplacementOperator2466.is("NULL")) ? ( null ) : (false));
        } 
        final org.apache.commons.lang3.CharRange other = ((org.apache.commons.lang3.CharRange)(obj));
        return ((_returnReplacementOperator2467.is("NULL")) ? ( null ) : ((((start) == (other.start)) && ((end) == (other.end))) && ((negated) == (other.negated))));
    }

    @java.lang.Override
    public int hashCode() {
        return ((_returnReplacementOperator2471.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2471.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2471.is("ZERO")) ? ( 0 ) : (((83 + (start)) + (7 * (end))) + (negated ? 1 : 0)));
    }

    @java.lang.Override
    public java.lang.String toString() {
        if ((iToString) == null) {
            final java.lang.StringBuilder buf = new java.lang.StringBuilder(4);
            if (isNegated()) {
                buf.append('^');
            } 
            buf.append(start);
            if ((start) != (end)) {
                buf.append('-');
                buf.append(end);
            } 
            iToString = buf.toString();
        } 
        return ((_returnReplacementOperator2472.is("NULL")) ? ( null ) : (iToString));
    }

    @java.lang.Override
    public java.util.Iterator<java.lang.Character> iterator() {
        return ((_returnReplacementOperator2473.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.CharRange.CharacterIterator(this)));
    }

    private static class CharacterIterator implements java.util.Iterator<java.lang.Character> {
        private char current;

        private final org.apache.commons.lang3.CharRange range;

        private boolean hasNext;

        private CharacterIterator(final org.apache.commons.lang3.CharRange r) {
            range = r;
            hasNext = true;
            if (range.negated) {
                if ((range.start) == 0) {
                    if ((range.end) == (java.lang.Character.MAX_VALUE)) {
                        hasNext = false;
                    } else {
                        current = ((char)((range.end) + 1));
                    }
                } else {
                    current = 0;
                }
            } else {
                current = range.start;
            }
        }

        private void prepareNext() {
            if (range.negated) {
                if ((current) == (java.lang.Character.MAX_VALUE)) {
                    hasNext = false;
                } else if (((current) + 1) == (range.start)) {
                    if ((range.end) == (java.lang.Character.MAX_VALUE)) {
                        hasNext = false;
                    } else {
                        current = ((char)((range.end) + 1));
                    }
                } else {
                    current = ((char)((current) + 1));
                }
            } else if ((current) < (range.end)) {
                current = ((char)((current) + 1));
            } else {
                hasNext = false;
            }
        }

        @java.lang.Override
        public boolean hasNext() {
            return ((_returnReplacementOperator2458.is("NULL")) ? ( null ) : (hasNext));
        }

        @java.lang.Override
        public java.lang.Character next() {
            if ((hasNext) == false) {
                throw new java.util.NoSuchElementException();
            } 
            final char cur = current;
            prepareNext();
            return ((_returnReplacementOperator2459.is("NULL")) ? ( null ) : (java.lang.Character.valueOf(cur)));
        }

        @java.lang.Override
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private static final metamutator.Selector _returnReplacementOperator2458 = metamutator.Selector.of(2458,new String[]{"INIT","NULL"}).id("_returnReplacementOperator2458");

    private static final metamutator.Selector _returnReplacementOperator2459 = metamutator.Selector.of(2459,new String[]{"INIT","NULL"}).id("_returnReplacementOperator2459");

    private static final metamutator.Selector _returnReplacementOperator2460 = metamutator.Selector.of(2460,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperator2460");

    private static final metamutator.Selector _returnReplacementOperator2461 = metamutator.Selector.of(2461,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperator2461");

    private static final metamutator.Selector _returnReplacementOperator2462 = metamutator.Selector.of(2462,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperator2462");

    private static final metamutator.Selector _returnReplacementOperator2463 = metamutator.Selector.of(2463,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperator2463");

    private static final metamutator.Selector _returnReplacementOperator2464 = metamutator.Selector.of(2464,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperator2464");

    private static final metamutator.Selector _returnReplacementOperator2465 = metamutator.Selector.of(2465,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperator2465");

    private static final metamutator.Selector _returnReplacementOperator2466 = metamutator.Selector.of(2466,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperator2466");

    private static final metamutator.Selector _returnReplacementOperator2467 = metamutator.Selector.of(2467,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperator2467");

    private static final metamutator.Selector _returnReplacementOperator2468 = metamutator.Selector.of(2468,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperator2468");

    private static final metamutator.Selector _returnReplacementOperator2469 = metamutator.Selector.of(2469,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperator2469");

    private static final metamutator.Selector _returnReplacementOperator2470 = metamutator.Selector.of(2470,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperator2470");

    private static final metamutator.Selector _returnReplacementOperator2471 = metamutator.Selector.of(2471,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperator2471");

    private static final metamutator.Selector _returnReplacementOperator2472 = metamutator.Selector.of(2472,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperator2472");

    private static final metamutator.Selector _returnReplacementOperator2473 = metamutator.Selector.of(2473,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperator2473");

    private static final metamutator.Selector _returnReplacementOperator2474 = metamutator.Selector.of(2474,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperator2474");

    private static final metamutator.Selector _returnReplacementOperator2475 = metamutator.Selector.of(2475,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperator2475");

    private static final metamutator.Selector _returnReplacementOperator2476 = metamutator.Selector.of(2476,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperator2476");

    private static final metamutator.Selector _returnReplacementOperator2477 = metamutator.Selector.of(2477,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperator2477");
}

