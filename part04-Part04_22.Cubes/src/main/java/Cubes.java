
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String word = scanner.nextLine();
            if (word.equals("end")) {
                break;
            }
            int number = Integer.valueOf(word);
            int result = number * number * number;
            System.out.println(result);
        }

    }
}
