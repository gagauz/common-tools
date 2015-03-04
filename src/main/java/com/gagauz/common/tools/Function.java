package com.gagauz.common.tools;

public interface Function<P, R> {
    R call(P parameter);
}
