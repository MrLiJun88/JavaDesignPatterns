package com.statemode.state;

public interface State {
    /**预定房间*/
    void bookRoom();
    /**取消预定*/
    void cancleRoom();
    /**入住*/
    void checkInRoom();
    /**退房*/
    void checkOutRoom();
}
