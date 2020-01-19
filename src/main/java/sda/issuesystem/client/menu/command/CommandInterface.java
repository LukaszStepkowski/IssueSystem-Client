package sda.issuesystem.client.menu.command;

@FunctionalInterface
public interface CommandInterface <T> {
    void execute(T onObject);
}
