package org.jsoup.nodes;


public class Element extends org.jsoup.nodes.Node {
    private org.jsoup.parser.Tag tag;

    private static final java.util.regex.Pattern classSplit = java.util.regex.Pattern.compile("\\s+");

    public Element(org.jsoup.parser.Tag tag ,java.lang.String baseUri ,org.jsoup.nodes.Attributes attributes) {
        super(baseUri, attributes);
        org.jsoup.helper.Validate.notNull(tag);
        this.tag = tag;
    }

    public Element(org.jsoup.parser.Tag tag ,java.lang.String baseUri) {
        this(tag, baseUri, new org.jsoup.nodes.Attributes());
    }

    @java.lang.Override
    public java.lang.String nodeName() {
        return tag.getName();
    }

    public java.lang.String tagName() {
        return tag.getName();
    }

    public org.jsoup.nodes.Element tagName(java.lang.String tagName) {
        org.jsoup.helper.Validate.notEmpty(tagName, "Tag name must not be empty.");
        tag = org.jsoup.parser.Tag.valueOf(tagName);
        return this;
    }

    public org.jsoup.parser.Tag tag() {
        return tag;
    }

    public boolean isBlock() {
        return tag.isBlock();
    }

    public java.lang.String id() {
        return attributes.get("id");
    }

    public org.jsoup.nodes.Element attr(java.lang.String attributeKey, java.lang.String attributeValue) {
        super.attr(attributeKey, attributeValue);
        return this;
    }

    public org.jsoup.nodes.Element attr(java.lang.String attributeKey, boolean attributeValue) {
        attributes.put(attributeKey, attributeValue);
        return this;
    }

    public java.util.Map<java.lang.String, java.lang.String> dataset() {
        return attributes.dataset();
    }

    @java.lang.Override
    public final org.jsoup.nodes.Element parent() {
        return ((org.jsoup.nodes.Element)(parentNode));
    }

    public org.jsoup.select.Elements parents() {
        org.jsoup.select.Elements parents = new org.jsoup.select.Elements();
        org.jsoup.nodes.Element.accumulateParents(this, parents);
        return parents;
    }

    private static void accumulateParents(org.jsoup.nodes.Element el, org.jsoup.select.Elements parents) {
        org.jsoup.nodes.Element parent = el.parent();
        if ((parent != null) && (!(parent.tagName().equals("#root")))) {
            parents.add(parent);
            org.jsoup.nodes.Element.accumulateParents(parent, parents);
        } 
    }

    public org.jsoup.nodes.Element child(int index) {
        return children().get(index);
    }

    public org.jsoup.select.Elements children() {
        java.util.List<org.jsoup.nodes.Element> elements = new java.util.ArrayList<org.jsoup.nodes.Element>(childNodes.size());
        for (org.jsoup.nodes.Node node : childNodes) {
            if (node instanceof org.jsoup.nodes.Element)
                elements.add(((org.jsoup.nodes.Element)(node)));
            
        }
        return new org.jsoup.select.Elements(elements);
    }

    public java.util.List<org.jsoup.nodes.TextNode> textNodes() {
        java.util.List<org.jsoup.nodes.TextNode> textNodes = new java.util.ArrayList<org.jsoup.nodes.TextNode>();
        for (org.jsoup.nodes.Node node : childNodes) {
            if (node instanceof org.jsoup.nodes.TextNode)
                textNodes.add(((org.jsoup.nodes.TextNode)(node)));
            
        }
        return java.util.Collections.unmodifiableList(textNodes);
    }

    public java.util.List<org.jsoup.nodes.DataNode> dataNodes() {
        java.util.List<org.jsoup.nodes.DataNode> dataNodes = new java.util.ArrayList<org.jsoup.nodes.DataNode>();
        for (org.jsoup.nodes.Node node : childNodes) {
            if (node instanceof org.jsoup.nodes.DataNode)
                dataNodes.add(((org.jsoup.nodes.DataNode)(node)));
            
        }
        return java.util.Collections.unmodifiableList(dataNodes);
    }

