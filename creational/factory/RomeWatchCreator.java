package creational.factory;

public class RomeWatchCreator implements WatchCreator {
    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}
