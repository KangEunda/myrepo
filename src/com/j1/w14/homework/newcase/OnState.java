package com.j1.w14.homework.newcase;

public class OnState implements State{
  VideoPlayer videoPlayer;
  
  public OnState(VideoPlayer videoPlayer){
    this.videoPlayer = videoPlayer;
  }
  public void timeOver(){
    System.out.println("change sleepscreen...");
    videoPlayer.setState(videoPlayer.getSleepState());
  }
  public void sleepScreen(){
    System.out.println("not sleep");
  }
  public void pushStop(){
    System.out.println("You pushed stopbutton");
    videoPlayer.setState(videoPlayer.getStopState());
  }
  public void pushPlay(){
    System.out.println("You pushed playbutton");
    videoPlayer.setState(videoPlayer.getPlayState());
  }
  public void click(){
    System.out.println("clicking -> but already onstate");
  }
  public String toString(){
    return "onstate";
  }
}