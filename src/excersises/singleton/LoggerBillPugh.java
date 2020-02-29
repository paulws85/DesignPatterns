package excersises.singleton;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalTime;

public class LoggerBillPugh {

    private static File file;

    private LoggerBillPugh() {
        file = new File("log_bill_pugh.txt");
    }

    private static class LoggerBillPughHolder {
        private static final LoggerBillPugh LOGGER_BILL_PUGH = new LoggerBillPugh();
    }

    private static LoggerBillPugh getLoggerLazyInstance() {
        System.out.println("Istance LoggerBillPugh exists");
        return LoggerBillPughHolder.LOGGER_BILL_PUGH;
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
