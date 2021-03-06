package com.j1.w13.iterator.dinermenu.after;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu{
    ArrayList menuItems;
  
    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("�������� ������ũ",
                "�����ý÷��� ������ũ", true, 1.99);
        addItem("���� ������ũ",
                "������ ������ũ", true, 2.99);
        addItem("���� ������ũ",
                "����� ������ũ", true, 2.29);
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