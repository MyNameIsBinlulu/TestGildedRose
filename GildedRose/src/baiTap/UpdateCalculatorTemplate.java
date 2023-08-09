package baiTap;

public abstract class UpdateCalculatorTemplate implements UpdateCalculator {
    private static final int MAXIMUM_ALLOWED_QUALITY = 50;
    private static final int MINIMUM_ALLOWED_QUALITY = 0;
    protected final int currentSellIn;
    protected final int currentQuality;

    protected UpdateCalculatorTemplate(int currentSellIn, int currentQuality) {
        this.currentSellIn = currentSellIn;
        this.currentQuality = currentQuality;
    }

    @Override
    public int GetUpdatedQuality() {
        return GetCorrectUpdatedQuality(currentQuality + GetQualityIncrementalUnit());
    }

    @Override
    public int GetUpdatedSellIn() {
        return currentSellIn - 1;
    }

    private int GetCorrectUpdatedQuality(int updatedQuality) {
        return updatedQuality >= MAXIMUM_ALLOWED_QUALITY ? MAXIMUM_ALLOWED_QUALITY :
                Math.max(updatedQuality, MINIMUM_ALLOWED_QUALITY);
    }

    protected abstract int GetQualityIncrementalUnit();
}