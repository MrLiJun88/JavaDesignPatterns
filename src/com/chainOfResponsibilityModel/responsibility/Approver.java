package com.chainOfResponsibilityModel.responsibility;

import com.chainOfResponsibilityModel.PurchaseRequest;

public abstract class Approver {
    /**下一个处理者*/
    public Approver approver;
    /**名字*/
    String name;
    public Approver(String name){
        this.name = name;
    }
    /**处理请求的方法，由子类去实现*/
    public abstract void processRequest(PurchaseRequest request);
}
