package org.jsoup.nodes;


public class Comment extends org.jsoup.nodes.Node {
    private static final java.lang.String COMMENT_KEY = "comment";

    public Comment(java.lang.String data ,java.lang.String baseUri) {
        super(baseUri);
        attributes.put(COMMENT_KEY, data);
    }

    public java.lang.String nodeName() {
        return "#comment";
    }

    public java.lang.String getData() {
        return attributes.get(COMMENT_KEY);
    }

    void outerHtmlHead(java.lang.StringBuilder accum, int depth, org.jsoup.nodes.Document.OutputSettings out) {
        if (out.prettyPrint())
            indent(accum, depth, out);
        
        accum.append("<!--").append(getData()).append("-->");
    }

    void outerHtmlTail(java.lang.StringBuilder accum, int depth, org.jsoup.nodes.Document.OutputSettings out) {
    }

    @java.lang.Override
    public java.lang.String toString() {
        return outerHtml();
    }
}

