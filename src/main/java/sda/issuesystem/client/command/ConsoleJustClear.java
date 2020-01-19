package sda.issuesystem.client.command;

import sda.issuesystem.client.menu.command.CommandInterface;

import java.io.IOException;
import java.util.Objects;

public class ConsoleJustClear implements CommandInterface<Void> {

    private static final ConsoleJustClear INSTANCE = new ConsoleJustClear();

    public static ConsoleJustClear getInstance() {
        return INSTANCE;
    }

    @Override
    public void execute(Void onObject) {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
