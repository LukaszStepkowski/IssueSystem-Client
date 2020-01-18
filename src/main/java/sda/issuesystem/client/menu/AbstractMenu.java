package sda.issuesystem.client.menu;

public abstract class AbstractMenu<T> {

    T[] params;

    public AbstractMenu(T[] params) {
        this.params = params;
    }

    public void setParams(T[] params) {
        this.params = params;
    }

    public abstract void printMenu();
}
