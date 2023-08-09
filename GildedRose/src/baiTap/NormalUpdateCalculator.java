package baiTap;

class NormalUpdateCalculator extends UpdateCalculatorTemplate {

    protected NormalUpdateCalculator(int currentSellIn, int currentQuality) {
        super(currentSellIn, currentQuality);
    }

    @Override
    protected int GetQualityIncrementalUnit() {
        return currentSellIn <= 0 ? -2 : -1;
    }
}
