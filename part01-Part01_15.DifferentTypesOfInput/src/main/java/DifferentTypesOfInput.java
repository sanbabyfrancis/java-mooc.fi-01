
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String stringValue = scanner.nextLine();
        System.out.println("Give an integer:");
        int intValue = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double doublevalue = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean booleanValue = Boolean.valueOf(scanner.nextLine());

        System.out.println("You gave the string " + stringValue);
        System.out.println("You gave the integer " + intValue);
        System.out.println("You gave the double " + doublevalue);
        System.out.println("You gave the boolean " + booleanValue);

    }
}
