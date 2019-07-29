package com.commandmode.command;

import com.commandmode.Light;

public class CloseLightCommand implements Command {
    /**具体的命令里面聚合了真正的命令执行者*/
    Light light;
    public CloseLightCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        System.out.println("电灯关闭命令");
        light.close();
    }

    @Override
    public void cancle() {
        System.out.println("撤销上次命令");
        light.open();
    }
}
