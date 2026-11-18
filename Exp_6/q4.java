
package Exp_6;

public class q4 {

    static final class Logger {

        void logMessage(String message) {
            System.out.println("Log Message: " + message);
        }
    }

    public static void main(String[] args) {

        Logger obj = new Logger();

        obj.logMessage("Application started successfully.");

        obj.logMessage("System running normally.");
    }
}

