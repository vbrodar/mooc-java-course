
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String text = scanner.nextLine();
            String[] pieces = text.split(" ");

            for (String e : pieces) {
                System.out.println(e);
            }
            if (text.equals("")) {
                break;
            }
        }

    }
}
