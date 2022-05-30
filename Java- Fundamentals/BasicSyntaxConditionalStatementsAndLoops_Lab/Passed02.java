package BasicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class Passed02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float grade = Float.parseFloat(sc.nextLine());
        if (grade >= 3.00) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }
    }
}
