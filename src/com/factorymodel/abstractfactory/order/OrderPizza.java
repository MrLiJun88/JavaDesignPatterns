package com.factorymodel.abstractfactory.order;

public class OrderPizza {

    FactoryInterface factory;
    public OrderPizza(FactoryInterface factory){
        this.factory = factory;
    }
}
