package com.apperancemode.player;

public class MonitorPlayer {
    private static MonitorPlayer monitorPlayer = new MonitorPlayer();
    private MonitorPlayer(){}
    public static MonitorPlayer getInstance(){
        return monitorPlayer;
    }
    public void openMonitor(){
        System.out.println("显示器开机");
    }
    public void runMonitor(){
        System.out.println("显示器正在运行");
    }
    public void cloesMonitor(){
        System.out.println("显示器关机");
    }
}
