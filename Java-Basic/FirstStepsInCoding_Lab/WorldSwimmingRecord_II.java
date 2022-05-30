import java.util.Scanner;

public class WorldSwimmingRecord_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double recordPerSeconds = Double.parseDouble(sc.nextLine());
        double distanceMeters = Double.parseDouble(sc.nextLine());
        double timeForOneMeter = Double.parseDouble(sc.nextLine());

        double fullTimeForDistance = distanceMeters * timeForOneMeter;
        double resistanceOfWater = Math.floor(distanceMeters / 15) * 12.5;
        double fullTime =fullTimeForDistance + resistanceOfWater;

        if (fullTime < recordPerSeconds) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", fullTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", fullTime - recordPerSeconds);
        }

    }
}
