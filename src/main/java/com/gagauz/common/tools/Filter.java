package com.gagauz.common.tools;

public interface Filter<E> {
    boolean apply(E element);
}
