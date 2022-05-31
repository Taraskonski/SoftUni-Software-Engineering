import java.util.Scanner;

public class PBWE03Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(sc.nextLine());
        double availableMoney = Double.parseDouble(sc.nextLine());

        double totalSum = availableMoney;

        int spendDaysCounter = 0;
        int totalDays = 0;
        boolean flag = false;
        while (totalSum < moneyNeeded) {

            if (spendDaysCounter >= 5) {
                flag = true;
                break;
            }
            String actions = sc.nextLine();
            double amount = Double.parseDouble(sc.nextLine());
            totalDays++;

            if (actions.equals("spend")) {
                spendDaysCounter++;
                totalSum = totalSum - amount;
            }
            if (totalSum <= 0) {
                totalSum = 0;
            }
            if (actions.equals("save")) {
                totalSum = totalSum + amount;
                spendDaysCounter = 0;
            }
        } if (flag) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", totalDays);
        } else {
            System.out.printf("You saved the money for %d days.", totalDays);
        }
    }
}
