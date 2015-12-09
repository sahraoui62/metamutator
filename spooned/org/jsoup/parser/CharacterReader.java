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
                return ((_arithmeticOperatorHotSpot49.is("PLUS") ? (i + (pos))) : (_arithmeticOperatorHotSpot49.is("MINUS") ? (i - (pos))) : (_arithmeticOperatorHotSpot49.is("MUL") ? (i * (pos))) : (_arithmeticOperatorHotSpot49.is("DIV") ? (i / (pos))));
            
        }
        return -1;
    }

    int nextIndexOf(java.lang.CharSequence seq) {
        char startChar = seq.charAt(0);
        for (int offset = pos ; offset < (length) ; offset++) {
            if (startChar != (input[offset]))
                while (((++offset) < (length)) && (startChar != (input[offset]))) {
                }
            
            int i = ((_arithmeticOperatorHotSpot50.is("PLUS") ? (offset + 1)) : (_arithmeticOperatorHotSpot50.is("MINUS") ? (offset - 1)) : (_arithmeticOperatorHotSpot50.is("MUL") ? (offset * 1)) : (_arithmeticOperatorHotSpot50.is("DIV") ? (offset / 1)));
            int last = ((_arithmeticOperatorHotSpot51.is("PLUS") ? ((i + (seq.length())))) : (_arithmeticOperatorHotSpot51.is("MINUS") ? ((i - (seq.length())))) : (_arithmeticOperatorHotSpot51.is("MUL") ? ((i * (seq.length())))) : (_arithmeticOperatorHotSpot51.is("DIV") ? ((i / (seq.length()))))) - 1;
            if ((offset < (length)) && (last <= (length))) {
                for (int j = 1 ; (i < last) && ((seq.charAt(j)) == (input[i])) ; i++ , j++) {
                }
                if (i == last)
                    return ((_arithmeticOperatorHotSpot52.is("PLUS") ? (offset + (pos))) : (_arithmeticOperatorHotSpot52.is("MINUS") ? (offset - (pos))) : (_arithmeticOperatorHotSpot52.is("MUL") ? (offset * (pos))) : (_arithmeticOperatorHotSpot52.is("DIV") ? (offset / (pos))));
                
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
        return (pos) > start ? cacheString(start, ((_arithmeticOperatorHotSpot61.is("PLUS") ? (((pos) + start))) : (_arithmeticOperatorHotSpot61.is("MINUS") ? (((pos) - start))) : (_arithmeticOperatorHotSpot61.is("MUL") ? (((pos) * start))) : (_arithmeticOperatorHotSpot61.is("DIV") ? (((pos) / start))))) : "";
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
        return (pos) > start ? cacheString(start, ((_arithmeticOperatorHotSpot62.is("PLUS") ? (((pos) + start))) : (_arithmeticOperatorHotSpot62.is("MINUS") ? (((pos) - start))) : (_arithmeticOperatorHotSpot62.is("MUL") ? (((pos) * start))) : (_arithmeticOperatorHotSpot62.is("DIV") ? (((pos) / start))))) : "";
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
        return (pos) > start ? cacheString(start, ((_arithmeticOperatorHotSpot55.is("PLUS") ? (((pos) + start))) : (_arithmeticOperatorHotSpot55.is("MINUS") ? (((pos) - start))) : (_arithmeticOperatorHotSpot55.is("MUL") ? (((pos) * start))) : (_arithmeticOperatorHotSpot55.is("DIV") ? (((pos) / start))))) : "";
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
        return (pos) > start ? cacheString(start, ((_arithmeticOperatorHotSpot60.is("PLUS") ? (((pos) + start))) : (_arithmeticOperatorHotSpot60.is("MINUS") ? (((pos) - start))) : (_arithmeticOperatorHotSpot60.is("MUL") ? (((pos) * start))) : (_arithmeticOperatorHotSpot60.is("DIV") ? (((pos) / start))))) : "";
    }

    java.lang.String consumeToEnd() {
        java.lang.String data = cacheString(pos, ((_arithmeticOperatorHotSpot63.is("PLUS") ? (((length) + (pos)))) : (_arithmeticOperatorHotSpot63.is("MINUS") ? (((length) - (pos)))) : (_arithmeticOperatorHotSpot63.is("MUL") ? (((length) * (pos)))) : (_arithmeticOperatorHotSpot63.is("DIV") ? (((length) / (pos))))));
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
        return cacheString(start, ((_arithmeticOperatorHotSpot58.is("PLUS") ? (((pos) + start))) : (_arithmeticOperatorHotSpot58.is("MINUS") ? (((pos) - start))) : (_arithmeticOperatorHotSpot58.is("MUL") ? (((pos) * start))) : (_arithmeticOperatorHotSpot58.is("DIV") ? (((pos) / start)))));
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
        return cacheString(start, ((_arithmeticOperatorHotSpot59.is("PLUS") ? (((pos) + start))) : (_arithmeticOperatorHotSpot59.is("MINUS") ? (((pos) - start))) : (_arithmeticOperatorHotSpot59.is("MUL") ? (((pos) * start))) : (_arithmeticOperatorHotSpot59.is("DIV") ? (((pos) / start)))));
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
        return cacheString(start, ((_arithmeticOperatorHotSpot57.is("PLUS") ? (((pos) + start))) : (_arithmeticOperatorHotSpot57.is("MINUS") ? (((pos) - start))) : (_arithmeticOperatorHotSpot57.is("MUL") ? (((pos) * start))) : (_arithmeticOperatorHotSpot57.is("DIV") ? (((pos) / start)))));
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
        return cacheString(start, ((_arithmeticOperatorHotSpot56.is("PLUS") ? (((pos) + start))) : (_arithmeticOperatorHotSpot56.is("MINUS") ? (((pos) - start))) : (_arithmeticOperatorHotSpot56.is("MUL") ? (((pos) * start))) : (_arithmeticOperatorHotSpot56.is("DIV") ? (((pos) / start)))));
    }

    boolean matches(char c) {
        return (!(isEmpty())) && ((input[pos]) == c);
    }

    boolean matches(java.lang.String seq) {
        int scanLength = seq.length();
        if (scanLength > ((_arithmeticOperatorHotSpot45.is("PLUS") ? (((length) + (pos)))) : (_arithmeticOperatorHotSpot45.is("MINUS") ? (((length) - (pos)))) : (_arithmeticOperatorHotSpot45.is("MUL") ? (((length) * (pos)))) : (_arithmeticOperatorHotSpot45.is("DIV") ? (((length) / (pos))))))
            return false;
        
        for (int offset = 0 ; offset < scanLength ; offset++)
            if ((seq.charAt(offset)) != (input[((_arithmeticOperatorHotSpot46.is("PLUS") ? (((pos) + offset))) : (_arithmeticOperatorHotSpot46.is("MINUS") ? (((pos) - offset))) : (_arithmeticOperatorHotSpot46.is("MUL") ? (((pos) * offset))) : (_arithmeticOperatorHotSpot46.is("DIV") ? (((pos) / offset))))]))
                return false;
            
        return true;
    }

    boolean matchesIgnoreCase(java.lang.String seq) {
        int scanLength = seq.length();
        if (scanLength > ((_arithmeticOperatorHotSpot47.is("PLUS") ? (((length) + (pos)))) : (_arithmeticOperatorHotSpot47.is("MINUS") ? (((length) - (pos)))) : (_arithmeticOperatorHotSpot47.is("MUL") ? (((length) * (pos)))) : (_arithmeticOperatorHotSpot47.is("DIV") ? (((length) / (pos))))))
            return false;
        
        for (int offset = 0 ; offset < scanLength ; offset++) {
            char upScan = java.lang.Character.toUpperCase(seq.charAt(offset));
            char upTarget = java.lang.Character.toUpperCase(input[((_arithmeticOperatorHotSpot48.is("PLUS") ? (((pos) + offset))) : (_arithmeticOperatorHotSpot48.is("MINUS") ? (((pos) - offset))) : (_arithmeticOperatorHotSpot48.is("MUL") ? (((pos) * offset))) : (_arithmeticOperatorHotSpot48.is("DIV") ? (((pos) / offset))))]);
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
        return new java.lang.String(input , pos , ((_arithmeticOperatorHotSpot64.is("PLUS") ? (((length) + (pos)))) : (_arithmeticOperatorHotSpot64.is("MINUS") ? (((length) - (pos)))) : (_arithmeticOperatorHotSpot64.is("MUL") ? (((length) * (pos)))) : (_arithmeticOperatorHotSpot64.is("DIV") ? (((length) / (pos))))));
    }

    private java.lang.String cacheString(final int start, final int count) {
        final char[] val = input;
        final java.lang.String[] cache = stringCache;
        if (count > (maxCacheLen))
            return new java.lang.String(val , start , count);
        
        int hash = 0;
        int offset = start;
        for (int i = 0 ; i < count ; i++) {
            hash = ((_arithmeticOperatorHotSpot53.is("PLUS") ? ((31 + hash))) : (_arithmeticOperatorHotSpot53.is("MINUS") ? ((31 - hash))) : (_arithmeticOperatorHotSpot53.is("MUL") ? ((31 * hash))) : (_arithmeticOperatorHotSpot53.is("DIV") ? ((31 / hash)))) + (val[offset++]);
        }
        final int index = hash & ((_arithmeticOperatorHotSpot54.is("PLUS") ? (((cache.length) + 1))) : (_arithmeticOperatorHotSpot54.is("MINUS") ? (((cache.length) - 1))) : (_arithmeticOperatorHotSpot54.is("MUL") ? (((cache.length) * 1))) : (_arithmeticOperatorHotSpot54.is("DIV") ? (((cache.length) / 1))));
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

    private static final metamutator.Selector _arithmeticOperatorHotSpot45 = metamutator.Selector.of(45,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.jsoup.parser.CharacterReader.class).id("_arithmeticOperatorHotSpot45");

    private static final metamutator.Selector _arithmeticOperatorHotSpot46 = metamutator.Selector.of(46,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.jsoup.parser.CharacterReader.class).id("_arithmeticOperatorHotSpot46");

    private static final metamutator.Selector _arithmeticOperatorHotSpot47 = metamutator.Selector.of(47,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.jsoup.parser.CharacterReader.class).id("_arithmeticOperatorHotSpot47");

    private static final metamutator.Selector _arithmeticOperatorHotSpot48 = metamutator.Selector.of(48,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.jsoup.parser.CharacterReader.class).id("_arithmeticOperatorHotSpot48");

    private static final metamutator.Selector _arithmeticOperatorHotSpot49 = metamutator.Selector.of(49,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.jsoup.parser.CharacterReader.class).id("_arithmeticOperatorHotSpot49");

    private static final metamutator.Selector _arithmeticOperatorHotSpot50 = metamutator.Selector.of(50,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.jsoup.parser.CharacterReader.class).id("_arithmeticOperatorHotSpot50");

    private static final metamutator.Selector _arithmeticOperatorHotSpot51 = metamutator.Selector.of(51,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.jsoup.parser.CharacterReader.class).id("_arithmeticOperatorHotSpot51");

    private static final metamutator.Selector _arithmeticOperatorHotSpot52 = metamutator.Selector.of(52,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.jsoup.parser.CharacterReader.class).id("_arithmeticOperatorHotSpot52");

    private static final metamutator.Selector _arithmeticOperatorHotSpot53 = metamutator.Selector.of(53,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.jsoup.parser.CharacterReader.class).id("_arithmeticOperatorHotSpot53");

    private static final metamutator.Selector _arithmeticOperatorHotSpot54 = metamutator.Selector.of(54,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.jsoup.parser.CharacterReader.class).id("_arithmeticOperatorHotSpot54");

    private static final metamutator.Selector _arithmeticOperatorHotSpot55 = metamutator.Selector.of(55,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.jsoup.parser.CharacterReader.class).id("_arithmeticOperatorHotSpot55");

    private static final metamutator.Selector _arithmeticOperatorHotSpot56 = metamutator.Selector.of(56,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.jsoup.parser.CharacterReader.class).id("_arithmeticOperatorHotSpot56");

    private static final metamutator.Selector _arithmeticOperatorHotSpot57 = metamutator.Selector.of(57,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.jsoup.parser.CharacterReader.class).id("_arithmeticOperatorHotSpot57");

    private static final metamutator.Selector _arithmeticOperatorHotSpot58 = metamutator.Selector.of(58,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.jsoup.parser.CharacterReader.class).id("_arithmeticOperatorHotSpot58");

    private static final metamutator.Selector _arithmeticOperatorHotSpot59 = metamutator.Selector.of(59,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.jsoup.parser.CharacterReader.class).id("_arithmeticOperatorHotSpot59");

    private static final metamutator.Selector _arithmeticOperatorHotSpot60 = metamutator.Selector.of(60,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.jsoup.parser.CharacterReader.class).id("_arithmeticOperatorHotSpot60");

    private static final metamutator.Selector _arithmeticOperatorHotSpot61 = metamutator.Selector.of(61,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.jsoup.parser.CharacterReader.class).id("_arithmeticOperatorHotSpot61");

    private static final metamutator.Selector _arithmeticOperatorHotSpot62 = metamutator.Selector.of(62,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.jsoup.parser.CharacterReader.class).id("_arithmeticOperatorHotSpot62");

    private static final metamutator.Selector _arithmeticOperatorHotSpot63 = metamutator.Selector.of(63,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.jsoup.parser.CharacterReader.class).id("_arithmeticOperatorHotSpot63");

    private static final metamutator.Selector _arithmeticOperatorHotSpot64 = metamutator.Selector.of(64,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.jsoup.parser.CharacterReader.class).id("_arithmeticOperatorHotSpot64");
}

