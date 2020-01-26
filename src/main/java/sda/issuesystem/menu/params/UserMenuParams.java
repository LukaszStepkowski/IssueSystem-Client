package sda.issuesystem.menu.params;

import sda.issuesystem.client.command.ConsoleJustClear;
import sda.issuesystem.client.command.CreateUserCommand;
import sda.issuesystem.client.context.ApplicationContext;
import sda.issuesystem.client.context.SessionContext;
import sda.issuesystem.client.menu.command.CommandInterface;
import sda.issuesystem.dto.DataTransferObject;
import sda.issuesystem.menu.interfaces.MenuParamInterface;

import java.io.IOException;

public enum UserMenuParams implements MenuParamInterface {
    ADD_USER(1, "Add User", p -> {
        ConsoleJustClear.getInstance().execute(null);
        System.out.println("Enter user name:");
        CreateUserCommand.getInstance().execute(null);
        DataTransferObject dto = null;
        try {
            dto = (DataTransferObject) SessionContext.getIn().readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(dto.getObject());
    }),
    PREVIOUS_MENU(0, "Previous Menu", p -> ApplicationContext.setMenuParams(MainMenuParams.values()));

    int commandNumber;
    String commandDescription;
    CommandInterface execute;

    UserMenuParams(int commandNumber, String commandDescription, CommandInterface execute) {
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
