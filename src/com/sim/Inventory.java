package com.sim;

public class Inventory {

    private Instrument[] instruments;
    private Amp[] amps;
    private Accessory[] accessories;
    private Item[] items;

    public Inventory() {
        this.instruments = new Instrument[0];
        this.amps = new Amp[0];
        this.accessories = new Accessory[0];
    }

    public Instrument[] getInstruments() {
        return this.instruments;
    }

    public Amp[] getAmps() {
        return this.amps;
    }

    public Accessory[] getAccessories() {
        return this.accessories;
    } 

    public Item[] getItem() {
        return this.items;
    }

    public Item findItemByName(String name) {
        for (Item item : items) {
            if (item.getFullItemName().toLowerCase().contains(name.toLowerCase())) {
                return item;
            }
        }
        return null;
    }

    public Item[] getItemOnSale() {
        Item[] itemsOnSale = new Item[0];
        for (Item item : items) {
            if (item.isOnSale()) {
                itemsOnSale = Utility.addToArray(itemsOnSale, item);
            }
        }
        return itemsOnSale;
    }
}