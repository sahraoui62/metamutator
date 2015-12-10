package org.apache.commons.lang3;


public class ThreadUtils {
    public static java.lang.Thread findThreadById(final long threadId, final java.lang.ThreadGroup threadGroup) {
        if (threadGroup == null) {
            throw new java.lang.IllegalArgumentException("The thread group must not be null");
        } 
        final java.lang.Thread thread = org.apache.commons.lang3.ThreadUtils.findThreadById(threadId);
        if ((thread != null) && (threadGroup.equals(thread.getThreadGroup()))) {
            return thread;
        } 
        return null;
    }

    public static java.lang.Thread findThreadById(final long threadId, final java.lang.String threadGroupName) {
        if (threadGroupName == null) {
            throw new java.lang.IllegalArgumentException("The thread group name must not be null");
        } 
        final java.lang.Thread thread = org.apache.commons.lang3.ThreadUtils.findThreadById(threadId);
        if (((thread != null) && ((thread.getThreadGroup()) != null)) && (thread.getThreadGroup().getName().equals(threadGroupName))) {
            return thread;
        } 
        return null;
    }

    public static java.util.Collection<java.lang.Thread> findThreadsByName(final java.lang.String threadName, final java.lang.ThreadGroup threadGroup) {
        return org.apache.commons.lang3.ThreadUtils.findThreads(threadGroup, false, new org.apache.commons.lang3.ThreadUtils.NamePredicate(threadName));
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
            return java.util.Collections.emptyList();
        } 
        final java.util.Collection<java.lang.Thread> result = new java.util.ArrayList<java.lang.Thread>();
        final org.apache.commons.lang3.ThreadUtils.NamePredicate threadNamePredicate = new org.apache.commons.lang3.ThreadUtils.NamePredicate(threadName);
        for (final java.lang.ThreadGroup group : threadGroups) {
            result.addAll(org.apache.commons.lang3.ThreadUtils.findThreads(group, false, threadNamePredicate));
        }
        return java.util.Collections.unmodifiableCollection(result);
    }

    public static java.util.Collection<java.lang.ThreadGroup> findThreadGroupsByName(final java.lang.String threadGroupName) {
        return org.apache.commons.lang3.ThreadUtils.findThreadGroups(new org.apache.commons.lang3.ThreadUtils.NamePredicate(threadGroupName));
    }

    public static java.util.Collection<java.lang.ThreadGroup> getAllThreadGroups() {
        return org.apache.commons.lang3.ThreadUtils.findThreadGroups(ALWAYS_TRUE_PREDICATE);
    }

    public static java.lang.ThreadGroup getSystemThreadGroup() {
        java.lang.ThreadGroup threadGroup = java.lang.Thread.currentThread().getThreadGroup();
        while ((threadGroup.getParent()) != null) {
            threadGroup = threadGroup.getParent();
        }
        return threadGroup;
    }

    public static java.util.Collection<java.lang.Thread> getAllThreads() {
        return org.apache.commons.lang3.ThreadUtils.findThreads(ALWAYS_TRUE_PREDICATE);
    }

    public static java.util.Collection<java.lang.Thread> findThreadsByName(final java.lang.String threadName) {
        return org.apache.commons.lang3.ThreadUtils.findThreads(new org.apache.commons.lang3.ThreadUtils.NamePredicate(threadName));
    }

    public static java.lang.Thread findThreadById(final long threadId) {
        final java.util.Collection<java.lang.Thread> result = org.apache.commons.lang3.ThreadUtils.findThreads(new org.apache.commons.lang3.ThreadUtils.ThreadIdPredicate(threadId));
        if (result.isEmpty()) {
            return null;
        } else {
            return result.iterator().next();
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
            return true;
        }

        @java.lang.Override
        public boolean test(final java.lang.Thread thread) {
            return true;
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
            return (threadGroup != null) && (threadGroup.getName().equals(name));
        }

        @java.lang.Override
        public boolean test(final java.lang.Thread thread) {
            return (thread != null) && (thread.getName().equals(name));
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
            return (thread != null) && ((thread.getId()) == (threadId));
        }
    }

    public static java.util.Collection<java.lang.Thread> findThreads(final ThreadPredicate predicate) {
        return org.apache.commons.lang3.ThreadUtils.findThreads(org.apache.commons.lang3.ThreadUtils.getSystemThreadGroup(), true, predicate);
    }

    public static java.util.Collection<java.lang.ThreadGroup> findThreadGroups(final ThreadGroupPredicate predicate) {
        return org.apache.commons.lang3.ThreadUtils.findThreadGroups(org.apache.commons.lang3.ThreadUtils.getSystemThreadGroup(), true, predicate);
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
            threads = new java.lang.Thread[(count + ((_arithmeticOperatorHotSpot848.is("PLUS")) ? ((count + 2)) : (_arithmeticOperatorHotSpot848.is("MINUS")) ? ((count - 2)) : (_arithmeticOperatorHotSpot848.is("MUL")) ? ((count * 2)) :  ((count / 2)))) + 1];
            count = group.enumerate(threads, recurse);
        } while (count >= (threads.length) );
        final java.util.List<java.lang.Thread> result = new java.util.ArrayList<java.lang.Thread>(count);
        for (int i = 0 ; i < count ; ++i) {
            if (predicate.test(threads[i])) {
                result.add(threads[i]);
            } 
        }
        return java.util.Collections.unmodifiableCollection(result);
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
            threadGroups = new java.lang.ThreadGroup[(count + ((_arithmeticOperatorHotSpot847.is("PLUS")) ? ((count + 2)) : (_arithmeticOperatorHotSpot847.is("MINUS")) ? ((count - 2)) : (_arithmeticOperatorHotSpot847.is("MUL")) ? ((count * 2)) :  ((count / 2)))) + 1];
            count = group.enumerate(threadGroups, recurse);
        } while (count >= (threadGroups.length) );
        final java.util.List<java.lang.ThreadGroup> result = new java.util.ArrayList<java.lang.ThreadGroup>(count);
        for (int i = 0 ; i < count ; ++i) {
            if (predicate.test(threadGroups[i])) {
                result.add(threadGroups[i]);
            } 
        }
        return java.util.Collections.unmodifiableCollection(result);
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot847 = metamutator.Selector.of(847,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.ThreadUtils.class).id("_arithmeticOperatorHotSpot847");

    private static final metamutator.Selector _arithmeticOperatorHotSpot848 = metamutator.Selector.of(848,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.ThreadUtils.class).id("_arithmeticOperatorHotSpot848");
}

