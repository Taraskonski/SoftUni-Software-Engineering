package DataTypesAndVariables_MoreExercise;

import java.util.Scanner;

public class DecryptingMessage_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int rows = Integer.parseInt(sc.nextLine());
        int sum = 0;
        String message = "";
        for (int i = 1; i <= rows; i++) {
            String letter = sc.nextLine();
            int ascii = letter.charAt(0);
            sum = n + ascii;
            System.out.print((char) sum);
            sum = 0;
        }
    }
}