    public org.jsoup.select.Elements select(java.lang.String cssQuery) {
        return org.jsoup.select.Selector.select(cssQuery, this);
    }

    public org.jsoup.nodes.Element appendChild(org.jsoup.nodes.Node child) {
        org.jsoup.helper.Validate.notNull(child);
        reparentChild(child);
        ensureChildNodes();
        childNodes.add(child);
        child.setSiblingIndex(((childNodes.size()) - 1));
        return this;
    }

    public org.jsoup.nodes.Element prependChild(org.jsoup.nodes.Node child) {
        org.jsoup.helper.Validate.notNull(child);
        addChildren(0, child);
        return this;
    }

    public org.jsoup.nodes.Element insertChildren(int index, java.util.Collection<? extends org.jsoup.nodes.Node> children) {
        org.jsoup.helper.Validate.notNull(children, "Children collection to be inserted must not be null.");
        int currentSize = childNodeSize();
        if (index < 0)
            index += currentSize + 1;
        
        org.jsoup.helper.Validate.isTrue(((index >= 0) && (index <= currentSize)), "Insert position out of bounds.");
        java.util.ArrayList<org.jsoup.nodes.Node> nodes = new java.util.ArrayList<org.jsoup.nodes.Node>(children);
        org.jsoup.nodes.Node[] nodeArray = nodes.toArray(new org.jsoup.nodes.Node[nodes.size()]);
        addChildren(index, nodeArray);
        return this;
    }

    public org.jsoup.nodes.Element appendElement(java.lang.String tagName) {
        org.jsoup.nodes.Element child = new org.jsoup.nodes.Element(org.jsoup.parser.Tag.valueOf(tagName) , baseUri());
        appendChild(child);
        return child;
    }

    public org.jsoup.nodes.Element prependElement(java.lang.String tagName) {
        org.jsoup.nodes.Element child = new org.jsoup.nodes.Element(org.jsoup.parser.Tag.valueOf(tagName) , baseUri());
        prependChild(child);
        return child;
    }

    public org.jsoup.nodes.Element appendText(java.lang.String text) {
        org.jsoup.nodes.TextNode node = new org.jsoup.nodes.TextNode(text , baseUri());
        appendChild(node);
        return this;
    }

    public org.jsoup.nodes.Element prependText(java.lang.String text) {
        org.jsoup.nodes.TextNode node = new org.jsoup.nodes.TextNode(text , baseUri());
        prependChild(node);
        return this;
    }

    public org.jsoup.nodes.Element append(java.lang.String html) {
        org.jsoup.helper.Validate.notNull(html);
        java.util.List<org.jsoup.nodes.Node> nodes = org.jsoup.parser.Parser.parseFragment(html, this, baseUri());
        addChildren(nodes.toArray(new org.jsoup.nodes.Node[nodes.size()]));
        return this;
    }

    public org.jsoup.nodes.Element prepend(java.lang.String html) {
        org.jsoup.helper.Validate.notNull(html);
        java.util.List<org.jsoup.nodes.Node> nodes = org.jsoup.parser.Parser.parseFragment(html, this, baseUri());
        addChildren(0, nodes.toArray(new org.jsoup.nodes.Node[nodes.size()]));
        return this;
    }

    @java.lang.Override
    public org.jsoup.nodes.Element before(java.lang.String html) {
        return ((org.jsoup.nodes.Element)(super.before(html)));
    }

    @java.lang.Override
    public org.jsoup.nodes.Element before(org.jsoup.nodes.Node node) {
        return ((org.jsoup.nodes.Element)(super.before(node)));
    }

    @java.lang.Override
    public org.jsoup.nodes.Element after(java.lang.String html) {
        return ((org.jsoup.nodes.Element)(super.after(html)));
    }

