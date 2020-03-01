package excersises.decorator;

public class TvSuper extends TvDecorator {

    public TvSuper(UPC tv) {
        super(tv);
    }

    @Override
    public void subscribe() {
        System.out.println("Zakup pakietu TV: Super");
    }

    @Override
    public String description() {
        return decoratedTV.description() + " Zakupiles pakiet TV: Super.";
    }
}
