package org.jsoup.parser;


public class TokenQueue {
    private java.lang.String queue;

    private int pos = 0;

    private static final char ESC = '\\';

    public TokenQueue(java.lang.String data) {
        org.jsoup.helper.Validate.notNull(data);
        queue = data;
    }

    public boolean isEmpty() {
        return (remainingLength()) == 0;
    }

    private int remainingLength() {
        return ((_arithmeticOperatorHotSpot103.is("PLUS") ? ((queue.length()) + (pos))) : (_arithmeticOperatorHotSpot103.is("MINUS") ? ((queue.length()) - (pos))) : (_arithmeticOperatorHotSpot103.is("MUL") ? ((queue.length()) * (pos))) : (_arithmeticOperatorHotSpot103.is("DIV") ? ((queue.length()) / (pos))));
    }

    public char peek() {
        return isEmpty() ? 0 : queue.charAt(pos);
    }

    public void addFirst(java.lang.Character c) {
        addFirst(c.toString());
    }

    public void addFirst(java.lang.String seq) {
        queue = ((_arithmeticOperatorHotSpot105.is("PLUS") ? (seq + (queue.substring(pos)))) : (_arithmeticOperatorHotSpot105.is("MINUS") ? (seq - (queue.substring(pos)))) : (_arithmeticOperatorHotSpot105.is("MUL") ? (seq * (queue.substring(pos)))) : (_arithmeticOperatorHotSpot105.is("DIV") ? (seq / (queue.substring(pos)))));
        pos = 0;
    }

    public boolean matches(java.lang.String seq) {
        return queue.regionMatches(true, pos, seq, 0, seq.length());
    }

    public boolean matchesCS(java.lang.String seq) {
        return queue.startsWith(seq, pos);
    }

    public boolean matchesAny(java.lang.String... seq) {
        for (java.lang.String s : seq) {
            if (matches(s))
                return true;
            
        }
        return false;
    }

    public boolean matchesAny(char... seq) {
        if (isEmpty())
            return false;
        
        for (char c : seq) {
            if ((queue.charAt(pos)) == c)
                return true;
            
        }
        return false;
    }

    public boolean matchesStartTag() {
        return (((remainingLength()) >= 2) && ((queue.charAt(pos)) == '<')) && (java.lang.Character.isLetter(queue.charAt(((_arithmeticOperatorHotSpot102.is("PLUS") ? (((pos) + 1))) : (_arithmeticOperatorHotSpot102.is("MINUS") ? (((pos) - 1))) : (_arithmeticOperatorHotSpot102.is("MUL") ? (((pos) * 1))) : (_arithmeticOperatorHotSpot102.is("DIV") ? (((pos) / 1)))))));
    }

    public boolean matchChomp(java.lang.String seq) {
        if (matches(seq)) {
            pos += seq.length();
            return true;
        } else {
            return false;
        }
    }

    public boolean matchesWhitespace() {
        return (!(isEmpty())) && (org.jsoup.helper.StringUtil.isWhitespace(queue.charAt(pos)));
    }

    public boolean matchesWord() {
        return (!(isEmpty())) && (java.lang.Character.isLetterOrDigit(queue.charAt(pos)));
    }

    public void advance() {
        if (!(isEmpty()))
            (pos)++;
        
    }

    public char consume() {
        return queue.charAt((pos)++);
    }

    public void consume(java.lang.String seq) {
        if (!(matches(seq)))
            throw new java.lang.IllegalStateException("Queue did not match expected sequence");
        
        int len = seq.length();
        if (len > (remainingLength()))
            throw new java.lang.IllegalStateException("Queue not long enough to consume sequence");
        
        pos += len;
    }

    public java.lang.String consumeTo(java.lang.String seq) {
        int offset = queue.indexOf(seq, pos);
        if (offset != (-1)) {
            java.lang.String consumed = queue.substring(pos, offset);
            pos += consumed.length();
            return consumed;
        } else {
            return remainder();
        }
    }

