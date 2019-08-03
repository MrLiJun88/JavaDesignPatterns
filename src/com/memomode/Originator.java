package com.memomode;

/**
 * 要被存档的对象
 */
public class Originator {
    /**状态属性*/
    String state;
    /**编写一个方法，可以保存一个状态对象*/
    public Memo saveStateMemo(){
        return new Memo(state);
    }
    /**通过备忘录对象，恢复状态*/
    public void getStateFromMemo(Memo memo){
        state = memo.state;
    }
}
