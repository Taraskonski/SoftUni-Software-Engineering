package DataTypesAndVariables_MoreExercise;

import java.util.Scanner;

public class FromLeftToTheRight_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            String input = sc.nextLine();
            String[] numbers = input.split(" ");
            double firstNum = Double.parseDouble(numbers[0]);
            double secondNum = Double.parseDouble(numbers[1]);
            if (firstNum > secondNum) {
                double num1 = Math.abs(firstNum);
                while (num1 > 0) {
                    sum += (num1 % 10);
                    num1 /= 10;
                }
            } else {
                double num2 = Math.abs(secondNum);
                while (num2 > 0) {
                    sum += (num2 % 10);
                    num2 /= 10;
                }
            }
            System.out.println(Math.abs(sum));
            sum = 0;
        }
    }
}