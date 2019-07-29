package com.commandmode.command;

import com.commandmode.Light;

public class OpenLightCommand implements Command {
    /**具体的命令里面聚合了真正的命令执行者*/
    Light light;
    public OpenLightCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        System.out.println("电灯打开命令");
        light.open();
    }

    @Override
    public void cancle() {
        System.out.println("撤销上次命令");
        light.close();
    }
}
