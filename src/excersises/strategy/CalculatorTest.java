package excersises.strategy;

public class CalculatorTest {
    public static void main(String[] args) {

        String operation = "+";

        CalculateContext calculateContext = new CalculateContext();

        if("+".equals(operation)) {
            calculateContext.setCalculateStrategy(new Add());
        } else if ("*".equals(operation)) {
            calculateContext.setCalculateStrategy(new Multiply());
        }

        System.out.println(calculateContext.calculate(1, 3));

    }
}
