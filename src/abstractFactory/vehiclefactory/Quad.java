package abstractFactory.vehiclefactory;

public class Quad implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Quad drives.");
    }
}
