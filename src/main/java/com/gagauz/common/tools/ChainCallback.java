package com.gagauz.common.tools;

public interface ChainCallback<E> extends Callback<E> {
    ChainCallback<E> append(Callback<E> append);

    ChainCallback<E> prepend(Callback<E> prepend);
}
