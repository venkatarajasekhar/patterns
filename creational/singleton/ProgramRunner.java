package creational.singleton;

public class ProgramRunner {

    public static void main(String[] args) {

        ProgramLogger programLogger = ProgramLogger.getInstance();
        programLogger.showLogFile();
        programLogger.addLogInfo("Line");
        programLogger.showLogFile();

    }

}
