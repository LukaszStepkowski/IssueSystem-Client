package sda.issuesystem.client.menu.command;

@FunctionalInterface
public interface CommandInterface <T> {
    void userChoice(T t);
}
