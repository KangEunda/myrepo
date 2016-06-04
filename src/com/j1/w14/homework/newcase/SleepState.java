package com.j1.w14.homework.newcase;

public class SleepState implements State {
  VideoPlayer videoPlayer;
  
  public SleepState(VideoPlayer videoPlayer){
    this.videoPlayer = videoPlayer;
  }
  public void timeOver(){
    System.out.println("sleeping.... because of timeover");
  }
  public void sleepScreen(){
    System.out.println("video stoped. because screen is sleeping");
  }
  public void pushStop(){
    System.out.println("already stop...");
  }
  public void pushPlay(){
    System.out.println("playing. because you pushed playbutton");
    videoPlayer.setState(videoPlayer.getPlayState());
  }
  public void click(){
    System.out.println("clicking -> change onstate");
    videoPlayer.setState(videoPlayer.getOnState());
  }
  public String toString(){
    return "sleepstate";
  }
}