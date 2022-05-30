import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tvSeriesName = scanner.nextLine();
        int tvSeriesDuration = Integer.parseInt(scanner.nextLine());
        double lunchBreakTime = Double.parseDouble(scanner.nextLine());

        double timeForLunch = lunchBreakTime / 8;
        double timeForRest = lunchBreakTime / 4;
        double remainingTime = (lunchBreakTime - timeForLunch - timeForRest);

        if (remainingTime >= tvSeriesDuration) {
            System.out.printf("You have enough time to watch " + tvSeriesName + " and left with %.0f minutes free time.", Math.ceil(remainingTime - tvSeriesDuration));
        }
        if (remainingTime < tvSeriesDuration) {
            System.out.printf("You don't have enough time to watch " + tvSeriesName + ", you need %.0f more minutes.", Math.ceil(tvSeriesDuration - remainingTime));
        }
    }
}
