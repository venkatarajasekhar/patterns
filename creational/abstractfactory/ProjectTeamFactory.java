package creational.abstractfactory;

/**
 * Created by roman on 8/17/16.
 */
public interface ProjectTeamFactory {

    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();

}
