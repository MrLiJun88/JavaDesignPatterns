package com.proxymode.CGlib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 实现CGlib实现动态代理
 */
public class ProxyFactory implements MethodInterceptor {
    /**目标对象*/
    private Object target;
    /**通过构造器注入目标对象实例*/
    public ProxyFactory(Object target){
        this.target = target;
    }
    /**返回当前目标对象的代理对象*/
    public Object getProxyInstance(){
        /**
         * 1.创建工具类
         * 2.设置父类
         * 3.设置回调函数
         * 4.创建子对象，即代理对象并返回
         */
       Enhancer enhancer = new Enhancer();
       enhancer.setSuperclass(target.getClass());
       enhancer.setCallback(this);
       return enhancer.create();
    }
    /**重写intercept方法*/
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("通过CGLib实现动态代理...");
        Object object = method.invoke(target,objects);
        System.out.println("通过CGLib完成了目标方法的调用");
        return object;
    }
}
