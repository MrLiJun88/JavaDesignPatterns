package com.chainOfResponsibilityModel.responsibility;

import com.chainOfResponsibilityModel.PurchaseRequest;

public class CollegeManager extends Approver {
    public CollegeManager(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.price > 5000 && request.price <= 10000){
            System.out.println("请求id：" + request.id + " 被 " + this.name + " 处理了");
        }
        /**如果我处理不了，让我的后继者来处理，形成一条链*/
        else {
            this.approver.processRequest(request);
        }
    }
}
