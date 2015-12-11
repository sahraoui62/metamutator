package org.jsoup.helper;


public class W3CDom {
    protected javax.xml.parsers.DocumentBuilderFactory factory = javax.xml.parsers.DocumentBuilderFactory.newInstance();

    public org.w3c.dom.Document fromJsoup(org.jsoup.nodes.Document in) {
        org.jsoup.helper.Validate.notNull(in);
        javax.xml.parsers.DocumentBuilder builder;
        try {
            builder = factory.newDocumentBuilder();
            org.w3c.dom.Document out = builder.newDocument();
            convert(in, out);
            return out;
        } catch (javax.xml.parsers.ParserConfigurationException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public void convert(org.jsoup.nodes.Document in, org.w3c.dom.Document out) {
        if (!(org.jsoup.helper.StringUtil.isBlank(in.location())))
            out.setDocumentURI(in.location());
        
        org.jsoup.nodes.Element rootEl = in.child(0);
        org.jsoup.select.NodeTraversor traversor = new org.jsoup.select.NodeTraversor(new W3CBuilder(out));
        traversor.traverse(rootEl);
    }

    protected class W3CBuilder implements org.jsoup.select.NodeVisitor {
        private final org.w3c.dom.Document doc;

        private org.w3c.dom.Element dest;

        public W3CBuilder(org.w3c.dom.Document doc) {
            this.doc = doc;
        }

        public void head(org.jsoup.nodes.Node source, int depth) {
            if (source instanceof org.jsoup.nodes.Element) {
                org.jsoup.nodes.Element sourceEl = ((org.jsoup.nodes.Element)(source));
                org.w3c.dom.Element el = doc.createElement(sourceEl.tagName());
                copyAttributes(sourceEl, el);
                if ((dest) == null) {
                    doc.appendChild(el);
                } else {
                    dest.appendChild(el);
                }
                dest = el;
            } else if (source instanceof org.jsoup.nodes.TextNode) {
                org.jsoup.nodes.TextNode sourceText = ((org.jsoup.nodes.TextNode)(source));
                org.w3c.dom.Text text = doc.createTextNode(sourceText.getWholeText());
                dest.appendChild(text);
            } else if (source instanceof org.jsoup.nodes.Comment) {
                org.jsoup.nodes.Comment sourceComment = ((org.jsoup.nodes.Comment)(source));
                org.w3c.dom.Comment comment = doc.createComment(sourceComment.getData());
                dest.appendChild(comment);
            } else if (source instanceof org.jsoup.nodes.DataNode) {
                org.jsoup.nodes.DataNode sourceData = ((org.jsoup.nodes.DataNode)(source));
                org.w3c.dom.Text node = doc.createTextNode(sourceData.getWholeData());
                dest.appendChild(node);
            } else {
            }
        }

        public void tail(org.jsoup.nodes.Node source, int depth) {
            if ((source instanceof org.jsoup.nodes.Element) && ((dest.getParentNode()) instanceof org.w3c.dom.Element)) {
                dest = ((org.w3c.dom.Element)(dest.getParentNode()));
            } 
        }

        private void copyAttributes(org.jsoup.nodes.Node source, org.w3c.dom.Element el) {
            for (org.jsoup.nodes.Attribute attribute : source.attributes()) {
                el.setAttribute(attribute.getKey(), attribute.getValue());
            }
        }
    }

    public java.lang.String asString(org.w3c.dom.Document doc) {
        try {
            javax.xml.transform.dom.DOMSource domSource = new javax.xml.transform.dom.DOMSource(doc);
            java.io.StringWriter writer = new java.io.StringWriter();
            javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(writer);
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.transform(domSource, result);
            return writer.toString();
        } catch (javax.xml.transform.TransformerException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }
}

