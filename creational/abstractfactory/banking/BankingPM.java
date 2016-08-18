package creational.abstractfactory.banking;

import creational.abstractfactory.ProjectManager;

/**
 * Created by roman on 8/17/16.
 */
public class BankingPM implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
