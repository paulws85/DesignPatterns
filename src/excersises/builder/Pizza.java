package excersises.builder;

public class Pizza {

    //required:
    private final String igredient;
    private final String pizzaDough;
    private final String dip;
    //optional
    private boolean isWhite;
    private boolean isSpicy;

    private Pizza(PizzaBuilder pizzaBuilder) {
        this.igredient = pizzaBuilder.igredient;
        this.pizzaDough = pizzaBuilder.pizzaDough;
        this.dip = pizzaBuilder.dip;
        this.isWhite = pizzaBuilder.isWhite;
        this.isSpicy = pizzaBuilder.isSpicy;
    }

    public String getIgredient() {
        return igredient;
    }

    public String getPizzaDough() {
        return pizzaDough;
    }

    public String getDip() {
        return dip;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    @Override
    public String toString() {
        return "Pizza{" +
            "igredient='" + igredient + '\'' +
            ", pizzaDough='" + pizzaDough + '\'' +
            ", dip='" + dip + '\'' +
            ", isWhite=" + isWhite +
            ", isSpicy=" + isSpicy +
            '}';
    }

    public static class PizzaBuilder {

        //required:
        private final String igredient;
        private final String pizzaDough;
        private final String dip;
        //optional
        private boolean isWhite;
        private boolean isSpicy;

        public PizzaBuilder(String igredient, String pizzaDough, String dip) {
            this.igredient = igredient;
            this.pizzaDough = pizzaDough;
            this.dip = dip;
        }

        public PizzaBuilder setWhite(boolean isWhite) {
            this.isWhite = isWhite;
            return this;
        }

        public PizzaBuilder setSpicy(boolean isSpicy) {
            this.isSpicy = isSpicy;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

}
