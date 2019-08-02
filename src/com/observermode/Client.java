package com.observermode;

import com.observermode.observer.NanJingWeather;
import com.observermode.observer.ShangHaiWeather;
import com.observermode.observer.WuHanWeather;
import com.observermode.observer.Observer;
import com.observermode.subject.WeatherData;

/**
 * 实现观察者模式
 */
public class Client {
    public static void main(String[] args) {
        /**创建被观察者对象*/
        WeatherData weather = new WeatherData();
        /**创建观察者对象*/
        Observer observer = new WuHanWeather();
        Observer observer2 = new ShangHaiWeather();
        Observer observer3 = new NanJingWeather();
        /**将观察者对象加入观察中*/
        weather.addRegister(observer);
        weather.addRegister(observer2);
        weather.addRegister(observer3);
        System.out.println("通知各个观察者对象做出更新");
        weather.setData(11.5,6.66);
    }
}
