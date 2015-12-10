package org.apache.commons.lang3.text.translate;


public class LookupTranslator extends org.apache.commons.lang3.text.translate.CharSequenceTranslator {
    private final java.util.HashMap<java.lang.String, java.lang.String> lookupMap;

    private final java.util.HashSet<java.lang.Character> prefixSet;

    private final int shortest;

    private final int longest;

    public LookupTranslator(final java.lang.CharSequence[]... lookup) {
        lookupMap = new java.util.HashMap<java.lang.String, java.lang.String>();
        prefixSet = new java.util.HashSet<java.lang.Character>();
        int _shortest = java.lang.Integer.MAX_VALUE;
        int _longest = 0;
        if (lookup != null) {
            for (final java.lang.CharSequence[] seq : lookup) {
                this.lookupMap.put(seq[0].toString(), seq[1].toString());
                this.prefixSet.add(seq[0].charAt(0));
                final int sz = seq[0].length();
                if (sz < _shortest) {
                    _shortest = sz;
                } 
                if (sz > _longest) {
                    _longest = sz;
                } 
            }
        } 
        shortest = _shortest;
        longest = _longest;
    }

    @java.lang.Override
    public int translate(final java.lang.CharSequence input, final int index, final java.io.Writer out) throws java.io.IOException {
        if (prefixSet.contains(input.charAt(index))) {
            int max = longest;
            if (((_arithmeticOperatorHotSpot104.is("PLUS")) ? ((index + (longest))) : (_arithmeticOperatorHotSpot104.is("MINUS")) ? ((index - (longest))) : (_arithmeticOperatorHotSpot104.is("MUL")) ? ((index * (longest))) :  ((index / (longest)))) > (input.length())) {
                max = ((_arithmeticOperatorHotSpot105.is("PLUS")) ? ((input.length()) + index) : (_arithmeticOperatorHotSpot105.is("MINUS")) ? ((input.length()) - index) : (_arithmeticOperatorHotSpot105.is("MUL")) ? ((input.length()) * index) :  ((input.length()) / index));
            } 
            for (int i = max ; i >= (shortest) ; i--) {
                final java.lang.CharSequence subSeq = input.subSequence(index, ((_arithmeticOperatorHotSpot106.is("PLUS")) ? ((index + i)) : (_arithmeticOperatorHotSpot106.is("MINUS")) ? ((index - i)) : (_arithmeticOperatorHotSpot106.is("MUL")) ? ((index * i)) :  ((index / i))));
                final java.lang.String result = lookupMap.get(subSeq.toString());
                if (result != null) {
                    out.write(result);
                    return i;
                } 
            }
        } 
        return 0;
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot104 = metamutator.Selector.of(104,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.translate.LookupTranslator.class).id("_arithmeticOperatorHotSpot104");

    private static final metamutator.Selector _arithmeticOperatorHotSpot105 = metamutator.Selector.of(105,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.translate.LookupTranslator.class).id("_arithmeticOperatorHotSpot105");

    private static final metamutator.Selector _arithmeticOperatorHotSpot106 = metamutator.Selector.of(106,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.translate.LookupTranslator.class).id("_arithmeticOperatorHotSpot106");
}

