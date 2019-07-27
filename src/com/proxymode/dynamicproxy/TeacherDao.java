package com.proxymode.dynamicproxy;

public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("教授的是离散数组");
    }
    @Override
    public void teacher(String name){
        System.out.println("老师姓名：" + name);
    }
}
