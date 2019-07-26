package com.apperancemode.player;

public class HeadsetPlayer {
    private HeadsetPlayer(){}
    public static HeadsetPlayer headsetPlayer = new HeadsetPlayer();
    public static HeadsetPlayer getInstance(){
        return headsetPlayer;
    }
    public void openHeadset(){
        System.out.println("耳机开机");
    }
    public void runHeadset(){
        System.out.println("耳机正在播放音乐");
    }
    public void cloesHeadset(){
        System.out.println("耳机关机");
    }
}
