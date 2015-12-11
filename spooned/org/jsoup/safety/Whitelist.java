package org.jsoup.safety;


public class Whitelist {
    private java.util.Set<org.jsoup.safety.Whitelist.TagName> tagNames;

    private java.util.Map<org.jsoup.safety.Whitelist.TagName, java.util.Set<org.jsoup.safety.Whitelist.AttributeKey>> attributes;

    private java.util.Map<org.jsoup.safety.Whitelist.TagName, java.util.Map<org.jsoup.safety.Whitelist.AttributeKey, org.jsoup.safety.Whitelist.AttributeValue>> enforcedAttributes;

    private java.util.Map<org.jsoup.safety.Whitelist.TagName, java.util.Map<org.jsoup.safety.Whitelist.AttributeKey, java.util.Set<org.jsoup.safety.Whitelist.Protocol>>> protocols;

    private boolean preserveRelativeLinks;

    public static org.jsoup.safety.Whitelist none() {
        return new org.jsoup.safety.Whitelist();
    }

    public static org.jsoup.safety.Whitelist simpleText() {
        return new org.jsoup.safety.Whitelist().addTags("b", "em", "i", "strong", "u");
    }

    public static org.jsoup.safety.Whitelist basic() {
        return new org.jsoup.safety.Whitelist().addTags("a", "b", "blockquote", "br", "cite", "code", "dd", "dl", "dt", "em", "i", "li", "ol", "p", "pre", "q", "small", "span", "strike", "strong", "sub", "sup", "u", "ul").addAttributes("a", "href").addAttributes("blockquote", "cite").addAttributes("q", "cite").addProtocols("a", "href", "ftp", "http", "https", "mailto").addProtocols("blockquote", "cite", "http", "https").addProtocols("cite", "cite", "http", "https").addEnforcedAttribute("a", "rel", "nofollow");
    }

    public static org.jsoup.safety.Whitelist basicWithImages() {
        return org.jsoup.safety.Whitelist.basic().addTags("img").addAttributes("img", "align", "alt", "height", "src", "title", "width").addProtocols("img", "src", "http", "https");
    }

    public static org.jsoup.safety.Whitelist relaxed() {
        return new org.jsoup.safety.Whitelist().addTags("a", "b", "blockquote", "br", "caption", "cite", "code", "col", "colgroup", "dd", "div", "dl", "dt", "em", "h1", "h2", "h3", "h4", "h5", "h6", "i", "img", "li", "ol", "p", "pre", "q", "small", "span", "strike", "strong", "sub", "sup", "table", "tbody", "td", "tfoot", "th", "thead", "tr", "u", "ul").addAttributes("a", "href", "title").addAttributes("blockquote", "cite").addAttributes("col", "span", "width").addAttributes("colgroup", "span", "width").addAttributes("img", "align", "alt", "height", "src", "title", "width").addAttributes("ol", "start", "type").addAttributes("q", "cite").addAttributes("table", "summary", "width").addAttributes("td", "abbr", "axis", "colspan", "rowspan", "width").addAttributes("th", "abbr", "axis", "colspan", "rowspan", "scope", "width").addAttributes("ul", "type").addProtocols("a", "href", "ftp", "http", "https", "mailto").addProtocols("blockquote", "cite", "http", "https").addProtocols("cite", "cite", "http", "https").addProtocols("img", "src", "http", "https").addProtocols("q", "cite", "http", "https");
    }

    public Whitelist() {
        tagNames = new java.util.HashSet<org.jsoup.safety.Whitelist.TagName>();
        attributes = new java.util.HashMap<org.jsoup.safety.Whitelist.TagName, java.util.Set<org.jsoup.safety.Whitelist.AttributeKey>>();
        enforcedAttributes = new java.util.HashMap<org.jsoup.safety.Whitelist.TagName, java.util.Map<org.jsoup.safety.Whitelist.AttributeKey, org.jsoup.safety.Whitelist.AttributeValue>>();
        protocols = new java.util.HashMap<org.jsoup.safety.Whitelist.TagName, java.util.Map<org.jsoup.safety.Whitelist.AttributeKey, java.util.Set<org.jsoup.safety.Whitelist.Protocol>>>();
        preserveRelativeLinks = false;
    }

