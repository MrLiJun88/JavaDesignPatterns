package com.proxymode.staticproxy;

public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("教授的是java课程");
    }
}
