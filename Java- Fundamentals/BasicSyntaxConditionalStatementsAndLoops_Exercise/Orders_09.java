package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double sumPerOrder = 0;
        double sumTotal = 0;

        for (int i = 1; i <= n; i++) {
            double priceCapsule = Double.parseDouble(sc.nextLine());
            int days = Integer.parseInt(sc.nextLine());
            int capsulesCount = Integer.parseInt(sc.nextLine());
            sumPerOrder = ((days * capsulesCount) * priceCapsule);
            sumTotal = sumTotal + sumPerOrder;
            System.out.printf("The price for the coffee is: $%.2f%n", sumPerOrder);
            sumPerOrder = 0;
        }
        System.out.printf("Total: $%.2f", sumTotal);
    }
}