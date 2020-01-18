package sda.issuesystem.client;

import sda.issuesystem.client.menu.MainMenuParams;

import java.util.Arrays;
import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {

        for (int i = 0; i < MainMenuParams.values().length; i++) {
            System.out.println(MainMenuParams.values()[i].getCommandNumber() + ". " + MainMenuParams.values()[i].getCommandDescription());
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int choice = scanner.nextInt();
            Arrays.stream(MainMenuParams.values())
                    .filter(p -> p.getCommandNumber() == choice)
                    .forEach(p -> System.out.println(p.getCommandDescription()));
        }
    }
}
