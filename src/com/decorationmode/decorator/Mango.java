package com.decorationmode.decorator;

import com.decorationmode.component.Drink;

public class Mango extends Decorator {

    public Mango(Drink drink) {
        super(drink);
        this.setDescribe("芒果");
        this.setPrice(22);
    }
}
