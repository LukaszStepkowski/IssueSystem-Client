package sda.issuesystem.client.context;

import sda.issuesystem.client.menu.AbstractMenu;

public class ApplicationContext {

    private AbstractMenu actualMenu;

    public ApplicationContext(AbstractMenu actualMenu) {
        this.actualMenu = actualMenu;
    }

    public AbstractMenu getMenu(){
        return actualMenu;
    }

    public void setMenu(){

    }

    public <T> void setMenuParams(){

    }
}
