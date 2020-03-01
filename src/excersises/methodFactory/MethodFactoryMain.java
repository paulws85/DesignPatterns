package excersises.methodFactory;

public class MethodFactoryMain {

    public static void main(String[] args) {
        Verhicle verhicle = VerhicleFactory.getVerhicle(VerhicleType.Car);
        if (verhicle == null) {
            verhicle.drive();
        } else {
            System.out.println("The verhicle doesn't exist.");
        }

    }
}
