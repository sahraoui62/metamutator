package org.jsoup.select;


public interface NodeVisitor {
    void head(org.jsoup.nodes.Node node, int depth);

    void tail(org.jsoup.nodes.Node node, int depth);
}

