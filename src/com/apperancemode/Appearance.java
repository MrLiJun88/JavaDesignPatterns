package com.apperancemode;

import com.apperancemode.player.DVDPlayer;
import com.apperancemode.player.HeadsetPlayer;
import com.apperancemode.player.MP3Player;
import com.apperancemode.player.MonitorPlayer;

/**
 * 外观类
 */
public class Appearance {
    /**定义各子系统的对象*/
    DVDPlayer dvdPlayer;
    HeadsetPlayer headsetPlayer;
    MonitorPlayer monitorPlayer;
    MP3Player mp3Player;
    /**在构造中初始化各个子系统对象*/
    public Appearance(){
        this.dvdPlayer = DVDPlayer.getInstance();
        this.headsetPlayer = HeadsetPlayer.getInstance();
        this.monitorPlayer = MonitorPlayer.getInstance();
        this.mp3Player = MP3Player.getInstance();
    }

    public void ready(){
        this.dvdPlayer.openDVD();
        this.headsetPlayer.openHeadset();
        this.mp3Player.openMP3();
        this.monitorPlayer.openMonitor();
    }

    public void run(){
        this.dvdPlayer.runDVD();
        this.headsetPlayer.runHeadset();
        this.monitorPlayer.runMonitor();
        this.mp3Player.runMusic();
        this.mp3Player.downMusic();
    }
    public void close(){
        this.dvdPlayer.cloesDVD();
        this.headsetPlayer.cloesHeadset();
        this.mp3Player.cloesMP3();
        this.monitorPlayer.cloesMonitor();
    }
    public static void main(String[] args) {
        Appearance appearance = new Appearance();
        appearance.run();
    }
}
