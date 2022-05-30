package Arrays_Lab;

import java.util.Scanner;

public class ReverseArrayOfStrings_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] symbols = input.split("\\s+");
        for (int i = symbols.length - 1; i >= 0; i-- ) {
            System.out.print(symbols[i] + " ");
        }
    }
}