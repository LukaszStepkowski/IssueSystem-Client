package sda.issuesystem.client.menu;

import sda.issuesystem.menu.params.MainMenuParams;

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
