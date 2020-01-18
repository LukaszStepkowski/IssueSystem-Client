package sda.issuesystem.client.menu;

import sda.issuesystem.menu.interfaces.MenuParamInterface;

public abstract class AbstractMenu<T extends MenuParamInterface> {

    T[] params;

    public AbstractMenu(T[] params) {
        this.params = params;
    }

    public void setParams(T[] params) {
        this.params = params;
    }

    public abstract void printMenu();
}
