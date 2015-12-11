package org.jsoup.parser;


final class CharacterReader {
    static final char EOF = ((char)(-1));

    private static final int maxCacheLen = 12;

    private final char[] input;

    private final int length;

    private int pos = 0;

    private int mark = 0;

    private final java.lang.String[] stringCache = new java.lang.String[512];

    CharacterReader(java.lang.String input) {
        org.jsoup.helper.Validate.notNull(input);
        this.input = input.toCharArray();
        this.length = this.input.length;
    }

    int pos() {
        return pos;
    }

    boolean isEmpty() {
        return (pos) >= (length);
    }

    char current() {
        return (pos) >= (length) ? EOF : input[pos];
    }

    char consume() {
        char val = (pos) >= (length) ? EOF : input[pos];
        (pos)++;
        return val;
    }

    void unconsume() {
        (pos)--;
    }

    void advance() {
        (pos)++;
    }

    void mark() {
        mark = pos;
    }

    void rewindToMark() {
        pos = mark;
    }

    java.lang.String consumeAsString() {
        return new java.lang.String(input , (pos)++ , 1);
    }

    int nextIndexOf(char c) {
        for (int i = pos ; i < (length) ; i++) {
            if (c == (input[i]))
                return i - (pos);
            
        }
        return -1;
    }

    int nextIndexOf(java.lang.CharSequence seq) {
        char startChar = seq.charAt(0);
        for (int offset = pos ; offset < (length) ; offset++) {
            if (startChar != (input[offset]))
                while (((++offset) < (length)) && (startChar != (input[offset]))) {
                }
            
            int i = offset + 1;
            int last = (i + (seq.length())) - 1;
            if ((offset < (length)) && (last <= (length))) {
                for (int j = 1 ; (i < last) && ((seq.charAt(j)) == (input[i])) ; i++ , j++) {
                }
                if (i == last)
                    return offset - (pos);
                
            } 
        }
        return -1;
    }

    java.lang.String consumeTo(char c) {
        int offset = nextIndexOf(c);
        if (offset != (-1)) {
            java.lang.String consumed = cacheString(pos, offset);
            pos += offset;
            return consumed;
        } else {
            return consumeToEnd();
        }
    }

    java.lang.String consumeTo(java.lang.String seq) {
        int offset = nextIndexOf(seq);
        if (offset != (-1)) {
            java.lang.String consumed = cacheString(pos, offset);
            pos += offset;
            return consumed;
        } else {
            return consumeToEnd();
        }
    }

    java.lang.String consumeToAny(final char... chars) {
        final int start = pos;
        final int remaining = length;
        OUTER : while ((pos) < remaining) {
            for (char c : chars) {
                if ((input[pos]) == c)
                    break OUTER;
                
            }
            (pos)++;
        }
        return (pos) > start ? cacheString(start, ((pos) - start)) : "";
    }

    java.lang.String consumeToAnySorted(final char... chars) {
        final int start = pos;
        final int remaining = length;
        final char[] val = input;
        while ((pos) < remaining) {
            if ((java.util.Arrays.binarySearch(chars, val[pos])) >= 0)
                break;
            
            (pos)++;
        }
        return (pos) > start ? cacheString(start, ((pos) - start)) : "";
    }

    java.lang.String consumeData() {
        final int start = pos;
        final int remaining = length;
        final char[] val = input;
        while ((pos) < remaining) {
            final char c = val[pos];
            if (((c == '&') || (c == '<')) || (c == (org.jsoup.parser.TokeniserState.nullChar)))
                break;
            
            (pos)++;
        }
        return (pos) > start ? cacheString(start, ((pos) - start)) : "";
    }

    java.lang.String consumeTagName() {
        final int start = pos;
        final int remaining = length;
        final char[] val = input;
        while ((pos) < remaining) {
            final char c = val[pos];
            if ((((((((c == '\t') || (c == '\n')) || (c == '\r')) || (c == '\f')) || (c == ' ')) || (c == '/')) || (c == '>')) || (c == (org.jsoup.parser.TokeniserState.nullChar)))
                break;
            
            (pos)++;
        }
        return (pos) > start ? cacheString(start, ((pos) - start)) : "";
    }

    java.lang.String consumeToEnd() {
        java.lang.String data = cacheString(pos, ((length) - (pos)));
        pos = length;
        return data;
    }

    java.lang.String consumeLetterSequence() {
        int start = pos;
        while ((pos) < (length)) {
            char c = input[pos];
            if (((c >= 'A') && (c <= 'Z')) || ((c >= 'a') && (c <= 'z')))
                (pos)++;
            else
                break;
            
        }
        return cacheString(start, ((pos) - start));
    }

    java.lang.String consumeLetterThenDigitSequence() {
        int start = pos;
        while ((pos) < (length)) {
            char c = input[pos];
            if (((c >= 'A') && (c <= 'Z')) || ((c >= 'a') && (c <= 'z')))
                (pos)++;
            else
                break;
            
        }
        while (!(isEmpty())) {
            char c = input[pos];
            if ((c >= '0') && (c <= '9'))
                (pos)++;
            else
                break;
            
        }
        return cacheString(start, ((pos) - start));
    }

