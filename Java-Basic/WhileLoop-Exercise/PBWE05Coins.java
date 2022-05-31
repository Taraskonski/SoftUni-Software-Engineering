import java.util.Scanner;

public class PBWE05Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double money = Double.parseDouble(sc.nextLine());
        double cents = money * 100;

        int counter = 0;
        while (cents > 0) {
            if (cents >= 200) {
                cents = cents - 200;
                counter++;
            } else if (cents >= 100) {
                cents = cents - 100;
                counter++;
            } else if (cents >= 50) {
                cents = cents - 50;
                counter++;
            } else  if (cents >= 20) {
                cents = cents - 20;
                counter++;
            } else if (cents >= 10) {
                cents = cents - 10;
                counter++;
            } else if (cents >= 5) {
                cents = cents - 5;
                counter++;
            } else if (cents >= 2) {
                cents = cents - 2;
                counter++;
            } else if (cents >= 1) {
                cents = cents - 1;
                counter++;
            } else {
                break;
            }
        }
        System.out.println(counter);
    }
}