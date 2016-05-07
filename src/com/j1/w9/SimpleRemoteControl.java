package com.j1.w9;

public class SimpleRemoteControl {//one button
  private Command slot;
  public void setCommand(Command c) {
    slot = c;
  }
  public void buttonPressed(){
    slot.execute();
  }
}