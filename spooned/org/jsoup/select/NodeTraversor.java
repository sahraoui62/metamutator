package org.jsoup.select;


public class NodeTraversor {
    private org.jsoup.select.NodeVisitor visitor;

    public NodeTraversor(org.jsoup.select.NodeVisitor visitor) {
        this.visitor = visitor;
    }

    public void traverse(org.jsoup.nodes.Node root) {
        org.jsoup.nodes.Node node = root;
        int depth = (_constantOperatorMetaMutator134.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO)?( 0 ):(_constantOperatorMetaMutator134.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX)?( 2147483646 ):(_constantOperatorMetaMutator134.is(metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN)?( -2147483647 ):(0))));
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

    private static final metamutator.Selector _constantOperatorMetaMutator134 = metamutator.Selector.of(134,new metamutator.ConstantReplacementMetaMutator.CONSTANT_REP[]{metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.ZERO,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.INT_MAX,metamutator.ConstantReplacementMetaMutator.CONSTANT_REP.MIN_MIN}).in(org.jsoup.select.NodeTraversor.class).id("_constantOperatorMetaMutator134");
}

