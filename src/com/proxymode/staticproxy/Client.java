package com.proxymode.staticproxy;

public class Client {
    public static void main(String[] args) {
        /**创建目标对象*/
        ITeacherDao teacherDao = new TeacherDao();
        /**创建代理对象，用来代理真实对象*/
        TeacherDaoProxy proxy = new TeacherDaoProxy(teacherDao);
        proxy.teach();
    }
}