    public org.jsoup.safety.Whitelist addTags(java.lang.String... tags) {
        org.jsoup.helper.Validate.notNull(tags);
        for (java.lang.String tagName : tags) {
            org.jsoup.helper.Validate.notEmpty(tagName);
            tagNames.add(org.jsoup.safety.Whitelist.TagName.valueOf(tagName));
        }
        return this;
    }

    public org.jsoup.safety.Whitelist removeTags(java.lang.String... tags) {
        org.jsoup.helper.Validate.notNull(tags);
        for (java.lang.String tag : tags) {
            org.jsoup.helper.Validate.notEmpty(tag);
            org.jsoup.safety.Whitelist.TagName tagName = org.jsoup.safety.Whitelist.TagName.valueOf(tag);
            if (tagNames.remove(tagName)) {
                attributes.remove(tagName);
                enforcedAttributes.remove(tagName);
                protocols.remove(tagName);
            } 
        }
        return this;
    }

    public org.jsoup.safety.Whitelist addAttributes(java.lang.String tag, java.lang.String... keys) {
        org.jsoup.helper.Validate.notEmpty(tag);
        org.jsoup.helper.Validate.notNull(keys);
        org.jsoup.helper.Validate.isTrue(((keys.length) > 0), "No attributes supplied.");
        org.jsoup.safety.Whitelist.TagName tagName = org.jsoup.safety.Whitelist.TagName.valueOf(tag);
        if (!(tagNames.contains(tagName)))
            tagNames.add(tagName);
        
        java.util.Set<org.jsoup.safety.Whitelist.AttributeKey> attributeSet = new java.util.HashSet<org.jsoup.safety.Whitelist.AttributeKey>();
        for (java.lang.String key : keys) {
            org.jsoup.helper.Validate.notEmpty(key);
            attributeSet.add(org.jsoup.safety.Whitelist.AttributeKey.valueOf(key));
        }
        if (attributes.containsKey(tagName)) {
            java.util.Set<org.jsoup.safety.Whitelist.AttributeKey> currentSet = attributes.get(tagName);
            currentSet.addAll(attributeSet);
        } else {
            attributes.put(tagName, attributeSet);
        }
        return this;
    }

    public org.jsoup.safety.Whitelist removeAttributes(java.lang.String tag, java.lang.String... keys) {
        org.jsoup.helper.Validate.notEmpty(tag);
        org.jsoup.helper.Validate.notNull(keys);
        org.jsoup.helper.Validate.isTrue(((keys.length) > 0), "No attributes supplied.");
        org.jsoup.safety.Whitelist.TagName tagName = org.jsoup.safety.Whitelist.TagName.valueOf(tag);
        java.util.Set<org.jsoup.safety.Whitelist.AttributeKey> attributeSet = new java.util.HashSet<org.jsoup.safety.Whitelist.AttributeKey>();
        for (java.lang.String key : keys) {
            org.jsoup.helper.Validate.notEmpty(key);
            attributeSet.add(org.jsoup.safety.Whitelist.AttributeKey.valueOf(key));
        }
        if ((tagNames.contains(tagName)) && (attributes.containsKey(tagName))) {
            java.util.Set<org.jsoup.safety.Whitelist.AttributeKey> currentSet = attributes.get(tagName);
            currentSet.removeAll(attributeSet);
            if (currentSet.isEmpty())
                attributes.remove(tagName);
            
        } 
        if (tag.equals(":all"))
            for (org.jsoup.safety.Whitelist.TagName name : attributes.keySet()) {
                java.util.Set<org.jsoup.safety.Whitelist.AttributeKey> currentSet = attributes.get(name);
                currentSet.removeAll(attributeSet);
                if (currentSet.isEmpty())
                    attributes.remove(name);
                
            }
        
        return this;
    }

