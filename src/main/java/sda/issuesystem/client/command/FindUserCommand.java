package sda.issuesystem.client.command;

import sda.issuesystem.client.context.SessionContext;
import sda.issuesystem.client.menu.command.CommandInterface;
import sda.issuesystem.dto.DataTransferObject;

import java.io.IOException;
import java.util.Scanner;

public class FindUserCommand implements CommandInterface<Void> {

    private static FindUserCommand INSTANCE = new FindUserCommand();

    public static FindUserCommand getInstance() {
        return INSTANCE;
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void execute(Void onObject) {
        String input = scanner.nextLine();

        DataTransferObject<String> dto = new DataTransferObject<>(DataTransferObject.FUBL, input);

        try {
            SessionContext.getOut().writeObject(dto);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
