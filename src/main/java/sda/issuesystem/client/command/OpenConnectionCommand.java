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
        Socket channel = new Socket(ConnectionConfiguration.getAddress(), ConnectionConfiguration.getPort());
            ObjectOutputStream out = new ObjectOutputStream(channel.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(channel.getInputStream());

            SessionContext.setChannel(channel);
            SessionContext.setOut(out);
            SessionContext.setIn(in);
            SessionContext.setSessionOpen(true);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
