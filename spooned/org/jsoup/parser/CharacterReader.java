package org.jsoup.parser;


final class CharacterReader {
    static final char EOF = ((char)(-1));

    private static final int maxCacheLen = 12;

    private final char[] input;

    private final int length;

    private int pos = (_constantOperatorMetaMutator36.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator36.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator36.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(0))));

    private int mark = (_constantOperatorMetaMutator66.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator66.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator66.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(0))));

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
        for (int i = (_constantOperatorMetaMutator43.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator43.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator43.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(pos)))) ; i < (length) ; i++) {
            if (c == (input[i]))
                return i - (pos);
            
        }
        return -1;
    }

    int nextIndexOf(java.lang.CharSequence seq) {
        char startChar = seq.charAt(0);
        for (int offset = (_constantOperatorMetaMutator44.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator44.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator44.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(pos)))) ; offset < (length) ; offset++) {
            if (startChar != (input[offset]))
                while (((++offset) < (length)) && (startChar != (input[offset]))) {
                }
            
            int i = (_constantOperatorMetaMutator45.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator45.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator45.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(offset + 1))));
            int last = (_constantOperatorMetaMutator46.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator46.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator46.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):((i + (seq.length())) - 1))));
            if ((offset < (length)) && (last <= (length))) {
                for (int j = (_constantOperatorMetaMutator47.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator47.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator47.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(1)))) ; (i < last) && ((seq.charAt(j)) == (input[i])) ; i++ , j++) {
                }
                if (i == last)
                    return offset - (pos);
                
            } 
        }
        return -1;
    }

    java.lang.String consumeTo(char c) {
        int offset = (_constantOperatorMetaMutator60.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator60.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator60.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(nextIndexOf(c)))));
        if (offset != (-1)) {
            java.lang.String consumed = cacheString(pos, offset);
            pos += offset;
            return consumed;
        } else {
            return consumeToEnd();
        }
    }

    java.lang.String consumeTo(java.lang.String seq) {
        int offset = (_constantOperatorMetaMutator61.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator61.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator61.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(nextIndexOf(seq)))));
        if (offset != (-1)) {
            java.lang.String consumed = cacheString(pos, offset);
            pos += offset;
            return consumed;
        } else {
            return consumeToEnd();
        }
    }

    java.lang.String consumeToAny(final char... chars) {
        final int start = (_constantOperatorMetaMutator63.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator63.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator63.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(pos))));
        final int remaining = (_constantOperatorMetaMutator62.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator62.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator62.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(length))));
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
        final int start = (_constantOperatorMetaMutator65.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator65.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator65.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(pos))));
        final int remaining = (_constantOperatorMetaMutator64.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator64.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator64.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(length))));
        final char[] val = input;
        while ((pos) < remaining) {
            if ((java.util.Arrays.binarySearch(chars, val[pos])) >= 0)
                break;
            
            (pos)++;
        }
        return (pos) > start ? cacheString(start, ((pos) - start)) : "";
    }

    java.lang.String consumeData() {
        final int start = (_constantOperatorMetaMutator53.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator53.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator53.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(pos))));
        final int remaining = (_constantOperatorMetaMutator52.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator52.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator52.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(length))));
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
        final int start = (_constantOperatorMetaMutator59.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator59.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator59.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(pos))));
        final int remaining = (_constantOperatorMetaMutator58.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator58.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator58.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(length))));
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
        int start = (_constantOperatorMetaMutator56.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator56.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator56.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(pos))));
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
        int start = (_constantOperatorMetaMutator57.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator57.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator57.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(pos))));
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
        int start = (_constantOperatorMetaMutator55.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator55.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator55.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(pos))));
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
        int start = (_constantOperatorMetaMutator54.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator54.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator54.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(pos))));
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
        int scanLength = (_constantOperatorMetaMutator37.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator37.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator37.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(seq.length()))));
        if (scanLength > ((length) - (pos)))
            return false;
        
        for (int offset = (_constantOperatorMetaMutator38.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator38.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator38.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(0)))) ; offset < scanLength ; offset++)
            if ((seq.charAt(offset)) != (input[((pos) + offset)]))
                return false;
            
        return true;
    }

    boolean matchesIgnoreCase(java.lang.String seq) {
        int scanLength = (_constantOperatorMetaMutator39.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator39.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator39.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(seq.length()))));
        if (scanLength > ((length) - (pos)))
            return false;
        
        for (int offset = (_constantOperatorMetaMutator40.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator40.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator40.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(0)))) ; offset < scanLength ; offset++) {
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
        
        int hash = (_constantOperatorMetaMutator49.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator49.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator49.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(0))));
        int offset = (_constantOperatorMetaMutator50.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator50.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator50.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(start))));
        for (int i = (_constantOperatorMetaMutator48.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator48.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator48.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(0)))) ; i < count ; i++) {
            hash = (31 * hash) + (val[offset++]);
        }
        final int index = (_constantOperatorMetaMutator51.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator51.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator51.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(hash & ((cache.length) - 1)))));
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
            int i = (_constantOperatorMetaMutator41.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator41.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator41.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(start))));
            int j = (_constantOperatorMetaMutator42.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator42.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator42.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(0))));
            while ((count--) != 0) {
                if ((one[i++]) != (cached.charAt(j++)))
                    return false;
                
            }
            return true;
        } 
        return false;
    }

    private static final metamutator.Selector _constantOperatorMetaMutator36 = metamutator.Selector.of(36,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.CharacterReader.class).id("_constantOperatorMetaMutator36");

    private static final metamutator.Selector _constantOperatorMetaMutator37 = metamutator.Selector.of(37,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.CharacterReader.class).id("_constantOperatorMetaMutator37");

    private static final metamutator.Selector _constantOperatorMetaMutator38 = metamutator.Selector.of(38,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.CharacterReader.class).id("_constantOperatorMetaMutator38");

    private static final metamutator.Selector _constantOperatorMetaMutator39 = metamutator.Selector.of(39,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.CharacterReader.class).id("_constantOperatorMetaMutator39");

    private static final metamutator.Selector _constantOperatorMetaMutator40 = metamutator.Selector.of(40,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.CharacterReader.class).id("_constantOperatorMetaMutator40");

    private static final metamutator.Selector _constantOperatorMetaMutator41 = metamutator.Selector.of(41,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.CharacterReader.class).id("_constantOperatorMetaMutator41");

    private static final metamutator.Selector _constantOperatorMetaMutator42 = metamutator.Selector.of(42,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.CharacterReader.class).id("_constantOperatorMetaMutator42");

    private static final metamutator.Selector _constantOperatorMetaMutator43 = metamutator.Selector.of(43,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.CharacterReader.class).id("_constantOperatorMetaMutator43");

    private static final metamutator.Selector _constantOperatorMetaMutator44 = metamutator.Selector.of(44,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.CharacterReader.class).id("_constantOperatorMetaMutator44");

    private static final metamutator.Selector _constantOperatorMetaMutator45 = metamutator.Selector.of(45,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.CharacterReader.class).id("_constantOperatorMetaMutator45");

    private static final metamutator.Selector _constantOperatorMetaMutator46 = metamutator.Selector.of(46,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.CharacterReader.class).id("_constantOperatorMetaMutator46");

    private static final metamutator.Selector _constantOperatorMetaMutator47 = metamutator.Selector.of(47,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.CharacterReader.class).id("_constantOperatorMetaMutator47");

    private static final metamutator.Selector _constantOperatorMetaMutator48 = metamutator.Selector.of(48,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.CharacterReader.class).id("_constantOperatorMetaMutator48");

    private static final metamutator.Selector _constantOperatorMetaMutator49 = metamutator.Selector.of(49,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.CharacterReader.class).id("_constantOperatorMetaMutator49");

    private static final metamutator.Selector _constantOperatorMetaMutator50 = metamutator.Selector.of(50,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.CharacterReader.class).id("_constantOperatorMetaMutator50");

    private static final metamutator.Selector _constantOperatorMetaMutator51 = metamutator.Selector.of(51,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.CharacterReader.class).id("_constantOperatorMetaMutator51");

    private static final metamutator.Selector _constantOperatorMetaMutator52 = metamutator.Selector.of(52,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.CharacterReader.class).id("_constantOperatorMetaMutator52");

    private static final metamutator.Selector _constantOperatorMetaMutator53 = metamutator.Selector.of(53,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.CharacterReader.class).id("_constantOperatorMetaMutator53");

    private static final metamutator.Selector _constantOperatorMetaMutator54 = metamutator.Selector.of(54,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.CharacterReader.class).id("_constantOperatorMetaMutator54");

    private static final metamutator.Selector _constantOperatorMetaMutator55 = metamutator.Selector.of(55,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.CharacterReader.class).id("_constantOperatorMetaMutator55");

    private static final metamutator.Selector _constantOperatorMetaMutator56 = metamutator.Selector.of(56,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.CharacterReader.class).id("_constantOperatorMetaMutator56");

    private static final metamutator.Selector _constantOperatorMetaMutator57 = metamutator.Selector.of(57,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.CharacterReader.class).id("_constantOperatorMetaMutator57");

    private static final metamutator.Selector _constantOperatorMetaMutator58 = metamutator.Selector.of(58,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.CharacterReader.class).id("_constantOperatorMetaMutator58");

    private static final metamutator.Selector _constantOperatorMetaMutator59 = metamutator.Selector.of(59,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.CharacterReader.class).id("_constantOperatorMetaMutator59");

    private static final metamutator.Selector _constantOperatorMetaMutator60 = metamutator.Selector.of(60,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.CharacterReader.class).id("_constantOperatorMetaMutator60");

    private static final metamutator.Selector _constantOperatorMetaMutator61 = metamutator.Selector.of(61,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.CharacterReader.class).id("_constantOperatorMetaMutator61");

    private static final metamutator.Selector _constantOperatorMetaMutator62 = metamutator.Selector.of(62,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.CharacterReader.class).id("_constantOperatorMetaMutator62");

    private static final metamutator.Selector _constantOperatorMetaMutator63 = metamutator.Selector.of(63,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.CharacterReader.class).id("_constantOperatorMetaMutator63");

    private static final metamutator.Selector _constantOperatorMetaMutator64 = metamutator.Selector.of(64,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.CharacterReader.class).id("_constantOperatorMetaMutator64");

    private static final metamutator.Selector _constantOperatorMetaMutator65 = metamutator.Selector.of(65,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.CharacterReader.class).id("_constantOperatorMetaMutator65");

    private static final metamutator.Selector _constantOperatorMetaMutator66 = metamutator.Selector.of(66,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.parser.CharacterReader.class).id("_constantOperatorMetaMutator66");
}

