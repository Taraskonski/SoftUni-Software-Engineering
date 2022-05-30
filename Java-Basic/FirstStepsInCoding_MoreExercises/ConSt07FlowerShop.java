import java.util.Scanner;

public class ConSt07FlowerShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double magnolia = Double.parseDouble(sc.nextLine());
        double hyacinth = Double.parseDouble(sc.nextLine());
        double rose = Double.parseDouble(sc.nextLine());
        double cactus = Double.parseDouble(sc.nextLine());
        double giftPrice = Double.parseDouble(sc.nextLine());

        double priceMagnolia = magnolia * 3.25;
        double priceHyacinth = hyacinth * 4.00;
        double priceRose = rose * 3.50;
        double cactusPrice = cactus * 8.00;
        double realProfit = (priceMagnolia + priceHyacinth + priceRose + cactusPrice) * 0.95;
        double moneyLeft = 0;
        double moneyNeed = 0;

        if (realProfit >= giftPrice) {
            moneyLeft = realProfit - giftPrice;
            System.out.printf("She is left with %.0f leva.", Math.floor(moneyLeft));
        } else {
            moneyNeed = giftPrice - realProfit;
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(moneyNeed));
        }
    }
}
