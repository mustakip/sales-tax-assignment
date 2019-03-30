package com.salesTax;

public class ImportedItem implements Item {
  private double price;
  private double salesTax;

  private ImportedItem(double price) {
    this.price = price;
    this.calculateSalesTax();
  }

  static ImportedItem createItem(double price) throws InvalidItemException {
    if(price <= 0) {
      throw new InvalidItemException();
    }
    return new ImportedItem(price);
  }

  @Override
  public void calculateSalesTax() {
    this.salesTax = (this.price * 15) / 100;
  }

  public double getSalesTax() {
    return this.salesTax;
  }

  @Override
  public double getPrice() {
    return this.price;
  }
}
