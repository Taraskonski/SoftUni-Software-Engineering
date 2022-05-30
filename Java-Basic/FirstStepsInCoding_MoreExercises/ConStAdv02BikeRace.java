import java.util.Scanner;

public class ConStAdv02BikeRace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double juniorBikers = Double.parseDouble(sc.nextLine());
        double seniorBakers = Double.parseDouble(sc.nextLine());
        String way = sc.nextLine();
        double tax = 0;
        double qtBikers = juniorBikers + seniorBakers;

        if (way.equals("trail")) {
            tax = ((juniorBikers * 5.50) + (seniorBakers * 7)) * 0.95;
        }
        if (way.equals("downhill")) {
            tax = ((juniorBikers * 12.25) + (seniorBakers * 13.75)) * 0.95;
        }
        if (way.equals("road")) {
            tax = ((juniorBikers * 20) + (seniorBakers * 21.50)) * 0.95;
        }
        if (way.equals("cross-country") && qtBikers >= 50) {
            tax = (((juniorBikers * 8) + (seniorBakers * 9.50)) * 0.95) * 0.75;
        }
        if (way.equals("cross-country") && qtBikers < 50){
            tax = ((juniorBikers * 8) + (seniorBakers * 9.50)) * 0.95;
        }
        System.out.printf("%.2f", tax);
    }
}
