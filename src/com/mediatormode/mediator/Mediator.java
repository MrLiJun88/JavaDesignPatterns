package com.mediatormode.mediator;

import com.mediatormode.colleague.Colleague;

/**
 * 定义抽象中介者,可以与同事们进行联络
 */
public abstract class Mediator {
    /**中介者与同事通知*/
    public abstract void contact(String message, Colleague colleague);
}
