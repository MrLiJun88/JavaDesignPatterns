package com.factorymodel.abstractfactory.order;

import com.factorymodel.abstractfactory.pizza.BJGeekPizza;
import com.factorymodel.abstractfactory.pizza.BJOpenPizza;
import com.factorymodel.abstractfactory.pizza.Pizza;

public class BjFactory implements FactoryInterface {
    @Override
    public Pizza createPizza(String typeOrder) {
        if("geek".equals(typeOrder)){
            return new BJGeekPizza("北京牛奶披萨");
        }
        else if("open".equals(typeOrder)){
            return new BJOpenPizza("北京开放披萨");
        }
        else {
            System.out.println("输入有误");
            return null;
        }
    }
}
