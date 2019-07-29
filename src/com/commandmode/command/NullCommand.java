package com.commandmode.command;

/**
 * 定义空操作，对接口的方法不做任何实现
 * 用于初始化每个按钮
 * 当调用空命令时，对象什么事情都不做
 */
public class NullCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void cancle() {

    }
}
