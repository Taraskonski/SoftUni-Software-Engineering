package BasicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class MultiplicationTable10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d%n", x, i, x * i);
        }
    }
}
