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
            if ((index + (longest)) > (input.length())) {
                max = (input.length()) - index;
            } 
            for (int i = max ; i >= (shortest) ; i--) {
                final java.lang.CharSequence subSeq = input.subSequence(index, (index + i));
                final java.lang.String result = lookupMap.get(subSeq.toString());
                if (result != null) {
                    out.write(result);
                    return ((_returnReplacementOperator1118.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1118.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1118.is("ZERO")) ? ( 0 ) : (i));
                } 
            }
        } 
        return ((_returnReplacementOperator1119.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1119.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1119.is("ZERO")) ? ( 0 ) : (0));
    }

    private static final metamutator.Selector _returnReplacementOperator1118 = metamutator.Selector.of(1118,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.translate.LookupTranslator.class).id("_returnReplacementOperator1118");

    private static final metamutator.Selector _returnReplacementOperator1119 = metamutator.Selector.of(1119,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.translate.LookupTranslator.class).id("_returnReplacementOperator1119");
}

