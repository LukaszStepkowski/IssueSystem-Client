package sda.issuesystem.client.context;

import sda.issuesystem.client.menu.AbstractMenu;
import sda.issuesystem.menu.interfaces.MenuParamInterface;

public class ApplicationContext {

    public static AbstractMenu actualMenu;

    public static AbstractMenu getMenu(){
        return actualMenu;
    }

    public static void setMenu(AbstractMenu newMenu){
        actualMenu = newMenu;
    }

    public static  <T extends MenuParamInterface> void setMenuParams(T[] params){
        actualMenu.setParams(params);
    }
}
