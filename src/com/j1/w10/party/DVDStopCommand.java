package com.j1.w10.party;

public class DVDStopCommand implements Command{
  private DVD dvd;
  public DVDStopCommand(DVD dvd){
    this.dvd = dvd;
  }
  public void execute(){
    dvd.stop();
  }
  int status;
  public void undo() {
    dvd.check(status);
  }
}