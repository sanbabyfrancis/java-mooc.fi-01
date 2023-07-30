
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sumOfBirthYears = 0;
        String longestName = "";
        while (true) {
            String string = scanner.nextLine();
            if (string.equals("")) {
                break;
            }
            String[] words = string.split(",");
            if (longestName.length() < words[0].length()) {
                longestName = words[0];
            }
            sumOfBirthYears = sumOfBirthYears + Integer.valueOf(words[1]);
            count++;
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (double) sumOfBirthYears / count);
    }
}
