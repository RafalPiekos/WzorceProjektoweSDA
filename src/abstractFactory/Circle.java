package abstractFactory;

/**
 * Concrete product
 */
public class Circle implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Circle is drawn.");
    }

    @Override
    public void circuit(){
        System.out.println("Calculating circuit of the circuit");
    }
}