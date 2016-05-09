package com.j1.w10.adapter;

public class DuckTestDrive{
  public static void main(String[] args){
    WildTurkey turkey = new WildTurkey();
    TurkeyAdapter ta = new TurkeyAdapter(turkey);
    //ta.quack(); -> compile 시점하고 runtime 시점이 똑같은거 실행시키는거
    testDuck(ta);//ta 는 duck
  }
  static void testDuck(Duck duck){
    duck.quack();
  }
}