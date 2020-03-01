package excersises.abstractFactoryVerhicle;

public class TwoTireVerhicleFactory extends AbstractFactory {

    Verhicle getVerhicle(VerhicleType verhicleType) {

        Verhicle verhicle;
        switch(verhicleType) {
            case Motor:
                verhicle = new Car();
                break;
            default:
                verhicle = null;
        }

        return verhicle;
    }
}
