package com.j1.w5;

public class CaramelCoffee{
  public static void main(String[] args){
    Beverage e = new Espresso();
    
    Beverage me = new Milk(e);
    Beverage cme = new Caramel(me);
    Beverage wcme = new Whip(cme);
    Beverage vwcme = new Vanilla(wcme);
    
    System.out.println(vwcme.getDescription());
    System.out.println(vwcme.cost());
  }
}

abstract class Beverage {
  String description = "Unknown beverage";
  public String getDescription() {
    return description;
  }
  public abstract double cost();
}


class Espresso extends Beverage {
  public Espresso(){
    description = "Espresso";
  }
  public double cost() {
    return 1.99;
  }
}


abstract class CondimentDecorator extends Beverage{
  public abstract String getDescription();
}

class Milk extends CondimentDecorator{
  Beverage beverage;
  public Milk(Beverage b) {
    beverage = b;
  }
  public String getDescription() {
    return beverage.getDescription() + ".Milk";
  }
  public double cost() {
    return beverage.cost() + .70;
  }
}


class Caramel extends CondimentDecorator {
  Beverage beverage;
  public Caramel(Beverage b){
    beverage = b;
  }
  public String getDescription() {
    return beverage.getDescription() + ".Caramel";
  }
  public double cost() {
    return beverage.cost() + .20;
  }
}

class Whip extends CondimentDecorator {
  Beverage beverage;
  public Whip(Beverage b) {
    beverage = b;
  }
  public String getDescription() {
    return beverage.getDescription() + ".Whip";
  }
  public double cost() {
    return beverage.cost() + .10;
  }
}

class Vanilla extends CondimentDecorator {
  Beverage beverage;
  public Vanilla(Beverage b) {
    beverage = b;
  }
  public String getDescription() {
    return beverage.getDescription() + ".Vanilla";
  }
  public double cost() {
    return beverage.cost() + .05;
  }
}

