package com.apperancemode.player;

public class MP3Player {
    private MP3Player(){}
    public static MP3Player mp3Player = new MP3Player();
    public static MP3Player getInstance(){
        return mp3Player;
    }
    public void openMP3(){
        System.out.println("MP3开机");
    }
    public void runMusic(){
        System.out.println("MP3正在播放音乐");
    }
    public void downMusic(){
        System.out.println("MP3正在下载音乐");
    }
    public void cloesMP3(){
        System.out.println("MP3关机");
    }
}
