package me.erobaby.study.java.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeInvocationHandler<T> implements InvocationHandler {
    private T target;
    public TimeInvocationHandler(T target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.currentTimeMillis();
        Object ret =  method.invoke(target, args);
        long end = System.currentTimeMillis();
        System.out.println(String.format("exec time %d ms", end - start));
        return ret;
    }
}
