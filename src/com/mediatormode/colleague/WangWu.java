package com.mediatormode.colleague;

import com.mediatormode.mediator.Mediator;

public class WangWu extends Colleague {
    /**构造器*/
    public WangWu(String name, Mediator mediator) {
        super(name, mediator);
    }
    public void getMessage(String message){
        System.out.println("同事: " + name + "获得的信息: " + message);
    }
    /**与中介者通信,具体与谁通信，不是自己去完成，而是通过中介人去执行*/
    public void contact(String message){
        mediator.contact(message,this);
    }
}
