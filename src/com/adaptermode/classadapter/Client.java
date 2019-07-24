package com.adaptermode.classadapter;

public class Client {
    public static void main(String[] args) {
        VoltageInterface vi = new VoltageAdapter();
        Phone phone = new Phone();
        phone.charge(vi);
    }
}
