
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int average = 0;
        int sum = 0;
        int nameCounter;
        int count = 0;
        int helperLength = 0;
        String longestName = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            sum += Integer.valueOf(parts[1]);
            count++;
            nameCounter = parts[0].length();
            if (helperLength < nameCounter) {
                helperLength = nameCounter;
                longestName = parts[0];

            }
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + 1.0 * sum / count);
    }
}
