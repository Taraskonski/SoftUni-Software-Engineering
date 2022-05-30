import java.util.Scanner;

public class PB04VegetableMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double priceVegetables = Double.parseDouble(sc.nextLine());
        double priceFruits = Double.parseDouble(sc.nextLine());
        double totalKgVegetables = Double.parseDouble(sc.nextLine());
        double totalKgFruits = Double.parseDouble(sc.nextLine());

        double totalPriceVegetables = priceVegetables * totalKgVegetables;
        double totalPriceFruits = priceFruits * totalKgFruits;
        double totalPrice = (totalPriceVegetables + totalPriceFruits) / 1.94;

        System.out.printf("%.2f", totalPrice);
    }
}
