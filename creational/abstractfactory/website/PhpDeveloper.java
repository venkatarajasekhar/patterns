package creational.abstractfactory.website;

import creational.abstractfactory.Developer;

/**
 * Created by roman on 8/17/16.
 */
public class PhpDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
