package com.decorationmode;

import com.decorationmode.component.Drink;
import com.decorationmode.component.UsaCoffee;
import com.decorationmode.decorator.Mango;
import com.decorationmode.decorator.Tea;

public class Client {
    public static void main(String[] args) {
        Drink coffee = new UsaCoffee();
        Drink tea = new Tea(coffee);
        Drink mango = new Mango(tea);
        System.out.println(mango.getDescribe());
    }
}
