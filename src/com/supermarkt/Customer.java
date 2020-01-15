package com.supermarkt;

public class Customer{

    public ShoppingCart winkelwagen;
    public Basket mandje;

    public String name;

 public Customer(String name) {
    this.name = name;
    this.mandje = new Basket();

    }
}
