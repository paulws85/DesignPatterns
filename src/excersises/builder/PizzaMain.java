package excersises.builder;

public class PizzaMain {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder("ser, kielbasa", "jasne", "pikantny")
            .setSpicy(true)
            .setWhite(true)
            .build();

        System.out.println(pizza);
    }

}