    java.lang.String consumeHexSequence() {
        int start = pos;
        while ((pos) < (length)) {
            char c = input[pos];
            if ((((c >= '0') && (c <= '9')) || ((c >= 'A') && (c <= 'F'))) || ((c >= 'a') && (c <= 'f')))
                (pos)++;
            else
                break;
            
        }
        return cacheString(start, ((pos) - start));
    }

    java.lang.String consumeDigitSequence() {
        int start = pos;
        while ((pos) < (length)) {
            char c = input[pos];
            if ((c >= '0') && (c <= '9'))
                (pos)++;
            else
                break;
            
        }
        return cacheString(start, ((pos) - start));
    }

    boolean matches(char c) {
        return (!(isEmpty())) && ((input[pos]) == c);
    }

    boolean matches(java.lang.String seq) {
        int scanLength = seq.length();
        if (scanLength > ((length) - (pos)))
            return false;
        
        for (int offset = 0 ; offset < scanLength ; offset++)
            if ((seq.charAt(offset)) != (input[((pos) + offset)]))
                return false;
            
        return true;
    }

    boolean matchesIgnoreCase(java.lang.String seq) {
        int scanLength = seq.length();
        if (scanLength > ((length) - (pos)))
            return false;
        
        for (int offset = 0 ; offset < scanLength ; offset++) {
            char upScan = java.lang.Character.toUpperCase(seq.charAt(offset));
            char upTarget = java.lang.Character.toUpperCase(input[((pos) + offset)]);
            if (upScan != upTarget)
                return false;
            
        }
        return true;
    }

    boolean matchesAny(char... seq) {
        if (isEmpty())
            return false;
        
        char c = input[pos];
        for (char seek : seq) {
            if (seek == c)
                return true;
            
        }
        return false;
    }

    boolean matchesAnySorted(char[] seq) {
        return (!(isEmpty())) && ((java.util.Arrays.binarySearch(seq, input[pos])) >= 0);
    }

    boolean matchesLetter() {
        if (isEmpty())
            return false;
        
        char c = input[pos];
        return ((c >= 'A') && (c <= 'Z')) || ((c >= 'a') && (c <= 'z'));
    }

    boolean matchesDigit() {
        if (isEmpty())
            return false;
        
        char c = input[pos];
        return (c >= '0') && (c <= '9');
    }

    boolean matchConsume(java.lang.String seq) {
        if (matches(seq)) {
            pos += seq.length();
            return true;
        } else {
            return false;
        }
    }

    boolean matchConsumeIgnoreCase(java.lang.String seq) {
        if (matchesIgnoreCase(seq)) {
            pos += seq.length();
            return true;
        } else {
            return false;
        }
    }

    boolean containsIgnoreCase(java.lang.String seq) {
        java.lang.String loScan = seq.toLowerCase(java.util.Locale.ENGLISH);
        java.lang.String hiScan = seq.toUpperCase(java.util.Locale.ENGLISH);
        return ((nextIndexOf(loScan)) > (-1)) || ((nextIndexOf(hiScan)) > (-1));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return new java.lang.String(input , pos , ((length) - (pos)));
    }

    private java.lang.String cacheString(final int start, final int count) {
        final char[] val = input;
        final java.lang.String[] cache = stringCache;
        if (count > (maxCacheLen))
            return new java.lang.String(val , start , count);
        
        int hash = (_constantOperatorMetaMutator9.is("ZERO")?( 0 ):(_constantOperatorMetaMutator9.is("INT_MAX")?( 2147483646 ):(_constantOperatorMetaMutator9.is("MIN_MIN")?( -2147483647 ):(0))));
        int offset = start;
        for (int i = 0 ; i < count ; i++) {
            hash = (31 * hash) + (val[offset++]);
        }
        final int index = hash & ((cache.length) - 1);
        java.lang.String cached = cache[index];
        if (cached == null) {
            cached = new java.lang.String(val , start , count);
            cache[index] = cached;
        } else {
            if (rangeEquals(start, count, cached)) {
                return cached;
            } else {
                cached = new java.lang.String(val , start , count);
            }
        }
        return cached;
    }

    boolean rangeEquals(final int start, int count, final java.lang.String cached) {
        if (count == (cached.length())) {
            char[] one = input;
            int i = start;
            int j = 0;
            while ((count--) != 0) {
                if ((one[i++]) != (cached.charAt(j++)))
                    return false;
                
            }
            return true;
        } 
        return false;
    }

    private static final metamutator.Selector _constantOperatorMetaMutator9 = metamutator.Selector.of(9,new String[]{"ZERO","INT_MAX","MIN_MIN"}).in(org.jsoup.parser.CharacterReader.class).id("_constantOperatorMetaMutator9");
}

