package baiTap;

class AgedBrieUpdateCalculator extends UpdateCalculatorTemplate {
    protected AgedBrieUpdateCalculator(int currentSellIn, int currentQuality) {
        super(currentSellIn, currentQuality);
    }

    @Override
    protected int GetQualityIncrementalUnit() {
        return -new NormalUpdateCalculator(currentSellIn, currentQuality).GetQualityIncrementalUnit();
    }
}
