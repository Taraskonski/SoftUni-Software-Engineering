import java.util.Scanner;

public class ConStAdv01MatchTickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        String category = sc.nextLine();
        int qtGroup = Integer.parseInt(sc.nextLine());
        double realMoney = 0;
        double diff = 0;

        if (category.equals("Normal") && qtGroup >= 1 && qtGroup <= 4) {
            realMoney = budget * 0.25;
            if (realMoney >= (249.99 * qtGroup)) {
                diff = realMoney - (249.99 * qtGroup);
                System.out.printf("Yes! You have %.2f leva left.", diff);
            } else {
                diff = (249.99 * qtGroup) - realMoney;
                System.out.printf("Not enough money! You need %.2f leva.", diff);
            }
        }
        if (category.equals("Normal") && qtGroup >= 5 && qtGroup <= 9) {
            realMoney = budget * 0.40;
            if (realMoney >= (249.99 * qtGroup)) {
                diff = realMoney - (249.99 * qtGroup);
                System.out.printf("Yes! You have %.2f leva left.", diff);
            } else {
                diff = (249.99 * qtGroup) - realMoney;
                System.out.printf("Not enough money! You need %.2f leva.", diff);
            }
        }
        if (category.equals("Normal") && qtGroup >= 10 && qtGroup <= 24) {
            realMoney = budget * 0.50;
            if (realMoney >= (249.99 * qtGroup)) {
                diff = realMoney - (249.99 * qtGroup);
                System.out.printf("Yes! You have %.2f leva left.", diff);
            } else {
                diff = (249.99 * qtGroup) - realMoney;
                System.out.printf("Not enough money! You need %.2f leva.", diff);
            }
        }
        if (category.equals("Normal") && qtGroup >= 25 && qtGroup <= 49) {
            realMoney = budget * 0.60;
            if (realMoney >= (249.99 * qtGroup)) {
                diff = realMoney - (249.99 * qtGroup);
                System.out.printf("Yes! You have %.2f leva left.", diff);
            } else {
                diff = (249.99 * qtGroup) - realMoney;
                System.out.printf("Not enough money! You need %.2f leva.", diff);
            }
        }
        if (category.equals("Normal") && qtGroup >= 50) {
            realMoney = budget * 0.75;
            if (realMoney >= (249.99 * qtGroup)) {
                diff = realMoney - (249.99 * qtGroup);
                System.out.printf("Yes! You have %.2f leva left.", diff);
            } else {
                diff = (249.99 * qtGroup) - realMoney;
                System.out.printf("Not enough money! You need %.2f leva.", diff);
            }
        }
        if (category.equals("VIP") && qtGroup >= 1 && qtGroup <= 4) {
            realMoney = budget * 0.25;
            if (realMoney >= (499.99 * qtGroup)) {
                diff = realMoney - (499.99 * qtGroup);
                System.out.printf("Yes! You have %.2f leva left.", diff);
            } else {
                diff = (499.99 * qtGroup) - realMoney;
                System.out.printf("Not enough money! You need %.2f leva.", diff);
            }
        }
        if (category.equals("VIP") && qtGroup >= 5 && qtGroup <= 9) {
            realMoney = budget * 0.40;
            if (realMoney >= (499.99 * qtGroup)) {
                diff = realMoney - (499.99 * qtGroup);
                System.out.printf("Yes! You have %.2f leva left.", diff);
            } else {
                diff = (499.99 * qtGroup) - realMoney;
                System.out.printf("Not enough money! You need %.2f leva.", diff);
            }
        }
        if (category.equals("VIP") && qtGroup >= 10 && qtGroup <= 24) {
            realMoney = budget * 0.50;
            if (realMoney >= (499.99 * qtGroup)) {
                diff = realMoney - (499.99 * qtGroup);
                System.out.printf("Yes! You have %.2f leva left.", diff);
            } else {
                diff = (499.99 * qtGroup) - realMoney;
                System.out.printf("Not enough money! You need %.2f leva.", diff);
            }
        }
        if (category.equals("VIP") && qtGroup >= 25 && qtGroup <= 49) {
            realMoney = budget * 0.60;
            if (realMoney >= (499.99 * qtGroup)) {
                diff = realMoney - (499.99 * qtGroup);
                System.out.printf("Yes! You have %.2f leva left.", diff);
            } else {
                diff = (499.99 * qtGroup) - realMoney;
                System.out.printf("Not enough money! You need %.2f leva.", diff);
            }
        }
        if (category.equals("VIP") && qtGroup >= 50) {
            realMoney = budget * 0.75;
            if (realMoney >= (499.99 * qtGroup)) {
                diff = realMoney - (499.99 * qtGroup);
                System.out.printf("Yes! You have %.2f leva left.", diff);
            } else {
                diff = (499.99 * qtGroup) - realMoney;
                System.out.printf("Not enough money! You need %.2f leva.", diff);
            }
        }
    }
}
