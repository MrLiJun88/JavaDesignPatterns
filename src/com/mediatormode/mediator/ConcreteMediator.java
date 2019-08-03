package com.mediatormode.mediator;

import com.mediatormode.colleague.Colleague;
import com.mediatormode.colleague.LiSi;
import com.mediatormode.colleague.WangWu;
import com.mediatormode.colleague.ZhangSan;

/**
 * 具体的中介人
 */
public class ConcreteMediator extends Mediator{
    /**将所有的同事聚合在具体的中介人这里*/
    private WangWu wangwu;
    private LiSi lisi;
    private ZhangSan zhangsan;

    @Override
    public void contact(String message, Colleague colleague) {
        if(colleague == wangwu){
            wangwu.getMessage(message);
        }
        else if(colleague == lisi){
            lisi.getMessage(message);
        }
        else {
            zhangsan.getMessage(message);
        }
    }

    public void setWangwu(WangWu wangwu) {
        this.wangwu = wangwu;
    }

    public void setLisi(LiSi lisi) {
        this.lisi = lisi;
    }

    public void setZhangsan(ZhangSan zhangsan) {
        this.zhangsan = zhangsan;
    }
}
