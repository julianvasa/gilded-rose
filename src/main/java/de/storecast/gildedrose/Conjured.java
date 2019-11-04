package de.storecast.gildedrose;

public class Conjured extends ItemCategory {
    protected void updateExpired(Item item) {
        decrementQuality(item);
        decrementQuality(item);
    }

    protected void updateQuality(Item item) {
        decrementQuality(item);
        decrementQuality(item);
    }
}

