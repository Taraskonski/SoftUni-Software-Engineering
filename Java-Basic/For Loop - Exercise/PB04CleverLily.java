import java.util.Scanner;

public class PB04CleverLily {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = Integer.parseInt(sc.nextLine());
        double washMachinePrice = Double.parseDouble(sc.nextLine());
        int toyPrice = Integer.parseInt(sc.nextLine());

        int toysCount = 0;
        int savedMoney = 0;
        int money = 10;
        for (int i = 1; i <= age ; i++) {
            if (i % 2 != 0) {
                toysCount += 1;
            } else {
                savedMoney = savedMoney + ( money - 1);
                money += 10;

            }
        }
        savedMoney = savedMoney + (toysCount * toyPrice);

        if (savedMoney >= washMachinePrice) {
            System.out.printf("Yes! %.2f", savedMoney - washMachinePrice);
        } else {
            System.out.printf("No! %.2f", washMachinePrice - savedMoney);
        }
    }
}
