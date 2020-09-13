package com.xlc.command;

//命令角色
public interface Command {

    public void execute();

    public void undo();

}
