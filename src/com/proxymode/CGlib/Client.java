package com.proxymode.CGlib;

public class Client {
    public static void main(String[] args) {
        /**定义目标对象*/
        TeacherDao teacherDao = new TeacherDao();
        /**生成代理对象，并将目标对象注入代理对象中*/
        ProxyFactory proxy = new ProxyFactory(teacherDao);
        /**通过代理类获取代理的对象*/
        TeacherDao target = (TeacherDao) proxy.getProxyInstance();
        System.out.println(target);
        System.out.println("--------------");
        target.teacher("二狗");
    }
}
