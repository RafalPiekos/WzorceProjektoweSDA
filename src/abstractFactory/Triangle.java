package abstractFactory;

public class Triangle implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Triangle drawn.");
    }

    @Override
    public void circuit(){
        System.out.println("Calculating circuit of the triangle");
    }
}
