package sda.issuesystem.client.command;

import sda.issuesystem.client.menu.command.CommandInterface;

import java.io.IOException;

public class ConsoleJustClear<T> implements CommandInterface<T> {

    private static final ConsoleJustClear INSTANCE = new ConsoleJustClear();

    public static ConsoleJustClear getInstance() {
        return INSTANCE;
    }

    @Override
    public void execute(T onObject) {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
