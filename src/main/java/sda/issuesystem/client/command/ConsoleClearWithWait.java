package sda.issuesystem.client.command;

import sda.issuesystem.client.menu.command.CommandInterface;

import java.io.IOException;

public class ConsoleClearWithWait<T> implements CommandInterface<T> {
    @Override
    public void execute(T onObject) {
        System.out.println("Press Enter to continue...");
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
