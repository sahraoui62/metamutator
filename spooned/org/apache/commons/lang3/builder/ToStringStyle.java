package org.apache.commons.lang3.builder;


public abstract class ToStringStyle implements java.io.Serializable {
    private static final long serialVersionUID = -2587890625525655916L;

    public static final org.apache.commons.lang3.builder.ToStringStyle DEFAULT_STYLE = new org.apache.commons.lang3.builder.ToStringStyle.DefaultToStringStyle();

    public static final org.apache.commons.lang3.builder.ToStringStyle MULTI_LINE_STYLE = new org.apache.commons.lang3.builder.ToStringStyle.MultiLineToStringStyle();

    public static final org.apache.commons.lang3.builder.ToStringStyle NO_FIELD_NAMES_STYLE = new org.apache.commons.lang3.builder.ToStringStyle.NoFieldNameToStringStyle();

    public static final org.apache.commons.lang3.builder.ToStringStyle SHORT_PREFIX_STYLE = new org.apache.commons.lang3.builder.ToStringStyle.ShortPrefixToStringStyle();

    public static final org.apache.commons.lang3.builder.ToStringStyle SIMPLE_STYLE = new org.apache.commons.lang3.builder.ToStringStyle.SimpleToStringStyle();

    public static final org.apache.commons.lang3.builder.ToStringStyle NO_CLASS_NAME_STYLE = new org.apache.commons.lang3.builder.ToStringStyle.NoClassNameToStringStyle();

    public static final org.apache.commons.lang3.builder.ToStringStyle JSON_STYLE = new org.apache.commons.lang3.builder.ToStringStyle.JsonToStringStyle();

    private static final java.lang.ThreadLocal<java.util.WeakHashMap<java.lang.Object, java.lang.Object>> REGISTRY = new java.lang.ThreadLocal<java.util.WeakHashMap<java.lang.Object, java.lang.Object>>();

    static java.util.Map<java.lang.Object, java.lang.Object> getRegistry() {
        return ((_returnReplacementOperatorHotSpot435.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.builder.ToStringStyle.REGISTRY.get()));
    }

