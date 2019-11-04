package de.storecast.gildedrose;

public class Legendary extends ItemCategory {
    private static final int SULFURAS_QUALITY = 80;

    protected void updateExpired(Item item) {
    }

    protected void updateSellIn(Item item) {
    }

    protected void updateQuality(Item item) {
        if (item.quality != SULFURAS_QUALITY) throw new IllegalArgumentException("Sulfuras quality should be 80!");
    }
}
