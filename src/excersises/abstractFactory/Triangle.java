package excersises.abstractFactory;

public class Triangle implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Triangle is drawn.");
    }

    @Override
    public void areaCalculate() {
        System.out.println("Area of triangle is calculated");
    }

    @Override
    public void figurePerimeterCalculate() {
        System.out.println("Figure perimeter of triangle is calculated");
    }
}
