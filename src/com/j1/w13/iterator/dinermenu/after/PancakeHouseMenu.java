package com.j1.w13.iterator.dinermenu.after;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu{
    ArrayList menuItems;
  
    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("¿À¸®Áö³¯ ÆÒÄÉÀÌÅ©",
                "¸ŞÀÌÇÃ½Ã·´°ú ÆÒÄÉÀÌÅ©", true, 1.99);
        addItem("¸Á°í ÆÒÄÉÀÌÅ©",
                "¸Á°í¿Í ÆÒÄÉÀÌÅ©", true, 2.99);
        addItem("µş±â ÆÒÄÉÀÌÅ©",
                "µş±â¿Í ÆÒÄÉÀÌÅ©", true, 2.29);
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