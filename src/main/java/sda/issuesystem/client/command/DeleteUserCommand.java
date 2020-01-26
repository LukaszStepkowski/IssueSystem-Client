package sda.issuesystem.client.command;

import sda.issuesystem.client.context.SessionContext;
import sda.issuesystem.client.menu.command.CommandInterface;
import sda.issuesystem.dto.DataTransferObject;

import java.io.IOException;
import java.util.Scanner;

public class DeleteUserCommand implements CommandInterface<Void> {

    private static DeleteUserCommand INSTANCE = new DeleteUserCommand();

    public static DeleteUserCommand getInstance() {
        return INSTANCE;
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void execute(Void onObject) {

        Integer input = scanner.nextInt();

        DataTransferObject<Integer> dto = new DataTransferObject<>(DataTransferObject.DELU, input);

        try {
            SessionContext.getOut().writeObject(dto);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
