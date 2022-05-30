import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int dogFoodPieces = Integer.parseInt(scanner.nextLine());
            int catFoodPieces = Integer.parseInt(scanner.nextLine());
            float dogFoodPrice = 2.50f;
            float catFoodPrice = 4.00f;
            float total = (dogFoodPrice * dogFoodPieces) + (catFoodPrice * catFoodPieces);
                System.out.println(total + " lv.");
    }
}
