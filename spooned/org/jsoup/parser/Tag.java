package org.jsoup.parser;


public class Tag {
    private static final java.util.Map<java.lang.String, org.jsoup.parser.Tag> tags = new java.util.HashMap<java.lang.String, org.jsoup.parser.Tag>();

    private java.lang.String tagName;

    private boolean isBlock = true;

    private boolean formatAsBlock = true;

    private boolean canContainBlock = true;

    private boolean canContainInline = true;

    private boolean empty = false;

    private boolean selfClosing = false;

    private boolean preserveWhitespace = false;

    private boolean formList = false;

    private boolean formSubmit = false;

    private Tag(java.lang.String tagName) {
        this.tagName = tagName.toLowerCase();
    }

    public java.lang.String getName() {
        return tagName;
    }

    public static org.jsoup.parser.Tag valueOf(java.lang.String tagName) {
        org.jsoup.helper.Validate.notNull(tagName);
        org.jsoup.parser.Tag tag = tags.get(tagName);
        if (tag == null) {
            tagName = tagName.trim().toLowerCase();
            org.jsoup.helper.Validate.notEmpty(tagName);
            tag = tags.get(tagName);
            if (tag == null) {
                tag = new org.jsoup.parser.Tag(tagName);
                tag.isBlock = false;
                tag.canContainBlock = true;
            } 
        } 
        return tag;
    }

    public boolean isBlock() {
        return isBlock;
    }

    public boolean formatAsBlock() {
        return formatAsBlock;
    }

    public boolean canContainBlock() {
        return canContainBlock;
    }

    public boolean isInline() {
        return !(isBlock);
    }

