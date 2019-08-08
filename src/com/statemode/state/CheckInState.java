package com.statemode.state;

import com.statemode.Room;

/**
 * 已入住状态
 */
public class CheckInState implements State{
    Room room;
    public CheckInState(Room room){
        this.room = room;
    }
    @Override
    public void bookRoom() {
        System.out.println("该房间已经预定");
    }

    @Override
    public void cancleRoom() {
        //空操作
    }

    @Override
    public void checkInRoom() {
        System.out.println("入住成功");
    }

    @Override
    public void checkOutRoom() {
        System.out.println("退房成功");
        room.setState(room.getFreeTimeState());
    }
}
