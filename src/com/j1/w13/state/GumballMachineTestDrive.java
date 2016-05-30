package com.j1.w13.state;

public class GumballMachineTestDrive{
  public static void main(String[] args){
    GumballMachine gm = new GumballMachine(5);
    gm.insertQuarter();
    gm.turnCrank();
  }
}