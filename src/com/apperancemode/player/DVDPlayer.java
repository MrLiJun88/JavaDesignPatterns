package com.apperancemode.player;

public class DVDPlayer {
    /**单例模式*/
    public static com.apperancemode.player.DVDPlayer DVDPlayer = new DVDPlayer();
    private DVDPlayer(){}
    public static com.apperancemode.player.DVDPlayer getInstance(){
        return DVDPlayer;
    }
    public void openDVD(){
        System.out.println("DVD开机");
    }
    public void runDVD(){
        System.out.println("DVD正在播放视频");
    }
    public void cloesDVD(){
        System.out.println("DVD关机");
    }
}
