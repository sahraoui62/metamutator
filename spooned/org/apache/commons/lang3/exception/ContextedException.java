package org.apache.commons.lang3.exception;


public class ContextedException extends java.lang.Exception implements org.apache.commons.lang3.exception.ExceptionContext {
    private static final long serialVersionUID = 20110706L;

    private final org.apache.commons.lang3.exception.ExceptionContext exceptionContext;

    public ContextedException() {
        super();
        exceptionContext = new org.apache.commons.lang3.exception.DefaultExceptionContext();
    }

    public ContextedException(final java.lang.String message) {
        super(message);
        exceptionContext = new org.apache.commons.lang3.exception.DefaultExceptionContext();
    }

    public ContextedException(final java.lang.Throwable cause) {
        super(cause);
        exceptionContext = new org.apache.commons.lang3.exception.DefaultExceptionContext();
    }

    public ContextedException(final java.lang.String message ,final java.lang.Throwable cause) {
        super(message, cause);
        exceptionContext = new org.apache.commons.lang3.exception.DefaultExceptionContext();
    }

    public ContextedException(final java.lang.String message ,final java.lang.Throwable cause ,org.apache.commons.lang3.exception.ExceptionContext context) {
        super(message, cause);
        if (context == null) {
            context = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        } 
        exceptionContext = context;
    }

    @java.lang.Override
    public org.apache.commons.lang3.exception.ContextedException addContextValue(final java.lang.String label, final java.lang.Object value) {
        exceptionContext.addContextValue(label, value);
        return ((_returnReplacementOperatorHotSpot526.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    @java.lang.Override
    public org.apache.commons.lang3.exception.ContextedException setContextValue(final java.lang.String label, final java.lang.Object value) {
        exceptionContext.setContextValue(label, value);
        return ((_returnReplacementOperatorHotSpot527.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    @java.lang.Override
    public java.util.List<java.lang.Object> getContextValues(final java.lang.String label) {
        return ((_returnReplacementOperatorHotSpot524.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this.exceptionContext.getContextValues(label)));
    }

    @java.lang.Override
    public java.lang.Object getFirstContextValue(final java.lang.String label) {
        return ((_returnReplacementOperatorHotSpot519.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this.exceptionContext.getFirstContextValue(label)));
    }

    @java.lang.Override
    public java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> getContextEntries() {
        return ((_returnReplacementOperatorHotSpot523.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this.exceptionContext.getContextEntries()));
    }

    @java.lang.Override
    public java.util.Set<java.lang.String> getContextLabels() {
        return ((_returnReplacementOperatorHotSpot525.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (exceptionContext.getContextLabels()));
    }

    @java.lang.Override
    public java.lang.String getMessage() {
        return ((_returnReplacementOperatorHotSpot521.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (getFormattedExceptionMessage(super.getMessage())));
    }

    public java.lang.String getRawMessage() {
        return ((_returnReplacementOperatorHotSpot522.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (super.getMessage()));
    }

    @java.lang.Override
    public java.lang.String getFormattedExceptionMessage(final java.lang.String baseMessage) {
        return ((_returnReplacementOperatorHotSpot520.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (exceptionContext.getFormattedExceptionMessage(baseMessage)));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot519 = metamutator.Selector.of(519,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ContextedException.class).id("_returnReplacementOperatorHotSpot519");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot520 = metamutator.Selector.of(520,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ContextedException.class).id("_returnReplacementOperatorHotSpot520");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot521 = metamutator.Selector.of(521,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ContextedException.class).id("_returnReplacementOperatorHotSpot521");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot522 = metamutator.Selector.of(522,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ContextedException.class).id("_returnReplacementOperatorHotSpot522");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot523 = metamutator.Selector.of(523,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ContextedException.class).id("_returnReplacementOperatorHotSpot523");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot524 = metamutator.Selector.of(524,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ContextedException.class).id("_returnReplacementOperatorHotSpot524");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot525 = metamutator.Selector.of(525,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ContextedException.class).id("_returnReplacementOperatorHotSpot525");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot526 = metamutator.Selector.of(526,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ContextedException.class).id("_returnReplacementOperatorHotSpot526");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot527 = metamutator.Selector.of(527,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ContextedException.class).id("_returnReplacementOperatorHotSpot527");
}

