package sda.issuesystem.menu.params;

import sda.issuesystem.client.context.ApplicationContext;
import sda.issuesystem.client.menu.DefaultMenu;
import sda.issuesystem.client.menu.command.CommandInterface;
import sda.issuesystem.menu.interfaces.MenuParamInterface;

public enum MainMenuParams implements MenuParamInterface {
    CONFIGURATION(1, "Configuration", p -> ApplicationContext.setMenuParams(ConfigMenuParams.values())),
    USER_MANAGEMENT(2, "User Management", p -> System.out.println(p)),
    ISSUE_MANAGEMENT(3, "Issue Management", p -> System.out.println(p)),
    CONNECTION_MANAGEMENT(4, "Connection Management", p -> System.out.println(p)),
    QUIT(0, "Quit", p -> System.exit(0))
    ;

    int commandNumber;
    String commandDescription;
    CommandInterface execute;

    MainMenuParams(int commandNumber, String commandDescription, CommandInterface execute) {
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
