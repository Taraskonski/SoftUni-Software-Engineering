import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceOfWashMachine = Double.parseDouble(scanner.nextLine());
        int presentPrice = Integer.parseInt(scanner.nextLine());

        int numberOfToys = 0;
        int savedMoney = 0;
        int moneyForBirthday = 10;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                savedMoney += (moneyForBirthday - 1);
                moneyForBirthday += 10;
            } else {
                numberOfToys++;
            }
        }
        savedMoney += numberOfToys * presentPrice;
        System.out.println((savedMoney >= priceOfWashMachine ? String.format("Yes! %.2f", (savedMoney - priceOfWashMachine)) : String.format("No! %.2f", (priceOfWashMachine - savedMoney))));
    }
}
