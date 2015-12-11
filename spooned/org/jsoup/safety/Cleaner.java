package org.jsoup.safety;


public class Cleaner {
    private org.jsoup.safety.Whitelist whitelist;

    public Cleaner(org.jsoup.safety.Whitelist whitelist) {
        org.jsoup.helper.Validate.notNull(whitelist);
        this.whitelist = whitelist;
    }

    public org.jsoup.nodes.Document clean(org.jsoup.nodes.Document dirtyDocument) {
        org.jsoup.helper.Validate.notNull(dirtyDocument);
        org.jsoup.nodes.Document clean = org.jsoup.nodes.Document.createShell(dirtyDocument.baseUri());
        if ((dirtyDocument.body()) != null)
            copySafeNodes(dirtyDocument.body(), clean.body());
        
        return clean;
    }

    public boolean isValid(org.jsoup.nodes.Document dirtyDocument) {
        org.jsoup.helper.Validate.notNull(dirtyDocument);
        org.jsoup.nodes.Document clean = org.jsoup.nodes.Document.createShell(dirtyDocument.baseUri());
        int numDiscarded = (_constantOperatorMetaMutator119.is("ZERO")?( 0 ):(_constantOperatorMetaMutator119.is("INT_MAX")?( 2147483646 ):(_constantOperatorMetaMutator119.is("MIN_MIN")?( -2147483647 ):(copySafeNodes(dirtyDocument.body(), clean.body())))));
        return numDiscarded == 0;
    }

    private final class CleaningVisitor implements org.jsoup.select.NodeVisitor {
        private int numDiscarded = (_constantOperatorMetaMutator118.is("ZERO")?( 0 ):(_constantOperatorMetaMutator118.is("INT_MAX")?( 2147483646 ):(_constantOperatorMetaMutator118.is("MIN_MIN")?( -2147483647 ):(0))));

        private final org.jsoup.nodes.Element root;

        private org.jsoup.nodes.Element destination;

        private CleaningVisitor(org.jsoup.nodes.Element root ,org.jsoup.nodes.Element destination) {
            this.root = root;
            this.destination = destination;
        }

        public void head(org.jsoup.nodes.Node source, int depth) {
            if (source instanceof org.jsoup.nodes.Element) {
                org.jsoup.nodes.Element sourceEl = ((org.jsoup.nodes.Element)(source));
                if (whitelist.isSafeTag(sourceEl.tagName())) {
                    org.jsoup.safety.Cleaner.ElementMeta meta = createSafeElement(sourceEl);
                    org.jsoup.nodes.Element destChild = meta.el;
                    destination.appendChild(destChild);
                    numDiscarded += meta.numAttribsDiscarded;
                    destination = destChild;
                } else if (source != (root)) {
                    (numDiscarded)++;
                } 
            } else if (source instanceof org.jsoup.nodes.TextNode) {
                org.jsoup.nodes.TextNode sourceText = ((org.jsoup.nodes.TextNode)(source));
                org.jsoup.nodes.TextNode destText = new org.jsoup.nodes.TextNode(sourceText.getWholeText() , source.baseUri());
                destination.appendChild(destText);
            } else if ((source instanceof org.jsoup.nodes.DataNode) && (whitelist.isSafeTag(source.parent().nodeName()))) {
                org.jsoup.nodes.DataNode sourceData = ((org.jsoup.nodes.DataNode)(source));
                org.jsoup.nodes.DataNode destData = new org.jsoup.nodes.DataNode(sourceData.getWholeData() , source.baseUri());
                destination.appendChild(destData);
            } else {
                (numDiscarded)++;
            }
        }

        public void tail(org.jsoup.nodes.Node source, int depth) {
            if ((source instanceof org.jsoup.nodes.Element) && (whitelist.isSafeTag(source.nodeName()))) {
                destination = destination.parent();
            } 
        }
    }

    private int copySafeNodes(org.jsoup.nodes.Element source, org.jsoup.nodes.Element dest) {
        CleaningVisitor cleaningVisitor = new CleaningVisitor(source , dest);
        org.jsoup.select.NodeTraversor traversor = new org.jsoup.select.NodeTraversor(cleaningVisitor);
        traversor.traverse(source);
        return cleaningVisitor.numDiscarded;
    }

    private org.jsoup.safety.Cleaner.ElementMeta createSafeElement(org.jsoup.nodes.Element sourceEl) {
        java.lang.String sourceTag = sourceEl.tagName();
        org.jsoup.nodes.Attributes destAttrs = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Element dest = new org.jsoup.nodes.Element(org.jsoup.parser.Tag.valueOf(sourceTag) , sourceEl.baseUri() , destAttrs);
        int numDiscarded = (_constantOperatorMetaMutator120.is("ZERO")?( 0 ):(_constantOperatorMetaMutator120.is("INT_MAX")?( 2147483646 ):(_constantOperatorMetaMutator120.is("MIN_MIN")?( -2147483647 ):(0))));
        org.jsoup.nodes.Attributes sourceAttrs = sourceEl.attributes();
        for (org.jsoup.nodes.Attribute sourceAttr : sourceAttrs) {
            if (whitelist.isSafeAttribute(sourceTag, sourceEl, sourceAttr))
                destAttrs.put(sourceAttr);
            else
                numDiscarded++;
            
        }
        org.jsoup.nodes.Attributes enforcedAttrs = whitelist.getEnforcedAttributes(sourceTag);
        destAttrs.addAll(enforcedAttrs);
        return new org.jsoup.safety.Cleaner.ElementMeta(dest , numDiscarded);
    }

    private static class ElementMeta {
        org.jsoup.nodes.Element el;

        int numAttribsDiscarded;

        ElementMeta(org.jsoup.nodes.Element el ,int numAttribsDiscarded) {
            this.el = el;
            this.numAttribsDiscarded = numAttribsDiscarded;
        }
    }

    private static final metamutator.Selector _constantOperatorMetaMutator118 = metamutator.Selector.of(118,new String[]{"ZERO","INT_MAX","MIN_MIN"}).id("_constantOperatorMetaMutator118");

    private static final metamutator.Selector _constantOperatorMetaMutator119 = metamutator.Selector.of(119,new String[]{"ZERO","INT_MAX","MIN_MIN"}).in(org.jsoup.safety.Cleaner.class).id("_constantOperatorMetaMutator119");

    private static final metamutator.Selector _constantOperatorMetaMutator120 = metamutator.Selector.of(120,new String[]{"ZERO","INT_MAX","MIN_MIN"}).in(org.jsoup.safety.Cleaner.class).id("_constantOperatorMetaMutator120");
}

