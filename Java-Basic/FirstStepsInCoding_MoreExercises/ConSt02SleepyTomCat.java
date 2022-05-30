import java.util.Scanner;

public class ConSt02SleepyTomCat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weekends = Integer.parseInt(sc.nextLine());
        int weekendsPlay = weekends * 127;
        int workingDaysPlay = (365 - weekends) * 63;
        int totalMinutesPlay = weekendsPlay + workingDaysPlay;


        if (totalMinutesPlay <= 30000) {
            int lessPlay = 30000 - totalMinutesPlay;
            System.out.printf("Tom sleeps well %n%d hours and %d minutes less for play", (lessPlay / 60), lessPlay % 60);
        } else if (totalMinutesPlay > 30000) {
            int morePlay = totalMinutesPlay - 30000;
            System.out.printf("Tom will run away %n%d hours and %d minutes more for play",(morePlay / 60), (morePlay % 60));
        }
    }
}

