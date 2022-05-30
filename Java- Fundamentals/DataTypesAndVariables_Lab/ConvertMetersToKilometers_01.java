package DataTypesAndVariables_Lab;

import java.util.Scanner;

public class ConvertMetersToKilometers_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = Integer.parseInt(sc.nextLine());
        double km = m / 1000.0;
        System.out.printf("%.2f", km);
    }
}