    public boolean isData() {
        return (!(canContainInline)) && (!(isEmpty()));
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isSelfClosing() {
        return (empty) || (selfClosing);
    }

    public boolean isKnownTag() {
        return tags.containsKey(tagName);
    }

    public static boolean isKnownTag(java.lang.String tagName) {
        return tags.containsKey(tagName);
    }

    public boolean preserveWhitespace() {
        return preserveWhitespace;
    }

    public boolean isFormListed() {
        return formList;
    }

    public boolean isFormSubmittable() {
        return formSubmit;
    }

    org.jsoup.parser.Tag setSelfClosing() {
        selfClosing = true;
        return this;
    }

    @java.lang.Override
    public boolean equals(java.lang.Object o) {
        if ((this) == o)
            return true;
        
        if (!(o instanceof org.jsoup.parser.Tag))
            return false;
        
        org.jsoup.parser.Tag tag = ((org.jsoup.parser.Tag)(o));
        if (!(tagName.equals(tag.tagName)))
            return false;
        
        if ((canContainBlock) != (tag.canContainBlock))
            return false;
        
        if ((canContainInline) != (tag.canContainInline))
            return false;
        
        if ((empty) != (tag.empty))
            return false;
        
        if ((formatAsBlock) != (tag.formatAsBlock))
            return false;
        
        if ((isBlock) != (tag.isBlock))
            return false;
        
        if ((preserveWhitespace) != (tag.preserveWhitespace))
            return false;
        
        if ((selfClosing) != (tag.selfClosing))
            return false;
        
        if ((formList) != (tag.formList))
            return false;
        
        return (formSubmit) == (tag.formSubmit);
    }

    @java.lang.Override
    public int hashCode() {
        int result = (_constantOperatorMetaMutator90.is("ZERO")?( 0 ):(_constantOperatorMetaMutator90.is("INT_MAX")?( 2147483646 ):(_constantOperatorMetaMutator90.is("MIN_MIN")?( -2147483647 ):(tagName.hashCode()))));
        result = (31 * result) + (isBlock ? 1 : 0);
        result = (31 * result) + (formatAsBlock ? 1 : 0);
        result = (31 * result) + (canContainBlock ? 1 : 0);
        result = (31 * result) + (canContainInline ? 1 : 0);
        result = (31 * result) + (empty ? 1 : 0);
        result = (31 * result) + (selfClosing ? 1 : 0);
        result = (31 * result) + (preserveWhitespace ? 1 : 0);
        result = (31 * result) + (formList ? 1 : 0);
        result = (31 * result) + (formSubmit ? 1 : 0);
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return tagName;
    }

    private static final java.lang.String[] blockTags = new java.lang.String[]{ "html" , "head" , "body" , "frameset" , "script" , "noscript" , "style" , "meta" , "link" , "title" , "frame" , "noframes" , "section" , "nav" , "aside" , "hgroup" , "header" , "footer" , "p" , "h1" , "h2" , "h3" , "h4" , "h5" , "h6" , "ul" , "ol" , "pre" , "div" , "blockquote" , "hr" , "address" , "figure" , "figcaption" , "form" , "fieldset" , "ins" , "del" , "s" , "dl" , "dt" , "dd" , "li" , "table" , "caption" , "thead" , "tfoot" , "tbody" , "colgroup" , "col" , "tr" , "th" , "td" , "video" , "audio" , "canvas" , "details" , "menu" , "plaintext" , "template" , "article" , "main" , "svg" , "math" };

    private static final java.lang.String[] inlineTags = new java.lang.String[]{ "object" , "base" , "font" , "tt" , "i" , "b" , "u" , "big" , "small" , "em" , "strong" , "dfn" , "code" , "samp" , "kbd" , "var" , "cite" , "abbr" , "time" , "acronym" , "mark" , "ruby" , "rt" , "rp" , "a" , "img" , "br" , "wbr" , "map" , "q" , "sub" , "sup" , "bdo" , "iframe" , "embed" , "span" , "input" , "select" , "textarea" , "label" , "button" , "optgroup" , "option" , "legend" , "datalist" , "keygen" , "output" , "progress" , "meter" , "area" , "param" , "source" , "track" , "summary" , "command" , "device" , "area" , "basefont" , "bgsound" , "menuitem" , "param" , "source" , "track" , "data" , "bdi" };

    private static final java.lang.String[] emptyTags = new java.lang.String[]{ "meta" , "link" , "base" , "frame" , "img" , "br" , "wbr" , "embed" , "hr" , "input" , "keygen" , "col" , "command" , "device" , "area" , "basefont" , "bgsound" , "menuitem" , "param" , "source" , "track" };

    private static final java.lang.String[] formatAsInlineTags = new java.lang.String[]{ "title" , "a" , "p" , "h1" , "h2" , "h3" , "h4" , "h5" , "h6" , "pre" , "address" , "li" , "th" , "td" , "script" , "style" , "ins" , "del" , "s" };

    private static final java.lang.String[] preserveWhitespaceTags = new java.lang.String[]{ "pre" , "plaintext" , "title" , "textarea" };

    private static final java.lang.String[] formListedTags = new java.lang.String[]{ "button" , "fieldset" , "input" , "keygen" , "object" , "output" , "select" , "textarea" };

    private static final java.lang.String[] formSubmitTags = new java.lang.String[]{ "input" , "keygen" , "object" , "select" , "textarea" };

    static {
        for (java.lang.String tagName : blockTags) {
            org.jsoup.parser.Tag tag = new org.jsoup.parser.Tag(tagName);
            org.jsoup.parser.Tag.register(tag);
        }
        for (java.lang.String tagName : inlineTags) {
            org.jsoup.parser.Tag tag = new org.jsoup.parser.Tag(tagName);
            tag.isBlock = false;
            tag.canContainBlock = false;
            tag.formatAsBlock = false;
            org.jsoup.parser.Tag.register(tag);
        }
        for (java.lang.String tagName : emptyTags) {
            org.jsoup.parser.Tag tag = tags.get(tagName);
            org.jsoup.helper.Validate.notNull(tag);
            tag.canContainBlock = false;
            tag.canContainInline = false;
            tag.empty = true;
        }
        for (java.lang.String tagName : formatAsInlineTags) {
            org.jsoup.parser.Tag tag = tags.get(tagName);
            org.jsoup.helper.Validate.notNull(tag);
            tag.formatAsBlock = false;
        }
        for (java.lang.String tagName : preserveWhitespaceTags) {
            org.jsoup.parser.Tag tag = tags.get(tagName);
            org.jsoup.helper.Validate.notNull(tag);
            tag.preserveWhitespace = true;
        }
        for (java.lang.String tagName : formListedTags) {
            org.jsoup.parser.Tag tag = tags.get(tagName);
            org.jsoup.helper.Validate.notNull(tag);
            tag.formList = true;
        }
        for (java.lang.String tagName : formSubmitTags) {
            org.jsoup.parser.Tag tag = tags.get(tagName);
            org.jsoup.helper.Validate.notNull(tag);
            tag.formSubmit = true;
        }
    }

    private static void register(org.jsoup.parser.Tag tag) {
        tags.put(tag.tagName, tag);
    }

    private static final metamutator.Selector _constantOperatorMetaMutator90 = metamutator.Selector.of(90,new String[]{"ZERO","INT_MAX","MIN_MIN"}).in(org.jsoup.parser.Tag.class).id("_constantOperatorMetaMutator90");
}

