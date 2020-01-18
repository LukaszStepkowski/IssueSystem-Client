package sda.issuesystem.client.menu;

public enum ConfigMenuParams {
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
}
