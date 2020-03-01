package excersises.abstractFactory;

/**
 * Concrete product
 */
public class Circle implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Circle is drawn.");
    }

    @Override
    public void areaCalculate() {
        System.out.println("Area of circle is calculated");
    }

    @Override
    public void figurePerimeterCalculate() {
        System.out.println("Figure perimeter of circle is calculated");
    }
}
