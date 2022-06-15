package Methods_Exercise;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        getTheMiddleCharacters(input);
    }

    private static void getTheMiddleCharacters(String input) {

        if (input.length() % 2 == 1) {
            int middleOddSymbol = input.length() / 2;
            System.out.println(input.charAt(middleOddSymbol));
        } else {
            int middleFirstSymbol = input.length() / 2 - 1;
            int middleSecondSymbol = input.length() / 2;

            System.out.println("" + input.charAt(middleFirstSymbol) + input.charAt(middleSecondSymbol));
        }
    }
}
