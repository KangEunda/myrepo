package com.j1.w13;

import java.util.*;

public class MenuTestDrive {
    public static void main(String args[]) {
        PancakeHouseMenuMenu pancakeHouseMenu = new PancakeHouseMenuMenu();
        DinerMenu dinerMenu = new DinerMenu();
 
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        waitress.printMenu();
    }
}
