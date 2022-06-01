import java.util.Scanner;

public class PB08TennisRanklist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTournaments = Integer.parseInt(sc.nextLine());
        int startPoints = Integer.parseInt(sc.nextLine());

        int pointsCounter = 0;
        int wins = 0;
        for (int i = 1; i <= numberOfTournaments ; i++) {
            String tournamentsStage = sc.nextLine();

            switch (tournamentsStage) {
                case "W":
                    pointsCounter = pointsCounter + 2000;
                    wins++;
                    break;
                case "F":
                    pointsCounter = pointsCounter + 1200;
                    break;
                case "SF":
                    pointsCounter = pointsCounter + 720;
                    break;
            }
        }
        System.out.printf("Final points: %d%n", startPoints + pointsCounter);
        System.out.printf("Average points: %d%n", pointsCounter / numberOfTournaments);
        System.out.printf("%.2f%%", wins * 1.0 / numberOfTournaments * 100);
    }
}