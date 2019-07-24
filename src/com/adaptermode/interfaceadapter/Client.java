package com.adaptermode.interfaceadapter;

public class Client {
    public static void main(String[] args) {
        AbstractAdapter adapter = new AbstractAdapter(){
            /**只需要使用哪个类时，重写它的方法即可，不用全部实现它的所有方法*/
            @Override
            public void method4() {
                System.out.println("使用接口适配器模式使用了method4方法");
            }
        };
        adapter.method4();
    }
}
