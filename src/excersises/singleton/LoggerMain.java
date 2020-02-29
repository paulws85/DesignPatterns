package excersises.singleton;

public class LoggerMain {
    public static void main(String[] args) {
        LoggerLazy.log(LogLevel.ERROR, "FATAL ERROR");
        LoggerLazy.log(LogLevel.ERROR, "FATAL ERROR2");
        LoggerBillPugh.log(LogLevel.INFO, "INFO");
        LoggerBillPugh.log(LogLevel.INFO, "INFO2");
    }
}
