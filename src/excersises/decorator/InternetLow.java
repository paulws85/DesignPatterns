package excersises.decorator;

public class InternetLow extends InternetDecorator {

    public InternetLow(UPC internetDecorator) {
        super(internetDecorator);
    }

    @Override
    public void subscribe() {
        System.out.println("Zakup pakietu Internet: Low");
    }

    @Override
    public String description() {
        return internetDecorator.description() + " Zakupiles pakiet Internet: Low.";
    }
}
