package com.j1.w13;

import java.util.ArrayList;

public class PancakeHouseMenuMenu implements Menu{
    ArrayList menuItems;
  
    public PancakeHouseMenuMenu() {
        menuItems = new ArrayList();
        addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29);
    }
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
    public ArrayList getMenuItems() {
        return menuItems;
    }
    public Iterator createIterator(){
      return new PancakeHouseMenuIterator(menuItems);
    }
    public String toString(){
      return "Objective Pancake House Menu";
    }
}