package singleton.singletonexercise1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

public class BillPughLogger {

    private BillPughLogger() {
    }

    private static class BillPughLoggerHelper {
        private static final BillPughLogger LOGGER = new BillPughLogger();
    }

    public static BillPughLogger getInstance() {
        return BillPughLoggerHelper.LOGGER;
    }

    public void log(LEVEL level, String msg) {
        LocalTime logTime = LocalTime.now();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("logBillPugh.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(logTime + ", " + level + ", " + msg);
        printWriter.flush();
        printWriter.close();
    }

}
