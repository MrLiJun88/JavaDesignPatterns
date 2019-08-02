package com.observermode.observer;

public class WuHanWeather implements Observer {

    @Override
    public void update(double temperature,double humidity){
        System.out.println("========武汉的天气========");
        System.out.println("当前的温度：" + temperature);
        System.out.println("当前的湿度: " + humidity);
    }
}
