import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        double flowersCount = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        double price = 0;

        if (flowers.equals("Roses")) {
            if (flowersCount <= 80) {
                price = flowersCount * 5;
                if (budget >= price) {
                    System.out.printf("Hey, you have a great garden with %.0f %s and %.2f leva left.", flowersCount, flowers, (budget - price));
                } else if (price > budget) {
                    System.out.printf("Not enough money, you need %.2f leva more.", (price - budget));
                }
            } else if (flowersCount > 80) {
                price = (flowersCount * 5) - (flowersCount * 5 * 0.10);
                if (budget > price) {
                    System.out.printf("Hey, you have a great garden with %.0f %s and %.2f leva left.", flowersCount, flowers, (budget - price));
                } else if (price > budget) {
                    System.out.printf("Not enough money, you need %.2f leva more.", (price - budget));
                }
            }
        } else if (flowers.equals("Dahlias")) {
            if (flowersCount <= 90) {
                price = flowersCount * 3.80;
                if (budget >= price) {
                    System.out.printf("Hey, you have a great garden with %.0f %s and %.2f leva left.", flowersCount, flowers, (budget - price));
                } else if (price > budget) {
                    System.out.printf("Not enough money, you need %.2f leva more.", (price - budget));
                }
            } else if (flowersCount > 90) {
                price = (flowersCount * 3.80) - (flowersCount * 3.80 * 0.15);
                if (budget >= price) {
                    System.out.printf("Hey, you have a great garden with %.0f %s and %.2f leva left.", flowersCount, flowers, (budget - price));
                } else if (price > budget) {
                    System.out.printf("Not enough money, you need %.2f leva more.", (price - budget));
                }
            }
        } else if (flowers.equals("Tulips")) {
            if (flowersCount <= 80) {
                price = flowersCount * 2.80;
                if (budget >= price) {
                    System.out.printf("Hey, you have a great garden with %.0f %s and %.2f leva left.", flowersCount, flowers, (budget - price));
                } else if (price > budget) {
                    System.out.printf("Not enough money, you need %.2f leva more.", (price - budget));
                }
            } else if (flowersCount >= 80) {
                price = (flowersCount * 2.80) - (flowersCount * 2.80 * 0.15);
                if (budget >= price) {
                    System.out.printf("Hey, you have a great garden with %.0f %s and %.2f leva left.", flowersCount, flowers, (budget - price));
                } else if (price > budget) {
                    System.out.printf("Not enough money, you need %.2f leva more.", (price - budget));
                }
            }
        } else if (flowers.equals("Narcissus")) {
            if (flowersCount <= 120) {
                price = (flowersCount * 3) + (flowersCount * 3 * 0.15);
                if (budget >= price) {
                    System.out.printf("Hey, you have a great garden with %.0f %s and %.2f leva left.", flowersCount, flowers, (budget - price));
                } else if (price > budget) {
                    System.out.printf("Not enough money, you need %.2f leva more.", (price - budget));
                }
            } else if (flowersCount > 120) {
                price = flowersCount * 3;
                if (budget >= price) {
                    System.out.printf("Hey, you have a great garden with %.0f %s and %.2f leva left.", flowersCount, flowers, (budget - price));
                } else if (price > budget) {
                    System.out.printf("Not enough money, you need %.2f leva more.", (price - budget));
                }
            }
        } else if (flowers.equals("Gladiolus")) {
            if (flowersCount <= 80) {
                price = (flowersCount * 2.50) + (flowersCount * 2.50 * 0.20);
                if (budget >= price) {
                    System.out.printf("Hey, you have a great garden with %.0f %s and %.2f leva left.", flowersCount, flowers, (budget - price));
                } else if (price > budget) {
                    System.out.printf("Not enough money, you need %.2f leva more.", (price - budget));
                }
            } else if (flowersCount > 80) {
                price = flowersCount * 2.50;
                if (budget >= price) {
                    System.out.printf("Hey, you have a great garden with %.0f %s and %.2f leva left.", flowersCount, flowers, (budget - price));
                } else if (price > budget) {
                    System.out.printf("Not enough money, you need %.2f leva more.", (price - budget));
                }
            }
        }
    }
}