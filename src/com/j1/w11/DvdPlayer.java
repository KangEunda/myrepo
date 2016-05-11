package com.j1.w11;

public class DvdPlayer{
  Amplifier amp;
  String movie;
  
  public DvdPlayer(Amplifier amp){
    this.amp = amp;
  }
  public void on(){
    System.out.println("DvdPlayer on");
  }
  public void off(){
    System.out.println("DvdPlayer off");
  }
  public void play(String movie){
    this.movie = movie;
    System.out.println("DvdPlayer playing" + movie);
  }
  public void stop(){
    System.out.println("DvdPlayer stopped" + movie);
  }
  public void eject(){
    movie = null;
    System.out.println("DvdPlayer eject");
  }
}