package DataTypesAndVariables_Lab;

import java.util.Scanner;

public class CharsToString_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char first = sc.nextLine().charAt(0);
        char second = sc.nextLine().charAt(0);
        char third = sc.nextLine().charAt(0);

        System.out.printf("%c%c%c", first, second, third);
    }
}