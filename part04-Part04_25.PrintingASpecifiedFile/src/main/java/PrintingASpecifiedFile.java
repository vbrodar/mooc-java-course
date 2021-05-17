
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its content printed?");
        String filename = scanner.nextLine();
        try (Scanner filescanner = new Scanner(Paths.get(filename))) {
            while (filescanner.hasNextLine()) {
                String row = filescanner.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
