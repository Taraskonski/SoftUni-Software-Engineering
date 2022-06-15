package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AverageAnnualTurnover_9_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] turnoverArr = Arrays.stream(sc.nextLine().split(","))
                .mapToDouble(Double::parseDouble).toArray();

        double average = 0;
        for (int i = 0; i < turnoverArr.length; i++) {
            average += turnoverArr[i];

        }
        average /= turnoverArr.length;
        System.out.printf("The average annual turnover is: %.3f$", average);
    }
}
