package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            String letter = sc.nextLine();
            int ascii = letter.charAt(0);
            sum = sum + ascii;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}