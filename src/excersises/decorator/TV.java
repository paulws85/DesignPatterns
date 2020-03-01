package excersises.decorator;

public class TV extends Product {

    @Override
    public void subscribe() {
        System.out.println("Zakup pakietu TV: Podstawowy.");
    }

    @Override
    public String description() {
        return "Masz pakiet TV: Podstawowy.";
    }
}
