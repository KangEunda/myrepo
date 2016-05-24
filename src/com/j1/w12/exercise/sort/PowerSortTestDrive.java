package com.j1.w12.exercise.sort;

import java.util.ArrayList;
import java.util.Arrays;

public class PowerSortTestDrive{
  public static void main(String[] args){
    Power[] powers = {
      new Power("eunda",3),
      new Power("jiyoung",7),
      new Power("daddy",10),
      new Power("mom",6)
    };
    System.out.println("Before sorting : ");
    display(powers);
    
    Arrays.sort(powers);
    
    System.out.println("After sorting : ");
    display(powers);
  }
  public static void display(Power[] powers) {
  for (int i = 0; i < powers.length; i++) {
   System.out.println(powers[i]);
  }
}
}