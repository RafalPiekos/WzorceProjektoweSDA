package abstractFactory.vehiclefactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(FactoryType factoryType) {
        switch (factoryType) {
            case CAR_FACTORY:
                return new CarFactory();
            case QUAD_FACTORY:
                return new QuadFactory();
            case MOTORBIKE_FACTORY:
                return new MotorbikeFactory();
            default:
                return null;
        }
    }
}
