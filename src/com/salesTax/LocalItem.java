package com.salesTax;

public class LocalItem implements Item {
  private double price;
  private double salesTax;

  private LocalItem(double price) {
    this.price = price;
    this.calculateSalesTax();
  }

  static LocalItem createItem(double price) throws InvalidItemException {
    if(price <= 0) {
      throw new InvalidItemException();
    }
    return new LocalItem(price);
  }

  @Override
  public void calculateSalesTax() {
    this.salesTax = (this.price * 10) / 100;
  }

  public double getSalesTax() {
    return this.salesTax;
  }

  @Override
  public double getPrice() {
    return price;
  }
}
