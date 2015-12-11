package org.jsoup.nodes;


public class DocumentType extends org.jsoup.nodes.Node {
    private static final java.lang.String NAME = "name";

    private static final java.lang.String PUBLIC_ID = "publicId";

    private static final java.lang.String SYSTEM_ID = "systemId";

    public DocumentType(java.lang.String name ,java.lang.String publicId ,java.lang.String systemId ,java.lang.String baseUri) {
        super(baseUri);
        attr(NAME, name);
        attr(PUBLIC_ID, publicId);
        attr(SYSTEM_ID, systemId);
    }

    @java.lang.Override
    public java.lang.String nodeName() {
        return "#doctype";
    }

    @java.lang.Override
    void outerHtmlHead(java.lang.StringBuilder accum, int depth, org.jsoup.nodes.Document.OutputSettings out) {
        if ((((out.syntax()) == (org.jsoup.nodes.Document.OutputSettings.Syntax.html)) && (!(has(PUBLIC_ID)))) && (!(has(SYSTEM_ID)))) {
            accum.append("<!doctype");
        } else {
            accum.append("<!DOCTYPE");
        }
        if (has(NAME))
            accum.append(" ").append(attr(NAME));
        
        if (has(PUBLIC_ID))
            accum.append(" PUBLIC \"").append(attr(PUBLIC_ID)).append('"');
        
        if (has(SYSTEM_ID))
            accum.append(" \"").append(attr(SYSTEM_ID)).append('"');
        
        accum.append('>');
    }

    @java.lang.Override
    void outerHtmlTail(java.lang.StringBuilder accum, int depth, org.jsoup.nodes.Document.OutputSettings out) {
    }

    private boolean has(final java.lang.String attribute) {
        return !(org.jsoup.helper.StringUtil.isBlank(attr(attribute)));
    }
}

