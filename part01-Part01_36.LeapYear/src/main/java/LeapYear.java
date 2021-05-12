
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int leapYear = Integer.valueOf(scan.nextLine());
        if ((leapYear % 4 == 0) && (leapYear % 100 != 0) || (leapYear % 400 == 0)) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }

    }
}