    @java.lang.Override
    public org.jsoup.nodes.Element after(org.jsoup.nodes.Node node) {
        return ((org.jsoup.nodes.Element)(super.after(node)));
    }

    public org.jsoup.nodes.Element empty() {
        childNodes.clear();
        return this;
    }

    @java.lang.Override
    public org.jsoup.nodes.Element wrap(java.lang.String html) {
        return ((org.jsoup.nodes.Element)(super.wrap(html)));
    }

    public java.lang.String cssSelector() {
        if ((id().length()) > 0)
            return "#" + (id());
        
        java.lang.StringBuilder selector = new java.lang.StringBuilder(tagName());
        java.lang.String classes = org.jsoup.helper.StringUtil.join(classNames(), ".");
        if ((classes.length()) > 0)
            selector.append('.').append(classes);
        
        if (((parent()) == null) || ((parent()) instanceof org.jsoup.nodes.Document))
            return selector.toString();
        
        selector.insert(0, " > ");
        if ((parent().select(selector.toString()).size()) > 1)
            selector.append(java.lang.String.format(":nth-child(%d)", ((elementSiblingIndex()) + 1)));
        
        return (parent().cssSelector()) + (selector.toString());
    }

    public org.jsoup.select.Elements siblingElements() {
        if ((parentNode) == null)
            return new org.jsoup.select.Elements(0);
        
        java.util.List<org.jsoup.nodes.Element> elements = parent().children();
        org.jsoup.select.Elements siblings = new org.jsoup.select.Elements(((elements.size()) - 1));
        for (org.jsoup.nodes.Element el : elements)
            if (el != (this))
                siblings.add(el);
            
        return siblings;
    }

    public org.jsoup.nodes.Element nextElementSibling() {
        if ((parentNode) == null)
            return null;
        
        java.util.List<org.jsoup.nodes.Element> siblings = parent().children();
        java.lang.Integer index = org.jsoup.nodes.Element.indexInList(this, siblings);
        org.jsoup.helper.Validate.notNull(index);
        if ((siblings.size()) > (index + 1))
            return siblings.get((index + 1));
        else
            return null;
        
    }

    public org.jsoup.nodes.Element previousElementSibling() {
        if ((parentNode) == null)
            return null;
        
        java.util.List<org.jsoup.nodes.Element> siblings = parent().children();
        java.lang.Integer index = org.jsoup.nodes.Element.indexInList(this, siblings);
        org.jsoup.helper.Validate.notNull(index);
        if (index > 0)
            return siblings.get((index - 1));
        else
            return null;
        
    }

    public org.jsoup.nodes.Element firstElementSibling() {
        java.util.List<org.jsoup.nodes.Element> siblings = parent().children();
        return (siblings.size()) > 1 ? siblings.get(0) : null;
    }

    public java.lang.Integer elementSiblingIndex() {
        if ((parent()) == null)
            return 0;
        
        return org.jsoup.nodes.Element.indexInList(this, parent().children());
    }

    public org.jsoup.nodes.Element lastElementSibling() {
        java.util.List<org.jsoup.nodes.Element> siblings = parent().children();
        return (siblings.size()) > 1 ? siblings.get(((siblings.size()) - 1)) : null;
    }

    private static <E extends org.jsoup.nodes.Element>java.lang.Integer indexInList(org.jsoup.nodes.Element search, java.util.List<E> elements) {
        org.jsoup.helper.Validate.notNull(search);
        org.jsoup.helper.Validate.notNull(elements);
        for (int i = 0 ; i < (elements.size()) ; i++) {
            E element = elements.get(i);
            if (element == search)
                return i;
            
        }
        return null;
    }

    public org.jsoup.select.Elements getElementsByTag(java.lang.String tagName) {
        org.jsoup.helper.Validate.notEmpty(tagName);
        tagName = tagName.toLowerCase().trim();
        return org.jsoup.select.Collector.collect(new org.jsoup.select.Evaluator.Tag(tagName), this);
    }

