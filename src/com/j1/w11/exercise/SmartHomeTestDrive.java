package com.j1.w11.exercise;

public class SmartHomeTestDrive{
  public static void main(String[] args){
    Book book = new Book();
    Computer com = new Computer();
    Note note = new Note();
    Light light = new Light();
    
    SHFacade sh = new SHFacade(book, com, note, light);
    sh.beginStudy();
    sh.endStudy();
  }
}