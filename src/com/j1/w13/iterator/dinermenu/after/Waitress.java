package com.j1.w13.iterator.dinermenu.after;

public class Waitress {//메뉴건네주는 역할
  PancakeHouseMenu phm;
  DinerMenu dm;
  public Waitress(PancakeHouseMenu p, DinerMenu d){
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