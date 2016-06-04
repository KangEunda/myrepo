package com.j1.w14.homework.coinerror;

public class GumballMachineTestDrive{
  public static void main(String[] args){
    GumballMachine gumballMachine = new GumballMachine(5);
    System.out.println(gumballMachine);
    
    gumballMachine.insertQuarter();
    gumballMachine.errorQuarter();
    gumballMachine.turnCrank();
    System.out.println(gumballMachine);

    gumballMachine.insertQuarter();
    gumballMachine.errorQuarter();
    gumballMachine.turnCrank();
    gumballMachine.insertQuarter();
    gumballMachine.errorQuarter();
    gumballMachine.turnCrank();

    System.out.println(gumballMachine);
    
    GumballMachine gumballM = new GumballMachine("china");
    gumballM.insertQuarter();
    gumballM.errorQuarter();
    gumballM.turnCrank();

}
}