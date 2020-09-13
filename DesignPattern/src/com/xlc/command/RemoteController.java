package com.xlc.command;

//发布命令者
public class RemoteController {

    //开 关按钮数组
    Command[] onCommands;
    Command[] offCommands;

    //执行撤销命令
    Command undoCommand;

    //构造器,完成对按钮的初始化
    public RemoteController(){
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i = 0;i < 5;i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }

    }

    //给我们的按钮设置你需要的命令
    public void setCommand(int index,Command onCommand,Command offCommand){
        onCommands[index] = onCommand;
        offCommands[index] = offCommand;
    }

    //按下开按钮
    public void onButtonWasPushed(int index){
        //找到你按下的按钮,并调用对应的方法
        onCommands[index].execute();
        //记录这次的操作,用于撤销
        undoCommand = onCommands[index];
    }

    //按下关按钮
    public void offButtonWasPushed(int index){
        offCommands[index].execute();
        undoCommand = offCommands[index];
    }


    //按下撤销按钮
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }


}
