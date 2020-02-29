package singleton.singletonexercise1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

public enum EnumLogger {

    INSTANCE;

    public void log(LEVEL level, String msg) {
        LocalTime logTime = LocalTime.now();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("enumLogger.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(logTime + ", " + level + ", " + msg);
        printWriter.flush();
        printWriter.close();
    }

}
