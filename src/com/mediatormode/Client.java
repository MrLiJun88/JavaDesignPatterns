package com.mediatormode;

import com.mediatormode.colleague.LiSi;
import com.mediatormode.colleague.WangWu;
import com.mediatormode.colleague.ZhangSan;
import com.mediatormode.mediator.ConcreteMediator;

/**
 * 中介者模式
 */
public class Client {
    public static void main(String[] args) {
        /**创建具体中介人*/
        ConcreteMediator mediator = new ConcreteMediator();
        /**定义同事*/
        WangWu wangwu = new WangWu("wangwu",mediator);
        LiSi lisi = new LiSi("lisi",mediator);
        ZhangSan zhangsan = new ZhangSan("zhangsan",mediator);
        /**让中介人知晓每个同事，好让中介人与每个同事类之间通信*/
        mediator.setLisi(lisi);
        mediator.setZhangsan(zhangsan);
        mediator.setWangwu(wangwu);

        wangwu.contact("我是王五，我要和李四说话");
        lisi.contact("我是李四，我要和王五说话");
    }
}
