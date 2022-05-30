package BasicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class TheatrePromotion07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        int price = 0;

        if (day.equals("Weekday") && age >= 0 && age <= 18) {
            price = 12;
            System.out.println(price + "$");
        } else if (day.equals("Weekday") && age > 18 && age <= 64) {
            price = 18;
            System.out.println(price + "$");
        } else if (day.equals("Weekday") && age > 64 && age <= 122) {
            price = 12;
            System.out.println(price + "$");
        } else if (day.equals("Weekend") && age >= 0 && age <= 18) {
            price = 15;
            System.out.println(price + "$");
        } else if (day.equals("Weekend") && age > 18 && age <= 64) {
            price = 20;
            System.out.println(price + "$");
        } else if (day.equals("Weekend") && age > 64 && age <= 122) {
            price = 15;
            System.out.println(price + "$");
        } else if (day.equals("Holiday") && age >= 0 && age <= 18) {
            price = 5;
            System.out.println(price + "$");
        } else if (day.equals("Holiday") && age > 18 && age <= 64) {
            price = 12;
            System.out.println(price + "$");
        } else if (day.equals("Holiday") && age > 64 && age <= 122) {
            price = 10;
            System.out.println(price + "$");
        } else {
            System.out.println("Error!");
        }
    }
}
