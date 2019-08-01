package com.Iteratormode.college;

import com.Iteratormode.iterator.ComputerCollegeIter;
import com.Iteratormode.Department;

import java.util.Iterator;

public class ComputerCollege implements College {
    Department[] departments;
    /**保存当前数组对象的个数*/
    int numOfDepart = 0;
    /**构造器*/
    public ComputerCollege(){
        departments = new Department[5];
        this.addDepartment("java","编程语言");
        this.addDepartment("math","离散数学");
        this.addDepartment("english","专业英语");
        this.addDepartment("html","网页开发");
    }
    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String describe) {
        Department depart = new Department(name,describe);
        departments[numOfDepart++] = depart;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIter(departments);
    }
}
