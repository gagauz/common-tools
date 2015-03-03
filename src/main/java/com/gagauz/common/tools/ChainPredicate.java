package com.gagauz.common.tools;

public interface ChainPredicate<E> extends Predicate<E> {
    ChainPredicate<E> and(Predicate<E> and);

    ChainPredicate<E> or(Predicate<E> or);

    ChainPredicate<E> not();

}
