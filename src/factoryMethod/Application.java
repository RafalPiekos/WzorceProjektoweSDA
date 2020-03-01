package factoryMethod;

public class Application {

    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicleType(VehicleType.CAR);
        if (car != null) {
            car.drive();
        } else {
            System.out.println("Car doesn't exist");
        }

        Vehicle quad = VehicleFactory.getVehicleType(VehicleType.QUAD);
        if (quad != null) {
            quad.drive();
        } else {
            System.out.println("Quad doesn't exist");
        }

        Vehicle motorbike = VehicleFactory.getVehicleType(VehicleType.MOTORBIKE);
        if (motorbike != null) {
            motorbike.drive();
        } else {
            System.out.println("Motorbike doesn't exist");
        }

    }

}
