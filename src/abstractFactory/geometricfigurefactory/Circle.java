package abstractFactory.geometricfigurefactory;

/**
 * Concrete product
 */
public class Circle implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Circle is drawn.");
    }

    @Override
    public void perimeter(){
        System.out.println("Calculating perimeter of the circuit");
    }

    @Override
    public void area() {
        System.out.println("Calculating area of the circle");
    }
}