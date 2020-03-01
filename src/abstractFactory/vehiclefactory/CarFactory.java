package abstractFactory.vehiclefactory;

public class CarFactory extends AbstractFactory {
    @Override
    Vehicle getVehicleType(VehicleType vehicleType) {
        switch (vehicleType) {
            case CAR:
                return new Car();
            default:
                return null;
        }
    }
}