    static boolean isRegistered(final java.lang.Object value) {
        final java.util.Map<java.lang.Object, java.lang.Object> m = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        return ((_returnReplacementOperatorHotSpot417.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((m != null) && (m.containsKey(value))));
    }

    static void register(final java.lang.Object value) {
        if (value != null) {
            final java.util.Map<java.lang.Object, java.lang.Object> m = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
            if (m == null) {
                REGISTRY.set(new java.util.WeakHashMap<java.lang.Object, java.lang.Object>());
            } 
            org.apache.commons.lang3.builder.ToStringStyle.getRegistry().put(value, null);
        } 
    }

    static void unregister(final java.lang.Object value) {
        if (value != null) {
            final java.util.Map<java.lang.Object, java.lang.Object> m = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
            if (m != null) {
                m.remove(value);
                if (m.isEmpty()) {
                    REGISTRY.remove();
                } 
            } 
        } 
    }

    private boolean useFieldNames = true;

    private boolean useClassName = true;

    private boolean useShortClassName = false;

    private boolean useIdentityHashCode = true;

    private java.lang.String contentStart = "[";

    private java.lang.String contentEnd = "]";

    private java.lang.String fieldNameValueSeparator = "=";

    private boolean fieldSeparatorAtStart = false;

    private boolean fieldSeparatorAtEnd = false;

    private java.lang.String fieldSeparator = ",";

    private java.lang.String arrayStart = "{";

    private java.lang.String arraySeparator = ",";

    private boolean arrayContentDetail = true;

    private java.lang.String arrayEnd = "}";

    private boolean defaultFullDetail = true;

    private java.lang.String nullText = "<null>";

    private java.lang.String sizeStartText = "<size=";

    private java.lang.String sizeEndText = ">";

    private java.lang.String summaryObjectStartText = "<";

    private java.lang.String summaryObjectEndText = ">";

    protected ToStringStyle() {
        super();
    }

    public void appendSuper(final java.lang.StringBuffer buffer, final java.lang.String superToString) {
        appendToString(buffer, superToString);
    }

    public void appendToString(final java.lang.StringBuffer buffer, final java.lang.String toString) {
        if (toString != null) {
            final int pos1 = (toString.indexOf(contentStart)) + (contentStart.length());
            final int pos2 = toString.lastIndexOf(contentEnd);
            if (((pos1 != pos2) && (pos1 >= 0)) && (pos2 >= 0)) {
                final java.lang.String data = toString.substring(pos1, pos2);
                if (fieldSeparatorAtStart) {
                    removeLastFieldSeparator(buffer);
                } 
                buffer.append(data);
                appendFieldSeparator(buffer);
            } 
        } 
    }

    public void appendStart(final java.lang.StringBuffer buffer, final java.lang.Object object) {
        if (object != null) {
            appendClassName(buffer, object);
            appendIdentityHashCode(buffer, object);
            appendContentStart(buffer);
            if (fieldSeparatorAtStart) {
                appendFieldSeparator(buffer);
            } 
        } 
    }

    public void appendEnd(final java.lang.StringBuffer buffer, final java.lang.Object object) {
        if ((this.fieldSeparatorAtEnd) == false) {
            removeLastFieldSeparator(buffer);
        } 
        appendContentEnd(buffer);
        org.apache.commons.lang3.builder.ToStringStyle.unregister(object);
    }

    protected void removeLastFieldSeparator(final java.lang.StringBuffer buffer) {
        final int len = buffer.length();
        final int sepLen = fieldSeparator.length();
        if (((len > 0) && (sepLen > 0)) && (len >= sepLen)) {
            boolean match = true;
            for (int i = 0 ; i < sepLen ; i++) {
                if ((buffer.charAt(((len - 1) - i))) != (fieldSeparator.charAt(((sepLen - 1) - i)))) {
                    match = false;
                    break;
                } 
            }
            if (match) {
                buffer.setLength((len - sepLen));
            } 
        } 
    }

    public void append(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final java.lang.Object value, final java.lang.Boolean fullDetail) {
        appendFieldStart(buffer, fieldName);
        if (value == null) {
            appendNullText(buffer, fieldName);
        } else {
            appendInternal(buffer, fieldName, value, isFullDetail(fullDetail));
        }
        appendFieldEnd(buffer, fieldName);
    }

    protected void appendInternal(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final java.lang.Object value, final boolean detail) {
        if ((org.apache.commons.lang3.builder.ToStringStyle.isRegistered(value)) && (!(((value instanceof java.lang.Number) || (value instanceof java.lang.Boolean)) || (value instanceof java.lang.Character)))) {
            appendCyclicObject(buffer, fieldName, value);
            return ;
        } 
        org.apache.commons.lang3.builder.ToStringStyle.register(value);
        try {
            if (value instanceof java.util.Collection<?>) {
                if (detail) {
                    appendDetail(buffer, fieldName, ((java.util.Collection<?>)(value)));
                } else {
                    appendSummarySize(buffer, fieldName, ((java.util.Collection<?>)(value)).size());
                }
            } else if (value instanceof java.util.Map<?, ?>) {
                if (detail) {
                    appendDetail(buffer, fieldName, ((java.util.Map<?, ?>)(value)));
                } else {
                    appendSummarySize(buffer, fieldName, ((java.util.Map<?, ?>)(value)).size());
                }
            } else if (value instanceof long[]) {
                if (detail) {
                    appendDetail(buffer, fieldName, ((long[])(value)));
                } else {
                    appendSummary(buffer, fieldName, ((long[])(value)));
                }
            } else if (value instanceof int[]) {
                if (detail) {
                    appendDetail(buffer, fieldName, ((int[])(value)));
                } else {
                    appendSummary(buffer, fieldName, ((int[])(value)));
                }
            } else if (value instanceof short[]) {
                if (detail) {
                    appendDetail(buffer, fieldName, ((short[])(value)));
                } else {
                    appendSummary(buffer, fieldName, ((short[])(value)));
                }
            } else if (value instanceof byte[]) {
                if (detail) {
                    appendDetail(buffer, fieldName, ((byte[])(value)));
                } else {
                    appendSummary(buffer, fieldName, ((byte[])(value)));
                }
            } else if (value instanceof char[]) {
                if (detail) {
                    appendDetail(buffer, fieldName, ((char[])(value)));
                } else {
                    appendSummary(buffer, fieldName, ((char[])(value)));
                }
            } else if (value instanceof double[]) {
                if (detail) {
                    appendDetail(buffer, fieldName, ((double[])(value)));
                } else {
                    appendSummary(buffer, fieldName, ((double[])(value)));
                }
            } else if (value instanceof float[]) {
                if (detail) {
                    appendDetail(buffer, fieldName, ((float[])(value)));
                } else {
                    appendSummary(buffer, fieldName, ((float[])(value)));
                }
            } else if (value instanceof boolean[]) {
                if (detail) {
                    appendDetail(buffer, fieldName, ((boolean[])(value)));
                } else {
                    appendSummary(buffer, fieldName, ((boolean[])(value)));
                }
            } else if (value.getClass().isArray()) {
                if (detail) {
                    appendDetail(buffer, fieldName, ((java.lang.Object[])(value)));
                } else {
                    appendSummary(buffer, fieldName, ((java.lang.Object[])(value)));
                }
            } else {
                if (detail) {
                    appendDetail(buffer, fieldName, value);
                } else {
                    appendSummary(buffer, fieldName, value);
                }
            }
        } finally {
            org.apache.commons.lang3.builder.ToStringStyle.unregister(value);
        }
    }

    protected void appendCyclicObject(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final java.lang.Object value) {
        org.apache.commons.lang3.ObjectUtils.identityToString(buffer, value);
    }

    protected void appendDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final java.lang.Object value) {
        buffer.append(value);
    }

