
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largestAge = 0;
        String nameWithLargestAge = "";
        while (true) {
            String string = scanner.nextLine();
            if (string.equals("")) {
                break;
            }
            String[] row = string.split(",");
            if (largestAge < Integer.valueOf(row[1])) {
                largestAge = Integer.valueOf(row[1]);
                nameWithLargestAge = row[0];
            }
        }
        System.out.println("Name of the oldest: " + nameWithLargestAge);
    }
}
