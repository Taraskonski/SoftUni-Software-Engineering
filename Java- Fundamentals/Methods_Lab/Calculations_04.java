package Methods_Lab;

import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String action = sc.nextLine();
        int firstNumber = Integer.parseInt(sc.nextLine());
        int secondNumber = Integer.parseInt(sc.nextLine());


        switch (action) {
            case "add":
                addCommand(firstNumber, secondNumber);
                break;
            case "multiply":
                multiplyCommand(firstNumber, secondNumber);
                break;
            case "subtract":
                subtractCommand(firstNumber, secondNumber);
                break;
            case "divide":
                divideCommand(firstNumber, secondNumber);
                break;
        }
    }

    private static void addCommand(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        System.out.println(result);
    }

    private static void multiplyCommand(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        System.out.println(result);
    }

    private static void subtractCommand(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        System.out.println(result);
    }

    private static void divideCommand(int firstNumber, int secondNumber) {
        int result = firstNumber / secondNumber;
        System.out.println(result);
    }
}
