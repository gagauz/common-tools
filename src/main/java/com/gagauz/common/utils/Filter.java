package com.gagauz.common.utils;

public interface Filter<E> {
    boolean apply(E element);
}
