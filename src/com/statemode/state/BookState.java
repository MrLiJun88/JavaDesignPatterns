package com.statemode.state;

import com.statemode.Room;

public class BookState implements State{
    Room room;
    public BookState(Room room){
        this.room = room;
    }
    @Override
    public void bookRoom() {
        System.out.println("该房间已经预定");
    }

    @Override
    public void cancleRoom() {
        System.out.println("退订成功");
        room.setState(room.getFreeTimeState());
    }

    @Override
    public void checkInRoom() {
        System.out.println("入住成功");
        room.setState(room.getCheckInState());
    }

    @Override
    public void checkOutRoom() {

    }
}
