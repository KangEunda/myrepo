package com.j1.w10.party;

public class MacroCommand implements Command{
  Command[] commands;
  
  public MacroCommand(Command[] cd){
    commands = cd;
  }
  
  public void execute(){
    for(int i = 0; i<commands.length; i++){
      commands[i].execute();
    }
  }
  public void undo(){
    for(int i=0; i<commands.length; i++){
      commands[i].undo();
    }
  }
}