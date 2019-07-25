package com.decorationmode.decorator;

import com.decorationmode.component.Drink;
/**具体的调味品 糖*/
public class Sugar extends Decorator {

    public Sugar(Drink drink) {
        super(drink);
        this.setDescribe("糖果");
        this.setPrice(6);
    }
}
