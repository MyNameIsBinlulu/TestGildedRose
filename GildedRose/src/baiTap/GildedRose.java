package baiTap;

class GildedRose {
    public static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public static final String CONJURED_MANA_CAKE = "Conjured Mana Cake";
    public static final String AGED_BRIE = "Aged Brie";
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            UpdateSingleItem(item);
        }
    }

    private void UpdateSingleItem(Item item) {
        var updateCalculator = GetUpdateCalculator(item);
        item.quality = updateCalculator.GetUpdatedQuality();
        item.sellIn = updateCalculator.GetUpdatedSellIn();
    }

    private static UpdateCalculator GetUpdateCalculator(Item item) {
        return switch (item.name) {
            case BACKSTAGE_PASSES -> new BackStageUpdateCalculator(item.sellIn, item.quality);
            case SULFURAS -> new SulfurasUpdateCalculator(item.sellIn);
            case CONJURED_MANA_CAKE -> new ConjuredUpdateCalculator(item.sellIn, item.quality);
            case AGED_BRIE -> new AgedBrieUpdateCalculator(item.sellIn, item.quality);
            default -> new NormalUpdateCalculator(item.sellIn, item.quality);
        };
    }
}