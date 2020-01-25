package sda.issuesystem.client.command;

import sda.issuesystem.client.config.ConnectionConfiguration;
import sda.issuesystem.client.context.SessionContext;
import sda.issuesystem.client.menu.command.CommandInterface;
import sda.issuesystem.dto.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class OpenConnectionCommand implements CommandInterface<Void> {

    private static final OpenConnectionCommand INSTANCE = new OpenConnectionCommand();

    public static OpenConnectionCommand getInstance() {
        return INSTANCE;
    }

    User user = new User.UserBuilder()
            .setID("1")
            .setName("John")
            .setSurname("Doe")
            .setLogin("john.doe")
            .setAge(25)
            .setPassword("password")
            .setAddress("Unknown Street")
            .setCity("Uranus").build();

    @Override
    public void execute(Void onObject) {
        try {
//        Socket channel = new Socket(ConnectionConfiguration.getAddress(), ConnectionConfiguration.getPort());
            SessionContext.setChannel(new Socket(ConnectionConfiguration.getAddress(), ConnectionConfiguration.getPort()));
//            ObjectOutputStream out = new ObjectOutputStream(channel.getOutputStream());
            SessionContext.setOut(new ObjectOutputStream(SessionContext.getChannel().getOutputStream()));
//            ObjectInputStream in = new ObjectInputStream(channel.getInputStream());
            SessionContext.setIn(new ObjectInputStream(SessionContext.getChannel().getInputStream()));
//            out.writeObject(user);
//            out.flush();
//            System.out.println(in.readObject());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
