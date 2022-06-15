package Methods_Lab;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());

        switch (product) {
            case "coffee":
                printCoffeeOrder(quantity);
                break;
            case "water":
                printWaterOrder(quantity);
                break;
            case "coke":
                printCokeOrder(quantity);
                break;
            case "snacks":
                printSnacksOrder(quantity);
                break;
        }

    }

    private static void printCoffeeOrder(int quantity) {
        double result = 1.5 * quantity;
        System.out.printf("%.2f", result);
    }

    private static void printWaterOrder(int quantity) {
        double result = 1.0 * quantity;
        System.out.printf("%.2f", result);
    }

    private static void printCokeOrder(int quantity) {
        double result = 1.4 * quantity;
        System.out.printf("%.2f", result);
    }

    private static void printSnacksOrder(int quantity) {
        double result = 2.0 * quantity;
        System.out.printf("%.2f", result);
    }
}
