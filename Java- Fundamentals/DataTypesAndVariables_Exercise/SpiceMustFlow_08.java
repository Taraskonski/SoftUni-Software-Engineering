package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class SpiceMustFlow_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startingYield = Integer.parseInt(sc.nextLine());
        int days = 0;
        int totalAmount = 0;
        if (startingYield < 100) {
            System.out.println(days);
            System.out.println(totalAmount);
        } else {
            while (startingYield >= 100) {
                int yieldPerDay = startingYield;
                yieldPerDay = yieldPerDay - 26;
                totalAmount += yieldPerDay;
                days++;
                startingYield -= 10;
            }
            System.out.println(days);
            System.out.println(totalAmount - 26);
        }
    }
}
