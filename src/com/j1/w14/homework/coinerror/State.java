package com.j1.w14.homework.coinerror;

public interface State{
  public void insertQuarter();
  public void ejectQuarter();
  public void errorQuarter();
  public void turnCrank();
  public void dispense();
}