    public java.lang.String consumeToIgnoreCase(java.lang.String seq) {
        int start = pos;
        java.lang.String first = seq.substring(0, 1);
        boolean canScan = first.toLowerCase().equals(first.toUpperCase());
        while (!(isEmpty())) {
            if (matches(seq))
                break;
            
            if (canScan) {
                int skip = ((_arithmeticOperatorHotSpot104.is("PLUS") ? ((queue.indexOf(first, pos)) + (pos))) : (_arithmeticOperatorHotSpot104.is("MINUS") ? ((queue.indexOf(first, pos)) - (pos))) : (_arithmeticOperatorHotSpot104.is("MUL") ? ((queue.indexOf(first, pos)) * (pos))) : (_arithmeticOperatorHotSpot104.is("DIV") ? ((queue.indexOf(first, pos)) / (pos))));
                if (skip == 0)
                    (pos)++;
                else if (skip < 0)
                    pos = queue.length();
                else
                    pos += skip;
                
            } else
                (pos)++;
            
        }
        return queue.substring(start, pos);
    }

    public java.lang.String consumeToAny(java.lang.String... seq) {
        int start = pos;
        while ((!(isEmpty())) && (!(matchesAny(seq)))) {
            (pos)++;
        }
        return queue.substring(start, pos);
    }

    public java.lang.String chompTo(java.lang.String seq) {
        java.lang.String data = consumeTo(seq);
        matchChomp(seq);
        return data;
    }

    public java.lang.String chompToIgnoreCase(java.lang.String seq) {
        java.lang.String data = consumeToIgnoreCase(seq);
        matchChomp(seq);
        return data;
    }

    public java.lang.String chompBalanced(char open, char close) {
        int start = -1;
        int end = -1;
        int depth = 0;
        char last = 0;
        do {
            if (isEmpty())
                break;
            
            java.lang.Character c = consume();
            if ((last == 0) || (last != (ESC))) {
                if (c.equals(open)) {
                    depth++;
                    if (start == (-1))
                        start = pos;
                    
                } else if (c.equals(close))
                    depth--;
                
            } 
            if ((depth > 0) && (last != 0))
                end = pos;
            
            last = c;
        } while (depth > 0 );
        return end >= 0 ? queue.substring(start, end) : "";
    }

    public static java.lang.String unescape(java.lang.String in) {
        java.lang.StringBuilder out = new java.lang.StringBuilder();
        char last = 0;
        for (char c : in.toCharArray()) {
            if (c == (ESC)) {
                if ((last != 0) && (last == (ESC)))
                    out.append(c);
                
            } else
                out.append(c);
            
            last = c;
        }
        return out.toString();
    }

    public boolean consumeWhitespace() {
        boolean seen = false;
        while (matchesWhitespace()) {
            (pos)++;
            seen = true;
        }
        return seen;
    }

    public java.lang.String consumeWord() {
        int start = pos;
        while (matchesWord())
            (pos)++;
        return queue.substring(start, pos);
    }

    public java.lang.String consumeTagName() {
        int start = pos;
        while ((!(isEmpty())) && ((matchesWord()) || (matchesAny(':', '_', '-'))))
            (pos)++;
        return queue.substring(start, pos);
    }

    public java.lang.String consumeElementSelector() {
        int start = pos;
        while ((!(isEmpty())) && ((matchesWord()) || (matchesAny('|', '_', '-'))))
            (pos)++;
        return queue.substring(start, pos);
    }

    public java.lang.String consumeCssIdentifier() {
        int start = pos;
        while ((!(isEmpty())) && ((matchesWord()) || (matchesAny('-', '_'))))
            (pos)++;
        return queue.substring(start, pos);
    }

    public java.lang.String consumeAttributeKey() {
        int start = pos;
        while ((!(isEmpty())) && ((matchesWord()) || (matchesAny('-', '_', ':'))))
            (pos)++;
        return queue.substring(start, pos);
    }

    public java.lang.String remainder() {
        final java.lang.String remainder = queue.substring(pos, queue.length());
        pos = queue.length();
        return remainder;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return queue.substring(pos);
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot102 = metamutator.Selector.of(102,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.jsoup.parser.TokenQueue.class).id("_arithmeticOperatorHotSpot102");

    private static final metamutator.Selector _arithmeticOperatorHotSpot103 = metamutator.Selector.of(103,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.jsoup.parser.TokenQueue.class).id("_arithmeticOperatorHotSpot103");

    private static final metamutator.Selector _arithmeticOperatorHotSpot104 = metamutator.Selector.of(104,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.jsoup.parser.TokenQueue.class).id("_arithmeticOperatorHotSpot104");

    private static final metamutator.Selector _arithmeticOperatorHotSpot105 = metamutator.Selector.of(105,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.jsoup.parser.TokenQueue.class).id("_arithmeticOperatorHotSpot105");
}

