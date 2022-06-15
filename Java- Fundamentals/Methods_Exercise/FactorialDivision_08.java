package Methods_Exercise;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = Integer.parseInt(sc.nextLine());
        int second = Integer.parseInt(sc.nextLine());

        System.out.printf("%.2f", calculateFactorialOfFirst(first) / calculateFactorialOfSecond(second));

    }
    private static double calculateFactorialOfFirst(int first) {
        double result = 1;
        for (int i = 1; i <= first ; i++) {
            result = result * i;
        }
        return result;
    }
    private static double calculateFactorialOfSecond(int second) {
        double result = 1;
        for (int i = 1; i <=second ; i++) {
            result = result * i;
        }
        return result;
    }
}
