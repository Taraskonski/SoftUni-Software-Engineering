package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        int num = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == num) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
