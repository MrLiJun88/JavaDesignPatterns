package com.factorymodel.factoryMethod.order;

import com.factorymodel.factoryMethod.pizza.Pizza;

public abstract class OrderPizza {

    public abstract Pizza createPizza(String typePizza);
}
