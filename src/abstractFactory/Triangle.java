package abstractFactory;

public class Triangle implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Triangle drawn.");
    }

    @Override
    public void perimeter(){
        System.out.println("Calculating perimeter of the triangle");
    }

    @Override
    public void area() {
        System.out.println("Calculating area of the triangle");
    }
}