    protected void appendDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final java.util.Collection<?> coll) {
        buffer.append(coll);
    }

    protected void appendDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final java.util.Map<?, ?> map) {
        buffer.append(map);
    }

    protected void appendSummary(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final java.lang.Object value) {
        buffer.append(summaryObjectStartText);
        buffer.append(getShortClassName(value.getClass()));
        buffer.append(summaryObjectEndText);
    }

    public void append(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final long value) {
        appendFieldStart(buffer, fieldName);
        appendDetail(buffer, fieldName, value);
        appendFieldEnd(buffer, fieldName);
    }

    protected void appendDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final long value) {
        buffer.append(value);
    }

    public void append(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final int value) {
        appendFieldStart(buffer, fieldName);
        appendDetail(buffer, fieldName, value);
        appendFieldEnd(buffer, fieldName);
    }

    protected void appendDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final int value) {
        buffer.append(value);
    }

    public void append(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final short value) {
        appendFieldStart(buffer, fieldName);
        appendDetail(buffer, fieldName, value);
        appendFieldEnd(buffer, fieldName);
    }

    protected void appendDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final short value) {
        buffer.append(value);
    }

    public void append(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final byte value) {
        appendFieldStart(buffer, fieldName);
        appendDetail(buffer, fieldName, value);
        appendFieldEnd(buffer, fieldName);
    }

    protected void appendDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final byte value) {
        buffer.append(value);
    }

    public void append(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final char value) {
        appendFieldStart(buffer, fieldName);
        appendDetail(buffer, fieldName, value);
        appendFieldEnd(buffer, fieldName);
    }

    protected void appendDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final char value) {
        buffer.append(value);
    }

    public void append(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final double value) {
        appendFieldStart(buffer, fieldName);
        appendDetail(buffer, fieldName, value);
        appendFieldEnd(buffer, fieldName);
    }

    protected void appendDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final double value) {
        buffer.append(value);
    }

    public void append(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final float value) {
        appendFieldStart(buffer, fieldName);
        appendDetail(buffer, fieldName, value);
        appendFieldEnd(buffer, fieldName);
    }

    protected void appendDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final float value) {
        buffer.append(value);
    }

    public void append(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final boolean value) {
        appendFieldStart(buffer, fieldName);
        appendDetail(buffer, fieldName, value);
        appendFieldEnd(buffer, fieldName);
    }

    protected void appendDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final boolean value) {
        buffer.append(value);
    }

    public void append(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final java.lang.Object[] array, final java.lang.Boolean fullDetail) {
        appendFieldStart(buffer, fieldName);
        if (array == null) {
            appendNullText(buffer, fieldName);
        } else if (isFullDetail(fullDetail)) {
            appendDetail(buffer, fieldName, array);
        } else {
            appendSummary(buffer, fieldName, array);
        }
        appendFieldEnd(buffer, fieldName);
    }

    protected void appendDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final java.lang.Object[] array) {
        buffer.append(arrayStart);
        for (int i = 0 ; i < (array.length) ; i++) {
            final java.lang.Object item = array[i];
            if (i > 0) {
                buffer.append(arraySeparator);
            } 
            if (item == null) {
                appendNullText(buffer, fieldName);
            } else {
                appendInternal(buffer, fieldName, item, arrayContentDetail);
            }
        }
        buffer.append(arrayEnd);
    }

    protected void reflectionAppendArrayDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final java.lang.Object array) {
        buffer.append(arrayStart);
        final int length = java.lang.reflect.Array.getLength(array);
        for (int i = 0 ; i < length ; i++) {
            final java.lang.Object item = java.lang.reflect.Array.get(array, i);
            if (i > 0) {
                buffer.append(arraySeparator);
            } 
            if (item == null) {
                appendNullText(buffer, fieldName);
            } else {
                appendInternal(buffer, fieldName, item, arrayContentDetail);
            }
        }
        buffer.append(arrayEnd);
    }

    protected void appendSummary(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final java.lang.Object[] array) {
        appendSummarySize(buffer, fieldName, array.length);
    }

    public void append(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final long[] array, final java.lang.Boolean fullDetail) {
        appendFieldStart(buffer, fieldName);
        if (array == null) {
            appendNullText(buffer, fieldName);
        } else if (isFullDetail(fullDetail)) {
            appendDetail(buffer, fieldName, array);
        } else {
            appendSummary(buffer, fieldName, array);
        }
        appendFieldEnd(buffer, fieldName);
    }

    protected void appendDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final long[] array) {
        buffer.append(arrayStart);
        for (int i = 0 ; i < (array.length) ; i++) {
            if (i > 0) {
                buffer.append(arraySeparator);
            } 
            appendDetail(buffer, fieldName, array[i]);
        }
        buffer.append(arrayEnd);
    }

    protected void appendSummary(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final long[] array) {
        appendSummarySize(buffer, fieldName, array.length);
    }

    public void append(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final int[] array, final java.lang.Boolean fullDetail) {
        appendFieldStart(buffer, fieldName);
        if (array == null) {
            appendNullText(buffer, fieldName);
        } else if (isFullDetail(fullDetail)) {
            appendDetail(buffer, fieldName, array);
        } else {
            appendSummary(buffer, fieldName, array);
        }
        appendFieldEnd(buffer, fieldName);
    }

    protected void appendDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final int[] array) {
        buffer.append(arrayStart);
        for (int i = 0 ; i < (array.length) ; i++) {
            if (i > 0) {
                buffer.append(arraySeparator);
            } 
            appendDetail(buffer, fieldName, array[i]);
        }
        buffer.append(arrayEnd);
    }

    protected void appendSummary(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final int[] array) {
        appendSummarySize(buffer, fieldName, array.length);
    }

    public void append(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final short[] array, final java.lang.Boolean fullDetail) {
        appendFieldStart(buffer, fieldName);
        if (array == null) {
            appendNullText(buffer, fieldName);
        } else if (isFullDetail(fullDetail)) {
            appendDetail(buffer, fieldName, array);
        } else {
            appendSummary(buffer, fieldName, array);
        }
        appendFieldEnd(buffer, fieldName);
    }

    protected void appendDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final short[] array) {
        buffer.append(arrayStart);
        for (int i = 0 ; i < (array.length) ; i++) {
            if (i > 0) {
                buffer.append(arraySeparator);
            } 
            appendDetail(buffer, fieldName, array[i]);
        }
        buffer.append(arrayEnd);
    }

    protected void appendSummary(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final short[] array) {
        appendSummarySize(buffer, fieldName, array.length);
    }

    public void append(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final byte[] array, final java.lang.Boolean fullDetail) {
        appendFieldStart(buffer, fieldName);
        if (array == null) {
            appendNullText(buffer, fieldName);
        } else if (isFullDetail(fullDetail)) {
            appendDetail(buffer, fieldName, array);
        } else {
            appendSummary(buffer, fieldName, array);
        }
        appendFieldEnd(buffer, fieldName);
    }

    protected void appendDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final byte[] array) {
        buffer.append(arrayStart);
        for (int i = 0 ; i < (array.length) ; i++) {
            if (i > 0) {
                buffer.append(arraySeparator);
            } 
            appendDetail(buffer, fieldName, array[i]);
        }
        buffer.append(arrayEnd);
    }

    protected void appendSummary(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final byte[] array) {
        appendSummarySize(buffer, fieldName, array.length);
    }

    public void append(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final char[] array, final java.lang.Boolean fullDetail) {
        appendFieldStart(buffer, fieldName);
        if (array == null) {
            appendNullText(buffer, fieldName);
        } else if (isFullDetail(fullDetail)) {
            appendDetail(buffer, fieldName, array);
        } else {
            appendSummary(buffer, fieldName, array);
        }
        appendFieldEnd(buffer, fieldName);
    }

    protected void appendDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final char[] array) {
        buffer.append(arrayStart);
        for (int i = 0 ; i < (array.length) ; i++) {
            if (i > 0) {
                buffer.append(arraySeparator);
            } 
            appendDetail(buffer, fieldName, array[i]);
        }
        buffer.append(arrayEnd);
    }

    protected void appendSummary(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final char[] array) {
        appendSummarySize(buffer, fieldName, array.length);
    }

    public void append(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final double[] array, final java.lang.Boolean fullDetail) {
        appendFieldStart(buffer, fieldName);
        if (array == null) {
            appendNullText(buffer, fieldName);
        } else if (isFullDetail(fullDetail)) {
            appendDetail(buffer, fieldName, array);
        } else {
            appendSummary(buffer, fieldName, array);
        }
        appendFieldEnd(buffer, fieldName);
    }

    protected void appendDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final double[] array) {
        buffer.append(arrayStart);
        for (int i = 0 ; i < (array.length) ; i++) {
            if (i > 0) {
                buffer.append(arraySeparator);
            } 
            appendDetail(buffer, fieldName, array[i]);
        }
        buffer.append(arrayEnd);
    }

    protected void appendSummary(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final double[] array) {
        appendSummarySize(buffer, fieldName, array.length);
    }

    public void append(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final float[] array, final java.lang.Boolean fullDetail) {
        appendFieldStart(buffer, fieldName);
        if (array == null) {
            appendNullText(buffer, fieldName);
        } else if (isFullDetail(fullDetail)) {
            appendDetail(buffer, fieldName, array);
        } else {
            appendSummary(buffer, fieldName, array);
        }
        appendFieldEnd(buffer, fieldName);
    }

    protected void appendDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final float[] array) {
        buffer.append(arrayStart);
        for (int i = 0 ; i < (array.length) ; i++) {
            if (i > 0) {
                buffer.append(arraySeparator);
            } 
            appendDetail(buffer, fieldName, array[i]);
        }
        buffer.append(arrayEnd);
    }

    protected void appendSummary(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final float[] array) {
        appendSummarySize(buffer, fieldName, array.length);
    }

    public void append(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final boolean[] array, final java.lang.Boolean fullDetail) {
        appendFieldStart(buffer, fieldName);
        if (array == null) {
            appendNullText(buffer, fieldName);
        } else if (isFullDetail(fullDetail)) {
            appendDetail(buffer, fieldName, array);
        } else {
            appendSummary(buffer, fieldName, array);
        }
        appendFieldEnd(buffer, fieldName);
    }

    protected void appendDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final boolean[] array) {
        buffer.append(arrayStart);
        for (int i = 0 ; i < (array.length) ; i++) {
            if (i > 0) {
                buffer.append(arraySeparator);
            } 
            appendDetail(buffer, fieldName, array[i]);
        }
        buffer.append(arrayEnd);
    }

    protected void appendSummary(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final boolean[] array) {
        appendSummarySize(buffer, fieldName, array.length);
    }

    protected void appendClassName(final java.lang.StringBuffer buffer, final java.lang.Object object) {
        if ((useClassName) && (object != null)) {
            org.apache.commons.lang3.builder.ToStringStyle.register(object);
            if (useShortClassName) {
                buffer.append(getShortClassName(object.getClass()));
            } else {
                buffer.append(object.getClass().getName());
            }
        } 
    }

    protected void appendIdentityHashCode(final java.lang.StringBuffer buffer, final java.lang.Object object) {
        if ((isUseIdentityHashCode()) && (object != null)) {
            org.apache.commons.lang3.builder.ToStringStyle.register(object);
            buffer.append('@');
            buffer.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(object)));
        } 
    }

    protected void appendContentStart(final java.lang.StringBuffer buffer) {
        buffer.append(contentStart);
    }

    protected void appendContentEnd(final java.lang.StringBuffer buffer) {
        buffer.append(contentEnd);
    }

    protected void appendNullText(final java.lang.StringBuffer buffer, final java.lang.String fieldName) {
        buffer.append(nullText);
    }

    protected void appendFieldSeparator(final java.lang.StringBuffer buffer) {
        buffer.append(fieldSeparator);
    }

    protected void appendFieldStart(final java.lang.StringBuffer buffer, final java.lang.String fieldName) {
        if ((useFieldNames) && (fieldName != null)) {
            buffer.append(fieldName);
            buffer.append(fieldNameValueSeparator);
        } 
    }

    protected void appendFieldEnd(final java.lang.StringBuffer buffer, final java.lang.String fieldName) {
        appendFieldSeparator(buffer);
    }

    protected void appendSummarySize(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final int size) {
        buffer.append(sizeStartText);
        buffer.append(size);
        buffer.append(sizeEndText);
    }

    protected boolean isFullDetail(final java.lang.Boolean fullDetailRequest) {
        if (fullDetailRequest == null) {
            return ((_returnReplacementOperatorHotSpot415.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (defaultFullDetail));
        } 
        return ((_returnReplacementOperatorHotSpot416.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (fullDetailRequest.booleanValue()));
    }

    protected java.lang.String getShortClassName(final java.lang.Class<?> cls) {
        return ((_returnReplacementOperatorHotSpot430.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ClassUtils.getShortClassName(cls)));
    }

    protected boolean isUseClassName() {
        return ((_returnReplacementOperatorHotSpot418.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (useClassName));
    }

    protected void setUseClassName(final boolean useClassName) {
        this.useClassName = useClassName;
    }

    protected boolean isUseShortClassName() {
        return ((_returnReplacementOperatorHotSpot421.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (useShortClassName));
    }

    protected void setUseShortClassName(final boolean useShortClassName) {
        this.useShortClassName = useShortClassName;
    }

    protected boolean isUseIdentityHashCode() {
        return ((_returnReplacementOperatorHotSpot420.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (useIdentityHashCode));
    }

    protected void setUseIdentityHashCode(final boolean useIdentityHashCode) {
        this.useIdentityHashCode = useIdentityHashCode;
    }

    protected boolean isUseFieldNames() {
        return ((_returnReplacementOperatorHotSpot419.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (useFieldNames));
    }

    protected void setUseFieldNames(final boolean useFieldNames) {
        this.useFieldNames = useFieldNames;
    }

    protected boolean isDefaultFullDetail() {
        return ((_returnReplacementOperatorHotSpot412.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (defaultFullDetail));
    }

    protected void setDefaultFullDetail(final boolean defaultFullDetail) {
        this.defaultFullDetail = defaultFullDetail;
    }

    protected boolean isArrayContentDetail() {
        return ((_returnReplacementOperatorHotSpot411.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (arrayContentDetail));
    }

    protected void setArrayContentDetail(final boolean arrayContentDetail) {
        this.arrayContentDetail = arrayContentDetail;
    }

    protected java.lang.String getArrayStart() {
        return ((_returnReplacementOperatorHotSpot424.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (arrayStart));
    }

    protected void setArrayStart(java.lang.String arrayStart) {
        if (arrayStart == null) {
            arrayStart = "";
        } 
        this.arrayStart = arrayStart;
    }

    protected java.lang.String getArrayEnd() {
        return ((_returnReplacementOperatorHotSpot422.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (arrayEnd));
    }

    protected void setArrayEnd(java.lang.String arrayEnd) {
        if (arrayEnd == null) {
            arrayEnd = "";
        } 
        this.arrayEnd = arrayEnd;
    }

    protected java.lang.String getArraySeparator() {
        return ((_returnReplacementOperatorHotSpot423.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (arraySeparator));
    }

    protected void setArraySeparator(java.lang.String arraySeparator) {
        if (arraySeparator == null) {
            arraySeparator = "";
        } 
        this.arraySeparator = arraySeparator;
    }

    protected java.lang.String getContentStart() {
        return ((_returnReplacementOperatorHotSpot426.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (contentStart));
    }

    protected void setContentStart(java.lang.String contentStart) {
        if (contentStart == null) {
            contentStart = "";
        } 
        this.contentStart = contentStart;
    }

    protected java.lang.String getContentEnd() {
        return ((_returnReplacementOperatorHotSpot425.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (contentEnd));
    }

    protected void setContentEnd(java.lang.String contentEnd) {
        if (contentEnd == null) {
            contentEnd = "";
        } 
        this.contentEnd = contentEnd;
    }

    protected java.lang.String getFieldNameValueSeparator() {
        return ((_returnReplacementOperatorHotSpot427.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (fieldNameValueSeparator));
    }

    protected void setFieldNameValueSeparator(java.lang.String fieldNameValueSeparator) {
        if (fieldNameValueSeparator == null) {
            fieldNameValueSeparator = "";
        } 
        this.fieldNameValueSeparator = fieldNameValueSeparator;
    }

    protected java.lang.String getFieldSeparator() {
        return ((_returnReplacementOperatorHotSpot428.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (fieldSeparator));
    }

    protected void setFieldSeparator(java.lang.String fieldSeparator) {
        if (fieldSeparator == null) {
            fieldSeparator = "";
        } 
        this.fieldSeparator = fieldSeparator;
    }

    protected boolean isFieldSeparatorAtStart() {
        return ((_returnReplacementOperatorHotSpot414.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (fieldSeparatorAtStart));
    }

    protected void setFieldSeparatorAtStart(final boolean fieldSeparatorAtStart) {
        this.fieldSeparatorAtStart = fieldSeparatorAtStart;
    }

    protected boolean isFieldSeparatorAtEnd() {
        return ((_returnReplacementOperatorHotSpot413.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (fieldSeparatorAtEnd));
    }

    protected void setFieldSeparatorAtEnd(final boolean fieldSeparatorAtEnd) {
        this.fieldSeparatorAtEnd = fieldSeparatorAtEnd;
    }

    protected java.lang.String getNullText() {
        return ((_returnReplacementOperatorHotSpot429.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (nullText));
    }

    protected void setNullText(java.lang.String nullText) {
        if (nullText == null) {
            nullText = "";
        } 
        this.nullText = nullText;
    }

    protected java.lang.String getSizeStartText() {
        return ((_returnReplacementOperatorHotSpot432.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (sizeStartText));
    }

    protected void setSizeStartText(java.lang.String sizeStartText) {
        if (sizeStartText == null) {
            sizeStartText = "";
        } 
        this.sizeStartText = sizeStartText;
    }

    protected java.lang.String getSizeEndText() {
        return ((_returnReplacementOperatorHotSpot431.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (sizeEndText));
    }

    protected void setSizeEndText(java.lang.String sizeEndText) {
        if (sizeEndText == null) {
            sizeEndText = "";
        } 
        this.sizeEndText = sizeEndText;
    }

    protected java.lang.String getSummaryObjectStartText() {
        return ((_returnReplacementOperatorHotSpot434.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (summaryObjectStartText));
    }

    protected void setSummaryObjectStartText(java.lang.String summaryObjectStartText) {
        if (summaryObjectStartText == null) {
            summaryObjectStartText = "";
        } 
        this.summaryObjectStartText = summaryObjectStartText;
    }

    protected java.lang.String getSummaryObjectEndText() {
        return ((_returnReplacementOperatorHotSpot433.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (summaryObjectEndText));
    }

    protected void setSummaryObjectEndText(java.lang.String summaryObjectEndText) {
        if (summaryObjectEndText == null) {
            summaryObjectEndText = "";
        } 
        this.summaryObjectEndText = summaryObjectEndText;
    }

    private static final class DefaultToStringStyle extends org.apache.commons.lang3.builder.ToStringStyle {
        private static final long serialVersionUID = 1L;

        DefaultToStringStyle() {
            super();
        }

        private java.lang.Object readResolve() {
            return ((_returnReplacementOperatorHotSpot402.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE));
        }
    }

    private static final class NoFieldNameToStringStyle extends org.apache.commons.lang3.builder.ToStringStyle {
        private static final long serialVersionUID = 1L;

        NoFieldNameToStringStyle() {
            super();
            setUseFieldNames(false);
        }

        private java.lang.Object readResolve() {
            return ((_returnReplacementOperatorHotSpot408.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE));
        }
    }

    private static final class ShortPrefixToStringStyle extends org.apache.commons.lang3.builder.ToStringStyle {
        private static final long serialVersionUID = 1L;

        ShortPrefixToStringStyle() {
            super();
            setUseShortClassName(true);
            setUseIdentityHashCode(false);
        }

        private java.lang.Object readResolve() {
            return ((_returnReplacementOperatorHotSpot409.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE));
        }
    }

    private static final class SimpleToStringStyle extends org.apache.commons.lang3.builder.ToStringStyle {
        private static final long serialVersionUID = 1L;

        SimpleToStringStyle() {
            super();
            setUseClassName(false);
            setUseIdentityHashCode(false);
            setUseFieldNames(false);
            setContentStart("");
            setContentEnd("");
        }

        private java.lang.Object readResolve() {
            return ((_returnReplacementOperatorHotSpot410.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE));
        }
    }

    private static final class MultiLineToStringStyle extends org.apache.commons.lang3.builder.ToStringStyle {
        private static final long serialVersionUID = 1L;

        MultiLineToStringStyle() {
            super();
            setContentStart("[");
            setFieldSeparator(((org.apache.commons.lang3.SystemUtils.LINE_SEPARATOR) + "  "));
            setFieldSeparatorAtStart(true);
            setContentEnd(((org.apache.commons.lang3.SystemUtils.LINE_SEPARATOR) + "]"));
        }

        private java.lang.Object readResolve() {
            return ((_returnReplacementOperatorHotSpot406.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE));
        }
    }

    private static final class NoClassNameToStringStyle extends org.apache.commons.lang3.builder.ToStringStyle {
        private static final long serialVersionUID = 1L;

        NoClassNameToStringStyle() {
            super();
            setUseClassName(false);
            setUseIdentityHashCode(false);
        }

        private java.lang.Object readResolve() {
            return ((_returnReplacementOperatorHotSpot407.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.builder.ToStringStyle.NO_CLASS_NAME_STYLE));
        }
    }

    private static final class JsonToStringStyle extends org.apache.commons.lang3.builder.ToStringStyle {
        private static final long serialVersionUID = 1L;

        private java.lang.String FIELD_NAME_PREFIX = "\"";

        JsonToStringStyle() {
            super();
            setUseClassName(false);
            setUseIdentityHashCode(false);
            setContentStart("{");
            setContentEnd("}");
            setArrayStart("[");
            setArrayEnd("]");
            setFieldSeparator(",");
            setFieldNameValueSeparator(":");
            setNullText("null");
            setSummaryObjectStartText("\"<");
            setSummaryObjectEndText(">\"");
            setSizeStartText("\"<size=");
            setSizeEndText(">\"");
        }

        @java.lang.Override
        public void append(java.lang.StringBuffer buffer, java.lang.String fieldName, java.lang.Object[] array, java.lang.Boolean fullDetail) {
            if (fieldName == null) {
                throw new java.lang.UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            } 
            if (!(isFullDetail(fullDetail))) {
                throw new java.lang.UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            } 
            super.append(buffer, fieldName, array, fullDetail);
        }

        @java.lang.Override
        public void append(java.lang.StringBuffer buffer, java.lang.String fieldName, long[] array, java.lang.Boolean fullDetail) {
            if (fieldName == null) {
                throw new java.lang.UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            } 
            if (!(isFullDetail(fullDetail))) {
                throw new java.lang.UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            } 
            super.append(buffer, fieldName, array, fullDetail);
        }

        @java.lang.Override
        public void append(java.lang.StringBuffer buffer, java.lang.String fieldName, int[] array, java.lang.Boolean fullDetail) {
            if (fieldName == null) {
                throw new java.lang.UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            } 
            if (!(isFullDetail(fullDetail))) {
                throw new java.lang.UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            } 
            super.append(buffer, fieldName, array, fullDetail);
        }

        @java.lang.Override
        public void append(java.lang.StringBuffer buffer, java.lang.String fieldName, short[] array, java.lang.Boolean fullDetail) {
            if (fieldName == null) {
                throw new java.lang.UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            } 
            if (!(isFullDetail(fullDetail))) {
                throw new java.lang.UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            } 
            super.append(buffer, fieldName, array, fullDetail);
        }

        @java.lang.Override
        public void append(java.lang.StringBuffer buffer, java.lang.String fieldName, byte[] array, java.lang.Boolean fullDetail) {
            if (fieldName == null) {
                throw new java.lang.UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            } 
            if (!(isFullDetail(fullDetail))) {
                throw new java.lang.UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            } 
            super.append(buffer, fieldName, array, fullDetail);
        }

        @java.lang.Override
        public void append(java.lang.StringBuffer buffer, java.lang.String fieldName, char[] array, java.lang.Boolean fullDetail) {
            if (fieldName == null) {
                throw new java.lang.UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            } 
            if (!(isFullDetail(fullDetail))) {
                throw new java.lang.UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            } 
            super.append(buffer, fieldName, array, fullDetail);
        }

        @java.lang.Override
        public void append(java.lang.StringBuffer buffer, java.lang.String fieldName, double[] array, java.lang.Boolean fullDetail) {
            if (fieldName == null) {
                throw new java.lang.UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            } 
            if (!(isFullDetail(fullDetail))) {
                throw new java.lang.UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            } 
            super.append(buffer, fieldName, array, fullDetail);
        }

        @java.lang.Override
        public void append(java.lang.StringBuffer buffer, java.lang.String fieldName, float[] array, java.lang.Boolean fullDetail) {
            if (fieldName == null) {
                throw new java.lang.UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            } 
            if (!(isFullDetail(fullDetail))) {
                throw new java.lang.UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            } 
            super.append(buffer, fieldName, array, fullDetail);
        }

        @java.lang.Override
        public void append(java.lang.StringBuffer buffer, java.lang.String fieldName, boolean[] array, java.lang.Boolean fullDetail) {
            if (fieldName == null) {
                throw new java.lang.UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            } 
            if (!(isFullDetail(fullDetail))) {
                throw new java.lang.UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            } 
            super.append(buffer, fieldName, array, fullDetail);
        }

        @java.lang.Override
        public void append(java.lang.StringBuffer buffer, java.lang.String fieldName, java.lang.Object value, java.lang.Boolean fullDetail) {
            if (fieldName == null) {
                throw new java.lang.UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            } 
            if (!(isFullDetail(fullDetail))) {
                throw new java.lang.UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            } 
            super.append(buffer, fieldName, value, fullDetail);
        }

        @java.lang.Override
        protected void appendDetail(java.lang.StringBuffer buffer, java.lang.String fieldName, char value) {
            appendValueAsString(buffer, java.lang.String.valueOf(value));
        }

        @java.lang.Override
        protected void appendDetail(java.lang.StringBuffer buffer, java.lang.String fieldName, java.lang.Object value) {
            if (value == null) {
                appendNullText(buffer, fieldName);
                return ;
            } 
            if ((value instanceof java.lang.String) || (value instanceof java.lang.Character)) {
                appendValueAsString(buffer, value.toString());
                return ;
            } 
            if ((value instanceof java.lang.Number) || (value instanceof java.lang.Boolean)) {
                buffer.append(value);
                return ;
            } 
            final java.lang.String valueAsString = value.toString();
            if ((isJsonObject(valueAsString)) || (isJsonArray(valueAsString))) {
                buffer.append(value);
                return ;
            } 
            appendDetail(buffer, fieldName, valueAsString);
        }

        private boolean isJsonArray(java.lang.String valueAsString) {
            return ((_returnReplacementOperatorHotSpot403.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((valueAsString.startsWith(getArrayStart())) && (valueAsString.startsWith(getArrayEnd()))));
        }

        private boolean isJsonObject(java.lang.String valueAsString) {
            return ((_returnReplacementOperatorHotSpot404.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((valueAsString.startsWith(getContentStart())) && (valueAsString.endsWith(getContentEnd()))));
        }

        private void appendValueAsString(java.lang.StringBuffer buffer, java.lang.String value) {
            buffer.append((("\"" + value) + "\""));
        }

        @java.lang.Override
        protected void appendFieldStart(java.lang.StringBuffer buffer, java.lang.String fieldName) {
            if (fieldName == null) {
                throw new java.lang.UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            } 
            super.appendFieldStart(buffer, (((FIELD_NAME_PREFIX) + fieldName) + (FIELD_NAME_PREFIX)));
        }

        private java.lang.Object readResolve() {
            return ((_returnReplacementOperatorHotSpot405.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.builder.ToStringStyle.JSON_STYLE));
        }
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot402 = metamutator.Selector.of(402,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot402");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot403 = metamutator.Selector.of(403,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot403");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot404 = metamutator.Selector.of(404,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot404");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot405 = metamutator.Selector.of(405,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot405");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot406 = metamutator.Selector.of(406,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot406");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot407 = metamutator.Selector.of(407,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot407");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot408 = metamutator.Selector.of(408,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot408");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot409 = metamutator.Selector.of(409,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot409");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot410 = metamutator.Selector.of(410,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot410");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot411 = metamutator.Selector.of(411,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringStyle.class).id("_returnReplacementOperatorHotSpot411");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot412 = metamutator.Selector.of(412,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringStyle.class).id("_returnReplacementOperatorHotSpot412");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot413 = metamutator.Selector.of(413,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringStyle.class).id("_returnReplacementOperatorHotSpot413");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot414 = metamutator.Selector.of(414,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringStyle.class).id("_returnReplacementOperatorHotSpot414");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot415 = metamutator.Selector.of(415,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringStyle.class).id("_returnReplacementOperatorHotSpot415");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot416 = metamutator.Selector.of(416,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringStyle.class).id("_returnReplacementOperatorHotSpot416");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot417 = metamutator.Selector.of(417,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringStyle.class).id("_returnReplacementOperatorHotSpot417");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot418 = metamutator.Selector.of(418,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringStyle.class).id("_returnReplacementOperatorHotSpot418");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot419 = metamutator.Selector.of(419,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringStyle.class).id("_returnReplacementOperatorHotSpot419");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot420 = metamutator.Selector.of(420,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringStyle.class).id("_returnReplacementOperatorHotSpot420");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot421 = metamutator.Selector.of(421,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringStyle.class).id("_returnReplacementOperatorHotSpot421");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot422 = metamutator.Selector.of(422,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringStyle.class).id("_returnReplacementOperatorHotSpot422");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot423 = metamutator.Selector.of(423,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringStyle.class).id("_returnReplacementOperatorHotSpot423");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot424 = metamutator.Selector.of(424,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringStyle.class).id("_returnReplacementOperatorHotSpot424");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot425 = metamutator.Selector.of(425,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringStyle.class).id("_returnReplacementOperatorHotSpot425");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot426 = metamutator.Selector.of(426,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringStyle.class).id("_returnReplacementOperatorHotSpot426");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot427 = metamutator.Selector.of(427,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringStyle.class).id("_returnReplacementOperatorHotSpot427");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot428 = metamutator.Selector.of(428,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringStyle.class).id("_returnReplacementOperatorHotSpot428");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot429 = metamutator.Selector.of(429,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringStyle.class).id("_returnReplacementOperatorHotSpot429");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot430 = metamutator.Selector.of(430,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringStyle.class).id("_returnReplacementOperatorHotSpot430");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot431 = metamutator.Selector.of(431,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringStyle.class).id("_returnReplacementOperatorHotSpot431");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot432 = metamutator.Selector.of(432,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringStyle.class).id("_returnReplacementOperatorHotSpot432");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot433 = metamutator.Selector.of(433,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringStyle.class).id("_returnReplacementOperatorHotSpot433");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot434 = metamutator.Selector.of(434,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringStyle.class).id("_returnReplacementOperatorHotSpot434");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot435 = metamutator.Selector.of(435,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringStyle.class).id("_returnReplacementOperatorHotSpot435");
}

