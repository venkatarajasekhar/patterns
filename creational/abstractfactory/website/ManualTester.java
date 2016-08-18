package creational.abstractfactory.website;

import creational.abstractfactory.Tester;

/**
 * Created by roman on 8/17/16.
 */
public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests web site...");
    }
}
