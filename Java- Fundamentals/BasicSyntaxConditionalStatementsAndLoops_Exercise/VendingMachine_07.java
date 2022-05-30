package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";

        double sum = 0;
        while (!input.equals("Start")) {
            input = sc.nextLine();
            if (input.equals("Start")) {
                break;
            }
            double coins = Double.parseDouble(input);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                sum += coins;
            } else {
                System.out.println("Cannot accept " + coins);
            }
        }
        double price = 0;
        String product = "";
        boolean flag = false;
        while (true) {
            product = sc.nextLine();
            switch (product.toLowerCase()) {
                case "nuts":
                    price = 2;
                    flag = true;
                    break;
                case "water":
                    price = 0.7;
                    flag = true;
                    break;
                case "crisps":
                    price = 1.5;
                    flag = true;
                    break;
                case "soda":
                    price = 0.8;
                    flag = true;
                    break;
                case "coke":
                    price = 1;
                    flag = true;
                    break;
            }
            if (product.equals("End")) {
                break;
            }
            if (sum < price) {
                System.out.println("Sorry, not enough money");
            } else if (flag) {
                System.out.println("Purchased " + product);
                sum -= price;
            } else {
                System.out.println("Invalid product");
            }
        }
        System.out.printf("Change: %.2f", sum);
    }
}