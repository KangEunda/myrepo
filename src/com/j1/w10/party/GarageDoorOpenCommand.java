package com.j1.w10.party;

public class GarageDoorOpenCommand implements Command{
  private GarageDoor garagedoor;
  public GarageDoorOpenCommand(GarageDoor gd){
    garagedoor = gd;
  }
  public void execute(){
    garagedoor.up();
  }
  int openStatus;
  public void undo() {
    garagedoor.check(openStatus);
  }
}