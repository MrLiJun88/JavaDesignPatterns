package com.adaptermode.objectadapter;

public class Client {
    public static void main(String[] args) {
        Voltage220V voltage220V = new Voltage220V();
        VoltageInterface vi = new VoltageAdapter(voltage220V);
        Phone phone = new Phone();
        phone.charge(vi);
    }
}
