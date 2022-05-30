package BasicSyntaxConditionalStatementsAndLoops_More_Exercise;

import java.util.Scanner;

public class GamingStore_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        double currentBalance = budget;
        double spend = 0;
        double price;
        String input = sc.nextLine();

        while (!input.equals("Game Time")) {
            price = 0;

            switch (input) {
                case "OutFall 4":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                default:
                    System.out.println("Not Found");
                    input = sc.nextLine();
                    break;
            }
            if (budget >= price && price > 0) {
                spend += price;
                budget -= price;
                System.out.printf("Bought %s%n", input);
                input = sc.nextLine();
            } else if (budget < price && price > 0) {
                System.out.println("Too Expensive");
                input = sc.nextLine();
            }
        }
        if (budget == 0) {
            System.out.println("Out of money!");
            return;
        }
        if (budget > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spend, (currentBalance - spend));
        }
    }
}

