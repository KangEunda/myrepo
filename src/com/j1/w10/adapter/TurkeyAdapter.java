package com.j1.w10.adapter;

public class TurkeyAdapter implements Duck{//turkey가 아님, 생성자를 가지고 이름을 일치시킴
  Turkey turkey;
  public TurkeyAdapter(Turkey turkey){
    this.turkey = turkey;
  }
  public void quack(){
    turkey.gobble();//gobble은 turkey꺼 -> turkey.gobble()
  }
  public void fly(){}
}