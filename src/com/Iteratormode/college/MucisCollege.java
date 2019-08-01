package com.Iteratormode.college;

import com.Iteratormode.Department;
import com.Iteratormode.iterator.MusicCollegeIter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MucisCollege implements College {
    List<Department> list;
    /**构造器*/
    public MucisCollege(){
        list = new ArrayList<>();
        this.addDepartment("bale","芭蕾");
        this.addDepartment("kongque","孔雀");
        this.addDepartment("piano","钢琴");
    }
    @Override
    public String getName() {
        return "音乐学院";
    }

    @Override
    public void addDepartment(String name, String describe) {
        Department depart = new Department(name,describe);
        list.add(depart);
    }

    @Override
    public Iterator createIterator() {
        return new MusicCollegeIter(list);
    }
}
