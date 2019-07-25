package com.bridgemode;

public class _5GPhone extends AbstractPhone {
    public _5GPhone(Brand brand) {
        super(brand);
    }
    @Override
    public void open() {
        System.out.println("使用的手机支持5G");
        super.open();
    }

    @Override
    public void call() {
        System.out.println("使用的手机支持5G");
        super.call();
    }

    @Override
    public void close() {
        System.out.println("使用的手机支持5G");
        super.close();
    }
}