    public org.jsoup.safety.Whitelist addEnforcedAttribute(java.lang.String tag, java.lang.String key, java.lang.String value) {
        org.jsoup.helper.Validate.notEmpty(tag);
        org.jsoup.helper.Validate.notEmpty(key);
        org.jsoup.helper.Validate.notEmpty(value);
        org.jsoup.safety.Whitelist.TagName tagName = org.jsoup.safety.Whitelist.TagName.valueOf(tag);
        if (!(tagNames.contains(tagName)))
            tagNames.add(tagName);
        
        org.jsoup.safety.Whitelist.AttributeKey attrKey = org.jsoup.safety.Whitelist.AttributeKey.valueOf(key);
        org.jsoup.safety.Whitelist.AttributeValue attrVal = org.jsoup.safety.Whitelist.AttributeValue.valueOf(value);
        if (enforcedAttributes.containsKey(tagName)) {
            enforcedAttributes.get(tagName).put(attrKey, attrVal);
        } else {
            java.util.Map<org.jsoup.safety.Whitelist.AttributeKey, org.jsoup.safety.Whitelist.AttributeValue> attrMap = new java.util.HashMap<org.jsoup.safety.Whitelist.AttributeKey, org.jsoup.safety.Whitelist.AttributeValue>();
            attrMap.put(attrKey, attrVal);
            enforcedAttributes.put(tagName, attrMap);
        }
        return this;
    }

    public org.jsoup.safety.Whitelist removeEnforcedAttribute(java.lang.String tag, java.lang.String key) {
        org.jsoup.helper.Validate.notEmpty(tag);
        org.jsoup.helper.Validate.notEmpty(key);
        org.jsoup.safety.Whitelist.TagName tagName = org.jsoup.safety.Whitelist.TagName.valueOf(tag);
        if ((tagNames.contains(tagName)) && (enforcedAttributes.containsKey(tagName))) {
            org.jsoup.safety.Whitelist.AttributeKey attrKey = org.jsoup.safety.Whitelist.AttributeKey.valueOf(key);
            java.util.Map<org.jsoup.safety.Whitelist.AttributeKey, org.jsoup.safety.Whitelist.AttributeValue> attrMap = enforcedAttributes.get(tagName);
            attrMap.remove(attrKey);
            if (attrMap.isEmpty())
                enforcedAttributes.remove(tagName);
            
        } 
        return this;
    }

    public org.jsoup.safety.Whitelist preserveRelativeLinks(boolean preserve) {
        preserveRelativeLinks = preserve;
        return this;
    }

    public org.jsoup.safety.Whitelist addProtocols(java.lang.String tag, java.lang.String key, java.lang.String... protocols) {
        org.jsoup.helper.Validate.notEmpty(tag);
        org.jsoup.helper.Validate.notEmpty(key);
        org.jsoup.helper.Validate.notNull(protocols);
        org.jsoup.safety.Whitelist.TagName tagName = org.jsoup.safety.Whitelist.TagName.valueOf(tag);
        org.jsoup.safety.Whitelist.AttributeKey attrKey = org.jsoup.safety.Whitelist.AttributeKey.valueOf(key);
        java.util.Map<org.jsoup.safety.Whitelist.AttributeKey, java.util.Set<org.jsoup.safety.Whitelist.Protocol>> attrMap;
        java.util.Set<org.jsoup.safety.Whitelist.Protocol> protSet;
        if (this.protocols.containsKey(tagName)) {
            attrMap = this.protocols.get(tagName);
        } else {
            attrMap = new java.util.HashMap<org.jsoup.safety.Whitelist.AttributeKey, java.util.Set<org.jsoup.safety.Whitelist.Protocol>>();
            this.protocols.put(tagName, attrMap);
        }
        if (attrMap.containsKey(attrKey)) {
            protSet = attrMap.get(attrKey);
        } else {
            protSet = new java.util.HashSet<org.jsoup.safety.Whitelist.Protocol>();
            attrMap.put(attrKey, protSet);
        }
        for (java.lang.String protocol : protocols) {
            org.jsoup.helper.Validate.notEmpty(protocol);
            org.jsoup.safety.Whitelist.Protocol prot = org.jsoup.safety.Whitelist.Protocol.valueOf(protocol);
            protSet.add(prot);
        }
        return this;
    }

