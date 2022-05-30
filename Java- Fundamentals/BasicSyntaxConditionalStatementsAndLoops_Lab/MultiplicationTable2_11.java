package BasicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class MultiplicationTable2_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        int y = Integer.parseInt(sc.nextLine());
        if (y > 10) {
            System.out.printf("%d X %d = %d", x, y, x * y);
            return;
        }
        for (int i = y; i <= 10; i++) {

            System.out.printf("%d X %d = %d%n", x, i, x * i);
        }
    }
}
