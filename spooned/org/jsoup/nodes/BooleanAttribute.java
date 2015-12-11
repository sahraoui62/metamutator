package org.jsoup.nodes;


public class BooleanAttribute extends org.jsoup.nodes.Attribute {
    public BooleanAttribute(java.lang.String key) {
        super(key, "");
    }

    @java.lang.Override
    protected boolean isBooleanAttribute() {
        return true;
    }
}

