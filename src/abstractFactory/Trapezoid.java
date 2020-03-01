package abstractFactory;

public class Trapezoid implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Trapezoid drawn.");
    }

    @Override
    public void perimeter(){
        System.out.println("Calculating perimeter of the trapezoid");
    }

    @Override
    public void area() {
        System.out.println("Calculating area of the trapezoid");
    }
}
