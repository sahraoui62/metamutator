package org.jsoup.helper;


public class DescendableLinkedList<E> extends java.util.LinkedList<E> {
    public DescendableLinkedList() {
        super();
    }

    @java.lang.Override
    public void push(E e) {
        addFirst(e);
    }

    @java.lang.Override
    public E peekLast() {
        return (size()) == 0 ? null : getLast();
    }

    @java.lang.Override
    public E pollLast() {
        return (size()) == 0 ? null : removeLast();
    }

    @java.lang.Override
    public java.util.Iterator<E> descendingIterator() {
        return new DescendingIterator<E>(size());
    }

    private class DescendingIterator<E> implements java.util.Iterator<E> {
        private final java.util.ListIterator<E> iter;

        @java.lang.SuppressWarnings(value = "unchecked")
        private DescendingIterator(int index) {
            iter = ((java.util.ListIterator<E>)(listIterator(index)));
        }

        public boolean hasNext() {
            return iter.hasPrevious();
        }

        public E next() {
            return iter.previous();
        }

        public void remove() {
            iter.remove();
        }
    }
}

