package sda.issuesystem.client.menu;

import sda.issuesystem.client.command.ConsoleClearWithWait;
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
        ConsoleClearWithWait.getInstance().execute(null);
        System.out.println("Pick an option:");
        for (int i = 0; i < params.length; i++){
            System.out.println(params[i].getCommandNumber() + ". " + params[i].getCommandDescription());
        }
        int input = scanner.nextInt();
        MenuParamInterface choice = Arrays.stream(params)
                .filter(p -> p.getCommandNumber() == input)
                .findFirst()
                .get();

        choice.userChoice().execute(null);

    }
}
