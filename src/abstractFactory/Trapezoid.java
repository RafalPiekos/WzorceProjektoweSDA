package abstractFactory;

public class Trapezoid implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Trapezoid drawn.");
    }

    @Override
    public void circuit(){
        System.out.println("Calculating circuit of the trapezoid");
    }
}
