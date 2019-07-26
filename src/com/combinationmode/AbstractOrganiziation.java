package com.combinationmode;

public abstract class AbstractOrganiziation {
    String name;
    String describe;

    public AbstractOrganiziation(String name,String describe){
        this.name = name;
        this.describe = describe;
    }
    public void add(AbstractOrganiziation organiziation){

    }
    public void remove(AbstractOrganiziation organiziation){

    }
    public abstract void show();

}
