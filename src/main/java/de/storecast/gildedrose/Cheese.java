package de.storecast.gildedrose;

public class Cheese extends ItemCategory {
    protected void updateExpired(Item item) {
        incrementQuality(item);
    }

    protected void updateQuality(Item item) {
        incrementQuality(item);
    }
}

