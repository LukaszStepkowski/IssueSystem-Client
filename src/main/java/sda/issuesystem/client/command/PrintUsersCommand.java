package sda.issuesystem.client.command;

import sda.issuesystem.client.context.SessionContext;
import sda.issuesystem.client.menu.command.CommandInterface;
import sda.issuesystem.dto.DataTransferObject;
import sda.issuesystem.dto.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PrintUsersCommand implements CommandInterface<Void> {

    private static final PrintUsersCommand INSTANCE = new PrintUsersCommand();

    public static PrintUsersCommand getInstance() {
        return INSTANCE;
    }



    @Override
    public void execute(Void onObject) {

        List<User> userList = new ArrayList<>();

        DataTransferObject<List> dto = new DataTransferObject<List>(DataTransferObject.GETU, userList);

        try {
            SessionContext.getOut().writeObject(dto);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
