package creational.abstractfactory.banking;

import creational.abstractfactory.Developer;

/**
 * Created by roman on 8/17/16.
 */
public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code...");
    }
}
