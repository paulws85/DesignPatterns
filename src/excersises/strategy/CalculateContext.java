package excersises.strategy;

public class CalculateContext {

    private CalculateStrategy calculateStrategy;

    public CalculateContext() {
        this.calculateStrategy = null;
    }

    public void setCalculateStrategy(CalculateStrategy calculateStrategy) {
        this.calculateStrategy = calculateStrategy;
    }

    public int calculate(int a, int b) {
        return calculateStrategy.calculate(a, b);
    }
}
