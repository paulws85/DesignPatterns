package excersises.abstractFactoryVerhicle;

public class FourTireVerhicleFactory extends AbstractFactory {

    Verhicle getVerhicle(VerhicleType verhicleType) {

        Verhicle verhicle;

        switch(verhicleType) {
            case Car:
                verhicle = new Car();
                break;
            case Quad:
                verhicle = new Quad();
                break;
            default:
                verhicle = null;
        }

        return verhicle;
    }
}
