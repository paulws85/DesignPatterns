package excersises.decorator;

public class PhoneLow extends PhoneDecorator {

    public PhoneLow(UPC phoneDecorator) {
        super(phoneDecorator);
    }

    @Override
    public void subscribe() {
        System.out.println("Zakup pakietu Telefon: Low.");
    }

    @Override
    public String description() {
        return phoneDecorator.description() + " Zakupiles pakiet Telefon: Low.";
    }
}
