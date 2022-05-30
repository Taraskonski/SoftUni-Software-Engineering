import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tourPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int puppets = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int truks = Integer.parseInt(scanner.nextLine());
        double totalPieces = puzzles + puppets + bears + minions + truks;
        double sum = (puzzles * 2.60) + (puppets * 3.00) + (bears * 4.10) + (minions * 8.20) + (truks * 2.00);
        double totalSum = 0;
        double discount = 0;

        if (totalPieces >= 50) {
            discount =sum - sum * 0.25;
            totalSum = discount - discount * 0.10;
        }
        if (totalPieces < 50) {
            totalSum = sum - sum * 0.10;
        }
        if (totalSum > tourPrice) {
            totalSum = totalSum - tourPrice;
            System.out.printf("Yes! %.2f lv left.", totalSum);
        } else {
            totalSum = tourPrice - totalSum;
            System.out.printf("Not enough money! %.2f lv needed.", totalSum);
        }
    }
}
