package DataTypesAndVariables_Lab;

import java.util.Scanner;

public class LowerOrUpper_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("lower-case");
        } else {
            System.out.println("upper-case");
        }
    }
}
