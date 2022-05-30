package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String pass = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            pass = pass + name.charAt(i);
        }
        int tryCount = 1;
        String input = sc.nextLine();
        while (!input.equals(pass) && tryCount++ < 4) {
            System.out.println("Incorrect password. Try again.");
            input = sc.nextLine();
        }
        if (input.equals(pass)) {
            System.out.printf("User %s logged in.", name);
        } else {
            System.out.printf("User %s blocked!", name);
        }
    }
}
