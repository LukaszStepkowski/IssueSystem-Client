package sda.issuesystem.client;

import sda.issuesystem.client.menu.DefaultMenu;
import sda.issuesystem.menu.params.MainMenuParams;

import java.util.Arrays;
import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {

        DefaultMenu.getInstance().printMenu();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int choice = scanner.nextInt();
            Arrays.stream(MainMenuParams.values())
                    .filter(p -> p.getCommandNumber() == choice)
                    .forEach(p -> System.out.println(p.getCommandDescription()));
        }
    }
}
