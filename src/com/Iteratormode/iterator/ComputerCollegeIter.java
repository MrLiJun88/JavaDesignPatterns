package com.Iteratormode.iterator;

import com.Iteratormode.Department;

import java.util.Iterator;

public class ComputerCollegeIter implements Iterator {
    /**我们需要知道Department是以怎样的方法存放的,这里以数组的形式存放*/
    Department[] departments;
    /**遍历的位置*/
    int index = 0;
    /**构造器*/
    public ComputerCollegeIter(Department[] departments){
        this.departments = departments;
    }
    @Override
    public boolean hasNext() {
        if(index >= departments.length || departments[index] == null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return departments[index++];
    }
}
