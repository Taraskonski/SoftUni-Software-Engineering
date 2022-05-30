import java.util.Scanner;

public class ConStAdv05Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();

        double price = 0;

        if (season.equals("Summer") && budget <= 1000) {
            price = budget * 0.65;
            System.out.printf("Alaska - Camp - %.2f", price);
        } if (season.equals("Summer") && budget > 1000 && budget <= 3000) {
            price = budget * 0.80;
            System.out.printf("Alaska - Hut - %.2f", price);
        } if (season.equals("Summer") && budget > 3000) {
            price = budget * 0.90;
            System.out.printf("Alaska - Hotel - %.2f", price);
        } if (season.equals("Winter") && budget <= 1000) {
            price = budget * 0.45;
            System.out.printf("Morocco - Camp - %.2f", price);
        } if (season.equals("Winter") && budget > 1000 && budget <= 3000) {
            price = budget * 0.60;
            System.out.printf("Morocco - Hut - %.2f", price);
        } if (season.equals("Winter") && budget > 3000) {
            price = budget * 0.90;
            System.out.printf("Morocco - Hotel - %.2f", price);
        }
    }
}