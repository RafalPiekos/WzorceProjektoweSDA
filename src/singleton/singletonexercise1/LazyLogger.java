package singleton.singletonexercise1;

import java.io.*;
import java.time.LocalTime;

public class LazyLogger {

    private static LazyLogger loggerInstance;
    private static File loggingFile;

    private LazyLogger(){
        loggingFile = new File("log.txt");
    }

    public static LazyLogger getInstance() {
        if(loggerInstance == null) {
            loggerInstance = new LazyLogger();
        }
        return loggerInstance;
    }

    public void log(LEVEL level, String msg) {
        LocalTime logTime = LocalTime.now();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(loggingFile, true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(logTime + ", " + level + ", " + msg);
        printWriter.flush();
        printWriter.close();
    }

}
