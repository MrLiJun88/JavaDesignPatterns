package com.statemode;

/**
 * 状态模式
 */
public class Client {
    public static void main(String[] args) {
        /**定义4个房间*/
        Room[] rooms = new Room[4];
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room();
        }
        /**预定*/
        rooms[0].bookRoom();
        /**入住*/
        rooms[0].checkInState();
        /**预定*/
        rooms[0].bookRoom();
        /**退房*/
        rooms[0].checkOutState();
        /**预定*/
        rooms[0].bookRoom();
        /**取消预定*/
        rooms[0].cancleRoom();
        System.out.println(rooms[0]);
    }
}
