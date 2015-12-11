package org.jsoup.select;


public class NodeTraversor {
    private org.jsoup.select.NodeVisitor visitor;

    public NodeTraversor(org.jsoup.select.NodeVisitor visitor) {
        this.visitor = visitor;
    }

    public void traverse(org.jsoup.nodes.Node root) {
        org.jsoup.nodes.Node node = root;
        int depth = 0;
        while (node != null) {
            visitor.head(node, depth);
            if ((node.childNodeSize()) > 0) {
                node = node.childNode(0);
                depth++;
            } else {
                while (((node.nextSibling()) == null) && (depth > 0)) {
                    visitor.tail(node, depth);
                    node = node.parentNode();
                    depth--;
                }
                visitor.tail(node, depth);
                if (node == root)
                    break;
                
                node = node.nextSibling();
            }
        }
    }
}

