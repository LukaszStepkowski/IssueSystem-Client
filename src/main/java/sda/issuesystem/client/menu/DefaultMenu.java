package sda.issuesystem.client.menu;

import sda.issuesystem.client.command.ConsoleJustClear;
import sda.issuesystem.menu.interfaces.MenuParamInterface;
import sda.issuesystem.menu.params.MainMenuParams;

import java.util.Arrays;
import java.util.Scanner;

public class DefaultMenu extends AbstractMenu<MenuParamInterface> {

    public DefaultMenu(MenuParamInterface[] params) {
        super(params);
    }

    private static final DefaultMenu INSTANCE = new DefaultMenu(MainMenuParams.values());

    public static DefaultMenu getInstance(){
        return INSTANCE;
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void printMenu() {
        System.out.println("Pick an option:");
        for (int i = 0; i < params.length; i++){
            System.out.println(params[i].getCommandNumber() + ". " + params[i].getCommandDescription());
        }
        int choice = scanner.nextInt();
        Arrays.stream(params)
                .filter(p -> p.getCommandNumber() == choice)
                .forEach(p -> p.userChoice().execute(null));

        ConsoleJustClear.getInstance().execute(null);
    }
}
