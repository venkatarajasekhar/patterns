package creational.abstractfactory;

import creational.abstractfactory.banking.BankingTeamFactory;
import creational.abstractfactory.website.WebSiteTeamFactory;

public class Program {

    public static void main(String[] args) {

        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating bank system...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();

        projectTeamFactory = new WebSiteTeamFactory();
        developer = projectTeamFactory.getDeveloper();
        tester = projectTeamFactory.getTester();
        projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating auction website...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();

    }

}