    public org.jsoup.safety.Whitelist removeProtocols(java.lang.String tag, java.lang.String key, java.lang.String... protocols) {
        org.jsoup.helper.Validate.notEmpty(tag);
        org.jsoup.helper.Validate.notEmpty(key);
        org.jsoup.helper.Validate.notNull(protocols);
        org.jsoup.safety.Whitelist.TagName tagName = org.jsoup.safety.Whitelist.TagName.valueOf(tag);
        org.jsoup.safety.Whitelist.AttributeKey attrKey = org.jsoup.safety.Whitelist.AttributeKey.valueOf(key);
        if (this.protocols.containsKey(tagName)) {
            java.util.Map<org.jsoup.safety.Whitelist.AttributeKey, java.util.Set<org.jsoup.safety.Whitelist.Protocol>> attrMap = this.protocols.get(tagName);
            if (attrMap.containsKey(attrKey)) {
                java.util.Set<org.jsoup.safety.Whitelist.Protocol> protSet = attrMap.get(attrKey);
                for (java.lang.String protocol : protocols) {
                    org.jsoup.helper.Validate.notEmpty(protocol);
                    org.jsoup.safety.Whitelist.Protocol prot = org.jsoup.safety.Whitelist.Protocol.valueOf(protocol);
                    protSet.remove(prot);
                }
                if (protSet.isEmpty()) {
                    attrMap.remove(attrKey);
                    if (attrMap.isEmpty())
                        this.protocols.remove(tagName);
                    
                } 
            } 
        } 
        return this;
    }

    protected boolean isSafeTag(java.lang.String tag) {
        return tagNames.contains(org.jsoup.safety.Whitelist.TagName.valueOf(tag));
    }

    protected boolean isSafeAttribute(java.lang.String tagName, org.jsoup.nodes.Element el, org.jsoup.nodes.Attribute attr) {
        org.jsoup.safety.Whitelist.TagName tag = org.jsoup.safety.Whitelist.TagName.valueOf(tagName);
        org.jsoup.safety.Whitelist.AttributeKey key = org.jsoup.safety.Whitelist.AttributeKey.valueOf(attr.getKey());
        if (attributes.containsKey(tag)) {
            if (attributes.get(tag).contains(key)) {
                if (protocols.containsKey(tag)) {
                    java.util.Map<org.jsoup.safety.Whitelist.AttributeKey, java.util.Set<org.jsoup.safety.Whitelist.Protocol>> attrProts = protocols.get(tag);
                    return (!(attrProts.containsKey(key))) || (testValidProtocol(el, attr, attrProts.get(key)));
                } else {
                    return true;
                }
            } 
        } 
        return (!(tagName.equals(":all"))) && (isSafeAttribute(":all", el, attr));
    }

    private boolean testValidProtocol(org.jsoup.nodes.Element el, org.jsoup.nodes.Attribute attr, java.util.Set<org.jsoup.safety.Whitelist.Protocol> protocols) {
        java.lang.String value = el.absUrl(attr.getKey());
        if ((value.length()) == 0)
            value = attr.getValue();
        
        if (!(preserveRelativeLinks))
            attr.setValue(value);
        
        for (org.jsoup.safety.Whitelist.Protocol protocol : protocols) {
            java.lang.String prot = protocol.toString();
            if (prot.equals("#")) {
                if (isValidAnchor(value)) {
                    return true;
                } else {
                    continue;
                }
            } 
            prot += ":";
            if (value.toLowerCase().startsWith(prot)) {
                return true;
            } 
        }
        return false;
    }

    private boolean isValidAnchor(java.lang.String value) {
        return (value.startsWith("#")) && (!(value.matches(".*\\s.*")));
    }

