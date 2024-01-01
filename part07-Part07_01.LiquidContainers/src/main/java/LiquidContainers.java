
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        int first = 0;
        int second = 0;

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("> ");

            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else {
                String[] parts = input.split(" ");
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);

                if (amount > 0) {
                    if (command.equals("add")) {
                        if (first + amount > 100) {
                            first = 100;
                        } else {
                            first = first + amount;
                        }
                    } else if (command.equals("move")) {
                        if (second + amount > 100) {
                            first = first - amount;
                            second = 100;
                        } else if (first - amount < 0) {
                            second = second + first;
                        } else {
                            first = first - amount;
                            second = second + amount;
                        }
                    } else if (command.equals("remove")) {
                        if (second - amount < 0) {
                            second = 0;
                        } else {
                            second = second - amount;
                        }
                    }
                }
            }
        }
    }

}
