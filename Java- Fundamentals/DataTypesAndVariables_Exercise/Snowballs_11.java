package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        double snowballValue = Double.MIN_VALUE;
        int quality = 0;
        int snow = 0;
        int time = 0;
        for (int i = 1; i <= n; i++) {
            int snowballSnow = Integer.parseInt(sc.nextLine());
            int snowballTime = Integer.parseInt(sc.nextLine());
            int snowballQuality = Integer.parseInt(sc.nextLine());
            double value = Math.pow((snowballSnow / snowballTime), snowballQuality);

            if (value > snowballValue) {
                snowballValue = value;
                quality = snowballQuality;
                snow = snowballSnow;
                time = snowballTime;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snow, time, snowballValue, quality);
    }
}
