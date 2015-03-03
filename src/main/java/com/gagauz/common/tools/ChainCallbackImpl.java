package com.gagauz.common.tools;

public abstract class ChainCallbackImpl<E> implements ChainCallback<E> {

    @Override
    public ChainCallback<E> append(final Callback<E> append) {
        final ChainCallback<E> $this = this;
        return new ChainCallbackImpl<E>() {
            @Override
            public void call(E object) {
                $this.call(object);
                append.call(object);
            }
        };
    }

    @Override
    public ChainCallback<E> prepend(final Callback<E> prepend) {
        final ChainCallback<E> $this = this;
        return new ChainCallbackImpl<E>() {
            @Override
            public void call(E object) {
                prepend.call(object);
                $this.call(object);
            }
        };
    }
}
