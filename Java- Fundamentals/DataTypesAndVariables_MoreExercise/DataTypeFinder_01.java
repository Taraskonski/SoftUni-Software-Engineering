package DataTypesAndVariables_MoreExercise;

import java.util.Scanner;

public class DataTypeFinder_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String start = sc.nextLine();
        while (!start.equals("END")) {
            Scanner input = new Scanner(start);
            if (input.hasNextInt()) {
                System.out.printf("%s is integer type%n", start);
            } else if (input.hasNextBoolean()) {
                System.out.printf("%s is boolean type%n", start);
            } else if (start.length() == 1) {
                System.out.printf("%s is character type%n", start);
            } else if (input.hasNextDouble()) {
                System.out.printf("%s is floating point type%n", start);
            } else if (input.hasNextLine()) {
                System.out.printf("%s is string type%n", start);
            }
            start = sc.nextLine();
        }
    }
}