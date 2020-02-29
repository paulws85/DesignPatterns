package excersises.singleton;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalTime;

public class LoggerLazy {

    private static LoggerLazy loggerLazyInstance;
    private static File file;

    private LoggerLazy() {
        file = new File("log_lazy.txt");
    }

    private static LoggerLazy getLoggerLazyInstance() {
        if(loggerLazyInstance == null) {
            System.out.println("Istance LoggerLazy doesn't exist");
            loggerLazyInstance = new LoggerLazy();
        }
        System.out.println("Istance LoggerLazy exists");
        return loggerLazyInstance;
    }

    public static void log(LogLevel level, String msg) {
        getLoggerLazyInstance();
        LocalTime localDateTime = LocalTime.now();

        try (PrintWriter printWriter = new PrintWriter(file)) {

            printWriter.println(localDateTime + " " + level + ": " + msg);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
