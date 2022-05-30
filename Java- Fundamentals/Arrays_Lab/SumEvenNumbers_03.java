package Arrays_Lab;

import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] numbersAsString = input.split("\\s+");
        int evenSum = 0;
        for (int i = 0; i < numbersAsString.length; i++) {
            if (Integer.parseInt(numbersAsString[i]) % 2 == 0) {
                evenSum += Integer.parseInt(numbersAsString[i]);
            }
        }
        System.out.println(evenSum);
    }
}
