import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double chickenMenu = Double.parseDouble(sc.nextLine());
        double fishMenu = Double.parseDouble(sc.nextLine());
        double veganMenu = Double.parseDouble(sc.nextLine());

        double priceChickenMenu = chickenMenu * 10.35;
        double priceFishMenu = fishMenu * 12.40;
        double priceVeganMenu = veganMenu * 8.15;
        double fullPrice = priceChickenMenu + priceFishMenu + priceVeganMenu;
        double dessert = fullPrice * 0.20;
        double total = fullPrice + dessert + 2.50;

        System.out.println(total);

    }
}
