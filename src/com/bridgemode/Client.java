package com.bridgemode;

/**
 * 实现桥接模式
 */
public class Client {
    public static void main(String[] args) {
        Brand brand = new Vivo();
        AbstractPhone phone = new _4GPhone(brand);
        phone.open();
        phone.call();
        phone.close();
    }
}
