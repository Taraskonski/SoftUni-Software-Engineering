package Methods_Lab;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());

        System.out.println(repeatString(input, n));


    }

    private static String repeatString(String string, int count) {
        String result = "";

        for (int i = 0; i < count; i++) {
            result += string;
        }
        return result;
    }
}
