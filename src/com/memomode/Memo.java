package com.memomode;

/**
 * 备忘录对象
 */
public class Memo {
    /**备忘录对象要与被存档的对象拥有相同的属性状态*/
    String state;
    public Memo(String state){
        this.state = state;
    }
}
