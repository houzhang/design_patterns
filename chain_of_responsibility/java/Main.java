public class Main {

  private static AbstractLogger getChainOfLoggers() {
    AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
    AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
    AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

    errorLogger.setNextLogger(fileLogger);
    fileLogger.setNextLogger(consoleLogger);

    return errorLogger;
  }

  public static void main(String[] args) {
    AbstractLogger logger = getChainOfLoggers();

    logger.logMessage(AbstractLogger.INFO, "This is info message");
    logger.logMessage(AbstractLogger.DEBUG, "This is debug message");
    logger.logMessage(AbstractLogger.ERROR, "This is error message");
  }
}