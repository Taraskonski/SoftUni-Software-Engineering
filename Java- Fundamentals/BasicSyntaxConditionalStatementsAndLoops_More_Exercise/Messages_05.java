package BasicSyntaxConditionalStatementsAndLoops_More_Exercise;

import java.util.Scanner;

public class Messages_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int clicks = Integer.parseInt(sc.nextLine());
        String message = "";

        for (int i = 0; i < clicks; i++) {
            String digits = sc.nextLine();
            int lengthDigits = digits.length();
            char digit = digits.charAt(0);
            int mainDigit = Character.getNumericValue(digit);
            int offset = (mainDigit - 2) * 3;

            if (mainDigit == 8 || mainDigit == 9) {
                offset++;
            }
            int index = offset + lengthDigits - 1;
            int ascii = index + 97;
            char letter = (char) ascii;

            if (mainDigit == 0) {
                letter = (char) (mainDigit + 32);
            }
            message += letter;
        }
        System.out.println(message);
    }
}