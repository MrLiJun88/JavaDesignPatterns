package com.Iteratormode.college;

import java.util.Iterator;

public interface College {
    /**得到学院的名称*/
    String getName();
    /**添加系*/
    void addDepartment(String name,String describe);
    /**返回迭代器*/
    Iterator createIterator();
}
