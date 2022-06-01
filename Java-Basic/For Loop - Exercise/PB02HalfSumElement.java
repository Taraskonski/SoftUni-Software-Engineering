import java.util.Scanner;

public class PB02HalfSumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            int number = Integer.parseInt(sc.nextLine());
            sum = sum + number;
            if (number > max) {
                max = number;
            }

        }
        int sumWithOutMax = sum - max;
        if (sumWithOutMax == max) {
            System.out.println("Yes");
            System.out.println("Sum = " + max);
        } else {
            int diff = Math.abs(max - sumWithOutMax);
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }
    }
}
