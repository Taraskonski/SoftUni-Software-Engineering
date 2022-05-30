import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < n; i++) {
            int element = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                sumEven += element;
            }
            if (i % 2 != 0) {
                sumOdd += element;
            }
        }
        int diff = Math.abs(sumEven - sumOdd);
        if (sumEven == sumOdd) {
            System.out.println("Yes");
            System.out.println("Sum = " + sumEven);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }
    }
}
