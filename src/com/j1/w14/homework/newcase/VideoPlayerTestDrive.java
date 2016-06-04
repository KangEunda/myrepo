package com.j1.w14.homework.newcase;

public class VideoPlayerTestDrive{
  public static void main(String[] args){
    VideoPlayer videoPlayer = new VideoPlayer();
    System.out.println(videoPlayer);
    
    videoPlayer.pushPlay();
    videoPlayer.pushStop();
    videoPlayer.timeOver();
    System.out.println(videoPlayer);
  }
}