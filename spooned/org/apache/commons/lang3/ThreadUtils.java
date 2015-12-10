package org.apache.commons.lang3;


public class ThreadUtils {
    public static java.lang.Thread findThreadById(final long threadId, final java.lang.ThreadGroup threadGroup) {
        if (threadGroup == null) {
            throw new java.lang.IllegalArgumentException("The thread group must not be null");
        } 
        final java.lang.Thread thread = org.apache.commons.lang3.ThreadUtils.findThreadById(threadId);
        if ((thread != null) && (threadGroup.equals(thread.getThreadGroup()))) {
            return ((_returnReplacementOperatorHotSpot3503.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (thread));
        } 
        return ((_returnReplacementOperatorHotSpot3504.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
    }

    public static java.lang.Thread findThreadById(final long threadId, final java.lang.String threadGroupName) {
        if (threadGroupName == null) {
            throw new java.lang.IllegalArgumentException("The thread group name must not be null");
        } 
        final java.lang.Thread thread = org.apache.commons.lang3.ThreadUtils.findThreadById(threadId);
        if (((thread != null) && ((thread.getThreadGroup()) != null)) && (thread.getThreadGroup().getName().equals(threadGroupName))) {
            return ((_returnReplacementOperatorHotSpot3501.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (thread));
        } 
        return ((_returnReplacementOperatorHotSpot3502.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
    }

    public static java.util.Collection<java.lang.Thread> findThreadsByName(final java.lang.String threadName, final java.lang.ThreadGroup threadGroup) {
        return ((_returnReplacementOperatorHotSpot3514.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ThreadUtils.findThreads(threadGroup, false, new org.apache.commons.lang3.ThreadUtils.NamePredicate(threadName))));
    }

    public static java.util.Collection<java.lang.Thread> findThreadsByName(final java.lang.String threadName, final java.lang.String threadGroupName) {
        if (threadName == null) {
            throw new java.lang.IllegalArgumentException("The thread name must not be null");
        } 
        if (threadGroupName == null) {
            throw new java.lang.IllegalArgumentException("The thread group name must not be null");
        } 
        final java.util.Collection<java.lang.ThreadGroup> threadGroups = org.apache.commons.lang3.ThreadUtils.findThreadGroups(new org.apache.commons.lang3.ThreadUtils.NamePredicate(threadGroupName));
        if (threadGroups.isEmpty()) {
            return ((_returnReplacementOperatorHotSpot3512.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.util.Collections.emptyList()));
        } 
        final java.util.Collection<java.lang.Thread> result = new java.util.ArrayList<java.lang.Thread>();
        final org.apache.commons.lang3.ThreadUtils.NamePredicate threadNamePredicate = new org.apache.commons.lang3.ThreadUtils.NamePredicate(threadName);
        for (final java.lang.ThreadGroup group : threadGroups) {
            result.addAll(org.apache.commons.lang3.ThreadUtils.findThreads(group, false, threadNamePredicate));
        }
        return ((_returnReplacementOperatorHotSpot3513.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.util.Collections.unmodifiableCollection(result)));
    }

    public static java.util.Collection<java.lang.ThreadGroup> findThreadGroupsByName(final java.lang.String threadGroupName) {
        return ((_returnReplacementOperatorHotSpot3508.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ThreadUtils.findThreadGroups(new org.apache.commons.lang3.ThreadUtils.NamePredicate(threadGroupName))));
    }

    public static java.util.Collection<java.lang.ThreadGroup> getAllThreadGroups() {
        return ((_returnReplacementOperatorHotSpot3515.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ThreadUtils.findThreadGroups(org.apache.commons.lang3.ThreadUtils.ALWAYS_TRUE_PREDICATE)));
    }

    public static java.lang.ThreadGroup getSystemThreadGroup() {
        java.lang.ThreadGroup threadGroup = java.lang.Thread.currentThread().getThreadGroup();
        while ((threadGroup.getParent()) != null) {
            threadGroup = threadGroup.getParent();
        }
        return ((_returnReplacementOperatorHotSpot3505.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (threadGroup));
    }

    public static java.util.Collection<java.lang.Thread> getAllThreads() {
        return ((_returnReplacementOperatorHotSpot3516.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ThreadUtils.findThreads(org.apache.commons.lang3.ThreadUtils.ALWAYS_TRUE_PREDICATE)));
    }

    public static java.util.Collection<java.lang.Thread> findThreadsByName(final java.lang.String threadName) {
        return ((_returnReplacementOperatorHotSpot3511.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ThreadUtils.findThreads(new org.apache.commons.lang3.ThreadUtils.NamePredicate(threadName))));
    }

    public static java.lang.Thread findThreadById(final long threadId) {
        final java.util.Collection<java.lang.Thread> result = org.apache.commons.lang3.ThreadUtils.findThreads(new org.apache.commons.lang3.ThreadUtils.ThreadIdPredicate(threadId));
        if (result.isEmpty()) {
            return ((_returnReplacementOperatorHotSpot3499.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } else {
            return ((_returnReplacementOperatorHotSpot3500.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result.iterator().next()));
        }
    }

    public ThreadUtils() {
        super();
    }

    public interface ThreadPredicate {
        boolean test(java.lang.Thread thread);
    }

    public interface ThreadGroupPredicate {
        boolean test(java.lang.ThreadGroup threadGroup);
    }

    public static final org.apache.commons.lang3.ThreadUtils.AlwaysTruePredicate ALWAYS_TRUE_PREDICATE = new org.apache.commons.lang3.ThreadUtils.AlwaysTruePredicate();

    private static final class AlwaysTruePredicate implements ThreadGroupPredicate , ThreadPredicate {
        private AlwaysTruePredicate() {
        }

        @java.lang.Override
        public boolean test(final java.lang.ThreadGroup threadGroup) {
            return ((_returnReplacementOperatorHotSpot3495.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        }

        @java.lang.Override
        public boolean test(final java.lang.Thread thread) {
            return ((_returnReplacementOperatorHotSpot3494.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        }
    }

    public static class NamePredicate implements ThreadGroupPredicate , ThreadPredicate {
        private final java.lang.String name;

        public NamePredicate(final java.lang.String name) {
            super();
            if (name == null) {
                throw new java.lang.IllegalArgumentException("The name must not be null");
            } 
            this.name = name;
        }

        @java.lang.Override
        public boolean test(final java.lang.ThreadGroup threadGroup) {
            return ((_returnReplacementOperatorHotSpot3497.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((threadGroup != null) && (threadGroup.getName().equals(name))));
        }

        @java.lang.Override
        public boolean test(final java.lang.Thread thread) {
            return ((_returnReplacementOperatorHotSpot3496.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((thread != null) && (thread.getName().equals(name))));
        }
    }

    public static class ThreadIdPredicate implements ThreadPredicate {
        private final long threadId;

        public ThreadIdPredicate(final long threadId) {
            super();
            if (threadId <= 0) {
                throw new java.lang.IllegalArgumentException("The thread id must be greater than zero");
            } 
            this.threadId = threadId;
        }

        @java.lang.Override
        public boolean test(final java.lang.Thread thread) {
            return ((_returnReplacementOperatorHotSpot3498.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((thread != null) && ((thread.getId()) == (threadId))));
        }
    }

    public static java.util.Collection<java.lang.Thread> findThreads(final ThreadPredicate predicate) {
        return ((_returnReplacementOperatorHotSpot3510.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ThreadUtils.findThreads(org.apache.commons.lang3.ThreadUtils.getSystemThreadGroup(), true, predicate)));
    }

    public static java.util.Collection<java.lang.ThreadGroup> findThreadGroups(final ThreadGroupPredicate predicate) {
        return ((_returnReplacementOperatorHotSpot3507.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ThreadUtils.findThreadGroups(org.apache.commons.lang3.ThreadUtils.getSystemThreadGroup(), true, predicate)));
    }

    public static java.util.Collection<java.lang.Thread> findThreads(final java.lang.ThreadGroup group, final boolean recurse, final ThreadPredicate predicate) {
        if (group == null) {
            throw new java.lang.IllegalArgumentException("The group must not be null");
        } 
        if (predicate == null) {
            throw new java.lang.IllegalArgumentException("The predicate must not be null");
        } 
        int count = group.activeCount();
        java.lang.Thread[] threads;
        do {
            threads = new java.lang.Thread[(count + (count / 2)) + 1];
            count = group.enumerate(threads, recurse);
        } while (count >= (threads.length) );
        final java.util.List<java.lang.Thread> result = new java.util.ArrayList<java.lang.Thread>(count);
        for (int i = 0 ; i < count ; ++i) {
            if (predicate.test(threads[i])) {
                result.add(threads[i]);
            } 
        }
        return ((_returnReplacementOperatorHotSpot3509.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.util.Collections.unmodifiableCollection(result)));
    }

    public static java.util.Collection<java.lang.ThreadGroup> findThreadGroups(final java.lang.ThreadGroup group, final boolean recurse, final ThreadGroupPredicate predicate) {
        if (group == null) {
            throw new java.lang.IllegalArgumentException("The group must not be null");
        } 
        if (predicate == null) {
            throw new java.lang.IllegalArgumentException("The predicate must not be null");
        } 
        int count = group.activeGroupCount();
        java.lang.ThreadGroup[] threadGroups;
        do {
            threadGroups = new java.lang.ThreadGroup[(count + (count / 2)) + 1];
            count = group.enumerate(threadGroups, recurse);
        } while (count >= (threadGroups.length) );
        final java.util.List<java.lang.ThreadGroup> result = new java.util.ArrayList<java.lang.ThreadGroup>(count);
        for (int i = 0 ; i < count ; ++i) {
            if (predicate.test(threadGroups[i])) {
                result.add(threadGroups[i]);
            } 
        }
        return ((_returnReplacementOperatorHotSpot3506.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.util.Collections.unmodifiableCollection(result)));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3494 = metamutator.Selector.of(3494,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot3494");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3495 = metamutator.Selector.of(3495,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot3495");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3496 = metamutator.Selector.of(3496,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot3496");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3497 = metamutator.Selector.of(3497,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot3497");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3498 = metamutator.Selector.of(3498,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot3498");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3499 = metamutator.Selector.of(3499,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ThreadUtils.class).id("_returnReplacementOperatorHotSpot3499");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3500 = metamutator.Selector.of(3500,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ThreadUtils.class).id("_returnReplacementOperatorHotSpot3500");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3501 = metamutator.Selector.of(3501,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ThreadUtils.class).id("_returnReplacementOperatorHotSpot3501");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3502 = metamutator.Selector.of(3502,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ThreadUtils.class).id("_returnReplacementOperatorHotSpot3502");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3503 = metamutator.Selector.of(3503,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ThreadUtils.class).id("_returnReplacementOperatorHotSpot3503");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3504 = metamutator.Selector.of(3504,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ThreadUtils.class).id("_returnReplacementOperatorHotSpot3504");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3505 = metamutator.Selector.of(3505,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ThreadUtils.class).id("_returnReplacementOperatorHotSpot3505");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3506 = metamutator.Selector.of(3506,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ThreadUtils.class).id("_returnReplacementOperatorHotSpot3506");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3507 = metamutator.Selector.of(3507,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ThreadUtils.class).id("_returnReplacementOperatorHotSpot3507");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3508 = metamutator.Selector.of(3508,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ThreadUtils.class).id("_returnReplacementOperatorHotSpot3508");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3509 = metamutator.Selector.of(3509,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ThreadUtils.class).id("_returnReplacementOperatorHotSpot3509");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3510 = metamutator.Selector.of(3510,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ThreadUtils.class).id("_returnReplacementOperatorHotSpot3510");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3511 = metamutator.Selector.of(3511,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ThreadUtils.class).id("_returnReplacementOperatorHotSpot3511");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3512 = metamutator.Selector.of(3512,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ThreadUtils.class).id("_returnReplacementOperatorHotSpot3512");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3513 = metamutator.Selector.of(3513,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ThreadUtils.class).id("_returnReplacementOperatorHotSpot3513");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3514 = metamutator.Selector.of(3514,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ThreadUtils.class).id("_returnReplacementOperatorHotSpot3514");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3515 = metamutator.Selector.of(3515,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ThreadUtils.class).id("_returnReplacementOperatorHotSpot3515");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3516 = metamutator.Selector.of(3516,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ThreadUtils.class).id("_returnReplacementOperatorHotSpot3516");
}

