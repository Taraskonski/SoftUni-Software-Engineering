import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int chickenMenuCount = Integer.parseInt(scanner.nextLine());
            int fishMenuCount = Integer.parseInt(scanner.nextLine());
            int veganMenuCount = Integer.parseInt(scanner.nextLine());
                float chickenPrice = 10.35f;
                float fishPrice = 12.40f;
                float veganPrice = 8.15f;
                float deliveryPrice = 2.50f;
                    float totalChickenPrice = chickenMenuCount * chickenPrice;
                    float totalFishPrice = fishMenuCount * fishPrice;
                    float totalVeganPrice = veganMenuCount * veganPrice;
                    float totalMenuPrice = totalChickenPrice + totalFishPrice + totalVeganPrice;
                    double dessertPrice = totalMenuPrice * 0.20;
                    System.out.println(totalMenuPrice + dessertPrice + deliveryPrice);


    }
}
