package com.j1.w12.exercise.coffee;

public abstract class CaffeineBeverageWithHook{
  public final void prepareRecipe(){
    steamMilk();
    brew();
    pourInCup();
    if(customerWantsCondiments()) {
      addCondiments();
    }
  }
  public abstract void brew();
  public abstract void addCondiments();
  public void steamMilk(){
    System.out.println("Steaming coffee......");
  }
  public void pourInCup(){
    System.out.println("Pouring into cup...");
  }
  public boolean customerWantsCondiments(){
    return true;
  }
}