package com.chainOfResponsibilityModel;

public class PurchaseRequest {
    int type;
    public double price;
    public int id;
    /**构造器*/
    public PurchaseRequest(int type,double price,int id){
        this.type = type;
        this.price = price;
        this.id = id;
    }
}
