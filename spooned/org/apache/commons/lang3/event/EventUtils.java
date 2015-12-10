package org.apache.commons.lang3.event;


public class EventUtils {
    public static <L>void addEventListener(final java.lang.Object eventSource, final java.lang.Class<L> listenerType, final L listener) {
        try {
            org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(eventSource, ("add" + (listenerType.getSimpleName())), listener);
        } catch (final java.lang.NoSuchMethodException e) {
            throw new java.lang.IllegalArgumentException((((((("Class " + (eventSource.getClass().getName())) + " does not have a public add") + (listenerType.getSimpleName())) + " method which takes a parameter of type ") + (listenerType.getName())) + "."));
        } catch (final java.lang.IllegalAccessException e) {
            throw new java.lang.IllegalArgumentException((((((("Class " + (eventSource.getClass().getName())) + " does not have an accessible add") + (listenerType.getSimpleName())) + " method which takes a parameter of type ") + (listenerType.getName())) + "."));
        } catch (final java.lang.reflect.InvocationTargetException e) {
            throw new java.lang.RuntimeException("Unable to add listener." , e.getCause());
        }
    }

    public static <L>void bindEventsToMethod(final java.lang.Object target, final java.lang.String methodName, final java.lang.Object eventSource, final java.lang.Class<L> listenerType, final java.lang.String... eventTypes) {
        final L listener = listenerType.cast(java.lang.reflect.Proxy.newProxyInstance(target.getClass().getClassLoader(), new java.lang.Class[]{ listenerType }, new org.apache.commons.lang3.event.EventUtils.EventBindingInvocationHandler(target , methodName , eventTypes)));
        org.apache.commons.lang3.event.EventUtils.addEventListener(eventSource, listenerType, listener);
    }

    private static class EventBindingInvocationHandler implements java.lang.reflect.InvocationHandler {
        private final java.lang.Object target;

        private final java.lang.String methodName;

        private final java.util.Set<java.lang.String> eventTypes;

        EventBindingInvocationHandler(final java.lang.Object target ,final java.lang.String methodName ,final java.lang.String[] eventTypes) {
            this.target = target;
            this.methodName = methodName;
            this.eventTypes = new java.util.HashSet<java.lang.String>(java.util.Arrays.asList(eventTypes));
        }

        @java.lang.Override
        public java.lang.Object invoke(final java.lang.Object proxy, final java.lang.reflect.Method method, final java.lang.Object[] parameters) throws java.lang.Throwable {
            if ((eventTypes.isEmpty()) || (eventTypes.contains(method.getName()))) {
                if (hasMatchingParametersMethod(method)) {
                    return org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(target, methodName, parameters);
                } 
                return org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(target, methodName);
            } 
            return null;
        }

        private boolean hasMatchingParametersMethod(final java.lang.reflect.Method method) {
            return (org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethod(target.getClass(), methodName, method.getParameterTypes())) != null;
        }
    }
}

