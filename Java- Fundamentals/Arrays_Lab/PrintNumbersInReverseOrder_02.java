package Arrays_Lab;

import java.util.Scanner;

public class PrintNumbersInReverseOrder_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(sc.nextLine());
            num[i] = number;
        }
        for (int k = num.length - 1; k >= 0; k--) {
            System.out.print(num[k] + " ");
        }
    }
}