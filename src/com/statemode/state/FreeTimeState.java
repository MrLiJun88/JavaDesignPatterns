package com.statemode.state;

import com.statemode.Room;

/**
 * 空闲状态的房间，只能预定和入住
 */
public class FreeTimeState implements State{
    /**与Room是一个聚合关系*/
    Room room;
    /**构造器*/
    public FreeTimeState(Room room){
        this.room = room;
    }
    @Override
    public void bookRoom() {
        System.out.println("你已成功预定...");
        /**改变状态*/
        room.setState(room.getBookState());
    }

    @Override
    public void cancleRoom() {
        //空操作
    }

    @Override
    public void checkInRoom() {
        System.out.println("入住成功");
        room.setState(room.getCheckInState());
    }

    @Override
    public void checkOutRoom() {
     //空操作
    }
}
