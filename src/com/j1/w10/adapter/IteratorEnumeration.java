package com.j1.w10.adapter;

import java.util.*;

public class IteratorEnumeration implements Enumeration {
  Iterator iterator;
  public IteratorEnumeration(Iterator iterator){
    this.iterator = iterator;
  }
  public boolean hasMoreElements(){
    return iterator.hasNext();
  }
  public Object nextElement(){
    return iterator.next();
  }
}