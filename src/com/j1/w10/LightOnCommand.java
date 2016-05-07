package com.j1.w10;

public class LightOnCommand implements Command{
  private Light light;
  public LightOnCommand(Light light){
    this.light = light;
  }
  public void execute(){
    light.on();
  }
  int level;
  public void undo() {
    light.dim(level);
  }
}