package abstractFactory;

/**
 * Concrete product
 */
public class Sphere implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Sphere drawn.");
    }

    @Override
    public void perimeter(){
        System.out.println("Calculating perimeter of the sphere");
    }

    @Override
    public void area() {
        System.out.println("Calculating area of the sphere");
    }
}