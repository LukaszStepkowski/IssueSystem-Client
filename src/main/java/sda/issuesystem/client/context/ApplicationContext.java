package sda.issuesystem.client.context;

import sda.issuesystem.client.menu.AbstractMenu;
import sda.issuesystem.menu.interfaces.MenuParamInterface;

public class ApplicationContext {

    private AbstractMenu actualMenu;

    public ApplicationContext(AbstractMenu actualMenu) {
        this.actualMenu = actualMenu;
    }

    public AbstractMenu getMenu(){
        return actualMenu;
    }

    public void setMenu(AbstractMenu actualMenu){
        this.actualMenu = actualMenu;
    }

    public <T> void setMenuParams(MenuParamInterface[] params){
        actualMenu.setParams(params);
    }
}
