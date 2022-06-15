package Methods_Lab;

import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Math.abs(Integer.parseInt(sc.nextLine()));

        int multiply = getMultipleOfEvensAndOdds(number);
        System.out.println(multiply);

    }

    private static int getMultipleOfEvensAndOdds(int number) {
        int evenSum = getSumOfEvenDigits(number);
        int oddSum = getSumOfOddDigits(number);

        return evenSum * oddSum;
    }

    private static int getSumOfEvenDigits(int number) {
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number = number / 10;
        }
        return sum;

    }

    private static int getSumOfOddDigits(int number) {
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            number = number / 10;
        }
        return sum;

    }
}
