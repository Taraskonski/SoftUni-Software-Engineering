package Methods_Exercise;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int number = 1; number <= n; number++) {

            if (isDivisibleOf8(number) && isNumberIsOdd(number)) {
                System.out.println(number);
            }
        }
    }

    private static boolean isDivisibleOf8(int number) {
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10;

        }
        return sum % 8 == 0;
    }

    private static boolean isNumberIsOdd(int number) {
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 1) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
