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
        return new org.apache.commons.lang3.CharRange(ch , ch , false);
    }

    public static org.apache.commons.lang3.CharRange isNot(final char ch) {
        return new org.apache.commons.lang3.CharRange(ch , ch , true);
    }

    public static org.apache.commons.lang3.CharRange isIn(final char start, final char end) {
        return new org.apache.commons.lang3.CharRange(start , end , false);
    }

    public static org.apache.commons.lang3.CharRange isNotIn(final char start, final char end) {
        return new org.apache.commons.lang3.CharRange(start , end , true);
    }

    public char getStart() {
        return this.start;
    }

    public char getEnd() {
        return this.end;
    }

    public boolean isNegated() {
        return negated;
    }

    public boolean contains(final char ch) {
        return ((ch >= (start)) && (ch <= (end))) != (negated);
    }

    public boolean contains(final org.apache.commons.lang3.CharRange range) {
        if (range == null) {
            throw new java.lang.IllegalArgumentException("The Range must not be null");
        } 
        if (negated) {
            if (range.negated) {
                return ((start) >= (range.start)) && ((end) <= (range.end));
            } 
            return ((range.end) < (start)) || ((range.start) > (end));
        } 
        if (range.negated) {
            return ((start) == 0) && ((end) == (java.lang.Character.MAX_VALUE));
        } 
        return ((start) <= (range.start)) && ((end) >= (range.end));
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == (this)) {
            return true;
        } 
        if ((obj instanceof org.apache.commons.lang3.CharRange) == false) {
            return false;
        } 
        final org.apache.commons.lang3.CharRange other = ((org.apache.commons.lang3.CharRange)(obj));
        return (((start) == (other.start)) && ((end) == (other.end))) && ((negated) == (other.negated));
    }

    @java.lang.Override
    public int hashCode() {
        return (((_arithmeticOperatorHotSpot512.is("PLUS")) ? ((83 + (start))) : (_arithmeticOperatorHotSpot512.is("MINUS")) ? ((83 - (start))) : (_arithmeticOperatorHotSpot512.is("MUL")) ? ((83 * (start))) :  ((83 / (start)))) + ((_arithmeticOperatorHotSpot513.is("PLUS")) ? ((7 + (end))) : (_arithmeticOperatorHotSpot513.is("MINUS")) ? ((7 - (end))) : (_arithmeticOperatorHotSpot513.is("MUL")) ? ((7 * (end))) :  ((7 / (end))))) + (negated ? 1 : 0);
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
        return iToString;
    }

    @java.lang.Override
    public java.util.Iterator<java.lang.Character> iterator() {
        return new org.apache.commons.lang3.CharRange.CharacterIterator(this);
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
                } else if (((_arithmeticOperatorHotSpot508.is("PLUS")) ? (((current) + 1)) : (_arithmeticOperatorHotSpot508.is("MINUS")) ? (((current) - 1)) : (_arithmeticOperatorHotSpot508.is("MUL")) ? (((current) * 1)) :  (((current) / 1))) == (range.start)) {
                    if ((range.end) == (java.lang.Character.MAX_VALUE)) {
                        hasNext = false;
                    } else {
                        current = ((_arithmeticOperatorHotSpot509.is("PLUS")) ? (((char)((range.end) + 1))) : (_arithmeticOperatorHotSpot509.is("MINUS")) ? (((char)((range.end) - 1))) : (_arithmeticOperatorHotSpot509.is("MUL")) ? (((char)((range.end) * 1))) :  (((char)((range.end) / 1))));
                    }
                } else {
                    current = ((_arithmeticOperatorHotSpot510.is("PLUS")) ? (((char)((current) + 1))) : (_arithmeticOperatorHotSpot510.is("MINUS")) ? (((char)((current) - 1))) : (_arithmeticOperatorHotSpot510.is("MUL")) ? (((char)((current) * 1))) :  (((char)((current) / 1))));
                }
            } else if ((current) < (range.end)) {
                current = ((_arithmeticOperatorHotSpot511.is("PLUS")) ? (((char)((current) + 1))) : (_arithmeticOperatorHotSpot511.is("MINUS")) ? (((char)((current) - 1))) : (_arithmeticOperatorHotSpot511.is("MUL")) ? (((char)((current) * 1))) :  (((char)((current) / 1))));
            } else {
                hasNext = false;
            }
        }

        @java.lang.Override
        public boolean hasNext() {
            return hasNext;
        }

        @java.lang.Override
        public java.lang.Character next() {
            if ((hasNext) == false) {
                throw new java.util.NoSuchElementException();
            } 
            final char cur = current;
            prepareNext();
            return java.lang.Character.valueOf(cur);
        }

        @java.lang.Override
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot508 = metamutator.Selector.of(508,new String[]{"PLUS","MINUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot508");

    private static final metamutator.Selector _arithmeticOperatorHotSpot509 = metamutator.Selector.of(509,new String[]{"PLUS","MINUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot509");

    private static final metamutator.Selector _arithmeticOperatorHotSpot510 = metamutator.Selector.of(510,new String[]{"PLUS","MINUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot510");

    private static final metamutator.Selector _arithmeticOperatorHotSpot511 = metamutator.Selector.of(511,new String[]{"PLUS","MINUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot511");

    private static final metamutator.Selector _arithmeticOperatorHotSpot512 = metamutator.Selector.of(512,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.CharRange.class).id("_arithmeticOperatorHotSpot512");

    private static final metamutator.Selector _arithmeticOperatorHotSpot513 = metamutator.Selector.of(513,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.CharRange.class).id("_arithmeticOperatorHotSpot513");
}

