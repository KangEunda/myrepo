package com.j1.w11.template;

public class BeverageHookTestDrive{
  public static void main(String[] args){
    TeaWithHook teaHook = new TeaWithHook();
    CoffeeWithHook coffeeHook = new CoffeeWithHook();
    
    System.out.println("Making tea...");
    teaHook.prepareRecipe();
    
    System.out.println("Making Coffee...");
    coffeeHook.prepareRecipe();
  }
}