package org.apache.commons.lang3;


public class SerializationUtils {
    public SerializationUtils() {
        super();
    }

    public static <T extends java.io.Serializable>T clone(final T object) {
        if (object == null) {
            return null;
        } 
        final byte[] objectData = org.apache.commons.lang3.SerializationUtils.serialize(object);
        final java.io.ByteArrayInputStream bais = new java.io.ByteArrayInputStream(objectData);
        org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream in = null;
        try {
            in = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(bais , object.getClass().getClassLoader());
            @java.lang.SuppressWarnings(value = "unchecked")
            final T readObject = ((T)(in.readObject()));
            return readObject;
        } catch (final java.lang.ClassNotFoundException ex) {
            throw new org.apache.commons.lang3.SerializationException("ClassNotFoundException while reading cloned object data" , ex);
        } catch (final java.io.IOException ex) {
            throw new org.apache.commons.lang3.SerializationException("IOException while reading cloned object data" , ex);
        } finally {
            try {
                if (in != null) {
                    in.close();
                } 
            } catch (final java.io.IOException ex) {
                throw new org.apache.commons.lang3.SerializationException("IOException on closing cloned object data InputStream." , ex);
            }
        }
    }

    @java.lang.SuppressWarnings(value = "unchecked")
    public static <T extends java.io.Serializable>T roundtrip(final T msg) {
        return ((T)(org.apache.commons.lang3.SerializationUtils.deserialize(org.apache.commons.lang3.SerializationUtils.serialize(msg))));
    }

    public static void serialize(final java.io.Serializable obj, final java.io.OutputStream outputStream) {
        if (outputStream == null) {
            throw new java.lang.IllegalArgumentException("The OutputStream must not be null");
        } 
        java.io.ObjectOutputStream out = null;
        try {
            out = new java.io.ObjectOutputStream(outputStream);
            out.writeObject(obj);
        } catch (final java.io.IOException ex) {
            throw new org.apache.commons.lang3.SerializationException(ex);
        } finally {
            try {
                if (out != null) {
                    out.close();
                } 
            } catch (final java.io.IOException ex) {
            }
        }
    }

    public static byte[] serialize(final java.io.Serializable obj) {
        final java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream(512);
        org.apache.commons.lang3.SerializationUtils.serialize(obj, baos);
        return baos.toByteArray();
    }

    public static <T>T deserialize(final java.io.InputStream inputStream) {
        if (inputStream == null) {
            throw new java.lang.IllegalArgumentException("The InputStream must not be null");
        } 
        java.io.ObjectInputStream in = null;
        try {
            in = new java.io.ObjectInputStream(inputStream);
            @java.lang.SuppressWarnings(value = "unchecked")
            final T obj = ((T)(in.readObject()));
            return obj;
        } catch (final java.lang.ClassCastException ex) {
            throw new org.apache.commons.lang3.SerializationException(ex);
        } catch (final java.lang.ClassNotFoundException ex) {
            throw new org.apache.commons.lang3.SerializationException(ex);
        } catch (final java.io.IOException ex) {
            throw new org.apache.commons.lang3.SerializationException(ex);
        } finally {
            try {
                if (in != null) {
                    in.close();
                } 
            } catch (final java.io.IOException ex) {
            }
        }
    }

    public static <T>T deserialize(final byte[] objectData) {
        if (objectData == null) {
            throw new java.lang.IllegalArgumentException("The byte[] must not be null");
        } 
        return org.apache.commons.lang3.SerializationUtils.<T>deserialize(new java.io.ByteArrayInputStream(objectData));
    }

    static class ClassLoaderAwareObjectInputStream extends java.io.ObjectInputStream {
        private static final java.util.Map<java.lang.String, java.lang.Class<?>> primitiveTypes = new java.util.HashMap<java.lang.String, java.lang.Class<?>>();

        private final java.lang.ClassLoader classLoader;

        public ClassLoaderAwareObjectInputStream(final java.io.InputStream in ,final java.lang.ClassLoader classLoader) throws java.io.IOException {
            super(in);
            this.classLoader = classLoader;
            primitiveTypes.put("byte", byte.class);
            primitiveTypes.put("short", short.class);
            primitiveTypes.put("int", int.class);
            primitiveTypes.put("long", long.class);
            primitiveTypes.put("float", float.class);
            primitiveTypes.put("double", double.class);
            primitiveTypes.put("boolean", boolean.class);
            primitiveTypes.put("char", char.class);
            primitiveTypes.put("void", void.class);
        }

        @java.lang.Override
        protected java.lang.Class<?> resolveClass(final java.io.ObjectStreamClass desc) throws java.io.IOException, java.lang.ClassNotFoundException {
            final java.lang.String name = desc.getName();
            try {
                return java.lang.Class.forName(name, false, classLoader);
            } catch (final java.lang.ClassNotFoundException ex) {
                try {
                    return java.lang.Class.forName(name, false, java.lang.Thread.currentThread().getContextClassLoader());
                } catch (final java.lang.ClassNotFoundException cnfe) {
                    final java.lang.Class<?> cls = primitiveTypes.get(name);
                    if (cls != null) {
                        return cls;
                    } 
                    throw cnfe;
                }
            }
        }
    }
}

