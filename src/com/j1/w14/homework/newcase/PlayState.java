package com.j1.w14.homework.newcase;

public class PlayState implements State{
  VideoPlayer videoPlayer;
  
  public PlayState(VideoPlayer videoPlayer){
    this.videoPlayer = videoPlayer;
  }
  public void timeOver(){
    System.out.println("not timeover.. if video is over, change sleep");
  }
  public void sleepScreen(){
    System.out.println("not sleep");
  }
  public void pushStop(){
    System.out.println("You pushed stopbutton");
    videoPlayer.setState(videoPlayer.getStopState());
  }
  public void pushPlay(){
    System.out.println("already playing...");
  }
  public void click(){
    System.out.println("clicking -> already playstate");
  }
  public String toString(){
    return "playstate";
  }
}