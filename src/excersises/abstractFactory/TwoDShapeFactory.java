package excersises.abstractFactory;


/**
 * Concrete factory
 */
public class TwoDShapeFactory extends AbstractFactory {
    @Override
    GeometricShape getShape(ShapeType name) {
        if (ShapeType.LINE == name) {
            return new Line();
        } else if (ShapeType.CIRCLE == name) {
            return new Circle();
        } else if (ShapeType.TRAPEZOID == name) {
            return new Trapezoid();
        } else if (ShapeType.TRIANGLE == name) {
            return new Triangle();
        }
        return null;
    }
}
