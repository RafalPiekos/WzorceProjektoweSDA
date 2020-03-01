package abstractFactory.vehiclefactory;

public class Application {

    public static void main(String[] args) {
        AbstractFactory factory = FactoryProvider.getFactory(FactoryType.CAR_FACTORY);
        if (factory == null) {
            System.out.println("Factory for given name doesn't exist.");
            System.exit(1);
        }

        Vehicle vehicle = factory.getVehicleType(VehicleType.CAR);
        if (vehicle != null) {
            vehicle.drive();
        } else {
            System.out.println("Vehicle doesn't exist");
        }

    }

}
