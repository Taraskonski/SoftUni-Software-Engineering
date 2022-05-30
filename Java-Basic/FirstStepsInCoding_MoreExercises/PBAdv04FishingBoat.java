import java.util.Scanner;

public class PBAdv04FishingBoat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();
        double fishman = Double.parseDouble(sc.nextLine());
        double money = 0;
        double diff = 0;

        switch (season) {
            case "Spring":
                money = 3000;
                break;
            case "Summer":
                money = 4200;
                break;
            case "Autumn":
                money = 4200;
                break;
            case "Winter":
                money = 2600;
        }
        if (fishman <= 6) {
            diff = money * 0.90;
        } else if (fishman >= 7 && fishman <= 11) {
            diff = money * 0.85;
        } else if (fishman >= 12) {
            diff = money * 0.75;
        }
        if (fishman % 2 == 0 && !(season.equals("Autumn"))) {
            diff = diff * 0.95;
        }
        double finalResult = budget - diff;
        if (finalResult >= 0) {
            System.out.printf("Yes! You have %.2f leva left.", finalResult);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", -finalResult);
        }
    }
}