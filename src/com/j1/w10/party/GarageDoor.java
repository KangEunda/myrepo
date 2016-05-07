package com.j1.w10.party;

public class GarageDoor{
  public GarageDoor(){}
  int openStatus;
  public void check(int openStatus) {
    this.openStatus=openStatus;
    if(openStatus == 0) {
      down();
    } else {
      System.out.println("GarageOpenStatus is " + openStatus);
    }
  }
  public void up(){
    System.out.println("GarageDoor is open.");
  }
  public void down(){
    System.out.println("GarageDoor is closed.");
  }
}