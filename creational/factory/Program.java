package creational.factory;

/**
 * Created by roman on 8/17/16.
 */
public class Program {

    public static void main(String[] args) {

        WatchCreator watchCreator = createWatchByType("digital");
        Watch watch = watchCreator.createWatch();
        watch.showTime();

    }

    private static WatchCreator createWatchByType(String type) {
        if(type.equalsIgnoreCase("digital")) {
            return new DigitalWatchCreator();
        } else if(type.equalsIgnoreCase("rome")) {
            return new RomeWatchCreator();
        } else {
            throw new RuntimeException(type + " is unknown type");
        }
    }

}
