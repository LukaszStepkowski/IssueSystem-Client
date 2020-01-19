package sda.issuesystem.client.command;

import sda.issuesystem.client.config.ConnectionConfiguration;
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
            out.writeObject("Message sent test");
            out.flush();
            System.out.println(in.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
