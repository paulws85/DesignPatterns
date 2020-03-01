package excersises.abstractFactory;

/**
 * Concrete product
 */
public class Sphere implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Sphere drawn.");
    }

    @Override
    public void areaCalculate() {
        System.out.println("Area of sphere is calculated");
    }

    @Override
    public void figurePerimeterCalculate() {
        System.out.println("Figure perimeter of sphere is calculated");
    }
}
