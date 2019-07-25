package com.bridgemode;

public abstract class AbstractPhone {
    Brand brand;
    public AbstractPhone(Brand brand){
        this.brand = brand;
    }
    public void open(){
        this.brand.open();
    }
    public void call(){
        this.brand.call();
    }
    public void close(){
        this.brand.close();
    }
}
