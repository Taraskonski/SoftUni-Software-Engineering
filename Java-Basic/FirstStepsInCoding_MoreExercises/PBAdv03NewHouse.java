import java.util.Scanner;

public class PBAdv03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowers = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        double sum = 0;
        double diff = 0;

        if (flowers.equals("Roses") && count <= 80) {
            sum = count * 5.00;
            if (budget >= sum) {
                diff = budget - sum;
                System.out.printf("Hey, you have a great garden with %.0f %s and %.2f leva left.", count, flowers, diff);
            }
            if (budget < sum) {
                diff = sum - budget;
                System.out.printf("Not enough money, you need %.2f leva more.", diff);
            }
        } else if (flowers.equals("Roses") && count > 80) {
            sum = (count * 5.00) * 0.90;
            if (budget >= sum) {
                diff = budget - sum;
                System.out.printf("Hey, you have a great garden with %.0f %s and %.2f leva left.", count, flowers, diff);
            }
            if (budget < sum) {
                diff = sum - budget;
                System.out.printf("Not enough money, you need %.2f leva more.", diff);
            }
        } else if (flowers.equals("Dahlias") && count <= 90) {
            sum = count * 3.80;
            if (budget >= sum) {
                diff = budget - sum;
                System.out.printf("Hey, you have a great garden with %.0f %s and %.2f leva left.", count, flowers, diff);
            }
            if (budget < sum) {
                diff = sum - budget;
                System.out.printf("Not enough money, you need %.2f leva more.", diff);
            }
        } else if (flowers.equals("Dahlias") && count > 90) {
            sum = (count * 3.80) * 0.85;
            if (budget >= sum) {
                diff = budget - sum;
                System.out.printf("Hey, you have a great garden with %.0f %s and %.2f leva left.", count, flowers, diff);
            }
            if (budget < sum) {
                diff = sum - budget;
                System.out.printf("Not enough money, you need %.2f leva more.", diff);
            }
        } else if (flowers.equals("Tulips") && count <= 80) {
            sum = count * 2.80;
            if (budget >= sum) {
                diff = budget - sum;
                System.out.printf("Hey, you have a great garden with %.0f %s and %.2f leva left.", count, flowers, diff);
            }
            if (budget < sum) {
                diff = sum - budget;
                System.out.printf("Not enough money, you need %.2f leva more.", diff);
            }
        } else if (flowers.equals("Tulips") && count > 80) {
            sum = (count * 2.80) * 0.85;
            if (budget >= sum) {
                diff = budget - sum;
                System.out.printf("Hey, you have a great garden with %.0f %s and %.2f leva left.", count, flowers, diff);
            }
            if (budget < sum) {
                diff = sum - budget;
                System.out.printf("Not enough money, you need %.2f leva more.", diff);
            }
        } else if (flowers.equals("Narcissus") && count < 120) {
            sum = (count * 3) + ((count * 3) * 0.15);
            if (budget >= sum) {
                diff = budget - sum;
                System.out.printf("Hey, you have a great garden with %.0f %s and %.2f leva left.", count, flowers, diff);
            }
            if (budget < sum) {
                diff = sum - budget;
                System.out.printf("Not enough money, you need %.2f leva more.", diff);
            }
        } else if (flowers.equals("Narcissus") && count >= 120) {
            sum = count * 3;
            if (budget >= sum) {
                diff = budget - sum;
                System.out.printf("Hey, you have a great garden with %.0f %s and %.2f leva left.", count, flowers, diff);
            }
            if (budget < sum) {
                diff = sum - budget;
                System.out.printf("Not enough money, you need %.2f leva more.", diff);
            }
        } else if (flowers.equals("Gladiolus") && count < 80) {
            sum = (count * 2.50) + ((count * 2.50) * 0.20);
            if (budget >= sum) {
                diff = budget - sum;
                System.out.printf("Hey, you have a great garden with %.0f %s and %.2f leva left.", count, flowers, diff);
            }
            if (budget < sum) {
                diff = sum - budget;
                System.out.printf("Not enough money, you need %.2f leva more.", diff);
            }
        } else if (flowers.equals("Gladiolus") && count >= 80) {
            sum = count * 2.50;
            if (budget >= sum) {
                diff = budget - sum;
                System.out.printf("Hey, you have a great garden with %.0f %s and %.2f leva left.", count, flowers, diff);
            }
            if (budget < sum) {
                diff = sum - budget;
                System.out.printf("Not enough money, you need %.2f leva more.", diff);
            }
        }
    }
}
