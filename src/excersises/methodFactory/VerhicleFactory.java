package excersises.methodFactory;

public abstract class VerhicleFactory {

    public static Verhicle getVerhicle(VerhicleType verhicleType) {

        Verhicle verhicle;

        switch(verhicleType) {
            case Car:
                verhicle = new Car();
                break;
            case Quad:
                verhicle = new Quad();
                break;
            case Motor:
                verhicle = new Motor();
                break;
            default:
                verhicle = null;
        }

        return verhicle;
    }
}
