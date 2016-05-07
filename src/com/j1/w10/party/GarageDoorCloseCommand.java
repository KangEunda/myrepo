package com.j1.w10.party;

public class GarageDoorCloseCommand implements Command{
  private GarageDoor garagedoor;
  public GarageDoorCloseCommand(GarageDoor gd){
    garagedoor = gd;
  }
  public void execute(){
    garagedoor.down();
  }
  int openStatus;
  public void undo() {
    garagedoor.check(openStatus);
  }
}