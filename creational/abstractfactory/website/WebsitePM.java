package creational.abstractfactory.website;

import creational.abstractfactory.ProjectManager;

/**
 * Created by roman on 8/17/16.
 */
public class WebsitePM implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
