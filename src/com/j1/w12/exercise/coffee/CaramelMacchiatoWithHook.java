package com.j1.w12.exercise.coffee;

import java.io.*;

public class CaramelMacchiatoWithHook extends CaffeineBeverageWithHook{
  public void brew(){
    System.out.println("Dripping Coffee through filter");
  }
  public void addCondiments(){
    System.out.println("Adding caramel and vanilla syrup");
  }
  public boolean customerWantsCondiments(){
    String answer = getUserInput();
    
    if(answer.toLowerCase().startsWith("y")) {
      return true;
    } else{
      return false;
    }
  }
  private String getUserInput(){
    String answer = null;
    System.out.println("Would you like caramel and vanilla syrup with your coffee (y/n)?");
    
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    try{
      answer = in.readLine();
    } catch (IOException ioe) {
      System.out.println("IO error trying to read your answer");
    }
    if(answer == null){
      return "no";
    }
    return answer;
}
}