    public org.jsoup.nodes.Element getElementById(java.lang.String id) {
        org.jsoup.helper.Validate.notEmpty(id);
        org.jsoup.select.Elements elements = org.jsoup.select.Collector.collect(new org.jsoup.select.Evaluator.Id(id), this);
        if ((elements.size()) > 0)
            return elements.get(0);
        else
            return null;
        
    }

    public org.jsoup.select.Elements getElementsByClass(java.lang.String className) {
        org.jsoup.helper.Validate.notEmpty(className);
        return org.jsoup.select.Collector.collect(new org.jsoup.select.Evaluator.Class(className), this);
    }

    public org.jsoup.select.Elements getElementsByAttribute(java.lang.String key) {
        org.jsoup.helper.Validate.notEmpty(key);
        key = key.trim().toLowerCase();
        return org.jsoup.select.Collector.collect(new org.jsoup.select.Evaluator.Attribute(key), this);
    }

    public org.jsoup.select.Elements getElementsByAttributeStarting(java.lang.String keyPrefix) {
        org.jsoup.helper.Validate.notEmpty(keyPrefix);
        keyPrefix = keyPrefix.trim().toLowerCase();
        return org.jsoup.select.Collector.collect(new org.jsoup.select.Evaluator.AttributeStarting(keyPrefix), this);
    }

    public org.jsoup.select.Elements getElementsByAttributeValue(java.lang.String key, java.lang.String value) {
        return org.jsoup.select.Collector.collect(new org.jsoup.select.Evaluator.AttributeWithValue(key , value), this);
    }

    public org.jsoup.select.Elements getElementsByAttributeValueNot(java.lang.String key, java.lang.String value) {
        return org.jsoup.select.Collector.collect(new org.jsoup.select.Evaluator.AttributeWithValueNot(key , value), this);
    }

    public org.jsoup.select.Elements getElementsByAttributeValueStarting(java.lang.String key, java.lang.String valuePrefix) {
        return org.jsoup.select.Collector.collect(new org.jsoup.select.Evaluator.AttributeWithValueStarting(key , valuePrefix), this);
    }

    public org.jsoup.select.Elements getElementsByAttributeValueEnding(java.lang.String key, java.lang.String valueSuffix) {
        return org.jsoup.select.Collector.collect(new org.jsoup.select.Evaluator.AttributeWithValueEnding(key , valueSuffix), this);
    }

    public org.jsoup.select.Elements getElementsByAttributeValueContaining(java.lang.String key, java.lang.String match) {
        return org.jsoup.select.Collector.collect(new org.jsoup.select.Evaluator.AttributeWithValueContaining(key , match), this);
    }

    public org.jsoup.select.Elements getElementsByAttributeValueMatching(java.lang.String key, java.util.regex.Pattern pattern) {
        return org.jsoup.select.Collector.collect(new org.jsoup.select.Evaluator.AttributeWithValueMatching(key , pattern), this);
    }

    public org.jsoup.select.Elements getElementsByAttributeValueMatching(java.lang.String key, java.lang.String regex) {
        java.util.regex.Pattern pattern;
        try {
            pattern = java.util.regex.Pattern.compile(regex);
        } catch (java.util.regex.PatternSyntaxException e) {
            throw new java.lang.IllegalArgumentException(("Pattern syntax error: " + regex) , e);
        }
        return getElementsByAttributeValueMatching(key, pattern);
    }

    public org.jsoup.select.Elements getElementsByIndexLessThan(int index) {
        return org.jsoup.select.Collector.collect(new org.jsoup.select.Evaluator.IndexLessThan(index), this);
    }

    public org.jsoup.select.Elements getElementsByIndexGreaterThan(int index) {
        return org.jsoup.select.Collector.collect(new org.jsoup.select.Evaluator.IndexGreaterThan(index), this);
    }

    public org.jsoup.select.Elements getElementsByIndexEquals(int index) {
        return org.jsoup.select.Collector.collect(new org.jsoup.select.Evaluator.IndexEquals(index), this);
    }

