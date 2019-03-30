package com.salesTax;

import java.util.ArrayList;

public class ItemBasket {
  private ArrayList<Item> items;
  private double totalCost;

  public ItemBasket() {
    this.items = new ArrayList<>();
  }

  public void addItem(Item item) {
    this.items.add(item);
  }

  public double calculateTotalSalesTax() {
    return this.items.stream().mapToDouble(Item::getSalesTax).sum();
  }

  public double calculateTotalCost() {
    double totalPrice = this.items.stream().mapToDouble(Item::getPrice).sum();
    return totalPrice + this.calculateTotalSalesTax();
  }
}
