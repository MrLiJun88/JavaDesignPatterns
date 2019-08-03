package com.mediatormode.colleague;

import com.mediatormode.mediator.Mediator;

/**
 * 定义抽象同事类
 */
public abstract class Colleague {
    String name;
    Mediator mediator;
    /**构造器*/
    public Colleague(String name,Mediator mediator){
        this.name = name;
        this.mediator = mediator;
    }
}
