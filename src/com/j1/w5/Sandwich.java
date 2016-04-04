package com.j1.w5;

public class Sandwich {
  public static void main(String[] args) {
    Food b = new Bread();
    
    Food b1 = new Cabbage(b);
    Food b2 = new Ham(b1);
    Food b3 = new Egg(b2);
    Food b4 = new Cheese(b3);
    Food b5 = new Ketchup(b4);
    
    System.out.println(b5.getDescription());
    System.out.println(b5.cost());
  }
}

abstract class Food {
  String description = "Unknown food";
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
    food = f;
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
    food = f;
  }
  public String getDescription() {
    return food.getDescription() + ".Ham";
  }
  public double cost() {
    return food.cost() + 800;
  }
}

class Egg extends CondimentDecorator {
  Food food;
  public Egg(Food f) {
    food = f;
  }
  public String getDescription() {
    return food.getDescription() + ".Egg";
  }
  public double cost() {
    return food.cost() + 900;
  }
}

class Cheese extends CondimentDecorator {
  Food food;
  public Cheese(Food f) {
    food = f;
  }
  public String getDescription() {
    return food.getDescription() + ".Cheese";
  }
  public double cost() {
    return food.cost() + 600;
  }
}

class Ketchup extends CondimentDecorator {
  Food food;
  public Ketchup(Food f) {
    food = f;
  }
  public String getDescription() {
    return food.getDescription() + ".Ketchup";
  }
  public double cost() {
    return food.cost() + 200;
  }
}
  