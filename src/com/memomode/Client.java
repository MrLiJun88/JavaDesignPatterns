package com.memomode;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.state = "初始状态#1";
        Caretaker caretaker = new Caretaker();
        /**保存了当前的状态*/
        caretaker.addMemo(originator.saveStateMemo());

        originator.state = "现在状态#2";
        caretaker.addMemo(originator.saveStateMemo());

        originator.state = "最后状态#3";
        caretaker.addMemo(originator.saveStateMemo());

        /**恢复到状态1*/
        System.out.println("当前的状态是：" + originator.state);
        originator.getStateFromMemo(caretaker.getMemo(0));
        System.out.println("恢复后的状态是：" + originator.state);
    }
}
