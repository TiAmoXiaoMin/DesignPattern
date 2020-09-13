package com.xlc.command;

public class Client {
    public static void main(String[] args) {

        //初始化
        RemoteController remoteController = new RemoteController();

        System.out.println("============给灯发命令================");
        //给灯发命令
        LightReceiver lightReceiver = new LightReceiver();
        Command lightOnCommand = new LightOnCommand(lightReceiver);
        Command lightOffCommand = new LightOffCommand(lightReceiver);

        //给数组添加灯的开关
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);
        //打开
        remoteController.onButtonWasPushed(0);
        //关闭
        remoteController.offButtonWasPushed(0);
        //返回上一步
        remoteController.undoButtonWasPushed();


        System.out.println("============给电视发命令================");
        //给电视发命令
        TVReceiver tvReceiver = new TVReceiver();
        Command tVOnCommand = new TVOnCommand(tvReceiver);
        Command tvOffCommand = new TVOffCommand(tvReceiver);

        //给数据添加电视的开和关
        remoteController.setCommand(1,tVOnCommand,tvOffCommand);
        //开电视
        remoteController.onButtonWasPushed(1);
        //关电视
        remoteController.offButtonWasPushed(1);
        //返回上一步
        remoteController.undoButtonWasPushed();
    }
}
