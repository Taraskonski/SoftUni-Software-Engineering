import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depSum = Double.parseDouble(scanner.nextLine());
        double depPeriod = Double.parseDouble(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine());
        double percentIntRate = interestRate / 100;
        double totalSum = depSum + depPeriod * ((depSum * percentIntRate) / 12);
        System.out.println(totalSum);
    }
}
