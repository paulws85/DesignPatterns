package excersises.decorator;

public abstract class InternetDecorator extends Product {

    UPC internetDecorator;

    public InternetDecorator(UPC internetDecorator) {
        this.internetDecorator = internetDecorator;
    }
}
