package com.j1.w12.exercise.coffee;

public class BeverageHookTestDrive{
  public static void main(String[] args){
    CaramelMacchiatoWithHook caramelHook = new CaramelMacchiatoWithHook();
    
    System.out.println("Making CaramelMacchiato...");
    caramelHook.prepareRecipe();
  }
}