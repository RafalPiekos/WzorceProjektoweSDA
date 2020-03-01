package strategy.calculator;

public class Application {
    public static void main(String[] args) {

        String operation = "+";
        int x = 10;
        int y = 15;

        CalculateContext calculateContext = new CalculateContext();
        if ("+".equals(operation)) {
           calculateContext.setCalculateStrategy(new Add());
        } else if ("*".equals(operation)) {
            calculateContext.setCalculateStrategy(new Multiply());
        }

        calculateContext.calculate(x, y);

    }

}
