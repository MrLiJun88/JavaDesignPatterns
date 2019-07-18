package com.factorymodel.factoryMethod;

import com.factorymodel.factoryMethod.order.OrderPizza;
import com.factorymodel.factoryMethod.order.XAOrderPizza;

import java.util.Scanner;

/**
 * 工厂方法模式介绍
 * 工厂方法模式设计方案：将披萨项目的实例化功能抽象成抽象方法，在不同的口味点餐子类中具体实现。
 * 工厂方法模式：定义了一个创建对象的抽象方法，由子类决定要实例化的类。工厂方
 * 法模式将对象的实例化推迟到子类
 */
public class Client {
    public static void main(String[] args) {
//        OrderPizza orderPizza1 = new BJOrderPizza();
        OrderPizza orderPizza2 = new XAOrderPizza();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要订购的披萨名称...");
        String input = scanner.next();
        while(! "exit".equals(input)){
            orderPizza2.createPizza(input);
            input = scanner.next();
        }
    }
}
