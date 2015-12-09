package org.jsoup.nodes;


public class XmlDeclaration extends org.jsoup.nodes.Node {
    static final java.lang.String DECL_KEY = "declaration";

    private final boolean isProcessingInstruction;

    public XmlDeclaration(java.lang.String data ,java.lang.String baseUri ,boolean isProcessingInstruction) {
        super(baseUri);
        attributes.put(DECL_KEY, data);
        this.isProcessingInstruction = isProcessingInstruction;
    }

    public java.lang.String nodeName() {
        return "#declaration";
    }

    public java.lang.String getWholeDeclaration() {
        final java.lang.String decl = attributes.get(DECL_KEY);
        if ((decl.equals("xml")) && ((attributes.size()) > 1)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(decl);
            final java.lang.String version = attributes.get("version");
            if (version != null) {
                sb.append(" version=\"").append(version).append("\"");
            } 
            final java.lang.String encoding = attributes.get("encoding");
            if (encoding != null) {
                sb.append(" encoding=\"").append(encoding).append("\"");
            } 
            return sb.toString();
        } else {
            return attributes.get(DECL_KEY);
        }
    }

    void outerHtmlHead(java.lang.StringBuilder accum, int depth, org.jsoup.nodes.Document.OutputSettings out) {
        accum.append("<").append((isProcessingInstruction ? "!" : "?")).append(getWholeDeclaration()).append(">");
    }

    void outerHtmlTail(java.lang.StringBuilder accum, int depth, org.jsoup.nodes.Document.OutputSettings out) {
    }

    @java.lang.Override
    public java.lang.String toString() {
        return outerHtml();
    }
}

