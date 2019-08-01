package com.Iteratormode;

import com.Iteratormode.college.College;

import java.util.Iterator;
import java.util.List;

public class OutputImpl {
    List<College> collegeList;
    /**构造器*/
    public OutputImpl(List<College> list){
        this.collegeList = list;
    }
    /**遍历所有的学院,再调用printDepart获得学院中的系*/
    public void iterCollege(){
        for(College c : collegeList){
            System.out.println(c.getName());
            System.out.println("=============");
            Iterator iterator = c.createIterator();
            this.printDepart(iterator);
        }
    }
    /**遍历所有的系*/
    private void printDepart(Iterator iterator){
        while(iterator.hasNext()){
            Department department = (Department) iterator.next();
            System.out.println(department.name + " " + department.describe);
        }
    }
}
