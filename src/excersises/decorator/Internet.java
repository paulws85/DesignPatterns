package excersises.decorator;

public class Internet extends Product {
    @Override
    public void subscribe() {
        System.out.println("Zakup pakietu Internet: Podstawowy.");
    }

    @Override
    public String description() {
        return "Masz pakiet Internet: Podstawowy.";
    }
}
