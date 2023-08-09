package baiTap;

class ConjuredUpdateCalculator extends UpdateCalculatorTemplate {

    protected ConjuredUpdateCalculator(int currentSellIn, int currentQuality) {
        super(currentSellIn, currentQuality);
    }

    @Override
    protected int GetQualityIncrementalUnit() {
        return new NormalUpdateCalculator(currentSellIn, currentQuality).GetQualityIncrementalUnit() * 2;
    }
}
