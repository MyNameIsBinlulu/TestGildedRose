package baiTap;

public abstract class UpdateCalculatorTemplate implements UpdateCalculator {
    protected final int currentSellIn;
    protected final int currentQuality;
    private static final int MaximumAllowedQuality = 50;
    private static final int MinimumAllowedQuality = 0;

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
        return updatedQuality >= MaximumAllowedQuality ? MaximumAllowedQuality :
                Math.max(updatedQuality, MinimumAllowedQuality);
    }

    protected abstract int GetQualityIncrementalUnit();
}