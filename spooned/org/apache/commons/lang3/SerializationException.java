package org.apache.commons.lang3;


public class SerializationException extends java.lang.RuntimeException {
    private static final long serialVersionUID = 4029025366392702726L;

    public SerializationException() {
        super();
    }

    public SerializationException(final java.lang.String msg) {
        super(msg);
    }

    public SerializationException(final java.lang.Throwable cause) {
        super(cause);
    }

    public SerializationException(final java.lang.String msg ,final java.lang.Throwable cause) {
        super(msg, cause);
    }
}

