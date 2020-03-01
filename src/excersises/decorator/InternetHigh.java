package excersises.decorator;

public class InternetHigh extends InternetDecorator {

    public InternetHigh(UPC internetDecorator) {
        super(internetDecorator);
    }

    @Override
    public void subscribe() {
        System.out.println("Zakup pakietu Internet: High");
    }

    @Override
    public String description() {
        return internetDecorator.description() + " Zakupiles pakiet Internet: High.";
    }
}
