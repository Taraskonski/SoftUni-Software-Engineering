import java.util.Scanner;

public class ConStAdv04CarToGo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();
        double price = 0;


        if (season.equals("Summer") && budget <= 100) {
            System.out.println("Economy class");
            price = budget * 0.35;
            System.out.printf("Cabrio - %.2f", price);

        } if (season.equals("Summer") && budget > 100 && budget <= 500) {
            System.out.println("Compact class");
            price = budget * 0.45;
            System.out.printf("Cabrio - %.2f", price);

        } if (season.equals("Summer") && budget > 500) {
            System.out.println("Luxury class");
            price = budget * 0.90;
            System.out.printf("Jeep - %.2f", price);

        } if (season.equals("Winter") && budget <= 100) {
            System.out.println("Economy class");
            price = budget * 0.65;
            System.out.printf("Jeep - %.2f", price);

        } if (season.equals("Winter") && budget > 100 && budget <= 500) {
            System.out.println("Compact class");
            price = budget * 0.80;
            System.out.printf("Jeep - %.2f", price);

        } if (season.equals("Winter") && budget > 500) {
            System.out.println("Luxury class");
            price = budget * 0.90;
            System.out.printf("Jeep - %.2f", price);
        }
    }
}