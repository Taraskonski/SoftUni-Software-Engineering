package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Zig_ZagArrays_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] first = new String[n];
        String[] second = new String[n];
        for (int i = 1; i <= n; i++) {
            String[] input = sc.nextLine().split(" ");

            if (i % 2 == 0) {
                first[i - 1] = input[0];
                second[i - 1] = input[1];
            } else {
                first[i - 1] = input[1];
                second[i - 1] = input[0];
            }

        }
        System.out.println(String.join(" " + first));
        System.out.println(String.join(" " + second));

    }
}
