
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        System.out.println("Where from?");
        int finish = Integer.valueOf(scanner.nextLine());
        int start = Integer.valueOf(scanner.nextLine());
        for (int i = start; i <= finish; i++) {
            System.out.println(i);
        }

    }
}
