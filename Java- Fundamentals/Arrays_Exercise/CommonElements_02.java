package Arrays_Exercise;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] arr1 = new String[n];
        String[] arr2 = new String[n];

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split("\\s+");
            if (i % 2 != 0) {
               arr1[i] = input[0];
               arr2[i] = input[1];
            } else {
                arr1[i] = input[1];
                arr2[i] = input[0];
            }
        }
        System.out.println(String.join(" ", arr2));
        System.out.println(String.join(" ", arr1));
    }
}
