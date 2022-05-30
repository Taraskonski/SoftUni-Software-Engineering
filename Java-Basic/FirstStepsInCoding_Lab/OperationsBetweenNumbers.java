import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1 = Double.parseDouble(scanner.nextLine());
        double n2 = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double result;

        if (operator.equals("+")) {
            result = n1 + n2;
            if (result % 2 == 0) {
                System.out.printf("%.0f + %.0f = %.0f - even", n1, n2, result);
            } else if (result % 2 != 0) {
                System.out.printf("%.0f + %.0f = %.0f - odd", n1, n2, result);
            }
        } else if (operator.equals("-")) {
            result = n1 - n2;
            if (result % 2 == 0) {
                System.out.printf("%.0f - %.0f = %.0f - even", n1, n2, result);
            } else if (result % 2 != 0) {
                System.out.printf("%.0f - %.0f = %.0f - odd", n1, n2, result);
            }
        } else if (operator.equals("*")) {
            result = n1 * n2;
            if (result % 2 == 0) {
                System.out.printf("%.0f * %.0f = %.0f - even", n1, n2, result);
            } else if (result % 2 != 0) {
                System.out.printf("%.0f * %.0f = %.0f - odd", n1, n2, result);
            }
        } else if (operator.equals("/")) {
            result = n1 / n2;
            if (n2 != 0) {
                System.out.printf("%.0f / %.0f = %.2f", n1, n2, result);
            } else if (n2 == 0) {
                System.out.printf("Cannot divide %.0f by zero", n1);
            }
        } else if (operator.equals("%")) {
            result = n1 % n2;
            if (n2 != 0) {
                System.out.printf("%.0f ", n1);
                System.out.print("%");
                System.out.printf(" %.0f", n2);
                System.out.print(" = ");
                System.out.printf("%.0f", result);
            } else if (n2 == 0) {
                System.out.printf("Cannot divide %.0f by zero", n1);
            }
        }
    }
}