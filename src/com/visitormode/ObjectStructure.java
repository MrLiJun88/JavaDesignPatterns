package com.visitormode;

import com.visitormode.operation.Review;
import com.visitormode.person.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * 维护了一个集合
 */
public class ObjectStructure {
    List<Person> list = new ArrayList<>();
    /**增加到集合中*/
    public void attach(Person person){
        list.add(person);
    }
    /**从集合中移除*/
    public void detach(Person person){
        list.remove(person);
    }
    /**显示测试情况*/
    public void display(Review review){
        for(Person p : list){
            p.accept(review);
        }
    }
}
