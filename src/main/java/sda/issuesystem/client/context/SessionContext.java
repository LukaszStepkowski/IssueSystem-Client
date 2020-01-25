package sda.issuesystem.client.context;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class SessionContext {

    private static Socket channel;
    private static ObjectOutputStream out;
    private static ObjectInputStream in;

    public static Socket getChannel() {
        return channel;
    }

    public static void setChannel(Socket channel) {
        SessionContext.channel = channel;
    }

    public static ObjectOutputStream getOut() {
        return out;
    }

    public static void setOut(ObjectOutputStream out) {
        SessionContext.out = out;
    }

    public static ObjectInputStream getIn() {
        return in;
    }

    public static void setIn(ObjectInputStream in) {
        SessionContext.in = in;
    }
}
