package excersises.decorator;

public class PhoneHigh extends PhoneDecorator {

    public PhoneHigh(UPC phoneDecorator) {
        super(phoneDecorator);
    }

    @Override
    public void subscribe() {
        System.out.println("Zakup pakietu Telefon: High.");
    }

    @Override
    public String description() {
        return phoneDecorator.description() + " Zakupiles pakiet Telefon: High.";
    }
}
