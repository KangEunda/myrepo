package com.j1.w14.homework.coinerror;

public class ErrorState implements State{
  GumballMachine gumballMachine;
  
  public ErrorState(GumballMachine gumballMachine){
    this.gumballMachine = gumballMachine;
  }
  public void insertQuarter(){
    System.out.println("This quarter cannot use...");
  }
  public void ejectQuarter(){
    System.out.println("No quarters...");
  }
  public void errorQuarter(){
    System.out.println("Error Quarter!!!!!");
  }
  public void turnCrank(){
    System.out.println("You turned, but there are no gumballs");
  }
  public void dispense(){
    System.out.println("No gumball dispensed");
  }
  public String toString(){
    return "Error(inapplicable quarters)";
  }
}