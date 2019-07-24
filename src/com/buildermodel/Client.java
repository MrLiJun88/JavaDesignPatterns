package com.buildermodel;

public class Client {
    public static void main(String[] args) {
        /**创建具体的产品构造器*/
        AbstractBuilder builder = new ConcreteProduct1();
        /**创建指挥者*/
        Director director = new Director(builder);
        /**完成生产，并返回产品*/
        Product product = director.construct();
    }
}
