package Arrays_Exercise;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] input = new int[n] ;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int people = Integer.parseInt(sc.nextLine());
            input[i] = people;
            sum += people;
            System.out.print(input[i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
