package com.j1.w12.exercise.sort;

public class Power implements Comparable{
  String name;
  int power;
  
  public Power(String name, int power){
    this.name = name;
    this.power = power;
  }
  public String toString(){
    return "Power of " + name + " is " + power;
  }
  
  public int compareTo(Object object){
    Power otherPower = (Power)object;
    if(this.power < otherPower.power){
      return -1;
    } else if( this.power == otherPower.power){
      return 0;
    } else { 
      return 1;
    }
    }
}