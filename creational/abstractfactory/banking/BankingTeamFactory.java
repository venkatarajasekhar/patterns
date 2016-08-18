package creational.abstractfactory.banking;

import creational.abstractfactory.Developer;
import creational.abstractfactory.ProjectManager;
import creational.abstractfactory.ProjectTeamFactory;
import creational.abstractfactory.Tester;

/**
 * Created by roman on 8/17/16.
 */
public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
