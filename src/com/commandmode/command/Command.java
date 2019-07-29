package com.commandmode.command;

/**
 * 命令的接口,定义命令的执行和取消
 */
public interface Command {
    void execute();
    void cancle();
}
