
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {

        Container first = new Container();
        Container second = new Container();

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("> ");

            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else {
                String[] parts = input.split(" ");
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);

                if (amount > 0) {
                    if (command.equals("add")) {
                        first.add(amount);
                    } else if (command.equals("move")) {
                        if (first.contains() < amount) {
                            second.add(first.contains());
                            first.remove(amount);
                        } else {
                            first.remove(amount);
                            second.add(amount);
                        }
                    } else if (command.equals("remove")) {
                        second.remove(amount);
                    }
                }
            }
        }
    }
}