    public org.jsoup.select.Elements getElementsContainingText(java.lang.String searchText) {
        return org.jsoup.select.Collector.collect(new org.jsoup.select.Evaluator.ContainsText(searchText), this);
    }

    public org.jsoup.select.Elements getElementsContainingOwnText(java.lang.String searchText) {
        return org.jsoup.select.Collector.collect(new org.jsoup.select.Evaluator.ContainsOwnText(searchText), this);
    }

    public org.jsoup.select.Elements getElementsMatchingText(java.util.regex.Pattern pattern) {
        return org.jsoup.select.Collector.collect(new org.jsoup.select.Evaluator.Matches(pattern), this);
    }

    public org.jsoup.select.Elements getElementsMatchingText(java.lang.String regex) {
        java.util.regex.Pattern pattern;
        try {
            pattern = java.util.regex.Pattern.compile(regex);
        } catch (java.util.regex.PatternSyntaxException e) {
            throw new java.lang.IllegalArgumentException(("Pattern syntax error: " + regex) , e);
        }
        return getElementsMatchingText(pattern);
    }

    public org.jsoup.select.Elements getElementsMatchingOwnText(java.util.regex.Pattern pattern) {
        return org.jsoup.select.Collector.collect(new org.jsoup.select.Evaluator.MatchesOwn(pattern), this);
    }

    public org.jsoup.select.Elements getElementsMatchingOwnText(java.lang.String regex) {
        java.util.regex.Pattern pattern;
        try {
            pattern = java.util.regex.Pattern.compile(regex);
        } catch (java.util.regex.PatternSyntaxException e) {
            throw new java.lang.IllegalArgumentException(("Pattern syntax error: " + regex) , e);
        }
        return getElementsMatchingOwnText(pattern);
    }

    public org.jsoup.select.Elements getAllElements() {
        return org.jsoup.select.Collector.collect(new org.jsoup.select.Evaluator.AllElements(), this);
    }

    public java.lang.String text() {
        final java.lang.StringBuilder accum = new java.lang.StringBuilder();
        new org.jsoup.select.NodeTraversor(new org.jsoup.select.NodeVisitor() {
            public void head(org.jsoup.nodes.Node node, int depth) {
                if (node instanceof org.jsoup.nodes.TextNode) {
                    org.jsoup.nodes.TextNode textNode = ((org.jsoup.nodes.TextNode)(node));
                    org.jsoup.nodes.Element.appendNormalisedText(accum, textNode);
                } else if (node instanceof org.jsoup.nodes.Element) {
                    org.jsoup.nodes.Element element = ((org.jsoup.nodes.Element)(node));
                    if ((((accum.length()) > 0) && ((element.isBlock()) || (element.tag.getName().equals("br")))) && (!(org.jsoup.nodes.TextNode.lastCharIsWhitespace(accum))))
                        accum.append(" ");
                    
                } 
            }

            public void tail(org.jsoup.nodes.Node node, int depth) {
            }
        }).traverse(this);
        return accum.toString().trim();
    }

