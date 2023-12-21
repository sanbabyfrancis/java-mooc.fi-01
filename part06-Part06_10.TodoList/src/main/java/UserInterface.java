import java.util.Scanner;

public class UserInterface {
    private TodoList todo;
    private Scanner scanner;

    public UserInterface(TodoList todo, Scanner scanner) {
        this.todo = todo;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            String command = this.scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("add")) {
                System.out.println("To add: ");
                String task = this.scanner.nextLine();
                this.todo.add(task);
            }
            if (command.equals("list")) {
                this.todo.print();
            }
            if (command.equals("remove")) {
                System.out.println("Which one is removed? ");
                int number = Integer.parseInt(this.scanner.nextLine());
                this.todo.remove(number);
            }
        }
    }
}
