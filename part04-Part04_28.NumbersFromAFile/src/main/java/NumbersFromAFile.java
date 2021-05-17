
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try (Scanner filescanner = new Scanner(Paths.get(file))) {
            while (filescanner.hasNextLine()) {
                int row = Integer.valueOf(filescanner.nextLine());
                if (row >= lowerBound && row <= upperBound) {
                    counter++;
                }
            }
            System.out.println("Numbers: " + counter);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
