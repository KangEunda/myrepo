package com.j1.w11.template;

import java.io.*;

public class TeaWithHook extends CaffeineBeverageWithHook{
  public void brew(){
    System.out.println("brewing");
  }
  public void addCondiments(){
    System.out.println("adding condiments");
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
    System.out.println("Would you like lemon with your tea (y/n)?");
    
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