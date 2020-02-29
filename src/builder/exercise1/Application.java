package builder.exercise1;

import org.w3c.dom.ls.LSOutput;

public class Application {

    public static void main(String[] args) {

        Pizza pizza = new Pizza.PizzaBuilder("Pineapple", "Flat", "Tomato")
                .setSpicy(true)
                //by default false, no need to declare
                .setWhite(false)
                .build();

        System.out.println(pizza);

    }


}
