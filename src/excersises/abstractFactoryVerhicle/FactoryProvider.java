package excersises.abstractFactoryVerhicle;

public class FactoryProvider {

    public static AbstractFactory getFactory(FactoryType factoryType) {
        AbstractFactory factory;

        switch(factoryType) {
            case TwoTireFactory:
                factory = new TwoTireVerhicleFactory();
                break;
            case FourTireFactory:
                factory = new FourTireVerhicleFactory();
                break;
            default:
                factory = null;
        }
        return factory;
    }



}
