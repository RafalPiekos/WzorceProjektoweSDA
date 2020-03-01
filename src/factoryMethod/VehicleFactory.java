package factoryMethod;

public abstract class VehicleFactory {
    public static Vehicle getVehicleType(VehicleType type) {
        Vehicle vehicle =null;
        switch (type) {
            case CAR:
                vehicle = new Car();
                break;
            case QUAD:
                vehicle = new Quad();
                break;
            case MOTORBIKE:
                vehicle = new Motorbike();
                break;
        }
        return vehicle;
    }
}
