package DataTypesAndVariables_MoreExercise;

import java.util.Scanner;

public class FloatingEquality_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        double compare = Math.abs(a - b);
        double delta = 0.000001;

        if (compare > delta) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}
