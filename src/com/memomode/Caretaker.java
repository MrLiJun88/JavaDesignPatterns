package com.memomode;

import java.util.ArrayList;
import java.util.List;

/**
 * 管理多个备忘录
 */
public class Caretaker {
    /**用集合来管理多个备忘录对象*/
    List<Memo> memoList = new ArrayList<>();

    public void addMemo(Memo memo){
        memoList.add(memo);
    }
    public void deleteMemo(Memo memo){
        memoList.remove(memo);
    }

    public Memo getMemo(int index){
        return memoList.get(index);
    }
}
