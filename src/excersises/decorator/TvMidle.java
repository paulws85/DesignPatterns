package excersises.decorator;

public class TvMidle extends TvDecorator {

    public TvMidle(UPC tv) {
        super(tv);
    }

    @Override
    public void subscribe() {
        System.out.println("Zakup pakietu TV: Midle");
    }

    @Override
    public String description() {
        return decoratedTV.description() + " Zakupiles pakiet TV: Midle.";
    }
}
