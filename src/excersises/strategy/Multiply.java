package excersises.strategy;

public class Multiply implements CalculateStrategy {
    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}
