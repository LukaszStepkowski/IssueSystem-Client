package sda.issuesystem.menu.params;

import sda.issuesystem.client.context.ApplicationContext;
import sda.issuesystem.client.menu.command.CommandInterface;
import sda.issuesystem.menu.interfaces.MenuParamInterface;

public enum ConfigMenuParams implements MenuParamInterface {
    SET_ADDRESS(1, "Set Address", p -> System.out.println(p)),
    SET_PORT(2, "Set Port", p -> System.out.println(p)),
    SHOW_CONFIGURATION(3, "Show Configuration", p -> System.out.println(p)),
    RESTORE_DEFAULT(4, "Restore Default", p -> System.out.println(p)),
    PREVIOUS_MENU(0, "Previous Menu", p -> ApplicationContext.setMenuParams(MainMenuParams.values()))
    ;

    int commandNumber;
    String commandDescription;
    CommandInterface execute;

    ConfigMenuParams(int commandNumber, String commandDescription, CommandInterface execute) {
        this.commandNumber = commandNumber;
        this.commandDescription = commandDescription;
        this.execute = execute;
    }

    public int getCommandNumber() {
        return commandNumber;
    }

    public String getCommandDescription() {
        return commandDescription;
    }

    @Override
    public CommandInterface userChoice() {
        return execute;
    }


}
