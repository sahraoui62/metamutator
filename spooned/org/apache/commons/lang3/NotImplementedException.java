package org.apache.commons.lang3;


public class NotImplementedException extends java.lang.UnsupportedOperationException {
    private static final long serialVersionUID = 20131021L;

    private final java.lang.String code;

    public NotImplementedException(final java.lang.String message) {
        this(message, ((java.lang.String)(null)));
    }

    public NotImplementedException(final java.lang.Throwable cause) {
        this(cause, null);
    }

    public NotImplementedException(final java.lang.String message ,final java.lang.Throwable cause) {
        this(message, cause, null);
    }

    public NotImplementedException(final java.lang.String message ,final java.lang.String code) {
        super(message);
        this.code = code;
    }

    public NotImplementedException(final java.lang.Throwable cause ,final java.lang.String code) {
        super(cause);
        this.code = code;
    }

    public NotImplementedException(final java.lang.String message ,final java.lang.Throwable cause ,final java.lang.String code) {
        super(message, cause);
        this.code = code;
    }

    public java.lang.String getCode() {
        return ((_returnReplacementOperator2837.is("NULL")) ? ( null ) : (this.code));
    }

    private static final metamutator.Selector _returnReplacementOperator2837 = metamutator.Selector.of(2837,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.NotImplementedException.class).id("_returnReplacementOperator2837");
}

