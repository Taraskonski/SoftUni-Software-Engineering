import java.util.Scanner;

public class DepositCalculator_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double depos = Double.parseDouble(sc.nextLine());
        int period = Integer.parseInt(sc.nextLine());
        double percent = Double.parseDouble(sc.nextLine());

        double dividend = depos * (percent / 100);
        double dividendMonth = dividend / 12;
        double total = depos + (dividendMonth * period);

        System.out.println(total);
    }
}
