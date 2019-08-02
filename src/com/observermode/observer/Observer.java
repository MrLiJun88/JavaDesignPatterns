package com.observermode.observer;

/**
 * 观察者接口，由具体的观察者来实现
 */
public interface Observer {
    void update(double temperature,double humidity);
}
