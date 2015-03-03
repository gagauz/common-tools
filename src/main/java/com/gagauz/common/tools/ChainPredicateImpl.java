package com.gagauz.common.tools;

abstract public class ChainPredicateImpl<E> implements ChainPredicate<E> {
    @Override
    public final ChainPredicate<E> and(final Predicate<E> and) {
        final ChainPredicate<E> $this = this;
        return new ChainPredicateImpl<E>() {
            @Override
            public boolean apply(E element) {
                return $this.apply(element) && and.apply(element);
            }
        };
    }

    @Override
    public final ChainPredicate<E> or(final Predicate<E> or) {
        final ChainPredicate<E> $this = this;
        return new ChainPredicateImpl<E>() {
            @Override
            public boolean apply(E element) {
                return $this.apply(element) || or.apply(element);
            }
        };
    }

    @Override
    public final ChainPredicate<E> not() {
        final ChainPredicate<E> $this = this;
        return new ChainPredicateImpl<E>() {
            @Override
            public boolean apply(E element) {
                return !$this.apply(element);
            }
        };
    }
}
