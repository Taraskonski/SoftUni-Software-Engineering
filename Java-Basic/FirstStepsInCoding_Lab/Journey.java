import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        if (season.equals("summer")) {
            if (budget <= 100) {
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Camp - %.2f", (budget * 0.30));
            } else if (budget > 100 && budget <= 1000) {
                System.out.println("Somewhere in Balkans");
                System.out.printf("Camp - %.2f", (budget * 0.40));
            } else if (budget > 1000) {
                System.out.println("Somewhere in Europe");
                System.out.printf("Hotel - %.2f", (budget * 0.90));
            }
        } else if (season.equals("winter")) {
            if (budget <= 100) {
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Hotel - %.2f", (budget * 0.70));
            } else if (budget > 100 && budget <=1000) {
                System.out.println("Somewhere in Balkans");
                System.out.printf("Hotel - %.2f", (budget * 0.80));
            } else if (budget > 1000) {
                System.out.println("Somewhere in Europe");
                System.out.printf("Hotel - %.2f", (budget * 0.90));
            }
        }
    }
}