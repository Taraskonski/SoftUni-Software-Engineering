package DataTypesAndVariables_Lab;

import java.util.Scanner;

public class PoundsToDollars_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pounds = Double.parseDouble(sc.nextLine());
        double dollars = pounds * 1.36;

        System.out.printf("%.3f", dollars);
    }
}