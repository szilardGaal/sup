package com.sim;

public class Item {
    
    private String manufacturer;
    private String name;
    private int price;
    private double sellPrice;
    private boolean onSale;
    private boolean inStore;

    public Item(String manufacturer, String name, int price) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.price = price;
        this.sellPrice = Math.round(price * 1.2);
    }

    public String getItemName() {
        return this.name;
    }

    public String getFullItemName() {
        return this.name + " " + this.manufacturer;
    }

    public int getStockValue() {
        return this.price;
    }

    public double getSellValue() {
        return this.sellPrice;
    }

    public boolean isOnSale() {
        return this.onSale;
    }

    public boolean getAvaiability() {
        return this.inStore;
    }

    public void itemOnSale(int percent) {
        this.onSale = true;
        this.sellPrice = sellPrice * (percent/100);
    }
}