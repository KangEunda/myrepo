package com.j1.w10;

public class RemoteLoader {
  public static void main(String[] args){
    RemoteControlWithUndo Rcwu = new RemoteControlWithUndo();
    Light light = new Light();
    LightOnCommand lightOn = new LightOnCommand(light);
    LightOffCommand offCommand = new LightOffCommand(light);
    
    Rcwu.setCommands(0,lightOn,offCommand);
    
    Rcwu.onButtonWasPushed(0);
    Rcwu.offButtonWasPushed(0);
    System.out.println(Rcwu);
    Rcwu.undoButtonWasPushed();
    Rcwu.offButtonWasPushed(0);
    Rcwu.onButtonWasPushed(0);
    System.out.println(Rcwu);
    Rcwu.undoButtonWasPushed();
  }
}