    org.jsoup.nodes.Attributes getEnforcedAttributes(java.lang.String tagName) {
        org.jsoup.nodes.Attributes attrs = new org.jsoup.nodes.Attributes();
        org.jsoup.safety.Whitelist.TagName tag = org.jsoup.safety.Whitelist.TagName.valueOf(tagName);
        if (enforcedAttributes.containsKey(tag)) {
            java.util.Map<org.jsoup.safety.Whitelist.AttributeKey, org.jsoup.safety.Whitelist.AttributeValue> keyVals = enforcedAttributes.get(tag);
            for (java.util.Map.Entry<org.jsoup.safety.Whitelist.AttributeKey, org.jsoup.safety.Whitelist.AttributeValue> entry : keyVals.entrySet()) {
                attrs.put(entry.getKey().toString(), entry.getValue().toString());
            }
        } 
        return attrs;
    }

    static class TagName extends org.jsoup.safety.Whitelist.TypedValue {
        TagName(java.lang.String value) {
            super(value);
        }

        static org.jsoup.safety.Whitelist.TagName valueOf(java.lang.String value) {
            return new org.jsoup.safety.Whitelist.TagName(value);
        }
    }

    static class AttributeKey extends org.jsoup.safety.Whitelist.TypedValue {
        AttributeKey(java.lang.String value) {
            super(value);
        }

        static org.jsoup.safety.Whitelist.AttributeKey valueOf(java.lang.String value) {
            return new org.jsoup.safety.Whitelist.AttributeKey(value);
        }
    }

    static class AttributeValue extends org.jsoup.safety.Whitelist.TypedValue {
        AttributeValue(java.lang.String value) {
            super(value);
        }

        static org.jsoup.safety.Whitelist.AttributeValue valueOf(java.lang.String value) {
            return new org.jsoup.safety.Whitelist.AttributeValue(value);
        }
    }

    static class Protocol extends org.jsoup.safety.Whitelist.TypedValue {
        Protocol(java.lang.String value) {
            super(value);
        }

        static org.jsoup.safety.Whitelist.Protocol valueOf(java.lang.String value) {
            return new org.jsoup.safety.Whitelist.Protocol(value);
        }
    }

    abstract static class TypedValue {
        private java.lang.String value;

        TypedValue(java.lang.String value) {
            org.jsoup.helper.Validate.notNull(value);
            this.value = value;
        }

        @java.lang.Override
        public int hashCode() {
            final int prime = (_constantOperatorMetaMutator121.is("ZERO")?( 0 ):(_constantOperatorMetaMutator121.is("INT_MAX")?( 2147483646 ):(_constantOperatorMetaMutator121.is("MIN_MIN")?( -2147483647 ):(31))));
            int result = (_constantOperatorMetaMutator122.is("ZERO")?( 0 ):(_constantOperatorMetaMutator122.is("INT_MAX")?( 2147483646 ):(_constantOperatorMetaMutator122.is("MIN_MIN")?( -2147483647 ):(1))));
            result = (prime * result) + ((value) == null ? 0 : value.hashCode());
            return result;
        }

        @java.lang.Override
        public boolean equals(java.lang.Object obj) {
            if ((this) == obj)
                return true;
            
            if (obj == null)
                return false;
            
            if ((getClass()) != (obj.getClass()))
                return false;
            
            org.jsoup.safety.Whitelist.TypedValue other = ((org.jsoup.safety.Whitelist.TypedValue)(obj));
            if ((value) == null) {
                if ((other.value) != null)
                    return false;
                
            } else if (!(value.equals(other.value)))
                return false;
            
            return true;
        }

        @java.lang.Override
        public java.lang.String toString() {
            return value;
        }
    }

    private static final metamutator.Selector _constantOperatorMetaMutator121 = metamutator.Selector.of(121,new String[]{"ZERO","INT_MAX","MIN_MIN"}).id("_constantOperatorMetaMutator121");

    private static final metamutator.Selector _constantOperatorMetaMutator122 = metamutator.Selector.of(122,new String[]{"ZERO","INT_MAX","MIN_MIN"}).id("_constantOperatorMetaMutator122");
}

