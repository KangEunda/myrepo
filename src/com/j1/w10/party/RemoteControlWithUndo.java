package com.j1.w10.party;
//binding
import java.util.*;

public class RemoteControlWithUndo {
  Command[] onCommands;  
  Command[] offCommands; //many buttons
  Command undoCommand;//trick
  
  public RemoteControlWithUndo() {
    onCommands = new Command[7];
    offCommands = new Command[7];
    Command noCommand = new NoCommand();
    for (int i = 0; i<7; i++){
      onCommands[i]=noCommand;//before Null;
      offCommands[i]=noCommand;
    }
    undoCommand = noCommand;
  }
  public void setCommands(int slot, Command onCommand, Command offCommand){
    onCommands[slot] = onCommand;
    offCommands[slot] = offCommand;
  }
  public void onButtonWasPushed(int slot){
    onCommands[slot].execute();
    undoCommand = onCommands[slot];
  }
  public void offButtonWasPushed(int slot){
    offCommands[slot].execute();
    undoCommand = offCommands[slot];
  }
  public void undoButtonWasPushed() {
    undoCommand.undo();
  }
}