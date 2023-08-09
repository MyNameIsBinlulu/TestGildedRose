package baiTap;

class SulfurasUpdateCalculator implements UpdateCalculator {

    public static final int LEGENDARY_UNCHANGEABLE_QUALITY = 80;
    private final int currentSellIn;

    SulfurasUpdateCalculator(int currentSellIn) {

        this.currentSellIn = currentSellIn;
    }

    @Override
    public int GetUpdatedQuality() {
        return LEGENDARY_UNCHANGEABLE_QUALITY;
    }

    @Override
    public int GetUpdatedSellIn() {
        return currentSellIn;
    }
}
