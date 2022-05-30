package BasicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class EvenNumber12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Math.abs(Integer.parseInt(sc.nextLine()));
        boolean flag = x % 2 != 0;
        while (flag) {
            System.out.println("Please write an even number.");
            x = Math.abs(Integer.parseInt(sc.nextLine()));
            flag = x % 2 != 0;
        }
        System.out.println("The number is: " + x);
    }
}