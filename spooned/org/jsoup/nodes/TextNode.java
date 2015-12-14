package org.jsoup.nodes;


public class TextNode extends org.jsoup.nodes.Node {
    private static final java.lang.String TEXT_KEY = "text";

    java.lang.String text;

    public TextNode(java.lang.String text ,java.lang.String baseUri) {
        this.baseUri = baseUri;
        this.text = text;
    }

    public java.lang.String nodeName() {
        return "#text";
    }

    public java.lang.String text() {
        return org.jsoup.nodes.TextNode.normaliseWhitespace(getWholeText());
    }

    public org.jsoup.nodes.TextNode text(java.lang.String text) {
        this.text = text;
        if ((attributes) != null)
            attributes.put(TEXT_KEY, text);
        
        return this;
    }

    public java.lang.String getWholeText() {
        return (attributes) == null ? text : attributes.get(TEXT_KEY);
    }

    public boolean isBlank() {
        return org.jsoup.helper.StringUtil.isBlank(getWholeText());
    }

    public org.jsoup.nodes.TextNode splitText(int offset) {
        org.jsoup.helper.Validate.isTrue((offset >= 0), "Split offset must be not be negative");
        org.jsoup.helper.Validate.isTrue((offset < (text.length())), "Split offset must not be greater than current text length");
        java.lang.String head = getWholeText().substring(0, offset);
        java.lang.String tail = getWholeText().substring(offset);
        text(head);
        org.jsoup.nodes.TextNode tailNode = new org.jsoup.nodes.TextNode(tail , baseUri());
        if ((parent()) != null)
            parent().addChildren(((siblingIndex()) + 1), tailNode);
        
        return tailNode;
    }

    void outerHtmlHead(java.lang.StringBuilder accum, int depth, org.jsoup.nodes.Document.OutputSettings out) {
        if ((out.prettyPrint()) && ((((((siblingIndex()) == 0) && ((parentNode) instanceof org.jsoup.nodes.Element)) && (((org.jsoup.nodes.Element)(parentNode)).tag().formatAsBlock())) && (!(isBlank()))) || (((out.outline()) && ((siblingNodes().size()) > 0)) && (!(isBlank())))))
            indent(accum, depth, out);
        
        boolean normaliseWhite = ((out.prettyPrint()) && ((parent()) instanceof org.jsoup.nodes.Element)) && (!(org.jsoup.nodes.Element.preserveWhitespace(parent())));
        org.jsoup.nodes.Entities.escape(accum, getWholeText(), out, false, normaliseWhite, false);
    }

    void outerHtmlTail(java.lang.StringBuilder accum, int depth, org.jsoup.nodes.Document.OutputSettings out) {
    }

    @java.lang.Override
    public java.lang.String toString() {
        return outerHtml();
    }

    public static org.jsoup.nodes.TextNode createFromEncoded(java.lang.String encodedText, java.lang.String baseUri) {
        java.lang.String text = org.jsoup.nodes.Entities.unescape(encodedText);
        return new org.jsoup.nodes.TextNode(text , baseUri);
    }

    static java.lang.String normaliseWhitespace(java.lang.String text) {
        text = org.jsoup.helper.StringUtil.normaliseWhitespace(text);
        return text;
    }

    static java.lang.String stripLeadingWhitespace(java.lang.String text) {
        return text.replaceFirst("^\\s+", "");
    }

    static boolean lastCharIsWhitespace(java.lang.StringBuilder sb) {
        return ((sb.length()) != 0) && ((sb.charAt(((sb.length()) - 1))) == ' ');
    }

    private void ensureAttributes() {
        if ((attributes) == null) {
            attributes = new org.jsoup.nodes.Attributes();
            attributes.put(TEXT_KEY, text);
        } 
    }

    @java.lang.Override
    public java.lang.String attr(java.lang.String attributeKey) {
        ensureAttributes();
        return super.attr(attributeKey);
    }

    @java.lang.Override
    public org.jsoup.nodes.Attributes attributes() {
        ensureAttributes();
        return super.attributes();
    }

    @java.lang.Override
    public org.jsoup.nodes.Node attr(java.lang.String attributeKey, java.lang.String attributeValue) {
        ensureAttributes();
        return super.attr(attributeKey, attributeValue);
    }

    @java.lang.Override
    public boolean hasAttr(java.lang.String attributeKey) {
        ensureAttributes();
        return super.hasAttr(attributeKey);
    }

    @java.lang.Override
    public org.jsoup.nodes.Node removeAttr(java.lang.String attributeKey) {
        ensureAttributes();
        return super.removeAttr(attributeKey);
    }

    @java.lang.Override
    public java.lang.String absUrl(java.lang.String attributeKey) {
        ensureAttributes();
        return super.absUrl(attributeKey);
    }

    @java.lang.Override
    public boolean equals(java.lang.Object o) {
        if ((this) == o)
            return true;
        
        if ((o == null) || ((getClass()) != (o.getClass())))
            return false;
        
        if (!(super.equals(o)))
            return false;
        
        org.jsoup.nodes.TextNode textNode = ((org.jsoup.nodes.TextNode)(o));
        return !((text) != null ? !(text.equals(textNode.text)) : (textNode.text) != null);
    }

    @java.lang.Override
    public int hashCode() {
        int result = (_constantOperatorMetaMutator35.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator35.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator35.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(super.hashCode()))));
        result = (31 * result) + ((text) != null ? text.hashCode() : 0);
        return result;
    }

    private static final metamutator.Selector _constantOperatorMetaMutator35 = metamutator.Selector.of(35,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.nodes.TextNode.class).id("_constantOperatorMetaMutator35");
}

