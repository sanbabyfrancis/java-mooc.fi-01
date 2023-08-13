
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        int count = 0;
        int win = 0;
        int lose = 0;
        try (Scanner scanFile = new Scanner(Paths.get(file))) {
            while (scanFile.hasNextLine()) {
                String line = scanFile.nextLine();
                if (line.contains(team)) {
                    count++;
                    String[] lineContents = line.split(",");
                    if (lineContents[0].equals(team)) {
                        if (Integer.valueOf(lineContents[2]) >= Integer.valueOf(lineContents[3])) {
                            win++;
                        } else {
                            lose++;
                        }
                    } else if (lineContents[1].equals(team)) {
                        if (Integer.valueOf(lineContents[3]) >= Integer.valueOf(lineContents[2])) {
                            win++;
                        } else {
                            lose++;
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Games: " + count);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + lose);
    }

}
