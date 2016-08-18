package creational.factory;

/**
 * Created by roman on 8/17/16.
 */
public class RomeWatchCreator implements WatchCreator {
    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}
