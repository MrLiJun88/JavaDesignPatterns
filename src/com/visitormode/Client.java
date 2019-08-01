package com.visitormode;

import com.visitormode.operation.Fail;
import com.visitormode.operation.Success;
import com.visitormode.operation.Wait;
import com.visitormode.person.Man;
import com.visitormode.person.Woman;

public class Client {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.attach(new Man());
        os.attach(new Woman());
        /**晋级成功*/
        Success success = new Success();
        os.display(success);
        System.out.println("------------");
        /**晋级失败*/
        Fail fail = new Fail();
        os.display(fail);
        System.out.println("-----------");
        Wait wait = new Wait();
        os.display(wait);
    }
}
