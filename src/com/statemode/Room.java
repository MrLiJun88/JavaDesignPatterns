package com.statemode;

import com.statemode.state.CheckInState;
import com.statemode.state.BookState;
import com.statemode.state.FreeTimeState;
import com.statemode.state.State;

public class Room {
    private State state;
    /**定义房间的三种状态
     * 空间
     * 入住
     * 预定
     * */
    private State freeTimeState;
    private State checkInState;
    private State bookState;
    /**构造器*/
    public Room(){
        freeTimeState = new FreeTimeState(this);
        checkInState = new CheckInState(this);
        bookState = new BookState(this);
        /**初始状态为空闲状态*/
        state = freeTimeState;
    }
    /**预定*/
    public void bookRoom(){
        state.bookRoom();
    }
    /**取消预定*/
    public void cancleRoom(){
        state.cancleRoom();
    }
    /**入住*/
    public void checkInState(){
        state.checkInRoom();
    }
    /**退房*/
    public void checkOutState(){
        state.checkOutRoom();
    }

    @Override
    public String toString() {
        return "该房间的状态是：" + this.state.getClass().getName();
    }
    /**getter/setter方法*/
    public void setState(State state){
        this.state = state;
    }
    public State getState(){
        return this.state;
    }

    public State getCheckInState() {
        return checkInState;
    }

    public void setCheckInState(State checkInState) {
        this.checkInState = checkInState;
    }

    public State getFreeTimeState() {
        return freeTimeState;
    }

    public void setFreeTimeState(State freeTimeState) {
        this.freeTimeState = freeTimeState;
    }

    public State getBookState() {
        return bookState;
    }

    public void setBookState(State bookState) {
        this.bookState = bookState;
    }
}
