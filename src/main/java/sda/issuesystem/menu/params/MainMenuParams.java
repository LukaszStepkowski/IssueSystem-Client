package sda.issuesystem.menu.params;

import sda.issuesystem.menu.interfaces.MenuParamInterface;

public enum MainMenuParams implements MenuParamInterface {
    CONFIGURATION(1, "Configuration"),
    USER_MANAGEMENT(2, "User Management"),
    ISSUE_MANAGEMENT(3, "Issue Management"),
    CONNECTION_MANAGEMENT(4, "Conection Mangement"),
    QUIT(0, "Quit")
    ;

    int commandNumber;
    String commandDescription;

    MainMenuParams(int commandNumber, String commandDescription) {
        this.commandNumber = commandNumber;
        this.commandDescription = commandDescription;
    }

    public int getCommandNumber() {
        return commandNumber;
    }

    public String getCommandDescription() {
        return commandDescription;
    }
}
