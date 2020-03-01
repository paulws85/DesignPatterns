package excersises.abstractFactory;

/**
 * Concrete Product
 */
public class Line implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Line Drawn.");
    }

    @Override
    public void areaCalculate() {
        System.out.println("Area of line is calculated");
    }

    @Override
    public void figurePerimeterCalculate() {
        System.out.println("Figure perimeter of line is calculated");
    }

}
