package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lostGamesCnt = Integer.parseInt(sc.nextLine());
        double headsetPrice = Double.parseDouble(sc.nextLine());
        double mousePrice = Double.parseDouble(sc.nextLine());
        double keyboardPrice = Double.parseDouble(sc.nextLine());
        double displayPrice = Double.parseDouble(sc.nextLine());

        int count = 0;
        int keyboardTrashCount = 0;
        double totalHeadsetPrice = 0;
        double totalMousePrice = 0;
        double totalKeyboardPrice = 0;
        double totalDisplayPrice = 0;

        for (int i = 1; i <= lostGamesCnt; i++) {
            count++;
            if (i % 2 == 0) {
                totalHeadsetPrice += headsetPrice;
            }
            if (i % 3 == 0) {
                totalMousePrice += mousePrice;
            }
            if (count % 2 == 0 && count % 3 == 0) {
                keyboardTrashCount++;
                totalKeyboardPrice += keyboardPrice;
                if (keyboardTrashCount % 2 == 0) {
                    totalDisplayPrice += displayPrice;
                }
            }
        }
        double totalSum = totalHeadsetPrice + totalMousePrice + totalKeyboardPrice + totalDisplayPrice;
        System.out.printf("Rage expenses: %.2f lv.", totalSum);
    }
}