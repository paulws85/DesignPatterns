package excersises.abstractFactory;

public class Trapezoid implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Trapezoid is drawn.");
    }

    @Override
    public void areaCalculate() {
        System.out.println("Area of trapezoid is calculated");
    }

    @Override
    public void figurePerimeterCalculate() {
        System.out.println("Figure perimeter of trapezoid is calculated");
    }
}
