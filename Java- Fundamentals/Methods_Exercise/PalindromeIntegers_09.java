package Methods_Exercise;

import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        while (!input.equals("END")) {
            if (!palindrome(input)) {
                System.out.println("false");
            } else {
                System.out.println("true");
            }
            input = sc.nextLine();
        }
    }

    private static boolean palindrome(String input) {
        String newInput = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            newInput += input.charAt(i);
        }
        return input.equals(newInput);
    }
}
