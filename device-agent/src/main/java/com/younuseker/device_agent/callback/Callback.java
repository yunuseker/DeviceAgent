package com.younuseker.device_agent.callback;

/**
 * Created by yunuseker on 05.11.2018.
 * github.com/yunuseker
 * younuseker@gmail.com
 */
public interface Callback<T> {

    void success(T response);

    void fail(Throwable t);
}
