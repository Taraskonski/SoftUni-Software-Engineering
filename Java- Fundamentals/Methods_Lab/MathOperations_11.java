package Methods_Lab;

import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double firstNumber = Double.parseDouble(sc.nextLine());
        String operator = sc.nextLine();
        double secondNumber = Double.parseDouble(sc.nextLine());

        System.out.printf("%.0f", calculate(firstNumber, operator, secondNumber));

    }

    private static double calculate(double firstNumber, String operator, double secondNumber) {
        double result = 0.0;

        switch (operator) {
            case "/":
                result = firstNumber / secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
        }
        return result;
    }
}
