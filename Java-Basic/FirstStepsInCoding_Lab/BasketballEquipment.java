import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int basketballPrice = Integer.parseInt(scanner.nextLine());
            double sneakers = basketballPrice * 0.40;
            double sneakersPrice = basketballPrice - sneakers;
            double basketballKit = sneakersPrice * 0.20;
            double basketballKitPrice = sneakersPrice - basketballKit;
            double basketballBall = basketballKitPrice / 4;
            double basketballAccessories = basketballBall / 5;
                System.out.println(basketballPrice + sneakersPrice + basketballKitPrice + basketballBall + basketballAccessories);

    }
}
