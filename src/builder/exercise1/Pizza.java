package builder.exercise1;

public class Pizza {

    //mandatory
    private String ingredient;
    private String dough;
    private String sauce;

    //optional
    private boolean isWhite;
    private boolean isSpicy;

    public String getIngredient() {
        return ingredient;
    }

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    private Pizza(PizzaBuilder builder) {
        this.ingredient = builder.ingredient;
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.isWhite = builder.isWhite;
        this.isSpicy = builder.isSpicy;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "ingredient='" + ingredient + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", isWhite=" + isWhite +
                ", isSpicy=" + isSpicy +
                '}';
    }

    public static class PizzaBuilder {

        //mandatory
        private String ingredient;
        private String dough;
        private String sauce;

        //optional
        private boolean isWhite;
        private boolean isSpicy;

        public PizzaBuilder(String ingredient, String dough, String sauce) {
            this.ingredient = ingredient;
            this.dough = dough;
            this.sauce = sauce;
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
