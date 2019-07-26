package com.combinationmode;

import java.util.ArrayList;
import java.util.List;

/**
 * Department下面管理的是Position
 */
public class Department extends AbstractOrganiziation {
    /**
     * list中存放的是Position实例对象
     */
    List<AbstractOrganiziation> list = new ArrayList<>();
    /**构造器*/
    public Department(String name, String describe) {
        super(name, describe);
    }

    @Override
    public void add(AbstractOrganiziation organiziation) {
        list.add(organiziation);
    }

    @Override
    public void remove(AbstractOrganiziation organiziation) {
        list.remove(organiziation);
    }

    @Override
    public void show() {
        System.out.println("===========" + this.name + "============");
        for(AbstractOrganiziation ao : list){
            ao.show();
        }
    }
}
