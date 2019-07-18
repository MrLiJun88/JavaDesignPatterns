package com.factorymodel.abstractfactory.order;

import com.factorymodel.abstractfactory.pizza.*;

public class XAFactory implements FactoryInterface {
    @Override
    public Pizza createPizza(String typeOrder) {
        if("china".equals(typeOrder)){
            return new XAChinaPizza("西安中国披萨");
        }
        else if("geek".equals(typeOrder)){
            return new XAGeekPizza("西安牛奶披萨");
        }
        else {
            System.out.println("输入有误");
            return null;
        }
    }
}
