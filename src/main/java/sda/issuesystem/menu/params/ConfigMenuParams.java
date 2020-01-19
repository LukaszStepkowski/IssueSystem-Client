package sda.issuesystem.menu.params;

import sda.issuesystem.client.command.ConsoleJustClear;
import sda.issuesystem.client.config.ConnectionConfiguration;
import sda.issuesystem.client.context.ApplicationContext;
import sda.issuesystem.client.menu.command.CommandInterface;
import sda.issuesystem.menu.interfaces.MenuParamInterface;

import java.util.Scanner;

public enum ConfigMenuParams implements MenuParamInterface {
    SET_ADDRESS(1, "Set Address", p -> {
        Scanner scanner = new Scanner(System.in);
        ConsoleJustClear.getInstance().execute(null);
        System.out.println("Input address:");
        ConnectionConfiguration.setAddress(scanner.nextLine());
        ApplicationContext.getMenu().printMenu();
    }),
    SET_PORT(2, "Set Port", p -> {
        Scanner scanner = new Scanner(System.in);
        ConsoleJustClear.getInstance().execute(null);
        System.out.println("Input port:");
        ConnectionConfiguration.setPort(scanner.nextInt());
        ApplicationContext.getMenu().printMenu();
    }),
    SHOW_CONFIGURATION(3, "Show Configuration", p -> {
        ConsoleJustClear.getInstance().execute(null);
        System.out.println("Address: " + ConnectionConfiguration.getAddress());
        System.out.println("Port: " + ConnectionConfiguration.getPort());
        ApplicationContext.getMenu().printMenu();
    }),
    RESTORE_DEFAULT(4, "Restore Default", p -> {
        ConsoleJustClear.getInstance().execute(null);
        ConnectionConfiguration.setPort(0);
        ConnectionConfiguration.setAddress(null);
        System.out.println("Default Configuration Restored.");
        ApplicationContext.getMenu().printMenu();
    }),
    PREVIOUS_MENU(0, "Previous Menu", p -> ApplicationContext.setMenuParams(MainMenuParams.values()));

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
