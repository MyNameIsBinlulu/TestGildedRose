package baiTap;

class BackStageUpdateCalculator extends UpdateCalculatorTemplate {

    protected BackStageUpdateCalculator(int currentSellIn, int currentQuality) {
        super(currentSellIn, currentQuality);
    }

    @Override
    protected int GetQualityIncrementalUnit() {
        if (currentSellIn > 10)
            return 1;
        if (currentSellIn > 5)
            return 2;
        if (currentSellIn > 0)
            return 3;
        return -currentQuality;
    }
}
