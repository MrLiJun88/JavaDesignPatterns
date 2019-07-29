package com.commandmode;

import com.commandmode.command.Command;
import com.commandmode.command.NullCommand;

/**
 * 定义遥控器
 */
public class RemoteControl {
    /**开命令的数组*/
    Command[] openCommands;
    /**关命令的数组*/
    Command[] closeCommands;
    /**撤销命令*/
    Command cancleCommand = new NullCommand();
    /**构造器*/
    public RemoteControl(){
        this.openCommands = new Command[5];
        this.closeCommands = new Command[5];
        for (int i = 0; i < openCommands.length; i++) {
            openCommands[i] = new NullCommand();
            closeCommands[i] = new NullCommand();
        }
    }
    /**给按钮设置你需要的命令*/
    public void setCommand(int no,Command openCommand,Command clseCommand){
        openCommands[no] = openCommand;
        closeCommands[no] = clseCommand;
    }
    /**打开按下的按钮*/
    public void openButtonWasPushed(int no){
        openCommands[no].execute();
        /**记录这次操作，用于撤销*/
        cancleCommand = openCommands[no];
    }
    /**按下关闭的按钮*/
    public void closeButtonWasPushed(int no){
        closeCommands[no].execute();
        /**记录这次操作，用于撤销*/
        cancleCommand = closeCommands[no];
    }
    /**按下撤销按钮*/
    public void cancleButtonWasPushed(){
        cancleCommand.cancle();
    }
}
