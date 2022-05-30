package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        String typeOfGroup = sc.nextLine();
        String day = sc.nextLine();
        double price = 0;

        switch (typeOfGroup) {
            case "Students":
                switch (day) {
                    case "Friday":
                        price = count * 8.45;
                        break;
                    case "Saturday":
                        price = count * 9.80;
                        break;
                    case "Sunday":
                        price = count * 10.46;
                        break;
                }
                break;
            case "Business":
                switch (day) {
                    case "Friday":
                        price = count * 10.90;
                        break;
                    case "Saturday":
                        price = count * 15.60;
                        break;
                    case "Sunday":
                        price = count * 16;
                        break;
                }
                break;
            case "Regular":
                switch (day) {
                    case "Friday":
                        price = count * 15;
                        break;
                    case "Saturday":
                        price = count * 20;
                        break;
                    case "Sunday":
                        price = count * 22.50;
                        break;
                }
                break;
        }
        if (typeOfGroup.equals("Students") && count >= 30) {
            price = price * 0.85;
        } else if (typeOfGroup.equals("Business") && count >= 100) {
            price = (price / count) * (count - 10);
        } else if (typeOfGroup.equals("Regular") && count >= 10 && count <= 20) {
            price = price * 0.95;
        }
        System.out.printf("Total price: %.2f", price);
    }
}