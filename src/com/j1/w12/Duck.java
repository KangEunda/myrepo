package com.j1.w12;

public class Duck implements Comparable{
  String name;
  int weight;
  public Duck (String name, int weight){
    // ���� ���� �ʿ� ���µ� ���ִ� ���� -> sort�Ҷ� �긦 ����
    this.name = name;
    this.weight = weight;
  }
  public String toString(){
    return name + "weights" + weight;
  }
  public int compareTo(Object object){
    int result= 0;
    Duck otherDuck = (Duck)object;
    if (this.weight<otherDuck.weight){
      result = -1;
    }else if(this.weight == otherDuck.weight){
      result = 0;
    } else{
      result = 1;
    }
    return result;
  }
}