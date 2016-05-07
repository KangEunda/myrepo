package com.j1.w10.party;

public class DVDPlayCommand implements Command{
  private DVD dvd;
  public DVDPlayCommand(DVD dvd){
    this.dvd = dvd;
  }
  public void execute(){
    dvd.play();
  }
  int status;
  public void undo() {
    dvd.check(status);
  }
}