package singleton.singletonexercise1;

public class Application {

    public static void main(String[] args) {

        LazyLogger logger = LazyLogger.getInstance();
        logger.log(LEVEL.ERROR, "error message 2");

        BillPughLogger billPughLogger = BillPughLogger.getInstance();
        billPughLogger.log(LEVEL.INFO, "info message");

        EnumLogger enumLogger = EnumLogger.INSTANCE;
        enumLogger.log(LEVEL.INFO, "info msg 3");

    }

}
