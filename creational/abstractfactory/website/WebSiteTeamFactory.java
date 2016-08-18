package creational.abstractfactory.website;

import creational.abstractfactory.Developer;
import creational.abstractfactory.ProjectManager;
import creational.abstractfactory.ProjectTeamFactory;
import creational.abstractfactory.Tester;

/**
 * Created by roman on 8/17/16.
 */
public class WebSiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
