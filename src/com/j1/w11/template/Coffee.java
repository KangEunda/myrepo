package com.j1.w11.template;

public class Coffee{
  void prepareRecipe(){
    boilWater();
    brewCoffeeGrinds();
    pourInCup();
    addSugarAndMilk();
  }
  public void boilWater(){
    System.out.println("Boiling Water");
  }
  public void brewCoffeeGrinds(){
    System.out.println("Brewing CoffeeGrinds");
  }
  public void pourInCup(){
    System.out.println("Pouring in cup");
  }
  public void addSugarAndMilk(){
    System.out.println("Adding sugar and milk");
  }
}