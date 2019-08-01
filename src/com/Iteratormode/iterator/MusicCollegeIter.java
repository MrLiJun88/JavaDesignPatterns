package com.Iteratormode.iterator;

import com.Iteratormode.Department;

import java.util.Iterator;
import java.util.List;

public class MusicCollegeIter implements Iterator {
    /**以集合的形式存放*/
    List<Department> list;
    int index = -1;
    public MusicCollegeIter(List<Department> list){
        this.list = list;
    }
    @Override
    public boolean hasNext() {
        if(index >= list.size() - 1){
            return false;
        }
        else {
            index++;
            return true;
        }
    }

    @Override
    public Object next() {
        return list.get(index);
    }
}
