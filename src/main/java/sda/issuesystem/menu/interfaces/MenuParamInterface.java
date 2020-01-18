package sda.issuesystem.menu.interfaces;

import sda.issuesystem.client.menu.command.CommandInterface;

public interface MenuParamInterface {

    int getCommandNumber();

    String getCommandDescription();

    CommandInterface userChoice();
}
