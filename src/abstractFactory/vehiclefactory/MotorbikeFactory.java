package abstractFactory.vehiclefactory;

public class MotorbikeFactory extends AbstractFactory {
    @Override
    Vehicle getVehicleType(VehicleType vehicleType) {
        switch (vehicleType) {
            case MOTORBIKE:
                return new Motorbike();
            default:
                return null;
        }
    }
}
