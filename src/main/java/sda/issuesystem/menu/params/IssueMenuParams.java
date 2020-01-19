package sda.issuesystem.menu.params;

import sda.issuesystem.client.context.ApplicationContext;
import sda.issuesystem.client.menu.command.CommandInterface;
import sda.issuesystem.menu.interfaces.MenuParamInterface;

public enum IssueMenuParams implements MenuParamInterface {
    PREVIOUS_MENU(0, "Previous Menu", p -> ApplicationContext.setMenuParams(MainMenuParams.values()));

    int commandNumber;
    String commandDescription;
    CommandInterface execute;

    IssueMenuParams(int commandNumber, String commandDescription, CommandInterface execute) {
        this.commandNumber = commandNumber;
        this.commandDescription = commandDescription;
        this.execute = execute;
    }

    @Override
    public int getCommandNumber() {
        return commandNumber;
    }

    @Override
    public String getCommandDescription() {
        return commandDescription;
    }

    @Override
    public CommandInterface userChoice() {
        return execute;
    }
}
