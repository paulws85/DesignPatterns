package excersises.decorator;

public class Phone extends Product {
    @Override
    public void subscribe() {
        System.out.println("Zakup pakietu Telefon: Ufree.");
    }

    @Override
    public String description() {
        return "Masz pakiet Telefon: Ufree.";
    }
}