    public java.lang.String ownText() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        ownText(sb);
        return sb.toString().trim();
    }

    private void ownText(java.lang.StringBuilder accum) {
        for (org.jsoup.nodes.Node child : childNodes) {
            if (child instanceof org.jsoup.nodes.TextNode) {
                org.jsoup.nodes.TextNode textNode = ((org.jsoup.nodes.TextNode)(child));
                org.jsoup.nodes.Element.appendNormalisedText(accum, textNode);
            } else if (child instanceof org.jsoup.nodes.Element) {
                org.jsoup.nodes.Element.appendWhitespaceIfBr(((org.jsoup.nodes.Element)(child)), accum);
            } 
        }
    }

    private static void appendNormalisedText(java.lang.StringBuilder accum, org.jsoup.nodes.TextNode textNode) {
        java.lang.String text = textNode.getWholeText();
        if (org.jsoup.nodes.Element.preserveWhitespace(textNode.parentNode))
            accum.append(text);
        else
            org.jsoup.helper.StringUtil.appendNormalisedWhitespace(accum, text, org.jsoup.nodes.TextNode.lastCharIsWhitespace(accum));
        
    }

    private static void appendWhitespaceIfBr(org.jsoup.nodes.Element element, java.lang.StringBuilder accum) {
        if ((element.tag.getName().equals("br")) && (!(org.jsoup.nodes.TextNode.lastCharIsWhitespace(accum))))
            accum.append(" ");
        
    }

    static boolean preserveWhitespace(org.jsoup.nodes.Node node) {
        if ((node != null) && (node instanceof org.jsoup.nodes.Element)) {
            org.jsoup.nodes.Element element = ((org.jsoup.nodes.Element)(node));
            return (element.tag.preserveWhitespace()) || (((element.parent()) != null) && (element.parent().tag.preserveWhitespace()));
        } 
        return false;
    }

    public org.jsoup.nodes.Element text(java.lang.String text) {
        org.jsoup.helper.Validate.notNull(text);
        empty();
        org.jsoup.nodes.TextNode textNode = new org.jsoup.nodes.TextNode(text , baseUri);
        appendChild(textNode);
        return this;
    }

    public boolean hasText() {
        for (org.jsoup.nodes.Node child : childNodes) {
            if (child instanceof org.jsoup.nodes.TextNode) {
                org.jsoup.nodes.TextNode textNode = ((org.jsoup.nodes.TextNode)(child));
                if (!(textNode.isBlank()))
                    return true;
                
            } else if (child instanceof org.jsoup.nodes.Element) {
                org.jsoup.nodes.Element el = ((org.jsoup.nodes.Element)(child));
                if (el.hasText())
                    return true;
                
            } 
        }
        return false;
    }

    public java.lang.String data() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (org.jsoup.nodes.Node childNode : childNodes) {
            if (childNode instanceof org.jsoup.nodes.DataNode) {
                org.jsoup.nodes.DataNode data = ((org.jsoup.nodes.DataNode)(childNode));
                sb.append(data.getWholeData());
            } else if (childNode instanceof org.jsoup.nodes.Element) {
                org.jsoup.nodes.Element element = ((org.jsoup.nodes.Element)(childNode));
                java.lang.String elementData = element.data();
                sb.append(elementData);
            } 
        }
        return sb.toString();
    }

    public java.lang.String className() {
        return attr("class").trim();
    }

    public java.util.Set<java.lang.String> classNames() {
        java.lang.String[] names = classSplit.split(className());
        java.util.Set<java.lang.String> classNames = new java.util.LinkedHashSet<java.lang.String>(java.util.Arrays.asList(names));
        classNames.remove("");
        return classNames;
    }

    public org.jsoup.nodes.Element classNames(java.util.Set<java.lang.String> classNames) {
        org.jsoup.helper.Validate.notNull(classNames);
        attributes.put("class", org.jsoup.helper.StringUtil.join(classNames, " "));
        return this;
    }

    public boolean hasClass(java.lang.String className) {
        java.lang.String classAttr = attributes.get("class");
        if ((classAttr.equals("")) || ((classAttr.length()) < (className.length())))
            return false;
        
        final java.lang.String[] classes = classSplit.split(classAttr);
        for (java.lang.String name : classes) {
            if (className.equalsIgnoreCase(name))
                return true;
            
        }
        return false;
    }

    public org.jsoup.nodes.Element addClass(java.lang.String className) {
        org.jsoup.helper.Validate.notNull(className);
        java.util.Set<java.lang.String> classes = classNames();
        classes.add(className);
        classNames(classes);
        return this;
    }

    public org.jsoup.nodes.Element removeClass(java.lang.String className) {
        org.jsoup.helper.Validate.notNull(className);
        java.util.Set<java.lang.String> classes = classNames();
        classes.remove(className);
        classNames(classes);
        return this;
    }

    public org.jsoup.nodes.Element toggleClass(java.lang.String className) {
        org.jsoup.helper.Validate.notNull(className);
        java.util.Set<java.lang.String> classes = classNames();
        if (classes.contains(className))
            classes.remove(className);
        else
            classes.add(className);
        
        classNames(classes);
        return this;
    }

    public java.lang.String val() {
        if (tagName().equals("textarea"))
            return text();
        else
            return attr("value");
        
    }

    public org.jsoup.nodes.Element val(java.lang.String value) {
        if (tagName().equals("textarea"))
            text(value);
        else
            attr("value", value);
        
        return this;
    }

    void outerHtmlHead(java.lang.StringBuilder accum, int depth, org.jsoup.nodes.Document.OutputSettings out) {
        if ((((accum.length()) > 0) && (out.prettyPrint())) && (((tag.formatAsBlock()) || (((parent()) != null) && (parent().tag().formatAsBlock()))) || (out.outline())))
            indent(accum, depth, out);
        
        accum.append("<").append(tagName());
        attributes.html(accum, out);
        if ((childNodes.isEmpty()) && (tag.isSelfClosing())) {
            if (((out.syntax()) == (org.jsoup.nodes.Document.OutputSettings.Syntax.html)) && (tag.isEmpty()))
                accum.append('>');
            else
                accum.append(" />");
            
        } else
            accum.append(">");
        
    }

    void outerHtmlTail(java.lang.StringBuilder accum, int depth, org.jsoup.nodes.Document.OutputSettings out) {
        if (!((childNodes.isEmpty()) && (tag.isSelfClosing()))) {
            if ((out.prettyPrint()) && ((!(childNodes.isEmpty())) && ((tag.formatAsBlock()) || ((out.outline()) && (((childNodes.size()) > 1) || (((childNodes.size()) == 1) && (!((childNodes.get(0)) instanceof org.jsoup.nodes.TextNode))))))))
                indent(accum, depth, out);
            
            accum.append("</").append(tagName()).append(">");
        } 
    }

    public java.lang.String html() {
        java.lang.StringBuilder accum = new java.lang.StringBuilder();
        html(accum);
        return getOutputSettings().prettyPrint() ? accum.toString().trim() : accum.toString();
    }

    private void html(java.lang.StringBuilder accum) {
        for (org.jsoup.nodes.Node node : childNodes)
            node.outerHtml(accum);
    }

    public org.jsoup.nodes.Element html(java.lang.String html) {
        empty();
        append(html);
        return this;
    }

    public java.lang.String toString() {
        return outerHtml();
    }

    @java.lang.Override
    public boolean equals(java.lang.Object o) {
        if ((this) == o)
            return true;
        
        if ((o == null) || ((getClass()) != (o.getClass())))
            return false;
        
        if (!(super.equals(o)))
            return false;
        
        org.jsoup.nodes.Element element = ((org.jsoup.nodes.Element)(o));
        return tag.equals(element.tag);
    }

    @java.lang.Override
    public int hashCode() {
        int result = (_constantOperatorMetaMutator5.is("ZERO")?( 0 ):(_constantOperatorMetaMutator5.is("INT_MAX")?( 2147483646 ):(_constantOperatorMetaMutator5.is("MIN_MIN")?( -2147483647 ):(super.hashCode()))));
        result = (31 * result) + ((tag) != null ? tag.hashCode() : 0);
        return result;
    }

    @java.lang.Override
    public org.jsoup.nodes.Element clone() {
        return ((org.jsoup.nodes.Element)(super.clone()));
    }

    private static final metamutator.Selector _constantOperatorMetaMutator5 = metamutator.Selector.of(5,new String[]{"ZERO","INT_MAX","MIN_MIN"}).in(org.jsoup.nodes.Element.class).id("_constantOperatorMetaMutator5");
}

