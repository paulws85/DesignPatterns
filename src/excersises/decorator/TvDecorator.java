package excersises.decorator;

public abstract class TvDecorator extends Product {

    protected UPC decoratedTV;

    public TvDecorator(UPC decoratedTV) {
        this.decoratedTV = decoratedTV;
    }
}
