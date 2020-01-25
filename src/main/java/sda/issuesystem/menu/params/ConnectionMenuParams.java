package sda.issuesystem.menu.params;

import sda.issuesystem.client.command.OpenConnectionCommand;
import sda.issuesystem.client.context.ApplicationContext;
import sda.issuesystem.client.context.SessionContext;
import sda.issuesystem.client.menu.command.CommandInterface;
import sda.issuesystem.menu.interfaces.MenuParamInterface;

public enum ConnectionMenuParams implements MenuParamInterface {
    OPEN_CONNECTION(1, "Open Connection", p -> {
        OpenConnectionCommand.getInstance().execute(null);
        if (SessionContext.isIsSessionOpen()) {
            System.out.println("Session is open");
        } else {
            System.out.println("Can't open session");
        }
    }),
    PREVIOUS_MENU(0, "Previous Menu", p -> ApplicationContext.setMenuParams(MainMenuParams.values()));

    int commandNumber;
    String commandDescription;
    CommandInterface execute;

    ConnectionMenuParams(int commandNumber, String commandDescription, CommandInterface execute) {
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
