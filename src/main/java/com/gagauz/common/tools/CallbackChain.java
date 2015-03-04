package com.gagauz.common.tools;

public interface CallbackChain<E> extends Callback<E> {
    CallbackChain<E> append(Callback<E> append);

    CallbackChain<E> prepend(Callback<E> prepend);
}
