package com.j1.w13;

import java.util.*;

public class Waitress {//�޴��ǳ��ִ� ����
  PancakeHouseMenuMenu phm;
  DinerMenu dm;
  public Waitress(PancakeHouseMenuMenu p, DinerMenu d){
    this.phm = p;
    this.dm = d;
  }
  public void printMenu(){
    Iterator pi = phm.createIterator();
    printMenu(pi);
    Iterator di = dm.createIterator();
    printMenu(di);
  }
  public void printMenu(Iterator iterator){
    while(iterator.hasNext()){
      MenuItem menuItem = (MenuItem)iterator.next();
      System.out.println(menuItem.getName());
    }
  }
}