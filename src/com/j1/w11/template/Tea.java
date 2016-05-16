package com.j1.w11.template;

public class Tea{
  void prepareRecipe(){
    boilWater();
    steepTeaBag();
    pourInCup();
    addLemon();
  }
  public void boilWater(){
    System.out.println("Boiling Water");
  }
  public void steepTeaBag(){
    System.out.println("Steeping teabag");
  }
  public void pourInCup(){
    System.out.println("Pouring in cup");
  }
  public void addLemon(){
    System.out.println("Adding Lemon");
  }
}