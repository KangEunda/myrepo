package com.j1.w6;

public class PizzaTestDrive {
  public static void main(String[] args) {
    SimplePizzaFactory factory = new SimplePizzaFactory();
    PizzaStore store = new PizzaStore(factory);
    Pizza pizza = store.orderPizza("cheese");
    
    pizza = store.orderPizza("veggie");
  }
}