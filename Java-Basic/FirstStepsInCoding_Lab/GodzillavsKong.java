import java.util.Scanner;

public class GodzillavsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        double clothing = Double.parseDouble(scanner.nextLine());
        double clothingPrice = workers * clothing;
        double decorPrice = budget * 0.10;
        double totalClPrice = 0;
        double totalPrice = 0;
        double balance = 0;

        if (workers > 150) {
            totalClPrice = clothingPrice - clothingPrice * 0.10;
            totalPrice = totalClPrice + decorPrice;

        }
        if (workers <= 150) {
            totalClPrice = clothingPrice;
            totalPrice = totalClPrice + decorPrice;

        }
        if (balance + totalPrice <= budget) {
            balance = budget - totalPrice;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", balance);
        }
        if (balance + totalPrice > budget) {
            balance = totalPrice - budget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", balance);
        }
    }
}

