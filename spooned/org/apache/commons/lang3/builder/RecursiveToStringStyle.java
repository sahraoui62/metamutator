package org.apache.commons.lang3.builder;


public class RecursiveToStringStyle extends org.apache.commons.lang3.builder.ToStringStyle {
    private static final long serialVersionUID = 1L;

    public RecursiveToStringStyle() {
        super();
    }

    @java.lang.Override
    public void appendDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final java.lang.Object value) {
        if (((!(org.apache.commons.lang3.ClassUtils.isPrimitiveWrapper(value.getClass()))) && (!(java.lang.String.class.equals(value.getClass())))) && (accept(value.getClass()))) {
            buffer.append(org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(value, this));
        } else {
            super.appendDetail(buffer, fieldName, value);
        }
    }

    @java.lang.Override
    protected void appendDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final java.util.Collection<?> coll) {
        appendClassName(buffer, coll);
        appendIdentityHashCode(buffer, coll);
        appendDetail(buffer, fieldName, coll.toArray());
    }

    protected boolean accept(final java.lang.Class<?> clazz) {
        return true;
    }
}

