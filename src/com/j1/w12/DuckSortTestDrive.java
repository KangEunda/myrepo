package com.j1.w12;

import java.util.ArrayList;
import java.util.Arrays;

public class DuckSortTestDrive{
  public static void main(String[] args){
    Duck[] ducks = {new Duck("Donald",10), new Duck("Mallard",8), new Duck("Turkey",5)};
    System.out.println("Before sorting");
    Arrays.sort(ducks);
    play(ducks);
    
    Duck[] myDucks = {new Duck("Sang",5),new Duck("Myung",4),new Duck("Uni",3)};
    Arrays.sort(myDucks);
    play(myDucks);
  }
  public static void play(Duck[] ducks){
    for(int i = 0; i < ducks.length; i++){
      System.out.println(ducks[i]);
    }
}
}