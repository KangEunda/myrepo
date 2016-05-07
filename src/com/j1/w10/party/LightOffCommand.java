package com.j1.w10.party;

public class LightOffCommand implements Command{
  private Light light;
  public LightOffCommand(Light light){
    this.light = light;
  }
  public void execute(){
    light.off();
  }
  int level;
  public void undo() {
    light.dim(level);
  }
}