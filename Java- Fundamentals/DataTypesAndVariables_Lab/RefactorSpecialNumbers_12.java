package DataTypesAndVariables_Lab;

import java.util.Scanner;

public class RefactorSpecialNumbers_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        boolean isSpecialNum = false;
        for (int num = 1; num <= n; num++) {
            int digits = num;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if (isSpecialNum = (sum == 5 || sum == 7 || sum == 11)){
                System.out.printf("%d -> True%n", digits);
                sum = 0;
                num = digits;
            } else {
                System.out.printf("%d -> False%n", digits);
                sum = 0;
                num = digits;
            }
        }
    }
}
