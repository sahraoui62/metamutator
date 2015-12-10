package org.apache.commons.lang3.builder;


public interface Diffable<T> {
    org.apache.commons.lang3.builder.DiffResult diff(T obj);
}

