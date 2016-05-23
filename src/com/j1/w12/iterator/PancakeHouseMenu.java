package com.j1.w12.iterator;

import java.util.ArrayList;

public class PancakeHouseMenu{
  //final int MAX_ITEMS =3;
  //int numberOfItems = 0;
  //MenuItem[] menuItems;
  ArrayList menuItems;
  public PancakeHouseMenu(){
    //menuItems = new MenuItems(MAX_ITEMS);
    menuItems = new ArrayList();
    addItem("BLT","...",true, 2.9);
    addItem("BLT","...",true, 2.9);
    addItem("BLT","...",true, 2.9);
  }
  
  public void addItem(String name, String description, boolean v, double p){
    MenuItem menuItem = new MenuItem(name, description, v, p);
    //if(numberOfItems>=MAX_ITEMS){
    //  System.out.println("Error");
    //} else {
    //  menuItems[numberOfItems] = menuItem;
    //  numberOfItems = numberOfItems+1;
    //}
    menuItems.add(menuItem);
  }
}
      