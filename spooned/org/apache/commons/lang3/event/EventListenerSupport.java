package org.apache.commons.lang3.event;


public class EventListenerSupport<L> implements java.io.Serializable {
    private static final long serialVersionUID = 3593265990380473632L;

    private java.util.List<L> listeners = new java.util.concurrent.CopyOnWriteArrayList<L>();

    private transient L proxy;

    private transient L[] prototypeArray;

    public static <T>org.apache.commons.lang3.event.EventListenerSupport<T> create(final java.lang.Class<T> listenerInterface) {
        return ((_returnReplacementOperatorHotSpot510.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.event.EventListenerSupport<T>(listenerInterface)));
    }

    public EventListenerSupport(final java.lang.Class<L> listenerInterface) {
        this(listenerInterface, java.lang.Thread.currentThread().getContextClassLoader());
    }

    public EventListenerSupport(final java.lang.Class<L> listenerInterface ,final java.lang.ClassLoader classLoader) {
        this();
        org.apache.commons.lang3.Validate.notNull(listenerInterface, "Listener interface cannot be null.");
        org.apache.commons.lang3.Validate.notNull(classLoader, "ClassLoader cannot be null.");
        org.apache.commons.lang3.Validate.isTrue(listenerInterface.isInterface(), "Class {0} is not an interface", listenerInterface.getName());
        initializeTransientFields(listenerInterface, classLoader);
    }

    private EventListenerSupport() {
    }

    public L fire() {
        return ((_returnReplacementOperatorHotSpot511.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (proxy));
    }

    public void addListener(final L listener) {
        addListener(listener, true);
    }

    public void addListener(final L listener, boolean allowDuplicate) {
        org.apache.commons.lang3.Validate.notNull(listener, "Listener object cannot be null.");
        if (allowDuplicate) {
            listeners.add(listener);
        } else if (!(listeners.contains(listener))) {
            listeners.add(listener);
        } 
    }

    int getListenerCount() {
        return ((_returnReplacementOperatorHotSpot513.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot513.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot513.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (listeners.size()));
    }

    public void removeListener(final L listener) {
        org.apache.commons.lang3.Validate.notNull(listener, "Listener object cannot be null.");
        listeners.remove(listener);
    }

    public L[] getListeners() {
        return ((_returnReplacementOperatorHotSpot512.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (listeners.toArray(prototypeArray)));
    }

    private void writeObject(final java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        final java.util.ArrayList<L> serializableListeners = new java.util.ArrayList<L>();
        java.io.ObjectOutputStream testObjectOutputStream = new java.io.ObjectOutputStream(new java.io.ByteArrayOutputStream());
        for (final L listener : listeners) {
            try {
                testObjectOutputStream.writeObject(listener);
                serializableListeners.add(listener);
            } catch (final java.io.IOException exception) {
                testObjectOutputStream = new java.io.ObjectOutputStream(new java.io.ByteArrayOutputStream());
            }
        }
        objectOutputStream.writeObject(serializableListeners.toArray(prototypeArray));
    }

    private void readObject(final java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        @java.lang.SuppressWarnings(value = "unchecked")
        final L[] srcListeners = ((L[])(objectInputStream.readObject()));
        this.listeners = new java.util.concurrent.CopyOnWriteArrayList<L>(srcListeners);
        @java.lang.SuppressWarnings(value = "unchecked")
        final java.lang.Class<L> listenerInterface = ((java.lang.Class<L>)(srcListeners.getClass().getComponentType()));
        initializeTransientFields(listenerInterface, java.lang.Thread.currentThread().getContextClassLoader());
    }

    private void initializeTransientFields(final java.lang.Class<L> listenerInterface, final java.lang.ClassLoader classLoader) {
        @java.lang.SuppressWarnings(value = "unchecked")
        final L[] array = ((L[])(java.lang.reflect.Array.newInstance(listenerInterface, 0)));
        this.prototypeArray = array;
        createProxy(listenerInterface, classLoader);
    }

    private void createProxy(final java.lang.Class<L> listenerInterface, final java.lang.ClassLoader classLoader) {
        proxy = listenerInterface.cast(java.lang.reflect.Proxy.newProxyInstance(classLoader, new java.lang.Class[]{ listenerInterface }, createInvocationHandler()));
    }

    protected java.lang.reflect.InvocationHandler createInvocationHandler() {
        return ((_returnReplacementOperatorHotSpot514.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new ProxyInvocationHandler()));
    }

    protected class ProxyInvocationHandler implements java.lang.reflect.InvocationHandler {
        @java.lang.Override
        public java.lang.Object invoke(final java.lang.Object unusedProxy, final java.lang.reflect.Method method, final java.lang.Object[] args) throws java.lang.Throwable {
            for (final L listener : listeners) {
                method.invoke(listener, args);
            }
            return ((_returnReplacementOperatorHotSpot509.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        }
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot509 = metamutator.Selector.of(509,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot509");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot510 = metamutator.Selector.of(510,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.event.EventListenerSupport.class).id("_returnReplacementOperatorHotSpot510");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot511 = metamutator.Selector.of(511,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.event.EventListenerSupport.class).id("_returnReplacementOperatorHotSpot511");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot512 = metamutator.Selector.of(512,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.event.EventListenerSupport.class).id("_returnReplacementOperatorHotSpot512");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot513 = metamutator.Selector.of(513,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.event.EventListenerSupport.class).id("_returnReplacementOperatorHotSpot513");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot514 = metamutator.Selector.of(514,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.event.EventListenerSupport.class).id("_returnReplacementOperatorHotSpot514");
}

