package sda.issuesystem.client.command;

import sda.issuesystem.client.menu.command.CommandInterface;

import java.io.IOException;
import java.util.Scanner;

public class ConsoleClearWithWait<T> implements CommandInterface<T> {

    Scanner scanner = new Scanner(System.in);
    
    private static final ConsoleClearWithWait INSTANCE = new ConsoleClearWithWait();

    public static ConsoleClearWithWait getInstance() {
        return INSTANCE;
    }

    @Override
    public void execute(T onObject) {
        System.out.println("Press Enter to continue...");

        scanner.next();

        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
