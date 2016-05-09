package com.j1.w10.adapter;

import java.util.*;

public class IteratorEnumerationTestDrive{
  public static void main(String args[]){
    ArrayList list = new ArrayList(Arrays.asList(args));
    Enumeration enumeration = new IteratorEnumeration(list.iterator());
    while (enumeration.hasMoreElements()) {
      System.out.println(enumeration.nextElement());
    }
  }
}