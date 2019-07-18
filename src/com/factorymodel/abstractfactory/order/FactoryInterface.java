package com.factorymodel.abstractfactory.order;

import com.factorymodel.abstractfactory.pizza.Pizza;
/**一个抽象工厂模式的抽象层，即接口*/
public interface FactoryInterface {

    Pizza createPizza(String typeOrder);
}
