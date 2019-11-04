package de.storecast.gildedrose;

class ItemCategory {
    private static final int MAX_QUALITY = 50;

    void incrementQuality(Item item) {
        if (item.quality < MAX_QUALITY) {
            item.quality++;
        }
    }

    void decrementQuality(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
    }

    void updateExpired(Item item) {
        decrementQuality(item);
    }

    void updateSellIn(Item item) {
        item.sellIn--;
    }

    void updateQuality(Item item) {
        decrementQuality(item);
    }

    void updateOneItem(Item item) {
        updateQuality(item);

        updateSellIn(item);

        if (item.sellIn < 0) {
            updateExpired(item);
        }
    }
}
