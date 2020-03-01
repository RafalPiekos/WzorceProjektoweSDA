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
    public void circuit(){
        System.out.println("Calculating circuit of the sphere");
    }
}