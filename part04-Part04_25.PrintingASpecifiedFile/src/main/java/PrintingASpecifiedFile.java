
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scannerStdIn = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String fileName = scannerStdIn.nextLine();
        try (Scanner scannerFile = new Scanner(Paths.get(fileName))) {
            while (true) {
                if (!scannerFile.hasNextLine()) {
                    break;
                }
                System.out.println(scannerFile.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
