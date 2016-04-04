package com.j1.w5;

public class Sandwich {
  public static void main(String[] args) {
  }
}

abstract class Food {
  String description = "Unknown beverage";
  public String getDescription() {
    return description;
  }
  public abstract double cost();
}

class Bread extends Food {
  public Bread() {
    description = "Bread";
  }
  public double cost() {
    return 1500;
  }
}

abstract class CondimentDecorator extends Food{
  public abstract String getDescription();
}

class Cabbage extends CondimentDecorator{
  Food food;
  public Cabbage(Food f) {
    Food = f;
  }
  public String getDescription() {
    return food.getDescription() + ".Cabbage";
  }
  public double cost() {
    return food.cost() + 500;
  }
}

class Ham extends CondimentDecorator {
  Food food;
  public Ham(Food f) {
    Food = f;
  }
  public String getDescription() {
    return food.getDescription() + ".Ham";
  }
  public double cost() {
    return food.cost() + 800;
  }
}

class Cheese extends CondimentDecorator {
  Food food;
  public Cheese(Food f) {
    Food = f;
  }
  public String getDescription() {
    return food.getDescription() + ".Cheese";
  }
  public double cost() {
    return food.cost() + 600;
  }
}
  