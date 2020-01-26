package sda.issuesystem.client.command;

import sda.issuesystem.client.context.SessionContext;
import sda.issuesystem.client.menu.command.CommandInterface;
import sda.issuesystem.dto.DataTransferObject;
import sda.issuesystem.dto.User;

import java.io.IOException;
import java.util.Scanner;

public class CreateUserCommand implements CommandInterface<Void> {

    private static final CreateUserCommand INSTANCE = new CreateUserCommand();

    public static CreateUserCommand getInstance() {
        return INSTANCE;
    }

    Scanner scanner = new Scanner(System.in);
    Scanner intScanner = new Scanner(System.in);

    @Override
    public void execute(Void onObject) {

        User user = new User.UserBuilder()
                .setName(scanner.nextLine())
                .setSurname(scanner.nextLine())
                .setAge(intScanner.nextInt())
                .setAddress(scanner.nextLine())
                .setCity(scanner.nextLine())
                .setLogin(scanner.nextLine())
                .setPassword(scanner.nextLine())
                .build();

        DataTransferObject<User> dto = new DataTransferObject<>(DataTransferObject.ADU, user);

        try {
            SessionContext.getOut().writeObject(dto);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
