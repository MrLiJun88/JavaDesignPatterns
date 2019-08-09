package com.strategymode;

import com.strategymode.strategy.AoDi;
import com.strategymode.strategy.BaoMa;
import com.strategymode.strategy.BenChi;
import com.strategymode.strategy.Car;

/**
 * 策略模式
 */
public class Client {
    public static void main(String[] args) {
        Car baoma = new BaoMa("宝马","黑色");
        Car aodi = new AoDi("奥迪","蓝色");
        Car benchi = new BenChi("奔驰","红色");

        Person person = new Person("王五",25,baoma);
        person.driver();
        /**切换策略*/
        person.setCar(aodi);
        person.driver();
        /**切换策略*/
        person.setCar(benchi);
        person.driver();
    }
}
