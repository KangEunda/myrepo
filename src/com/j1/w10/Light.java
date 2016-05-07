package com.j1.w10;

public class Light{
  int level;
  public void dim(int level) {
    this.level=level;
    if(level == 0) {
      off();
    } else {
      System.out.println("Light is dimmed to " + level);
    }
  }
  public int getLevel() {
    return level;
  }
  public void on(){
    System.out.println("Light is on");
  }
  public void off(){
    System.out.println("Light is off");
  }
}

