package com.adaptermode.classadapter;

public class Phone {

    public void charge(VoltageInterface vi){
        if(5 == vi.output5v()){
            System.out.println("电压已转换成5V");
        }
        else {
            System.out.println("电压过高，不宜使用");
        }
    }
}
