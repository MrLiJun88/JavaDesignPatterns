package com.factorymodel.abstractfactory.order;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza(new XAFactory());
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入要订购的披萨名称");
        String input = scanner.next();
        while(! "exit".equals(input)){
            orderPizza.factory.createPizza(input);
            input = scanner.next();
        }
    }
}
