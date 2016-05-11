package com.j1.w11;

public class Tuner{
  Amplifier amp;
  Double frequency;
  
  public Tuner(Amplifier amp){
    this.amp = amp;
  }
  public void on(){
    System.out.println("Tuner on.");
  }
  public void off(){
    System.out.println("Tuner off.");
  }
  public void setFrequency(double frequency){
    this.frequency = frequency;
    System.out.println("Tuner setting frequency to" + frequency);
  }
}