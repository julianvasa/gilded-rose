package de.storecast.gildedrose;

class GildedRose {
    private Item[] items;

    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES_TO_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public static final String CONJURED = "Conjured";

    public static final int SULFURAS_QUALITY = 80;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public GildedRose() {}

    public Item[] getItems() {
        return items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemCategory category = categorize(item);
            category.updateOneItem(item);
        }
    }

    private ItemCategory categorize(Item item) {
        if (item.name.equals(SULFURAS)) {
            return new Legendary();
        }
        if (item.name.equals(AGED_BRIE)) {
            return new Cheese();
        }
        if (item.name.equals(BACKSTAGE_PASSES_TO_CONCERT)) {
            return new BackstagePass();
        }
        if (item.name.startsWith(CONJURED))
            return new Conjured();
        return new ItemCategory();
    }

}
