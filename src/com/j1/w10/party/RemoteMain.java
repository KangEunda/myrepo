package com.j1.w10.party;

public class RemoteMain {
  public static void main(String[] args){
    RemoteControlWithUndo remote = new RemoteControlWithUndo();
    
    Light light = new Light();
    LightOnCommand lightOn = new LightOnCommand(light);
    LightOffCommand lightOff = new LightOffCommand(light);
    
    GarageDoor garagedoor = new GarageDoor();
    GarageDoorOpenCommand garageUp = new GarageDoorOpenCommand(garagedoor);
    GarageDoorCloseCommand garageDown = new GarageDoorCloseCommand(garagedoor);
    
    DVD dvd = new DVD();
    DVDPlayCommand dvdPlay = new DVDPlayCommand(dvd);
    DVDStopCommand dvdStop = new DVDStopCommand(dvd);
    
    Command[] partyOn = {lightOn, garageUp, dvdPlay};
    Command[] partyOff = {lightOff, garageDown, dvdStop};
    
    MacroCommand partyOnMacro = new MacroCommand(partyOn);
    MacroCommand partyOffMacro = new MacroCommand(partyOff);
    
    remote.setCommands(0,partyOnMacro, partyOffMacro);
    
    remote.onButtonWasPushed(0);
    remote.offButtonWasPushed(0);
    System.out.println(remote);
    remote.undoButtonWasPushed();
    remote.offButtonWasPushed(0);
    remote.onButtonWasPushed(0);
    System.out.println(remote);
    remote.undoButtonWasPushed();
    
  }
}