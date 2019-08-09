package com.chainOfResponsibilityModel;

import com.chainOfResponsibilityModel.responsibility.ChairmanManager;
import com.chainOfResponsibilityModel.responsibility.CollegeManager;
import com.chainOfResponsibilityModel.responsibility.DepartManager;
import com.chainOfResponsibilityModel.responsibility.SchoolMasterManager;

/**
 * 责任链模式
 */
public class Client {
    public static void main(String[] args) {
        /**创建请求*/
        PurchaseRequest request = new PurchaseRequest(0,25000,001);
        /**创建处理请求的部分*/
        DepartManager departManager = new DepartManager("系主任");
        CollegeManager collegeManager = new CollegeManager("王院长");
        ChairmanManager chairmanManager = new ChairmanManager("习主席");
        SchoolMasterManager schoolMasterManager = new SchoolMasterManager("孙校长");
        /**设置各个处理者的下一个处理者，形成一个职责链,形成一个环状*/
        departManager.approver = collegeManager;
        collegeManager.approver = chairmanManager;
        chairmanManager.approver = schoolMasterManager;
        schoolMasterManager.approver = departManager;

        chairmanManager.processRequest(request);
    }
}
