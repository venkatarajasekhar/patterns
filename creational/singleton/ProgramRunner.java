package creational.singleton;

/**
 * Created by roman on 8/17/16.
 */
public class ProgramRunner {

    public static void main(String[] args) {

        ProgramLogger programLogger = ProgramLogger.getInstance();
        programLogger.showLogFile();
        programLogger.addLogInfo("Line");
        programLogger.showLogFile();

    }

}
