package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class WaterOverflow_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int liters = Integer.parseInt(sc.nextLine());
            sum += liters;
            if (sum > 255){
                System.out.println("Insufficient capacity!");
                sum -= liters;
            }
        }
        System.out.printf("%d", sum);
    }
}