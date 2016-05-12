package com.j1.w11.exercise;

public class SHFacade{
  private Book book;
  private Computer com;
  private Note note;
  private Light light;

  public SHFacade(Book book, Computer com, Note note, Light light){
    this.book = book;
    this.com = com;
    this.note = note;
    this.light = light;
  }
  public void beginStudy(){
    System.out.println("Get ready to study....");
    light.on();
    com.on();
    book.open();
    note.open();
  }
  public void endStudy(){
    System.out.println("End study....");
    note.close();
    book.close();
    com.off();
    light.off();
  }
}