package sda.issuesystem.client.config;

public class ConnectionConfiguration {

    public static int port = 0;
    public static String address = null;

    public static int getPort() {
        return port;
    }

    public static void setPort(int port) {
        ConnectionConfiguration.port = port;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        ConnectionConfiguration.address = address;
    }
}
