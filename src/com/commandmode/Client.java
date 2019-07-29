package com.commandmode;

import com.commandmode.command.CloseLightCommand;
import com.commandmode.command.Command;
import com.commandmode.command.OpenLightCommand;

/**
 * 命令模式
 * 通过遥控器实现对电灯的操作
 */
public class Client {
    public static void main(String[] args) {
        /**命令的具体执行者，电灯*/
        Light light = new Light();
        /**电灯的打开命令*/
        Command openCommand = new OpenLightCommand(light);
        /**电灯的关闭命令*/
        Command closeCommand = new CloseLightCommand(light);
        /**创建遥控器*/
        RemoteControl control = new RemoteControl();
        /**为遥控器上编号为0的地方设置灯的开与关*/
        control.setCommand(0,openCommand,closeCommand);
        control.openButtonWasPushed(0);
        System.out.println("----------");
        control.closeButtonWasPushed(0);
        System.out.println("----------");
        control.cancleButtonWasPushed();
    }
}
