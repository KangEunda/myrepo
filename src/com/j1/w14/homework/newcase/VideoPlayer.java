package com.j1.w14.homework.newcase;

public class VideoPlayer{
  State onState;
  State sleepState;
  State playState;
  State stopState;
  
  State state = onState;
  
  public VideoPlayer(){
    onState = new OnState(this);
    sleepState = new SleepState(this);
    playState = new PlayState(this);
    stopState = new StopState(this);
    
    state = onState;
  }
  public void timeOver(){
    state.timeOver();
  }
  public void sleepScreen(){
    state.sleepScreen();
  }
  public void pushStop(){
    state.pushStop();
  }
  public void pushPlay(){
    state.pushPlay();
  }
  public void click(){
    state.click();
  }
  void setState(State state){
    this.state = state;
  }
  public State getState(){
    return state;
  }
  public State getOnState(){
    return onState;
  }
  public State getSleepState(){
    return sleepState;
  }
  public State getPlayState(){
    return playState;
  }
  public State getStopState(){
    return stopState;
  }
  public String toString() {
    StringBuffer result = new StringBuffer();
    result.append("Display : " + state + "\n");
    result.append("\n ----------------");
    return result.toString();
  }
}