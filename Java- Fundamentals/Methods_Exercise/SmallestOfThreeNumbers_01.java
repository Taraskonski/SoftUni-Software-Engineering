package Methods_Exercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = Integer.parseInt(sc.nextLine());
        int secondNumber = Integer.parseInt(sc.nextLine());
        int thirdNumber = Integer.parseInt(sc.nextLine());

        System.out.println(getMinNumber(firstNumber, secondNumber, thirdNumber));

    }

    private static int getMinNumber(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
            return firstNumber;
        } else if (secondNumber < firstNumber && secondNumber < thirdNumber) {
            return secondNumber;
        }
        return thirdNumber;
    }
}
