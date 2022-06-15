package MethodsMoreExercise;

import java.util.Scanner;

public class TribonacciSequence_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        getTribonacciNumbers(num);


    }

    private static void getTribonacciNumbers(int num) {

        int a = 1, b = 1, c = 2;
        int d = a + b + c;
        if (num == 1) {
            System.out.printf("%d", a);
            return;
        } else if (num == 2) {
            System.out.printf("%d %d", a, b);
            return;
        }
        System.out.print(a + " " + b + " " + c);

        for (int i = 4; i <= num; i++) {
            System.out.print(" " + d);
            a = b;
            b = c;
            c = d;
            d = a + b + c;
        }
        System.out.println();
    }
}
