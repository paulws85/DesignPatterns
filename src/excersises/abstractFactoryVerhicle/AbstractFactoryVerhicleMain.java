package excersises.abstractFactoryVerhicle;

public class AbstractFactoryVerhicleMain {

    public static void main(String[] args) {
        AbstractFactory factory = FactoryProvider.getFactory(FactoryType.FourTireFactory);

        Verhicle verhicle = factory.getVerhicle(VerhicleType.Quad);

        if(verhicle != null) {
            verhicle.drive();
        }

    }
}
