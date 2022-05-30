package DataTypesAndVariables_MoreExercise;

import java.util.Scanner;

public class BalancedBrackets_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int openBracketCount = 0;
        int closeBracketCount = 0;
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();

            if (input.equals("(")) {
                openBracketCount++;
            } else if (input.equals(")")) {
                closeBracketCount++;
            }
            if (closeBracketCount > openBracketCount) {
                System.out.println("UNBALANCED");
                return;
            }
        }
        if (openBracketCount == closeBracketCount) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
