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
        for (int i = 0; i < MainMenuParams.values().length; i++){
            System.out.println(MainMenuParams.values()[i].getCommandNumber() + ". " + MainMenuParams.values()[i].getCommandDescription());
        }
    }
}
