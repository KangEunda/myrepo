package com.j1.w14.homework.newcase;

public class StopState implements State{
  VideoPlayer videoPlayer;
  
  public StopState(VideoPlayer videoPlayer){
    this.videoPlayer = videoPlayer;
  }
  public void timeOver(){
    System.out.println("sleepState... because of timeover");
    videoPlayer.setState(videoPlayer.getSleepState());
  }
  public void sleepScreen(){
    System.out.println("not yet sleepscreen....");
  }
  public void pushStop(){
    System.out.println("already stoped");
  }
  public void pushPlay(){
    System.out.println("playing...");
    videoPlayer.setState(videoPlayer.getPlayState());
  }
  public void click(){
    System.out.println("clicking -> change onstate");
    videoPlayer.setState(videoPlayer.getOnState());
  }
  public String toString(){
    return "stopstate";
  }
}