package com.observermode.subject;

import com.observermode.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private double temperature;
    private double humidity;
    /**一个管理观察者的集合对象*/
    List<Observer> observerList;
    /**构造器*/
    public WeatherData(){
        observerList = new ArrayList<>();
    }
    /**更新数据*/
    public void setData(double temperature,double humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        /**更新完数据之后，再通知每个观察者做出相应的更新*/
        this.notifyRegister();
    }
    @Override
    public void addRegister(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeRegister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyRegister() {
        for(Observer observer : observerList){
            observer.update(temperature,humidity);
        }
    }
}
