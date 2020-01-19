package sda.issuesystem.client;

import sda.issuesystem.client.context.ApplicationContext;
import sda.issuesystem.client.menu.DefaultMenu;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {

        ApplicationContext.setMenu(DefaultMenu.getInstance());

        Scanner scanner = new Scanner(System.in);

        while (true) {
            ApplicationContext.getMenu().printMenu();
        }
    }
}
