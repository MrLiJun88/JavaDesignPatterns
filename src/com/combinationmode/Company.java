package com.combinationmode;

import java.util.ArrayList;
import java.util.List;

/**
 * Company管理的是Department
 */
public class Company extends AbstractOrganiziation {
    /**
     * list中存放的是Department实例对象
     */
    List<AbstractOrganiziation> list = new ArrayList<>();
    /**构造器*/
    public Company(String name, String describe) {
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
