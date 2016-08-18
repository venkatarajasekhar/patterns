package creational.singleton;

/**
 * Created by roman on 8/17/16.
 */
public class ProgramLogger {

    private static ProgramLogger instanse;
    private String logFile;
    private ProgramLogger(){

        logFile = "This is log file. \n\n";

    }

    public static synchronized ProgramLogger getInstance(){
        if (instanse == null) {
            instanse = new ProgramLogger();
        }

        return instanse;
    }

    public void addLogInfo(String logInfo) {
        logInfo += logInfo + "\n";
    }

    public void showLogFile() {
        System.out.println(logFile);
    }
}
