package abstractFactory.vehiclefactory;

public class QuadFactory extends AbstractFactory {
    @Override
    Vehicle getVehicleType(VehicleType vehicleType) {
        switch (vehicleType) {
            case QUAD:
                return new Quad();
            default:
                return null;
        }
    }
}
