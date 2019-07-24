package com.adaptermode.classadapter;

/**
 * 适配器类，继承了被适配的类，实现了适配接口
 */
public class VoltageAdapter extends Voltage220V implements VoltageInterface {
    @Override
    public int output5v() {
        /**获得原电压*/
        int voltage = this.output220v();
        /**将原电压转成需要的电压*/
        int resultVoltage = voltage / 44;
        return resultVoltage;
    }
}
