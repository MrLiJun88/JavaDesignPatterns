package com.bridgemode;

public class _4GPhone extends AbstractPhone {
    public _4GPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        System.out.println("使用的手机支持4G");
        super.open();
    }

    @Override
    public void call() {
        System.out.println("使用的手机支持4G");
        super.call();
    }

    @Override
    public void close() {
        System.out.println("使用的手机支持4G");
        super.close();
    }
}
