package excersises.strategy;

public class Add implements CalculateStrategy {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
