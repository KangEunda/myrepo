package com.j1.w11;

public class HomeTheaterTestDrive{
  public static void main(String[] args){
    Amplifier amp = new Amplifier();
    Tuner tuner = new Tuner(amp);
    DvdPlayer dvd = new DvdPlayer(amp);
    Projector projector = new Projector(dvd);
    
    HTFacade ht = new HTFacade(amp,tuner,dvd,projector);
    ht.watchMovie("My movie watching...");
    ht.endMovie();
  }
}
