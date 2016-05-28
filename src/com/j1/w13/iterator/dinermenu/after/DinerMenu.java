package com.j1.w13.iterator.dinermenu.after;

import java.util.*;

public class DinerMenu implements Menu{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;
  
    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("토마토 스파게티",
                "직접 만든 토마토 소스로 만든 스파게티 ", true, 2.99);
        addItem("한우 스테이크",
                "A++ 한우를 사용한 스테이크", false, 5.99);
        addItem("치킨 리조또",
                "국내산 닭으로 만든 치킨도리아를 넣은 리조또", false, 3.29);
        addItem("버섯 샐러드",
                "국내산 각종 버섯을 넣고 오리엔탈 소스를 뿌린 샐러드", true, 1.29);
        addItem("고르곤졸라 피자",
                "꿀에 찍어먹는 고르곤졸라 피자", true, 2.99);
        addItem("크림스프",
                "크림스프", true, 3.29);
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