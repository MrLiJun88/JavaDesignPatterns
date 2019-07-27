package com.proxymode.staticproxy;

/**
 * 静态代理
 */
public class TeacherDaoProxy implements ITeacherDao {
    /**代理对象聚合了真实对象，以调用真实对象的方法*/
    ITeacherDao teacherDao;
    /**构造器*/
    public TeacherDaoProxy(ITeacherDao teacherDao){
        this.teacherDao = teacherDao;
    }
    @Override
    public void teach() {
        System.out.println("准备课程ppt");
        /**在调用真实对象的方法前，代理类可以完成一些自己的事情*/
        teacherDao.teach();
        System.out.println("写课程总结");
    }
}
