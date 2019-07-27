package com.templatemethodmode;

public class Client {
    public static void main(String[] args) {
        SoyMilk redMilk = new RedBeansMilk();
        SoyMilk coffeeMilk = new CoffeeMilk();
        redMilk.make();
        System.out.println("------------");
        coffeeMilk.make();
        System.out.println("-------------");
        SoyMilk puremilk = new PureMilk();
        puremilk.make();
    }
}
