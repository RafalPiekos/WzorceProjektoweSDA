package abstractFactory.geometricfigurefactory;

/**
 * Abstract Factory
 */
public abstract class AbstractFactory {
    abstract GeometricShape getShape(ShapeType name);
}