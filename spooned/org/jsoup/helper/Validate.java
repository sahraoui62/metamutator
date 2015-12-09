package org.jsoup.helper;


public final class Validate {
    private Validate() {
    }

    public static void notNull(java.lang.Object obj) {
        if (obj == null)
            throw new java.lang.IllegalArgumentException("Object must not be null");
        
    }

    public static void notNull(java.lang.Object obj, java.lang.String msg) {
        if (obj == null)
            throw new java.lang.IllegalArgumentException(msg);
        
    }

    public static void isTrue(boolean val) {
        if (!val)
            throw new java.lang.IllegalArgumentException("Must be true");
        
    }

    public static void isTrue(boolean val, java.lang.String msg) {
        if (!val)
            throw new java.lang.IllegalArgumentException(msg);
        
    }

    public static void isFalse(boolean val) {
        if (val)
            throw new java.lang.IllegalArgumentException("Must be false");
        
    }

    public static void isFalse(boolean val, java.lang.String msg) {
        if (val)
            throw new java.lang.IllegalArgumentException(msg);
        
    }

    public static void noNullElements(java.lang.Object[] objects) {
        org.jsoup.helper.Validate.noNullElements(objects, "Array must not contain any null objects");
    }

    public static void noNullElements(java.lang.Object[] objects, java.lang.String msg) {
        for (java.lang.Object obj : objects)
            if (obj == null)
                throw new java.lang.IllegalArgumentException(msg);
            
    }

    public static void notEmpty(java.lang.String string) {
        if ((string == null) || ((string.length()) == 0))
            throw new java.lang.IllegalArgumentException("String must not be empty");
        
    }

    public static void notEmpty(java.lang.String string, java.lang.String msg) {
        if ((string == null) || ((string.length()) == 0))
            throw new java.lang.IllegalArgumentException(msg);
        
    }

    public static void fail(java.lang.String msg) {
        throw new java.lang.IllegalArgumentException(msg);
    }
}

