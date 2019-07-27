package com.proxymode.dynamicproxy;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        /**创建目标对象*/
        ITeacherDao target = new TeacherDao();
        /**给目标对象创建代理对象*/
        ProxyFactory proxy = new ProxyFactory(target);
        /**
         * Proxy.newProxyInstance(目标对象的类加载器，目标对象的所有接口，实现了InvocationHandler接口的实例)
         */
        ITeacherDao targetProxy = (ITeacherDao)Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),proxy);
        targetProxy.teacher("王五");
        System.out.println("------------");
        targetProxy.teach();
    }
}
