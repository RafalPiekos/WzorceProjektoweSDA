package abstractFactory;

/**
 * Concrete Product
 */
public class Line implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Line Drawn.");
    }

    @Override
    public void circuit(){
        System.out.println("Calculating circuit of the line");
    }
}