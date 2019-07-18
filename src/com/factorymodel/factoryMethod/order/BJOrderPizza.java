package com.factorymodel.factoryMethod.order;

import com.factorymodel.factoryMethod.pizza.Pizza;
import com.factorymodel.factoryMethod.pizza.BJGeekPizza;
import com.factorymodel.factoryMethod.pizza.BJOpenPizza;

public class BJOrderPizza extends OrderPizza{
    @Override
    public Pizza createPizza(String typePizza) {
        if ("bjgeek".equals(typePizza)) {
            return new BJGeekPizza(typePizza);
        }
        else if("bjopen".equals(typePizza)){
            return new BJOpenPizza(typePizza);
        }
        else {
            System.out.println("订单有误");
            return null;
        }
    }
}
