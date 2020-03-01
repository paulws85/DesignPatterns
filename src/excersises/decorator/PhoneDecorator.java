package excersises.decorator;

public abstract class PhoneDecorator extends Product {

    UPC phoneDecorator;

    public PhoneDecorator(UPC phoneDecorator) {
        this.phoneDecorator = phoneDecorator;
    }
}
