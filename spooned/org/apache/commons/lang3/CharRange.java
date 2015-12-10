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
        return ((_returnReplacementOperatorHotSpot2474.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.CharRange(ch , ch , false)));
    }

    public static org.apache.commons.lang3.CharRange isNot(final char ch) {
        return ((_returnReplacementOperatorHotSpot2476.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.CharRange(ch , ch , true)));
    }

    public static org.apache.commons.lang3.CharRange isIn(final char start, final char end) {
        return ((_returnReplacementOperatorHotSpot2475.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.CharRange(start , end , false)));
    }

    public static org.apache.commons.lang3.CharRange isNotIn(final char start, final char end) {
        return ((_returnReplacementOperatorHotSpot2477.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.CharRange(start , end , true)));
    }

    public char getStart() {
        return ((_returnReplacementOperatorHotSpot2470.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this.start));
    }

    public char getEnd() {
        return ((_returnReplacementOperatorHotSpot2469.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this.end));
    }

    public boolean isNegated() {
        return ((_returnReplacementOperatorHotSpot2468.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (negated));
    }

    public boolean contains(final char ch) {
        return ((_returnReplacementOperatorHotSpot2460.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((ch >= (start)) && (ch <= (end))) != (negated)));
    }

    public boolean contains(final org.apache.commons.lang3.CharRange range) {
        if (range == null) {
            throw new java.lang.IllegalArgumentException("The Range must not be null");
        } 
        if (negated) {
            if (range.negated) {
                return ((_returnReplacementOperatorHotSpot2461.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((start) >= (range.start)) && ((end) <= (range.end))));
            } 
            return ((_returnReplacementOperatorHotSpot2462.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((range.end) < (start)) || ((range.start) > (end))));
        } 
        if (range.negated) {
            return ((_returnReplacementOperatorHotSpot2463.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((start) == 0) && ((end) == (java.lang.Character.MAX_VALUE))));
        } 
        return ((_returnReplacementOperatorHotSpot2464.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((start) <= (range.start)) && ((end) >= (range.end))));
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == (this)) {
            return ((_returnReplacementOperatorHotSpot2465.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        if ((obj instanceof org.apache.commons.lang3.CharRange) == false) {
            return ((_returnReplacementOperatorHotSpot2466.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        final org.apache.commons.lang3.CharRange other = ((org.apache.commons.lang3.CharRange)(obj));
        return ((_returnReplacementOperatorHotSpot2467.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((((start) == (other.start)) && ((end) == (other.end))) && ((negated) == (other.negated))));
    }

    @java.lang.Override
    public int hashCode() {
        return ((_returnReplacementOperatorHotSpot2471.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2471.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2471.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (((83 + (start)) + (7 * (end))) + (negated ? 1 : 0)));
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
        return ((_returnReplacementOperatorHotSpot2472.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (iToString));
    }

    @java.lang.Override
    public java.util.Iterator<java.lang.Character> iterator() {
        return ((_returnReplacementOperatorHotSpot2473.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.CharRange.CharacterIterator(this)));
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
            return ((_returnReplacementOperatorHotSpot2458.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (hasNext));
        }

        @java.lang.Override
        public java.lang.Character next() {
            if ((hasNext) == false) {
                throw new java.util.NoSuchElementException();
            } 
            final char cur = current;
            prepareNext();
            return ((_returnReplacementOperatorHotSpot2459.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Character.valueOf(cur)));
        }

        @java.lang.Override
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2458 = metamutator.Selector.of(2458,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot2458");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2459 = metamutator.Selector.of(2459,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot2459");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2460 = metamutator.Selector.of(2460,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperatorHotSpot2460");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2461 = metamutator.Selector.of(2461,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperatorHotSpot2461");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2462 = metamutator.Selector.of(2462,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperatorHotSpot2462");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2463 = metamutator.Selector.of(2463,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperatorHotSpot2463");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2464 = metamutator.Selector.of(2464,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperatorHotSpot2464");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2465 = metamutator.Selector.of(2465,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperatorHotSpot2465");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2466 = metamutator.Selector.of(2466,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperatorHotSpot2466");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2467 = metamutator.Selector.of(2467,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperatorHotSpot2467");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2468 = metamutator.Selector.of(2468,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperatorHotSpot2468");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2469 = metamutator.Selector.of(2469,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperatorHotSpot2469");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2470 = metamutator.Selector.of(2470,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperatorHotSpot2470");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2471 = metamutator.Selector.of(2471,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperatorHotSpot2471");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2472 = metamutator.Selector.of(2472,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperatorHotSpot2472");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2473 = metamutator.Selector.of(2473,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperatorHotSpot2473");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2474 = metamutator.Selector.of(2474,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperatorHotSpot2474");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2475 = metamutator.Selector.of(2475,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperatorHotSpot2475");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2476 = metamutator.Selector.of(2476,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperatorHotSpot2476");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2477 = metamutator.Selector.of(2477,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.CharRange.class).id("_returnReplacementOperatorHotSpot2477");
}

