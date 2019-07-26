package com.combinationmode;

/**
 * Position 是叶子，下面并不具有其他类型的引用,所以并不需要 add(),remove()方法
 */
public class Position extends AbstractOrganiziation {
    /**构造器*/
    public Position(String name, String describe) {
        super(name, describe);
    }

    @Override
    public void show() {
        System.out.println(this.name + " " + this.describe);
    }
}
