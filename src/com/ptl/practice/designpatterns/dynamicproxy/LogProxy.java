package com.ptl.practice.designpatterns.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * created by panta on 2019/6/26.
 *
 * @author panta
 */
public class LogProxy implements InvocationHandler {

    private Object target;

    public static Hello  bind(Object target) {
        return (Hello) Proxy.newProxyInstance(
                Hello.class.getClassLoader(), new Class[]{Hello.class}, new LogProxy(target));
    }

    public LogProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before method log");

        return method.invoke(this.target,args);
    }
}
