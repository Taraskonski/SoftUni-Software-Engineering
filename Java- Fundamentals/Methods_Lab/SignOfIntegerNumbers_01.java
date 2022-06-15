package Methods_Lab;

import java.util.Scanner;

public class SignOfIntegerNumbers_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        printSignOfInteger(Integer.parseInt(sc.nextLine()));
    }

    private static void printSignOfInteger(int number) {
        if (number > 0) {
            System.out.println("The number " + number + " is positive.");
        } else if (number < 0) {
            System.out.println("The number " + number + " is negative.");
        } else {
            System.out.println("The number 0 is zero.");
        }
    }
}
