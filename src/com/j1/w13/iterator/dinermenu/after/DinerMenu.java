package com.j1.w13.iterator.dinermenu.after;

import java.util.*;

public class DinerMenu implements Menu{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;
  
    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("�丶�� ���İ�Ƽ",
                "���� ���� �丶�� �ҽ��� ���� ���İ�Ƽ ", true, 2.99);
        addItem("�ѿ� ������ũ",
                "A++ �ѿ츦 ����� ������ũ", false, 5.99);
        addItem("ġŲ ������",
                "������ ������ ���� ġŲ�����Ƹ� ���� ������", false, 3.29);
        addItem("���� ������",
                "������ ���� ������ �ְ� ������Ż �ҽ��� �Ѹ� ������", true, 1.29);
        addItem("�������� ����",
                "�ܿ� ���Դ� �������� ����", true, 2.99);
        addItem("ũ������",
                "ũ������", true, 3.29);
    }
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }
    public MenuItem[] getMenuItems() {
        return menuItems;
    }
    public Iterator createIterator(){
      return new DinerMenuIterator(menuItems);
    }
}