package org.jsoup.nodes;


public class DataNode extends org.jsoup.nodes.Node {
    private static final java.lang.String DATA_KEY = "data";

    public DataNode(java.lang.String data ,java.lang.String baseUri) {
        super(baseUri);
        attributes.put(DATA_KEY, data);
    }

    public java.lang.String nodeName() {
        return "#data";
    }

    public java.lang.String getWholeData() {
        return attributes.get(DATA_KEY);
    }

    public org.jsoup.nodes.DataNode setWholeData(java.lang.String data) {
        attributes.put(DATA_KEY, data);
        return this;
    }

    void outerHtmlHead(java.lang.StringBuilder accum, int depth, org.jsoup.nodes.Document.OutputSettings out) {
        accum.append(getWholeData());
    }

    void outerHtmlTail(java.lang.StringBuilder accum, int depth, org.jsoup.nodes.Document.OutputSettings out) {
    }

    @java.lang.Override
    public java.lang.String toString() {
        return outerHtml();
    }

    public static org.jsoup.nodes.DataNode createFromEncoded(java.lang.String encodedData, java.lang.String baseUri) {
        java.lang.String data = org.jsoup.nodes.Entities.unescape(encodedData);
        return new org.jsoup.nodes.DataNode(data , baseUri);
    }
}

