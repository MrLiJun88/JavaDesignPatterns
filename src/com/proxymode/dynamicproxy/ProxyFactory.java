package com.proxymode.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyFactory implements InvocationHandler {
    /**维护一个目标对象*/
    private Object targetObject;
    /**通过构造器将真实的对象注入到代理中*/
    public ProxyFactory(Object targetObject){
        this.targetObject = targetObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理开始");
        /**method.invoke(真实对象的实例，方法的参数(可有可无))*/
        Object object = method.invoke(targetObject,args);
        System.out.println("动态代理结束");
        return object;
    }
}
