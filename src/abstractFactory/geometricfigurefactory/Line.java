package abstractFactory.geometricfigurefactory;

/**
 * Concrete Product
 */
public class Line implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Line Drawn.");
    }

    @Override
    public void perimeter(){
        System.out.println("Calculating perimeter of the line");
    }

    @Override
    public void area() {
        System.out.println("Calculating area of the line");
    }
}