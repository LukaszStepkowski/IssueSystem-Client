package sda.issuesystem.client.menu;

import sda.issuesystem.menu.interfaces.MenuParamInterface;
import sda.issuesystem.menu.params.MainMenuParams;

public class DefaultMenu extends AbstractMenu<MenuParamInterface> {

    public DefaultMenu(MenuParamInterface[] params) {
        super(params);
    }

    private static final DefaultMenu INSTANCE = new DefaultMenu(MainMenuParams.values());

    public static DefaultMenu getInstance(){
        return INSTANCE;
    }

    @Override
    public void printMenu() {
        for (int i = 0; i < params.length; i++){
            System.out.println(params[i].getCommandNumber() + ". " + params[i].getCommandDescription());
        }
    }
}
