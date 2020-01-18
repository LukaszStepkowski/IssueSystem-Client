package sda.issuesystem.client.menu;

public abstract class AbstractMenu {

    MainMenuParams[] params;

    public AbstractMenu(MainMenuParams[] params) {
        this.params = params;
    }

    public void setParams(MainMenuParams[] params) {
        this.params = params;
    }

    public abstract void printMenu();
}
