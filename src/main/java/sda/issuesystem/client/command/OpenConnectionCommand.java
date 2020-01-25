package sda.issuesystem.client.command;

import sda.issuesystem.client.config.ConnectionConfiguration;
import sda.issuesystem.client.context.SessionContext;
import sda.issuesystem.client.menu.command.CommandInterface;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class OpenConnectionCommand implements CommandInterface<Void> {

    private static final OpenConnectionCommand INSTANCE = new OpenConnectionCommand();

    public static OpenConnectionCommand getInstance() {
        return INSTANCE;
    }

    @Override
    public void execute(Void onObject) {
        try {
//        Socket channel = new Socket(ConnectionConfiguration.getAddress(), ConnectionConfiguration.getPort());
            SessionContext.setChannel(new Socket(ConnectionConfiguration.getAddress(), ConnectionConfiguration.getPort()));
//            ObjectOutputStream out = new ObjectOutputStream(channel.getOutputStream());
            SessionContext.setOut(new ObjectOutputStream(SessionContext.getChannel().getOutputStream()));
//            ObjectInputStream in = new ObjectInputStream(channel.getInputStream());
            SessionContext.setIn(new ObjectInputStream(SessionContext.getChannel().getInputStream()));
            ConsoleJustClear.getInstance().execute(null);
            System.out.println("Enter user name:");
            CreateUserCommand.getInstance().execute(null);
//            out.writeObject(user);
//            out.flush();
//            System.out.println(in.readObject());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
