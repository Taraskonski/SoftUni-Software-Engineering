package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        int students = Integer.parseInt(sc.nextLine());
        double saberPrice = Double.parseDouble(sc.nextLine());
        double robePrice = Double.parseDouble(sc.nextLine());
        double beltPrice = Double.parseDouble(sc.nextLine());

        int freeBelts = students / 6;

        double totalSabersPrice = Math.ceil(students * 1.10) * saberPrice;
        double totalRobesPrice = robePrice * students;
        double totalBeltsPrice = ((students * beltPrice) - (freeBelts * beltPrice));

        double totalPrice = totalBeltsPrice + totalRobesPrice + totalSabersPrice;
        double diff = Math.abs(totalPrice - budget);

        if (budget >= totalPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", diff);
        }
    }
}