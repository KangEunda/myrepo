package com.j1.w9;

public class GarageDoorOpenCommand implements Command{
  private GarageDoor garaged;
  public GarageDoorOpenCommand(GarageDoor gd){
    garaged = gd;
  }
  public void execute(){
    garaged.up();
  }
}