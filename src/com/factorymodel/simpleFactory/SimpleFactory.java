package com.factorymodel.simpleFactory;

import com.factorymodel.simpleFactory.pizza.ChinaPizza;
import com.factorymodel.simpleFactory.pizza.GeekPizza;
import com.factorymodel.simpleFactory.pizza.OpenPizza;
import com.factorymodel.simpleFactory.pizza.Pizza;

public class SimpleFactory {

    public static Pizza createPizza(String typeOrder){
        System.out.println("使用简单工厂模式...");
        if("geek".equals(typeOrder)){
            return new GeekPizza("geek");
        }
        else if("china".equals(typeOrder)){
            return new ChinaPizza("china");
        }
        else if("open".equals(typeOrder)){
            return new OpenPizza("open");
        }
        else {
            System.out.println("输入有误！");
            return null;
        }
    }
}
