package MethodsMoreExercise;

import java.util.Scanner;

public class MultiplicationSign_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        You are given a number num1, num2, and num3. Write a program that finds if num1 * num2 * num3 (the product) is negative, positive, or zero. Try to do this WITHOUT multiplying the 3 numbers.

        int firstNumber = Integer.parseInt(sc.nextLine());
        int secondNumber = Integer.parseInt(sc.nextLine());
        int thirdNumber = Integer.parseInt(sc.nextLine());
        getProductSign(firstNumber, secondNumber, thirdNumber);
    }

    private static void getProductSign(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber == 0 || secondNumber == 0 || thirdNumber == 0) {
            System.out.println("zero");
        } else if (firstNumber > 0 && secondNumber > 0 && thirdNumber > 0 ||
                firstNumber > 0 && secondNumber < 0 && thirdNumber < 0
                || firstNumber < 0 && secondNumber < 0 && thirdNumber > 0
                || firstNumber < 0 && secondNumber > 0 && thirdNumber < 0) {
            System.out.println("positive");
        } else if (firstNumber < 0 || secondNumber < 0 || thirdNumber < 0) {
            System.out.println("negative");
        }
    }
}
