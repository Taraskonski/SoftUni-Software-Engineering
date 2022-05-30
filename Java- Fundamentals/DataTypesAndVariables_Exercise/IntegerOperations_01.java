package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class IntegerOperations_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = Integer.parseInt(sc.nextLine());
        int second = Integer.parseInt(sc.nextLine());
        int third = Integer.parseInt(sc.nextLine());
        int fourth = Integer.parseInt(sc.nextLine());

        int sum = first + second;
        int divide = sum / third;
        int multiply = divide * fourth;

        System.out.println(multiply);
    }
}