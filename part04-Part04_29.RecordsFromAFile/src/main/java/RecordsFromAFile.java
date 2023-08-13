
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        try (Scanner scannerFile = new Scanner(Paths.get(file))) {
            while (scannerFile.hasNextLine()) {
                String line = scannerFile.nextLine();
                String[] arr = line.split(",");
                System.out.print(arr[0] + ", age: " + arr[1]);
                if (arr[1].equals("1")) {
                    System.out.println(" year");
                } else {
                    System.out.println(" years");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
