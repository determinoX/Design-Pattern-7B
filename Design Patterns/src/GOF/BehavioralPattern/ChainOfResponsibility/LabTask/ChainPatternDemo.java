/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.BehavioralPattern.ChainOfResponsibility.LabTask;

/**
 *
 * @author shafq
 */
public class ChainPatternDemo {
   private static AbstractLogger getChainOfLoggers() {
      AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
      AbstractLogger databaseLogger = new DatabaseLogger(AbstractLogger.WARNING);
      AbstractLogger infoLogger = new ConsoleLogger(AbstractLogger.INFO);

      errorLogger.setNextLogger(databaseLogger);
      databaseLogger.setNextLogger(infoLogger);

      return errorLogger;
   }

   public static void main(String[] args) {
      AbstractLogger loggerChain = getChainOfLoggers();

      loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
      loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information.");
      loggerChain.logMessage(AbstractLogger.WARNING, "This is a warning.");
      loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
   }
}