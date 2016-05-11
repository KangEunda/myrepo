package com.j1.w11;

public class Amplifier {
  Tuner tuner;
  DvdPlayer dvd;
  
  public Amplifier(){}
  public void on(){
    System.out.println("Amplifier on.");
  }
  public void off(){
    System.out.println("Amplifier off.");
  }
  public void setDvd(DvdPlayer dvd){
    this.dvd = dvd;
    System.out.println("Amplifier setting DVD player to "+dvd);
  }
  public void setTuner(Tuner tuner){
    this.tuner=tuner;
    System.out.println("Amplifier setting tuner to "+ tuner);
  }
  public void setVolume(int volume){
    System.out.println("Amplifier setting volume to "+volume);
  }
}
    