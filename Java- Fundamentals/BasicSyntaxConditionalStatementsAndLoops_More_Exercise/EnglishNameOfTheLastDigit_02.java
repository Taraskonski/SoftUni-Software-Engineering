package BasicSyntaxConditionalStatementsAndLoops_More_Exercise;

import java.util.Scanner;

public class EnglishNameOfTheLastDigit_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
        int lastDigit = num % 10;

        if (lastDigit == 0) {
            System.out.println("zero");
        } else if (lastDigit == 1) {
            System.out.println("one");
        } else if (lastDigit == 2) {
            System.out.println("two");
        } else if (lastDigit == 3) {
            System.out.println("three");
        } else if (lastDigit == 4) {
            System.out.println("four");
        } else if (lastDigit == 5) {
            System.out.println("five");
        } else if (lastDigit == 6) {
            System.out.println("six");
        } else if (lastDigit == 7) {
            System.out.println("seven");
        } else if (lastDigit == 8) {
            System.out.println("eight");
        } else {
            System.out.println("nine");
        }
    }
}
