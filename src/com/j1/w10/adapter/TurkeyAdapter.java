package com.j1.w10.adapter;

public class TurkeyAdapter implements Duck{//turkey�� �ƴ�, �����ڸ� ������ �̸��� ��ġ��Ŵ
  Turkey turkey;
  public TurkeyAdapter(Turkey turkey){
    this.turkey = turkey;
  }
  public void quack(){
    turkey.gobble();//gobble�� turkey�� -> turkey.gobble()
  }
  public void fly(){}
}