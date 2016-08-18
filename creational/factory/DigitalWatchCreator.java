package creational.factory;

/**
 * Created by roman on 8/17/16.
 */
public class DigitalWatchCreator implements WatchCreator {

    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }

}
