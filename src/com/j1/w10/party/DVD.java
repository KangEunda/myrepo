package com.j1.w10.party;

public class DVD {
  int status;
  public void check(int status) {
    this.status=status;
    if(status == 0) {
      stop();
    } else {
      System.out.println("DVD is playing " + status);
    }
  }
  public DVD(){}
  public void play(){
    System.out.println("Dvd is playing");
  }
  public void stop(){
    System.out.println("Dvd is stopped");
  }
}