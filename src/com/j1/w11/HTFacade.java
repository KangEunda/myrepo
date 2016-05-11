package com.j1.w11;

public class HTFacade{
  private Amplifier amp;//실무에선 public 으로
  private Tuner tuner;
  private DvdPlayer dvd;
  private Projector projector;
  
  public HTFacade(Amplifier amp, Tuner tuenr, DvdPlayer dvd,Projector projector){
    this.amp = amp;
    this.tuner = tuner;
    this.dvd = dvd;
    this.projector = projector;
  }
  public void watchMovie(String movie){//Client에서 해야되는거 대신해주고있음
    System.out.println("Get ready to watch a movie...");
    projector.on();
    projector.wideScreenMode();
    amp.on();
    amp.setDvd(dvd);
    amp.setVolume(5);
    dvd.on();
    dvd.play(movie);
  }
  public void endMovie(){
    System.out.println("Shutting movie theater down...");
    projector.off();
    amp.off();
    dvd.stop();
    dvd.eject();
    dvd.off();
  }
  public void listenToRadio(double frequency){
    System.out.println("Tuning in the airwaves...");
    tuner.on();
    tuner.setFrequency(frequency);
    amp.on();
    amp.setVolume(5);
    amp.setTuner(tuner);
  }
  public void endRadio(){
    System.out.println("Shutting down the tuner...");
    tuner.off();
    amp.off();
  }
}