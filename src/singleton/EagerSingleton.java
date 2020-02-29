package singleton;

public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();
    private EagerSingleton() {
    }
    public EagerSingleton getInstance() {
        return instance;
    }
}
