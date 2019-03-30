package com.salesTax;

public class Main {
  public static void main(String[] args) throws InvalidItemException {
    ItemBasket basket = new ItemBasket();
    Item book = LocalItem.createItem(10D);
    Item perfume = ImportedItem.createItem(100D);
    Item CD = ImportedItem.createItem(50D);
    basket.addItem(book);
    basket.addItem(perfume);
    basket.addItem(CD);
    System.out.println(basket.calculateTotalCost());
    System.out.println(basket.calculateTotalSalesTax());
  }
}
