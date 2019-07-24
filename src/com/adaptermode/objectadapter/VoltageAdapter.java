package com.adaptermode.objectadapter;

/**
 * 适配器类，继承了被适配的类，实现了适配接口
 */
public class VoltageAdapter extends Voltage220V implements VoltageInterface {
    /**Voltage220V 与 VoltageAdapter类为聚合关系*/
    Voltage220V voltage220V;
    public VoltageAdapter(Voltage220V voltage220V){
        this.voltage220V = voltage220V;
    }
    @Override
    public int output5v() {
        System.out.println("使用对象适配器模式");
        if(null != voltage220V){
            int voltage = voltage220V.output220v();
            return voltage / 44;
        }
        return -1;
    }
}
