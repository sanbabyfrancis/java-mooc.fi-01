
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largestAge = 0;
        while (true) {
            String string = scanner.nextLine();
            if (string.equals("")) {
                break;
            }
            String[] row = string.split(",");
            if (largestAge < Integer.valueOf(row[1])) {
                largestAge = Integer.valueOf(row[1]);
            }
        }
        System.out.println("Age of the oldest: " + largestAge);
    }
}
