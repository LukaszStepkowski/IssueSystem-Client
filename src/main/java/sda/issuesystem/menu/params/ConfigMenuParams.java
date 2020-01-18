package sda.issuesystem.menu.params;

import sda.issuesystem.client.menu.command.CommandInterface;
import sda.issuesystem.menu.interfaces.MenuParamInterface;

public enum ConfigMenuParams implements MenuParamInterface {
    SET_ADDRESS(1, "Set Address"),
    SET_PORT(2, "Set Port"),
    SHOW_CONFIGURATION(3, "Show Configuration"),
    RESTORE_DEFAULT(4, "Restore Default")
    ;

    int commandNumber;
    String commandDescription;

    ConfigMenuParams(int commandNumber, String commandDescription) {
        this.commandNumber = commandNumber;
        this.commandDescription = commandDescription;
    }

    public int getCommandNumber() {
        return commandNumber;
    }

    public String getCommandDescription() {
        return commandDescription;
    }

    @Override
    public CommandInterface userChoice() {
        return null;
    }


}
