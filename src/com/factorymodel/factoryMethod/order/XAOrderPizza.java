package com.factorymodel.factoryMethod.order;

import com.factorymodel.factoryMethod.pizza.Pizza;
import com.factorymodel.factoryMethod.pizza.XAChinaPizza;
import com.factorymodel.factoryMethod.pizza.XAGeekPizza;

public class XAOrderPizza extends OrderPizza {
    @Override
    public Pizza createPizza(String typePizza) {
        if ("xageek".equals(typePizza)) {
            return new XAGeekPizza(typePizza);
        }
        else if("xachina".equals(typePizza)){
            return new XAChinaPizza(typePizza);
        }
        else {
            System.out.println("订单有误");
            return null;
        }
    }
}
