package BasicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class ForeignLanguages06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String country = sc.nextLine();
        if (country.equals("USA") || country.equals("England")) {
            System.out.println("English");
        } else if (country.equals("Spain") || country.equals("Argentina") || country.equals("Mexico")) {
            System.out.println("Spanish");
        } else {
            System.out.println("unknown");
        }
    }
}
