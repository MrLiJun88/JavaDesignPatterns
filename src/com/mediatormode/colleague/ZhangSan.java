package com.mediatormode.colleague;

import com.mediatormode.mediator.Mediator;

public class ZhangSan extends Colleague {
    /**
     * 构造器
     */
    public ZhangSan(String name, Mediator mediator) {
        super(name, mediator);
    }
    public void getMessage(String message){
        System.out.println("同事: " + name + "获得的信息: " + message);
    }
    /**与中介者通信*/
    public void contact(String message){
        mediator.contact(message,this);
    }
}
