package sda.issuesystem.client.menu;

public class DefaultMenu extends AbstractMenu {

    public DefaultMenu(MainMenuParams[] params) {
        super(params);
    }

    private static DefaultMenu INSTANCE = new DefaultMenu(MainMenuParams.values());

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
