package com.j1.w6;

import java.util.ArrayList;

abstract public class Pizza{
  String name;
  String dough;
  String sauce;
  ArrayList toppings = new ArrayList();
  public void prepare(){
    System.out.println("preparing" + name);
  }
  public void bake(){
    System.out.println("baking" + name);
  }
  public void cut(){
    System.out.println("cutting" + name);
  }
  public void box(){
    System.out.println("boxing" + name);
  }
  public String toString() {
  StringBuffer display = new StringBuffer();
  display.append("---- " + name + " ----\n");
  display.append(dough + "\n");
  display.append(sauce + "\n");
  for (int i = 0; i < toppings.size(); i++) {
   display.append((String )toppings.get(i) + "\n");
  }
  return display.toString();
 }

}