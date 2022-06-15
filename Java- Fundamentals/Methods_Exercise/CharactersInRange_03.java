package Methods_Exercise;

import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char firstChar = sc.nextLine().charAt(0);
        char secondChar = sc.nextLine().charAt(0);
        getRangeOfCharacters(firstChar, secondChar);
    }

    private static void getRangeOfCharacters(char firstChar, char secondChar) {
        int firstCharValue = firstChar;
        int secondCharValue = secondChar;
        if (firstCharValue > secondCharValue) {
            for (int i = secondCharValue + 1; i < firstCharValue; i++) {
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = firstCharValue + 1; i < secondCharValue; i++) {
                System.out.print((char) i + " ");
            }
            return;
        }
    }
}
