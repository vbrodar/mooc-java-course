
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String text = scanner.nextLine();
            String[] parts = text.split(" ");

            for (String part : parts) {
                if (part.contains("av")) {
                    System.out.println(part);
                }
            }
            if (text.equals("")) {
                break;
            }
        }

    }
}
