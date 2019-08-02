package com.observermode.subject;

import com.observermode.observer.Observer;

public interface Subject {
    void addRegister(Observer observer);
    void removeRegister(Observer observer);
    void notifyRegister();
}
