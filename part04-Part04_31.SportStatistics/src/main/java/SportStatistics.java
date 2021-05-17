
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String filename = scan.nextLine();
        System.out.println("Team:");
        String teamName = scan.nextLine();
        int gameCounter = 0;
        int wins = 0;
        int losses = 0;
        try (Scanner filescanner = new Scanner(Paths.get(filename))) {
            while (filescanner.hasNextLine()) {
                String[] stringSplit = filescanner.nextLine().split(",");

                if (stringSplit.equals("")) {
                    continue;
                }
                String homeTeam = stringSplit[0];
                String awayTeam = stringSplit[1];
                int homePoints = Integer.valueOf(stringSplit[2]);
                int awayPoints = Integer.valueOf(stringSplit[3]);

                if (teamName.equals(homeTeam.toLowerCase())) {
                    gameCounter++;
                    if (homePoints > awayPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
                if (teamName.equals(awayTeam.toLowerCase())) {
                    gameCounter++;
                    if (awayPoints > homePoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
            System.out.println("Games: " + gameCounter);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
