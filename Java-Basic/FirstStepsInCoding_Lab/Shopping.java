import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int memory = Integer.parseInt(scanner.nextLine());

        int priceVideoCards = videoCards * 250;
        double priceProcessors = processors * (priceVideoCards * 0.35);
        double priceMemory = memory * (priceVideoCards * 0.10);
        double totalSum = priceVideoCards + priceProcessors + priceMemory;

        if (videoCards > processors) {
            totalSum = totalSum - (totalSum * 0.15);

        }
        if (totalSum < budget) {
            double moneyLeft = budget - totalSum;
            System.out.printf("You have %.2f leva left!", moneyLeft);

        }
        if (totalSum > budget) {
            double moneyNeed = totalSum - budget;
            System.out.printf("Not enough money! You need %.2f leva more!", moneyNeed);
        }
    }
}
