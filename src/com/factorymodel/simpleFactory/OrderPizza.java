package com.factorymodel.simpleFactory;
/**
 * 简单工厂模式
 * 基本介绍
 * 1) 简单工厂模式是属于创建型模式，是工厂模式的一种。简单工厂模式是由一
 * 个工厂对象决定创建出哪一种产品类的实例。简单工厂模式是工厂模式家族
 * 中最简单实用的模式
 * 2) 简单工厂模式：定义了一个创建对象的类，由这个类来封装实例化对象的行
 * 为(代码)
 * 3) 在软件开发中，当我们会用到大量的创建某种、某类或者某批对象时，就会
 * 使用到工厂模式
 */

import com.factorymodel.simpleFactory.pizza.Pizza;

import java.util.Scanner;

public class OrderPizza {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要订购的披萨名称...");
        String input = scanner.next();
        while(! "exit".equals(input)){
            /**需要什么对象的实例，从工厂中去拿就行，将创建实例对象的方法封闭在工厂中*/
            Pizza pizza = SimpleFactory.createPizza(input);
            input = scanner.next();
        }
    }
}
