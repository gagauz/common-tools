package com.gagauz.common.utils;

public interface FilterChain<E> extends Filter<E> {
    FilterChain<E> and(Filter<E> and);

    FilterChain<E> or(Filter<E> or);

    FilterChain<E> not();

}
